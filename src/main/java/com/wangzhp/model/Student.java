package com.wangzhp.model;

/**
* @author gacl
* ����student������Ӧ��ʵ����
*/
public class Student {

   //�������ԣ���student���е��ֶζ�Ӧ
   private int id;            //id===>s_id
   private String name;    //name===>s_name
   
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

   @Override
   public String toString() {
       return "Student [id=" + id + ", name=" + name + "]";
   }
}