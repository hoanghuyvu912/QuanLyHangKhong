package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import com.nonit.QuanLyHangKhongJPA.service.NhanVienService;
import com.nonit.QuanLyHangKhongJPA.service.dto.NhanVienByNumOfPlanesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NhanVienResource implements NhanVienAPI {
    private final NhanVienService nhanVienService;

    @Override
    public ResponseEntity<List<NhanVien>> getAllNV() {
        return ResponseEntity.ok(nhanVienService.getAllNV());
    }

    @Override
    public ResponseEntity<NhanVien> getByTen(String ten) {
        return ResponseEntity.ok(nhanVienService.getByTen(ten));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByTenContain(String s) {
        return ResponseEntity.ok(nhanVienService.getByTenContain(s));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByTenStartWith(String s) {
        return ResponseEntity.ok(nhanVienService.getByTenStartWith(s));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByTenEndWith(String s) {
        return ResponseEntity.ok(nhanVienService.getByTenEndWith(s));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByTenNotLike(String s) {
        return ResponseEntity.ok(nhanVienService.getByTenNotLike(s));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByLuongBetween(Integer i1, Integer i2) {
        return ResponseEntity.ok(nhanVienService.getByLuongBetween(i1, i2));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByLuongLessThan(Integer integer) {
        return ResponseEntity.ok(nhanVienService.getByLuongLessThan(integer));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByLuongIs(Integer i) {
        return ResponseEntity.ok(nhanVienService.getByLuongIs(i));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByLuongGreaterThan(Integer i) {
        return ResponseEntity.ok(nhanVienService.getByLuongGreaterThan(i));
    }

    @Override
    public ResponseEntity<List<NhanVien>> getByMaMB(Integer maMB) {
        return ResponseEntity.ok(nhanVienService.getByMaMB(maMB));
    }

    @Override
    public ResponseEntity<List<NhanVienByNumOfPlanesDTO>> getByNumberOfPlanes(Integer number) {
        return ResponseEntity.ok(nhanVienService.getByNumberOfPlanes(number));
    }
}
