package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="item")
@NoArgsConstructor //引数なしコンストラクタ
@AllArgsConstructor //全フィールド引数のコンストラクタ
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@Getter
	private int id; //主キー
	
	@Column(name="name")
	@Getter
	private String name; //商品名
	
	@Column(name="price")
	@Getter
	private int price; //価格
	
	@Column(name="detail")
	@Getter
	private String detail; //商品説明
	
	@Column(name="image")
	@Getter
	private String image; //商品画像
	
	@Column(name="category_id")
	@Getter
	private String category_id; //カテゴリー
	
	@Column(name="condition_id")
	@Getter
	private int condition_id; //状態
	
	@Column(name="user_id")
	@Getter
	private int user_id; //出品ユーザー
	
	@Column(name="exhibit_date")
	@Getter
	private Date exhibit_date; //出品日
	
	@Column(name="update_date")
	@Getter
	private Date update_date; //更新日
	
	@Column(name="delete_date")
	@Getter
	private Date delete_date; //削除日
	
	@Column(name="transaction")
	@Getter
	private int transaction; //取引フラグ
	
	@Column(name="access")
	@Getter
	private int access; //アクセス数
	
	//商品新規登録
	public Item(String name, int price, String detail, String image, 
			String category_id, int condition_id, int user_id, Date now_date
			) {
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.image = image;
		this.category_id = category_id;
		this.condition_id = condition_id;
		this.user_id = user_id;
		exhibit_date = now_date;
		update_date = now_date;
//		delete_date = null;
//		transaction = 0;
//		access = 0;
	}
}