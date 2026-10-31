package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7855 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16687 f24344;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24345;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15615 f24346;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8743 f24347;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24348;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 f24349;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24350;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24351;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20216 f24352;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23377 f24353;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24354;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f24355;

    public C7855(ArrayList arrayList, C15615 c15615, InterfaceC19145 interfaceC19145, C23377 c23377, int i, C8743 c8743, InterfaceC16687 interfaceC16687, AbstractC20216 abstractC20216, int i2, int i3, int i4) {
        this.f24345 = arrayList;
        this.f24353 = c23377;
        this.f24346 = c15615;
        this.f24349 = interfaceC19145;
        this.f24355 = i;
        this.f24347 = c8743;
        this.f24344 = interfaceC16687;
        this.f24352 = abstractC20216;
        this.f24351 = i2;
        this.f24354 = i3;
        this.f24350 = i4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23377 m21041() {
        return this.f24353;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21039() {
        return this.f24351;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m21040() {
        return this.f24354;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21044() {
        return this.f24350;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15615 m21038() {
        return this.f24346;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 m21042() {
        return this.f24349;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16687 m21035() {
        return this.f24344;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC20216 m21043() {
        return this.f24352;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8743 m21045() {
        return this.f24347;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m21036(C8743 c8743) {
        return m21037(c8743, this.f24346, this.f24349, this.f24353);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m21037(C8743 c8743, C15615 c15615, InterfaceC19145 interfaceC19145, C23377 c23377) {
        ArrayList arrayList = this.f24345;
        int size = arrayList.size();
        int i = this.f24355;
        if (i >= size) {
            throw new AssertionError();
        }
        this.f24348++;
        InterfaceC19145 interfaceC19146 = this.f24349;
        if (interfaceC19146 != null && !this.f24353.m51824(c8743.m22622())) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (interfaceC19146 != null && this.f24348 > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        C7855 c7855 = new C7855(arrayList, c15615, interfaceC19145, c23377, i2, c8743, this.f24344, this.f24352, this.f24351, this.f24354, this.f24350);
        InterfaceC23037 interfaceC23037 = (InterfaceC23037) arrayList.get(i);
        C18621 c18621Mo7384 = interfaceC23037.mo7384(c7855);
        if (interfaceC19145 != null && i2 < arrayList.size() && c7855.f24348 != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC23037 + " must call proceed() exactly once");
        }
        if (c18621Mo7384 == null) {
            throw new NullPointerException("interceptor " + interfaceC23037 + " returned null");
        }
        if (c18621Mo7384.m43170() != null) {
            return c18621Mo7384;
        }
        throw new IllegalStateException("interceptor " + interfaceC23037 + " returned a response with no body");
    }
}
