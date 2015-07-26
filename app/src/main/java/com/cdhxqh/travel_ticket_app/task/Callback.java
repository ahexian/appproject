package com.cdhxqh.travel_ticket_app.task;

public interface Callback<T> {
	/**
	 * 当加载完成后回调，加载完毕的事后处理  
	 */
	public void onCallback(final T pCallbackValue);
}
