package com.demo.board.service;

import com.demo.board.model.Board;
import com.demo.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public boolean createBoard(Board board) throws Exception {
        //System.out.println("bid" + board.getBid());
        //System.out.println("title" + board.getTitle());
        boardRepository.save(board);
        return true;
    }

    @Override
    public Optional<Board> readBoard(Long bid) throws Exception {
        Optional<Board> board = boardRepository.findById(bid);
        return board;
    }

    @Override
    public List<Board> listBoard() throws Exception 
        List<Board> boards = boardRepository.findAll();
        return boards;
    }

    @Override
    public boolean updateBoard(Board board) throws Exception {
        System.out.println(board.getBid());
        Optional<Board> newBoard = boardRepository.findById(board.getBid());
        newBoard.get().setTitle(board.getTitle());
        newBoard.get().setContent(board.getContent());
        boardRepository.save(newBoard.get());
        return true;
    }

    @Transactional
    @Override
    public boolean deleteBoard(Long bid) throws Exception {
        if(boardRepository.findById(bid).isPresent()) {
            boardRepository.deleteById(bid);
            return true;
        }
        return false;
    }
}
