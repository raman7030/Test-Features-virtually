package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9980 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16684 f27648;

    /* JADX INFO: renamed from: ᩸ */
    public C17355 f27649;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f27650;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC9980(C16684 c16684, View view) {
        super(view);
        this.f27648 = c16684;
        this.f27650 = (TextView) view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        C7298 c7298 = new C7298(this, (AbstractActivityC5549) this.f27648.requireActivity());
        c7298.m33356();
        c7298.m33344(R.string.MT_Protector);
        c7298.m33336((CharSequence) this.f27649.m39356());
        c7298.m33328();
        c7298.m33352(true);
    }
}
