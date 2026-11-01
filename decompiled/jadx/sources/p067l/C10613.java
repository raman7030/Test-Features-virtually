package p067l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10613 implements InterfaceC19330 {

    /* JADX INFO: renamed from: ֫ */
    public final int f29378;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C17317 f29380;

    /* JADX INFO: renamed from: ۧ */
    public final C17861 f29379 = new C17861(new byte[5], 5);

    /* JADX INFO: renamed from: ܿ */
    public final SparseArray f29381 = new SparseArray();

    /* JADX INFO: renamed from: ᩳ */
    public final SparseIntArray f29382 = new SparseIntArray();

    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24431(C11157 c11157, InterfaceC23116 interfaceC23116, C20672 c20672) {
    }

    public C10613(C17317 c17317, int i) {
        this.f29380 = c17317;
        this.f29378 = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24432(C19203 c19203) {
        C11157 c11157;
        C11157 c11158;
        int i;
        C17861 c17861;
        InterfaceC2565 interfaceC2565M49335;
        C11157 c11159;
        int i2;
        if (c19203.m43702() == 2) {
            C17317 c17317 = this.f29380;
            int i3 = 0;
            if (c17317.f51666 == 1 || c17317.f51666 == 2 || c17317.f51659 == 1) {
                c11157 = (C11157) c17317.f51651.get(0);
            } else {
                c11157 = new C11157(((C11157) c17317.f51651.get(0)).m25731());
                c17317.f51651.add(c11157);
            }
            if ((c19203.m43702() & 128) != 0) {
                c19203.m43724(1);
                int iM43710 = c19203.m43710();
                int i4 = 3;
                c19203.m43724(3);
                C17861 c17862 = this.f29379;
                c19203.m43707(0, 2, c17862.f53313);
                c17862.m40569(0);
                c17862.m40566(3);
                int i5 = 13;
                c17317.f51656 = c17862.m40558(13);
                c19203.m43707(0, 2, c17862.f53313);
                c17862.m40569(0);
                int i6 = 4;
                c17862.m40566(4);
                int i7 = 12;
                c19203.m43724(c17862.m40558(12));
                if (c17317.f51666 == 2 && c17317.f51658 == null) {
                    c17317.f51658 = ((C21874) c17317.f51665).m49335(21, new C5919(21, null, 0, null, C5792.f14227));
                    if (c17317.f51658 != null) {
                        c17317.f51658.mo3865(c11157, c17317.f51653, new C20672(iM43710, 21, 8192));
                    }
                }
                SparseArray sparseArray = this.f29381;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.f29382;
                sparseIntArray.clear();
                int iM43703 = c19203.m43703();
                while (iM43703 > 0) {
                    int i8 = 5;
                    c19203.m43707(i3, 5, c17862.f53313);
                    c17862.m40569(i3);
                    int iM40558 = c17862.m40558(8);
                    c17862.m40566(i4);
                    int iM40559 = c17862.m40558(i5);
                    c17862.m40566(i6);
                    int iM405510 = c17862.m40558(i7);
                    int iM43731 = c19203.m43731();
                    int i9 = iM43731 + iM405510;
                    int i10 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM43702 = 0;
                    while (true) {
                        if (c19203.m43731() >= i9) {
                            c17861 = c17862;
                            break;
                        }
                        int iM43704 = c19203.m43702();
                        c17861 = c17862;
                        int iM43732 = c19203.m43731() + c19203.m43702();
                        if (iM43732 > i9) {
                            break;
                        }
                        if (iM43704 == i8) {
                            long jM43725 = c19203.m43725();
                            if (jM43725 == 1094921523) {
                                i10 = 129;
                            } else if (jM43725 == 1161904947) {
                                i10 = 135;
                            } else if (jM43725 == 1094921524) {
                                i10 = 172;
                            } else if (jM43725 == 1212503619) {
                                i10 = 36;
                            }
                            c11159 = c11157;
                            i2 = iM43710;
                        } else if (iM43704 == 106) {
                            c11159 = c11157;
                            i2 = iM43710;
                            i10 = 129;
                        } else if (iM43704 == 122) {
                            c11159 = c11157;
                            i2 = iM43710;
                            i10 = 135;
                        } else {
                            if (iM43704 == 127) {
                                int iM43705 = c19203.m43702();
                                if (iM43705 == 21) {
                                    i10 = 172;
                                } else if (iM43705 == 14) {
                                    i10 = 136;
                                } else if (iM43705 == 33) {
                                    i10 = 139;
                                }
                            } else if (iM43704 == 123) {
                                c11159 = c11157;
                                i2 = iM43710;
                                i10 = 138;
                            } else if (iM43704 == 10) {
                                strTrim = c19203.m43705(3, StandardCharsets.UTF_8).trim();
                                iM43702 = c19203.m43702();
                            } else if (iM43704 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c19203.m43731() < iM43732) {
                                    String strTrim2 = c19203.m43705(3, StandardCharsets.UTF_8).trim();
                                    c19203.m43702();
                                    C11157 c111510 = c11157;
                                    byte[] bArr = new byte[4];
                                    c19203.m43707(0, 4, bArr);
                                    arrayList2.add(new C4578(strTrim2, bArr));
                                    c11157 = c111510;
                                    iM43710 = iM43710;
                                }
                                c11159 = c11157;
                                i2 = iM43710;
                                arrayList = arrayList2;
                                i10 = 89;
                            } else {
                                c11159 = c11157;
                                i2 = iM43710;
                                if (iM43704 == 111) {
                                    i10 = 257;
                                }
                            }
                            c11159 = c11157;
                            i2 = iM43710;
                        }
                        c19203.m43724(iM43732 - c19203.m43731());
                        i8 = 5;
                        c11157 = c11159;
                        c17862 = c17861;
                        iM43710 = i2;
                    }
                    c19203.m43730(i9);
                    C5919 c5919 = new C5919(i10, strTrim, iM43702, arrayList, Arrays.copyOfRange(c19203.m43728(), iM43731, i9));
                    if (iM40558 == 6 || iM40558 == 5) {
                        iM40558 = i10;
                    }
                    iM43703 -= iM405510 + 5;
                    int i11 = c17317.f51666 == 2 ? iM40558 : iM40559;
                    if (!c17317.f51663.get(i11)) {
                        if (c17317.f51666 == 2 && iM40558 == 21) {
                            interfaceC2565M49335 = c17317.f51658;
                        } else {
                            interfaceC2565M49335 = ((C21874) c17317.f51665).m49335(iM40558, c5919);
                        }
                        if (c17317.f51666 != 2 || iM40559 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, iM40559);
                            sparseArray.put(i11, interfaceC2565M49335);
                        }
                    }
                    i3 = 0;
                    i4 = 3;
                    i5 = 13;
                    i6 = 4;
                    i7 = 12;
                    c11157 = c11157;
                    c17862 = c17861;
                    iM43710 = iM43710;
                }
                C11157 c111511 = c11157;
                int i12 = iM43710;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    c17317.f51663.put(iKeyAt, true);
                    c17317.f51664.put(iValueAt, true);
                    InterfaceC2565 interfaceC2565 = (InterfaceC2565) sparseArray.valueAt(i13);
                    if (interfaceC2565 != null) {
                        if (interfaceC2565 != c17317.f51658) {
                            InterfaceC23116 interfaceC23116 = c17317.f51653;
                            i = i12;
                            C20672 c20672 = new C20672(i, iKeyAt, 8192);
                            c11158 = c111511;
                            interfaceC2565.mo3865(c11158, interfaceC23116, c20672);
                        } else {
                            c11158 = c111511;
                            i = i12;
                        }
                        c17317.f51654.put(iValueAt, interfaceC2565);
                    } else {
                        c11158 = c111511;
                        i = i12;
                    }
                    i13++;
                    c111511 = c11158;
                    i12 = i;
                }
                if (c17317.f51666 == 2) {
                    if (c17317.f51647) {
                        return;
                    }
                    c17317.f51653.mo5734();
                    c17317.f51659 = 0;
                    c17317.f51647 = true;
                    return;
                }
                c17317.f51654.remove(this.f29378);
                c17317.f51659 = c17317.f51666 == 1 ? 0 : c17317.f51659 - 1;
                if (c17317.f51659 == 0) {
                    c17317.f51653.mo5734();
                    c17317.f51647 = true;
                }
            }
        }
    }
}
