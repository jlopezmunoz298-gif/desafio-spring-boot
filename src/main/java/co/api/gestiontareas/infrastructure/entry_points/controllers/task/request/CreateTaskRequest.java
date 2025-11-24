package co.api.gestiontareas.infrastructure.entry_points.controllers.task.request;

import jakarta.validation.constraints.NotBlank;

public record CreateTaskRequest(
        @NotBlank(message = "Es necesario que la tarea tenga un titulo")
        String title,
        @NotBlank(message = "Es necesario que la tarea tenga la descripcion")
        String description
) {
}
