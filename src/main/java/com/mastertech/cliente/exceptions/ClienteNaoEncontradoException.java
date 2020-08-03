package com.mastertech.cliente.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "O cartão informado não existe ou não é valido")
public class ClienteNaoEncontradoException extends RuntimeException {
}
