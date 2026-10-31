package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4737 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11277 f15024;

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("tar");
        List listM7909 = c2450.m7909();
        this.f15024 = new C11277(c2450.m7921(), listM7909);
        if (listM7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            if (interfaceC17889.isDirectory()) {
                this.f15024.m27891(interfaceC17889);
                return;
            } else {
                this.f15024.m27890(interfaceC17889);
                return;
            }
        }
        this.f15024.m27889(c2450.m7925());
    }
}
