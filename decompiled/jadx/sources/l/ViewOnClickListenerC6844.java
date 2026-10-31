package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC6844 extends AbstractC3255 implements InterfaceC1008, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC3817 f21181;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f21182;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f21183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f21184;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f21185;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10402 f21186;

    public ViewOnClickListenerC6844(Main main, ViewGroup viewGroup) {
        super(LayoutInflater.from(main).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f21185 = main;
        this.f21183 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f21184 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f21186 = (C10402) this.itemView.findViewById(R.id.icon);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.MT_Protector);
        this.f21182 = progressBar;
        C10392 c10392 = new C10392(main);
        c10392.m26205(true);
        progressBar.setIndeterminateDrawable(c10392);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC3817 abstractC3817 = this.f21181;
        if (abstractC3817 == null) {
            return;
        }
        boolean zM11516 = abstractC3817.m11516();
        AbstractActivityC3346 abstractActivityC3346 = this.f21185;
        if (zM11516) {
            C17222 c17222M11537 = this.f21181.m11537();
            if (c17222M11537.m40525()) {
                c17222M11537.m40523(abstractActivityC3346);
                return;
            }
            return;
        }
        this.f21181.m11550(abstractActivityC3346);
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1617(AbstractC3817 abstractC3817) {
        boolean z;
        AbstractC3817 abstractC3818 = this.f21181;
        if (abstractC3818 != abstractC3817) {
            if (abstractC3818 != null) {
                abstractC3818.m11532().m1670((InterfaceC1008) this);
            }
            if (abstractC3817 != null) {
                abstractC3817.m11532().m1668(this.f21185, this);
            }
            this.f21181 = abstractC3817;
        }
        if (abstractC3817 == null) {
            return;
        }
        this.f21186.m26232(abstractC3817.mo2779());
        if (!abstractC3817.m11516()) {
            z = false;
        } else if (!abstractC3817.m11537().m40525()) {
            return;
        } else {
            z = true;
        }
        CharSequence charSequenceM11557 = abstractC3817.m11557();
        CharSequence charSequenceM11534 = abstractC3817.m11534();
        int iM11539 = abstractC3817.m11539();
        TextView textView = this.f21183;
        if (charSequenceM11557 != null) {
            textView.setText(abstractC3817.m11557());
        } else {
            textView.setText("...");
        }
        TextView textView2 = this.f21184;
        if (charSequenceM11534 == null) {
            if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2.getVisibility() != 0) {
                textView2.setVisibility(0);
            }
            if (charSequenceM11534.length() > 50) {
                textView2.setText(C6554.m18061(50, charSequenceM11534.toString()));
            } else {
                textView2.setText(charSequenceM11534);
            }
        }
        ProgressBar progressBar = this.f21182;
        if (z) {
            if (progressBar.getVisibility() != 8) {
                progressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
        }
        if (iM11539 != -1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(iM11539);
        } else {
            progressBar.setIndeterminate(true);
        }
    }
}
