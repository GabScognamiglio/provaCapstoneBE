package it.epicode.gs_budgets.dto;

import it.epicode.gs_budgets.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TicketDto {
    @NotBlank
    @Size(max = 30)
    private String object;
    @NotBlank
    private String description;
    @NotNull
    private int userId;
}
