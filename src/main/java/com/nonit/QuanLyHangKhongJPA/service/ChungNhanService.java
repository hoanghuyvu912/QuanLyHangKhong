package com.nonit.QuanLyHangKhongJPA.service;

import com.nonit.QuanLyHangKhongJPA.entity.ChungNhan;
import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import com.nonit.QuanLyHangKhongJPA.repository.ChungNhanRepository;
import com.nonit.QuanLyHangKhongJPA.repository.ChuyenBayRepository;
import com.nonit.QuanLyHangKhongJPA.repository.MayBayRepository;
import com.nonit.QuanLyHangKhongJPA.repository.NhanVienRepository;
import com.nonit.QuanLyHangKhongJPA.service.dto.ChungNhanDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChungNhanService {
    private final ChungNhanRepository chungNhanRepository;
    private final NhanVienRepository nhanVienRepository;
    private final MayBayRepository mayBayRepository;

    public List<ChungNhan> getAllChungNhan() {
        return chungNhanRepository.findAll();
    }

    public ChungNhan createChungNhan(ChungNhanDTO chungNhanDTO) {
        Optional<NhanVien> nhanVien = nhanVienRepository.findById(chungNhanDTO.getMaNV());
        Optional<MayBay> mayBay = mayBayRepository.findById(chungNhanDTO.getMaMB());

        ChungNhan chungNhan = new ChungNhan();

        if (nhanVien.isPresent()) {
            chungNhan.setNhanVien(nhanVien.get());
        }
        if (mayBay.isPresent()) {
            chungNhan.setMayBay(mayBay.get());
        }
        return chungNhanRepository.save(chungNhan);
    }
}
