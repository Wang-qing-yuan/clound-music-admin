package com.soft1851.music.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wqy
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String name;
    private String password;
    private String verifyCode;
}