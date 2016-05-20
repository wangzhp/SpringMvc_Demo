package com.wangzhp.model;

import java.util.List;

/**
 * @author gacl
 * ����class���Ӧ��ʵ����
 */
public class Classes {

    //����ʵ��������ԣ���class���е��ֶζ�Ӧ
    private int id;            //id===>c_id
    private String name;    //name===>c_name
    
    private List<Student> students;
    
    public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
     * class������һ��teacher_id�ֶΣ�������Classes���ж���һ��teacher���ԣ�
     * ����ά��teacher��class֮���һ��һ��ϵ��ͨ�����teacher���ԾͿ���֪������༶�����ĸ���ʦ�����
     */
    private Teacher teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher+ "]";
    }
}