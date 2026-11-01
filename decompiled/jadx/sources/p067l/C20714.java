package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20714 extends AbstractC12310 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f63943;

    /* JADX INFO: renamed from: ۬ */
    public int f63944;

    public C20714(C20043 c20043, C7972 c7972, C4263 c4263) {
        super(c20043, 0);
        this.f63943 = new ArrayList();
        this.f63944 = m28352(c7972, c4263);
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5207() {
        return this.f63944;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo5200() {
        return this.f63943.size();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo5206(int i) {
        return (C10655) this.f63943.get(i);
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo5202() {
        Collections.sort(this.f63943, new C14321());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46789(C10655 c10655) {
        int iMo4715;
        this.f63943.add(c10655);
        if (!c10655.mo4716() || (iMo4715 = c10655.mo4715() + 1) <= this.f63944) {
            return;
        }
        this.f63944 = iMo4715;
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo5198() {
        return (C7302) super.mo5198();
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo5203() {
        return (C20043) super.mo5203();
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public final C20043 mo5203() {
        return (C20043) super.mo5203();
    }
}
