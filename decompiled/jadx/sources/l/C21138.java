package l;

import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩷᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74C */
/* JADX INFO: loaded from: classes5.dex */
public final class C21138 implements InterfaceC12481 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f68166;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TreeSet f68167 = new TreeSet(new C7637(1));

    @Override // l.InterfaceC15302
    /* JADX INFO: renamed from: ֫ */
    public final void mo36321(C16197 c16197, C23064 c23064) {
        TreeSet treeSet = this.f68167;
        treeSet.add(c23064);
        this.f68166 += c23064.f74188;
        while (this.f68166 > 209715200 && !treeSet.isEmpty()) {
            c16197.m38147((C23064) treeSet.first());
        }
    }

    @Override // l.InterfaceC15302
    /* JADX INFO: renamed from: ֫ */
    public final void mo36323(C23064 c23064) {
        this.f68167.remove(c23064);
        this.f68166 -= c23064.f74188;
    }

    @Override // l.InterfaceC15302
    /* JADX INFO: renamed from: ֫ */
    public final void mo36322(C16197 c16197, C23064 c23064, C23064 c23065) {
        mo36323(c23064);
        mo36321(c16197, c23065);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48091(C16197 c16197, long j) {
        if (j != -1) {
            while (this.f68166 + j > 209715200) {
                TreeSet treeSet = this.f68167;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    c16197.m38147((C23064) treeSet.first());
                }
            }
        }
    }
}
