package teixi.dev.poc.order.application.models;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class OrderAdvanceStatusCommand {
    private UUID orderCode;
}
