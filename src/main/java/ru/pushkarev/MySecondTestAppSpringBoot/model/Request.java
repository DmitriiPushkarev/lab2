package ru.pushkarev.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    /***
     * Уникальный идентификатор сообщения
     */
    @NotBlank
    @Max(32)
    private String uid;

    /***
     * Уникальный идентификатор операции
     */
    @NotBlank(message = "UID не может быть пустым")
    @Max(32)
    private String operationUid;

    /***
     * Имя системы
     * отправителя
     */
    private Systems systemName;

    /***
     * Время
     * создания
     * сообщения
     */
    private String systemTime;

    /***
     * Наименование
     * ресурса
     */
    private String source;

    /***
     * Роль в команде
     */
    private Positions position;
    /***
     * Зарплата
     */
    private Double salary;
    /***
     * Бонус
     */
    private Double bonus;
    /***
     * Дней отработано
     */
    private Integer workDays;

    /***
     * Уникальный
     * идентификатор
     * коммуникации
     */
    @Min(1)
    @Max(100000)
    private int communicationId;

    /***
     * Уникальный
     * идентификатор
     * шаблона
     */
    private int templateId;
    /***
     * Код продукта
     */
    private int productionCode;
    /***
     * Смс код
     */
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productionCode=" + productionCode +
                ", smsCode=" + smsCode +
                '}';
    }
}
