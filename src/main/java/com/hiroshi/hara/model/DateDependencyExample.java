package com.hiroshi.hara.model;

import java.util.Date;

public class DateDependencyExample {
	
	Date date = newDate();
	
	public void doSomething() {
		this.date = newDate();
	}
	
	// 日付を生成する部分だけをdoSomethingから抽出(Extract)する
	// doSomethingのテストコードでExtractしたメソッドをオーバーライドして利用する。
	// オーバーライドするためアクセス修飾子はデフォルトにする。
	Date newDate() {
		return new Date();
	}
}
