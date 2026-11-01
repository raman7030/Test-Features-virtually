package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩻ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes2.dex */
public final class C24736 extends AbstractC12310 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f78307;

    /* JADX INFO: renamed from: ۬ */
    public int f78308;

    public C24736(C19372 c19372, C7972 c7972, C4263 c4263) {
        super(c19372, 0);
        this.f78307 = new ArrayList();
        this.f78308 = m28352(c7972, c4263);
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5207() {
        return this.f78308;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo5200() {
        return this.f78307.size();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo5206(int i) {
        return (C8445) this.f78307.get(i);
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo5202() {
        Collections.sort(this.f78307, new C14321());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54398(C8445 c8445) {
        int iMo4715;
        this.f78307.add(c8445);
        if (!c8445.mo4716() || (iMo4715 = c8445.mo4715() + 1) <= this.f78308) {
            return;
        }
        this.f78308 = iMo4715;
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo5198() {
        return (C24538) super.mo5198();
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo5203() {
        return (C19372) super.mo5203();
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public final C19372 mo5203() {
        return (C19372) super.mo5203();
    }
}
