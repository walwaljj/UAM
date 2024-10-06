package uriel.uam.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    // passenger
    PASSENGER_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "승객 정보를 찾을 수 없습니다."),
    PASSENGER_ALREADY_REGISTERED(HttpStatus.CONFLICT, "이미 등록된 승객입니다."),

    // flight
    FLIGHT_NOT_FOUND(HttpStatus.NOT_FOUND, "조건에 맞는 항공편을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String msg;

    ErrorCode(HttpStatus status, String msg) {
        this.status = status;
        this.msg = msg;
    }

}