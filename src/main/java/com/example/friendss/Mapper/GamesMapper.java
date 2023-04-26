package com.example.friendss.Mapper;


import com.example.friendss.pojo.Learn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GamesMapper {
    @Select("select * from game_community")
    public Learn all();
}
