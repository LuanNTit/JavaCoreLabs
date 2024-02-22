package com.luan.access;

class TestA {

	public void methodPublic(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	
	private void methodPrivate(){}
}
