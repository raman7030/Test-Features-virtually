package p067l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4660 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final TextView f10474;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C6001 f10475;

    /* JADX INFO: renamed from: ᩸ */
    public C10695 f10476;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f10477;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4660(C6001 c6001, View view) {
        super(view);
        this.f10475 = c6001;
        this.f10474 = (TextView) view.findViewById(R.id.textView1);
        this.f10477 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6001 c6001 = this.f10475;
        InterfaceC17399 interfaceC17399 = c6001.f15048;
        C7816 c7816 = c6001.f15043;
        C10695 c10695 = this.f10476;
        interfaceC17399.mo7949(c7816, c10695.f29635, c10695.f29636);
        c6001.f15045.dismiss();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C6001 c6001 = this.f10475;
        InterfaceC17399 interfaceC17399 = c6001.f15048;
        C7816 c7816 = c6001.f15043;
        C10695 c10695 = this.f10476;
        interfaceC17399.mo7948(view, c7816, c10695.f29635, c10695.f29636);
        return true;
    }
}
