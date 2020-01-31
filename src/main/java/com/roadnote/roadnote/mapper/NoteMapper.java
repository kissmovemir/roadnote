package com.roadnote.roadnote.mapper;

import com.roadnote.roadnote.bean.NoteBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NoteMapper {

    @Select("SELECT * FROM note_item")
    @Results({
            @Result(property = "userId",  column = "user_id"),
            @Result(property = "noteId", column = "note_id"),
            @Result(property = "noteName", column = "note_name"),
            @Result(property = "noteContent", column = "note_content"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "modifyTime", column = "modify_time")
    })
    List<NoteBean> findAll();
}