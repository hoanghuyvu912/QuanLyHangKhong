package com.nonit.QuanLyHangKhongJPA.service;

import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import com.nonit.QuanLyHangKhongJPA.repository.MayBayRepository;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayDTO;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayInterfaceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MayBayService {
    private final MayBayRepository mayBayRepository;

    public List<MayBay> getAllMayBay() {
        return mayBayRepository.findAll();
    }

    public MayBay getByLoai(String loai) {
        return mayBayRepository.getByLoai(loai);
    }

    public List<MayBay> getByLoaiContain(String s) {
        return mayBayRepository.getByLoaiContain("%" + s + "%");
    }

    public List<MayBay> getByLoaiStartWith(String s) {
        return mayBayRepository.getByLoaiStartWith(s);
    }

    public List<MayBay> getByLoaiEndWith(String s) {
        return mayBayRepository.getByLoaiEndWith(s);
    }

    public List<MayBay> getByLoaiNotLike(String s) {
        return mayBayRepository.getByLoaiNotLike(s);
    }

    public List<MayBay> getByMaNV(String maNV) {
        return mayBayRepository.getByMaNV(maNV);
    }


    public List<MayBay> getByTamBayBetween(Integer i1, Integer i2) {
        return mayBayRepository.getByTamBayBetween(i1, i2);
    }

    public List<MayBay> getByTamBayLessThan(Integer i) {
        return mayBayRepository.getByTamBayLessThan(i);
    }

    public List<MayBay> getByTamBayIs(Integer i) {
        return mayBayRepository.getByTamBayIs(i);
    }

    public List<MayBay> getByTamBayGreaterThan(Integer i) {
        return mayBayRepository.getByTamBayGreaterThan(i);
    }

    public List<CustomMayBayInterfaceDTO> getMaMBAndTamBayByLoaiLike(String loai) {
        return mayBayRepository.getMaMBAndTamBayByLoaiLike(loai);
    }

    public List<CustomMayBayDTO> getMaMBAndLoaiMBByLoaiLike(String loai) {
        return mayBayRepository.getMaMBAndLoaiMBByLoaiLike(loai);
    }
}
