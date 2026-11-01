package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3778 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f8089;

    /* JADX INFO: renamed from: ۜ */
    public final int f8090;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f8091;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f8092;

    /* JADX INFO: renamed from: ܳ */
    public final HashSet f8093;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC7920 f8094;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC24013 f8095;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f8096;

    /* JADX INFO: renamed from: ᩷ */
    public final int f8097;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f8098;

    public C3778(C15295 c15295) {
        this.f8089 = C21055.m47496(c15295.f43652, c15295.f43658);
        InterfaceC24013 interfaceC24013M34813 = C15295.m34813(c15295);
        this.f8095 = interfaceC24013M34813;
        this.f8091 = c15295.f43654;
        ArrayList arrayList = c15295.f43659;
        this.f8096 = arrayList;
        ArrayList arrayList2 = c15295.f43656;
        this.f8092 = arrayList2;
        ArrayList arrayList3 = c15295.f43653;
        this.f8098 = arrayList3;
        HashSet hashSet = c15295.f43662;
        this.f8093 = hashSet;
        this.f8094 = c15295.f43660;
        this.f8097 = c15295.f43655;
        int i = c15295.f43661;
        this.f8090 = i;
        interfaceC24013M34813.mo34265(new C6972(arrayList, arrayList2, arrayList3, hashSet, i, new C10996(0)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2555 m7387(String str) {
        C12826.requireNonNull(str, "input must not be null");
        AbstractC2555 abstractC2555M47507 = new C21055(this.f8089, this.f8095, this.f8096, this.f8092, this.f8098, this.f8093, this.f8094, this.f8097, this.f8090).m47507(str);
        Iterator it = this.f8091.iterator();
        while (it.hasNext()) {
            abstractC2555M47507 = ((InterfaceC12496) it.next()).mo28786(abstractC2555M47507);
        }
        return abstractC2555M47507;
    }
}
