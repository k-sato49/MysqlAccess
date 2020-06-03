package com.example.MysqlAccess;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="M_DEPARTMENT")
//クラス　Department作成
public class Department {
	@Id
	//カラム名D_CD作成　文字列型d_cd
	@Column(name="D_CD" ,columnDefinition = "CHAR(2)")
	private String d_cd;
	//カラム名D_NAME作成　文字列型d_name
	@Column(name="D_NAME" ,nullable = false ,columnDefinition = "VARCHAR(20)")
	private String d_name;
	
	//カラム名UPDATE_DATE作成　timestamp型（日付と時刻の格納）update_date
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private Timestamp update_date;
	//カラム名UPDATE_USER作成　文字列型　update_user
	@Column(name="UPDATE_USER" ,columnDefinition = "VARCHAR(40)")
	private String update_user;
	//カラム名CREATE_DATE作成　timestamp型（日付と時刻の格納）create_date
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private Timestamp create_date;
	//カラム名CREATE_USER作成　文字列型create_user
	@Column(name="CREATE_USER" ,columnDefinition = "VARCHAR(40)")
	//フィールドにcreate_userを作成
	private String create_user;
	//d_cdの値を取得
	public String getD_cd() {
		return d_cd;
	}
	//d_cdの値を設定
	public void setD_cd(String d_cd) {
		this.d_cd = d_cd;
	}
	//d_nameの値を取得
	public String getD_name() {
		return d_name;
	}
	//d_nameの値を設定
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	
	//d_cd,d_nameの値を取得
	public void setAll(  String d_cd
						,String d_name
						) {
		this.d_cd =d_cd;
		this.d_name = d_name;
	}

		//creat_dateの値を取得
		public Timestamp getCreate_date() {
			return create_date;
		}
		//creat_dateの値を設定
		public void setCreate_date(Timestamp create_date) {
			this.create_date = create_date;
		}
		//creat_userの値を取得
		public String getCreate_user() {
			return create_user;
		}
		//creat_uearの値を設定
		public void setCreate_user(String create_user) {
			this.create_user = create_user;
		}
		//update_dateの値を取得
		public Timestamp getUpdate_date() {
			return update_date;
		}
		//update_dateの値を設定
		public void setUpdate_date(Timestamp update_date) {
			this.update_date = update_date;
		}
		//update_userの値を取得
		public String getUpdate_user() {
			return update_user;
		}
		//update_userの値を設定
		public void setUpdate_user(String update_user) {
			this.update_user = update_user;
		}
}