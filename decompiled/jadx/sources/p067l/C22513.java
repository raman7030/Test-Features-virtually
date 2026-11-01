package p067l;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩷᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes5.dex */
public final class C22513 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20856 f70986;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f70987;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ int f70988;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int f70989;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f70990;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ String f70991;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f70992;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f70993;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Set f70994;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f70995;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C11113 f70996;

    public C22513(int i, String str, boolean z, boolean z2, C11113 c11113, int i2, boolean z3, C20856 c20856, String str2, boolean z4, Set set) {
        this.f70989 = i;
        this.f70990 = str;
        this.f70987 = z;
        this.f70993 = z2;
        this.f70996 = c11113;
        this.f70988 = i2;
        this.f70992 = z3;
        this.f70986 = c20856;
        this.f70991 = str2;
        this.f70995 = z4;
        this.f70994 = set;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        boolean z = this.f70993;
        boolean z2 = this.f70987;
        String str = this.f70990;
        int i = this.f70989;
        if (i == 0) {
            return new C6395(9, C5275.m11399(str, z2, z));
        }
        final int i2 = this.f70988;
        final C11113 c11113 = this.f70996;
        if (i == 1) {
            return new InterfaceC9969() { // from class: l.ܿ᩺᩷
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    InterfaceC3736 interfaceC3736 = (InterfaceC3736) obj;
                    List<C25209> listM25632 = c11113.m25632(interfaceC3736.getPath());
                    String strMo7189 = interfaceC3736.mo7189();
                    if (listM25632 == null || strMo7189 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C25209 c25209 : listM25632) {
                        if (c25209.f80613 == 0 && c25209.f80612 == i2) {
                            C20699 c20699 = new C20699(0);
                            int i3 = c25209.f80614;
                            c20699.f63914 = i3;
                            int i4 = c25209.f80611;
                            c20699.f63915 = i4;
                            c20699.m46762(i3, i4, (CharSequence) strMo7189);
                            arrayList.add(c20699);
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
            final C16673 c16673M11399 = C5275.m11399(str, z2, z);
            final boolean z3 = this.f70992;
            return new InterfaceC9969() { // from class: l.ܳ᩺᩷
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    InterfaceC3736 interfaceC3736 = (InterfaceC3736) obj;
                    List<C25209> listM25632 = c11113.m25632(interfaceC3736.getPath());
                    String strMo7189 = interfaceC3736.mo7189();
                    if (listM25632 == null || strMo7189 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C25209 c25209 : listM25632) {
                        int i3 = c25209.f80613;
                        int i4 = c25209.f80611;
                        int i5 = c25209.f80614;
                        if (i3 == 1) {
                            C13929 c13929 = c16673M11399.get();
                            c13929.m56473reset((CharSequence) c25209.f80616);
                            if (z3) {
                                if (c13929.matches()) {
                                    C20699 c20699 = new C20699(0);
                                    c20699.f63914 = i5;
                                    c20699.f63915 = i4;
                                    c20699.m46762(i5, i4, (CharSequence) strMo7189);
                                    arrayList.add(c20699);
                                }
                            } else if (C7974.m18465(c13929)) {
                                C20699 c206910 = new C20699(0);
                                C11247 c11247 = new C11247();
                                try {
                                    c11247.m26108(strMo7189.substring(i5, i4));
                                    c206910.f63914 = c11247.m26107(c13929.start()) + i5;
                                    c206910.f63915 = c11247.m26107(c13929.end()) + i5;
                                } catch (Exception unused) {
                                    c206910.f63914 = i5;
                                    c206910.f63915 = i4;
                                }
                                c206910.m46762(c206910.f63914, c206910.f63915, (CharSequence) strMo7189);
                                arrayList.add(c206910);
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
            return new InterfaceC9969() { // from class: l.᩻᩺᩷
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    InterfaceC3736 interfaceC3736 = (InterfaceC3736) obj;
                    List<C25209> listM25632 = c11113.m25632(interfaceC3736.getPath());
                    String strMo7189 = interfaceC3736.mo7189();
                    if (listM25632 == null || strMo7189 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C25209 c25209 : listM25632) {
                        if (c25209.f80613 == 2 && c25209.f80612 == i2) {
                            C20699 c20699 = new C20699(0);
                            int i3 = c25209.f80614;
                            c20699.f63914 = i3;
                            int i4 = c25209.f80611;
                            c20699.f63915 = i4;
                            c20699.m46762(i3, i4, (CharSequence) strMo7189);
                            arrayList.add(c20699);
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
        return new InterfaceC9969() { // from class: l.ۜ᩺᩷
            @Override // p067l.InterfaceC9969
            public final List accept(Object obj) {
                InterfaceC3736 interfaceC3736 = (InterfaceC3736) obj;
                List<C25209> listM25632 = c11113.m25632(interfaceC3736.getPath());
                String strMo7189 = interfaceC3736.mo7189();
                if (listM25632 == null || strMo7189 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (C25209 c25209 : listM25632) {
                    if (c25209.f80613 == 3 && c25209.f80612 == i2) {
                        C20699 c20699 = new C20699(0);
                        int i3 = c25209.f80614;
                        c20699.f63914 = i3;
                        int i4 = c25209.f80611;
                        c20699.f63915 = i4;
                        c20699.m46762(i3, i4, (CharSequence) strMo7189);
                        arrayList.add(c20699);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
        };
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f70986.m47118(concurrentLinkedQueue, this.f70991, this.f70995, this.f70994);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263(this.f70991, this.f70990, arrayList);
    }
}
