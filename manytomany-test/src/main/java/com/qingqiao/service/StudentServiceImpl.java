package com.qingqiao.service;

import com.qingqiao.entity.Mistakes;
import com.qingqiao.entity.StuAndMis;
import com.qingqiao.entity.Student;
import com.qingqiao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Mistakes> queryAllMis() {
        return studentMapper.queryAllMis();
    }

    @Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public Student queryStudentById(int parseInt) {
        return studentMapper.queryStudentById(parseInt);
    }

    @Override
    public boolean changMis(String sid, String mids) {
        try {
            int delete_result=studentMapper.deleteSMByID(sid);
            String[] split=mids.split(",");
            for (String s:split){
                studentMapper.addSM(sid,s);
            }
            Student student=queryStudentById(Integer.parseInt(sid));
            List<StuAndMis> stuAndMis=student.getStuAndMis();
            Integer mscore=0;
            for (StuAndMis stuAndMi:stuAndMis){
                mscore+=stuAndMi.getMistakes().getScore();
            }
            student.setScore(1000-mscore);
            updateStudent(student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    private int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }


}


