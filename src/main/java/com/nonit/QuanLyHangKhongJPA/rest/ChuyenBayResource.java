package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.ChuyenBay;
import com.nonit.QuanLyHangKhongJPA.service.ChuyenBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI {
    private final ChuyenBayService chuyenBayService;

    @Override
    public ResponseEntity<List<ChuyenBay>> getAllChuyenBay() {
        return ResponseEntity.ok(chuyenBayService.getAllChuyenBay());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByGaDi(String gaDi) {
        return ResponseEntity.ok(chuyenBayService.getByGaDi(gaDi));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByGaDiContain(String s) {
        return ResponseEntity.ok(chuyenBayService.getByGaDiContain("%" + s + "%"));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByDoDaiGreaterThan(Integer i) {
        return ResponseEntity.ok(chuyenBayService.getByDoDaiGreaterThan(i));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByGaDiAndGaDen(String gaDi, String gaDen) {
        return ResponseEntity.ok(chuyenBayService.getByGaDiAndGaDen(gaDi, gaDen));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByAirbusA320() {
        return ResponseEntity.ok(chuyenBayService.getByAirbusA320());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByLoaiMayBay(String loai) {
        return ResponseEntity.ok(chuyenBayService.getByLoaiMayBay(loai));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByBoeing() {
        return ResponseEntity.ok(chuyenBayService.getByBoeing());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByDoDaiLessThan10000AndGreaterThan8000() {
        return ResponseEntity.ok(chuyenBayService.getByDoDaiLessThan10000AndGreaterThan8000());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByDoDaiLessThan(Integer doDai) {
        return ResponseEntity.ok(chuyenBayService.getByDoDaiLessThan(doDai));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByDoDaiIs(Integer doDai) {
        return ResponseEntity.ok(chuyenBayService.getByDoDaiIs(doDai));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByDoDaiBetween(Integer doDai1, Integer doDai2) {
        return ResponseEntity.ok(chuyenBayService.getByDoDaiBetween(doDai1, doDai2));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByLoaiGaDiSGNAndGaDenBMV() {
        return ResponseEntity.ok(chuyenBayService.getByLoaiGaDiSGNAndGaDenBMV());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByGioDiBeforeASpecificTime(LocalTime time) {
        return ResponseEntity.ok(chuyenBayService.getByGioDiSoonerThanASpecificTime(time));
    }

    @Override
    public ResponseEntity<Integer> getCountChuyenBayByGadi(String gaDi) {
        return ResponseEntity.ok(chuyenBayService.getCountChuyenBayByGadi(gaDi));
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> getByGioDiBefore12() {
        return ResponseEntity.ok(chuyenBayService.getByGioDiBefore12());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> timChuyenBayXuatPhatTu(String gaDi) {
        return ResponseEntity.ok(chuyenBayService.timChuyenBayXuatPhatTu(gaDi));
    }
}
