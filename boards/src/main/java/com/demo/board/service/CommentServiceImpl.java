package com.demo.board.service;

import com.demo.board.model.Board;
import com.demo.board.model.Comment;
import com.demo.board.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public boolean createComment(Comment comment) throws Exception {
        commentRepository.save(comment);
        return true;
    }

    @Override
    public List<Comment> listComment(Long bid) throws Exception {
        List<Comment> comments = commentRepository.findAllByBoard_Bid(bid);
        return comments;
    }

    @Override
    public boolean updateComment(Comment comment) throws Exception {
        Optional<Comment> newComment = commentRepository.findById(comment.getCid());
        newComment.get().setContent(comment.getContent());
        commentRepository.save(newComment.get());
        return true;
    }

    @Transactional
    @Override
    public boolean deleteComment(Long cid) throws Exception {
        if(commentRepository.findById(cid).isPresent()) {
            commentRepository.deleteById(cid);
            return true;
        }
        return false;
    }
}
