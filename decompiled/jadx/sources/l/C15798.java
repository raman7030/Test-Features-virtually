package l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15798 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48728 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f48729;

    public C15798(C19328 c19328) {
        this.f48729 = c19328;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37255() {
        this.f48728 = true;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iM37254 = m37254();
        if (i2 < iM37254) {
            return 1;
        }
        return i2 - iM37254 == 0 ? 0 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19328 c19328 = this.f48729;
        if (i == 0) {
            return new C6627(LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 1) {
            return new ViewOnClickListenerC8744(c19328, LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        if (i == 2) {
            return new ViewOnClickListenerC18622(c19328, LayoutInflater.from(c19328.requireContext()).inflate(R.layout.MT_Protector, viewGroup, false));
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, @SuppressLint({C13132.TAG}) int i) {
        if (i == 0) {
            ((C6627) abstractC3255).f20398.setText(R.string.MT_Protector);
            return;
        }
        int i2 = i - 1;
        int iM37254 = m37254();
        C19328 c19328 = this.f48729;
        if (i2 >= iM37254) {
            int i3 = i2 - iM37254;
            if (i3 == 0) {
                C6627 c6627 = (C6627) abstractC3255;
                if (c19328.f60760) {
                    c6627.f20398.setText(c19328.getString(R.string.MT_Protector, c19328.f60762));
                    return;
                } else {
                    c6627.f20398.setText(R.string.MT_Protector);
                    return;
                }
            }
            int i4 = i3 - 1;
            ViewOnClickListenerC18622 viewOnClickListenerC18622 = (ViewOnClickListenerC18622) abstractC3255;
            List list = c19328.f60758;
            if (c19328.f60760) {
                i4 = c19328.f60757[i4];
            }
            C23560 c23560 = (C23560) list.get(i4);
            viewOnClickListenerC18622.f57749 = c23560;
            TextView textView = viewOnClickListenerC18622.f57750;
            textView.setText(C6554.m18061(150, c23560.m52025()));
            if (c23560.f75636) {
                textView.setTextColor(C21943.f70291);
                return;
            } else {
                textView.setTextColor(C21943.f70275);
                return;
            }
        }
        ViewOnClickListenerC8744 viewOnClickListenerC8744 = (ViewOnClickListenerC8744) abstractC3255;
        viewOnClickListenerC8744.f26646 = i2;
        ImageView imageView = viewOnClickListenerC8744.f26648;
        TextView textView2 = viewOnClickListenerC8744.f26644;
        if (c19328.f60760 && c19328.f60763 == 0 && i2 == 2) {
            viewOnClickListenerC8744.f26646 = 3;
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
            if (c19328.f60760) {
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
        if (this.f48728) {
            this.f48728 = false;
            C0471 c0471 = new C0471(C21943.f70286);
            c0471.m2074(1000);
            View view = viewOnClickListenerC8744.f26647;
            int i5 = C17648.f53953;
            view.setBackground(c0471);
        }
        imageView.setImageResource(R.drawable.MT_Protector);
        textView2.setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        C19328 c19328 = this.f48729;
        if (c19328.f60758 == null) {
            return 0;
        }
        if (c19328.f60758.isEmpty()) {
            return m37254() + 1;
        }
        return m37254() + 2 + (c19328.f60760 ? c19328.f60763 : c19328.f60758.size());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m37254() {
        C19328 c19328 = this.f48729;
        int i = 1;
        if (c19328.f60758 == null || c19328.f60758.isEmpty()) {
            return 1;
        }
        if (c19328.f60760 && c19328.f60763 == 0) {
            i = 0;
        }
        return !c19328.f60764 ? i + 2 : i + 3;
    }
}
