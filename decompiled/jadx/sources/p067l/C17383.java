package p067l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17383 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f51867 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C20738 f51868;

    public C17383(C20738 c20738) {
        this.f51868 = c20738;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39426() {
        this.f51867 = true;
        notifyDataSetChanged();
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM39425 = m39425();
        if (i2 < iM39425) {
            return 1;
        }
        return i2 - iM39425 == 0 ? 0 : 2;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20738 c20738 = this.f51868;
        if (i == 0) {
            return new C8667(LayoutInflater.from(c20738.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC10679(c20738, LayoutInflater.from(c20738.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC20067(c20738, LayoutInflater.from(c20738.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, @SuppressLint({C14849.TAG}) int i) {
        if (i == 0) {
            ((C8667) abstractC5462).f23274.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM39425 = m39425();
        C20738 c20738 = this.f51868;
        if (i2 >= iM39425) {
            int i3 = i2 - iM39425;
            if (i3 == 0) {
                C8667 c8667 = (C8667) abstractC5462;
                if (c20738.f63992) {
                    c8667.f23274.setText(c20738.getString(R.string.MT_Protector, c20738.f63994));
                    return;
                } else {
                    c8667.f23274.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC20067 viewOnClickListenerC20067 = (ViewOnClickListenerC20067) abstractC5462;
            List list = c20738.f63990;
            if (c20738.f63992) {
                i4 = c20738.f63989[i4];
            }
            C24760 c24760 = (C24760) list.get(i4);
            viewOnClickListenerC20067.f60972 = c24760;
            TextView textView = viewOnClickListenerC20067.f60973;
            textView.setText(C8597.m20011(150, c24760.m54427()));
            if (c24760.f78382) {
                textView.setTextColor(C23223.f73002);
                return;
            } else {
                textView.setTextColor(C23223.f72986);
                return;
            }
        }
        ViewOnClickListenerC10679 viewOnClickListenerC10679 = (ViewOnClickListenerC10679) abstractC5462;
        viewOnClickListenerC10679.f29572 = i2;
        ImageView imageView = viewOnClickListenerC10679.f29574;
        TextView textView2 = viewOnClickListenerC10679.f29570;
        if (c20738.f63992 && c20738.f63995 == 0 && i2 == 2) {
            viewOnClickListenerC10679.f29572 = 3;
            i2 = 3;
        }
        if (i2 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView2.setText(R.string.MT_Protector);
            return;
        }
        if (i2 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView2.setText(R.string.MT_Protector);
            return;
        }
        if (i2 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            if (c20738.f63992) {
                textView2.setText(R.string.MT_Protector);
                return;
            } else {
                textView2.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i2 != 3) {
            throw new RuntimeException(C20778.m46922(i2, "MenuType = "));
        }
        if (this.f51867) {
            this.f51867 = false;
            C2816 c2816 = new C2816(C23223.f72997);
            c2816.m4455(1000);
            View view = viewOnClickListenerC10679.f29573;
            int i5 = C1717.f57146;
            view.setBackground(c2816);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        C20738 c20738 = this.f51868;
        if (c20738.f63990 == null) {
            return 0;
        }
        if (c20738.f63990.isEmpty()) {
            return m39425() + 1;
        }
        return m39425() + 2 + (c20738.f63992 ? c20738.f63995 : c20738.f63990.size());
    }

    /* JADX INFO: renamed from: ۧ */
    private int m39425() {
        C20738 c20738 = this.f51868;
        int i = 1;
        if (c20738.f63990 == null || c20738.f63990.isEmpty()) {
            return 1;
        }
        if (c20738.f63992 && c20738.f63995 == 0) {
            i = 0;
        }
        return !c20738.f63996 ? i + 2 : i + 3;
    }
}
