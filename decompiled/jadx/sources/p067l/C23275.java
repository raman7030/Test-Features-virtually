package p067l;

import android.util.Pair;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.᩹ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes.dex */
public final class C23275 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f73137 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f73138;

    /* JADX INFO: renamed from: ֫ */
    public static int m51818(int i) {
        return (i >> 24) & 255;
    }

    static {
        String str = C5792.f14228;
        f73138 = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:317:0x062b  */
    /* JADX WARN: Code duplicated, block: B:383:0x071e  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bbf A[PHI: r10 r24
      0x0bbf: PHI (r10v85 java.lang.String) = (r10v84 java.lang.String), (r10v86 java.lang.String) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]
      0x0bbf: PHI (r24v2 l.ۖۖۧ) = (r24v1 l.ۖۖۧ), (r24v3 l.ۖۖۧ) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:626:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d4f  */
    /* JADX WARN: Code duplicated, block: B:631:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d6c  */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m51820(C3109 c3109, C9704 c9704, long j, C21037 c21037, boolean z, boolean z2, InterfaceC18263 interfaceC18263) {
        int i;
        long jM12993;
        long j2;
        int i2;
        int i3;
        long jM12994;
        long j3;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        C3109 c31010;
        long[] jArr;
        long[] jArr2;
        C10307 c10307M6672;
        C7133 c7133;
        C25079 c25079;
        C25079 c250710;
        C15936 c15936;
        int i5;
        Pair pairCreate;
        C19922 c19922;
        ArrayList arrayList3;
        C3109 c31011;
        int i6;
        int i7;
        int i8;
        C7181 c7181;
        C19203 c19203;
        int i9;
        int iM43710;
        int iM43711;
        int iM43739;
        int iRound;
        int i10;
        C21037 c21038;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        int iM43731;
        String str4;
        int i14;
        int i15;
        List listM36873of;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        List listM36873of2;
        List list;
        AbstractC16192 abstractC16192;
        long j4;
        AbstractC16192 abstractC16192M36873of;
        String str5;
        String str6;
        AbstractC16192 abstractC16192M36873of2;
        ArrayList arrayList4;
        C3109 c31012 = c3109;
        ArrayList arrayList5 = c31012.f5656;
        ArrayList arrayList6 = new ArrayList();
        int i21 = 0;
        while (i21 < arrayList5.size()) {
            C3109 c31013 = (C3109) arrayList5.get(i21);
            if (c31013.f48556 != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i4 = i21;
            } else {
                C9815 c9815M5304 = c31012.m5304(1836476516);
                c9815M5304.getClass();
                C3109 c3109M5303 = c31013.m5303(1835297121);
                c3109M5303.getClass();
                C9815 c9815M5305 = c3109M5303.m5304(1751411826);
                c9815M5305.getClass();
                C19203 c19204 = c9815M5305.f27154;
                c19204.m43730(16);
                int iM437310 = c19204.m43739();
                if (iM437310 == 1936684398) {
                    i = 1;
                } else if (iM437310 == 1986618469) {
                    i = 2;
                } else if (iM437310 == 1952807028 || iM437310 == 1935832172 || iM437310 == 1937072756 || iM437310 == 1668047728 || iM437310 == 1937072752) {
                    i = 3;
                } else {
                    i = iM437310 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    c15936 = null;
                    i5 = 1835297121;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i4 = i21;
                    c31010 = c31013;
                } else {
                    C9815 c9815M5306 = c31013.m5304(1953196132);
                    c9815M5306.getClass();
                    C19203 c19205 = c9815M5306.f27154;
                    c19205.m43730(8);
                    int iM51818 = m51818(c19205.m43739());
                    c19205.m43724(iM51818 != 0 ? 16 : 8);
                    int iM437311 = c19205.m43739();
                    c19205.m43724(4);
                    int iM43732 = c19205.m43731();
                    int i22 = iM51818 == 0 ? 4 : 8;
                    int i23 = 0;
                    while (true) {
                        jM12993 = -9223372036854775807L;
                        if (i23 >= i22) {
                            c19205.m43724(i22);
                        } else {
                            if (c19205.m43728()[iM43732 + i23] != -1) {
                                long jM43725 = iM51818 == 0 ? c19205.m43725() : c19205.m43712();
                                if (jM43725 != 0) {
                                    j2 = jM43725;
                                    break;
                                }
                                break;
                            }
                            i23++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    c19205.m43724(10);
                    int iM43712 = c19205.m43710();
                    c19205.m43724(4);
                    int iM437312 = c19205.m43739();
                    int iM437313 = c19205.m43739();
                    c19205.m43724(4);
                    int iM437314 = c19205.m43739();
                    int iM437315 = c19205.m43739();
                    if (iM437312 == 0 && iM437313 == 65536 && ((iM437314 == -65536 || iM437314 == 65536) && iM437315 == 0)) {
                        i2 = 16;
                        i3 = 90;
                    } else if (iM437312 == 0 && iM437313 == -65536 && ((iM437314 == 65536 || iM437314 == -65536) && iM437315 == 0)) {
                        i2 = 16;
                        i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    } else if ((iM437312 == -65536 || iM437312 == 65536) && iM437313 == 0 && iM437314 == 0 && iM437315 == -65536) {
                        i2 = 16;
                        i3 = 180;
                    } else {
                        i2 = 16;
                        i3 = 0;
                    }
                    c19205.m43724(i2);
                    short sM43701 = c19205.m43701();
                    c19205.m43724(2);
                    C16568 c16568 = new C16568(iM437311, iM43712, i3, sM43701, c19205.m43701(), j2);
                    long j5 = j == -9223372036854775807L ? c16568.f48652 : j;
                    long j6 = m51828(c9815M5304.f27154).f73022;
                    if (j5 == -9223372036854775807L) {
                        jM12994 = -9223372036854775807L;
                    } else {
                        String str7 = C5792.f14228;
                        jM12994 = C5792.m12993(j5, 1000000L, j6, RoundingMode.DOWN);
                    }
                    C3109 c3109M5304 = c3109M5303.m5303(1835626086);
                    c3109M5304.getClass();
                    C3109 c3109M5305 = c3109M5304.m5303(1937007212);
                    c3109M5305.getClass();
                    C9815 c9815M5307 = c3109M5303.m5304(1835296868);
                    c9815M5307.getClass();
                    C19203 c19206 = c9815M5307.f27154;
                    c19206.m43730(8);
                    int iM51819 = m51818(c19206.m43739());
                    c19206.m43724(iM51819 == 0 ? 8 : 16);
                    long jM43726 = c19206.m43725();
                    int iM43733 = c19206.m43731();
                    int i24 = iM51819 == 0 ? 4 : 8;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= i24) {
                            j3 = j6;
                            c19206.m43724(i24);
                            break;
                        }
                        int i26 = iM43733;
                        j3 = j6;
                        if (c19206.m43728()[iM43733 + i25] != -1) {
                            long jM43727 = iM51819 == 0 ? c19206.m43725() : c19206.m43712();
                            if (jM43727 == 0) {
                                break;
                            }
                            String str8 = C5792.f14228;
                            jM12993 = C5792.m12993(jM43727, 1000000L, jM43726, RoundingMode.DOWN);
                            break;
                        }
                        i25++;
                        iM43733 = i26;
                        j6 = j3;
                    }
                    long j7 = jM12993;
                    int iM43713 = c19206.m43710();
                    int i27 = 3;
                    char[] cArr = {(char) (((iM43713 >> 10) & 31) + 96), (char) (((iM43713 >> 5) & 31) + 96), (char) ((iM43713 & 31) + 96)};
                    int i28 = 0;
                    while (true) {
                        if (i28 >= i27) {
                            str = new String(cArr);
                            break;
                        }
                        char c = cArr[i28];
                        if (c < 'a' || c > 'z') {
                            str = null;
                            break;
                        }
                        i28++;
                        i27 = 3;
                    }
                    C19922 c19923 = new C19922(str, jM43726, j7);
                    C9815 c9815M5308 = c3109M5305.m5304(1937011556);
                    if (c9815M5308 == null) {
                        throw C10998.m25387("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
                    }
                    C19203 c19207 = c9815M5308.f27154;
                    String str9 = c19923.f60488;
                    c19207.m43730(12);
                    int iM437316 = c19207.m43739();
                    C7181 c7182 = new C7181(iM437316);
                    int i29 = 0;
                    while (true) {
                        C24654[] c24654Arr = c7182.f18764;
                        if (i29 >= iM437316) {
                            C19922 c19924 = c19923;
                            int i30 = i;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i4 = i21;
                            C3109 c31014 = c31013;
                            long j8 = j3;
                            C7181 c7183 = c7182;
                            C15936 c15937 = null;
                            if (!z) {
                                c31010 = c31014;
                                C3109 c3109M5306 = c31010.m5303(1701082227);
                                if (c3109M5306 != null) {
                                    C9815 c9815M5309 = c3109M5306.m5304(1701606260);
                                    if (c9815M5309 == null) {
                                        pairCreate = null;
                                    } else {
                                        C19203 c19208 = c9815M5309.f27154;
                                        c19208.m43730(8);
                                        int iM518110 = m51818(c19208.m43739());
                                        int iM43738 = c19208.m43738();
                                        long[] jArr3 = new long[iM43738];
                                        long[] jArr4 = new long[iM43738];
                                        for (int i31 = 0; i31 < iM43738; i31++) {
                                            jArr3[i31] = iM518110 == 1 ? c19208.m43712() : c19208.m43725();
                                            jArr4[i31] = iM518110 == 1 ? c19208.m43733() : c19208.m43739();
                                            if (c19208.m43701() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            c19208.m43724(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        jArr2 = (long[]) pairCreate.first;
                                        jArr = (long[]) pairCreate.second;
                                    }
                                }
                                if (c7183.f18761 != null) {
                                    if (c16568.f48651 != 0) {
                                        c7133 = new C7133(c16568.f48651);
                                        C3601 c3601M23918 = c7183.f18761.m23918();
                                        c25079 = c7183.f18761.f28526;
                                        if (c25079 != null) {
                                            c250710 = c25079.m55052(c7133);
                                        } else {
                                            c250710 = new C25079(c7133);
                                        }
                                        c3601M23918.m6681(c250710);
                                        c10307M6672 = c3601M23918.m6672();
                                    } else {
                                        c10307M6672 = c7183.f18761;
                                    }
                                    c15937 = new C15936(c16568.f48656, i30, c19924.f60490, j8, jM12994, c19924.f60489, c10307M6672, c7183.f18765, c24654Arr, c7183.f18763, jArr2, jArr, c7183.f18762);
                                }
                                c15936 = c15937;
                                i5 = 1835297121;
                                break;
                            }
                            c31010 = c31014;
                            jArr = null;
                            jArr2 = null;
                            if (c7183.f18761 != null) {
                                if (c16568.f48651 != 0) {
                                    c7133 = new C7133(c16568.f48651);
                                    C3601 c3601M23919 = c7183.f18761.m23918();
                                    c25079 = c7183.f18761.f28526;
                                    if (c25079 != null) {
                                        c250710 = c25079.m55052(c7133);
                                    } else {
                                        c250710 = new C25079(c7133);
                                    }
                                    c3601M23919.m6681(c250710);
                                    c10307M6672 = c3601M23919.m6672();
                                } else {
                                    c10307M6672 = c7183.f18761;
                                }
                                c15937 = new C15936(c16568.f48656, i30, c19924.f60490, j8, jM12994, c19924.f60489, c10307M6672, c7183.f18765, c24654Arr, c7183.f18763, jArr2, jArr, c7183.f18762);
                            }
                            c15936 = c15937;
                            i5 = 1835297121;
                            break;
                        }
                        int iM43734 = c19207.m43731();
                        int iM437317 = c19207.m43739();
                        int i32 = iM437316;
                        String str10 = "childAtomSize must be positive";
                        C23786.m52873("childAtomSize must be positive", iM437317 > 0);
                        int iM437318 = c19207.m43739();
                        int i33 = i;
                        if (iM437318 == 1635148593 || iM437318 == 1635148595 || iM437318 == 1701733238 || iM437318 == 1831958048 || iM437318 == 1836070006 || iM437318 == 1752589105 || iM437318 == 1751479857 || iM437318 == 1932670515 || iM437318 == 1211250227 || iM437318 == 1748121139 || iM437318 == 1987063864 || iM437318 == 1987063865 || iM437318 == 1635135537 || iM437318 == 1685479798 || iM437318 == 1685479729 || iM437318 == 1685481573 || iM437318 == 1685481521 || iM437318 == 1634760241) {
                            c19922 = c19923;
                            arrayList3 = arrayList6;
                            i21 = i21;
                            c31011 = c31013;
                            i6 = iM437317;
                            i7 = iM43734;
                            i8 = i29;
                            c7181 = c7182;
                            c19203 = c19207;
                            m51826(c19207, iM437318, iM43734, i6, c16568.f48656, str9, c16568.f48655, c21037, c7181, i8);
                        } else {
                            if (iM437318 == 1836069985 || iM437318 == 1701733217 || iM437318 == 1633889587 || iM437318 == 1700998451 || iM437318 == 1633889588 || iM437318 == 1835823201 || iM437318 == 1685353315 || iM437318 == 1685353317 || iM437318 == 1685353320 || iM437318 == 1685353324 || iM437318 == 1685353336 || iM437318 == 1935764850 || iM437318 == 1935767394 || iM437318 == 1819304813 || iM437318 == 1936684916 || iM437318 == 1953984371 || iM437318 == 778924082 || iM437318 == 778924083 || iM437318 == 1835557169 || iM437318 == 1835560241 || iM437318 == 1634492771 || iM437318 == 1634492791 || iM437318 == 1970037111 || iM437318 == 1332770163 || iM437318 == 1716281667 || iM437318 == 1767992678 || iM437318 == 1768973165 || iM437318 == 1718641517) {
                                c19922 = c19923;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c31011 = c31013;
                                int i34 = c16568.f48656;
                                c19207.m43730(iM43734 + 16);
                                if (z2) {
                                    iM43710 = c19207.m43710();
                                    c19207.m43724(6);
                                } else {
                                    c19207.m43724(8);
                                    iM43710 = 0;
                                }
                                if (iM43710 == 0 || iM43710 == 1) {
                                    iM43711 = c19207.m43710();
                                    c19207.m43724(6);
                                    int iM43715 = c19207.m43715();
                                    c19207.m43730(c19207.m43731() - 4);
                                    iM43739 = c19207.m43739();
                                    if (iM43710 == 1) {
                                        c19207.m43724(16);
                                    }
                                    iRound = iM43715;
                                    i10 = -1;
                                } else {
                                    if (iM43710 == 2) {
                                        c19207.m43724(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c19207.m43733()));
                                        iM43711 = c19207.m43738();
                                        c19207.m43724(4);
                                        int iM437319 = c19207.m43738();
                                        int iM437320 = c19207.m43738();
                                        boolean z3 = (iM437320 & 1) != 0;
                                        boolean z4 = (iM437320 & 2) != 0;
                                        if (z3) {
                                            if (iM437319 == 32) {
                                                i10 = 4;
                                            } else {
                                                i10 = -1;
                                            }
                                        } else if (iM437319 == 8) {
                                            i10 = 3;
                                        } else if (iM437319 == 16) {
                                            i10 = z4 ? 268435456 : 2;
                                        } else if (iM437319 == 24) {
                                            i10 = z4 ? 1342177280 : 21;
                                        } else if (iM437319 == 32) {
                                            i10 = z4 ? 1610612736 : 22;
                                        } else {
                                            i10 = -1;
                                        }
                                        c19207.m43724(8);
                                        iM43739 = 0;
                                    }
                                    c7181 = c7182;
                                    c19203 = c19207;
                                    i8 = i9;
                                    i7 = i12;
                                    i6 = i11;
                                }
                                if (iM437318 == 1767992678) {
                                    iM43711 = -1;
                                    iRound = -1;
                                } else if (iM437318 == 1935764850) {
                                    iM43711 = 1;
                                    iRound = 8000;
                                } else if (iM437318 == 1935767394) {
                                    iM43711 = 1;
                                    iRound = 16000;
                                }
                                int iM43735 = c19207.m43731();
                                if (iM437318 == 1701733217) {
                                    Pair pairM51819 = m51819(c19207, iM43734, iM437317);
                                    if (pairM51819 != null) {
                                        int iIntValue = ((Integer) pairM51819.first).intValue();
                                        C21037 c21037M47450 = c21037 == null ? null : c21037.m47450(((C24654) pairM51819.second).f78019);
                                        c24654Arr[i9] = (C24654) pairM51819.second;
                                        c21038 = c21037M47450;
                                        iM437318 = iIntValue;
                                    } else {
                                        c21038 = c21037;
                                    }
                                    c19207.m43730(iM43735);
                                } else {
                                    c21038 = c21037;
                                }
                                String str11 = "audio/mhm1";
                                int i35 = iRound;
                                if (iM437318 == 1633889587) {
                                    str2 = "audio/ac3";
                                } else if (iM437318 == 1700998451) {
                                    str2 = "audio/eac3";
                                } else if (iM437318 == 1633889588) {
                                    str2 = "audio/ac4";
                                } else if (iM437318 == 1685353315) {
                                    str2 = "audio/vnd.dts";
                                } else if (iM437318 == 1685353320 || iM437318 == 1685353324) {
                                    str2 = "audio/vnd.dts.hd";
                                } else if (iM437318 == 1685353317) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iM437318 == 1685353336) {
                                    str2 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iM437318 == 1935764850) {
                                    str2 = "audio/3gpp";
                                } else if (iM437318 == 1935767394) {
                                    str2 = "audio/amr-wb";
                                } else if (iM437318 != 1936684916) {
                                    if (iM437318 == 1953984371) {
                                        i10 = 268435456;
                                    } else if (iM437318 == 1819304813) {
                                        if (i10 == -1) {
                                            i10 = 2;
                                        }
                                    } else if (iM437318 == 778924082 || iM437318 == 778924083) {
                                        str2 = "audio/mpeg";
                                    } else if (iM437318 == 1835557169) {
                                        str2 = "audio/mha1";
                                    } else if (iM437318 == 1835560241) {
                                        str2 = "audio/mhm1";
                                    } else if (iM437318 == 1634492771) {
                                        str2 = "audio/alac";
                                    } else if (iM437318 == 1634492791) {
                                        str2 = "audio/g711-alaw";
                                    } else if (iM437318 == 1970037111) {
                                        str2 = "audio/g711-mlaw";
                                    } else if (iM437318 == 1332770163) {
                                        str2 = "audio/opus";
                                    } else if (iM437318 == 1716281667) {
                                        str2 = "audio/flac";
                                    } else if (iM437318 == 1835823201) {
                                        str2 = "audio/true-hd";
                                    } else {
                                        str2 = iM437318 == 1767992678 ? "audio/iamf" : null;
                                    }
                                    str2 = "audio/raw";
                                } else {
                                    i10 = 2;
                                    str2 = "audio/raw";
                                }
                                C4499 c4499M51821 = null;
                                C10534 c10534 = null;
                                int i36 = iM43735;
                                String str12 = null;
                                int iIntValue2 = iM43711;
                                int i37 = i10;
                                List listM36873of3 = null;
                                int i38 = i35;
                                while (i36 - iM43734 < iM437317) {
                                    c19207.m43730(i36);
                                    int iM437321 = c19207.m43739();
                                    C23786.m52873(str10, iM437321 > 0);
                                    int iM437322 = c19207.m43739();
                                    int i39 = iM43734;
                                    if (iM437322 == 1835557187) {
                                        c19207.m43730(i36 + 8);
                                        c19207.m43724(1);
                                        int iM43702 = c19207.m43702();
                                        c19207.m43724(1);
                                        str12 = C12826.equals(str2, str11) ? String.format("mhm1.%02X", Integer.valueOf(iM43702)) : String.format("mha1.%02X", Integer.valueOf(iM43702));
                                        int iM43714 = c19207.m43710();
                                        byte[] bArr = new byte[iM43714];
                                        str3 = str11;
                                        c19207.m43707(0, iM43714, bArr);
                                        listM36873of3 = listM36873of3 == null ? AbstractC16192.m36873of((Object) bArr) : AbstractC16192.m36874of((Object) bArr, listM36873of3.get(0));
                                    } else {
                                        str3 = str11;
                                        if (iM437322 == 1835557200) {
                                            c19207.m43730(i36 + 8);
                                            int iM43703 = c19207.m43702();
                                            if (iM43703 > 0) {
                                                byte[] bArr2 = new byte[iM43703];
                                                c19207.m43707(0, iM43703, bArr2);
                                                listM36873of3 = listM36873of3 == null ? AbstractC16192.m36873of((Object) bArr2) : AbstractC16192.m36874of(listM36873of3.get(0), (Object) bArr2);
                                            }
                                        } else if (iM437322 == 1702061171 || (z2 && iM437322 == 2002876005)) {
                                            List list2 = listM36873of3;
                                            String str13 = str10;
                                            i13 = iM43739;
                                            int i40 = iIntValue2;
                                            int i41 = i38;
                                            if (iM437322 != 1702061171) {
                                                iM43731 = c19207.m43731();
                                                C23786.m52873(null, iM43731 >= i36);
                                                while (true) {
                                                    if (iM43731 - i36 >= iM437321) {
                                                        str4 = str13;
                                                        iM43731 = -1;
                                                        break;
                                                    }
                                                    c19207.m43730(iM43731);
                                                    int iM437323 = c19207.m43739();
                                                    str4 = str13;
                                                    C23786.m52873(str4, iM437323 > 0);
                                                    if (c19207.m43739() == 1702061171) {
                                                        break;
                                                    }
                                                    iM43731 += iM437323;
                                                    str13 = str4;
                                                }
                                            } else {
                                                iM43731 = i36;
                                                str4 = str13;
                                            }
                                            if (iM43731 != -1) {
                                                c4499M51821 = m51821(iM43731, c19207);
                                                str2 = c4499M51821.f10100;
                                                byte[] bArr3 = c4499M51821.f10099;
                                                if (bArr3 == null) {
                                                    i14 = iM437318;
                                                    str10 = str4;
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listM36873of3 = list2;
                                                } else if ("audio/vorbis".equals(str2)) {
                                                    C19203 c19209 = new C19203(bArr3);
                                                    c19209.m43724(1);
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (c19209.m43703() <= 0) {
                                                            i14 = iM437318;
                                                            break;
                                                        }
                                                        i14 = iM437318;
                                                        if (c19209.m43723() != 255) {
                                                            break;
                                                        }
                                                        i42 += 255;
                                                        c19209.m43724(1);
                                                        iM437318 = i14;
                                                    }
                                                    int iM43704 = c19209.m43702() + i42;
                                                    int i43 = 0;
                                                    while (true) {
                                                        if (c19209.m43703() <= 0) {
                                                            str10 = str4;
                                                            break;
                                                        }
                                                        str10 = str4;
                                                        if (c19209.m43723() != 255) {
                                                            break;
                                                        }
                                                        i43 += 255;
                                                        c19209.m43724(1);
                                                        str4 = str10;
                                                    }
                                                    int iM43705 = c19209.m43702() + i43;
                                                    byte[] bArr4 = new byte[iM43704];
                                                    int iM43736 = c19209.m43731();
                                                    System.arraycopy(bArr3, iM43736, bArr4, 0, iM43704);
                                                    int i44 = iM43736 + iM43704 + iM43705;
                                                    int length = bArr3.length - i44;
                                                    byte[] bArr5 = new byte[length];
                                                    System.arraycopy(bArr3, i44, bArr5, 0, length);
                                                    AbstractC16192 abstractC16192M36874of = AbstractC16192.m36874of((Object) bArr4, (Object) bArr5);
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listM36873of3 = abstractC16192M36874of;
                                                } else {
                                                    i14 = iM437318;
                                                    str10 = str4;
                                                    if ("audio/mp4a-latm".equals(str2)) {
                                                        C14674 c14674M31803 = C14004.m31803(new C17861(bArr3, bArr3.length), false);
                                                        i15 = c14674M31803.f41890;
                                                        iIntValue2 = c14674M31803.f41888;
                                                        str12 = c14674M31803.f41889;
                                                    } else {
                                                        iIntValue2 = i40;
                                                        i15 = i41;
                                                    }
                                                    listM36873of3 = AbstractC16192.m36873of((Object) bArr3);
                                                }
                                            } else {
                                                i14 = iM437318;
                                                str10 = str4;
                                                iIntValue2 = i40;
                                                i15 = i41;
                                                listM36873of3 = list2;
                                            }
                                        } else {
                                            if (iM437322 == 1651798644) {
                                                c19207.m43730(i36 + 8);
                                                c19207.m43724(4);
                                                i16 = iIntValue2;
                                                c10534 = new C10534(c19207.m43725(), c19207.m43725());
                                                list = listM36873of3;
                                            } else {
                                                listM36873of = listM36873of3;
                                                i16 = iIntValue2;
                                                if (iM437322 == 1684103987) {
                                                    c19207.m43730(i36 + 8);
                                                    c7182.f18761 = C7969.m18439(c19207, Integer.toString(i34), str9, c21038);
                                                } else if (iM437322 == 1684366131) {
                                                    c19207.m43730(i36 + 8);
                                                    c7182.f18761 = C7969.m18441(c19207, Integer.toString(i34), str9, c21038);
                                                } else if (iM437322 == 1684103988) {
                                                    c19207.m43730(i36 + 8);
                                                    c7182.f18761 = C15344.m34920(c19207, Integer.toString(i34), str9, c21038);
                                                } else if (iM437322 == 1684892784) {
                                                    if (iM43739 <= 0) {
                                                        throw C10998.m25387("Invalid sample rate for Dolby TrueHD MLP stream: " + iM43739, (Throwable) null);
                                                    }
                                                    iIntValue2 = 2;
                                                    i38 = iM43739;
                                                    list = listM36873of;
                                                    listM36873of = list;
                                                    str10 = str10;
                                                    i13 = iM43739;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listM36873of3 = listM36873of;
                                                    i14 = iM437318;
                                                } else if (iM437322 == 1684305011 || iM437322 == 1969517683) {
                                                    str10 = str10;
                                                    i13 = iM43739;
                                                    C3601 c3601 = new C3601();
                                                    c3601.m6699(i34);
                                                    c3601.m6697(str2);
                                                    i17 = i16;
                                                    c3601.m6704(i17);
                                                    i18 = i38;
                                                    c3601.m6688(i18);
                                                    c3601.m6679(c21038);
                                                    c3601.m6703(str9);
                                                    c7182.f18761 = c3601.m6672();
                                                    iIntValue2 = i17;
                                                    i38 = i18;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listM36873of3 = listM36873of;
                                                    i14 = iM437318;
                                                } else {
                                                    if (iM437322 == 1682927731) {
                                                        int i45 = iM437321 - 8;
                                                        byte[] bArr6 = f73138;
                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i45);
                                                        c19207.m43730(i36 + 8);
                                                        c19207.m43707(bArr6.length, i45, bArrCopyOf);
                                                        listM36873of2 = C6112.m13908(bArrCopyOf);
                                                    } else if (iM437322 == 1684425825) {
                                                        byte[] bArr7 = new byte[iM437321 - 8];
                                                        bArr7[0] = 102;
                                                        bArr7[1] = 76;
                                                        bArr7[2] = 97;
                                                        bArr7[3] = 67;
                                                        c19207.m43730(i36 + 12);
                                                        c19207.m43707(4, iM437321 - 12, bArr7);
                                                        listM36873of2 = AbstractC16192.m36873of((Object) bArr7);
                                                    } else if (iM437322 == 1634492771) {
                                                        int i46 = iM437321 - 12;
                                                        byte[] bArr8 = new byte[i46];
                                                        c19207.m43730(i36 + 12);
                                                        c19207.m43707(0, i46, bArr8);
                                                        int i47 = C19322.f57686;
                                                        C19203 c192010 = new C19203(bArr8);
                                                        c192010.m43730(9);
                                                        int iM43706 = c192010.m43702();
                                                        c192010.m43730(20);
                                                        Pair pairCreate2 = Pair.create(Integer.valueOf(c192010.m43738()), Integer.valueOf(iM43706));
                                                        int iIntValue3 = ((Integer) pairCreate2.first).intValue();
                                                        i14 = iM437318;
                                                        iIntValue2 = ((Integer) pairCreate2.second).intValue();
                                                        str10 = str10;
                                                        i13 = iM43739;
                                                        listM36873of3 = AbstractC16192.m36873of((Object) bArr8);
                                                        i15 = iIntValue3;
                                                    } else {
                                                        if (iM437322 == 1767990114) {
                                                            c19207.m43730(i36 + 9);
                                                            int iM43737 = c19207.m43735();
                                                            byte[] bArr9 = new byte[iM43737];
                                                            c19207.m43707(0, iM43737, bArr9);
                                                            int i48 = C19322.f57686;
                                                            C19203 c192011 = new C19203(bArr9);
                                                            while ((c192011.m43702() & 128) != 0) {
                                                            }
                                                            c192011.m43724(4);
                                                            int iM43707 = c192011.m43702();
                                                            int iM43708 = c192011.m43702();
                                                            c192011.m43724(1);
                                                            while ((c192011.m43702() & 128) != 0) {
                                                            }
                                                            while ((c192011.m43702() & 128) != 0) {
                                                            }
                                                            i13 = iM43739;
                                                            String strM43705 = c192011.m43705(4, StandardCharsets.UTF_8);
                                                            if (strM43705.equals("mp4a")) {
                                                                while ((c192011.m43702() & 128) != 0) {
                                                                }
                                                                c192011.m43724(2);
                                                                C17861 c17861 = new C17861();
                                                                c17861.m40557(c192011);
                                                                int iM40558 = c17861.m40558(5);
                                                                if (iM40558 == 31) {
                                                                    iM40558 = c17861.m40558(6) + 32;
                                                                }
                                                                strM43705 = strM43705 + ".40." + iM40558;
                                                            }
                                                            Object[] objArr = {Integer.valueOf(iM43707), Integer.valueOf(iM43708), strM43705};
                                                            String str14 = C5792.f14228;
                                                            str12 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
                                                            listM36873of = AbstractC16192.m36873of((Object) bArr9);
                                                            i19 = i37;
                                                        } else {
                                                            str10 = str10;
                                                            i13 = iM43739;
                                                            if (iM437322 == 1885564227) {
                                                                c19207.m43730(i36 + 12);
                                                                ByteOrder byteOrder = (c19207.m43702() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                                int iM43709 = c19207.m43702();
                                                                if (iM437318 == 1768973165) {
                                                                    int iM12979 = C5792.m12979(iM43709, byteOrder);
                                                                    i20 = -1;
                                                                    i19 = iM12979;
                                                                } else {
                                                                    i19 = (iM437318 == 1718641517 && iM43709 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i37;
                                                                    i20 = -1;
                                                                }
                                                                if (i19 != i20) {
                                                                    str2 = "audio/raw";
                                                                }
                                                            }
                                                            i18 = i38;
                                                            i17 = i16;
                                                            iIntValue2 = i17;
                                                            i38 = i18;
                                                            i19 = i37;
                                                            i37 = i19;
                                                            i15 = i38;
                                                            listM36873of3 = listM36873of;
                                                            i14 = iM437318;
                                                        }
                                                        iIntValue2 = i16;
                                                        i37 = i19;
                                                        i15 = i38;
                                                        listM36873of3 = listM36873of;
                                                        i14 = iM437318;
                                                    }
                                                    list = listM36873of2;
                                                }
                                                str10 = str10;
                                                i13 = iM43739;
                                                i18 = i38;
                                                i17 = i16;
                                                iIntValue2 = i17;
                                                i38 = i18;
                                                i19 = i37;
                                                i37 = i19;
                                                i15 = i38;
                                                listM36873of3 = listM36873of;
                                                i14 = iM437318;
                                            }
                                            iIntValue2 = i16;
                                            listM36873of = list;
                                            str10 = str10;
                                            i13 = iM43739;
                                            i19 = i37;
                                            i37 = i19;
                                            i15 = i38;
                                            listM36873of3 = listM36873of;
                                            i14 = iM437318;
                                        }
                                        i36 += iM437321;
                                        iM437318 = i14;
                                        iM437317 = iM437317;
                                        str11 = str3;
                                        iM43739 = i13;
                                        str10 = str10;
                                        i38 = i15;
                                        iM43734 = i39;
                                    }
                                    str10 = str10;
                                    i13 = iM43739;
                                    i15 = i38;
                                    i14 = iM437318;
                                    i36 += iM437321;
                                    iM437318 = i14;
                                    iM437317 = iM437317;
                                    str11 = str3;
                                    iM43739 = i13;
                                    str10 = str10;
                                    i38 = i15;
                                    iM43734 = i39;
                                }
                                i11 = iM437317;
                                i12 = iM43734;
                                List list3 = listM36873of3;
                                int i49 = iIntValue2;
                                int i50 = i38;
                                if (c7182.f18761 == null && str2 != null) {
                                    C3601 c3602 = new C3601();
                                    c3602.m6699(i34);
                                    c3602.m6697(str2);
                                    c3602.m6677(str12);
                                    c3602.m6704(i49);
                                    c3602.m6688(i50);
                                    c3602.m6707(i37);
                                    c3602.m6678(list3);
                                    c3602.m6679(c21038);
                                    c3602.m6703(str9);
                                    if (c4499M51821 != null) {
                                        c3602.m6700(C15129.m34552(c4499M51821.f10098));
                                        c3602.m6670(C15129.m34552(c4499M51821.f10101));
                                    } else if (c10534 != null) {
                                        c3602.m6700(C15129.m34552(c10534.f29155));
                                        c3602.m6670(C15129.m34552(c10534.f29156));
                                    }
                                    c7182.f18761 = c3602.m6672();
                                }
                                c7181 = c7182;
                                c19203 = c19207;
                                i8 = i9;
                                i7 = i12;
                                i6 = i11;
                            } else {
                                if (iM437318 == 1414810956 || iM437318 == 1954034535 || iM437318 == 2004251764 || iM437318 == 1937010800 || iM437318 == 1664495672 || iM437318 == 1836070003) {
                                    c19207.m43730(iM43734 + 16);
                                    String str15 = "application/ttml+xml";
                                    long j9 = C14849.FOREVER_NS;
                                    if (iM437318 != 1414810956) {
                                        if (iM437318 == 1954034535) {
                                            int i51 = iM437317 - 16;
                                            byte[] bArr10 = new byte[i51];
                                            c19207.m43707(0, i51, bArr10);
                                            abstractC16192M36873of2 = AbstractC16192.m36873of((Object) bArr10);
                                            str6 = "application/x-quicktime-tx3g";
                                            c19922 = c19923;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c31011 = c31013;
                                        } else {
                                            if (iM437318 == 2004251764) {
                                                str15 = "application/x-mp4-vtt";
                                            } else if (iM437318 == 1937010800) {
                                                j9 = 0;
                                            } else if (iM437318 == 1664495672) {
                                                c7182.f18765 = 1;
                                                str15 = "application/x-mp4-cea-608";
                                            } else {
                                                if (iM437318 != 1836070003) {
                                                    throw new IllegalStateException();
                                                }
                                                int iM437324 = c19207.m43731();
                                                c19207.m43724(4);
                                                if (c19207.m43739() == 1702061171) {
                                                    C4499 c4499M51822 = m51821(iM437324, c19207);
                                                    if (c4499M51822.f10099 != null && c4499M51822.f10099.length == 64) {
                                                        byte[] bArr11 = c4499M51822.f10099;
                                                        int i52 = c16568.f48653;
                                                        int i53 = c16568.f48654;
                                                        C23877.m52960(bArr11.length == 64);
                                                        ArrayList arrayList7 = new ArrayList(16);
                                                        int i54 = 0;
                                                        while (i54 < bArr11.length - 3) {
                                                            ArrayList arrayList8 = arrayList6;
                                                            C19922 c19925 = c19923;
                                                            int iM34546 = C15129.m34546(bArr11[i54], bArr11[i54 + 1], bArr11[i54 + 2], bArr11[i54 + 3]);
                                                            int i55 = (iM34546 >> 16) & 255;
                                                            int i56 = ((iM34546 >> 8) & 255) + C0184a.f879g;
                                                            byte[] bArr12 = bArr11;
                                                            int iM54989 = C25053.m54989(i56, 14075, 10000, i55);
                                                            int i57 = (iM34546 & 255) + C0184a.f879g;
                                                            arrayList7.add(String.format("%06x", Integer.valueOf(C5792.m12976(C25053.m54989(i57, 17790, 10000, i55), 0, 255) | (C5792.m12976(iM54989, 0, 255) << 16) | (C5792.m12976((i55 - ((i57 * 3455) / 10000)) - ((i56 * 7169) / 10000), 0, 255) << 8))));
                                                            i54 += 4;
                                                            bArr11 = bArr12;
                                                            c19923 = c19925;
                                                            i29 = i29;
                                                            arrayList6 = arrayList8;
                                                            c31013 = c31013;
                                                        }
                                                        c19922 = c19923;
                                                        i9 = i29;
                                                        arrayList3 = arrayList6;
                                                        c31011 = c31013;
                                                        StringBuilder sbM49005 = C21720.m49005("size: ", i52, "x", "\npalette: ", i53);
                                                        sbM49005.append(C8876.m20480(", ").m20482((Iterable) arrayList7));
                                                        sbM49005.append("\n");
                                                        String string = sbM49005.toString();
                                                        String str16 = C5792.f14228;
                                                        abstractC16192M36873of = AbstractC16192.m36873of((Object) string.getBytes(StandardCharsets.UTF_8));
                                                        str5 = "application/vobsub";
                                                    }
                                                } else {
                                                    c19922 = c19923;
                                                    i9 = i29;
                                                    arrayList3 = arrayList6;
                                                    c31011 = c31013;
                                                    abstractC16192M36873of = null;
                                                    str5 = null;
                                                }
                                                str6 = str5;
                                                abstractC16192M36873of2 = abstractC16192M36873of;
                                            }
                                            abstractC16192 = null;
                                            c19922 = c19923;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c31011 = c31013;
                                            j4 = j9;
                                        }
                                        j4 = Long.MAX_VALUE;
                                        String str17 = str6;
                                        abstractC16192 = abstractC16192M36873of2;
                                        str15 = str17;
                                    } else {
                                        abstractC16192 = null;
                                        c19922 = c19923;
                                        i9 = i29;
                                        arrayList3 = arrayList6;
                                        i21 = i21;
                                        c31011 = c31013;
                                        j4 = j9;
                                    }
                                    if (str15 != null) {
                                        C3601 c3603 = new C3601();
                                        c3603.m6699(c16568.f48656);
                                        c3603.m6697(str15);
                                        c3603.m6703(str9);
                                        c3603.m6675(j4);
                                        c3603.m6678((List) abstractC16192);
                                        c7182.f18761 = c3603.m6672();
                                    }
                                } else if (iM437318 == 1835365492) {
                                    int i58 = c16568.f48656;
                                    c19207.m43730(iM43734 + 16);
                                    if (iM437318 == 1835365492) {
                                        c19207.m43734();
                                        String strM43734 = c19207.m43734();
                                        if (strM43734 != null) {
                                            C3601 c3604 = new C3601();
                                            c3604.m6699(i58);
                                            c3604.m6697(strM43734);
                                            c7182.f18761 = c3604.m6672();
                                        }
                                    }
                                } else if (iM437318 == 1667329389) {
                                    C3601 c3605 = new C3601();
                                    c3605.m6699(c16568.f48656);
                                    c3605.m6697("application/x-camera-motion");
                                    c7182.f18761 = c3605.m6672();
                                }
                                c19922 = c19923;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c31011 = c31013;
                            }
                            i11 = iM437317;
                            i12 = iM43734;
                            c7181 = c7182;
                            c19203 = c19207;
                            i8 = i9;
                            i7 = i12;
                            i6 = i11;
                        }
                        c19203.m43730(i7 + i6);
                        i29 = i8 + 1;
                        c21037 = c21037;
                        c7182 = c7181;
                        c19207 = c19203;
                        str9 = str9;
                        iM437316 = i32;
                        i = i33;
                        c19923 = c19922;
                        j3 = j3;
                        arrayList5 = arrayList5;
                        i21 = i21;
                        arrayList6 = arrayList3;
                        c31013 = c31011;
                    }
                }
                C15936 c15938 = (C15936) interfaceC18263.apply(c15936);
                if (c15938 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C3109 c3109M5307 = c31010.m5303(i5);
                    c3109M5307.getClass();
                    C3109 c3109M5308 = c3109M5307.m5303(1835626086);
                    c3109M5308.getClass();
                    C3109 c3109M5309 = c3109M5308.m5303(1937007212);
                    c3109M5309.getClass();
                    C21973 c21973M51822 = m51822(c15938, c3109M5309, c9704);
                    arrayList4 = arrayList2;
                    arrayList4.add(c21973M51822);
                }
            }
            i21 = i4 + 1;
            c31012 = c3109;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX INFO: renamed from: ֫ */
    public static C25079 m51824(C9815 c9815) {
        int iM43715;
        C19203 c19203 = c9815.f27154;
        c19203.m43730(8);
        C25079 c25079 = new C25079(new InterfaceC16361[0]);
        while (c19203.m43703() >= 8) {
            int iM43731 = c19203.m43731();
            int iM43739 = c19203.m43739();
            int iM437310 = c19203.m43739();
            C25079 c250710 = null;
            if (iM437310 == 1835365473) {
                c19203.m43730(iM43731);
                int i = iM43731 + iM43739;
                c19203.m43724(8);
                m51825(c19203);
                while (c19203.m43731() < i) {
                    int iM43732 = c19203.m43731();
                    int iM437311 = c19203.m43739();
                    if (c19203.m43739() == 1768715124) {
                        c19203.m43730(iM43732);
                        int i2 = iM43732 + iM437311;
                        c19203.m43724(8);
                        ArrayList arrayList = new ArrayList();
                        while (c19203.m43731() < i2) {
                            AbstractC16269 abstractC16269M27188 = C11876.m27188(c19203);
                            if (abstractC16269M27188 != null) {
                                arrayList.add(abstractC16269M27188);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c250710 = new C25079(arrayList);
                            break;
                        }
                        break;
                    }
                    c19203.m43730(iM43732 + iM437311);
                }
                c25079 = c25079.m55051(c250710);
            } else if (iM437310 == 1936553057) {
                c19203.m43730(iM43731);
                int i3 = iM43731 + iM43739;
                c19203.m43724(12);
                while (c19203.m43731() < i3) {
                    int iM43733 = c19203.m43731();
                    int iM437312 = c19203.m43739();
                    if (c19203.m43739() == 1935766900) {
                        if (iM437312 < 16) {
                            break;
                        }
                        c19203.m43724(4);
                        int i4 = -1;
                        int i5 = 0;
                        for (int i6 = 0; i6 < 2; i6++) {
                            int iM43702 = c19203.m43702();
                            int iM43703 = c19203.m43702();
                            if (iM43702 == 0) {
                                i4 = iM43703;
                            } else if (iM43702 == 1) {
                                i5 = iM43703;
                            }
                        }
                        if (i4 == 12) {
                            iM43715 = 240;
                        } else if (i4 == 13) {
                            iM43715 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else if (i4 == 21 && c19203.m43703() >= 8 && c19203.m43731() + 8 <= i3) {
                            int iM437313 = c19203.m43739();
                            int iM437314 = c19203.m43739();
                            if (iM437313 < 12 || iM437314 != 1936877170) {
                                iM43715 = SecP160R1Field.PInv;
                            } else {
                                iM43715 = c19203.m43715();
                            }
                        } else {
                            iM43715 = SecP160R1Field.PInv;
                        }
                        if (iM43715 == -2147483647) {
                            break;
                        }
                        c250710 = new C25079(new C20965(iM43715, i5));
                        break;
                    }
                    c19203.m43730(iM43733 + iM437312);
                }
                c25079 = c25079.m55051(c250710);
            } else if (iM437310 == -1451722374) {
                short sM43701 = c19203.m43701();
                c19203.m43724(2);
                String strM43705 = c19203.m43705(sM43701, StandardCharsets.UTF_8);
                int iMax = Math.max(strM43705.lastIndexOf(43), strM43705.lastIndexOf(45));
                try {
                    c250710 = new C25079(new C22557(Float.parseFloat(strM43705.substring(0, iMax)), Float.parseFloat(strM43705.substring(iMax, strM43705.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                c25079 = c25079.m55051(c250710);
            }
            c19203.m43730(iM43731 + iM43739);
        }
        return c25079;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C23227 m51828(C19203 c19203) {
        long jM43733;
        long jM43734;
        c19203.m43730(8);
        if (m51818(c19203.m43739()) == 0) {
            jM43733 = c19203.m43725();
            jM43734 = c19203.m43725();
        } else {
            jM43733 = c19203.m43733();
            jM43734 = c19203.m43733();
        }
        return new C23227(jM43733, jM43734, c19203.m43725());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25079 m51823(C3109 c3109) {
        C2438 c2438;
        C9815 c9815M5304 = c3109.m5304(1751411826);
        C9815 c9815M5305 = c3109.m5304(1801812339);
        C9815 c9815M5306 = c3109.m5304(1768715124);
        if (c9815M5304 != null && c9815M5305 != null && c9815M5306 != null) {
            C19203 c19203 = c9815M5304.f27154;
            c19203.m43730(16);
            if (c19203.m43739() == 1835299937) {
                C19203 c19204 = c9815M5305.f27154;
                c19204.m43730(12);
                int iM43739 = c19204.m43739();
                String[] strArr = new String[iM43739];
                for (int i = 0; i < iM43739; i++) {
                    int iM437310 = c19204.m43739();
                    c19204.m43724(4);
                    strArr[i] = c19204.m43705(iM437310 - 8, StandardCharsets.UTF_8);
                }
                C19203 c19205 = c9815M5306.f27154;
                c19205.m43730(8);
                ArrayList arrayList = new ArrayList();
                while (c19205.m43703() > 8) {
                    int iM43731 = c19205.m43731();
                    int iM437311 = c19205.m43739();
                    int iM437312 = c19205.m43739() - 1;
                    if (iM437312 < 0 || iM437312 >= iM43739) {
                        C10050.m23419(iM437312, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iM437312];
                        int i2 = iM43731 + iM437311;
                        while (true) {
                            int iM43732 = c19205.m43731();
                            if (iM43732 >= i2) {
                                c2438 = null;
                                break;
                            }
                            int iM437313 = c19205.m43739();
                            if (c19205.m43739() == 1684108385) {
                                int iM437314 = c19205.m43739();
                                int iM437315 = c19205.m43739();
                                int i3 = iM437313 - 16;
                                byte[] bArr = new byte[i3];
                                c19205.m43707(0, i3, bArr);
                                c2438 = new C2438(iM437315, iM437314, str, bArr);
                                break;
                            }
                            c19205.m43730(iM43732 + iM437313);
                        }
                        if (c2438 != null) {
                            arrayList.add(c2438);
                        }
                    }
                    c19205.m43730(iM43731 + iM437311);
                }
                if (!arrayList.isEmpty()) {
                    return new C25079(arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51825(C19203 c19203) {
        int iM43731 = c19203.m43731();
        c19203.m43724(4);
        if (c19203.m43739() != 1751411826) {
            iM43731 += 4;
        }
        c19203.m43730(iM43731);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ac A[DONT_INVERT, LOOP:14: B:102:0x02ac->B:106:0x02b6, LOOP_START, PHI: r20
      0x02ac: PHI (r20v3 int) = (r20v2 int), (r20v4 int) binds: [B:101:0x02aa, B:106:0x02b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b6 A[LOOP:14: B:102:0x02ac->B:106:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02bc A[EDGE_INSN: B:107:0x02bc->B:108:0x02bd BREAK  A[LOOP:14: B:102:0x02ac->B:106:0x02b6]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x0304  */
    /* JADX WARN: Code duplicated, block: B:126:0x0322  */
    /* JADX WARN: Code duplicated, block: B:131:0x0348  */
    /* JADX WARN: Code duplicated, block: B:134:0x036c  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f  */
    /* JADX WARN: Code duplicated, block: B:162:0x042f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0438  */
    /* JADX WARN: Code duplicated, block: B:167:0x0440  */
    /* JADX WARN: Code duplicated, block: B:170:0x0449 A[LOOP:4: B:168:0x0446->B:170:0x0449, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x047b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0480  */
    /* JADX WARN: Code duplicated, block: B:177:0x0482  */
    /* JADX WARN: Code duplicated, block: B:181:0x0493  */
    /* JADX WARN: Code duplicated, block: B:183:0x049c  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:204:0x0500 A[LOOP:8: B:200:0x04f1->B:204:0x0500, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x050d  */
    /* JADX WARN: Code duplicated, block: B:208:0x050f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0516  */
    /* JADX WARN: Code duplicated, block: B:214:0x0533  */
    /* JADX WARN: Code duplicated, block: B:215:0x0535  */
    /* JADX WARN: Code duplicated, block: B:218:0x053a  */
    /* JADX WARN: Code duplicated, block: B:219:0x053d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0540  */
    /* JADX WARN: Code duplicated, block: B:222:0x0543  */
    /* JADX WARN: Code duplicated, block: B:224:0x0546  */
    /* JADX WARN: Code duplicated, block: B:226:0x054a  */
    /* JADX WARN: Code duplicated, block: B:227:0x054d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0561  */
    /* JADX WARN: Code duplicated, block: B:233:0x056b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0579  */
    /* JADX WARN: Code duplicated, block: B:237:0x0584  */
    /* JADX WARN: Code duplicated, block: B:239:0x05af  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:250:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:267:0x0503 A[EDGE_INSN: B:267:0x0503->B:205:0x0503 BREAK  A[LOOP:8: B:200:0x04f1->B:204:0x0500], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0503 A[EDGE_INSN: B:268:0x0503->B:205:0x0503 BREAK  A[LOOP:8: B:200:0x04f1->B:204:0x0500], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x01fe A[EDGE_INSN: B:279:0x01fe->B:73:0x01fe BREAK  A[LOOP:12: B:69:0x01e1->B:72:0x01e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9 A[LOOP:12: B:69:0x01e1->B:72:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0228 A[ADDED_TO_REGION, LOOP:13: B:77:0x0228->B:79:0x022c, LOOP_START, PHI: r20 r29 r31
      0x0228: PHI (r20v6 int) = (r20v2 int), (r20v7 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r29v3 int) = (r29v1 int), (r29v5 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r31v4 int) = (r31v1 int), (r31v5 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:87:0x0255  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0280  */
    /* JADX INFO: renamed from: ֫ */
    public static C21973 m51822(C15936 c15936, C3109 c3109, C9704 c9704) throws C10998 {
        InterfaceC20593 c9863;
        boolean z;
        int iM43738;
        int iM43739;
        int iM437310;
        int iMo5413;
        int i;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iM437311;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        int iM437312;
        int i4;
        int iM437313;
        int i5;
        int i6;
        int i7;
        long[] jArrCopyOf;
        int i8;
        long[] jArrCopyOf2;
        int[] iArrCopyOf;
        int i9;
        int[] iArrCopyOf2;
        long j4;
        boolean z2;
        int i10;
        C15936 c15937;
        String str;
        int i11;
        int[] iArr3;
        long j5;
        boolean zM39004;
        int i12;
        int i13;
        int iMo5412;
        int i14;
        int iM437314;
        int iM437315;
        long j6;
        C15936 c15936M36168;
        long j7;
        C10307 c10307;
        int i15;
        long[] jArr3;
        int i16;
        long jM12993;
        long[] jArr4;
        int i17;
        C10307 c10308;
        int i18;
        int i19;
        boolean z3;
        int[] iArr4;
        int[] iArr5;
        int i20;
        int i21;
        boolean z4;
        int i22;
        int[] iArr6;
        int[] iArr7;
        boolean z5;
        boolean z6;
        long[] jArr5;
        int[] iArr8;
        int[] iArr9;
        long[] jArr6;
        int i23;
        long[] jArr7;
        boolean z7;
        int i24;
        int i25;
        long j8;
        long j9;
        int i26;
        int i27;
        int i28;
        boolean z8;
        boolean z9;
        long jM12994;
        boolean z10;
        int[] iArr10;
        long j10;
        int[] iArr11;
        long j11;
        int i29;
        int i30;
        int i31;
        boolean z11;
        int i32;
        int i33;
        int i34;
        long j12;
        int i35;
        long jM12995;
        C15936 c15936M36169 = c15936;
        C10307 c10309 = c15936M36169.f46112;
        C9815 c9815M5304 = c3109.m5304(1937011578);
        if (c9815M5304 != null) {
            c9863 = new C3157(c9815M5304, c10309);
        } else {
            C9815 c9815M5305 = c3109.m5304(1937013298);
            if (c9815M5305 == null) {
                throw C10998.m25387("Track has no sample table size information", (Throwable) null);
            }
            c9863 = new C9863(c9815M5305);
        }
        int iMo5414 = c9863.mo5414();
        if (iMo5414 == 0) {
            return new C21973(c15936, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (c15936M36169.f46103 == 2) {
            long j13 = c15936M36169.f46114;
            if (j13 > 0) {
                C3601 c3601M23918 = c10309.m23918();
                c3601M23918.m6673(iMo5414 / (j13 / 1000000.0f));
                c15936M36169 = c15936M36169.m36168(c3601M23918.m6672());
            }
        }
        C10307 c103010 = c15936M36169.f46112;
        C9815 c9815M5306 = c3109.m5304(1937007471);
        if (c9815M5306 == null) {
            c9815M5306 = c3109.m5304(1668232756);
            c9815M5306.getClass();
            z = true;
        } else {
            z = false;
        }
        C19203 c19203 = c9815M5306.f27154;
        C9815 c9815M5307 = c3109.m5304(1937011555);
        c9815M5307.getClass();
        C19203 c19204 = c9815M5307.f27154;
        C9815 c9815M5308 = c3109.m5304(1937011827);
        c9815M5308.getClass();
        C19203 c19205 = c9815M5308.f27154;
        C9815 c9815M5309 = c3109.m5304(1937011571);
        C19203 c19206 = c9815M5309 != null ? c9815M5309.f27154 : null;
        C9815 c9815M53010 = c3109.m5304(1668576371);
        C19203 c19207 = c9815M53010 != null ? c9815M53010.f27154 : null;
        C17238 c17238 = new C17238(c19204, c19203, z);
        c19205.m43730(12);
        int iM437316 = c19205.m43738() - 1;
        int iM437317 = c19205.m43738();
        int iM437318 = c19205.m43738();
        if (c19207 != null) {
            c19207.m43730(12);
            iM43738 = c19207.m43738();
        } else {
            iM43738 = 0;
        }
        if (c19206 != null) {
            c19206.m43730(12);
            iM43739 = c19206.m43738();
            if (iM43739 > 0) {
                iM437310 = c19206.m43738() - 1;
            } else {
                c19206 = null;
            }
            iMo5413 = c9863.mo5413();
            i = iM437310;
            String str2 = c103010.f28528;
            if (iMo5413 == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM437316 == 0 && iM43738 == 0 && iM43739 == 0)) {
                int i36 = c17238.f51303;
                long[] jArr8 = new long[i36];
                int[] iArr12 = new int[i36];
                while (c17238.m39004()) {
                    int i37 = c17238.f51301;
                    jArr8[i37] = c17238.f51305;
                    iArr12[i37] = c17238.f51300;
                }
                long j14 = iM437318;
                int i38 = 8192 / iMo5413;
                int iM12975 = 0;
                for (int i39 = 0; i39 < i36; i39++) {
                    iM12975 += C5792.m12975(iArr12[i39], i38);
                }
                long[] jArr9 = new long[iM12975];
                iArrCopyOf2 = new int[iM12975];
                jArrCopyOf2 = new long[iM12975];
                int[] iArr13 = new int[iM12975];
                int i40 = 0;
                i11 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = iArr12[i43];
                    long j15 = jArr8[i43];
                    int i45 = i36;
                    int i46 = i44;
                    int i47 = i41;
                    long[] jArr10 = jArr8;
                    int i48 = i11;
                    int i49 = i47;
                    while (i46 > 0) {
                        int iMin = Math.min(i38, i46);
                        jArr9[i49] = j15;
                        int[] iArr14 = iArr12;
                        int i50 = iMo5413 * iMin;
                        iArrCopyOf2[i49] = i50;
                        i42 += i50;
                        int iMax = Math.max(i48, i50);
                        jArrCopyOf2[i49] = ((long) i40) * j14;
                        iArr13[i49] = 1;
                        j15 += (long) iArrCopyOf2[i49];
                        i40 += iMin;
                        i46 -= iMin;
                        i49++;
                        iArr12 = iArr14;
                        i48 = iMax;
                    }
                    i43++;
                    i36 = i45;
                    int i51 = i49;
                    i11 = i48;
                    jArr8 = jArr10;
                    i41 = i51;
                }
                j5 = i42;
                c15937 = c15936M36169;
                j4 = j14 * ((long) i40);
                jArrCopyOf = jArr9;
                iArr3 = iArr13;
            } else {
                jArr = new long[iMo5414];
                iArr = new int[iMo5414];
                jArr2 = new long[iMo5414];
                iArr2 = new int[iMo5414];
                iM437311 = i;
                C15936 c15938 = c15936M36169;
                i2 = 0;
                i3 = 0;
                j = 0;
                j2 = 0;
                j3 = 0;
                iM437312 = 0;
                i4 = 0;
                iM437313 = 0;
                int i52 = iM43738;
                i5 = iM437318;
                i6 = iM437317;
                i7 = i52;
                while (true) {
                    if (i2 >= iMo5414) {
                        jArrCopyOf = jArr;
                        i8 = i6;
                        jArrCopyOf2 = jArr2;
                        iArrCopyOf = iArr2;
                        i9 = i4;
                        iArrCopyOf2 = iArr;
                        break;
                    }
                    zM39004 = true;
                    while (i4 == 0) {
                        zM39004 = c17238.m39004();
                        if (!zM39004) {
                            break;
                        }
                        int i53 = i6;
                        long j16 = c17238.f51305;
                        i4 = c17238.f51300;
                        j = j16;
                        i5 = i5;
                        iMo5414 = iMo5414;
                        i6 = i53;
                    }
                    i12 = iMo5414;
                    i8 = i6;
                    i13 = i5;
                    if (!zM39004) {
                        C21334.m48351("Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArr, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                        iArrCopyOf = Arrays.copyOf(iArr2, i2);
                        iMo5414 = i2;
                        i9 = i4;
                        break;
                    }
                    if (c19207 != null) {
                        while (iM437312 == 0 && i7 > 0) {
                            iM437312 = c19207.m43738();
                            iM437313 = c19207.m43739();
                            i7--;
                        }
                        iM437312--;
                    }
                    int i54 = iM437313;
                    jArr[i2] = j;
                    iMo5412 = c9863.mo5412();
                    iArr[i2] = iMo5412;
                    long[] jArr11 = jArr;
                    int[] iArr15 = iArr;
                    j3 += (long) iMo5412;
                    if (iMo5412 > i3) {
                        i3 = iMo5412;
                    }
                    jArr2[i2] = j2 + ((long) i54);
                    if (c19206 == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    iArr2[i2] = i14;
                    if (i2 == iM437311) {
                        iArr2[i2] = 1;
                        iM43739--;
                        if (iM43739 > 0) {
                            c19206.getClass();
                            iM437311 = c19206.m43738() - 1;
                        }
                    }
                    j2 += (long) i13;
                    iM437314 = i8 - 1;
                    if (iM437314 == 0 || iM437316 <= 0) {
                        iM437315 = i13;
                    } else {
                        iM437314 = c19205.m43738();
                        iM437315 = c19205.m43739();
                        iM437316--;
                    }
                    i6 = iM437314;
                    int i55 = iM437315;
                    j += (long) iArr15[i2];
                    i4--;
                    i2++;
                    iM437313 = i54;
                    jArr = jArr11;
                    iArr = iArr15;
                    iMo5414 = i12;
                    i5 = i55;
                }
                j4 = j2 + ((long) iM437313);
                if (c19207 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i7 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (c19207.m43738() != 0) {
                        z2 = false;
                        break;
                    }
                    c19207.m43739();
                    i7--;
                }
                if (iM43739 != 0 && i8 == 0 && i9 == 0 && iM437316 == 0) {
                    i10 = iM437312;
                    if (i10 == 0 && z2) {
                        c15937 = c15938;
                    }
                    iMo5414 = iMo5414;
                    i11 = i3;
                    iArr3 = iArrCopyOf;
                    j5 = j3;
                } else {
                    i10 = iM437312;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                c15937 = c15938;
                C7913.m18269(sb, c15937.f46108, ": remainingSynchronizationSamples ", iM43739, ", remainingSamplesAtTimestampDelta ");
                C7913.m18269(sb, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb.append(iM437316);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i10);
                if (z2) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb.append(str);
                C21334.m48351(sb.toString());
                iMo5414 = iMo5414;
                i11 = i3;
                iArr3 = iArrCopyOf;
                j5 = j3;
            }
            j6 = c15937.f46114;
            if (j6 > 0) {
                jM12995 = C5792.m12993(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
                if (jM12995 > 0 || jM12995 >= 2147483647L) {
                    c15936M36168 = c15937;
                } else {
                    C3601 c3601M23919 = c103010.m23918();
                    c3601M23919.m6700((int) jM12995);
                    c15936M36168 = c15937.m36168(c3601M23919.m6672());
                }
            } else {
                c15936M36168 = c15937;
            }
            j7 = c15936M36168.f46109;
            c10307 = c15936M36168.f46112;
            i15 = c15936M36168.f46103;
            jArr3 = c15936M36168.f46110;
            long[] jArr12 = c15936M36168.f46107;
            RoundingMode roundingMode = RoundingMode.DOWN;
            i16 = iMo5414;
            jM12993 = C5792.m12993(j4, 1000000L, j7, roundingMode);
            jArr4 = jArr12;
            if (jArr4 == null) {
                C5792.m13002(jArrCopyOf2, j7);
                return new C21973(c15936M36168, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM12993);
            }
            if (jArr4.length == 1 || i15 != 1 || jArrCopyOf2.length < 2) {
                i17 = i15;
                c10308 = c10307;
            } else {
                jArr3.getClass();
                long j17 = jArr3[0];
                long jM12996 = j17 + C5792.m12993(jArr4[0], c15936M36168.f46109, c15936M36168.f46104, roundingMode);
                int length = jArrCopyOf2.length - 1;
                int iM12976 = C5792.m12976(4, 0, length);
                int iM12977 = C5792.m12976(jArrCopyOf2.length - 4, 0, length);
                long j18 = jArrCopyOf2[0];
                if (j18 <= j17 && j17 < jArrCopyOf2[iM12976] && jArrCopyOf2[iM12977] < jM12996 && jM12996 <= j4) {
                    long j19 = j4 - jM12996;
                    long jM12997 = C5792.m12993(j17 - j18, c10307.f28538, c15936M36168.f46109, roundingMode);
                    i17 = i15;
                    c10308 = c10307;
                    long jM12998 = C5792.m12993(j19, c10307.f28538, c15936M36168.f46109, roundingMode);
                    if ((jM12997 != 0 || jM12998 != 0) && jM12997 <= 2147483647L && jM12998 <= 2147483647L) {
                        c9704.f26765 = (int) jM12997;
                        c9704.f26766 = (int) jM12998;
                        C5792.m13002(jArrCopyOf2, j7);
                        return new C21973(c15936M36168, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C5792.m12993(jArr4[0], 1000000L, c15936M36168.f46104, roundingMode));
                    }
                } else {
                    i17 = i15;
                    c10308 = c10307;
                }
            }
            i18 = 1;
            if (jArr4.length == 1) {
                if (jArr4[0] == 0) {
                    jArr3.getClass();
                    j12 = jArr3[0];
                    for (i35 = 0; i35 < jArrCopyOf2.length; i35++) {
                        jArrCopyOf2[i35] = C5792.m12993(jArrCopyOf2[i35] - j12, 1000000L, c15936M36168.f46109, RoundingMode.DOWN);
                    }
                    return new C21973(c15936M36168, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C5792.m12993(j4 - j12, 1000000L, c15936M36168.f46109, RoundingMode.DOWN));
                }
                i18 = 1;
            }
            i19 = i17;
            if (i19 == i18) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr4 = new int[jArr4.length];
            iArr5 = new int[jArr4.length];
            jArr3.getClass();
            i20 = 0;
            i21 = 0;
            z4 = false;
            i22 = 0;
            while (i21 < jArr4.length) {
                iArr10 = iArr4;
                j10 = jArr3[i21];
                if (j10 != -1) {
                    boolean z12 = z4;
                    int i56 = i22;
                    iArr11 = iArr5;
                    long jM12999 = C5792.m12993(jArr4[i21], c15936M36168.f46109, c15936M36168.f46104, RoundingMode.DOWN);
                    iArr10[i21] = C5792.m13012(jArrCopyOf2, j10, true);
                    j11 = j10 + jM12999;
                    iArr11[i21] = C5792.m12988(jArrCopyOf2, j11, z3);
                    i29 = iArr10[i21];
                    while (true) {
                        i30 = iArr10[i21];
                        if (i30 < 0 || (iArr3[i30] & 1) != 0) {
                            break;
                        }
                        iArr10[i21] = i30 - 1;
                    }
                    if (i30 < 0) {
                        iArr10[i21] = i29;
                        while (true) {
                            i34 = iArr10[i21];
                            if (i34 >= iArr11[i21] || (iArr3[i34] & 1) != 0) {
                                break;
                            }
                            iArr10[i21] = i34 + 1;
                        }
                    }
                    if (i19 == 2 && iArr10[i21] != iArr11[i21]) {
                        while (true) {
                            i32 = iArr11[i21];
                            if (i32 < jArrCopyOf2.length - 1) {
                                break;
                            }
                            i33 = i32 + 1;
                            if (jArrCopyOf2[i33] <= j11) {
                                break;
                            }
                            iArr11[i21] = i33;
                        }
                    }
                    int i57 = iArr11[i21];
                    i31 = iArr10[i21];
                    int i58 = (i57 - i31) + i56;
                    if (i20 != i31) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i20 = i57;
                    z4 = z11 | z12;
                    i22 = i58;
                } else {
                    iArr11 = iArr5;
                }
                i21++;
                iArr4 = iArr10;
                iArr5 = iArr11;
                jArr4 = jArr4;
            }
            iArr6 = iArr4;
            long[] jArr13 = jArr4;
            iArr7 = iArr5;
            boolean z13 = z4;
            if (i22 != i16) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z13 | z5;
            if (z6) {
                jArr5 = new long[i22];
            } else {
                jArr5 = jArrCopyOf;
            }
            if (z6) {
                iArr8 = new int[i22];
            } else {
                iArr8 = iArrCopyOf2;
            }
            if (z6) {
                i11 = 0;
            }
            if (z6) {
                iArr9 = new int[i22];
            } else {
                iArr9 = iArr3;
            }
            jArr6 = new long[i22];
            i23 = i11;
            z7 = false;
            i24 = 0;
            i25 = 0;
            j8 = 0;
            for (jArr7 = jArr13; i25 < jArr7.length; jArr7 = jArr7) {
                j9 = jArr3[i25];
                i26 = iArr6[i25];
                int[] iArr16 = iArr6;
                i27 = iArr7[i25];
                if (z6) {
                    int i59 = i27 - i26;
                    System.arraycopy(jArrCopyOf, i26, jArr5, i24, i59);
                    System.arraycopy(iArrCopyOf2, i26, iArr8, i24, i59);
                    System.arraycopy(iArr3, i26, iArr9, i24, i59);
                }
                int[] iArr17 = iArr3;
                i28 = i26;
                int i60 = i23;
                z8 = z7;
                while (i28 < i27) {
                    int[] iArr18 = iArr9;
                    z9 = z8;
                    long j20 = c15936M36168.f46104;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jM129910 = C5792.m12993(j8, 1000000L, j20, roundingMode2);
                    long[] jArr14 = jArrCopyOf2;
                    long[] jArr15 = jArrCopyOf;
                    jM12994 = C5792.m12993(jArrCopyOf2[i28] - j9, 1000000L, c15936M36168.f46109, roundingMode2);
                    if (jM12994 < 0) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    jArr6[i24] = jM129910 + jM12994;
                    if (!z6 && iArr8[i24] > i60) {
                        i60 = iArrCopyOf2[i28];
                    }
                    i24++;
                    i28++;
                    z8 = z10;
                    iArr9 = iArr18;
                    jArrCopyOf = jArr15;
                    jArrCopyOf2 = jArr14;
                }
                z7 = z8;
                j8 += jArr7[i25];
                i25++;
                iArr6 = iArr16;
                i23 = i60;
                iArr3 = iArr17;
                iArr9 = iArr9;
            }
            int[] iArr19 = iArr9;
            long jM129911 = C5792.m12993(j8, 1000000L, c15936M36168.f46104, RoundingMode.DOWN);
            if (z7) {
                C3601 c3601M239110 = c10308.m23918();
                c3601M239110.m6691();
                c15936M36168 = c15936M36168.m36168(c3601M239110.m6672());
            }
            return new C21973(c15936M36168, jArr5, iArr8, i23, jArr6, iArr19, jM129911);
        }
        iM43739 = 0;
        iM437310 = -1;
        iMo5413 = c9863.mo5413();
        i = iM437310;
        String str3 = c103010.f28528;
        if (iMo5413 == -1) {
            jArr = new long[iMo5414];
            iArr = new int[iMo5414];
            jArr2 = new long[iMo5414];
            iArr2 = new int[iMo5414];
            iM437311 = i;
            C15936 c15939 = c15936M36169;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM437312 = 0;
            i4 = 0;
            iM437313 = 0;
            int i510 = iM43738;
            i5 = iM437318;
            i6 = iM437317;
            i7 = i510;
            while (true) {
                if (i2 >= iMo5414) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM39004 = true;
                while (i4 == 0) {
                    zM39004 = c17238.m39004();
                    if (!zM39004) {
                        break;
                        break;
                    }
                    int i511 = i6;
                    long j110 = c17238.f51305;
                    i4 = c17238.f51300;
                    j = j110;
                    i5 = i5;
                    iMo5414 = iMo5414;
                    i6 = i511;
                }
                i12 = iMo5414;
                i8 = i6;
                i13 = i5;
                if (!zM39004) {
                    C21334.m48351("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo5414 = i2;
                    i9 = i4;
                    break;
                }
                if (c19207 != null) {
                    while (iM437312 == 0) {
                        iM437312 = c19207.m43738();
                        iM437313 = c19207.m43739();
                        i7--;
                    }
                    iM437312--;
                }
                int i512 = iM437313;
                jArr[i2] = j;
                iMo5412 = c9863.mo5412();
                iArr[i2] = iMo5412;
                long[] jArr16 = jArr;
                int[] iArr110 = iArr;
                j3 += (long) iMo5412;
                if (iMo5412 > i3) {
                    i3 = iMo5412;
                }
                jArr2[i2] = j2 + ((long) i512);
                if (c19206 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM437311) {
                    iArr2[i2] = 1;
                    iM43739--;
                    if (iM43739 > 0) {
                        c19206.getClass();
                        iM437311 = c19206.m43738() - 1;
                    }
                }
                j2 += (long) i13;
                iM437314 = i8 - 1;
                if (iM437314 == 0) {
                    iM437315 = i13;
                } else {
                    iM437315 = i13;
                }
                i6 = iM437314;
                int i513 = iM437315;
                j += (long) iArr110[i2];
                i4--;
                i2++;
                iM437313 = i512;
                jArr = jArr16;
                iArr = iArr110;
                iMo5414 = i12;
                i5 = i513;
            }
            j4 = j2 + ((long) iM437313);
            if (c19207 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c19207.m43738() != 0) {
                    z2 = false;
                    break;
                }
                c19207.m43739();
                i7--;
            }
            if (iM43739 != 0) {
                i10 = iM437312;
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                c15937 = c15939;
                C7913.m18269(sb2, c15937.f46108, ": remainingSynchronizationSamples ", iM43739, ", remainingSamplesAtTimestampDelta ");
                C7913.m18269(sb2, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb2.append(iM437316);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                C21334.m48351(sb2.toString());
            } else {
                i10 = iM437312;
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                c15937 = c15939;
                C7913.m18269(sb3, c15937.f46108, ": remainingSynchronizationSamples ", iM43739, ", remainingSamplesAtTimestampDelta ");
                C7913.m18269(sb3, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb3.append(iM437316);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                C21334.m48351(sb3.toString());
            }
            iMo5414 = iMo5414;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        } else {
            jArr = new long[iMo5414];
            iArr = new int[iMo5414];
            jArr2 = new long[iMo5414];
            iArr2 = new int[iMo5414];
            iM437311 = i;
            C15936 c159310 = c15936M36169;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM437312 = 0;
            i4 = 0;
            iM437313 = 0;
            int i514 = iM43738;
            i5 = iM437318;
            i6 = iM437317;
            i7 = i514;
            while (true) {
                if (i2 >= iMo5414) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM39004 = true;
                while (i4 == 0) {
                    zM39004 = c17238.m39004();
                    if (!zM39004) {
                        break;
                        break;
                    }
                    int i515 = i6;
                    long j111 = c17238.f51305;
                    i4 = c17238.f51300;
                    j = j111;
                    i5 = i5;
                    iMo5414 = iMo5414;
                    i6 = i515;
                }
                i12 = iMo5414;
                i8 = i6;
                i13 = i5;
                if (!zM39004) {
                    C21334.m48351("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo5414 = i2;
                    i9 = i4;
                    break;
                }
                if (c19207 != null) {
                    while (iM437312 == 0) {
                        iM437312 = c19207.m43738();
                        iM437313 = c19207.m43739();
                        i7--;
                    }
                    iM437312--;
                }
                int i516 = iM437313;
                jArr[i2] = j;
                iMo5412 = c9863.mo5412();
                iArr[i2] = iMo5412;
                long[] jArr17 = jArr;
                int[] iArr111 = iArr;
                j3 += (long) iMo5412;
                if (iMo5412 > i3) {
                    i3 = iMo5412;
                }
                jArr2[i2] = j2 + ((long) i516);
                if (c19206 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM437311) {
                    iArr2[i2] = 1;
                    iM43739--;
                    if (iM43739 > 0) {
                        c19206.getClass();
                        iM437311 = c19206.m43738() - 1;
                    }
                }
                j2 += (long) i13;
                iM437314 = i8 - 1;
                if (iM437314 == 0) {
                    iM437315 = i13;
                } else {
                    iM437315 = i13;
                }
                i6 = iM437314;
                int i517 = iM437315;
                j += (long) iArr111[i2];
                i4--;
                i2++;
                iM437313 = i516;
                jArr = jArr17;
                iArr = iArr111;
                iMo5414 = i12;
                i5 = i517;
            }
            j4 = j2 + ((long) iM437313);
            if (c19207 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c19207.m43738() != 0) {
                    z2 = false;
                    break;
                }
                c19207.m43739();
                i7--;
            }
            if (iM43739 != 0) {
                i10 = iM437312;
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                c15937 = c159310;
                C7913.m18269(sb4, c15937.f46108, ": remainingSynchronizationSamples ", iM43739, ", remainingSamplesAtTimestampDelta ");
                C7913.m18269(sb4, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb4.append(iM437316);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                C21334.m48351(sb4.toString());
            } else {
                i10 = iM437312;
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                c15937 = c159310;
                C7913.m18269(sb5, c15937.f46108, ": remainingSynchronizationSamples ", iM43739, ", remainingSamplesAtTimestampDelta ");
                C7913.m18269(sb5, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb5.append(iM437316);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                C21334.m48351(sb5.toString());
            }
            iMo5414 = iMo5414;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        }
        j6 = c15937.f46114;
        if (j6 > 0) {
            jM12995 = C5792.m12993(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
            if (jM12995 > 0) {
                c15936M36168 = c15937;
            } else {
                c15936M36168 = c15937;
            }
        } else {
            c15936M36168 = c15937;
        }
        j7 = c15936M36168.f46109;
        c10307 = c15936M36168.f46112;
        i15 = c15936M36168.f46103;
        jArr3 = c15936M36168.f46110;
        long[] jArr18 = c15936M36168.f46107;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        i16 = iMo5414;
        jM12993 = C5792.m12993(j4, 1000000L, j7, roundingMode3);
        jArr4 = jArr18;
        if (jArr4 == null) {
            C5792.m13002(jArrCopyOf2, j7);
            return new C21973(c15936M36168, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM12993);
        }
        if (jArr4.length == 1) {
            i17 = i15;
            c10308 = c10307;
        } else {
            i17 = i15;
            c10308 = c10307;
        }
        i18 = 1;
        if (jArr4.length == 1) {
            if (jArr4[0] == 0) {
                jArr3.getClass();
                j12 = jArr3[0];
                while (i35 < jArrCopyOf2.length) {
                    jArrCopyOf2[i35] = C5792.m12993(jArrCopyOf2[i35] - j12, 1000000L, c15936M36168.f46109, RoundingMode.DOWN);
                }
                return new C21973(c15936M36168, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C5792.m12993(j4 - j12, 1000000L, c15936M36168.f46109, RoundingMode.DOWN));
            }
            i18 = 1;
        }
        i19 = i17;
        if (i19 == i18) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr4 = new int[jArr4.length];
        iArr5 = new int[jArr4.length];
        jArr3.getClass();
        i20 = 0;
        i21 = 0;
        z4 = false;
        i22 = 0;
        while (i21 < jArr4.length) {
            iArr10 = iArr4;
            j10 = jArr3[i21];
            if (j10 != -1) {
                boolean z14 = z4;
                int i518 = i22;
                iArr11 = iArr5;
                long jM129912 = C5792.m12993(jArr4[i21], c15936M36168.f46109, c15936M36168.f46104, RoundingMode.DOWN);
                iArr10[i21] = C5792.m13012(jArrCopyOf2, j10, true);
                j11 = j10 + jM129912;
                iArr11[i21] = C5792.m12988(jArrCopyOf2, j11, z3);
                i29 = iArr10[i21];
                while (true) {
                    i30 = iArr10[i21];
                    if (i30 < 0) {
                        break;
                    }
                    break;
                    break;
                    iArr10[i21] = i30 - 1;
                }
                if (i30 < 0) {
                    iArr10[i21] = i29;
                    while (true) {
                        i34 = iArr10[i21];
                        if (i34 >= iArr11[i21]) {
                            break;
                        }
                        break;
                        break;
                        iArr10[i21] = i34 + 1;
                    }
                }
                if (i19 == 2) {
                    while (true) {
                        i32 = iArr11[i21];
                        if (i32 < jArrCopyOf2.length - 1) {
                            break;
                            break;
                        }
                        i33 = i32 + 1;
                        if (jArrCopyOf2[i33] <= j11) {
                            break;
                            break;
                        }
                        iArr11[i21] = i33;
                    }
                }
                int i519 = iArr11[i21];
                i31 = iArr10[i21];
                int i520 = (i519 - i31) + i518;
                if (i20 != i31) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i20 = i519;
                z4 = z11 | z14;
                i22 = i520;
            } else {
                iArr11 = iArr5;
            }
            i21++;
            iArr4 = iArr10;
            iArr5 = iArr11;
            jArr4 = jArr4;
        }
        iArr6 = iArr4;
        long[] jArr19 = jArr4;
        iArr7 = iArr5;
        boolean z15 = z4;
        if (i22 != i16) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z15 | z5;
        if (z6) {
            jArr5 = new long[i22];
        } else {
            jArr5 = jArrCopyOf;
        }
        if (z6) {
            iArr8 = new int[i22];
        } else {
            iArr8 = iArrCopyOf2;
        }
        if (z6) {
            i11 = 0;
        }
        if (z6) {
            iArr9 = new int[i22];
        } else {
            iArr9 = iArr3;
        }
        jArr6 = new long[i22];
        i23 = i11;
        z7 = false;
        i24 = 0;
        i25 = 0;
        j8 = 0;
        while (i25 < jArr7.length) {
            j9 = jArr3[i25];
            i26 = iArr6[i25];
            int[] iArr112 = iArr6;
            i27 = iArr7[i25];
            if (z6) {
                int i521 = i27 - i26;
                System.arraycopy(jArrCopyOf, i26, jArr5, i24, i521);
                System.arraycopy(iArrCopyOf2, i26, iArr8, i24, i521);
                System.arraycopy(iArr3, i26, iArr9, i24, i521);
            }
            int[] iArr113 = iArr3;
            i28 = i26;
            int i61 = i23;
            z8 = z7;
            while (i28 < i27) {
                int[] iArr114 = iArr9;
                z9 = z8;
                long j21 = c15936M36168.f46104;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jM129913 = C5792.m12993(j8, 1000000L, j21, roundingMode4);
                long[] jArr110 = jArrCopyOf2;
                long[] jArr111 = jArrCopyOf;
                jM12994 = C5792.m12993(jArrCopyOf2[i28] - j9, 1000000L, c15936M36168.f46109, roundingMode4);
                if (jM12994 < 0) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                jArr6[i24] = jM129913 + jM12994;
                if (!z6) {
                }
                i24++;
                i28++;
                z8 = z10;
                iArr9 = iArr114;
                jArrCopyOf = jArr111;
                jArrCopyOf2 = jArr110;
            }
            z7 = z8;
            j8 += jArr7[i25];
            i25++;
            iArr6 = iArr112;
            i23 = i61;
            iArr3 = iArr113;
            iArr9 = iArr9;
        }
        int[] iArr115 = iArr9;
        long jM129914 = C5792.m12993(j8, 1000000L, c15936M36168.f46104, RoundingMode.DOWN);
        if (z7) {
            C3601 c3601M239111 = c10308.m23918();
            c3601M239111.m6691();
            c15936M36168 = c15936M36168.m36168(c3601M239111.m6672());
        }
        return new C21973(c15936M36168, jArr5, iArr8, i23, jArr6, iArr115, jM129914);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0456 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0458  */
    /* JADX WARN: Code duplicated, block: B:204:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0462  */
    /* JADX WARN: Code duplicated, block: B:208:0x0465  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:343:0x0739  */
    /* JADX INFO: renamed from: ֫ */
    public static void m51826(C19203 c19203, int i, int i2, int i3, int i4, String str, int i5, C21037 c21037, C7181 c7181, int i6) throws C10998 {
        int i7;
        int i8;
        int i9;
        int i10;
        C9145 c9145;
        String str2;
        ByteBuffer byteBufferOrder;
        float fM43738;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM40558;
        int i19;
        C22378 c22378M20705;
        int i20;
        int iM40559;
        int i21;
        String str3;
        int i22 = i2;
        int i23 = i3;
        C21037 c21037M47450 = c21037;
        C7181 c7182 = c7181;
        c19203.m43730(i22 + 16);
        c19203.m43724(16);
        int iM43710 = c19203.m43710();
        int iM43711 = c19203.m43710();
        c19203.m43724(50);
        int iM43731 = c19203.m43731();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM51819 = m51819(c19203, i22, i23);
            if (pairM51819 != null) {
                iIntValue = ((Integer) pairM51819.first).intValue();
                c21037M47450 = c21037M47450 == null ? null : c21037M47450.m47450(((C24654) pairM51819.second).f78019);
                c7182.f18764[i6] = (C24654) pairM51819.second;
            }
            c19203.m43730(iM43731);
        }
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i24 = -1;
        List listM8329 = null;
        int i25 = -1;
        C10534 c10534 = null;
        C4499 c4499M51821 = null;
        boolean z = false;
        ByteBuffer byteBuffer = null;
        String str5 = null;
        byte[] bArr = null;
        C9145 c9146 = null;
        int i26 = 8;
        int i27 = 8;
        int iM50227 = -1;
        int i28 = -1;
        float f = 1.0f;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        C21037 c21038 = c21037M47450;
        int i32 = -1;
        while (iM43731 - i22 < i23) {
            c19203.m43730(iM43731);
            int iM43732 = c19203.m43731();
            int i33 = iM43731;
            int iM43739 = c19203.m43739();
            if (iM43739 == 0 && c19203.m43731() - i22 == i23) {
                break;
            }
            C23786.m52873("childAtomSize must be positive", iM43739 > 0);
            int iM437310 = c19203.m43739();
            if (iM437310 == 1635148611) {
                C23786.m52873(null, str4 == null);
                c19203.m43730(iM43732 + 8);
                C9310 c9310M21550 = C9310.m21550(c19203);
                ArrayList arrayList = c9310M21550.f25306;
                c7182.f18763 = c9310M21550.f25308;
                float f2 = !z ? c9310M21550.f25307 : f;
                String str6 = c9310M21550.f25312;
                int i34 = c9310M21550.f25315;
                int i35 = c9310M21550.f25313;
                int i36 = c9310M21550.f25314;
                iM50227 = c9310M21550.f25310;
                byteBufferOrder = byteBuffer;
                str5 = str6;
                i30 = i34;
                f = f2;
                i27 = c9310M21550.f25309;
                i26 = c9310M21550.f25305;
                i24 = i35;
                i28 = i36;
                str4 = "video/avc";
                listM8329 = arrayList;
            } else {
                int i37 = i32;
                if (iM437310 == 1752589123) {
                    C23786.m52873(null, str4 == null);
                    c19203.m43730(iM43732 + 8);
                    C12743 c12743M29264 = C12743.m29264(c19203);
                    List list = c12743M29264.f35786;
                    c7182.f18763 = c12743M29264.f35772;
                    float f3 = !z ? c12743M29264.f35773 : f;
                    int i38 = c12743M29264.f35776;
                    int i39 = c12743M29264.f35780;
                    String str7 = c12743M29264.f35781;
                    int i40 = c12743M29264.f35769;
                    if (i40 != -1) {
                        i37 = i40;
                    }
                    int i41 = c12743M29264.f35775;
                    int i42 = c12743M29264.f35787;
                    i24 = c12743M29264.f35782;
                    int i43 = c12743M29264.f35783;
                    int i44 = c12743M29264.f35779;
                    int i45 = c12743M29264.f35778;
                    int i46 = c12743M29264.f35771;
                    C9145 c9147 = c12743M29264.f35774;
                    c7182.f18762 = c12743M29264.f35784;
                    i30 = i38;
                    i31 = i39;
                    str5 = str7;
                    i25 = i41;
                    i27 = i45;
                    i26 = i46;
                    c9146 = c9147;
                    str4 = "video/hevc";
                    f = f3;
                    i28 = i43;
                    listM8329 = list;
                    i32 = i37;
                    i29 = i42;
                    iM50227 = i44;
                    byteBufferOrder = byteBuffer;
                } else {
                    String str8 = "childAtomSize must be positive";
                    if (iM437310 == 1818785347) {
                        C23786.m52873("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                        C23786.m52873("must have at least two layers", c9146 != null && c9146.f24762.size() >= 2);
                        c19203.m43730(iM43732 + 8);
                        c9146.getClass();
                        C12743 c12743M29265 = C12743.m29265(c19203, c9146);
                        C23786.m52873("invalid lhvC parameter sets", (c12743M29265.f35770 || c12743M29265.f35785 || c12743M29265.f35777) ? false : true);
                        C23786.m52873("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c7182.f18763 == c12743M29265.f35772);
                        int i47 = c12743M29265.f35782;
                        if (i47 != -1) {
                            C23786.m52873("colorSpace must be the same for both views", i24 == i47);
                        }
                        int i48 = c12743M29265.f35783;
                        if (i48 != -1) {
                            C23786.m52873("colorRange must be the same for both views", i28 == i48);
                        }
                        int i49 = c12743M29265.f35779;
                        if (i49 != -1) {
                            C23786.m52873("colorTransfer must be the same for both views", iM50227 == i49);
                        }
                        C23786.m52873("bitdepthLuma must be the same for both views", i27 == c12743M29265.f35778);
                        C23786.m52873("bitdepthChroma must be the same for both views", i26 == c12743M29265.f35771);
                        if (listM8329 != null) {
                            int i50 = AbstractC16192.f47662;
                            C4123 c4123 = new C4123();
                            c4123.m18183(listM8329);
                            c4123.m18183(c12743M29265.f35786);
                            listM8329 = c4123.m8329();
                        } else {
                            C23786.m52873("initializationData must be already set from hvcC atom", false);
                        }
                        String str9 = c12743M29265.f35781;
                        c7182.f18762 = false;
                        byteBufferOrder = byteBuffer;
                        str5 = str9;
                        str4 = "video/mv-hevc";
                        i32 = i37;
                    } else {
                        if (iM437310 == 1986361461) {
                            c19203.m43730(iM43732 + 8);
                            int iM43733 = c19203.m43731();
                            C5840 c5840 = null;
                            while (iM43733 - iM43732 < iM43739) {
                                c19203.m43730(iM43733);
                                int iM437311 = c19203.m43739();
                                String str10 = str8;
                                C23786.m52873(str10, iM437311 > 0);
                                int i51 = i26;
                                if (c19203.m43739() == 1702454643) {
                                    c19203.m43730(iM43733 + 8);
                                    int iM43734 = c19203.m43731();
                                    while (true) {
                                        if (iM43734 - iM43733 >= iM437311) {
                                            str3 = str10;
                                            c5840 = null;
                                            break;
                                        }
                                        c19203.m43730(iM43734);
                                        int iM437312 = c19203.m43739();
                                        C23786.m52873(str10, iM437312 > 0);
                                        str3 = str10;
                                        if (c19203.m43739() == 1937011305) {
                                            c19203.m43724(4);
                                            int iM43702 = c19203.m43702();
                                            c5840 = new C5840(new C2486((iM43702 & 1) == 1, (iM43702 & 2) == 2, (iM43702 & 8) == 8));
                                            break;
                                        }
                                        iM43734 += iM437312;
                                        str10 = str3;
                                    }
                                } else {
                                    str3 = str10;
                                }
                                iM43733 += iM437311;
                                i26 = i51;
                                str8 = str3;
                                i27 = i27;
                                i28 = i28;
                            }
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            C22605 c22605 = c5840 == null ? null : new C22605(c5840);
                            if (c22605 == null) {
                                i32 = i37;
                            } else if (c9146 == null || c9146.f24762.size() < 2) {
                                i32 = i37;
                                if (i32 == -1) {
                                    i32 = c22605.f71348.f14324.f4007 ? 5 : 4;
                                }
                            } else {
                                C23786.m52873("both eye views must be marked as available", c22605.m50662());
                                C23786.m52873("for MV-HEVC, eye_views_reversed must be set to false", !c22605.f71348.f14324.f4007);
                                i32 = i37;
                            }
                            byteBufferOrder = byteBuffer;
                            i11 = iIntValue;
                        } else {
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            i32 = i37;
                            if (iM437310 == 1685480259 || iM437310 == 1685485123 || iM437310 == 1685485379) {
                                i10 = i32;
                                c9145 = c9146;
                                int i52 = iM43739 - 8;
                                byte[] bArr2 = new byte[i52];
                                c19203.m43707(0, i52, bArr2);
                                if (listM8329 != null) {
                                    int i53 = AbstractC16192.f47662;
                                    C4123 c4124 = new C4123();
                                    c4124.m18183(listM8329);
                                    c4124.m18184(bArr2);
                                    listM8329 = c4124.m8329();
                                } else {
                                    C23786.m52873("initializationData must already be set from hvcC or avcC atom", false);
                                }
                                c19203.m43730(iM43732 + 8);
                                C20545 c20545M46450 = C20545.m46450(c19203);
                                if (c20545M46450 != null) {
                                    str2 = c20545M46450.f63508;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str2 = str5;
                                }
                                byteBufferOrder = byteBuffer;
                                fM43738 = f;
                            } else {
                                int i54 = 12;
                                if (iM437310 == 1987076931) {
                                    C23786.m52873(null, str4 == null);
                                    int i55 = iIntValue;
                                    String str11 = i55 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c19203.m43730(iM43732 + 12);
                                    byte bM43702 = (byte) c19203.m43702();
                                    byte bM43703 = (byte) c19203.m43702();
                                    int iM43703 = c19203.m43702();
                                    i26 = iM43703 >> 4;
                                    byte b = (byte) ((iM43703 >> 1) & 7);
                                    if (str11.equals("video/x-vnd.on2.vp9")) {
                                        int i56 = C19322.f57686;
                                        listM8329 = AbstractC16192.m36873of((Object) new byte[]{1, 1, bM43702, 2, 1, bM43703, 3, 1, (byte) i26, 4, 1, b});
                                    }
                                    boolean z2 = (iM43703 & 1) != 0;
                                    int iM43704 = c19203.m43702();
                                    int iM43705 = c19203.m43702();
                                    int iM50228 = C22378.m50228(iM43704);
                                    byteBufferOrder = byteBuffer;
                                    str4 = str11;
                                    i28 = z2 ? 1 : 2;
                                    i24 = iM50228;
                                    iM50227 = C22378.m50227(iM43705);
                                    iIntValue = i55;
                                    i27 = i26;
                                } else {
                                    i11 = iIntValue;
                                    if (iM437310 == 1635135811) {
                                        int i57 = iM43739 - 8;
                                        byte[] bArr3 = new byte[i57];
                                        c19203.m43707(0, i57, bArr3);
                                        listM8329 = AbstractC16192.m36873of((Object) bArr3);
                                        c19203.m43730(iM43732 + 8);
                                        C8966 c8966 = new C8966();
                                        byte[] bArrM43728 = c19203.m43728();
                                        C17861 c17861 = new C17861(bArrM43728, bArrM43728.length);
                                        c17861.m40569(c19203.m43731() * 8);
                                        c17861.m40562(1);
                                        int iM405510 = c17861.m40558(3);
                                        c17861.m40566(6);
                                        boolean zM40567 = c17861.m40567();
                                        boolean zM40568 = c17861.m40567();
                                        int i58 = 2;
                                        if (iM405510 != 2) {
                                            if (iM405510 <= i58) {
                                                if (zM40567) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c8966.m20710(i15);
                                                if (zM40567) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c8966.m20706(i16);
                                            }
                                        } else if (zM40567) {
                                            c8966.m20710(zM40568 ? 12 : 10);
                                            c8966.m20706(zM40568 ? 12 : 10);
                                        } else {
                                            i58 = 2;
                                            if (iM405510 <= i58) {
                                                if (zM40567) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c8966.m20710(i15);
                                                if (zM40567) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c8966.m20706(i16);
                                            }
                                        }
                                        c17861.m40566(13);
                                        c17861.m40561();
                                        int iM405511 = c17861.m40558(4);
                                        if (iM405511 != 1) {
                                            C21334.m48349("Unsupported obu_type: " + iM405511);
                                            c22378M20705 = c8966.m20705();
                                        } else if (c17861.m40567()) {
                                            C21334.m48349("Unsupported obu_extension_flag");
                                            c22378M20705 = c8966.m20705();
                                        } else {
                                            boolean zM40569 = c17861.m40567();
                                            c17861.m40561();
                                            if (zM40569 && c17861.m40558(8) > 127) {
                                                C21334.m48349("Excessive obu_size");
                                                c22378M20705 = c8966.m20705();
                                            } else {
                                                int iM405512 = c17861.m40558(3);
                                                c17861.m40561();
                                                if (c17861.m40567()) {
                                                    C21334.m48349("Unsupported reduced_still_picture_header");
                                                    c22378M20705 = c8966.m20705();
                                                } else if (c17861.m40567()) {
                                                    C21334.m48349("Unsupported timing_info_present_flag");
                                                    c22378M20705 = c8966.m20705();
                                                } else if (c17861.m40567()) {
                                                    C21334.m48349("Unsupported initial_display_delay_present_flag");
                                                    c22378M20705 = c8966.m20705();
                                                } else {
                                                    int i59 = 5;
                                                    int iM405513 = c17861.m40558(5);
                                                    int i60 = 0;
                                                    while (i60 <= iM405513) {
                                                        c17861.m40566(i54);
                                                        if (c17861.m40558(i59) > 7) {
                                                            c17861.m40561();
                                                        }
                                                        i60++;
                                                        i59 = 5;
                                                        i54 = 12;
                                                    }
                                                    int iM405514 = c17861.m40558(4);
                                                    int iM405515 = c17861.m40558(4);
                                                    c17861.m40566(iM405514 + 1);
                                                    c17861.m40566(iM405515 + 1);
                                                    if (c17861.m40567()) {
                                                        i17 = 7;
                                                        c17861.m40566(7);
                                                    } else {
                                                        i17 = 7;
                                                    }
                                                    c17861.m40566(i17);
                                                    boolean zM405610 = c17861.m40567();
                                                    if (zM405610) {
                                                        c17861.m40566(2);
                                                    }
                                                    if (c17861.m40567()) {
                                                        i18 = 1;
                                                        iM40558 = 2;
                                                    } else {
                                                        i18 = 1;
                                                        iM40558 = c17861.m40558(1);
                                                    }
                                                    if (iM40558 > 0 && !c17861.m40567()) {
                                                        c17861.m40566(i18);
                                                    }
                                                    if (zM405610) {
                                                        i19 = 3;
                                                        c17861.m40566(3);
                                                    } else {
                                                        i19 = 3;
                                                    }
                                                    c17861.m40566(i19);
                                                    boolean zM405611 = c17861.m40567();
                                                    if (iM405512 == 2 && zM405611) {
                                                        c17861.m40561();
                                                    }
                                                    boolean z3 = iM405512 != 1 && c17861.m40567();
                                                    if (c17861.m40567()) {
                                                        int iM405516 = c17861.m40558(8);
                                                        int iM405517 = c17861.m40558(8);
                                                        int iM405518 = c17861.m40558(8);
                                                        if (z3) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 1;
                                                            if (iM405516 == 1 && iM405517 == 13 && iM405518 == 0) {
                                                                iM40559 = 1;
                                                            }
                                                            c8966.m20709(C22378.m50228(iM405516));
                                                            if (iM40559 == i20) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = 2;
                                                            }
                                                            c8966.m20708(i21);
                                                            c8966.m20711(C22378.m50227(iM405517));
                                                        }
                                                        iM40559 = c17861.m40558(i20);
                                                        c8966.m20709(C22378.m50228(iM405516));
                                                        if (iM40559 == i20) {
                                                            i21 = 1;
                                                        } else {
                                                            i21 = 2;
                                                        }
                                                        c8966.m20708(i21);
                                                        c8966.m20711(C22378.m50227(iM405517));
                                                    }
                                                    c22378M20705 = c8966.m20705();
                                                }
                                            }
                                        }
                                        i27 = c22378M20705.f70604;
                                        i26 = c22378M20705.f70598;
                                        i24 = c22378M20705.f70601;
                                        i28 = c22378M20705.f70599;
                                        iM50227 = c22378M20705.f70603;
                                        str4 = "video/av01";
                                        iIntValue = i11;
                                        c9145 = c9146;
                                    } else if (iM437310 == 1668050025) {
                                        byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        byteBufferOrder.position(21);
                                        byteBufferOrder.putShort(c19203.m43701());
                                        byteBufferOrder.putShort(c19203.m43701());
                                    } else {
                                        if (iM437310 == 1835295606) {
                                            byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short sM43701 = c19203.m43701();
                                            short sM43702 = c19203.m43701();
                                            short sM43703 = c19203.m43701();
                                            short sM43704 = c19203.m43701();
                                            short sM43705 = c19203.m43701();
                                            short sM43706 = c19203.m43701();
                                            iIntValue = i11;
                                            short sM43707 = c19203.m43701();
                                            c9145 = c9146;
                                            short sM43708 = c19203.m43701();
                                            long jM43725 = c19203.m43725();
                                            long jM43726 = c19203.m43725();
                                            i10 = i32;
                                            byteBufferOrder.position(1);
                                            byteBufferOrder.putShort(sM43705);
                                            byteBufferOrder.putShort(sM43706);
                                            byteBufferOrder.putShort(sM43701);
                                            byteBufferOrder.putShort(sM43702);
                                            byteBufferOrder.putShort(sM43703);
                                            byteBufferOrder.putShort(sM43704);
                                            byteBufferOrder.putShort(sM43707);
                                            byteBufferOrder.putShort(sM43708);
                                            byteBufferOrder.putShort((short) (jM43725 / 10000));
                                            byteBufferOrder.putShort((short) (jM43726 / 10000));
                                        } else {
                                            iIntValue = i11;
                                            i10 = i32;
                                            c9145 = c9146;
                                            if (iM437310 == 1681012275) {
                                                C23786.m52873(null, str4 == null);
                                                str4 = "video/3gpp";
                                            } else {
                                                byte[] bArrCopyOfRange = null;
                                                if (iM437310 == 1702061171) {
                                                    C23786.m52873(null, str4 == null);
                                                    c4499M51821 = m51821(iM43732, c19203);
                                                    str4 = c4499M51821.f10100;
                                                    byte[] bArr4 = c4499M51821.f10099;
                                                    if (bArr4 != null) {
                                                        listM8329 = AbstractC16192.m36873of((Object) bArr4);
                                                    }
                                                } else if (iM437310 == 1651798644) {
                                                    c19203.m43730(iM43732 + 8);
                                                    c19203.m43724(4);
                                                    byteBufferOrder = byteBuffer;
                                                    c10534 = new C10534(c19203.m43725(), c19203.m43725());
                                                } else if (iM437310 == 1885434736) {
                                                    c19203.m43730(iM43732 + 8);
                                                    fM43738 = c19203.m43738() / c19203.m43738();
                                                    z = true;
                                                    byteBufferOrder = byteBuffer;
                                                    str2 = str5;
                                                } else if (iM437310 == 1937126244) {
                                                    int i61 = iM43732 + 8;
                                                    while (i61 - iM43732 < iM43739) {
                                                        c19203.m43730(i61);
                                                        int iM437313 = c19203.m43739();
                                                        if (c19203.m43739() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(c19203.m43728(), i61, iM437313 + i61);
                                                            break;
                                                        }
                                                        i61 += iM437313;
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    bArr = bArrCopyOfRange;
                                                } else if (iM437310 == 1936995172) {
                                                    int iM43706 = c19203.m43702();
                                                    c19203.m43724(3);
                                                    if (iM43706 != 0) {
                                                        i32 = i10;
                                                    } else {
                                                        int iM43707 = c19203.m43702();
                                                        if (iM43707 == 0) {
                                                            i32 = 0;
                                                        } else if (iM43707 == 1) {
                                                            i32 = 1;
                                                        } else if (iM43707 == 2) {
                                                            i32 = 2;
                                                        } else if (iM43707 != 3) {
                                                            i32 = i10;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                    i26 = i7;
                                                    i27 = i8;
                                                    i28 = i9;
                                                } else {
                                                    if (iM437310 == 1634760259) {
                                                        int i62 = iM43739 - 12;
                                                        byte[] bArr5 = new byte[i62];
                                                        c19203.m43730(iM43732 + 12);
                                                        c19203.m43707(0, i62, bArr5);
                                                        listM8329 = AbstractC16192.m36873of((Object) bArr5);
                                                        C19203 c19204 = new C19203(bArr5);
                                                        C8966 c8967 = new C8966();
                                                        byte[] bArrM43729 = c19204.m43728();
                                                        C17861 c17862 = new C17861(bArrM43729, bArrM43729.length);
                                                        c17862.m40569(c19204.m43731() * 8);
                                                        int i63 = 1;
                                                        c17862.m40562(1);
                                                        int iM405519 = c17862.m40558(8);
                                                        int i64 = 0;
                                                        while (i64 < iM405519) {
                                                            c17862.m40562(i63);
                                                            int iM405520 = c17862.m40558(8);
                                                            for (int i65 = 0; i65 < iM405520; i65++) {
                                                                c17862.m40566(6);
                                                                boolean zM405612 = c17862.m40567();
                                                                c17862.m40561();
                                                                c17862.m40562(11);
                                                                c17862.m40566(4);
                                                                int iM405521 = c17862.m40558(4) + 8;
                                                                c8967.m20710(iM405521);
                                                                c8967.m20706(iM405521);
                                                                c17862.m40562(1);
                                                                if (zM405612) {
                                                                    int iM405522 = c17862.m40558(8);
                                                                    int iM405523 = c17862.m40558(8);
                                                                    c17862.m40562(1);
                                                                    boolean zM405613 = c17862.m40567();
                                                                    c8967.m20709(C22378.m50228(iM405522));
                                                                    c8967.m20708(zM405613 ? 1 : 2);
                                                                    c8967.m20711(C22378.m50227(iM405523));
                                                                }
                                                            }
                                                            i64++;
                                                            i63 = 1;
                                                        }
                                                        C22378 c22378M20706 = c8967.m20705();
                                                        i27 = c22378M20706.f70604;
                                                        i26 = c22378M20706.f70598;
                                                        i13 = c22378M20706.f70601;
                                                        i12 = c22378M20706.f70599;
                                                        i14 = c22378M20706.f70603;
                                                        str4 = "video/apv";
                                                    } else if (iM437310 == 1668246642 && i24 == -1 && iM50227 == -1) {
                                                        int iM437314 = c19203.m43739();
                                                        if (iM437314 == 1852009592 || iM437314 == 1852009571) {
                                                            int iM43712 = c19203.m43710();
                                                            int iM43713 = c19203.m43710();
                                                            c19203.m43724(2);
                                                            boolean z4 = iM43739 == 19 && (c19203.m43702() & 128) != 0;
                                                            int iM50229 = C22378.m50228(iM43712);
                                                            i12 = z4 ? 1 : 2;
                                                            int iM502210 = C22378.m50227(iM43713);
                                                            i26 = i7;
                                                            i27 = i8;
                                                            i13 = iM50229;
                                                            i14 = iM502210;
                                                        } else {
                                                            C21334.m48351("Unsupported color type: " + AbstractC16520.m37479(iM437314));
                                                        }
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    iM50227 = i14;
                                                    i24 = i13;
                                                    i28 = i12;
                                                    c9146 = c9145;
                                                    i32 = i10;
                                                }
                                            }
                                            byteBufferOrder = byteBuffer;
                                        }
                                        fM43738 = f;
                                        str2 = str5;
                                    }
                                    byteBufferOrder = byteBuffer;
                                    c9146 = c9145;
                                }
                            }
                            f = fM43738;
                            str5 = str2;
                            c9146 = c9145;
                            i26 = i7;
                            i32 = i10;
                            i27 = i8;
                            i28 = i9;
                        }
                        iIntValue = i11;
                        i26 = i7;
                        i27 = i8;
                        i28 = i9;
                    }
                }
            }
            iM43731 = i33 + iM43739;
            i22 = i2;
            i23 = i3;
            c7182 = c7181;
            byteBuffer = byteBufferOrder;
            iIntValue = iIntValue;
        }
        int i66 = i32;
        int i67 = i26;
        int i68 = i27;
        int i69 = i28;
        if (str4 == null) {
            return;
        }
        C3601 c3601 = new C3601();
        c3601.m6699(i4);
        c3601.m6697(str4);
        c3601.m6677(str5);
        c3601.m6685(iM43710);
        c3601.m6689(iM43711);
        c3601.m6687(i25);
        c3601.m6712(i29);
        c3601.m6692(f);
        c3601.m6671(i5);
        c3601.m6682(bArr);
        c3601.m6710(i66);
        c3601.m6678(listM8329);
        c3601.m6684(i30);
        c3601.m6706(i31);
        c3601.m6679(c21038);
        c3601.m6703(str);
        C8966 c8968 = new C8966();
        c8968.m20709(i24);
        c8968.m20708(i69);
        c8968.m20711(iM50227);
        c8968.m20707(byteBuffer != null ? byteBuffer.array() : null);
        c8968.m20710(i68);
        c8968.m20706(i67);
        c3601.m6680(c8968.m20705());
        if (c10534 != null) {
            c3601.m6700(C15129.m34552(c10534.f29155));
            c3601.m6670(C15129.m34552(c10534.f29156));
        } else if (c4499M51821 != null) {
            c3601.m6700(C15129.m34552(c4499M51821.f10098));
            c3601.m6670(C15129.m34552(c4499M51821.f10101));
        }
        c7181.f18761 = c3601.m6672();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4499 m51821(int i, C19203 c19203) {
        c19203.m43730(i + 12);
        c19203.m43724(1);
        m51827(c19203);
        c19203.m43724(2);
        int iM43702 = c19203.m43702();
        if ((iM43702 & 128) != 0) {
            c19203.m43724(2);
        }
        if ((iM43702 & 64) != 0) {
            c19203.m43724(c19203.m43702());
        }
        if ((iM43702 & 32) != 0) {
            c19203.m43724(2);
        }
        c19203.m43724(1);
        m51827(c19203);
        String strM26811 = C11669.m26811(c19203.m43702());
        if ("audio/mpeg".equals(strM26811) || "audio/vnd.dts".equals(strM26811) || "audio/vnd.dts.hd".equals(strM26811)) {
            return new C4499(-1L, -1L, strM26811, null);
        }
        c19203.m43724(4);
        long jM43725 = c19203.m43725();
        long jM43726 = c19203.m43725();
        c19203.m43724(1);
        int iM51827 = m51827(c19203);
        byte[] bArr = new byte[iM51827];
        c19203.m43707(0, iM51827, bArr);
        if (jM43726 <= 0) {
            jM43726 = -1;
        }
        return new C4499(jM43726, jM43725 > 0 ? jM43725 : -1L, strM26811, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pair m51819(C19203 c19203, int i, int i2) throws C10998 {
        int i3;
        int i4;
        int iM43731 = c19203.m43731();
        while (iM43731 - i < i2) {
            c19203.m43730(iM43731);
            int iM43739 = c19203.m43739();
            C23786.m52873("childAtomSize must be positive", iM43739 > 0);
            if (c19203.m43739() == 1936289382) {
                int i5 = iM43731 + 8;
                int i6 = -1;
                Integer numValueOf = null;
                int i7 = 0;
                String strM43705 = null;
                while (i5 - iM43731 < iM43739) {
                    c19203.m43730(i5);
                    int iM437310 = c19203.m43739();
                    int iM437311 = c19203.m43739();
                    if (iM437311 == 1718775137) {
                        numValueOf = Integer.valueOf(c19203.m43739());
                    } else if (iM437311 == 1935894637) {
                        c19203.m43724(4);
                        strM43705 = c19203.m43705(4, StandardCharsets.UTF_8);
                    } else if (iM437311 == 1935894633) {
                        i6 = i5;
                        i7 = iM437310;
                    }
                    i5 += iM437310;
                }
                C24654 c24654 = null;
                Pair pairCreate = null;
                bArr = null;
                byte[] bArr = null;
                if ("cenc".equals(strM43705) || "cbc1".equals(strM43705) || "cens".equals(strM43705) || "cbcs".equals(strM43705)) {
                    C23786.m52873("frma atom is mandatory", numValueOf != null);
                    C23786.m52873("schi atom is mandatory", i6 != -1);
                    int i8 = i6 + 8;
                    while (i8 - i6 < i7) {
                        c19203.m43730(i8);
                        int iM437312 = c19203.m43739();
                        if (c19203.m43739() == 1952804451) {
                            int iM51818 = m51818(c19203.m43739());
                            c19203.m43724(1);
                            if (iM51818 == 0) {
                                c19203.m43724(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM43702 = c19203.m43702();
                                i3 = iM43702 & 15;
                                i4 = (iM43702 & 240) >> 4;
                            }
                            boolean z = c19203.m43702() == 1;
                            int iM43703 = c19203.m43702();
                            byte[] bArr2 = new byte[16];
                            c19203.m43707(0, 16, bArr2);
                            if (z && iM43703 == 0) {
                                int iM43704 = c19203.m43702();
                                bArr = new byte[iM43704];
                                c19203.m43707(0, iM43704, bArr);
                            }
                            c24654 = new C24654(z, strM43705, iM43703, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM437312;
                    }
                    C23786.m52873("tenc atom is mandatory", c24654 != null);
                    String str = C5792.f14228;
                    pairCreate = Pair.create(numValueOf, c24654);
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM43731 += iM43739;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m51827(C19203 c19203) {
        int iM43702 = c19203.m43702();
        int i = iM43702 & 127;
        while ((iM43702 & 128) == 128) {
            iM43702 = c19203.m43702();
            i = (i << 7) | (iM43702 & 127);
        }
        return i;
    }
}
