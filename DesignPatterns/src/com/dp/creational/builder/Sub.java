package com.dp.creational.builder;

public class Sub {
	private String bread;
	private String stuffing;
	private String sauce;
	private boolean mayoneese;
	private boolean onion;
	private boolean tomato;
	private boolean capsicum;
	
	private Sub(SubBuilder sb) {
		this.bread=sb.bread;
		this.stuffing=sb.stuffing;
		this.sauce=sb.sauce;
		this.mayoneese=sb.mayoneese;
		this.onion=sb.onion;
		this.tomato=sb.tomato;
		this.capsicum=sb.capsicum;
	}
	@Override
	public String toString() {
		return "Sub [bread=" + bread + ", stuffing=" + stuffing + ", sauce=" + sauce + ", mayoneese=" + mayoneese
				+ ", onion=" + onion + ", tomato=" + tomato + ", capsicum=" + capsicum + "]";
	}
	public String getBread() {
		return bread;
	}
	public String getStuffing() {
		return stuffing;
	}
	public String getSauce() {
		return sauce;
	}
	public boolean isMayoneese() {
		return mayoneese;
	}
	public boolean isOnion() {
		return onion;
	}
	public boolean isTomato() {
		return tomato;
	}
	public boolean isCapsicum() {
		return capsicum;
	}
	
	static class SubBuilder{
		private String bread;
		private String stuffing;
		private String sauce;
		private boolean mayoneese;
		private boolean onion;
		private boolean tomato;
		private boolean capsicum;
		public SubBuilder(String bread, String stuffing, String sauce) {
			super();
			this.bread = bread;
			this.stuffing = stuffing;
			this.sauce = sauce;
		}
		public SubBuilder setMayoneese(boolean mayoneese) {
			this.mayoneese = mayoneese;
			return this;
		}
		public SubBuilder setOnion(boolean onion) {
			this.onion = onion;
			return this;
		}
		public SubBuilder setTomato(boolean tomato) {
			this.tomato = tomato;
			return this;
		}
		public SubBuilder setCapsicum(boolean capsicum) {
			this.capsicum = capsicum;
			return this;
		}
		
		public Sub build(){
			return new Sub(this);
		}
		
	}

}
