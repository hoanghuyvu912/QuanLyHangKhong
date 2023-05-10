package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.service.MayBayService;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayDTO;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayInterfaceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MayBayResource implements MayBayAPI {
    private final MayBayService mayBayService;

    @Override
    public ResponseEntity<List<MayBay>> getAllMayBay() {
        return ResponseEntity.ok(mayBayService.getAllMayBay());
    }


    @Override
    public ResponseEntity<MayBay> getByLoai(String loai) {
        return ResponseEntity.ok(mayBayService.getByLoai(loai));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByLoaiContain(String s) {
        return ResponseEntity.ok(mayBayService.getByLoaiContain(s));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByLoaiStartWith(String s) {
        return ResponseEntity.ok(mayBayService.getByLoaiStartWith(s));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByLoaiEndWith(String s) {
        return ResponseEntity.ok(mayBayService.getByLoaiEndWith(s));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByLoaiNotLike(String s) {
        return ResponseEntity.ok(mayBayService.getByLoaiNotLike(s));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByTamBayBetween(Integer i1, Integer i2) {
        return ResponseEntity.ok(mayBayService.getByTamBayBetween(i1, i2));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByTamBayLessThan(Integer i) {
        return ResponseEntity.ok(mayBayService.getByTamBayLessThan(i));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByTamBayIs(Integer i) {
        return ResponseEntity.ok(mayBayService.getByTamBayIs(i));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByTamBayGreaterThan(Integer i) {
        return ResponseEntity.ok(mayBayService.getByTamBayGreaterThan(i));
    }

    @Override
    public ResponseEntity<List<MayBay>> getByMaNV(String maNV) {
        return ResponseEntity.ok(mayBayService.getByMaNV(maNV));
    }

    @Override
    public ResponseEntity<List<CustomMayBayInterfaceDTO>> getMaMBAndTamBayByLoaiLike(String loai) {
        return ResponseEntity.ok(mayBayService.getMaMBAndTamBayByLoaiLike(loai));
    }

    @Override
    public ResponseEntity<List<CustomMayBayDTO>> getMaMBAndLoaiMBByLoaiLike(String loai) {
        return ResponseEntity.ok(mayBayService.getMaMBAndLoaiMBByLoaiLike(loai));
    }
}
