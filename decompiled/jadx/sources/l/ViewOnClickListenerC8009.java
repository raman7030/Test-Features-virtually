package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8009 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f24734;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15769 f24735;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f24736;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8009(C15063 c15063, View view) {
        super(view);
        this.f24734 = c15063;
        this.f24736 = (TextView) view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        C5187 c5187 = new C5187(this, (AbstractActivityC3346) this.f24734.requireActivity());
        c5187.m31270();
        c5187.m31258(R.string.MT_Protector);
        c5187.m31250((CharSequence) this.f24735.m37186());
        c5187.m31242();
        c5187.m31266(true);
    }
}
