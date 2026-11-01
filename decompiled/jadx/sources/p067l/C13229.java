package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۨۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8PT */
/* JADX INFO: loaded from: classes3.dex */
public final class C13229 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f37173;

    /* JADX INFO: renamed from: ۧ */
    public Looper f37174;

    /* JADX INFO: renamed from: ܳ */
    public int f37175;

    /* JADX INFO: renamed from: ܽ */
    public Object f37176;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7864 f37177;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11888 f37178;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m30281(boolean z) {
        notifyAll();
    }

    public C13229(InterfaceC11888 interfaceC11888, InterfaceC7864 interfaceC7864, AbstractC6974 abstractC6974, int i, C15849 c15849, Looper looper) {
        this.f37178 = interfaceC11888;
        this.f37177 = interfaceC7864;
        this.f37174 = looper;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7864 m30283() {
        return this.f37177;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30279(int i) {
        C23877.m52960(!this.f37173);
        this.f37175 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m30285() {
        return this.f37175;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30280(Object obj) {
        C23877.m52960(!this.f37173);
        this.f37176 = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m30282() {
        return this.f37176;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Looper m30278() {
        return this.f37174;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m30284() {
        C23877.m52960(!this.f37173);
        this.f37173 = true;
        ((C21315) this.f37178).m48317(this);
    }
}
