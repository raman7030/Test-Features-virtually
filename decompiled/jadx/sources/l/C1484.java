package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1484 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f5316;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f5317;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5318;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5319;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f5320;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC5842 f5321;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22775 f5322;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5324;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f5325;

    public C1484(C13602 c13602) {
        this.f5316 = C19662.m45199(c13602.f40574, c13602.f40580);
        InterfaceC22775 interfaceC22775M32701 = C13602.m32701(c13602);
        this.f5322 = interfaceC22775M32701;
        this.f5318 = c13602.f40576;
        ArrayList arrayList = c13602.f40581;
        this.f5323 = arrayList;
        ArrayList arrayList2 = c13602.f40578;
        this.f5319 = arrayList2;
        ArrayList arrayList3 = c13602.f40575;
        this.f5325 = arrayList3;
        HashSet hashSet = c13602.f40584;
        this.f5320 = hashSet;
        this.f5321 = c13602.f40582;
        this.f5324 = c13602.f40577;
        int i = c13602.f40583;
        this.f5317 = i;
        interfaceC22775M32701.mo32166(new C4844(arrayList, arrayList2, arrayList3, hashSet, i, new C9078(0)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m5145(String str) {
        C11003.requireNonNull(str, "input must not be null");
        AbstractC0197 abstractC0197M45210 = new C19662(this.f5316, this.f5322, this.f5323, this.f5319, this.f5325, this.f5320, this.f5321, this.f5324, this.f5317).m45210(str);
        Iterator it = this.f5318.iterator();
        while (it.hasNext()) {
            abstractC0197M45210 = ((InterfaceC10657) it.next()).mo26747(abstractC0197M45210);
        }
        return abstractC0197M45210;
    }
}
