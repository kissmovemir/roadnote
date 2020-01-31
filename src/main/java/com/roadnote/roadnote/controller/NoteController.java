package com.roadnote.roadnote.controller;

import com.roadnote.roadnote.bean.NoteBean;
import com.roadnote.roadnote.conf.ProjectConf;
import com.roadnote.roadnote.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@RestController
public class NoteController {

    @Autowired
    private NoteMapper noteMapper;

    @RequestMapping("/listNotes")
    public String listNotes() {
        List<NoteBean> notes = noteMapper.findAll();
        StringBuilder sb = new StringBuilder();
        if (notes != null && notes.size() > 0) {
            for (NoteBean note : notes) {
                sb.append(note.toString() + ";\n");
            }
        }

        return sb.toString();
    }
}