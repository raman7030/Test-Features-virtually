package l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8675 implements InterfaceC17847 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f26453;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15729 f26455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16302 f26454 = new C16302(new byte[5], 5);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseArray f26456 = new SparseArray();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f26457 = new SparseIntArray();

    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22462(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
    }

    public C8675(C15729 c15729, int i) {
        this.f26455 = c15729;
        this.f26453 = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22463(C17714 c17714) {
        C9248 c9248;
        C9248 c9249;
        int i;
        C16302 c16302;
        InterfaceC0207 interfaceC0207M47012;
        C9248 c92410;
        int i2;
        if (c17714.m41456() == 2) {
            C15729 c15729 = this.f26455;
            int i3 = 0;
            if (c15729.f48526 == 1 || c15729.f48526 == 2 || c15729.f48519 == 1) {
                c9248 = (C9248) c15729.f48511.get(0);
            } else {
                c9248 = new C9248(((C9248) c15729.f48511.get(0)).m23730());
                c15729.f48511.add(c9248);
            }
            if ((c17714.m41456() & 128) != 0) {
                c17714.m41478(1);
                int iM41464 = c17714.m41464();
                int i4 = 3;
                c17714.m41478(3);
                C16302 c16303 = this.f26454;
                c17714.m41461(0, 2, c16303.f50146);
                c16303.m38354(0);
                c16303.m38351(3);
                int i5 = 13;
                c15729.f48516 = c16303.m38343(13);
                c17714.m41461(0, 2, c16303.f50146);
                c16303.m38354(0);
                int i6 = 4;
                c16303.m38351(4);
                int i7 = 12;
                c17714.m41478(c16303.m38343(12));
                if (c15729.f48526 == 2 && c15729.f48518 == null) {
                    c15729.f48518 = ((C20524) c15729.f48525).m47012(21, new C3736(21, null, 0, null, C3603.f11423));
                    if (c15729.f48518 != null) {
                        c15729.f48518.mo1452(c9248, c15729.f48513, new C19259(iM41464, 21, 8192));
                    }
                }
                SparseArray sparseArray = this.f26456;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.f26457;
                sparseIntArray.clear();
                int iM41457 = c17714.m41457();
                while (iM41457 > 0) {
                    int i8 = 5;
                    c17714.m41461(i3, 5, c16303.f50146);
                    c16303.m38354(i3);
                    int iM38343 = c16303.m38343(8);
                    c16303.m38351(i4);
                    int iM38344 = c16303.m38343(i5);
                    c16303.m38351(i6);
                    int iM38345 = c16303.m38343(i7);
                    int iM41485 = c17714.m41485();
                    int i9 = iM41485 + iM38345;
                    int i10 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM41456 = 0;
                    while (true) {
                        if (c17714.m41485() >= i9) {
                            c16302 = c16303;
                            break;
                        }
                        int iM41458 = c17714.m41456();
                        c16302 = c16303;
                        int iM41486 = c17714.m41485() + c17714.m41456();
                        if (iM41486 > i9) {
                            break;
                        }
                        if (iM41458 == i8) {
                            long jM41479 = c17714.m41479();
                            if (jM41479 == 1094921523) {
                                i10 = 129;
                            } else if (jM41479 == 1161904947) {
                                i10 = 135;
                            } else if (jM41479 == 1094921524) {
                                i10 = 172;
                            } else if (jM41479 == 1212503619) {
                                i10 = 36;
                            }
                            c92410 = c9248;
                            i2 = iM41464;
                        } else if (iM41458 == 106) {
                            c92410 = c9248;
                            i2 = iM41464;
                            i10 = 129;
                        } else if (iM41458 == 122) {
                            c92410 = c9248;
                            i2 = iM41464;
                            i10 = 135;
                        } else {
                            if (iM41458 == 127) {
                                int iM41459 = c17714.m41456();
                                if (iM41459 == 21) {
                                    i10 = 172;
                                } else if (iM41459 == 14) {
                                    i10 = 136;
                                } else if (iM41459 == 33) {
                                    i10 = 139;
                                }
                            } else if (iM41458 == 123) {
                                c92410 = c9248;
                                i2 = iM41464;
                                i10 = 138;
                            } else if (iM41458 == 10) {
                                strTrim = c17714.m41459(3, StandardCharsets.UTF_8).trim();
                                iM41456 = c17714.m41456();
                            } else if (iM41458 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c17714.m41485() < iM41486) {
                                    String strTrim2 = c17714.m41459(3, StandardCharsets.UTF_8).trim();
                                    c17714.m41456();
                                    C9248 c92411 = c9248;
                                    byte[] bArr = new byte[4];
                                    c17714.m41461(0, 4, bArr);
                                    arrayList2.add(new C2325(strTrim2, bArr));
                                    c9248 = c92411;
                                    iM41464 = iM41464;
                                }
                                c92410 = c9248;
                                i2 = iM41464;
                                arrayList = arrayList2;
                                i10 = 89;
                            } else {
                                c92410 = c9248;
                                i2 = iM41464;
                                if (iM41458 == 111) {
                                    i10 = 257;
                                }
                            }
                            c92410 = c9248;
                            i2 = iM41464;
                        }
                        c17714.m41478(iM41486 - c17714.m41485());
                        i8 = 5;
                        c9248 = c92410;
                        c16303 = c16302;
                        iM41464 = i2;
                    }
                    c17714.m41484(i9);
                    C3736 c3736 = new C3736(i10, strTrim, iM41456, arrayList, Arrays.copyOfRange(c17714.m41482(), iM41485, i9));
                    if (iM38343 == 6 || iM38343 == 5) {
                        iM38343 = i10;
                    }
                    iM41457 -= iM38345 + 5;
                    int i11 = c15729.f48526 == 2 ? iM38343 : iM38344;
                    if (!c15729.f48523.get(i11)) {
                        if (c15729.f48526 == 2 && iM38343 == 21) {
                            interfaceC0207M47012 = c15729.f48518;
                        } else {
                            interfaceC0207M47012 = ((C20524) c15729.f48525).m47012(iM38343, c3736);
                        }
                        if (c15729.f48526 != 2 || iM38344 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, iM38344);
                            sparseArray.put(i11, interfaceC0207M47012);
                        }
                    }
                    i3 = 0;
                    i4 = 3;
                    i5 = 13;
                    i6 = 4;
                    i7 = 12;
                    c9248 = c9248;
                    c16303 = c16302;
                    iM41464 = iM41464;
                }
                C9248 c92412 = c9248;
                int i12 = iM41464;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    c15729.f48523.put(iKeyAt, true);
                    c15729.f48524.put(iValueAt, true);
                    InterfaceC0207 interfaceC0207 = (InterfaceC0207) sparseArray.valueAt(i13);
                    if (interfaceC0207 != null) {
                        if (interfaceC0207 != c15729.f48518) {
                            InterfaceC21830 interfaceC21830 = c15729.f48513;
                            i = i12;
                            C19259 c19259 = new C19259(i, iKeyAt, 8192);
                            c9249 = c92412;
                            interfaceC0207.mo1452(c9249, interfaceC21830, c19259);
                        } else {
                            c9249 = c92412;
                            i = i12;
                        }
                        c15729.f48514.put(iValueAt, interfaceC0207);
                    } else {
                        c9249 = c92412;
                        i = i12;
                    }
                    i13++;
                    c92412 = c9249;
                    i12 = i;
                }
                if (c15729.f48526 == 2) {
                    if (c15729.f48507) {
                        return;
                    }
                    c15729.f48513.mo3431();
                    c15729.f48519 = 0;
                    c15729.f48507 = true;
                    return;
                }
                c15729.f48514.remove(this.f26453);
                c15729.f48519 = c15729.f48526 == 1 ? 0 : c15729.f48519 - 1;
                if (c15729.f48519 == 0) {
                    c15729.f48513.mo3431();
                    c15729.f48507 = true;
                }
            }
        }
    }
}
