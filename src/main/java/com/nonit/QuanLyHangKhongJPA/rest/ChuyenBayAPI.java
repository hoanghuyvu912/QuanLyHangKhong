package com.nonit.QuanLyHangKhongJPA.rest;

import com.nonit.QuanLyHangKhongJPA.entity.ChuyenBay;
import org.springframework.cglib.core.Local;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;
import java.util.List;

@RequestMapping(value = "/api/chuyenbay")
public interface ChuyenBayAPI {
    @GetMapping
    ResponseEntity<List<ChuyenBay>> getAllChuyenBay();

    @GetMapping(value = "/getByGaDi")
    ResponseEntity<List<ChuyenBay>> getByGaDi(@Param("gaDi") String gaDi);

    @GetMapping(value = "/getByGaDiContain")
    ResponseEntity<List<ChuyenBay>> getByGaDiContain(@Param("s") String s);

    @GetMapping(value = "/getByDoDaiGreaterThan")
    ResponseEntity<List<ChuyenBay>> getByDoDaiGreaterThan(@Param("i") Integer i);

    @GetMapping(value = "/getByGaDiAndGaDen")
    ResponseEntity<List<ChuyenBay>> getByGaDiAndGaDen(@Param("gaDi") String gaDi, @Param("gaDen") String gaDen);

    @GetMapping(value = "/getByLoaiMayBay")
    ResponseEntity<List<ChuyenBay>> getByLoaiMayBay(@Param("loai") String loai);

    @GetMapping(value = "/getByBoeing")
    ResponseEntity<List<ChuyenBay>> getByBoeing();

    @GetMapping(value = "/getByAirbusA320")
    ResponseEntity<List<ChuyenBay>> getByAirbusA320();

    @GetMapping(value = "/getByDoDaiLessThan10000AndGreaterThan8000")
    ResponseEntity<List<ChuyenBay>> getByDoDaiLessThan10000AndGreaterThan8000();

    @GetMapping(value = "/getByDoDaiLessThan")
    ResponseEntity<List<ChuyenBay>> getByDoDaiLessThan(@Param("doDai") Integer doDai);

    @GetMapping(value = "/getByDoDaiIs")
    ResponseEntity<List<ChuyenBay>> getByDoDaiIs(@Param("doDai") Integer doDai);

    @GetMapping(value = "/getByDoDaiBetween")
    ResponseEntity<List<ChuyenBay>> getByDoDaiBetween(@Param("doDai1") Integer doDai1, @Param("doDai2") Integer doDai2);

    @GetMapping(value = "/getByLoaiGaDiSGNAndGaDenBMV")
    ResponseEntity<List<ChuyenBay>> getByLoaiGaDiSGNAndGaDenBMV();

    @GetMapping(value = "/getByGioDiSoonerThanASpecificTime")
    ResponseEntity<List<ChuyenBay>> getByGioDiBeforeASpecificTime(@RequestParam("time") LocalTime time);

    @GetMapping(value = "/getCountChuyenBayByGadi")
    ResponseEntity<Integer> getCountChuyenBayByGadi(@Param("gaDi") String gaDi);

    @GetMapping(value = "/getByGioDiBefore12")
    ResponseEntity<List<ChuyenBay>> getByGioDiBefore12();

    @GetMapping(value = "/timChuyenBayXuatPhatTu")
    ResponseEntity<List<ChuyenBay>> timChuyenBayXuatPhatTu(@RequestParam("gaDi") String gaDi);
}
