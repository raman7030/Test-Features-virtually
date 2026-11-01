package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19290 {

    /* JADX INFO: renamed from: ܿ */
    public static final C5523 f57629 = C5523.m12195(':');

    /* JADX INFO: renamed from: ᩳ */
    public static final C5523 f57630 = C5523.m12195('*');

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f57631 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public int f57632 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f57633;

    /* JADX INFO: renamed from: ֫ */
    public final void m43981() {
        this.f57631.clear();
        this.f57632 = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m43982(InterfaceC10375 interfaceC10375, C24812 c24812, ArrayList arrayList) throws C10998 {
        char c;
        int i;
        ArrayList arrayList2;
        List listM12199;
        int i2;
        List listM121910;
        int i3 = this.f57632;
        if (i3 == 0) {
            long j = 0;
            long length = interfaceC10375.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c24812.f79276 = j;
            this.f57632 = 1;
            return;
        }
        if (i3 == 1) {
            C19203 c19203 = new C19203(8);
            interfaceC10375.readFully(c19203.m43728(), 0, 8);
            this.f57633 = c19203.m43736() + 8;
            if (c19203.m43739() != 1397048916) {
                c24812.f79276 = 0L;
                return;
            } else {
                c24812.f79276 = interfaceC10375.getPosition() - ((long) (this.f57633 - 12));
                this.f57632 = 2;
                return;
            }
        }
        ArrayList arrayList3 = this.f57631;
        short s = 2816;
        char c2 = 2819;
        if (i3 == 2) {
            long length2 = interfaceC10375.getLength();
            int i4 = this.f57633 - 20;
            C19203 c19204 = new C19203(i4);
            interfaceC10375.readFully(c19204.m43728(), 0, i4);
            int i5 = 0;
            short s2 = 2817;
            while (i5 < i4 / 12) {
                c19204.m43724(2);
                short sM43716 = c19204.m43716();
                if (sM43716 != 2192 && sM43716 != s && sM43716 != s2) {
                    if (sM43716 != 2819 && sM43716 != 2820) {
                        c19204.m43724(8);
                    }
                    i5++;
                    s2 = 2817;
                    s = 2816;
                }
                arrayList3.add(new C17948(c19204.m43736(), (length2 - ((long) this.f57633)) - ((long) c19204.m43736())));
                i5++;
                s2 = 2817;
                s = 2816;
            }
            if (arrayList3.isEmpty()) {
                c24812.f79276 = 0L;
                return;
            } else {
                this.f57632 = 3;
                c24812.f79276 = ((C17948) arrayList3.get(0)).f53603;
                return;
            }
        }
        if (i3 != 3) {
            throw new IllegalStateException();
        }
        long position = interfaceC10375.getPosition();
        int length3 = (int) ((interfaceC10375.getLength() - interfaceC10375.getPosition()) - ((long) this.f57633));
        C19203 c19205 = new C19203(length3);
        interfaceC10375.readFully(c19205.m43728(), 0, length3);
        int i6 = 0;
        char c3 = 2820;
        while (i6 < arrayList3.size()) {
            C17948 c17948 = (C17948) arrayList3.get(i6);
            c19205.m43730((int) (c17948.f53603 - position));
            c19205.m43724(4);
            int iM43736 = c19205.m43736();
            Charset charset = StandardCharsets.UTF_8;
            String strM43705 = c19205.m43705(iM43736, charset);
            byte b = -1;
            switch (strM43705.hashCode()) {
                case -1711564334:
                    if (strM43705.equals("SlowMotion_Data")) {
                        b = 0;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        for (i2 = 0; i2 < listM12199.size(); i2++) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            try {
                                arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                            } catch (NumberFormatException e) {
                                throw C10998.m25387((String) null, (Throwable) e);
                            }
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816 && c != 2817 && c != c2 && c != c3) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1332107749:
                    if (strM43705.equals("Super_SlowMotion_Edit_Data")) {
                        b = 1;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        while (i2 < listM12199.size()) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1251387154:
                    if (strM43705.equals("Super_SlowMotion_Data")) {
                        b = 2;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        while (i2 < listM12199.size()) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -830665521:
                    if (strM43705.equals("Super_SlowMotion_Deflickering_On")) {
                        b = 3;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        while (i2 < listM12199.size()) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case 1760745220:
                    if (strM43705.equals("Super_SlowMotion_BGM")) {
                        b = 4;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        while (i2 < listM12199.size()) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                default:
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C10998.m25387("Invalid SEF name", (Throwable) null);
                    }
                    i = c17948.f53602 - (iM43736 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM12199 = f57630.m12199(c19205.m43705(i, charset));
                        while (i2 < listM12199.size()) {
                            listM121910 = f57629.m12199((CharSequence) listM12199.get(i2));
                            if (listM121910.size() == 3) {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C6212(Long.parseLong((String) listM121910.get(0)), 1 << (Integer.parseInt((String) listM121910.get(2)) - 1), Long.parseLong((String) listM121910.get(1))));
                        }
                        arrayList.add(new C20294(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
            }
        }
        c24812.f79276 = 0L;
    }
}
