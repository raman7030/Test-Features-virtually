package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17805 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C3319 f54433 = C3319.m10159(':');

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C3319 f54434 = C3319.m10159('*');

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f54435 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54436 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54437;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41735() {
        this.f54435.clear();
        this.f54436 = 0;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41736(InterfaceC8424 interfaceC8424, C23615 c23615, ArrayList arrayList) throws C9080 {
        char c;
        int i;
        ArrayList arrayList2;
        List listM10163;
        int i2;
        List listM10164;
        int i3 = this.f54436;
        if (i3 == 0) {
            long j = 0;
            long length = interfaceC8424.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c23615.f76532 = j;
            this.f54436 = 1;
            return;
        }
        if (i3 == 1) {
            C17714 c17714 = new C17714(8);
            interfaceC8424.readFully(c17714.m41482(), 0, 8);
            this.f54437 = c17714.m41490() + 8;
            if (c17714.m41493() != 1397048916) {
                c23615.f76532 = 0L;
                return;
            } else {
                c23615.f76532 = interfaceC8424.getPosition() - ((long) (this.f54437 - 12));
                this.f54436 = 2;
                return;
            }
        }
        ArrayList arrayList3 = this.f54435;
        short s = 2816;
        char c2 = 2819;
        if (i3 == 2) {
            long length2 = interfaceC8424.getLength();
            int i4 = this.f54437 - 20;
            C17714 c17715 = new C17714(i4);
            interfaceC8424.readFully(c17715.m41482(), 0, i4);
            int i5 = 0;
            short s2 = 2817;
            while (i5 < i4 / 12) {
                c17715.m41478(2);
                short sM41470 = c17715.m41470();
                if (sM41470 != 2192 && sM41470 != s && sM41470 != s2) {
                    if (sM41470 != 2819 && sM41470 != 2820) {
                        c17715.m41478(8);
                    }
                    i5++;
                    s2 = 2817;
                    s = 2816;
                }
                arrayList3.add(new C16393(c17715.m41490(), (length2 - ((long) this.f54437)) - ((long) c17715.m41490())));
                i5++;
                s2 = 2817;
                s = 2816;
            }
            if (arrayList3.isEmpty()) {
                c23615.f76532 = 0L;
                return;
            } else {
                this.f54436 = 3;
                c23615.f76532 = ((C16393) arrayList3.get(0)).f50431;
                return;
            }
        }
        if (i3 != 3) {
            throw new IllegalStateException();
        }
        long position = interfaceC8424.getPosition();
        int length3 = (int) ((interfaceC8424.getLength() - interfaceC8424.getPosition()) - ((long) this.f54437));
        C17714 c17716 = new C17714(length3);
        interfaceC8424.readFully(c17716.m41482(), 0, length3);
        int i6 = 0;
        char c3 = 2820;
        while (i6 < arrayList3.size()) {
            C16393 c16393 = (C16393) arrayList3.get(i6);
            c17716.m41484((int) (c16393.f50431 - position));
            c17716.m41478(4);
            int iM41490 = c17716.m41490();
            Charset charset = StandardCharsets.UTF_8;
            String strM41459 = c17716.m41459(iM41490, charset);
            byte b = -1;
            switch (strM41459.hashCode()) {
                case -1711564334:
                    if (strM41459.equals("SlowMotion_Data")) {
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        for (i2 = 0; i2 < listM10163.size(); i2++) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            try {
                                arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                            } catch (NumberFormatException e) {
                                throw C9080.m23440((String) null, (Throwable) e);
                            }
                        }
                        arrayList.add(new C18861(arrayList2));
                    } else if (c == 2816 && c != 2817 && c != c2 && c != c3) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1332107749:
                    if (strM41459.equals("Super_SlowMotion_Edit_Data")) {
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        while (i2 < listM10163.size()) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                        }
                        arrayList.add(new C18861(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1251387154:
                    if (strM41459.equals("Super_SlowMotion_Data")) {
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        while (i2 < listM10163.size()) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                        }
                        arrayList.add(new C18861(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -830665521:
                    if (strM41459.equals("Super_SlowMotion_Deflickering_On")) {
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        while (i2 < listM10163.size()) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                        }
                        arrayList.add(new C18861(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case 1760745220:
                    if (strM41459.equals("Super_SlowMotion_BGM")) {
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        while (i2 < listM10163.size()) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                        }
                        arrayList.add(new C18861(arrayList2));
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
                            throw C9080.m23440("Invalid SEF name", (Throwable) null);
                    }
                    i = c16393.f50430 - (iM41490 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM10163 = f54434.m10163(c17716.m41459(i, charset));
                        while (i2 < listM10163.size()) {
                            listM10164 = f54433.m10163((CharSequence) listM10163.get(i2));
                            if (listM10164.size() == 3) {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C4044(Long.parseLong((String) listM10164.get(0)), 1 << (Integer.parseInt((String) listM10164.get(2)) - 1), Long.parseLong((String) listM10164.get(1))));
                        }
                        arrayList.add(new C18861(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
            }
        }
        c23615.f76532 = 0L;
    }
}
