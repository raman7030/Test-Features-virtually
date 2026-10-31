package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0247 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1532 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f1533;

    public C0247(C15063 c15063) {
        this.f1533 = c15063;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1504() {
        this.f1532 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM1503 = m1503();
        if (i2 < iM1503) {
            return 1;
        }
        return i2 - iM1503 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15063 c15063 = this.f1533;
        if (i == 0) {
            return new C2365(LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC19299(c15063, LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC8009(c15063, LayoutInflater.from(c15063.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, @SuppressLint({C13132.TAG}) int i) {
        if (i == 0) {
            ((C2365) abstractC3255).f7557.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM1503 = m1503();
        C15063 c15063 = this.f1533;
        if (i2 >= iM1503) {
            int i3 = i2 - iM1503;
            if (i3 == 0) {
                C2365 c2365 = (C2365) abstractC3255;
                if (c15063.f45994) {
                    c2365.f7557.setText(c15063.getString(R.string.MT_Protector, c15063.f45996));
                    return;
                } else {
                    c2365.f7557.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC8009 viewOnClickListenerC8009 = (ViewOnClickListenerC8009) abstractC3255;
            List list = c15063.f45998;
            if (c15063.f45994) {
                i4 = c15063.f45991[i4];
            }
            C15769 c15769 = (C15769) list.get(i4);
            viewOnClickListenerC8009.f24735 = c15769;
            TextView textView = viewOnClickListenerC8009.f24736;
            textView.setText(C6554.m18061(150, c15769.m37186()));
            if (c15769.f48614) {
                textView.setTextColor(C21943.f70291);
                return;
            } else {
                textView.setTextColor(C21943.f70275);
                return;
            }
        }
        ViewOnClickListenerC19299 viewOnClickListenerC19299 = (ViewOnClickListenerC19299) abstractC3255;
        viewOnClickListenerC19299.f60705 = i2;
        ImageView imageView = viewOnClickListenerC19299.f60707;
        TextView textView2 = viewOnClickListenerC19299.f60703;
        if (c15063.f45994 && c15063.f45997 == 0 && i2 == 2) {
            viewOnClickListenerC19299.f60705 = 3;
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
            if (c15063.f45994) {
                textView2.setText(R.string.MT_Protector);
                return;
            } else {
                textView2.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i2 != 3) {
            throw new RuntimeException(C19370.m44628(i2, "MenuType = "));
        }
        if (this.f1532) {
            this.f1532 = false;
            C0471 c0471 = new C0471(C21943.f70286);
            c0471.m2074(1000);
            View view = viewOnClickListenerC19299.f60706;
            int i5 = C17648.f53953;
            view.setBackground(c0471);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        C15063 c15063 = this.f1533;
        if (c15063.f45998 == null) {
            return 0;
        }
        if (c15063.f45998.isEmpty()) {
            return m1503() + 1;
        }
        return m1503() + 2 + (c15063.f45994 ? c15063.f45997 : c15063.f45998.size());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m1503() {
        C15063 c15063 = this.f1533;
        int i = 1;
        if (c15063.f45998 == null || c15063.f45998.isEmpty()) {
            return 1;
        }
        if (c15063.f45994 && c15063.f45997 == 0) {
            i = 0;
        }
        return !c15063.f46000 ? i + 2 : i + 3;
    }
}
