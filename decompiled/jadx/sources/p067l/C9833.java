package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9833 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18228 f27260;

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f27261;

    /* JADX INFO: renamed from: ۡ */
    public final C17208 f27262;

    /* JADX INFO: renamed from: ۢ */
    public final C10678 f27263;

    /* JADX INFO: renamed from: ۧ */
    public int f27264;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20563 f27265;

    /* JADX INFO: renamed from: ܺ */
    public final int f27266;

    /* JADX INFO: renamed from: ܽ */
    public final int f27267;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21582 f27268;

    /* JADX INFO: renamed from: ᩳ */
    public final C24585 f27269;

    /* JADX INFO: renamed from: ᩷ */
    public final int f27270;

    /* JADX INFO: renamed from: ᩻ */
    public final int f27271;

    public C9833(ArrayList arrayList, C17208 c17208, InterfaceC20563 interfaceC20563, C24585 c24585, int i, C10678 c10678, InterfaceC18228 interfaceC18228, AbstractC21582 abstractC21582, int i2, int i3, int i4) {
        this.f27261 = arrayList;
        this.f27269 = c24585;
        this.f27262 = c17208;
        this.f27265 = interfaceC20563;
        this.f27271 = i;
        this.f27263 = c10678;
        this.f27260 = interfaceC18228;
        this.f27268 = abstractC21582;
        this.f27267 = i2;
        this.f27270 = i3;
        this.f27266 = i4;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24585 m23006() {
        return this.f27269;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m23004() {
        return this.f27267;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m23005() {
        return this.f27270;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m23009() {
        return this.f27266;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C17208 m23003() {
        return this.f27262;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC20563 m23007() {
        return this.f27265;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18228 m23000() {
        return this.f27260;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC21582 m23008() {
        return this.f27268;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C10678 m23010() {
        return this.f27263;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20066 m23001(C10678 c10678) {
        return m23002(c10678, this.f27262, this.f27265, this.f27269);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20066 m23002(C10678 c10678, C17208 c17208, InterfaceC20563 interfaceC20563, C24585 c24585) {
        ArrayList arrayList = this.f27261;
        int size = arrayList.size();
        int i = this.f27271;
        if (i >= size) {
            throw new AssertionError();
        }
        this.f27264++;
        InterfaceC20563 interfaceC20564 = this.f27265;
        if (interfaceC20564 != null && !this.f27269.m54221(c10678.m24591())) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (interfaceC20564 != null && this.f27264 > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        C9833 c9833 = new C9833(arrayList, c17208, interfaceC20563, c24585, i2, c10678, this.f27260, this.f27268, this.f27267, this.f27270, this.f27266);
        InterfaceC24263 interfaceC24263 = (InterfaceC24263) arrayList.get(i);
        C20066 c20066Mo9467 = interfaceC24263.mo9467(c9833);
        if (interfaceC20563 != null && i2 < arrayList.size() && c9833.f27264 != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC24263 + " must call proceed() exactly once");
        }
        if (c20066Mo9467 == null) {
            throw new NullPointerException("interceptor " + interfaceC24263 + " returned null");
        }
        if (c20066Mo9467.m45436() != null) {
            return c20066Mo9467;
        }
        throw new IllegalStateException("interceptor " + interfaceC24263 + " returned a response with no body");
    }
}
