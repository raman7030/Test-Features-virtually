package p067l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2603 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f4310 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C16684 f4311;

    public C2603(C16684 c16684) {
        this.f4311 = c16684;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3902() {
        this.f4310 = true;
        notifyDataSetChanged();
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM3901 = m3901();
        if (i2 < iM3901) {
            return 1;
        }
        return i2 - iM3901 == 0 ? 0 : 2;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C16684 c16684 = this.f4311;
        if (i == 0) {
            return new C4616(LayoutInflater.from(c16684.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC20710(c16684, LayoutInflater.from(c16684.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC9980(c16684, LayoutInflater.from(c16684.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, @SuppressLint({C14849.TAG}) int i) {
        if (i == 0) {
            ((C4616) abstractC5462).f10348.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM3901 = m3901();
        C16684 c16684 = this.f4311;
        if (i2 >= iM3901) {
            int i3 = i2 - iM3901;
            if (i3 == 0) {
                C4616 c4616 = (C4616) abstractC5462;
                if (c16684.f49112) {
                    c4616.f10348.setText(c16684.getString(R.string.MT_Protector, c16684.f49114));
                    return;
                } else {
                    c4616.f10348.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC9980 viewOnClickListenerC9980 = (ViewOnClickListenerC9980) abstractC5462;
            List list = c16684.f49116;
            if (c16684.f49112) {
                i4 = c16684.f49109[i4];
            }
            C17355 c17355 = (C17355) list.get(i4);
            viewOnClickListenerC9980.f27649 = c17355;
            TextView textView = viewOnClickListenerC9980.f27650;
            textView.setText(C8597.m20011(150, c17355.m39356()));
            if (c17355.f51753) {
                textView.setTextColor(C23223.f73002);
                return;
            } else {
                textView.setTextColor(C23223.f72986);
                return;
            }
        }
        ViewOnClickListenerC20710 viewOnClickListenerC20710 = (ViewOnClickListenerC20710) abstractC5462;
        viewOnClickListenerC20710.f63935 = i2;
        ImageView imageView = viewOnClickListenerC20710.f63937;
        TextView textView2 = viewOnClickListenerC20710.f63933;
        if (c16684.f49112 && c16684.f49115 == 0 && i2 == 2) {
            viewOnClickListenerC20710.f63935 = 3;
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
            if (c16684.f49112) {
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
        if (this.f4310) {
            this.f4310 = false;
            C2816 c2816 = new C2816(C23223.f72997);
            c2816.m4455(1000);
            View view = viewOnClickListenerC20710.f63936;
            int i5 = C1717.f57146;
            view.setBackground(c2816);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        C16684 c16684 = this.f4311;
        if (c16684.f49116 == null) {
            return 0;
        }
        if (c16684.f49116.isEmpty()) {
            return m3901() + 1;
        }
        return m3901() + 2 + (c16684.f49112 ? c16684.f49115 : c16684.f49116.size());
    }

    /* JADX INFO: renamed from: ۧ */
    private int m3901() {
        C16684 c16684 = this.f4311;
        int i = 1;
        if (c16684.f49116 == null || c16684.f49116.isEmpty()) {
            return 1;
        }
        if (c16684.f49112 && c16684.f49115 == 0) {
            i = 0;
        }
        return !c16684.f49118 ? i + 2 : i + 3;
    }
}
