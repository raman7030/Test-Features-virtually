package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0122 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5062 f1221;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C0122(C5062 c5062) {
        this.f1221 = c5062;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C5062 c5062 = this.f1221;
        if (!c5062.f15917) {
            return Math.min(100, c5062.f15919.m3093()) + (c5062.f15919.m3093() > 10 ? 1 : 0);
        }
        if (c5062.f15921) {
            if (c5062.f15915.isEmpty()) {
                return 2;
            }
            return c5062.f15915.size() + 1;
        }
        if (c5062.f15919.m3093() == 0) {
            return 2;
        }
        return Math.min(100, c5062.f15919.m3093()) + 1 + (c5062.f15919.m3093() > 10 ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC19174 viewOnClickListenerC19174;
        C5062 c5062 = this.f1221;
        if (view == null) {
            view = LayoutInflater.from(c5062.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
            viewOnClickListenerC19174 = new ViewOnClickListenerC19174(c5062, view);
            view.setTag(viewOnClickListenerC19174);
        } else {
            viewOnClickListenerC19174 = (ViewOnClickListenerC19174) view.getTag();
        }
        if (c5062.f15921) {
            if (c5062.f15915.isEmpty() && i == 0) {
                String strM14327 = C4925.m14327(R.string.MT_Protector);
                viewOnClickListenerC19174.f60422 = 4;
                viewOnClickListenerC19174.f60427.setVisibility(4);
                TextView textView = viewOnClickListenerC19174.f60424;
                textView.setText(strM14327);
                textView.setTextColor(C21943.f70273);
                return view;
            }
            if (i >= c5062.f15915.size()) {
                viewOnClickListenerC19174.m44254(3);
                return view;
            }
            C7569 c7569 = (C7569) c5062.f15915.get(i);
            viewOnClickListenerC19174.f60422 = 1;
            viewOnClickListenerC19174.f60421 = i;
            viewOnClickListenerC19174.f60428 = c7569;
            viewOnClickListenerC19174.f60427.setVisibility(4);
            String strM20289 = c7569.m20289();
            TextView textView2 = viewOnClickListenerC19174.f60424;
            textView2.setText(strM20289);
            textView2.setTextColor(C21943.f70275);
            return view;
        }
        if (!c5062.f15917) {
            if (i >= 10 && i == Math.min(100, c5062.f15919.m3093())) {
                viewOnClickListenerC19174.m44254(5);
                return view;
            }
            viewOnClickListenerC19174.m44255(i, c5062.f15919.m3083(i));
            return view;
        }
        if (c5062.f15919.m3093() == 0) {
            if (i == 0) {
                viewOnClickListenerC19174.m44254(2);
                return view;
            }
            String strM14328 = C4925.m14327(R.string.MT_Protector);
            viewOnClickListenerC19174.f60422 = 4;
            viewOnClickListenerC19174.f60427.setVisibility(4);
            TextView textView3 = viewOnClickListenerC19174.f60424;
            textView3.setText(strM14328);
            textView3.setTextColor(C21943.f70273);
            return view;
        }
        if (i == 0) {
            viewOnClickListenerC19174.m44254(2);
            return view;
        }
        int i2 = i - 1;
        if (i2 >= 10 && i2 == Math.min(100, c5062.f15919.m3093())) {
            viewOnClickListenerC19174.m44254(5);
            return view;
        }
        viewOnClickListenerC19174.m44255(i2, c5062.f15919.m3083(i2));
        return view;
    }
}
