package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    @ApiModelProperty(value = "Серия", example = "4526", required = true)
    @NotEmpty
    @Pattern(regexp = "\\d{4}")
    private String series;

    @ApiModelProperty(value = "Номер", example = "969898", required = true)
    @NotEmpty
    @Pattern(regexp = "\\d{6}")
    private String number;

    @ApiModelProperty(value = "Дата выдачи", example = "2000-01-26", required = true)
    @NotEmpty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String issueDate;

    @ApiModelProperty(value = "Место выдачи", example = "ОВД Петрово", required = true)
    @NotEmpty
    @Pattern(regexp = "[^\\?\\*\\:a-zA-Z]{1,70}")
    private String issueOffice;

    @ApiModelProperty(value = "Код подразделения", example = "770-006", required = true)
    @NotEmpty
    @Pattern(regexp = "\\d{2}-\\d{2}")
    private String issueOfficeCode;
}
