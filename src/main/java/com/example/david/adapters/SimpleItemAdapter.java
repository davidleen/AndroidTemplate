package com.example.david.adapters;

import java.util.List;

import android.content.Context;
import android.widget.TextView;
import com.example.david.R;
import com.example.david.beans.Dictionary;

/**
 * a sample adapter without multi viewType
 * just ignore the param itemViewType;
 * 
 * @author davidleen29
 * @创建时间 2013年11月14日
 */
public class SimpleItemAdapter extends AbstractAdapter<Dictionary> {

	public SimpleItemAdapter(Context context) {
		super(context);

	}

	public SimpleItemAdapter(Context context, List<Dictionary> cards) {
		super(context, cards);

	}

	@Override
	protected int getItemViewLayout(int itemViewType) {

		return R.layout.list_item_simple;

	}

	@Override
	protected Bindable<Dictionary> getItemViewHolder(int itemViewType) {

		return new NumberTypeBinder();

	}

	/**
	 * number type view binder
	 * 
	 * @author davidleen29
	 * @创建时间 2013年11月14日
	 */
	class NumberTypeBinder implements Bindable<Dictionary> {
		TextView item;

		@Override
		public void bindData(Dictionary data, int position) {
			// here do all your bind obj
            item.setText(data.toString());
		}

	}

}
