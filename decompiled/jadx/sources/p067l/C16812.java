package p067l;

import android.content.Intent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16812 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C18310 f49539;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16812(C18310 c18310) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f49539 = c18310;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        Intent intent = new Intent(c18107.m41282(), (Class<?>) ViewOnLayoutChangeListenerC9723.class);
        intent.putExtra("PATH", this.f49539.m41983());
        c18107.m41282().startActivity(intent);
    }
}
