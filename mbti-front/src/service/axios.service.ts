import axios, { AxiosInstance } from 'axios';

export default class AxiosServiceJiHong {

    static readonly Instance: AxiosInstance = axios.create({
        timeout: 10000,
    });
}
