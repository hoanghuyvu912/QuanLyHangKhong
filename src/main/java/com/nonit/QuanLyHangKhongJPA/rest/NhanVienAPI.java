package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import com.nonit.QuanLyHangKhongJPA.service.dto.NhanVienByNumOfPlanesDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/api/nhanvien")
public interface NhanVienAPI {
    @GetMapping
    ResponseEntity<List<NhanVien>> getAllNV();

    @GetMapping(value = "/getByTen")
    ResponseEntity<NhanVien> getByTen(@RequestParam("ten") String ten);

    @GetMapping(value = "/getByTenContain")
    ResponseEntity<List<NhanVien>> getByTenContain(@RequestParam("s") String s);

    @GetMapping(value = "/getByLuongGreaterThan")
    ResponseEntity<List<NhanVien>> getByLuongGreaterThan(@RequestParam Integer i);


    @GetMapping(value = "/getByLuongBetween")
    ResponseEntity<List<NhanVien>> getByLuongBetween(@Param("i1") Integer i1, @Param("i2") Integer i2);


    @GetMapping(value = "/getByLuongLessThan")
    ResponseEntity<List<NhanVien>> getByLuongLessThan(@RequestParam("i") Integer integer);


    @GetMapping(value = "/getByLuongIs")
    ResponseEntity<List<NhanVien>> getByLuongIs(@RequestParam("i") Integer i);

    @GetMapping(value = "/getByTenStartWith")
    ResponseEntity<List<NhanVien>> getByTenStartWith(@RequestParam("s") String s);

    @GetMapping(value = "/getByTenEndWith")
    ResponseEntity<List<NhanVien>> getByTenEndWith(@RequestParam("s") String s);

    @GetMapping(value = "/getByTenNotLike")
    ResponseEntity<List<NhanVien>> getByTenNotLike(@RequestParam("s") String s);

    @GetMapping(value = "/getByMaMB")
    ResponseEntity<List<NhanVien>> getByMaMB(@RequestParam("maMB") Integer maMB);

    @GetMapping(value = "/getByNumberOfPlanes")
    ResponseEntity<List<NhanVienByNumOfPlanesDTO>> getByNumberOfPlanes(@RequestParam("number") Integer number);
}
