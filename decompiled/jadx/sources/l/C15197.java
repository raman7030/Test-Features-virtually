package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15197 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f46414;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15197(C16773 c16773) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f46414 = c16773;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        Intent intent = new Intent(c16560.m39056(), (Class<?>) ViewOnLayoutChangeListenerC7738.class);
        intent.putExtra("PATH", this.f46414.m39742());
        c16560.m39056().startActivity(intent);
    }
}
