package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ᩳ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17725 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7225 f54219 = C7225.m19318(15360, 0, true, false);

    /* JADX WARN: Code duplicated, block: B:182:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x001c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m41509(C5855 c5855) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C16313(c5855));
        C7225 c7225 = C7225.f22115;
        C7225 c7225M41508 = c7225;
        while (!arrayList.isEmpty()) {
            C16313 c16313 = (C16313) C18566.m43105(arrayList, 1);
            C5855 c5856 = c16313.f50226;
            int i = c16313.f50230;
            if (i == 0) {
                C7225 c7225M41510 = C7225.f22116;
                if (c5856 != null && c5856 != C14403.f44164 && !(c5856 instanceof C15026) && !(c5856 instanceof C19967)) {
                    if (identityHashMap2.containsKey(c5856)) {
                        c7225M41508 = (C7225) identityHashMap2.get(c5856);
                    } else {
                        if (!identityHashMap.containsKey(c5856)) {
                            identityHashMap.put(c5856, Boolean.TRUE);
                            c16313.f50227 = true;
                            if (c5856.getClass() != C5855.class) {
                                if (c5856 instanceof C2203) {
                                    C2203 c2203 = (C2203) c5856;
                                    if (c2203.f7231.length == 0) {
                                        c16313.f50230 = 1;
                                        arrayList.add(new C16313(c5856.f17958));
                                    } else {
                                        c7225M41508 = m41508(c2203);
                                    }
                                } else if (c5856 instanceof C23494) {
                                    c7225M41508 = m41510(((C23494) c5856).f75432);
                                } else if (c5856 instanceof C22083) {
                                    c7225M41508 = f54219;
                                } else if (c5856 instanceof C17226) {
                                    c7225M41508 = C7225.m19318(-1L, -1L, true, false);
                                } else if (c5856 instanceof C6561) {
                                    C6561 c6561 = (C6561) c5856;
                                    c7225M41510 = m41510(c6561.f20243);
                                    if (c6561.f20242 <= 0) {
                                        c16313.f50228 = c7225M41510;
                                        c16313.f50230 = 2;
                                        arrayList.add(new C16313(c5856.f17958));
                                        c7225M41508 = c7225M41510;
                                    }
                                } else {
                                    if (c5856 instanceof C20673) {
                                        C20673 c20673 = (C20673) c5856;
                                        c16313.f50229 = c20673.f66618 > 0;
                                        int i2 = c20673.f66616;
                                        c16313.f50230 = i2 != 0 ? 3 : 1;
                                        arrayList.add(new C16313(i2 == 0 ? c20673.f17958 : c20673.f66615));
                                    } else if (c5856 instanceof C0210) {
                                        C0210 c0210 = (C0210) c5856;
                                        c16313.f50229 = c0210.f1462 > 0;
                                        int i3 = c0210.f1463;
                                        c16313.f50230 = i3 != 0 ? 3 : 1;
                                        arrayList.add(new C16313(i3 == 0 ? c0210.f17958 : c0210.f1459));
                                    } else if (c5856 instanceof C10670) {
                                        C10670 c10670 = (C10670) c5856;
                                        c16313.f50229 = c10670.f32086 == EnumC1497.INDEPENDENT;
                                        c16313.f50230 = 3;
                                        arrayList.add(new C16313(c10670.f32085));
                                    } else if (c5856 instanceof C11355) {
                                        C11355 c11355 = (C11355) c5856;
                                        int i4 = c11355.f33990;
                                        C7225 c7226 = C7225.f22117;
                                        if (i4 > 0) {
                                            c16313.f50228 = c7226;
                                            c16313.f50230 = 4;
                                            C5855 c5857 = c11355.f33989[0];
                                            if (c5857 == null) {
                                                c5857 = c11355.f33991.f17958;
                                            }
                                            if (c5857 instanceof C9259) {
                                                C9259 c9259 = (C9259) c5857;
                                                if (c9259.f7231.length > 0) {
                                                    c7225M41508 = m41508((C2203) c9259);
                                                }
                                            }
                                            arrayList.add(new C16313(c5857));
                                            c7225M41508 = c7226;
                                        } else {
                                            c7225M41508 = c7226;
                                        }
                                    } else if ((c5856 instanceof C17932) || (c5856 instanceof C5004) || (c5856 instanceof C7121) || (c5856 instanceof C7142) || (c5856 instanceof C2328) || (c5856 instanceof C9384) || (c5856 instanceof C1704) || (c5856 instanceof C5150) || (c5856 instanceof C0916) || (c5856 instanceof C22643) || (c5856 instanceof C13615) || (c5856 instanceof C10089) || (c5856 instanceof C0770) || (c5856 instanceof C11500) || (c5856 instanceof C5710)) {
                                        c16313.f50230 = 1;
                                        arrayList.add(new C16313(c5856.f17958));
                                    }
                                }
                            }
                        }
                        c7225M41508 = c7225;
                    }
                    C18473.m42953(arrayList, 1);
                    if (c16313.f50227) {
                        identityHashMap.remove(c5856);
                        identityHashMap2.put(c5856, c7225M41508);
                    }
                }
                c7225M41508 = c7225M41510;
                C18473.m42953(arrayList, 1);
                if (c16313.f50227) {
                    identityHashMap.remove(c5856);
                    identityHashMap2.put(c5856, c7225M41508);
                }
            } else {
                if (i == 2) {
                    c7225M41508 = c16313.f50228.m19320(c7225M41508);
                } else if (i == 3) {
                    if (!c7225M41508.m19326()) {
                        if (!c16313.f50229 || c7225M41508.m19327()) {
                            c16313.f50228 = c7225M41508.m19328();
                            c16313.f50230 = 2;
                            arrayList.add(new C16313(c5856.f17958));
                        } else {
                            c7225M41508 = c7225M41508.m19328();
                        }
                    }
                } else if (i == 4) {
                    c7225M41508 = c16313.f50228.m19320(c7225M41508);
                    C11355 c11356 = (C11355) c5856;
                    if (!c7225M41508.m19326()) {
                        int i5 = c16313.f50225 + 1;
                        c16313.f50225 = i5;
                        if (i5 < c11356.f33990) {
                            c16313.f50228 = c7225M41508;
                            C5855 c5858 = c11356.f33989[i5];
                            if (c5858 == null) {
                                c5858 = c11356.f33991.f17958;
                            }
                            if (c5858 instanceof C9259) {
                                C9259 c92510 = (C9259) c5858;
                                if (c92510.f7231.length > 0) {
                                    c7225M41508 = m41508((C2203) c92510);
                                }
                            }
                            arrayList.add(new C16313(c5858));
                        }
                    }
                }
                C18473.m42953(arrayList, 1);
                if (c16313.f50227) {
                    identityHashMap.remove(c5856);
                    identityHashMap2.put(c5856, c7225M41508);
                }
            }
        }
        return c7225M41508;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0077  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m41508(C2203 c2203) {
        boolean z = c2203 instanceof C9259;
        boolean z2 = (c2203 instanceof C8553) || (c2203 instanceof C15607);
        boolean z3 = (c2203 instanceof C18431) || (c2203 instanceof C19137);
        if (!z && !z2 && !z3) {
            return C7225.f22115;
        }
        int i = c2203.f7231[0];
        long j = 0;
        if (z) {
            long j2 = (i < 0 || i >= 64) ? 0L : 1 << i;
            if (i >= 64 && i < 128) {
                j = 1 << (i - 64);
            }
            return C7225.m19318(j2, j, i >= 128, false);
        }
        long j3 = 0;
        long j4 = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            if (z3) {
                if (i == i2 || i == C3395.m10356(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (z2) {
                if (i == i2 || i == C22165.m49804(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (i == i2) {
                if (i2 < 64) {
                    j3 = (1 << i2) | j3;
                } else {
                    j4 = (1 << (i2 - 64)) | j4;
                }
            }
        }
        return C7225.m19318(j3, j4, !z || i >= 128, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m41510(InterfaceC10795 interfaceC10795) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 128; i++) {
            if (interfaceC10795.mo2465(i)) {
                if (i < 64) {
                    j = (1 << i) | j;
                } else {
                    j2 = (1 << (i - 64)) | j2;
                }
            }
        }
        return C7225.m19318(j, j2, true, false);
    }
}
