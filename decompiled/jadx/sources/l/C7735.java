package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7735 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18340 f23934;

    public C7735(C18340 c18340) {
        this.f23934 = c18340;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC16928) abstractC3255).m39772(i);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC16928(this.f23934, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f23934.size();
    }
}
