/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaidan.pengembalian.service.VO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP ELITE BOOK G2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long peminjamanId;
    private Long anggotaId;
    private Long bukuId;
    private String tglpinjam;
    private String tglkembali;

}