package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8873 extends AbstractC5462 implements InterfaceC3326, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC5996 f24059;

    /* JADX INFO: renamed from: ۙ */
    public final ProgressBar f24060;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f24061;

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f24062;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f24063;

    /* JADX INFO: renamed from: ᩹ */
    public final C12255 f24064;

    public ViewOnClickListenerC8873(Main main, ViewGroup viewGroup) {
        super(LayoutInflater.from(main).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f24063 = main;
        this.f24061 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f24062 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f24064 = (C12255) this.itemView.findViewById(R.id.icon);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.MT_Protector);
        this.f24060 = progressBar;
        C12245 c12245 = new C12245(main);
        c12245.m28234(true);
        progressBar.setIndeterminateDrawable(c12245);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC5996 abstractC5996 = this.f24059;
        if (abstractC5996 == null) {
            return;
        }
        boolean zM13452 = abstractC5996.m13452();
        AbstractActivityC5549 abstractActivityC5549 = this.f24063;
        if (zM13452) {
            C18736 c18736M13473 = this.f24059.m13473();
            if (c18736M13473.m42772()) {
                c18736M13473.m42770(abstractActivityC5549);
                return;
            }
            return;
        }
        this.f24059.m13486(abstractActivityC5549);
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final void mo4017(AbstractC5996 abstractC5996) {
        boolean z;
        AbstractC5996 abstractC5997 = this.f24059;
        if (abstractC5997 != abstractC5996) {
            if (abstractC5997 != null) {
                abstractC5997.m13468().m4068((InterfaceC3326) this);
            }
            if (abstractC5996 != null) {
                abstractC5996.m13468().m4066(this.f24063, this);
            }
            this.f24059 = abstractC5996;
        }
        if (abstractC5996 == null) {
            return;
        }
        this.f24064.m28261(abstractC5996.mo5124());
        if (!abstractC5996.m13452()) {
            z = false;
        } else if (!abstractC5996.m13473().m42772()) {
            return;
        } else {
            z = true;
        }
        CharSequence charSequenceM13493 = abstractC5996.m13493();
        CharSequence charSequenceM13470 = abstractC5996.m13470();
        int iM13475 = abstractC5996.m13475();
        TextView textView = this.f24061;
        if (charSequenceM13493 != null) {
            textView.setText(abstractC5996.m13493());
        } else {
            textView.setText("...");
        }
        TextView textView2 = this.f24062;
        if (charSequenceM13470 == null) {
            if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2.getVisibility() != 0) {
                textView2.setVisibility(0);
            }
            if (charSequenceM13470.length() > 50) {
                textView2.setText(C8597.m20011(50, charSequenceM13470.toString()));
            } else {
                textView2.setText(charSequenceM13470);
            }
        }
        ProgressBar progressBar = this.f24060;
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
        if (iM13475 != -1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(iM13475);
        } else {
            progressBar.setIndeterminate(true);
        }
    }
}
