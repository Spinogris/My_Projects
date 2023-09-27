package org.example._23_09_27;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor

public class Developer {

  private int developerId;                             // Уникальный идентификатор разработчика.
  private String developerName;                        // Имя разработчика.
  private String developerEmail;                       // Электронная почта разработчика.
  private String developerTeam;                        // Название команды, к которой принадлежит разработчик.
  private List<Task> developerTasks;                   // Список задач, назначенных разработчику.
  private Map<String, Integer> developerTaskCount;     // Количество задач по статусам.

}
