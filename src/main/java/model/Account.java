package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @ApiModelProperty(value = "Идентификатор счета", example = "AAZ011Q")
    private String id;

    @ApiModelProperty(value = "Тип счета", example = "DEBIT")
    private AccountType accountType;

    @ApiModelProperty(value = "Дата создания счета", example = "2018-01-01 12:01:13")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "Дата закрытия счета", example = "2018-01-01 12:01:13")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime closedTime;

    @ApiModelProperty(value = "Статус счета", example = "ACTIVE")
    private Status status;

    @ApiModelProperty(value = "Владелец счета")
    private AccountOwner owner;

    @ApiModelProperty(value = "Баланс счета", example = "100400")
    private double balance;
}
