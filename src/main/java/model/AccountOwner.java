package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOwner {

    @ApiModelProperty(value = "Идентификатор клиента", example = "AKG2F1", required = true)
    @Size(max = 6)
    @NotEmpty
    private String clientId;

    @ApiModelProperty(value = "Фамилия", example = "Иванов", required = true)
    @Size(max = 35)
    @NotEmpty
    @Pattern(regexp = "\\ *[А-ЯЁа-яё]+((\\ )?((\\-)(\\ )?)?[А-ЯЁа-яё])*\\ *")
    private String lastName;

    @ApiModelProperty(value = "Имя", example = "Иван", required = true)
    @Size(max = 35)
    @NotEmpty
    @Pattern(regexp = "\\ *[А-ЯЁа-яё]+((\\ )?((\\-)(\\ )?)?[А-ЯЁа-яё])*\\ *")
    private String firstName;

    @ApiModelProperty(value = "Отчество", example = "Иванович", required = true)
    @Size(max = 35)
    @NotEmpty
    @Pattern(regexp = "(\\ *[А-ЯЁа-яё]+((\\ )?((\\-)(\\ )?)?[А-ЯЁа-яё])*\\ *)|-")
    private String middleName;

    @ApiModelProperty(value = "Пол", example = "m", required = true)
    @NotEmpty
    private Sex sex;

    @ApiModelProperty(value = "Дата рождения", example = "1993-04-16", required = true)
    @JsonFormat(pattern = "YYYY-MM-DD")
    @NotEmpty
    private LocalDateTime birthDate;

    @ApiModelProperty(value = "Номер телефона", example = "9652609898", required = true)
    @Pattern(regexp = "//d{10}")
    private int mobilePhone;

    @ApiModelProperty(value = "Документ", required = true)
    @NotEmpty
    private Document document;
}
