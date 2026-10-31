package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C14056 extends AbstractViewOnTouchListenerC13909 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7707 f42481;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14056(C7707 c7707, View view) {
        super(view);
        this.f42481 = c7707;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9825 mo11585() {
        C1732 c1732 = this.f42481.f23814.f52899;
        if (c1732 == null) {
            return null;
        }
        return c1732.m42638();
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11586() {
        this.f42481.f23814.m40547();
        return true;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo33314() {
        C17254 c17254 = this.f42481.f23814;
        if (c17254.f52900 != null) {
            return false;
        }
        c17254.m40550();
        return true;
    }
}
