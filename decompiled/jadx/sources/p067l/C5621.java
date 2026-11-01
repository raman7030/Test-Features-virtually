package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8I6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5621 implements InterfaceC15266 {

    /* JADX INFO: renamed from: ᩸ */
    public final List f13606;

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6890() {
        return 1;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6891(long j) {
        return j < 0 ? 0 : -1;
    }

    public C5621(List list) {
        this.f13606 = list;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final long mo6892(int i) {
        C23877.m52957(i == 0);
        return 0L;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ܽ */
    public final List mo6893(long j) {
        return j >= 0 ? this.f13606 : Collections.EMPTY_LIST;
    }
}
