package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C18968 extends AbstractC12961 {

    /* JADX INFO: renamed from: ᩸ */
    public final C23198[] f56564;

    /* JADX INFO: renamed from: ᩹ */
    public final String f56565;

    @Override // p067l.InterfaceC5763
    public final int[] getStyle() {
        return null;
    }

    public C18968(String str, C23198[] c23198Arr) {
        this.f56565 = str;
        this.f56564 = (C23198[]) Arrays.copyOf(c23198Arr, c23198Arr.length);
    }

    @Override // p067l.InterfaceC5763
    public final String getValue() {
        return this.f56565;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩶֫ */
    public final C23198[] mo12360() {
        C23198[] c23198Arr = this.f56564;
        if (c23198Arr == null) {
            return null;
        }
        return (C23198[]) Arrays.copyOf(c23198Arr, c23198Arr.length);
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ܰ֫ */
    public final C23198[] mo12358() {
        return m29718(mo12360());
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩺֫ */
    public final boolean mo12361() {
        C23198[] c23198Arr = this.f56564;
        return c23198Arr != null && c23198Arr.length > 0;
    }
}
