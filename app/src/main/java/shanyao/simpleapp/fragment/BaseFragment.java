package shanyao.simpleapp.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shanyao.simpleapp.utils.CommonUtils;
import shanyao.simpleapp.widgets.ContentPage;


public abstract class BaseFragment extends Fragment implements View.OnClickListener{
	public ContentPage contentPage;
	public static ProgressDialog pdLoading;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		/**
		 * 初始化pdLoading
		 */
		if(pdLoading == null){
			pdLoading = new ProgressDialog(getActivity());
		}
		pdLoading.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		pdLoading.setMessage("请稍后");
		pdLoading.setCanceledOnTouchOutside(false);
		pdLoading.setCancelable(true);
		if (contentPage == null) {
			contentPage = new ContentPage(getActivity()) {
				@Override
				protected Object loadData() {
					return requestData();
				}

				@Override
				protected View createSuccessView() {
					return getSuccessView();
				}
			};
		}else{
			CommonUtils.removeSelfFromParent(contentPage);
		}
		return contentPage;
	}

	/**
	 * 返回据的fragment填充的具体View
	 */
	protected abstract View getSuccessView();

	/**
	 * 返回请求服务器的数据
	 */
	protected abstract Object requestData();
	public void refreshPage(Object o){
		contentPage.refreshPage(o);
	}
}



