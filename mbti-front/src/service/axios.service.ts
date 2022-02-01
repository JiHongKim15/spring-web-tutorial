import axios, { AxiosInstance } from 'axios';

export default class AxiosServiceJiHong {

    static readonly Instance: AxiosInstance = axios.create({
        //baseURL: 'http://localhost:8081',
        timeout: 10000,
    });
}
