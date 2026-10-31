package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.᩸ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes.dex */
public final class C21724 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f69686;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20313 f69687;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C21724(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        this.f69687 = viewOnClickListenerC20313;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49051(String str) {
        this.f69686 = str;
        m49050();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49050() {
        String str = this.f69686;
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        if (str == null || str.isEmpty()) {
            ((ArrayList) viewOnClickListenerC20313.f65604).clear();
            ((ArrayList) viewOnClickListenerC20313.f65604).addAll(viewOnClickListenerC20313.f65594);
            ((ArrayList) viewOnClickListenerC20313.f65597).clear();
            ((ArrayList) viewOnClickListenerC20313.f65597).addAll(viewOnClickListenerC20313.f65586);
            notifyDataSetChanged();
            return;
        }
        ((ArrayList) viewOnClickListenerC20313.f65597).clear();
        ((ArrayList) viewOnClickListenerC20313.f65604).clear();
        try {
            String str2 = this.f69686;
            for (Object obj : viewOnClickListenerC20313.f65586) {
                if (ViewOnClickListenerC20313.m46567(viewOnClickListenerC20313, obj, str2)) {
                    ((ArrayList) viewOnClickListenerC20313.f65597).add(obj);
                }
            }
            for (C9545 c9545 : viewOnClickListenerC20313.f65594) {
                if (C9679.m24616((CharSequence) c9545.m24417(), (CharSequence) str2)) {
                    ((ArrayList) viewOnClickListenerC20313.f65604).add(c9545);
                }
            }
        } catch (ConcurrentModificationException unused) {
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        return ((ArrayList) (viewOnClickListenerC20313.f65596 ? viewOnClickListenerC20313.f65604 : viewOnClickListenerC20313.f65597)).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        return ((ArrayList) (viewOnClickListenerC20313.f65596 ? viewOnClickListenerC20313.f65604 : viewOnClickListenerC20313.f65597)).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22429 c22429;
        if (view != null) {
            c22429 = (C22429) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c22429 = new C22429();
            c22429.f72675 = (TextView) view.findViewById(R.id.textView);
            c22429.f72673 = (TextView) view.findViewById(R.id.textView2);
            c22429.f72674 = (ImageView) view.findViewById(R.id.icon);
            view.setTag(c22429);
        }
        ViewOnClickListenerC20313 viewOnClickListenerC20313 = this.f69687;
        if (viewOnClickListenerC20313.f65596) {
            C9545 c9545 = (C9545) ((ArrayList) viewOnClickListenerC20313.f65604).get(i);
            if (c9545 == viewOnClickListenerC20313.f65590) {
                view.setBackgroundColor(C21943.f70286);
            } else {
                view.setBackgroundColor(0);
            }
            c22429.f72674.setImageBitmap(viewOnClickListenerC20313.f65584);
            c22429.f72675.setText(C6554.m18061(200, c9545.m24417().replace('\n', ' ').replace('\r', ' ')));
            c22429.f72675.setSingleLine(false);
            c22429.f72673.setVisibility(8);
        } else {
            Object obj = ((ArrayList) viewOnClickListenerC20313.f65597).get(i);
            if (obj == viewOnClickListenerC20313.f65598.mo7979()) {
                view.setBackgroundColor(C21943.f70286);
            } else {
                view.setBackgroundColor(0);
            }
            c22429.f72675.setSingleLine(true);
            c22429.f72673.setVisibility(0);
            if (obj instanceof C8839) {
                C8839 c8839 = (C8839) obj;
                c22429.f72674.setImageBitmap(viewOnClickListenerC20313.f65591);
                c22429.f72675.setText(C6554.m18061(100, c8839.m22833()));
                c22429.f72673.setText(C6554.m18061(200, c8839.m22835()));
            } else if (obj instanceof C14482) {
                C14482 c14482 = (C14482) obj;
                c22429.f72674.setImageBitmap(viewOnClickListenerC20313.f65595);
                c22429.f72675.setText(C6554.m18061(100, c14482.m34581()));
                c22429.f72673.setText(C6554.m18061(200, c14482.m34576()));
            } else {
                C23655 c23655 = (C23655) obj;
                c22429.f72674.setImageBitmap(viewOnClickListenerC20313.f65589);
                c22429.f72675.setText(C6554.m18061(100, c23655.m52181()));
                c22429.f72673.setText(C6554.m18061(200, c23655.m52178()));
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = viewOnClickListenerC20313.f65599.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
