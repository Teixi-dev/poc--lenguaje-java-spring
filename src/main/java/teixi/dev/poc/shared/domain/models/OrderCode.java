package teixi.dev.poc.shared.domain.models;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class OrderCode {
    private UUID value;
}
