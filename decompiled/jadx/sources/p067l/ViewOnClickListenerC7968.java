package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7968 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C16408 f20944;

    /* JADX INFO: renamed from: ۙ */
    public TextView f20945;

    /* JADX INFO: renamed from: ᩶ */
    public C20699 f20946;

    /* JADX INFO: renamed from: ᩸ */
    public C7287 f20947;

    /* JADX INFO: renamed from: ᩹ */
    public int f20948;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC7968(C16408 c16408, View view) {
        super(view);
        this.f20944 = c16408;
        this.f20945 = (TextView) view.findViewById(R.id.textView);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16408 c16408 = this.f20944;
        if ((c16408.f48224 == null || c16408.f48224.m32119(this.f20947.f19021)) && !C15556.f44442.m24763()) {
            ((ActivityC18686) c16408.requireActivity()).m42588(this.f20947.f19021, this.f20946);
            c16408.f48224.m32087(this.f20947.f19021);
            if (((C3263) c16408.f48226.peek()).f6342.add(this.f20947.f19021 + " " + this.f20948)) {
                C7050.m16213(new RunnableC4418(1, this), 200L);
            }
        }
    }
}
