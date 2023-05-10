package com.nonit.QuanLyHangKhongJPA.service;

import com.nonit.QuanLyHangKhongJPA.entity.ChuyenBay;
import com.nonit.QuanLyHangKhongJPA.repository.ChuyenBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChuyenBayService {
    private final ChuyenBayRepository chuyenBayRepository;

    public List<ChuyenBay> getByGaDi(String gaDi) {
        return chuyenBayRepository.getByGaDi(gaDi);
    }

    public List<ChuyenBay> getByGaDiContain(String s) {
        return chuyenBayRepository.getByGaDiContain(s);
    }

    public List<ChuyenBay> getByDoDaiGreaterThan(Integer i) {
        return chuyenBayRepository.getByDoDaiGreaterThan(i);
    }

    public List<ChuyenBay> getByGaDiAndGaDen(String gaDi, String gaDen) {
        return chuyenBayRepository.getByGaDiAndGaDen(gaDi, gaDen);
    }

    public List<ChuyenBay> getByLoaiMayBay(String loai) {
        return chuyenBayRepository.getByLoaiMayBay(loai);
    }

    public List<ChuyenBay> getByBoeing() {
        return chuyenBayRepository.getByBoeing();
    }

    public List<ChuyenBay> getAllChuyenBay() {
        return chuyenBayRepository.findAll();
    }

    public List<ChuyenBay> getByAirbusA320() {
        return chuyenBayRepository.getByAirbusA320();
    }

    public List<ChuyenBay> getByDoDaiLessThan10000AndGreaterThan8000() {
        return chuyenBayRepository.getByDoDaiLessThan10000AndGreaterThan8000();
    }

    public List<ChuyenBay> getByDoDaiLessThan(Integer doDai) {
        return chuyenBayRepository.getByDoDaiLessThan(doDai);
    }

    public List<ChuyenBay> getByDoDaiIs(Integer doDai) {
        return chuyenBayRepository.getByDoDaiIs(doDai);
    }

    public List<ChuyenBay> getByDoDaiBetween(Integer doDai1, Integer doDai2) {
        return chuyenBayRepository.getByDoDaiBetween(doDai1, doDai2);
    }

    public List<ChuyenBay> getByLoaiGaDiSGNAndGaDenBMV() {
        return chuyenBayRepository.getByLoaiGaDiSGNAndGaDenBMV();
    }

    public List<ChuyenBay> getByGioDiSoonerThanASpecificTime(LocalTime time) {
        return chuyenBayRepository.getByGioDiSoonerThanASpecificTime(time);
    }

    public List<ChuyenBay> getByGioDiBefore12() {
        return chuyenBayRepository.getByGioDiBefore12();
    }

    public Integer getCountChuyenBayByGadi(String gaDi) {
        return chuyenBayRepository.getCountChuyenBayByGadi(gaDi);
    }

    public List<ChuyenBay> timChuyenBayXuatPhatTu(String gaDi) {
        return chuyenBayRepository.timChuyenBayXuatPhatTu(gaDi);
    }
}
