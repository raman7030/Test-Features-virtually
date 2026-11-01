package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20067 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20738 f60971;

    /* JADX INFO: renamed from: ᩸ */
    public C24760 f60972;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f60973;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20067(C20738 c20738, View view) {
        super(view);
        this.f60971 = c20738;
        this.f60973 = (TextView) view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        C4644 c4644 = new C4644(this, (AbstractActivityC5549) this.f60971.requireActivity());
        c4644.m33356();
        c4644.m33344(R.string.MT_Protector);
        c4644.m33336((CharSequence) this.f60972.m54427());
        c4644.m33328();
        c4644.m33352(true);
    }
}
