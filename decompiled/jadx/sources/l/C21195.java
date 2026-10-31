package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩷᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21195 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19452 f68303;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68304;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68305;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68306;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f68307;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f68308;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68309;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68310;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f68311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f68312;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9200 f68313;

    public C21195(int i, String str, boolean z, boolean z2, C9200 c9200, int i2, boolean z3, C19452 c19452, String str2, boolean z4, Set set) {
        this.f68306 = i;
        this.f68307 = str;
        this.f68304 = z;
        this.f68310 = z2;
        this.f68313 = c9200;
        this.f68305 = i2;
        this.f68309 = z3;
        this.f68303 = c19452;
        this.f68308 = str2;
        this.f68312 = z4;
        this.f68311 = set;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        boolean z = this.f68310;
        boolean z2 = this.f68304;
        String str = this.f68307;
        int i = this.f68306;
        if (i == 0) {
            return new C4236(9, C3058.m9357(str, z2, z));
        }
        final int i2 = this.f68305;
        final C9200 c9200 = this.f68313;
        if (i == 1) {
            return new InterfaceC7997() { // from class: l.ܿ᩺᩷
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    InterfaceC1438 interfaceC1438 = (InterfaceC1438) obj;
                    List<C24032> listM23633 = c9200.m23633(interfaceC1438.getPath());
                    String strMo4946 = interfaceC1438.mo4946();
                    if (listM23633 == null || strMo4946 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C24032 c24032 : listM23633) {
                        if (c24032.f77861 == 0 && c24032.f77860 == i2) {
                            C19287 c19287 = new C19287(0);
                            int i3 = c24032.f77862;
                            c19287.f60684 = i3;
                            int i4 = c24032.f77859;
                            c19287.f60685 = i4;
                            c19287.m44468(i3, i4, (CharSequence) strMo4946);
                            arrayList.add(c19287);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i == 2) {
            final C15051 c15051M9357 = C3058.m9357(str, z2, z);
            final boolean z3 = this.f68309;
            return new InterfaceC7997() { // from class: l.ܳ᩺᩷
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    InterfaceC1438 interfaceC1438 = (InterfaceC1438) obj;
                    List<C24032> listM23633 = c9200.m23633(interfaceC1438.getPath());
                    String strMo4946 = interfaceC1438.mo4946();
                    if (listM23633 == null || strMo4946 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C24032 c24032 : listM23633) {
                        int i3 = c24032.f77861;
                        int i4 = c24032.f77859;
                        int i5 = c24032.f77862;
                        if (i3 == 1) {
                            C12164 c12164 = c15051M9357.get();
                            c12164.m29615reset((CharSequence) c24032.f77864);
                            if (z3) {
                                if (c12164.matches()) {
                                    C19287 c19287 = new C19287(0);
                                    c19287.f60684 = i5;
                                    c19287.f60685 = i4;
                                    c19287.m44468(i5, i4, (CharSequence) strMo4946);
                                    arrayList.add(c19287);
                                }
                            } else if (C5898.m16539(c12164)) {
                                C19287 c19288 = new C19287(0);
                                C9342 c9342 = new C9342();
                                try {
                                    c9342.m24099(strMo4946.substring(i5, i4));
                                    c19288.f60684 = c9342.m24098(c12164.start()) + i5;
                                    c19288.f60685 = c9342.m24098(c12164.end()) + i5;
                                } catch (Exception unused) {
                                    c19288.f60684 = i5;
                                    c19288.f60685 = i4;
                                }
                                c19288.m44468(c19288.f60684, c19288.f60685, (CharSequence) strMo4946);
                                arrayList.add(c19288);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i == 3) {
            return new InterfaceC7997() { // from class: l.᩻᩺᩷
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    InterfaceC1438 interfaceC1438 = (InterfaceC1438) obj;
                    List<C24032> listM23633 = c9200.m23633(interfaceC1438.getPath());
                    String strMo4946 = interfaceC1438.mo4946();
                    if (listM23633 == null || strMo4946 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C24032 c24032 : listM23633) {
                        if (c24032.f77861 == 2 && c24032.f77860 == i2) {
                            C19287 c19287 = new C19287(0);
                            int i3 = c24032.f77862;
                            c19287.f60684 = i3;
                            int i4 = c24032.f77859;
                            c19287.f60685 = i4;
                            c19287.m44468(i3, i4, (CharSequence) strMo4946);
                            arrayList.add(c19287);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i != 4) {
            return null;
        }
        return new InterfaceC7997() { // from class: l.ۜ᩺᩷
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                InterfaceC1438 interfaceC1438 = (InterfaceC1438) obj;
                List<C24032> listM23633 = c9200.m23633(interfaceC1438.getPath());
                String strMo4946 = interfaceC1438.mo4946();
                if (listM23633 == null || strMo4946 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (C24032 c24032 : listM23633) {
                    if (c24032.f77861 == 3 && c24032.f77860 == i2) {
                        C19287 c19287 = new C19287(0);
                        int i3 = c24032.f77862;
                        c19287.f60684 = i3;
                        int i4 = c24032.f77859;
                        c19287.f60685 = i4;
                        c19287.m44468(i3, i4, (CharSequence) strMo4946);
                        arrayList.add(c19287);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
        };
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f68303.m44822(concurrentLinkedQueue, this.f68308, this.f68312, this.f68311);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941(this.f68308, this.f68307, arrayList);
    }
}
