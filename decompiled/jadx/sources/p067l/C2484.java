package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2484 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7179 f3997;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C2484(C7179 c7179) {
        this.f3997 = c7179;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C7179 c7179 = this.f3997;
        if (!c7179.f18753) {
            return Math.min(100, c7179.f18755.m5407()) + (c7179.f18755.m5407() > 10 ? 1 : 0);
        }
        if (c7179.f18757) {
            if (c7179.f18751.isEmpty()) {
                return 2;
            }
            return c7179.f18751.size() + 1;
        }
        if (c7179.f18755.m5407() == 0) {
            return 2;
        }
        return Math.min(100, c7179.f18755.m5407()) + 1 + (c7179.f18755.m5407() > 10 ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC20591 viewOnClickListenerC20591;
        C7179 c7179 = this.f3997;
        if (view == null) {
            view = LayoutInflater.from(c7179.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
            viewOnClickListenerC20591 = new ViewOnClickListenerC20591(c7179, view);
            view.setTag(viewOnClickListenerC20591);
        } else {
            viewOnClickListenerC20591 = (ViewOnClickListenerC20591) view.getTag();
        }
        if (c7179.f18757) {
            if (c7179.f18751.isEmpty() && i == 0) {
                String strM16224 = C7050.m16224(R.string.MT_Protector);
                viewOnClickListenerC20591.f63653 = 4;
                viewOnClickListenerC20591.f63658.setVisibility(4);
                TextView textView = viewOnClickListenerC20591.f63655;
                textView.setText(strM16224);
                textView.setTextColor(C23223.f72984);
                return view;
            }
            if (i >= c7179.f18751.size()) {
                viewOnClickListenerC20591.m46549(3);
                return view;
            }
            C9562 c9562 = (C9562) c7179.f18751.get(i);
            viewOnClickListenerC20591.f63653 = 1;
            viewOnClickListenerC20591.f63652 = i;
            viewOnClickListenerC20591.f63659 = c9562;
            viewOnClickListenerC20591.f63658.setVisibility(4);
            String strM22266 = c9562.m22266();
            TextView textView2 = viewOnClickListenerC20591.f63655;
            textView2.setText(strM22266);
            textView2.setTextColor(C23223.f72986);
            return view;
        }
        if (!c7179.f18753) {
            if (i >= 10 && i == Math.min(100, c7179.f18755.m5407())) {
                viewOnClickListenerC20591.m46549(5);
                return view;
            }
            viewOnClickListenerC20591.m46550(i, c7179.f18755.m5397(i));
            return view;
        }
        if (c7179.f18755.m5407() == 0) {
            if (i == 0) {
                viewOnClickListenerC20591.m46549(2);
                return view;
            }
            String strM16225 = C7050.m16224(R.string.MT_Protector);
            viewOnClickListenerC20591.f63653 = 4;
            viewOnClickListenerC20591.f63658.setVisibility(4);
            TextView textView3 = viewOnClickListenerC20591.f63655;
            textView3.setText(strM16225);
            textView3.setTextColor(C23223.f72984);
            return view;
        }
        if (i == 0) {
            viewOnClickListenerC20591.m46549(2);
            return view;
        }
        int i2 = i - 1;
        if (i2 >= 10 && i2 == Math.min(100, c7179.f18755.m5407())) {
            viewOnClickListenerC20591.m46549(5);
            return view;
        }
        viewOnClickListenerC20591.m46550(i2, c7179.f18755.m5397(i2));
        return view;
    }
}
