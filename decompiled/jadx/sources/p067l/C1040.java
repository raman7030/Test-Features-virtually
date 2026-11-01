package p067l;

import android.content.IntentFilter;

/* JADX INFO: renamed from: l.ۘܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1040 extends AbstractC0970 {

    /* JADX INFO: renamed from: ܽ */
    public final C1215 f15470;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f15471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110, C1215 c1215) {
        super(layoutInflaterFactory2C1110);
        this.f15471 = layoutInflaterFactory2C1110;
        this.f15470 = c1215;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m13957() {
        return this.f15470.m22136() ? 2 : 1;
    }

    @Override // p067l.AbstractC0970
    /* JADX INFO: renamed from: ܽ */
    public final void mo10219() {
        this.f15471.mo17367();
    }

    @Override // p067l.AbstractC0970
    /* JADX INFO: renamed from: ۧ */
    public final IntentFilter mo10218() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
