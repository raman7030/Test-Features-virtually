package p067l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ᩳ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C19214 {

    /* JADX INFO: renamed from: ֫ */
    public static final C9235 f57410 = C9235.m21267(15360, 0, true, false);

    /* JADX WARN: Code duplicated, block: B:182:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x001c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C9235 m43755(C7933 c7933) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17872(c7933));
        C9235 c9235 = C9235.f24999;
        C9235 c9235M43754 = c9235;
        while (!arrayList.isEmpty()) {
            C17872 c17872 = (C17872) C20013.m45383(arrayList, 1);
            C7933 c7934 = c17872.f53393;
            int i = c17872.f53397;
            if (i == 0) {
                C9235 c9235M43756 = C9235.f25000;
                if (c7934 != null && c7934 != C16057.f47257 && !(c7934 instanceof C16649) && !(c7934 instanceof C21345)) {
                    if (identityHashMap2.containsKey(c7934)) {
                        c9235M43754 = (C9235) identityHashMap2.get(c7934);
                    } else {
                        if (!identityHashMap.containsKey(c7934)) {
                            identityHashMap.put(c7934, Boolean.TRUE);
                            c17872.f53394 = true;
                            if (c7934.getClass() != C7933.class) {
                                if (c7934 instanceof C4462) {
                                    C4462 c4462 = (C4462) c7934;
                                    if (c4462.f10016.length == 0) {
                                        c17872.f53397 = 1;
                                        arrayList.add(new C17872(c7934.f20809));
                                    } else {
                                        c9235M43754 = m43754(c4462);
                                    }
                                } else if (c7934 instanceof C24697) {
                                    c9235M43754 = m43756(((C24697) c7934).f78179);
                                } else if (c7934 instanceof C23356) {
                                    c9235M43754 = f57410;
                                } else if (c7934 instanceof C18740) {
                                    c9235M43754 = C9235.m21267(-1L, -1L, true, false);
                                } else if (c7934 instanceof C8604) {
                                    C8604 c8604 = (C8604) c7934;
                                    c9235M43756 = m43756(c8604.f23121);
                                    if (c8604.f23120 <= 0) {
                                        c17872.f53395 = c9235M43756;
                                        c17872.f53397 = 2;
                                        arrayList.add(new C17872(c7934.f20809));
                                        c9235M43754 = c9235M43756;
                                    }
                                } else {
                                    if (c7934 instanceof C22016) {
                                        C22016 c22016 = (C22016) c7934;
                                        c17872.f53396 = c22016.f69300 > 0;
                                        int i2 = c22016.f69298;
                                        c17872.f53397 = i2 != 0 ? 3 : 1;
                                        arrayList.add(new C17872(i2 == 0 ? c22016.f20809 : c22016.f69297));
                                    } else if (c7934 instanceof C2568) {
                                        C2568 c2568 = (C2568) c7934;
                                        c17872.f53396 = c2568.f4241 > 0;
                                        int i3 = c2568.f4242;
                                        c17872.f53397 = i3 != 0 ? 3 : 1;
                                        arrayList.add(new C17872(i3 == 0 ? c2568.f20809 : c2568.f4238));
                                    } else if (c7934 instanceof C12509) {
                                        C12509 c12509 = (C12509) c7934;
                                        c17872.f53396 = c12509.f35057 == EnumC3791.INDEPENDENT;
                                        c17872.f53397 = 3;
                                        arrayList.add(new C17872(c12509.f35056));
                                    } else if (c7934 instanceof C13160) {
                                        C13160 c13160 = (C13160) c7934;
                                        int i4 = c13160.f36987;
                                        C9235 c9236 = C9235.f25001;
                                        if (i4 > 0) {
                                            c17872.f53395 = c9236;
                                            c17872.f53397 = 4;
                                            C7933 c7935 = c13160.f36986[0];
                                            if (c7935 == null) {
                                                c7935 = c13160.f36988.f20809;
                                            }
                                            if (c7935 instanceof C11168) {
                                                C11168 c11168 = (C11168) c7935;
                                                if (c11168.f10016.length > 0) {
                                                    c9235M43754 = m43754((C4462) c11168);
                                                }
                                            }
                                            arrayList.add(new C17872(c7935));
                                            c9235M43754 = c9236;
                                        } else {
                                            c9235M43754 = c9236;
                                        }
                                    } else if ((c7934 instanceof C19411) || (c7934 instanceof C7124) || (c7934 instanceof C9136) || (c7934 instanceof C9156) || (c7934 instanceof C4581) || (c7934 instanceof C11287) || (c7934 instanceof C3988) || (c7934 instanceof C7263) || (c7934 instanceof C3239) || (c7934 instanceof C23888) || (c7934 instanceof C15308) || (c7934 instanceof C11957) || (c7934 instanceof C3100) || (c7934 instanceof C13298) || (c7934 instanceof C7795)) {
                                        c17872.f53397 = 1;
                                        arrayList.add(new C17872(c7934.f20809));
                                    }
                                }
                            }
                        }
                        c9235M43754 = c9235;
                    }
                    C19925.m45229(arrayList, 1);
                    if (c17872.f53394) {
                        identityHashMap.remove(c7934);
                        identityHashMap2.put(c7934, c9235M43754);
                    }
                }
                c9235M43754 = c9235M43756;
                C19925.m45229(arrayList, 1);
                if (c17872.f53394) {
                    identityHashMap.remove(c7934);
                    identityHashMap2.put(c7934, c9235M43754);
                }
            } else {
                if (i == 2) {
                    c9235M43754 = c17872.f53395.m21269(c9235M43754);
                } else if (i == 3) {
                    if (!c9235M43754.m21275()) {
                        if (!c17872.f53396 || c9235M43754.m21276()) {
                            c17872.f53395 = c9235M43754.m21277();
                            c17872.f53397 = 2;
                            arrayList.add(new C17872(c7934.f20809));
                        } else {
                            c9235M43754 = c9235M43754.m21277();
                        }
                    }
                } else if (i == 4) {
                    c9235M43754 = c17872.f53395.m21269(c9235M43754);
                    C13160 c13161 = (C13160) c7934;
                    if (!c9235M43754.m21275()) {
                        int i5 = c17872.f53392 + 1;
                        c17872.f53392 = i5;
                        if (i5 < c13161.f36987) {
                            c17872.f53395 = c9235M43754;
                            C7933 c7936 = c13161.f36986[i5];
                            if (c7936 == null) {
                                c7936 = c13161.f36988.f20809;
                            }
                            if (c7936 instanceof C11168) {
                                C11168 c11169 = (C11168) c7936;
                                if (c11169.f10016.length > 0) {
                                    c9235M43754 = m43754((C4462) c11169);
                                }
                            }
                            arrayList.add(new C17872(c7936));
                        }
                    }
                }
                C19925.m45229(arrayList, 1);
                if (c17872.f53394) {
                    identityHashMap.remove(c7934);
                    identityHashMap2.put(c7934, c9235M43754);
                }
            }
        }
        return c9235M43754;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0077  */
    /* JADX INFO: renamed from: ֫ */
    public static C9235 m43754(C4462 c4462) {
        boolean z = c4462 instanceof C11168;
        boolean z2 = (c4462 instanceof C10497) || (c4462 instanceof C17201);
        boolean z3 = (c4462 instanceof C19885) || (c4462 instanceof C20556);
        if (!z && !z2 && !z3) {
            return C9235.f24999;
        }
        int i = c4462.f10016[0];
        long j = 0;
        if (z) {
            long j2 = (i < 0 || i >= 64) ? 0L : 1 << i;
            if (i >= 64 && i < 128) {
                j = 1 << (i - 64);
            }
            return C9235.m21267(j2, j, i >= 128, false);
        }
        long j3 = 0;
        long j4 = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            if (z3) {
                if (i == i2 || i == C5595.m12395(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (z2) {
                if (i == i2 || i == C23434.m52142(i2)) {
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
        return C9235.m21267(j3, j4, !z || i >= 128, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9235 m43756(InterfaceC12628 interfaceC12628) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 128; i++) {
            if (interfaceC12628.mo4821(i)) {
                if (i < 64) {
                    j = (1 << i) | j;
                } else {
                    j2 = (1 << (i - 64)) | j2;
                }
            }
        }
        return C9235.m21267(j, j2, true, false);
    }
}
