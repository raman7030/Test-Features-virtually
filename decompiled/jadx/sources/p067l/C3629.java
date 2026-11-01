package p067l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3629 implements InterfaceC15266 {

    /* JADX INFO: renamed from: ۗ */
    public final C17710 f7546;

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f7547;

    /* JADX INFO: renamed from: ᩶ */
    public final HashMap f7548;

    /* JADX INFO: renamed from: ᩸ */
    public final long[] f7549;

    /* JADX INFO: renamed from: ᩹ */
    public final Map f7550;

    public C3629(C17710 c17710, HashMap map, HashMap map2, HashMap map3) {
        this.f7546 = c17710;
        this.f7547 = map2;
        this.f7548 = map3;
        this.f7550 = C21562.unmodifiableMap(map);
        this.f7549 = c17710.m40258();
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6891(long j) {
        long[] jArr = this.f7549;
        int iM12988 = C5792.m12988(jArr, j, false);
        if (iM12988 < jArr.length) {
            return iM12988;
        }
        return -1;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6890() {
        return this.f7549.length;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final long mo6892(int i) {
        return this.f7549[i];
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ܽ */
    public final List mo6893(long j) {
        return this.f7546.m40254(j, this.f7550, this.f7547, this.f7548);
    }
}
