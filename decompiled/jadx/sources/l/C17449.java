package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17449 extends AbstractC15126 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C8954 f53305 = new C8954(4);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16743 f53306;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40801(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C17449(InterfaceC16743 interfaceC16743) {
        this.f53306 = interfaceC16743;
    }

    @Override // l.AbstractC15126
    /* JADX INFO: renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        return m40822(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m40822(int i, byte[] bArr) {
        boolean z;
        C18155 c18155;
        int i2;
        int iM40821;
        AbstractC14626 abstractC14626M40809;
        ArrayList arrayList = new ArrayList();
        C17714 c17714 = new C17714(bArr, i);
        boolean z2 = false;
        if (c17714.m41457() < 10) {
            C19956.m46037("Data too short to be an ID3 tag");
        } else {
            int iM41491 = c17714.m41491();
            if (iM41491 == 4801587) {
                int iM41456 = c17714.m41456();
                c17714.m41478(1);
                int iM41457 = c17714.m41456();
                int iM41467 = c17714.m41467();
                if (iM41456 != 2) {
                    if (iM41456 == 3) {
                        if ((iM41457 & 64) != 0) {
                            int iM41493 = c17714.m41493();
                            c17714.m41478(iM41493);
                            iM41467 -= iM41493 + 4;
                        }
                    } else if (iM41456 == 4) {
                        if ((iM41457 & 64) != 0) {
                            int iM41468 = c17714.m41467();
                            c17714.m41478(iM41468 - 4);
                            iM41467 -= iM41468;
                        }
                        if ((iM41457 & 16) != 0) {
                            iM41467 -= 10;
                        }
                    } else {
                        C8083.m21451(iM41456, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iM41456 < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c18155 = new C18155(iM41456, iM41467, z);
                } else if ((iM41457 & 64) != 0) {
                    C19956.m46037("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM41456 < 4 || (iM41457 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c18155 = new C18155(iM41456, iM41467, z);
                }
                if (c18155 == null) {
                    return null;
                }
                int iM41485 = c17714.m41485();
                i2 = c18155.f56455 == 2 ? 6 : 10;
                iM40821 = c18155.f56453;
                if (c18155.f56454) {
                    iM40821 = m40821(c18155.f56453, c17714);
                }
                c17714.m41486(iM41485 + iM40821);
                if (!m40810(c17714, c18155.f56455, i2, false)) {
                    if (c18155.f56455 == 4 || !m40810(c17714, 4, i2, true)) {
                        C19956.m46037("Failed to validate ID3 tag with majorVersion=" + c18155.f56455);
                        return null;
                    }
                    z2 = true;
                }
                while (c17714.m41457() >= i2) {
                    abstractC14626M40809 = m40809(c18155.f56455, c17714, z2, i2, this.f53306);
                    if (abstractC14626M40809 != null) {
                        arrayList.add(abstractC14626M40809);
                    }
                }
                return new C23896(arrayList);
            }
            C19956.m46037("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM41491))));
        }
        c18155 = null;
        if (c18155 == null) {
            return null;
        }
        int iM41486 = c17714.m41485();
        if (c18155.f56455 == 2) {
        }
        iM40821 = c18155.f56453;
        if (c18155.f56454) {
            iM40821 = m40821(c18155.f56453, c17714);
        }
        c17714.m41486(iM41486 + iM40821);
        if (!m40810(c17714, c18155.f56455, i2, false)) {
            if (c18155.f56455 == 4) {
            }
            C19956.m46037("Failed to validate ID3 tag with majorVersion=" + c18155.f56455);
            return null;
        }
        while (c17714.m41457() >= i2) {
            abstractC14626M40809 = m40809(c18155.f56455, c17714, z2, i2, this.f53306);
            if (abstractC14626M40809 != null) {
                arrayList.add(abstractC14626M40809);
            }
        }
        return new C23896(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40810(C17714 c17714, int i, int i2, boolean z) {
        int iM41491;
        long jM41491;
        int iM41464;
        int i3;
        int iM41485 = c17714.m41485();
        while (true) {
            try {
                boolean z2 = true;
                if (c17714.m41457() < i2) {
                    c17714.m41484(iM41485);
                    return true;
                }
                if (i >= 3) {
                    iM41491 = c17714.m41493();
                    jM41491 = c17714.m41479();
                    iM41464 = c17714.m41464();
                } else {
                    iM41491 = c17714.m41491();
                    jM41491 = c17714.m41491();
                    iM41464 = 0;
                }
                if (iM41491 == 0 && jM41491 == 0 && iM41464 == 0) {
                    c17714.m41484(iM41485);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM41491) != 0) {
                        c17714.m41484(iM41485);
                        return false;
                    }
                    jM41491 = (((jM41491 >> 24) & 255) << 21) | (jM41491 & 255) | (((jM41491 >> 8) & 255) << 7) | (((jM41491 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM41464 & 64) != 0 ? 1 : 0;
                    if ((iM41464 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM41464 & 32) != 0 ? 1 : 0;
                        if ((iM41464 & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM41491 < i3) {
                    c17714.m41484(iM41485);
                    return false;
                }
                if (c17714.m41457() >= jM41491) {
                    c17714.m41478((int) jM41491);
                } else {
                    c17714.m41484(iM41485);
                    return false;
                }
            } catch (Throwable th) {
                c17714.m41484(iM41485);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb A[Catch: all -> 0x0127, Exception -> 0x012a, OutOfMemoryError -> 0x012d, TRY_LEAVE, TryCatch #2 {Exception -> 0x012a, OutOfMemoryError -> 0x012d, all -> 0x0127, blocks: (B:91:0x0115, B:93:0x011d, B:106:0x013c, B:108:0x0144, B:116:0x015e, B:125:0x0176, B:136:0x0191, B:143:0x01a3, B:149:0x01b2, B:155:0x01cc, B:161:0x01e6, B:162:0x01eb), top: B:173:0x010b }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14626 m40809(int i, C17714 c17714, boolean z, int i2, InterfaceC16743 interfaceC16743) {
        int iM41491;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC14626 c22888;
        int iM41456 = c17714.m41456();
        int iM41457 = c17714.m41456();
        int iM41458 = c17714.m41456();
        int iM41459 = i >= 3 ? c17714.m41456() : 0;
        if (i == 4) {
            iM41491 = c17714.m41492();
            if (!z) {
                iM41491 = (((iM41491 >> 24) & 255) << 21) | (iM41491 & 255) | (((iM41491 >> 8) & 255) << 7) | (((iM41491 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            iM41491 = c17714.m41492();
        } else {
            iM41491 = c17714.m41491();
        }
        int iM40821 = iM41491;
        int iM41464 = i >= 3 ? c17714.m41464() : 0;
        AbstractC14626 abstractC14626 = null;
        if (iM41456 == 0 && iM41457 == 0 && iM41458 == 0 && iM41459 == 0 && iM40821 == 0 && iM41464 == 0) {
            c17714.m41484(c17714.m41483());
            return null;
        }
        int iM41485 = c17714.m41485() + iM40821;
        if (iM41485 > c17714.m41483()) {
            C19956.m46037("Frame size exceeds remaining tag data");
            c17714.m41484(c17714.m41483());
            return null;
        }
        if (interfaceC16743 != null) {
            i3 = iM41485;
            if (!interfaceC16743.mo19255(i, iM41456, iM41457, iM41458, iM41459)) {
                c17714.m41484(i3);
                return null;
            }
        } else {
            i3 = iM41485;
        }
        if (i == 3) {
            z2 = (iM41464 & 128) != 0;
            boolean z7 = (iM41464 & 64) != 0;
            z4 = (iM41464 & 32) != 0;
            z6 = z7;
            z3 = false;
            z5 = z2;
        } else if (i == 4) {
            boolean z8 = (iM41464 & 64) != 0;
            boolean z9 = (iM41464 & 8) != 0;
            z6 = (iM41464 & 4) != 0;
            z3 = (iM41464 & 2) != 0;
            boolean z10 = z9;
            z5 = (iM41464 & 1) != 0;
            z4 = z8;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            C19956.m46037("Skipping unsupported compressed or encrypted frame");
            c17714.m41484(i3);
            return null;
        }
        if (z4) {
            iM40821--;
            c17714.m41478(1);
        }
        if (z5) {
            iM40821 -= 4;
            c17714.m41478(4);
        }
        if (z3) {
            iM40821 = m40821(iM40821, c17714);
        }
        try {
            if (iM41456 == 84 && iM41457 == 88 && iM41458 == 88 && (i == 2 || iM41459 == 88)) {
                c22888 = m40819(iM40821, c17714);
            } else if (iM41456 == 84) {
                c22888 = m40805(iM40821, c17714, m40802(i, iM41456, iM41457, iM41458, iM41459));
            } else if (iM41456 == 87 && iM41457 == 88 && iM41458 == 88 && (i == 2 || iM41459 == 88)) {
                c22888 = m40817(iM40821, c17714);
            } else if (iM41456 == 87) {
                c22888 = m40816(iM40821, c17714, m40802(i, iM41456, iM41457, iM41458, iM41459));
            } else if (iM41456 == 80 && iM41457 == 82 && iM41458 == 73 && iM41459 == 86) {
                c22888 = m40820(iM40821, c17714);
            } else if (iM41456 == 71 && iM41457 == 69 && iM41458 == 79 && (iM41459 == 66 || i == 2)) {
                c22888 = m40815(iM40821, c17714);
            } else if (i == 2) {
                if (iM41456 == 80 && iM41457 == 73 && iM41458 == 67) {
                    c22888 = m40806(c17714, iM40821, i);
                } else if (iM41456 != 67 && iM41457 == 79 && iM41458 == 77 && (iM41459 == 77 || i == 2)) {
                    c22888 = m40804(iM40821, c17714);
                } else if (iM41456 != 67 && iM41457 == 72 && iM41458 == 65 && iM41459 == 80) {
                    c22888 = m40807(c17714, iM40821, i, z, i2, interfaceC16743);
                } else if (iM41456 != 67 && iM41457 == 84 && iM41458 == 79 && iM41459 == 67) {
                    c22888 = m40814(c17714, iM40821, i, z, i2, interfaceC16743);
                } else if (iM41456 != 77 && iM41457 == 76 && iM41458 == 76 && iM41459 == 84) {
                    c22888 = m40818(iM40821, c17714);
                } else {
                    String strM40802 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr);
                    c22888 = new C22888(strM40802, bArr);
                }
            } else if (iM41456 == 65 && iM41457 == 80 && iM41458 == 73 && iM41459 == 67) {
                c22888 = m40806(c17714, iM40821, i);
            } else if (iM41456 != 67) {
                if (iM41456 != 67) {
                    if (iM41456 != 67) {
                        if (iM41456 != 77) {
                            String strM40803 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                            byte[] bArr2 = new byte[iM40821];
                            c17714.m41461(0, iM40821, bArr2);
                            c22888 = new C22888(strM40803, bArr2);
                        } else {
                            String strM40804 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                            byte[] bArr3 = new byte[iM40821];
                            c17714.m41461(0, iM40821, bArr3);
                            c22888 = new C22888(strM40804, bArr3);
                        }
                    } else if (iM41456 != 77) {
                        String strM40805 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr4 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr4);
                        c22888 = new C22888(strM40805, bArr4);
                    } else {
                        String strM40806 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr5 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr5);
                        c22888 = new C22888(strM40806, bArr5);
                    }
                } else if (iM41456 != 67) {
                    if (iM41456 != 77) {
                        String strM40807 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr6 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr6);
                        c22888 = new C22888(strM40807, bArr6);
                    } else {
                        String strM40808 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr7 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr7);
                        c22888 = new C22888(strM40808, bArr7);
                    }
                } else if (iM41456 != 77) {
                    String strM40809 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr8 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr8);
                    c22888 = new C22888(strM40809, bArr8);
                } else {
                    String strM408010 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr9 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr9);
                    c22888 = new C22888(strM408010, bArr9);
                }
            } else if (iM41456 != 67) {
                if (iM41456 != 67) {
                    if (iM41456 != 77) {
                        String strM408011 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr10 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr10);
                        c22888 = new C22888(strM408011, bArr10);
                    } else {
                        String strM408012 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                        byte[] bArr11 = new byte[iM40821];
                        c17714.m41461(0, iM40821, bArr11);
                        c22888 = new C22888(strM408012, bArr11);
                    }
                } else if (iM41456 != 77) {
                    String strM408013 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr12 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr12);
                    c22888 = new C22888(strM408013, bArr12);
                } else {
                    String strM408014 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr13 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr13);
                    c22888 = new C22888(strM408014, bArr13);
                }
            } else if (iM41456 != 67) {
                if (iM41456 != 77) {
                    String strM408015 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr14 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr14);
                    c22888 = new C22888(strM408015, bArr14);
                } else {
                    String strM408016 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                    byte[] bArr15 = new byte[iM40821];
                    c17714.m41461(0, iM40821, bArr15);
                    c22888 = new C22888(strM408016, bArr15);
                }
            } else if (iM41456 != 77) {
                String strM408017 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                byte[] bArr16 = new byte[iM40821];
                c17714.m41461(0, iM40821, bArr16);
                c22888 = new C22888(strM408017, bArr16);
            } else {
                String strM408018 = m40802(i, iM41456, iM41457, iM41458, iM41459);
                byte[] bArr17 = new byte[iM40821];
                c17714.m41461(0, iM40821, bArr17);
                c22888 = new C22888(strM408018, bArr17);
            }
            c17714.m41484(i3);
            abstractC14626 = c22888;
            e = null;
        } catch (Exception e) {
            e = e;
        } catch (OutOfMemoryError e2) {
            e = e2;
        } finally {
            c17714.m41484(i3);
        }
        if (abstractC14626 == null) {
            C19956.m46036("Failed to decode frame: id=" + m40802(i, iM41456, iM41457, iM41458, iM41459) + ", frameSize=" + iM40821, e);
        }
        return abstractC14626;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8983 m40819(int i, C17714 c17714) {
        if (i < 1) {
            return null;
        }
        int iM41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int iM40811 = m40811(0, iM41456, bArr);
        return new C8983("TXXX", new String(bArr, 0, iM40811, m40813(iM41456)), m40808(iM41456, iM40811 + m40801(iM41456), bArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8983 m40805(int i, C17714 c17714, String str) {
        if (i < 1) {
            return null;
        }
        int iM41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        return new C8983(str, null, m40808(iM41456, 0, bArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m40808(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC14545.of((Object) "");
        }
        int i3 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        int iM40811 = m40811(i2, i, bArr);
        while (i2 < iM40811) {
            c1846.m16264(new String(bArr, i2, iM40811 - i2, m40813(i)));
            i2 = m40801(i) + iM40811;
            iM40811 = m40811(i2, i, bArr);
        }
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        return abstractC14545M6131.isEmpty() ? AbstractC14545.of((Object) "") : abstractC14545M6131;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16037 m40817(int i, C17714 c17714) {
        if (i < 1) {
            return null;
        }
        int iM41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int iM40811 = m40811(0, iM41456, bArr);
        String str = new String(bArr, 0, iM40811, m40813(iM41456));
        int iM40801 = iM40811 + m40801(iM41456);
        return new C16037("WXXX", str, m40803(bArr, iM40801, m40812(iM40801, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16037 m40816(int i, C17714 c17714, String str) {
        byte[] bArr = new byte[i];
        c17714.m41461(0, i, bArr);
        return new C16037(str, null, new String(bArr, 0, m40812(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9689 m40820(int i, C17714 c17714) {
        byte[] bArrCopyOfRange;
        byte[] bArr = new byte[i];
        c17714.m41461(0, i, bArr);
        int iM40812 = m40812(0, bArr);
        String str = new String(bArr, 0, iM40812, StandardCharsets.ISO_8859_1);
        int i2 = iM40812 + 1;
        if (i <= i2) {
            bArrCopyOfRange = C3603.f11423;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C9689(str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11100 m40815(int i, C17714 c17714) {
        byte[] bArrCopyOfRange;
        int iM41456 = c17714.m41456();
        Charset charsetM40813 = m40813(iM41456);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int iM40812 = m40812(0, bArr);
        String strM24800 = C9786.m24800(new String(bArr, 0, iM40812, StandardCharsets.ISO_8859_1));
        int i3 = iM40812 + 1;
        int iM40811 = m40811(i3, iM41456, bArr);
        String strM40803 = m40803(bArr, i3, iM40811, charsetM40813);
        int iM40801 = iM40811 + m40801(iM41456);
        int iM40813 = m40811(iM40801, iM41456, bArr);
        String strM40804 = m40803(bArr, iM40801, iM40813, charsetM40813);
        int iM40802 = iM40813 + m40801(iM41456);
        if (i2 <= iM40802) {
            bArrCopyOfRange = C3603.f11423;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM40802, i2);
        }
        return new C11100(bArrCopyOfRange, strM24800, strM40803, strM40804);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11600 m40806(C17714 c17714, int i, int i2) {
        int iM40812;
        String strConcat;
        byte[] bArrCopyOfRange;
        int iM41456 = c17714.m41456();
        Charset charsetM40813 = m40813(iM41456);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c17714.m41461(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + C15107.m35799(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM40812 = 2;
        } else {
            iM40812 = m40812(0, bArr);
            String strM35799 = C15107.m35799(new String(bArr, 0, iM40812, StandardCharsets.ISO_8859_1));
            strConcat = strM35799.indexOf(47) == -1 ? "image/".concat(strM35799) : strM35799;
        }
        int i4 = bArr[iM40812 + 1] & 255;
        int i5 = iM40812 + 2;
        int iM40811 = m40811(i5, iM41456, bArr);
        String str = new String(bArr, i5, iM40811 - i5, charsetM40813);
        int iM40801 = iM40811 + m40801(iM41456);
        if (i3 <= iM40801) {
            bArrCopyOfRange = C3603.f11423;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM40801, i3);
        }
        return new C11600(i4, strConcat, str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1927 m40804(int i, C17714 c17714) {
        if (i < 4) {
            return null;
        }
        int iM41456 = c17714.m41456();
        Charset charsetM40813 = m40813(iM41456);
        byte[] bArr = new byte[3];
        c17714.m41461(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c17714.m41461(0, i2, bArr2);
        int iM40811 = m40811(0, iM41456, bArr2);
        String str2 = new String(bArr2, 0, iM40811, charsetM40813);
        int iM40801 = iM40811 + m40801(iM41456);
        return new C1927(str, str2, m40803(bArr2, iM40801, m40811(iM40801, iM41456, bArr2), charsetM40813));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13715 m40807(C17714 c17714, int i, int i2, boolean z, int i3, InterfaceC16743 interfaceC16743) {
        int iM41485 = c17714.m41485();
        int iM40812 = m40812(iM41485, c17714.m41482());
        String str = new String(c17714.m41482(), iM41485, iM40812 - iM41485, StandardCharsets.ISO_8859_1);
        c17714.m41484(iM40812 + 1);
        int iM41493 = c17714.m41493();
        int iM41494 = c17714.m41493();
        long jM41479 = c17714.m41479();
        long j = jM41479 == 4294967295L ? -1L : jM41479;
        long jM414710 = c17714.m41479();
        long j2 = jM414710 == 4294967295L ? -1L : jM414710;
        ArrayList arrayList = new ArrayList();
        int i4 = iM41485 + i;
        while (c17714.m41485() < i4) {
            AbstractC14626 abstractC14626M40809 = m40809(i2, c17714, z, i3, interfaceC16743);
            if (abstractC14626M40809 != null) {
                arrayList.add(abstractC14626M40809);
            }
        }
        return new C13715(str, iM41493, iM41494, j, j2, (AbstractC14626[]) arrayList.toArray(new AbstractC14626[0]));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7366 m40814(C17714 c17714, int i, int i2, boolean z, int i3, InterfaceC16743 interfaceC16743) {
        int iM41485 = c17714.m41485();
        int iM40812 = m40812(iM41485, c17714.m41482());
        String str = new String(c17714.m41482(), iM41485, iM40812 - iM41485, StandardCharsets.ISO_8859_1);
        c17714.m41484(iM40812 + 1);
        int iM41456 = c17714.m41456();
        boolean z2 = (iM41456 & 2) != 0;
        boolean z3 = (iM41456 & 1) != 0;
        int iM41457 = c17714.m41456();
        String[] strArr = new String[iM41457];
        for (int i4 = 0; i4 < iM41457; i4++) {
            int iM41486 = c17714.m41485();
            int iM40813 = m40812(iM41486, c17714.m41482());
            strArr[i4] = new String(c17714.m41482(), iM41486, iM40813 - iM41486, StandardCharsets.ISO_8859_1);
            c17714.m41484(iM40813 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM41485 + i;
        while (c17714.m41485() < i5) {
            AbstractC14626 abstractC14626M40809 = m40809(i2, c17714, z, i3, interfaceC16743);
            if (abstractC14626M40809 != null) {
                arrayList.add(abstractC14626M40809);
            }
        }
        return new C7366(str, z2, z3, strArr, (AbstractC14626[]) arrayList.toArray(new AbstractC14626[0]));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20978 m40818(int i, C17714 c17714) {
        int iM41464 = c17714.m41464();
        int iM41491 = c17714.m41491();
        int iM41492 = c17714.m41491();
        int iM41456 = c17714.m41456();
        int iM41457 = c17714.m41456();
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int i2 = ((i - 10) * 8) / (iM41456 + iM41457);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM38343 = c16302.m38343(iM41456);
            int iM38344 = c16302.m38343(iM41457);
            iArr[i3] = iM38343;
            iArr2[i3] = iM38344;
        }
        return new C20978(iM41464, iM41491, iArr, iArr2, iM41492);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m40821(int i, C17714 c17714) {
        byte[] bArrM41482 = c17714.m41482();
        int iM41485 = c17714.m41485();
        int i2 = iM41485;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM41485 + i) {
                return i;
            }
            if ((bArrM41482[i2] & 255) == 255 && bArrM41482[i3] == 0) {
                System.arraycopy(bArrM41482, i2 + 2, bArrM41482, i3, (i - (i2 - iM41485)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Charset m40813(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i == 3) {
            return StandardCharsets.UTF_8;
        }
        return StandardCharsets.ISO_8859_1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40802(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40811(int i, int i2, byte[] bArr) {
        int iM40812 = m40812(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM40812;
        }
        while (iM40812 < bArr.length - 1) {
            if ((iM40812 - i) % 2 == 0 && bArr[iM40812 + 1] == 0) {
                return iM40812;
            }
            iM40812 = m40812(iM40812 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40812(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40803(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
