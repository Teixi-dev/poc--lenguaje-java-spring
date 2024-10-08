package teixi.dev.poc.shared.domain.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Query {
    private QueryCode code;
    private String value;
}
