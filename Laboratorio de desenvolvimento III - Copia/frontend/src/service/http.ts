import axios from 'axios';

const http = axios.create({
  baseURL: 'http://localhost:8080', // Substitua pela URL correta da sua API Spring Boot
});

export default http;
