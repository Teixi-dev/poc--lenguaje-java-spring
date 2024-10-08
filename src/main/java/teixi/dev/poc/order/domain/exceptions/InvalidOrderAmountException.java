package teixi.dev.poc.order.domain.exceptions;

import org.springframework.http.HttpStatus;
import teixi.dev.poc.shared.domain.exceptions.RuntimeDomainViolation;

public class InvalidOrderAmountException extends RuntimeDomainViolation {
    private static final HttpStatus HTTP_STATUS = HttpStatus.CONFLICT;
    private static final String DESCRIPTION = "Can't order a product with less or equals amount then zero.";

    public InvalidOrderAmountException() {
        super(HTTP_STATUS, DESCRIPTION);
    }
}