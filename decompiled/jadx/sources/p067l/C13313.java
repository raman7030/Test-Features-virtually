package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C13313 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] f37380;

    /* JADX INFO: renamed from: ۖ */
    public final boolean[] f37381;

    /* JADX INFO: renamed from: ۘ */
    public final List f37382;

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f37383;

    /* JADX INFO: renamed from: ۡ */
    public final int f37384;

    /* JADX INFO: renamed from: ۢ */
    public final CharSequence f37385;

    /* JADX INFO: renamed from: ۧ */
    public final C6607 f37386;

    /* JADX INFO: renamed from: ܳ */
    public final String f37387;

    /* JADX INFO: renamed from: ܺ */
    public final boolean[] f37388;

    /* JADX INFO: renamed from: ܽ */
    public final boolean[] f37389;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f37390;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f37391;

    /* JADX INFO: renamed from: ᩴ */
    public final String f37392;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean[] f37393;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean[] f37394;

    /* JADX WARN: Code duplicated, block: B:136:0x0284  */
    public C13313(CharSequence charSequence, List list, C10631 c10631, C5660 c5660, String str, C6607 c6607) {
        String string;
        int i;
        C6607 c6608;
        List list2;
        boolean z;
        int i2;
        int i3;
        this.f37385 = charSequence;
        this.f37382 = list;
        this.f37386 = c6607;
        this.f37391 = new int[list.size()];
        this.f37390 = new int[list.size()];
        this.f37380 = new boolean[list.size()];
        this.f37381 = new boolean[list.size()];
        this.f37388 = new boolean[list.size()];
        this.f37394 = new boolean[list.size()];
        this.f37393 = new boolean[list.size()];
        this.f37383 = new boolean[list.size()];
        this.f37389 = new boolean[list.size()];
        int iMax = Math.max(1, Math.min(16, c5660.m12609()));
        this.f37384 = iMax;
        if (c5660.m12610()) {
            string = "\t";
        } else {
            if (iMax < 0) {
                throw new IllegalArgumentException(C20778.m46922(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C19768.m44906(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i4 = 0; i4 < iMax; i4++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f37392 = string;
        this.f37387 = str;
        boolean[] zArr = this.f37393;
        boolean[] zArr2 = this.f37388;
        int[] iArr = this.f37391;
        boolean[] zArr3 = this.f37380;
        C6607 c6609 = this.f37386;
        boolean[] zArr4 = this.f37381;
        List list3 = this.f37382;
        int[] iArr2 = new int[list3.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C7948(c10631, 0, false));
        while (!arrayDeque.isEmpty()) {
            c6609.m15087();
            C7948 c7948 = (C7948) arrayDeque.pop();
            C10856 c10856 = c7948.f20867;
            int iMo3481 = c10856.mo3481();
            if (iMo3481 == 18) {
                this.f37390[c10856.f30091.mo4432()] = c10856.f30090.mo4433() + 1;
            }
            if ((iMo3481 == 3 || iMo3481 == 6) && c10856.f30091.getType() != 1) {
                zArr3[c10856.f30091.mo4432()] = true;
            }
            if (iMo3481 == 5 && c10856.getChildCount() > 0) {
                String text = c10856.mo25014(1).getText();
                if (!text.equals("const") && !text.equals("close")) {
                    throw new C2701(EnumC20808.SYNTAX, c10856.f30091.getLine(), c10856.f30091.mo4429(), "Unknown local attribute: ".concat(text));
                }
            }
            int childCount = c10856.getChildCount() - 1;
            while (childCount >= 0) {
                InterfaceC17740 interfaceC17740Mo25014 = c10856.mo25014(childCount);
                if (interfaceC17740Mo25014 instanceof C10856) {
                    C10856 c10857 = (C10856) interfaceC17740Mo25014;
                    int i5 = c7948.f20869;
                    c6608 = c6609;
                    list2 = list3;
                    if (c10857.mo3481() == 2 && iMo3481 != 1) {
                        i5++;
                        int iMo4432 = ((InterfaceC6342) c10856.mo25014(childCount - 1)).mo14503().mo4432() + 1;
                        int iMo4433 = ((InterfaceC6342) c10856.mo25014(childCount + 1)).mo14503().mo4432();
                        iArr2[iMo4432] = iArr2[iMo4432] + 1;
                        iArr2[iMo4433] = iArr2[iMo4433] - 1;
                    }
                    int iMo3482 = c10857.mo3481();
                    arrayDeque.push(new C7948(c10857, i5, iMo3482 != 2 && (c7948.f20868 || iMo3482 == 12 || iMo3482 == 14 || iMo3482 == 11 || iMo3482 == 20 || iMo3482 == 10 || iMo3482 == 4 || iMo3482 == 9)));
                } else {
                    c6608 = c6609;
                    list2 = list3;
                    if (interfaceC17740Mo25014 instanceof InterfaceC6342) {
                        InterfaceC2808 interfaceC2808Mo14503 = ((InterfaceC6342) interfaceC17740Mo25014).mo14503();
                        int iMo4434 = interfaceC2808Mo14503.mo4432();
                        int type = interfaceC2808Mo14503.getType();
                        iArr[iMo4434] = c7948.f20869;
                        this.f37389[iMo4434] = c7948.f20868;
                        if (type == 6 || type == 13 || type == 12 || type == 9) {
                            zArr3[iMo4434] = true;
                        }
                        if (type == 30 && (iMo3481 == 17 || iMo3481 == 19)) {
                            z = true;
                            zArr4[iMo4434] = true;
                        } else {
                            z = true;
                        }
                        if (type == 47 && iMo3481 != 23) {
                            zArr4[iMo4434] = z;
                        }
                        if (iMo3481 == 5) {
                            if (type == 19) {
                                zArr2[iMo4434] = z;
                            }
                            if (type == 20) {
                                zArr4[iMo4434] = z;
                            }
                        }
                        if (iMo3481 == 12 && childCount == 0) {
                            if (type == 28 || type == 27 || type == 29) {
                                zArr2[iMo4434] = true;
                            } else {
                                i3 = 12;
                                i2 = 1;
                            }
                            if (iMo3481 == i3 && childCount == i2 && (c10856.mo25014(0) instanceof C8066)) {
                                zArr[iMo4434] = true;
                            }
                            if (iMo3481 == 15 && (type == 26 || type == 38)) {
                                zArr[iMo4434] = true;
                            }
                            if (type != 15 || iMo3481 == 24 || type == 2 || type == 21) {
                                this.f37383[iMo4434] = true;
                            }
                        }
                        i2 = 1;
                        i3 = 12;
                        if (iMo3481 == i3) {
                            zArr[iMo4434] = true;
                        }
                        if (iMo3481 == 15) {
                            zArr[iMo4434] = true;
                        }
                        if (type != 15) {
                            this.f37383[iMo4434] = true;
                        } else {
                            this.f37383[iMo4434] = true;
                        }
                    }
                }
                childCount--;
                c6609 = c6608;
                list3 = list2;
            }
        }
        C6607 c66010 = c6609;
        List list4 = list3;
        int i6 = 0;
        int i7 = 0;
        while (i7 < list4.size()) {
            if ((i7 & 1023) == 0) {
                c66010.m15087();
            }
            i6 += iArr2[i7];
            List list5 = list4;
            if (m30391((InterfaceC2808) list5.get(i7))) {
                iArr[i7] = i6;
            }
            i7++;
            list4 = list5;
        }
        int i8 = 0;
        C14101 c14101 = (C14101) ((C12090) c10631.m25013(C12090.class, 0)).m25013(C14101.class, 0);
        List list6 = this.f37382;
        ArrayList arrayList = new ArrayList(c14101.m25011(C17335.class));
        if (((C11302) c14101.m25013(C11302.class, 0)) != null) {
            arrayList.add((C11302) c14101.m25013(C11302.class, 0));
        }
        int iMo4435 = 0;
        while (i8 < arrayList.size()) {
            this.f37386.m15087();
            C10856 c10858 = (C10856) arrayList.get(i8);
            i8++;
            int iMo4436 = i8 < arrayList.size() ? ((C10856) arrayList.get(i8)).f30091.mo4432() : list6.size();
            while (true) {
                if (iMo4435 >= iMo4436) {
                    i = 1;
                    break;
                } else {
                    if (m30391((InterfaceC2808) list6.get(iMo4435))) {
                        i = 1;
                        Arrays.fill(this.f37394, c10858.f30091.mo4432(), c10858.f30090.mo4432() + 1, true);
                        break;
                    }
                    iMo4435++;
                }
            }
            iMo4435 = c10858.f30090.mo4432() + i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30389(CharSequence charSequence, C6607 c6607) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                c6607.m15087();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int i2 = i + 1;
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) == (cCharAt != '\r' ? '\r' : '\n')) {
                        return cCharAt == '\r' ? "\r\n" : "\n\r";
                    }
                }
                return String.valueOf(cCharAt);
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30392(C20438 c20438) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2808 interfaceC2808 : this.f37382) {
            if (interfaceC2808.getType() != 65 && interfaceC2808.getType() != -1) {
                arrayList.add(interfaceC2808);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        InterfaceC2808 interfaceC2809 = null;
        int i2 = 0;
        int iMo4433 = 0;
        while (true) {
            int size = arrayList.size();
            C6607 c6607 = this.f37386;
            if (i2 < size) {
                c6607.m15087();
                InterfaceC2808 interfaceC28010 = (InterfaceC2808) arrayList.get(i2);
                int iMo4432 = interfaceC28010.mo4432();
                int type = interfaceC28010.getType();
                int i3 = this.f37391[iMo4432];
                if (type == 31 || type == 48 || type == 46) {
                    arrayDeque.pop();
                }
                int i4 = arrayDeque.isEmpty() ? 0 : ((C11972) arrayDeque.peek()).f33386;
                int i5 = i3 + i4;
                int iMo4434 = interfaceC28010.mo4434();
                CharSequence charSequence = this.f37385;
                if (m30390(iMo4433, iMo4434, charSequence)) {
                    int iMo4435 = interfaceC28010.mo4434();
                    while (iMo4435 > iMo4433) {
                        int i6 = iMo4435 - 1;
                        if (charSequence.charAt(i6) == '\n' || charSequence.charAt(i6) == '\r') {
                            break;
                        } else {
                            iMo4435--;
                        }
                    }
                    i = iMo4435;
                } else {
                    i = -1;
                }
                boolean[] zArr = this.f37394;
                boolean z = zArr[iMo4432] || m30391(interfaceC28010) || (interfaceC2809 != null && (zArr[interfaceC2809.mo4432()] || m30391(interfaceC2809)));
                String str2 = "";
                if (interfaceC2809 == null || interfaceC2809.getType() == 67) {
                    str = str2;
                } else {
                    int type2 = interfaceC2809.getType();
                    int type3 = interfaceC28010.getType();
                    if (m30391(interfaceC28010)) {
                        str2 = EnumC2483.f3919;
                    } else {
                        str = " ";
                        if ((type2 == 28 && type3 == 28) || (type2 == 47 && (type3 == 47 || type3 == 59))) {
                            str2 = " ";
                        } else if (type3 == 15 || type3 == 1 || type3 == 31 || type3 == 48 || type3 == 46 || type3 == 26 || type3 == 38 || type2 == 26 || type2 == 38 || type2 == 30 || type2 == 47 || type2 == 45 || type2 == 22 || type3 == 22 || this.f37381[interfaceC28010.mo4432()] || this.f37388[interfaceC2809.mo4432()]) {
                        }
                    }
                    str = str2;
                }
                boolean[] zArr2 = this.f37380;
                ArrayList arrayList3 = arrayList;
                arrayList2.add(new C23489(interfaceC28010.mo4434(), interfaceC28010.mo4433() + 1, type, i5, i, str, (interfaceC2809 == null || interfaceC2809.getType() == 67 || !zArr2[iMo4432] || z) ? false : true, z, this.f37393[iMo4432] || (interfaceC2809 != null && this.f37383[interfaceC2809.mo4432()]), this.f37389[iMo4432] && !zArr2[iMo4432], this.f37390[iMo4432]));
                if (type == 30 || type == 47 || type == 45) {
                    arrayDeque.push(new C11972(i4 + 1));
                }
                iMo4433 = interfaceC28010.mo4433() + 1;
                i2++;
                interfaceC2809 = interfaceC28010;
                arrayList = arrayList3;
            } else {
                new C21478(this.f37385, arrayList2, this.f37392, this.f37387, this.f37384, c6607, c20438).m48681();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30391(InterfaceC2808 interfaceC2808) {
        return interfaceC2808.getType() == 64 || interfaceC2808.getType() == 66;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30390(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if ((i & 1023) == 0) {
                C22149.m49958();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            i++;
        }
        return false;
    }
}
