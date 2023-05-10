package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayDTO;
import com.nonit.QuanLyHangKhongJPA.service.dto.CustomMayBayInterfaceDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/api/maybay")
public interface MayBayAPI {
    @GetMapping
    ResponseEntity<List<MayBay>> getAllMayBay();

    @GetMapping(value = "/getByLoai")
    ResponseEntity<MayBay> getByLoai(@RequestParam("loai") String loai);

    @GetMapping(value = "/getByLoaiContain")
    ResponseEntity<List<MayBay>> getByLoaiContain(@RequestParam("s") String s);

    @GetMapping(value = "/getByTamBayGreaterThan")
    ResponseEntity<List<MayBay>> getByTamBayGreaterThan(@RequestParam Integer i);

    @GetMapping(value = "/getByTamBayBetween")
    ResponseEntity<List<MayBay>> getByTamBayBetween(@Param("i1") Integer i1, @Param("i2") Integer i2);

    @GetMapping(value = "/getByTamBayLessThan")
    ResponseEntity<List<MayBay>> getByTamBayLessThan(@RequestParam("i") Integer i);

    @GetMapping(value = "/getByTamBayIs")
    ResponseEntity<List<MayBay>> getByTamBayIs(@RequestParam("i") Integer i);

    @GetMapping(value = "/getByLoaiStartWith")
    ResponseEntity<List<MayBay>> getByLoaiStartWith(@RequestParam("s") String s);

    @GetMapping(value = "/getByLoaiEndWith")
    ResponseEntity<List<MayBay>> getByLoaiEndWith(@RequestParam("s") String s);

    @GetMapping(value = "/getByLoaiNotLike")
    ResponseEntity<List<MayBay>> getByLoaiNotLike(@RequestParam("s") String s);

    @GetMapping(value = "/getByMaNV")
    ResponseEntity<List<MayBay>> getByMaNV(@RequestParam("maNV") String maNV);

    @GetMapping(value = "/getMaMBAndTamBayByLoai")
    ResponseEntity<List<CustomMayBayInterfaceDTO>> getMaMBAndTamBayByLoaiLike(@RequestParam("loai") String loai);

    @GetMapping(value = "/getMaMBAndLoaiMBByLoai")
    ResponseEntity<List<CustomMayBayDTO>> getMaMBAndLoaiMBByLoaiLike(@RequestParam("loai") String loai);
}
