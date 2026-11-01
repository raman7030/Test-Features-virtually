package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ᩷ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C1539 extends AbstractViewOnTouchListenerC1532 {

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C1224 f45567;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539(C1224 c1224, View view) {
        super(view);
        this.f45567 = c1224;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1329 mo13521() {
        C0928 c0928 = this.f45567.f26728.f56081;
        if (c0928 == null) {
            return null;
        }
        return c0928.m44898();
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13522() {
        this.f45567.f26728.m42796();
        return true;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo35433() {
        C1698 c1698 = this.f45567.f26728;
        if (c1698.f56082 != null) {
            return false;
        }
        c1698.m42799();
        return true;
    }
}
