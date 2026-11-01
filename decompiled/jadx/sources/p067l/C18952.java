package p067l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18952 extends AbstractC16744 {

    /* JADX INFO: renamed from: ۧ */
    public static final C10878 f56493 = new C10878(4);

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18281 f56494;

    /* JADX INFO: renamed from: ֫ */
    public static int m43059(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C18952(InterfaceC18281 interfaceC18281) {
        this.f56494 = interfaceC18281;
    }

    @Override // p067l.AbstractC16744
    /* JADX INFO: renamed from: ֫ */
    public final C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer) {
        return m43080(byteBuffer.limit(), byteBuffer.array());
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
    /* JADX INFO: renamed from: ֫ */
    public final C25079 m43080(int i, byte[] bArr) {
        boolean z;
        C19623 c19623;
        int i2;
        int iM43079;
        AbstractC16269 abstractC16269M43067;
        ArrayList arrayList = new ArrayList();
        C19203 c19203 = new C19203(bArr, i);
        boolean z2 = false;
        if (c19203.m43703() < 10) {
            C21334.m48351("Data too short to be an ID3 tag");
        } else {
            int iM43737 = c19203.m43737();
            if (iM43737 == 4801587) {
                int iM43702 = c19203.m43702();
                c19203.m43724(1);
                int iM43703 = c19203.m43702();
                int iM43713 = c19203.m43713();
                if (iM43702 != 2) {
                    if (iM43702 == 3) {
                        if ((iM43703 & 64) != 0) {
                            int iM43739 = c19203.m43739();
                            c19203.m43724(iM43739);
                            iM43713 -= iM43739 + 4;
                        }
                    } else if (iM43702 == 4) {
                        if ((iM43703 & 64) != 0) {
                            int iM43714 = c19203.m43713();
                            c19203.m43724(iM43714 - 4);
                            iM43713 -= iM43714;
                        }
                        if ((iM43703 & 16) != 0) {
                            iM43713 -= 10;
                        }
                    } else {
                        C10050.m23419(iM43702, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iM43702 < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c19623 = new C19623(iM43702, iM43713, z);
                } else if ((iM43703 & 64) != 0) {
                    C21334.m48351("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM43702 < 4 || (iM43703 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c19623 = new C19623(iM43702, iM43713, z);
                }
                if (c19623 == null) {
                    return null;
                }
                int iM43731 = c19203.m43731();
                i2 = c19623.f59670 == 2 ? 6 : 10;
                iM43079 = c19623.f59668;
                if (c19623.f59669) {
                    iM43079 = m43079(c19623.f59668, c19203);
                }
                c19203.m43732(iM43731 + iM43079);
                if (!m43068(c19203, c19623.f59670, i2, false)) {
                    if (c19623.f59670 == 4 || !m43068(c19203, 4, i2, true)) {
                        C21334.m48351("Failed to validate ID3 tag with majorVersion=" + c19623.f59670);
                        return null;
                    }
                    z2 = true;
                }
                while (c19203.m43703() >= i2) {
                    abstractC16269M43067 = m43067(c19623.f59670, c19203, z2, i2, this.f56494);
                    if (abstractC16269M43067 != null) {
                        arrayList.add(abstractC16269M43067);
                    }
                }
                return new C25079(arrayList);
            }
            C21334.m48351("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM43737))));
        }
        c19623 = null;
        if (c19623 == null) {
            return null;
        }
        int iM43732 = c19203.m43731();
        if (c19623.f59670 == 2) {
        }
        iM43079 = c19623.f59668;
        if (c19623.f59669) {
            iM43079 = m43079(c19623.f59668, c19203);
        }
        c19203.m43732(iM43732 + iM43079);
        if (!m43068(c19203, c19623.f59670, i2, false)) {
            if (c19623.f59670 == 4) {
            }
            C21334.m48351("Failed to validate ID3 tag with majorVersion=" + c19623.f59670);
            return null;
        }
        while (c19203.m43703() >= i2) {
            abstractC16269M43067 = m43067(c19623.f59670, c19203, z2, i2, this.f56494);
            if (abstractC16269M43067 != null) {
                arrayList.add(abstractC16269M43067);
            }
        }
        return new C25079(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m43068(C19203 c19203, int i, int i2, boolean z) {
        int iM43737;
        long jM43737;
        int iM43710;
        int i3;
        int iM43731 = c19203.m43731();
        while (true) {
            try {
                boolean z2 = true;
                if (c19203.m43703() < i2) {
                    c19203.m43730(iM43731);
                    return true;
                }
                if (i >= 3) {
                    iM43737 = c19203.m43739();
                    jM43737 = c19203.m43725();
                    iM43710 = c19203.m43710();
                } else {
                    iM43737 = c19203.m43737();
                    jM43737 = c19203.m43737();
                    iM43710 = 0;
                }
                if (iM43737 == 0 && jM43737 == 0 && iM43710 == 0) {
                    c19203.m43730(iM43731);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM43737) != 0) {
                        c19203.m43730(iM43731);
                        return false;
                    }
                    jM43737 = (((jM43737 >> 24) & 255) << 21) | (jM43737 & 255) | (((jM43737 >> 8) & 255) << 7) | (((jM43737 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM43710 & 64) != 0 ? 1 : 0;
                    if ((iM43710 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM43710 & 32) != 0 ? 1 : 0;
                        if ((iM43710 & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM43737 < i3) {
                    c19203.m43730(iM43731);
                    return false;
                }
                if (c19203.m43703() >= jM43737) {
                    c19203.m43724((int) jM43737);
                } else {
                    c19203.m43730(iM43731);
                    return false;
                }
            } catch (Throwable th) {
                c19203.m43730(iM43731);
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
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16269 m43067(int i, C19203 c19203, boolean z, int i2, InterfaceC18281 interfaceC18281) {
        int iM43737;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC16269 c24121;
        int iM43702 = c19203.m43702();
        int iM43703 = c19203.m43702();
        int iM43704 = c19203.m43702();
        int iM43705 = i >= 3 ? c19203.m43702() : 0;
        if (i == 4) {
            iM43737 = c19203.m43738();
            if (!z) {
                iM43737 = (((iM43737 >> 24) & 255) << 21) | (iM43737 & 255) | (((iM43737 >> 8) & 255) << 7) | (((iM43737 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            iM43737 = c19203.m43738();
        } else {
            iM43737 = c19203.m43737();
        }
        int iM43079 = iM43737;
        int iM43710 = i >= 3 ? c19203.m43710() : 0;
        AbstractC16269 abstractC16269 = null;
        if (iM43702 == 0 && iM43703 == 0 && iM43704 == 0 && iM43705 == 0 && iM43079 == 0 && iM43710 == 0) {
            c19203.m43730(c19203.m43729());
            return null;
        }
        int iM43731 = c19203.m43731() + iM43079;
        if (iM43731 > c19203.m43729()) {
            C21334.m48351("Frame size exceeds remaining tag data");
            c19203.m43730(c19203.m43729());
            return null;
        }
        if (interfaceC18281 != null) {
            i3 = iM43731;
            if (!interfaceC18281.mo21202(i, iM43702, iM43703, iM43704, iM43705)) {
                c19203.m43730(i3);
                return null;
            }
        } else {
            i3 = iM43731;
        }
        if (i == 3) {
            z2 = (iM43710 & 128) != 0;
            boolean z7 = (iM43710 & 64) != 0;
            z4 = (iM43710 & 32) != 0;
            z6 = z7;
            z3 = false;
            z5 = z2;
        } else if (i == 4) {
            boolean z8 = (iM43710 & 64) != 0;
            boolean z9 = (iM43710 & 8) != 0;
            z6 = (iM43710 & 4) != 0;
            z3 = (iM43710 & 2) != 0;
            boolean z10 = z9;
            z5 = (iM43710 & 1) != 0;
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
            C21334.m48351("Skipping unsupported compressed or encrypted frame");
            c19203.m43730(i3);
            return null;
        }
        if (z4) {
            iM43079--;
            c19203.m43724(1);
        }
        if (z5) {
            iM43079 -= 4;
            c19203.m43724(4);
        }
        if (z3) {
            iM43079 = m43079(iM43079, c19203);
        }
        try {
            if (iM43702 == 84 && iM43703 == 88 && iM43704 == 88 && (i == 2 || iM43705 == 88)) {
                c24121 = m43077(iM43079, c19203);
            } else if (iM43702 == 84) {
                c24121 = m43063(iM43079, c19203, m43060(i, iM43702, iM43703, iM43704, iM43705));
            } else if (iM43702 == 87 && iM43703 == 88 && iM43704 == 88 && (i == 2 || iM43705 == 88)) {
                c24121 = m43075(iM43079, c19203);
            } else if (iM43702 == 87) {
                c24121 = m43074(iM43079, c19203, m43060(i, iM43702, iM43703, iM43704, iM43705));
            } else if (iM43702 == 80 && iM43703 == 82 && iM43704 == 73 && iM43705 == 86) {
                c24121 = m43078(iM43079, c19203);
            } else if (iM43702 == 71 && iM43703 == 69 && iM43704 == 79 && (iM43705 == 66 || i == 2)) {
                c24121 = m43073(iM43079, c19203);
            } else if (i == 2) {
                if (iM43702 == 80 && iM43703 == 73 && iM43704 == 67) {
                    c24121 = m43064(c19203, iM43079, i);
                } else if (iM43702 != 67 && iM43703 == 79 && iM43704 == 77 && (iM43705 == 77 || i == 2)) {
                    c24121 = m43062(iM43079, c19203);
                } else if (iM43702 != 67 && iM43703 == 72 && iM43704 == 65 && iM43705 == 80) {
                    c24121 = m43065(c19203, iM43079, i, z, i2, interfaceC18281);
                } else if (iM43702 != 67 && iM43703 == 84 && iM43704 == 79 && iM43705 == 67) {
                    c24121 = m43072(c19203, iM43079, i, z, i2, interfaceC18281);
                } else if (iM43702 != 77 && iM43703 == 76 && iM43704 == 76 && iM43705 == 84) {
                    c24121 = m43076(iM43079, c19203);
                } else {
                    String strM43060 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr);
                    c24121 = new C24121(strM43060, bArr);
                }
            } else if (iM43702 == 65 && iM43703 == 80 && iM43704 == 73 && iM43705 == 67) {
                c24121 = m43064(c19203, iM43079, i);
            } else if (iM43702 != 67) {
                if (iM43702 != 67) {
                    if (iM43702 != 67) {
                        if (iM43702 != 77) {
                            String strM43061 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                            byte[] bArr2 = new byte[iM43079];
                            c19203.m43707(0, iM43079, bArr2);
                            c24121 = new C24121(strM43061, bArr2);
                        } else {
                            String strM43062 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                            byte[] bArr3 = new byte[iM43079];
                            c19203.m43707(0, iM43079, bArr3);
                            c24121 = new C24121(strM43062, bArr3);
                        }
                    } else if (iM43702 != 77) {
                        String strM43063 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr4 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr4);
                        c24121 = new C24121(strM43063, bArr4);
                    } else {
                        String strM43064 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr5 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr5);
                        c24121 = new C24121(strM43064, bArr5);
                    }
                } else if (iM43702 != 67) {
                    if (iM43702 != 77) {
                        String strM43065 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr6 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr6);
                        c24121 = new C24121(strM43065, bArr6);
                    } else {
                        String strM43066 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr7 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr7);
                        c24121 = new C24121(strM43066, bArr7);
                    }
                } else if (iM43702 != 77) {
                    String strM43067 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr8 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr8);
                    c24121 = new C24121(strM43067, bArr8);
                } else {
                    String strM43068 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr9 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr9);
                    c24121 = new C24121(strM43068, bArr9);
                }
            } else if (iM43702 != 67) {
                if (iM43702 != 67) {
                    if (iM43702 != 77) {
                        String strM43069 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr10 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr10);
                        c24121 = new C24121(strM43069, bArr10);
                    } else {
                        String strM430610 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                        byte[] bArr11 = new byte[iM43079];
                        c19203.m43707(0, iM43079, bArr11);
                        c24121 = new C24121(strM430610, bArr11);
                    }
                } else if (iM43702 != 77) {
                    String strM430611 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr12 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr12);
                    c24121 = new C24121(strM430611, bArr12);
                } else {
                    String strM430612 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr13 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr13);
                    c24121 = new C24121(strM430612, bArr13);
                }
            } else if (iM43702 != 67) {
                if (iM43702 != 77) {
                    String strM430613 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr14 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr14);
                    c24121 = new C24121(strM430613, bArr14);
                } else {
                    String strM430614 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                    byte[] bArr15 = new byte[iM43079];
                    c19203.m43707(0, iM43079, bArr15);
                    c24121 = new C24121(strM430614, bArr15);
                }
            } else if (iM43702 != 77) {
                String strM430615 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                byte[] bArr16 = new byte[iM43079];
                c19203.m43707(0, iM43079, bArr16);
                c24121 = new C24121(strM430615, bArr16);
            } else {
                String strM430616 = m43060(i, iM43702, iM43703, iM43704, iM43705);
                byte[] bArr17 = new byte[iM43079];
                c19203.m43707(0, iM43079, bArr17);
                c24121 = new C24121(strM430616, bArr17);
            }
            c19203.m43730(i3);
            abstractC16269 = c24121;
            e = null;
        } catch (Exception e) {
            e = e;
        } catch (OutOfMemoryError e2) {
            e = e2;
        } finally {
            c19203.m43730(i3);
        }
        if (abstractC16269 == null) {
            C21334.m48350("Failed to decode frame: id=" + m43060(i, iM43702, iM43703, iM43704, iM43705) + ", frameSize=" + iM43079, e);
        }
        return abstractC16269;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C10906 m43077(int i, C19203 c19203) {
        if (i < 1) {
            return null;
        }
        int iM43702 = c19203.m43702();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c19203.m43707(0, i2, bArr);
        int iM43069 = m43069(0, iM43702, bArr);
        return new C10906("TXXX", new String(bArr, 0, iM43069, m43071(iM43702)), m43066(iM43702, iM43069 + m43059(iM43702), bArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10906 m43063(int i, C19203 c19203, String str) {
        if (i < 1) {
            return null;
        }
        int iM43702 = c19203.m43702();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c19203.m43707(0, i2, bArr);
        return new C10906(str, null, m43066(iM43702, 0, bArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m43066(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC16192.m36873of((Object) "");
        }
        int i3 = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        int iM43069 = m43069(i2, i, bArr);
        while (i2 < iM43069) {
            c4123.m18184(new String(bArr, i2, iM43069 - i2, m43071(i)));
            i2 = m43059(i) + iM43069;
            iM43069 = m43069(i2, i, bArr);
        }
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        return abstractC16192M8329.isEmpty() ? AbstractC16192.m36873of((Object) "") : abstractC16192M8329;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C17610 m43075(int i, C19203 c19203) {
        if (i < 1) {
            return null;
        }
        int iM43702 = c19203.m43702();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c19203.m43707(0, i2, bArr);
        int iM43069 = m43069(0, iM43702, bArr);
        String str = new String(bArr, 0, iM43069, m43071(iM43702));
        int iM43059 = iM43069 + m43059(iM43702);
        return new C17610("WXXX", str, m43061(bArr, iM43059, m43070(iM43059, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17610 m43074(int i, C19203 c19203, String str) {
        byte[] bArr = new byte[i];
        c19203.m43707(0, i, bArr);
        return new C17610(str, null, new String(bArr, 0, m43070(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C11577 m43078(int i, C19203 c19203) {
        byte[] bArrCopyOfRange;
        byte[] bArr = new byte[i];
        c19203.m43707(0, i, bArr);
        int iM43070 = m43070(0, bArr);
        String str = new String(bArr, 0, iM43070, StandardCharsets.ISO_8859_1);
        int i2 = iM43070 + 1;
        if (i <= i2) {
            bArrCopyOfRange = C5792.f14227;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C11577(str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12918 m43073(int i, C19203 c19203) {
        byte[] bArrCopyOfRange;
        int iM43702 = c19203.m43702();
        Charset charsetM43071 = m43071(iM43702);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c19203.m43707(0, i2, bArr);
        int iM43070 = m43070(0, bArr);
        String strM26815 = C11669.m26815(new String(bArr, 0, iM43070, StandardCharsets.ISO_8859_1));
        int i3 = iM43070 + 1;
        int iM43069 = m43069(i3, iM43702, bArr);
        String strM43061 = m43061(bArr, i3, iM43069, charsetM43071);
        int iM43059 = iM43069 + m43059(iM43702);
        int iM430610 = m43069(iM43059, iM43702, bArr);
        String strM43062 = m43061(bArr, iM43059, iM430610, charsetM43071);
        int iM430510 = iM430610 + m43059(iM43702);
        if (i2 <= iM430510) {
            bArrCopyOfRange = C5792.f14227;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM430510, i2);
        }
        return new C12918(bArrCopyOfRange, strM26815, strM43061, strM43062);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13393 m43064(C19203 c19203, int i, int i2) {
        int iM43070;
        String strConcat;
        byte[] bArrCopyOfRange;
        int iM43702 = c19203.m43702();
        Charset charsetM43071 = m43071(iM43702);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c19203.m43707(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + C16726.m37957(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM43070 = 2;
        } else {
            iM43070 = m43070(0, bArr);
            String strM37957 = C16726.m37957(new String(bArr, 0, iM43070, StandardCharsets.ISO_8859_1));
            strConcat = strM37957.indexOf(47) == -1 ? "image/".concat(strM37957) : strM37957;
        }
        int i4 = bArr[iM43070 + 1] & 255;
        int i5 = iM43070 + 2;
        int iM43069 = m43069(i5, iM43702, bArr);
        String str = new String(bArr, i5, iM43069 - i5, charsetM43071);
        int iM43059 = iM43069 + m43059(iM43702);
        if (i3 <= iM43059) {
            bArrCopyOfRange = C5792.f14227;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM43059, i3);
        }
        return new C13393(i4, strConcat, str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4200 m43062(int i, C19203 c19203) {
        if (i < 4) {
            return null;
        }
        int iM43702 = c19203.m43702();
        Charset charsetM43071 = m43071(iM43702);
        byte[] bArr = new byte[3];
        c19203.m43707(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c19203.m43707(0, i2, bArr2);
        int iM43069 = m43069(0, iM43702, bArr2);
        String str2 = new String(bArr2, 0, iM43069, charsetM43071);
        int iM43059 = iM43069 + m43059(iM43702);
        return new C4200(str, str2, m43061(bArr2, iM43059, m43069(iM43059, iM43702, bArr2), charsetM43071));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15403 m43065(C19203 c19203, int i, int i2, boolean z, int i3, InterfaceC18281 interfaceC18281) {
        int iM43731 = c19203.m43731();
        int iM43070 = m43070(iM43731, c19203.m43728());
        String str = new String(c19203.m43728(), iM43731, iM43070 - iM43731, StandardCharsets.ISO_8859_1);
        c19203.m43730(iM43070 + 1);
        int iM43739 = c19203.m43739();
        int iM437310 = c19203.m43739();
        long jM43725 = c19203.m43725();
        long j = jM43725 == 4294967295L ? -1L : jM43725;
        long jM43726 = c19203.m43725();
        long j2 = jM43726 == 4294967295L ? -1L : jM43726;
        ArrayList arrayList = new ArrayList();
        int i4 = iM43731 + i;
        while (c19203.m43731() < i4) {
            AbstractC16269 abstractC16269M43067 = m43067(i2, c19203, z, i3, interfaceC18281);
            if (abstractC16269M43067 != null) {
                arrayList.add(abstractC16269M43067);
            }
        }
        return new C15403(str, iM43739, iM437310, j, j2, (AbstractC16269[]) arrayList.toArray(new AbstractC16269[0]));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9369 m43072(C19203 c19203, int i, int i2, boolean z, int i3, InterfaceC18281 interfaceC18281) {
        int iM43731 = c19203.m43731();
        int iM43070 = m43070(iM43731, c19203.m43728());
        String str = new String(c19203.m43728(), iM43731, iM43070 - iM43731, StandardCharsets.ISO_8859_1);
        c19203.m43730(iM43070 + 1);
        int iM43702 = c19203.m43702();
        boolean z2 = (iM43702 & 2) != 0;
        boolean z3 = (iM43702 & 1) != 0;
        int iM43703 = c19203.m43702();
        String[] strArr = new String[iM43703];
        for (int i4 = 0; i4 < iM43703; i4++) {
            int iM43732 = c19203.m43731();
            int iM43071 = m43070(iM43732, c19203.m43728());
            strArr[i4] = new String(c19203.m43728(), iM43732, iM43071 - iM43732, StandardCharsets.ISO_8859_1);
            c19203.m43730(iM43071 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM43731 + i;
        while (c19203.m43731() < i5) {
            AbstractC16269 abstractC16269M43067 = m43067(i2, c19203, z, i3, interfaceC18281);
            if (abstractC16269M43067 != null) {
                arrayList.add(abstractC16269M43067);
            }
        }
        return new C9369(str, z2, z3, strArr, (AbstractC16269[]) arrayList.toArray(new AbstractC16269[0]));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C22306 m43076(int i, C19203 c19203) {
        int iM43710 = c19203.m43710();
        int iM43737 = c19203.m43737();
        int iM43738 = c19203.m43737();
        int iM43702 = c19203.m43702();
        int iM43703 = c19203.m43702();
        C17861 c17861 = new C17861();
        c17861.m40557(c19203);
        int i2 = ((i - 10) * 8) / (iM43702 + iM43703);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM40558 = c17861.m40558(iM43702);
            int iM40559 = c17861.m40558(iM43703);
            iArr[i3] = iM40558;
            iArr2[i3] = iM40559;
        }
        return new C22306(iM43710, iM43737, iArr, iArr2, iM43738);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m43079(int i, C19203 c19203) {
        byte[] bArrM43728 = c19203.m43728();
        int iM43731 = c19203.m43731();
        int i2 = iM43731;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM43731 + i) {
                return i;
            }
            if ((bArrM43728[i2] & 255) == 255 && bArrM43728[i3] == 0) {
                System.arraycopy(bArrM43728, i2 + 2, bArrM43728, i3, (i - (i2 - iM43731)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Charset m43071(int i) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m43060(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m43069(int i, int i2, byte[] bArr) {
        int iM43070 = m43070(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM43070;
        }
        while (iM43070 < bArr.length - 1) {
            if ((iM43070 - i) % 2 == 0 && bArr[iM43070 + 1] == 0) {
                return iM43070;
            }
            iM43070 = m43070(iM43070 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m43070(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m43061(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
