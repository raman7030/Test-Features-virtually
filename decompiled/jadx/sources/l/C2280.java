package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes2.dex */
public class C2280 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22036 f7374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7375 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22036 f7376;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4397 f7377;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4356 f7378;

    public C2280(C3691 c3691, C4356 c4356) {
        this.f7378 = c4356;
        this.f7377 = c3691.f11644;
        C22036 c22036 = C4397.f14081;
        this.f7374 = c22036;
        this.f7376 = c22036;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22036 m7520(int i) {
        if (i == 0) {
            return this.f7376;
        }
        ArrayList arrayList = this.f7375;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(this.f7378.m13068());
        }
        return (C22036) arrayList.get(i - 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22036 m7523() {
        return this.f7374;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7521() {
        this.f7374 = this.f7376;
        ArrayList arrayList = this.f7375;
        if (!arrayList.isEmpty()) {
            this.f7376 = (C22036) arrayList.remove(0);
        } else {
            this.f7376 = this.f7378.m13068();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22036 m7522() {
        C22036 c22036 = this.f7376;
        int i = c22036.f70641;
        EnumC19920 enumC19920 = c22036.f70640;
        if (enumC19920.f64482.length() < 2 || enumC19920.f64483 != EnumC21331.DEFAULT) {
            throw new AssertionError("Cant split" + enumC19920);
        }
        String strSubstring = enumC19920.f64482.substring(0, 1);
        C4397 c4397 = this.f7377;
        EnumC19920 enumC19920M13124 = c4397.m13124(strSubstring);
        EnumC19920 enumC19920M13125 = c4397.m13124(enumC19920.f64482.substring(1));
        if (enumC19920M13124 == null || enumC19920M13125 == null) {
            throw new AssertionError("Cant split - bad subtokens");
        }
        C22036[] c22036Arr = {new C22036(enumC19920M13124, i, enumC19920M13124.f64482.length() + i, c22036.f70638), new C22036(enumC19920M13125, enumC19920M13124.f64482.length() + i, c22036.f70639, null)};
        this.f7374 = c22036Arr[0];
        C22036 c22037 = c22036Arr[1];
        this.f7376 = c22037;
        return c22037;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13896 m7519() {
        return this.f7378.mo13069();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7517() {
        return this.f7378.f14006;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7518(int i) {
        this.f7378.f14006 = i;
    }
}
