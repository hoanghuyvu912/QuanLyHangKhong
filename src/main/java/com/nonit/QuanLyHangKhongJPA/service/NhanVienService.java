package com.nonit.QuanLyHangKhongJPA.service;

import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import com.nonit.QuanLyHangKhongJPA.repository.NhanVienRepository;
import com.nonit.QuanLyHangKhongJPA.service.dto.NhanVienByNumOfPlanesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NhanVienService {
    private final NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNV() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getByTen(String ten) {
        return nhanVienRepository.getByTen(ten);
    }

    public List<NhanVien> getByTenContain(String s) {
        return nhanVienRepository.getByTenContain("%" + s + "%");
    }

    public List<NhanVien> getByTenStartWith(String s) {
        return nhanVienRepository.getByTenStartWith(s);
    }

    public List<NhanVien> getByTenEndWith(String s) {
        return nhanVienRepository.getByTenEndWith(s);
    }

    public List<NhanVien> getByTenNotLike(String s) {
        return nhanVienRepository.getByTenNotLike(s);
    }

    public List<NhanVien> getByMaMB(Integer maMB) {
        return nhanVienRepository.getByMaMB(maMB);
    }

    public List<NhanVien> getByLuongBetween(Integer i1, Integer i2) {
        return nhanVienRepository.getByLuongBetween(i1, i2);
    }

    public List<NhanVien> getByLuongLessThan(Integer i) {
        return nhanVienRepository.getByLuongLessThan(i);
    }

    public List<NhanVien> getByLuongIs(Integer i) {
        return nhanVienRepository.getByLuongIs(i);
    }

    public List<NhanVien> getByLuongGreaterThan(Integer i) {
        return nhanVienRepository.getByLuongGreaterThan(i);
    }

    public List<NhanVienByNumOfPlanesDTO> getByNumberOfPlanes(Integer number) {
        return nhanVienRepository.getByNumberOfPlanes(number);
    }
}
