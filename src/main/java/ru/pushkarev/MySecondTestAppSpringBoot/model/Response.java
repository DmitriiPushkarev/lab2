package ru.pushkarev.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    /***
     * Уникальный идентификатор сообщения
     */
    private String uid;
    /***
     * Уникальный идентификатор операции
     */
    private String operationUid;
    /***
     * Время
     * создания
     * сообщения
     */
    private String systemTime;
    /***
     * SUCCESS or FAILED
     */
    private Codes code;
    /***
     * Ежегодный бонус
     */
    private Double annualBonus;
    /***
     * Код ошибки
     */
    private ErrorCodes errorCode;
    /***
     * Сообщение об ошибке
     */
    private ErrorMessages errorMessage;
}
