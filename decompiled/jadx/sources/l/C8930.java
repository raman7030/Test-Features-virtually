package l;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8930 extends AbstractC2580 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PowerManager f27151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f27152;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8930(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402, Context context) {
        super(layoutInflaterFactory2C5402);
        this.f27152 = layoutInflaterFactory2C5402;
        this.f27151 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m23036() {
        return C17396.m40748(this.f27151) ? 2 : 1;
    }

    @Override // l.AbstractC2580
    /* JADX INFO: renamed from: ܽ */
    public final void mo8180() {
        this.f27152.mo15456();
    }

    @Override // l.AbstractC2580
    /* JADX INFO: renamed from: ۧ */
    public final IntentFilter mo8179() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
