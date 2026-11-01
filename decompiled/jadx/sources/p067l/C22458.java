package p067l;

import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩷᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74C */
/* JADX INFO: loaded from: classes5.dex */
public final class C22458 implements InterfaceC14230 {

    /* JADX INFO: renamed from: ֫ */
    public long f70848;

    /* JADX INFO: renamed from: ۧ */
    public final TreeSet f70849 = new TreeSet(new C9627(1));

    @Override // p067l.InterfaceC16911
    /* JADX INFO: renamed from: ֫ */
    public final void mo38483(C17762 c17762, C24288 c24288) {
        TreeSet treeSet = this.f70849;
        treeSet.add(c24288);
        this.f70848 += c24288.f76933;
        while (this.f70848 > 209715200 && !treeSet.isEmpty()) {
            c17762.m40359((C24288) treeSet.first());
        }
    }

    @Override // p067l.InterfaceC16911
    /* JADX INFO: renamed from: ֫ */
    public final void mo38485(C24288 c24288) {
        this.f70849.remove(c24288);
        this.f70848 -= c24288.f76933;
    }

    @Override // p067l.InterfaceC16911
    /* JADX INFO: renamed from: ֫ */
    public final void mo38484(C17762 c17762, C24288 c24288, C24288 c24289) {
        mo38485(c24288);
        mo38483(c17762, c24289);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50421(C17762 c17762, long j) {
        if (j != -1) {
            while (this.f70848 + j > 209715200) {
                TreeSet treeSet = this.f70849;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    c17762.m40359((C24288) treeSet.first());
                }
            }
        }
    }
}
