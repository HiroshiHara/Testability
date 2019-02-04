package com.hiroshi.hara.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateDependencyExampleTest {

	@Test
	public void doSomethingを実行するとdateフィールドに現在時刻が設定される() throws Exception {
		
		// Dateクラスのコンストラクタで現在時刻を取得
		final Date current = new Date();
		DateDependencyExample sut = new DateDependencyExample()	 {
			// DateDependencyExampleクラスを匿名クラスとして宣言、newDateをオーバライドして
			// 戻り値をローカル変数currentに変更する
			@Override
			Date newDate() {
				return current;
			}
		};
		// doSomethingの結果sutのdateフィールドはcurrentに設定される
		sut.doSomething();
		assertThat(sut.date, is(sameInstance(current)));
	}

}
