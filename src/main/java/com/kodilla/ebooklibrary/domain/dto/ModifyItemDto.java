package com.kodilla.ebooklibrary.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ModifyItemDto {
  private long userId;
  private long id;
  private LocalDate purchaseDate;
}
