package p067l;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.ۡܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1285 extends AbstractC0970 {

    /* JADX INFO: renamed from: ܽ */
    public final PowerManager f30086;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f30087;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110, Context context) {
        super(layoutInflaterFactory2C1110);
        this.f30087 = layoutInflaterFactory2C1110;
        this.f30086 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m25010() {
        return C1705.m43005(this.f30086) ? 2 : 1;
    }

    @Override // p067l.AbstractC0970
    /* JADX INFO: renamed from: ܽ */
    public final void mo10219() {
        this.f30087.mo17367();
    }

    @Override // p067l.AbstractC0970
    /* JADX INFO: renamed from: ۧ */
    public final IntentFilter mo10218() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
