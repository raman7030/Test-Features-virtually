package l;

import android.util.Pair;
import com.alipay.sdk.m.p.a;
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
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.᩹ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes.dex */
public final class C21998 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70423 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70424;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49483(int i) {
        return (i >> 24) & 255;
    }

    static {
        String str = C3603.f11424;
        f70424 = "OpusHead".getBytes(StandardCharsets.UTF_8);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m49485(C0780 c0780, C7718 c7718, long j, C19643 c19643, boolean z, boolean z2, InterfaceC16724 interfaceC16724) {
        int i;
        long jM11017;
        long j2;
        int i2;
        int i3;
        long jM11018;
        long j3;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        C0780 c0781;
        long[] jArr;
        long[] jArr2;
        C8353 c8353M4440;
        C5014 c5014;
        C23896 c23896;
        C23896 c23897;
        C14276 c14276;
        int i5;
        Pair pairCreate;
        C18470 c18470;
        ArrayList arrayList3;
        C0780 c0782;
        int i6;
        int i7;
        int i8;
        C5064 c5064;
        C17714 c17714;
        int i9;
        int iM41464;
        int iM41465;
        int iM41493;
        int iRound;
        int i10;
        C19643 c19644;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        int iM41485;
        String str4;
        int i14;
        int i15;
        List listOf;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        List listOf2;
        List list;
        AbstractC14545 abstractC14545;
        long j4;
        AbstractC14545 abstractC14545Of;
        String str5;
        String str6;
        AbstractC14545 abstractC14545Of2;
        ArrayList arrayList4;
        C0780 c0783 = c0780;
        ArrayList arrayList5 = c0783.f2884;
        ArrayList arrayList6 = new ArrayList();
        int i21 = 0;
        while (i21 < arrayList5.size()) {
            C0780 c0784 = (C0780) arrayList5.get(i21);
            if (c0784.f45441 != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i4 = i21;
            } else {
                C7836 c7836M2975 = c0783.m2975(1836476516);
                c7836M2975.getClass();
                C0780 c0780M2974 = c0784.m2974(1835297121);
                c0780M2974.getClass();
                C7836 c7836M2976 = c0780M2974.m2975(1751411826);
                c7836M2976.getClass();
                C17714 c17715 = c7836M2976.f24238;
                c17715.m41484(16);
                int iM41494 = c17715.m41493();
                if (iM41494 == 1936684398) {
                    i = 1;
                } else if (iM41494 == 1986618469) {
                    i = 2;
                } else if (iM41494 == 1952807028 || iM41494 == 1935832172 || iM41494 == 1937072756 || iM41494 == 1668047728 || iM41494 == 1937072752) {
                    i = 3;
                } else {
                    i = iM41494 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    c14276 = null;
                    i5 = 1835297121;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i4 = i21;
                    c0781 = c0784;
                } else {
                    C7836 c7836M2977 = c0784.m2975(1953196132);
                    c7836M2977.getClass();
                    C17714 c17716 = c7836M2977.f24238;
                    c17716.m41484(8);
                    int iM49483 = m49483(c17716.m41493());
                    c17716.m41478(iM49483 != 0 ? 16 : 8);
                    int iM41495 = c17716.m41493();
                    c17716.m41478(4);
                    int iM41486 = c17716.m41485();
                    int i22 = iM49483 == 0 ? 4 : 8;
                    int i23 = 0;
                    while (true) {
                        jM11017 = -9223372036854775807L;
                        if (i23 >= i22) {
                            c17716.m41478(i22);
                        } else {
                            if (c17716.m41482()[iM41486 + i23] != -1) {
                                long jM41479 = iM49483 == 0 ? c17716.m41479() : c17716.m41466();
                                if (jM41479 != 0) {
                                    j2 = jM41479;
                                    break;
                                }
                                break;
                            }
                            i23++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    c17716.m41478(10);
                    int iM41466 = c17716.m41464();
                    c17716.m41478(4);
                    int iM41496 = c17716.m41493();
                    int iM41497 = c17716.m41493();
                    c17716.m41478(4);
                    int iM41498 = c17716.m41493();
                    int iM41499 = c17716.m41493();
                    if (iM41496 == 0 && iM41497 == 65536 && ((iM41498 == -65536 || iM41498 == 65536) && iM41499 == 0)) {
                        i2 = 16;
                        i3 = 90;
                    } else if (iM41496 == 0 && iM41497 == -65536 && ((iM41498 == 65536 || iM41498 == -65536) && iM41499 == 0)) {
                        i2 = 16;
                        i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    } else if ((iM41496 == -65536 || iM41496 == 65536) && iM41497 == 0 && iM41498 == 0 && iM41499 == -65536) {
                        i2 = 16;
                        i3 = 180;
                    } else {
                        i2 = 16;
                        i3 = 0;
                    }
                    c17716.m41478(i2);
                    short sM41455 = c17716.m41455();
                    c17716.m41478(2);
                    C14941 c14941 = new C14941(iM41495, iM41466, i3, sM41455, c17716.m41455(), j2);
                    long j5 = j == -9223372036854775807L ? c14941.f45538 : j;
                    long j6 = m49493(c7836M2975.f24238).f70311;
                    if (j5 == -9223372036854775807L) {
                        jM11018 = -9223372036854775807L;
                    } else {
                        String str7 = C3603.f11424;
                        jM11018 = C3603.m11017(j5, 1000000L, j6, RoundingMode.DOWN);
                    }
                    C0780 c0780M2975 = c0780M2974.m2974(1835626086);
                    c0780M2975.getClass();
                    C0780 c0780M2976 = c0780M2975.m2974(1937007212);
                    c0780M2976.getClass();
                    C7836 c7836M2978 = c0780M2974.m2975(1835296868);
                    c7836M2978.getClass();
                    C17714 c17717 = c7836M2978.f24238;
                    c17717.m41484(8);
                    int iM49484 = m49483(c17717.m41493());
                    c17717.m41478(iM49484 == 0 ? 8 : 16);
                    long jM414710 = c17717.m41479();
                    int iM41487 = c17717.m41485();
                    int i24 = iM49484 == 0 ? 4 : 8;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= i24) {
                            j3 = j6;
                            c17717.m41478(i24);
                            break;
                        }
                        int i26 = iM41487;
                        j3 = j6;
                        if (c17717.m41482()[iM41487 + i25] != -1) {
                            long jM414711 = iM49484 == 0 ? c17717.m41479() : c17717.m41466();
                            if (jM414711 == 0) {
                                break;
                            }
                            String str8 = C3603.f11424;
                            jM11017 = C3603.m11017(jM414711, 1000000L, jM414710, RoundingMode.DOWN);
                            break;
                        }
                        i25++;
                        iM41487 = i26;
                        j6 = j3;
                    }
                    long j7 = jM11017;
                    int iM41467 = c17717.m41464();
                    int i27 = 3;
                    char[] cArr = {(char) (((iM41467 >> 10) & 31) + 96), (char) (((iM41467 >> 5) & 31) + 96), (char) ((iM41467 & 31) + 96)};
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
                    C18470 c18471 = new C18470(str, jM414710, j7);
                    C7836 c7836M2979 = c0780M2976.m2975(1937011556);
                    if (c7836M2979 == null) {
                        throw C9080.m23440("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
                    }
                    C17714 c17718 = c7836M2979.f24238;
                    String str9 = c18471.f57268;
                    c17718.m41484(12);
                    int iM414910 = c17718.m41493();
                    C5064 c5065 = new C5064(iM414910);
                    int i29 = 0;
                    while (true) {
                        C23449[] c23449Arr = c5065.f15928;
                        if (i29 >= iM414910) {
                            C18470 c18472 = c18471;
                            int i30 = i;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i4 = i21;
                            C0780 c0785 = c0784;
                            long j8 = j3;
                            C5064 c5066 = c5065;
                            C14276 c14277 = null;
                            if (!z) {
                                c0781 = c0785;
                                C0780 c0780M2977 = c0781.m2974(1701082227);
                                if (c0780M2977 != null) {
                                    C7836 c7836M29710 = c0780M2977.m2975(1701606260);
                                    if (c7836M29710 == null) {
                                        pairCreate = null;
                                    } else {
                                        C17714 c17719 = c7836M29710.f24238;
                                        c17719.m41484(8);
                                        int iM49485 = m49483(c17719.m41493());
                                        int iM41492 = c17719.m41492();
                                        long[] jArr3 = new long[iM41492];
                                        long[] jArr4 = new long[iM41492];
                                        for (int i31 = 0; i31 < iM41492; i31++) {
                                            jArr3[i31] = iM49485 == 1 ? c17719.m41466() : c17719.m41479();
                                            jArr4[i31] = iM49485 == 1 ? c17719.m41487() : c17719.m41493();
                                            if (c17719.m41455() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            c17719.m41478(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        jArr2 = (long[]) pairCreate.first;
                                        jArr = (long[]) pairCreate.second;
                                    }
                                }
                                if (c5066.f15925 != null) {
                                    if (c14941.f45537 != 0) {
                                        c5014 = new C5014(c14941.f45537);
                                        C1297 c1297M21948 = c5066.f15925.m21948();
                                        c23896 = c5066.f15925.f25612;
                                        if (c23896 != null) {
                                            c23897 = c23896.m52643(c5014);
                                        } else {
                                            c23897 = new C23896(c5014);
                                        }
                                        c1297M21948.m4449(c23897);
                                        c8353M4440 = c1297M21948.m4440();
                                    } else {
                                        c8353M4440 = c5066.f15925;
                                    }
                                    c14277 = new C14276(c14941.f45542, i30, c18472.f57270, j8, jM11018, c18472.f57269, c8353M4440, c5066.f15929, c23449Arr, c5066.f15927, jArr2, jArr, c5066.f15926);
                                }
                                c14276 = c14277;
                                i5 = 1835297121;
                                break;
                            }
                            c0781 = c0785;
                            jArr = null;
                            jArr2 = null;
                            if (c5066.f15925 != null) {
                                if (c14941.f45537 != 0) {
                                    c5014 = new C5014(c14941.f45537);
                                    C1297 c1297M21949 = c5066.f15925.m21948();
                                    c23896 = c5066.f15925.f25612;
                                    if (c23896 != null) {
                                        c23897 = c23896.m52643(c5014);
                                    } else {
                                        c23897 = new C23896(c5014);
                                    }
                                    c1297M21949.m4449(c23897);
                                    c8353M4440 = c1297M21949.m4440();
                                } else {
                                    c8353M4440 = c5066.f15925;
                                }
                                c14277 = new C14276(c14941.f45542, i30, c18472.f57270, j8, jM11018, c18472.f57269, c8353M4440, c5066.f15929, c23449Arr, c5066.f15927, jArr2, jArr, c5066.f15926);
                            }
                            c14276 = c14277;
                            i5 = 1835297121;
                            break;
                        }
                        int iM41488 = c17718.m41485();
                        int iM414911 = c17718.m41493();
                        int i32 = iM414910;
                        String str10 = "childAtomSize must be positive";
                        C22535.m50531("childAtomSize must be positive", iM414911 > 0);
                        int iM414912 = c17718.m41493();
                        int i33 = i;
                        if (iM414912 == 1635148593 || iM414912 == 1635148595 || iM414912 == 1701733238 || iM414912 == 1831958048 || iM414912 == 1836070006 || iM414912 == 1752589105 || iM414912 == 1751479857 || iM414912 == 1932670515 || iM414912 == 1211250227 || iM414912 == 1748121139 || iM414912 == 1987063864 || iM414912 == 1987063865 || iM414912 == 1635135537 || iM414912 == 1685479798 || iM414912 == 1685479729 || iM414912 == 1685481573 || iM414912 == 1685481521 || iM414912 == 1634760241) {
                            c18470 = c18471;
                            arrayList3 = arrayList6;
                            i21 = i21;
                            c0782 = c0784;
                            i6 = iM414911;
                            i7 = iM41488;
                            i8 = i29;
                            c5064 = c5065;
                            c17714 = c17718;
                            m49491(c17718, iM414912, iM41488, i6, c14941.f45542, str9, c14941.f45541, c19643, c5064, i8);
                        } else {
                            if (iM414912 == 1836069985 || iM414912 == 1701733217 || iM414912 == 1633889587 || iM414912 == 1700998451 || iM414912 == 1633889588 || iM414912 == 1835823201 || iM414912 == 1685353315 || iM414912 == 1685353317 || iM414912 == 1685353320 || iM414912 == 1685353324 || iM414912 == 1685353336 || iM414912 == 1935764850 || iM414912 == 1935767394 || iM414912 == 1819304813 || iM414912 == 1936684916 || iM414912 == 1953984371 || iM414912 == 778924082 || iM414912 == 778924083 || iM414912 == 1835557169 || iM414912 == 1835560241 || iM414912 == 1634492771 || iM414912 == 1634492791 || iM414912 == 1970037111 || iM414912 == 1332770163 || iM414912 == 1716281667 || iM414912 == 1767992678 || iM414912 == 1768973165 || iM414912 == 1718641517) {
                                c18470 = c18471;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c0782 = c0784;
                                int i34 = c14941.f45542;
                                c17718.m41484(iM41488 + 16);
                                if (z2) {
                                    iM41464 = c17718.m41464();
                                    c17718.m41478(6);
                                } else {
                                    c17718.m41478(8);
                                    iM41464 = 0;
                                }
                                if (iM41464 == 0 || iM41464 == 1) {
                                    iM41465 = c17718.m41464();
                                    c17718.m41478(6);
                                    int iM41469 = c17718.m41469();
                                    c17718.m41484(c17718.m41485() - 4);
                                    iM41493 = c17718.m41493();
                                    if (iM41464 == 1) {
                                        c17718.m41478(16);
                                    }
                                    iRound = iM41469;
                                    i10 = -1;
                                } else {
                                    if (iM41464 == 2) {
                                        c17718.m41478(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c17718.m41487()));
                                        iM41465 = c17718.m41492();
                                        c17718.m41478(4);
                                        int iM414913 = c17718.m41492();
                                        int iM414914 = c17718.m41492();
                                        boolean z3 = (iM414914 & 1) != 0;
                                        boolean z4 = (iM414914 & 2) != 0;
                                        if (z3) {
                                            if (iM414913 == 32) {
                                                i10 = 4;
                                            } else {
                                                i10 = -1;
                                            }
                                        } else if (iM414913 == 8) {
                                            i10 = 3;
                                        } else if (iM414913 == 16) {
                                            i10 = z4 ? 268435456 : 2;
                                        } else if (iM414913 == 24) {
                                            i10 = z4 ? 1342177280 : 21;
                                        } else if (iM414913 == 32) {
                                            i10 = z4 ? 1610612736 : 22;
                                        } else {
                                            i10 = -1;
                                        }
                                        c17718.m41478(8);
                                        iM41493 = 0;
                                    }
                                    c5064 = c5065;
                                    c17714 = c17718;
                                    i8 = i9;
                                    i7 = i12;
                                    i6 = i11;
                                }
                                if (iM414912 == 1767992678) {
                                    iM41465 = -1;
                                    iRound = -1;
                                } else if (iM414912 == 1935764850) {
                                    iM41465 = 1;
                                    iRound = 8000;
                                } else if (iM414912 == 1935767394) {
                                    iM41465 = 1;
                                    iRound = 16000;
                                }
                                int iM41489 = c17718.m41485();
                                if (iM414912 == 1701733217) {
                                    Pair pairM49484 = m49484(c17718, iM41488, iM414911);
                                    if (pairM49484 != null) {
                                        int iIntValue = ((Integer) pairM49484.first).intValue();
                                        C19643 c19643M45154 = c19643 == null ? null : c19643.m45154(((C23449) pairM49484.second).f75272);
                                        c23449Arr[i9] = (C23449) pairM49484.second;
                                        c19644 = c19643M45154;
                                        iM414912 = iIntValue;
                                    } else {
                                        c19644 = c19643;
                                    }
                                    c17718.m41484(iM41489);
                                } else {
                                    c19644 = c19643;
                                }
                                String str11 = "audio/mhm1";
                                int i35 = iRound;
                                if (iM414912 == 1633889587) {
                                    str2 = "audio/ac3";
                                } else if (iM414912 == 1700998451) {
                                    str2 = "audio/eac3";
                                } else if (iM414912 == 1633889588) {
                                    str2 = "audio/ac4";
                                } else if (iM414912 == 1685353315) {
                                    str2 = "audio/vnd.dts";
                                } else if (iM414912 == 1685353320 || iM414912 == 1685353324) {
                                    str2 = "audio/vnd.dts.hd";
                                } else if (iM414912 == 1685353317) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iM414912 == 1685353336) {
                                    str2 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iM414912 == 1935764850) {
                                    str2 = "audio/3gpp";
                                } else if (iM414912 == 1935767394) {
                                    str2 = "audio/amr-wb";
                                } else if (iM414912 != 1936684916) {
                                    if (iM414912 == 1953984371) {
                                        i10 = 268435456;
                                    } else if (iM414912 == 1819304813) {
                                        if (i10 == -1) {
                                            i10 = 2;
                                        }
                                    } else if (iM414912 == 778924082 || iM414912 == 778924083) {
                                        str2 = "audio/mpeg";
                                    } else if (iM414912 == 1835557169) {
                                        str2 = "audio/mha1";
                                    } else if (iM414912 == 1835560241) {
                                        str2 = "audio/mhm1";
                                    } else if (iM414912 == 1634492771) {
                                        str2 = "audio/alac";
                                    } else if (iM414912 == 1634492791) {
                                        str2 = "audio/g711-alaw";
                                    } else if (iM414912 == 1970037111) {
                                        str2 = "audio/g711-mlaw";
                                    } else if (iM414912 == 1332770163) {
                                        str2 = "audio/opus";
                                    } else if (iM414912 == 1716281667) {
                                        str2 = "audio/flac";
                                    } else if (iM414912 == 1835823201) {
                                        str2 = "audio/true-hd";
                                    } else {
                                        str2 = iM414912 == 1767992678 ? "audio/iamf" : null;
                                    }
                                    str2 = "audio/raw";
                                } else {
                                    i10 = 2;
                                    str2 = "audio/raw";
                                }
                                C2242 c2242M49486 = null;
                                C8592 c8592 = null;
                                int i36 = iM41489;
                                String str12 = null;
                                int iIntValue2 = iM41465;
                                int i37 = i10;
                                List listOf3 = null;
                                int i38 = i35;
                                while (i36 - iM41488 < iM414911) {
                                    c17718.m41484(i36);
                                    int iM414915 = c17718.m41493();
                                    C22535.m50531(str10, iM414915 > 0);
                                    int iM414916 = c17718.m41493();
                                    int i39 = iM41488;
                                    if (iM414916 == 1835557187) {
                                        c17718.m41484(i36 + 8);
                                        c17718.m41478(1);
                                        int iM41456 = c17718.m41456();
                                        c17718.m41478(1);
                                        str12 = C11003.equals(str2, str11) ? String.format("mhm1.%02X", Integer.valueOf(iM41456)) : String.format("mha1.%02X", Integer.valueOf(iM41456));
                                        int iM41468 = c17718.m41464();
                                        byte[] bArr = new byte[iM41468];
                                        str3 = str11;
                                        c17718.m41461(0, iM41468, bArr);
                                        listOf3 = listOf3 == null ? AbstractC14545.of((Object) bArr) : AbstractC14545.of((Object) bArr, listOf3.get(0));
                                    } else {
                                        str3 = str11;
                                        if (iM414916 == 1835557200) {
                                            c17718.m41484(i36 + 8);
                                            int iM41457 = c17718.m41456();
                                            if (iM41457 > 0) {
                                                byte[] bArr2 = new byte[iM41457];
                                                c17718.m41461(0, iM41457, bArr2);
                                                listOf3 = listOf3 == null ? AbstractC14545.of((Object) bArr2) : AbstractC14545.of(listOf3.get(0), (Object) bArr2);
                                            }
                                        } else if (iM414916 == 1702061171 || (z2 && iM414916 == 2002876005)) {
                                            List list2 = listOf3;
                                            String str13 = str10;
                                            i13 = iM41493;
                                            int i40 = iIntValue2;
                                            int i41 = i38;
                                            if (iM414916 != 1702061171) {
                                                iM41485 = c17718.m41485();
                                                C22535.m50531(null, iM41485 >= i36);
                                                while (true) {
                                                    if (iM41485 - i36 >= iM414915) {
                                                        str4 = str13;
                                                        iM41485 = -1;
                                                        break;
                                                    }
                                                    c17718.m41484(iM41485);
                                                    int iM414917 = c17718.m41493();
                                                    str4 = str13;
                                                    C22535.m50531(str4, iM414917 > 0);
                                                    if (c17718.m41493() == 1702061171) {
                                                        break;
                                                    }
                                                    iM41485 += iM414917;
                                                    str13 = str4;
                                                }
                                            } else {
                                                iM41485 = i36;
                                                str4 = str13;
                                            }
                                            if (iM41485 != -1) {
                                                c2242M49486 = m49486(iM41485, c17718);
                                                str2 = c2242M49486.f7312;
                                                byte[] bArr3 = c2242M49486.f7311;
                                                if (bArr3 == null) {
                                                    i14 = iM414912;
                                                    str10 = str4;
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = list2;
                                                } else if ("audio/vorbis".equals(str2)) {
                                                    C17714 c177110 = new C17714(bArr3);
                                                    c177110.m41478(1);
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (c177110.m41457() <= 0) {
                                                            i14 = iM414912;
                                                            break;
                                                        }
                                                        i14 = iM414912;
                                                        if (c177110.m41477() != 255) {
                                                            break;
                                                        }
                                                        i42 += 255;
                                                        c177110.m41478(1);
                                                        iM414912 = i14;
                                                    }
                                                    int iM41458 = c177110.m41456() + i42;
                                                    int i43 = 0;
                                                    while (true) {
                                                        if (c177110.m41457() <= 0) {
                                                            str10 = str4;
                                                            break;
                                                        }
                                                        str10 = str4;
                                                        if (c177110.m41477() != 255) {
                                                            break;
                                                        }
                                                        i43 += 255;
                                                        c177110.m41478(1);
                                                        str4 = str10;
                                                    }
                                                    int iM41459 = c177110.m41456() + i43;
                                                    byte[] bArr4 = new byte[iM41458];
                                                    int iM414810 = c177110.m41485();
                                                    System.arraycopy(bArr3, iM414810, bArr4, 0, iM41458);
                                                    int i44 = iM414810 + iM41458 + iM41459;
                                                    int length = bArr3.length - i44;
                                                    byte[] bArr5 = new byte[length];
                                                    System.arraycopy(bArr3, i44, bArr5, 0, length);
                                                    AbstractC14545 abstractC14545Of3 = AbstractC14545.of((Object) bArr4, (Object) bArr5);
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = abstractC14545Of3;
                                                } else {
                                                    i14 = iM414912;
                                                    str10 = str4;
                                                    if ("audio/mp4a-latm".equals(str2)) {
                                                        C12948 c12948M29741 = C12243.m29741(new C16302(bArr3, bArr3.length), false);
                                                        i15 = c12948M29741.f38846;
                                                        iIntValue2 = c12948M29741.f38844;
                                                        str12 = c12948M29741.f38845;
                                                    } else {
                                                        iIntValue2 = i40;
                                                        i15 = i41;
                                                    }
                                                    listOf3 = AbstractC14545.of((Object) bArr3);
                                                }
                                            } else {
                                                i14 = iM414912;
                                                str10 = str4;
                                                iIntValue2 = i40;
                                                i15 = i41;
                                                listOf3 = list2;
                                            }
                                        } else {
                                            if (iM414916 == 1651798644) {
                                                c17718.m41484(i36 + 8);
                                                c17718.m41478(4);
                                                i16 = iIntValue2;
                                                c8592 = new C8592(c17718.m41479(), c17718.m41479());
                                                list = listOf3;
                                            } else {
                                                listOf = listOf3;
                                                i16 = iIntValue2;
                                                if (iM414916 == 1684103987) {
                                                    c17718.m41484(i36 + 8);
                                                    c5065.f15925 = C5893.m16513(c17718, Integer.toString(i34), str9, c19644);
                                                } else if (iM414916 == 1684366131) {
                                                    c17718.m41484(i36 + 8);
                                                    c5065.f15925 = C5893.m16515(c17718, Integer.toString(i34), str9, c19644);
                                                } else if (iM414916 == 1684103988) {
                                                    c17718.m41484(i36 + 8);
                                                    c5065.f15925 = C13653.m32805(c17718, Integer.toString(i34), str9, c19644);
                                                } else if (iM414916 == 1684892784) {
                                                    if (iM41493 <= 0) {
                                                        throw C9080.m23440("Invalid sample rate for Dolby TrueHD MLP stream: " + iM41493, (Throwable) null);
                                                    }
                                                    iIntValue2 = 2;
                                                    i38 = iM41493;
                                                    list = listOf;
                                                    listOf = list;
                                                    str10 = str10;
                                                    i13 = iM41493;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM414912;
                                                } else if (iM414916 == 1684305011 || iM414916 == 1969517683) {
                                                    str10 = str10;
                                                    i13 = iM41493;
                                                    C1297 c1297 = new C1297();
                                                    c1297.m4467(i34);
                                                    c1297.m4465(str2);
                                                    i17 = i16;
                                                    c1297.m4472(i17);
                                                    i18 = i38;
                                                    c1297.m4456(i18);
                                                    c1297.m4447(c19644);
                                                    c1297.m4471(str9);
                                                    c5065.f15925 = c1297.m4440();
                                                    iIntValue2 = i17;
                                                    i38 = i18;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM414912;
                                                } else {
                                                    if (iM414916 == 1682927731) {
                                                        int i45 = iM414915 - 8;
                                                        byte[] bArr6 = f70424;
                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i45);
                                                        c17718.m41484(i36 + 8);
                                                        c17718.m41461(bArr6.length, i45, bArrCopyOf);
                                                        listOf2 = C3939.m11988(bArrCopyOf);
                                                    } else if (iM414916 == 1684425825) {
                                                        byte[] bArr7 = new byte[iM414915 - 8];
                                                        bArr7[0] = 102;
                                                        bArr7[1] = 76;
                                                        bArr7[2] = 97;
                                                        bArr7[3] = 67;
                                                        c17718.m41484(i36 + 12);
                                                        c17718.m41461(4, iM414915 - 12, bArr7);
                                                        listOf2 = AbstractC14545.of((Object) bArr7);
                                                    } else if (iM414916 == 1634492771) {
                                                        int i46 = iM414915 - 12;
                                                        byte[] bArr8 = new byte[i46];
                                                        c17718.m41484(i36 + 12);
                                                        c17718.m41461(0, i46, bArr8);
                                                        int i47 = C17839.f54488;
                                                        C17714 c177111 = new C17714(bArr8);
                                                        c177111.m41484(9);
                                                        int iM414510 = c177111.m41456();
                                                        c177111.m41484(20);
                                                        Pair pairCreate2 = Pair.create(Integer.valueOf(c177111.m41492()), Integer.valueOf(iM414510));
                                                        int iIntValue3 = ((Integer) pairCreate2.first).intValue();
                                                        i14 = iM414912;
                                                        iIntValue2 = ((Integer) pairCreate2.second).intValue();
                                                        str10 = str10;
                                                        i13 = iM41493;
                                                        listOf3 = AbstractC14545.of((Object) bArr8);
                                                        i15 = iIntValue3;
                                                    } else {
                                                        if (iM414916 == 1767990114) {
                                                            c17718.m41484(i36 + 9);
                                                            int iM414811 = c17718.m41489();
                                                            byte[] bArr9 = new byte[iM414811];
                                                            c17718.m41461(0, iM414811, bArr9);
                                                            int i48 = C17839.f54488;
                                                            C17714 c177112 = new C17714(bArr9);
                                                            while ((c177112.m41456() & 128) != 0) {
                                                            }
                                                            c177112.m41478(4);
                                                            int iM414511 = c177112.m41456();
                                                            int iM414512 = c177112.m41456();
                                                            c177112.m41478(1);
                                                            while ((c177112.m41456() & 128) != 0) {
                                                            }
                                                            while ((c177112.m41456() & 128) != 0) {
                                                            }
                                                            i13 = iM41493;
                                                            String strM41459 = c177112.m41459(4, StandardCharsets.UTF_8);
                                                            if (strM41459.equals("mp4a")) {
                                                                while ((c177112.m41456() & 128) != 0) {
                                                                }
                                                                c177112.m41478(2);
                                                                C16302 c16302 = new C16302();
                                                                c16302.m38342(c177112);
                                                                int iM38343 = c16302.m38343(5);
                                                                if (iM38343 == 31) {
                                                                    iM38343 = c16302.m38343(6) + 32;
                                                                }
                                                                strM41459 = strM41459 + ".40." + iM38343;
                                                            }
                                                            Object[] objArr = {Integer.valueOf(iM414511), Integer.valueOf(iM414512), strM41459};
                                                            String str14 = C3603.f11424;
                                                            str12 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
                                                            listOf = AbstractC14545.of((Object) bArr9);
                                                            i19 = i37;
                                                        } else {
                                                            str10 = str10;
                                                            i13 = iM41493;
                                                            if (iM414916 == 1885564227) {
                                                                c17718.m41484(i36 + 12);
                                                                ByteOrder byteOrder = (c17718.m41456() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                                int iM414513 = c17718.m41456();
                                                                if (iM414912 == 1768973165) {
                                                                    int iM11003 = C3603.m11003(iM414513, byteOrder);
                                                                    i20 = -1;
                                                                    i19 = iM11003;
                                                                } else {
                                                                    i19 = (iM414912 == 1718641517 && iM414513 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i37;
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
                                                            listOf3 = listOf;
                                                            i14 = iM414912;
                                                        }
                                                        iIntValue2 = i16;
                                                        i37 = i19;
                                                        i15 = i38;
                                                        listOf3 = listOf;
                                                        i14 = iM414912;
                                                    }
                                                    list = listOf2;
                                                }
                                                str10 = str10;
                                                i13 = iM41493;
                                                i18 = i38;
                                                i17 = i16;
                                                iIntValue2 = i17;
                                                i38 = i18;
                                                i19 = i37;
                                                i37 = i19;
                                                i15 = i38;
                                                listOf3 = listOf;
                                                i14 = iM414912;
                                            }
                                            iIntValue2 = i16;
                                            listOf = list;
                                            str10 = str10;
                                            i13 = iM41493;
                                            i19 = i37;
                                            i37 = i19;
                                            i15 = i38;
                                            listOf3 = listOf;
                                            i14 = iM414912;
                                        }
                                        i36 += iM414915;
                                        iM414912 = i14;
                                        iM414911 = iM414911;
                                        str11 = str3;
                                        iM41493 = i13;
                                        str10 = str10;
                                        i38 = i15;
                                        iM41488 = i39;
                                    }
                                    str10 = str10;
                                    i13 = iM41493;
                                    i15 = i38;
                                    i14 = iM414912;
                                    i36 += iM414915;
                                    iM414912 = i14;
                                    iM414911 = iM414911;
                                    str11 = str3;
                                    iM41493 = i13;
                                    str10 = str10;
                                    i38 = i15;
                                    iM41488 = i39;
                                }
                                i11 = iM414911;
                                i12 = iM41488;
                                List list3 = listOf3;
                                int i49 = iIntValue2;
                                int i50 = i38;
                                if (c5065.f15925 == null && str2 != null) {
                                    C1297 c1298 = new C1297();
                                    c1298.m4467(i34);
                                    c1298.m4465(str2);
                                    c1298.m4445(str12);
                                    c1298.m4472(i49);
                                    c1298.m4456(i50);
                                    c1298.m4475(i37);
                                    c1298.m4446(list3);
                                    c1298.m4447(c19644);
                                    c1298.m4471(str9);
                                    if (c2242M49486 != null) {
                                        c1298.m4468(C13426.m32450(c2242M49486.f7310));
                                        c1298.m4438(C13426.m32450(c2242M49486.f7313));
                                    } else if (c8592 != null) {
                                        c1298.m4468(C13426.m32450(c8592.f26238));
                                        c1298.m4438(C13426.m32450(c8592.f26239));
                                    }
                                    c5065.f15925 = c1298.m4440();
                                }
                                c5064 = c5065;
                                c17714 = c17718;
                                i8 = i9;
                                i7 = i12;
                                i6 = i11;
                            } else {
                                if (iM414912 == 1414810956 || iM414912 == 1954034535 || iM414912 == 2004251764 || iM414912 == 1937010800 || iM414912 == 1664495672 || iM414912 == 1836070003) {
                                    c17718.m41484(iM41488 + 16);
                                    String str15 = "application/ttml+xml";
                                    long j9 = C13132.FOREVER_NS;
                                    if (iM414912 != 1414810956) {
                                        if (iM414912 == 1954034535) {
                                            int i51 = iM414911 - 16;
                                            byte[] bArr10 = new byte[i51];
                                            c17718.m41461(0, i51, bArr10);
                                            abstractC14545Of2 = AbstractC14545.of((Object) bArr10);
                                            str6 = "application/x-quicktime-tx3g";
                                            c18470 = c18471;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c0782 = c0784;
                                        } else {
                                            if (iM414912 == 2004251764) {
                                                str15 = "application/x-mp4-vtt";
                                            } else if (iM414912 == 1937010800) {
                                                j9 = 0;
                                            } else if (iM414912 == 1664495672) {
                                                c5065.f15929 = 1;
                                                str15 = "application/x-mp4-cea-608";
                                            } else {
                                                if (iM414912 != 1836070003) {
                                                    throw new IllegalStateException();
                                                }
                                                int iM414812 = c17718.m41485();
                                                c17718.m41478(4);
                                                if (c17718.m41493() == 1702061171) {
                                                    C2242 c2242M49487 = m49486(iM414812, c17718);
                                                    if (c2242M49487.f7311 != null && c2242M49487.f7311.length == 64) {
                                                        byte[] bArr11 = c2242M49487.f7311;
                                                        int i52 = c14941.f45539;
                                                        int i53 = c14941.f45540;
                                                        C22632.m50634(bArr11.length == 64);
                                                        ArrayList arrayList7 = new ArrayList(16);
                                                        int i54 = 0;
                                                        while (i54 < bArr11.length - 3) {
                                                            ArrayList arrayList8 = arrayList6;
                                                            C18470 c18473 = c18471;
                                                            int iM32444 = C13426.m32444(bArr11[i54], bArr11[i54 + 1], bArr11[i54 + 2], bArr11[i54 + 3]);
                                                            int i55 = (iM32444 >> 16) & 255;
                                                            int i56 = ((iM32444 >> 8) & 255) + a.g;
                                                            byte[] bArr12 = bArr11;
                                                            int iM52580 = C23868.m52580(i56, 14075, 10000, i55);
                                                            int i57 = (iM32444 & 255) + a.g;
                                                            arrayList7.add(String.format("%06x", Integer.valueOf(C3603.m11000(C23868.m52580(i57, 17790, 10000, i55), 0, 255) | (C3603.m11000(iM52580, 0, 255) << 16) | (C3603.m11000((i55 - ((i57 * 3455) / 10000)) - ((i56 * 7169) / 10000), 0, 255) << 8))));
                                                            i54 += 4;
                                                            bArr11 = bArr12;
                                                            c18471 = c18473;
                                                            i29 = i29;
                                                            arrayList6 = arrayList8;
                                                            c0784 = c0784;
                                                        }
                                                        c18470 = c18471;
                                                        i9 = i29;
                                                        arrayList3 = arrayList6;
                                                        c0782 = c0784;
                                                        StringBuilder sbM46682 = C20361.m46682("size: ", i52, "x", "\npalette: ", i53);
                                                        sbM46682.append(C6847.m18531(", ").m18533((Iterable) arrayList7));
                                                        sbM46682.append("\n");
                                                        String string = sbM46682.toString();
                                                        String str16 = C3603.f11424;
                                                        abstractC14545Of = AbstractC14545.of((Object) string.getBytes(StandardCharsets.UTF_8));
                                                        str5 = "application/vobsub";
                                                    }
                                                } else {
                                                    c18470 = c18471;
                                                    i9 = i29;
                                                    arrayList3 = arrayList6;
                                                    c0782 = c0784;
                                                    abstractC14545Of = null;
                                                    str5 = null;
                                                }
                                                str6 = str5;
                                                abstractC14545Of2 = abstractC14545Of;
                                            }
                                            abstractC14545 = null;
                                            c18470 = c18471;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c0782 = c0784;
                                            j4 = j9;
                                        }
                                        j4 = Long.MAX_VALUE;
                                        String str17 = str6;
                                        abstractC14545 = abstractC14545Of2;
                                        str15 = str17;
                                    } else {
                                        abstractC14545 = null;
                                        c18470 = c18471;
                                        i9 = i29;
                                        arrayList3 = arrayList6;
                                        i21 = i21;
                                        c0782 = c0784;
                                        j4 = j9;
                                    }
                                    if (str15 != null) {
                                        C1297 c1299 = new C1297();
                                        c1299.m4467(c14941.f45542);
                                        c1299.m4465(str15);
                                        c1299.m4471(str9);
                                        c1299.m4443(j4);
                                        c1299.m4446((List) abstractC14545);
                                        c5065.f15925 = c1299.m4440();
                                    }
                                } else if (iM414912 == 1835365492) {
                                    int i58 = c14941.f45542;
                                    c17718.m41484(iM41488 + 16);
                                    if (iM414912 == 1835365492) {
                                        c17718.m41488();
                                        String strM41488 = c17718.m41488();
                                        if (strM41488 != null) {
                                            C1297 c12910 = new C1297();
                                            c12910.m4467(i58);
                                            c12910.m4465(strM41488);
                                            c5065.f15925 = c12910.m4440();
                                        }
                                    }
                                } else if (iM414912 == 1667329389) {
                                    C1297 c12911 = new C1297();
                                    c12911.m4467(c14941.f45542);
                                    c12911.m4465("application/x-camera-motion");
                                    c5065.f15925 = c12911.m4440();
                                }
                                c18470 = c18471;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c0782 = c0784;
                            }
                            i11 = iM414911;
                            i12 = iM41488;
                            c5064 = c5065;
                            c17714 = c17718;
                            i8 = i9;
                            i7 = i12;
                            i6 = i11;
                        }
                        c17714.m41484(i7 + i6);
                        i29 = i8 + 1;
                        c19643 = c19643;
                        c5065 = c5064;
                        c17718 = c17714;
                        str9 = str9;
                        iM414910 = i32;
                        i = i33;
                        c18471 = c18470;
                        j3 = j3;
                        arrayList5 = arrayList5;
                        i21 = i21;
                        arrayList6 = arrayList3;
                        c0784 = c0782;
                    }
                }
                C14276 c14278 = (C14276) interfaceC16724.apply(c14276);
                if (c14278 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C0780 c0780M2978 = c0781.m2974(i5);
                    c0780M2978.getClass();
                    C0780 c0780M2979 = c0780M2978.m2974(1835626086);
                    c0780M2979.getClass();
                    C0780 c0780M29710 = c0780M2979.m2974(1937007212);
                    c0780M29710.getClass();
                    C20628 c20628M49487 = m49487(c14278, c0780M29710, c7718);
                    arrayList4 = arrayList2;
                    arrayList4.add(c20628M49487);
                }
            }
            i21 = i4 + 1;
            c0783 = c0780;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23896 m49489(C7836 c7836) {
        int iM41469;
        C17714 c17714 = c7836.f24238;
        c17714.m41484(8);
        C23896 c23896 = new C23896(new InterfaceC14723[0]);
        while (c17714.m41457() >= 8) {
            int iM41485 = c17714.m41485();
            int iM41493 = c17714.m41493();
            int iM41494 = c17714.m41493();
            C23896 c23897 = null;
            if (iM41494 == 1835365473) {
                c17714.m41484(iM41485);
                int i = iM41485 + iM41493;
                c17714.m41478(8);
                m49490(c17714);
                while (c17714.m41485() < i) {
                    int iM41486 = c17714.m41485();
                    int iM41495 = c17714.m41493();
                    if (c17714.m41493() == 1768715124) {
                        c17714.m41484(iM41486);
                        int i2 = iM41486 + iM41495;
                        c17714.m41478(8);
                        ArrayList arrayList = new ArrayList();
                        while (c17714.m41485() < i2) {
                            AbstractC14626 abstractC14626M25171 = C10004.m25171(c17714);
                            if (abstractC14626M25171 != null) {
                                arrayList.add(abstractC14626M25171);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c23897 = new C23896(arrayList);
                            break;
                        }
                        break;
                    }
                    c17714.m41484(iM41486 + iM41495);
                }
                c23896 = c23896.m52642(c23897);
            } else if (iM41494 == 1936553057) {
                c17714.m41484(iM41485);
                int i3 = iM41485 + iM41493;
                c17714.m41478(12);
                while (c17714.m41485() < i3) {
                    int iM41487 = c17714.m41485();
                    int iM41496 = c17714.m41493();
                    if (c17714.m41493() == 1935766900) {
                        if (iM41496 < 16) {
                            break;
                        }
                        c17714.m41478(4);
                        int i4 = -1;
                        int i5 = 0;
                        for (int i6 = 0; i6 < 2; i6++) {
                            int iM41456 = c17714.m41456();
                            int iM41457 = c17714.m41456();
                            if (iM41456 == 0) {
                                i4 = iM41457;
                            } else if (iM41456 == 1) {
                                i5 = iM41457;
                            }
                        }
                        if (i4 == 12) {
                            iM41469 = 240;
                        } else if (i4 == 13) {
                            iM41469 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else if (i4 == 21 && c17714.m41457() >= 8 && c17714.m41485() + 8 <= i3) {
                            int iM41497 = c17714.m41493();
                            int iM41498 = c17714.m41493();
                            if (iM41497 < 12 || iM41498 != 1936877170) {
                                iM41469 = SecP160R1Field.PInv;
                            } else {
                                iM41469 = c17714.m41469();
                            }
                        } else {
                            iM41469 = SecP160R1Field.PInv;
                        }
                        if (iM41469 == -2147483647) {
                            break;
                        }
                        c23897 = new C23896(new C19567(iM41469, i5));
                        break;
                    }
                    c17714.m41484(iM41487 + iM41496);
                }
                c23896 = c23896.m52642(c23897);
            } else if (iM41494 == -1451722374) {
                short sM41455 = c17714.m41455();
                c17714.m41478(2);
                String strM41459 = c17714.m41459(sM41455, StandardCharsets.UTF_8);
                int iMax = Math.max(strM41459.lastIndexOf(43), strM41459.lastIndexOf(45));
                try {
                    c23897 = new C23896(new C21243(Float.parseFloat(strM41459.substring(0, iMax)), Float.parseFloat(strM41459.substring(iMax, strM41459.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                c23896 = c23896.m52642(c23897);
            }
            c17714.m41484(iM41485 + iM41493);
        }
        return c23896;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C21948 m49493(C17714 c17714) {
        long jM41487;
        long jM41488;
        c17714.m41484(8);
        if (m49483(c17714.m41493()) == 0) {
            jM41487 = c17714.m41479();
            jM41488 = c17714.m41479();
        } else {
            jM41487 = c17714.m41487();
            jM41488 = c17714.m41487();
        }
        return new C21948(jM41487, jM41488, c17714.m41479());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23896 m49488(C0780 c0780) {
        C0074 c0074;
        C7836 c7836M2975 = c0780.m2975(1751411826);
        C7836 c7836M2976 = c0780.m2975(1801812339);
        C7836 c7836M2977 = c0780.m2975(1768715124);
        if (c7836M2975 != null && c7836M2976 != null && c7836M2977 != null) {
            C17714 c17714 = c7836M2975.f24238;
            c17714.m41484(16);
            if (c17714.m41493() == 1835299937) {
                C17714 c17715 = c7836M2976.f24238;
                c17715.m41484(12);
                int iM41493 = c17715.m41493();
                String[] strArr = new String[iM41493];
                for (int i = 0; i < iM41493; i++) {
                    int iM41494 = c17715.m41493();
                    c17715.m41478(4);
                    strArr[i] = c17715.m41459(iM41494 - 8, StandardCharsets.UTF_8);
                }
                C17714 c17716 = c7836M2977.f24238;
                c17716.m41484(8);
                ArrayList arrayList = new ArrayList();
                while (c17716.m41457() > 8) {
                    int iM41485 = c17716.m41485();
                    int iM41495 = c17716.m41493();
                    int iM41496 = c17716.m41493() - 1;
                    if (iM41496 < 0 || iM41496 >= iM41493) {
                        C8083.m21451(iM41496, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iM41496];
                        int i2 = iM41485 + iM41495;
                        while (true) {
                            int iM41486 = c17716.m41485();
                            if (iM41486 >= i2) {
                                c0074 = null;
                                break;
                            }
                            int iM41497 = c17716.m41493();
                            if (c17716.m41493() == 1684108385) {
                                int iM41498 = c17716.m41493();
                                int iM41499 = c17716.m41493();
                                int i3 = iM41497 - 16;
                                byte[] bArr = new byte[i3];
                                c17716.m41461(0, i3, bArr);
                                c0074 = new C0074(iM41499, iM41498, str, bArr);
                                break;
                            }
                            c17716.m41484(iM41486 + iM41497);
                        }
                        if (c0074 != null) {
                            arrayList.add(c0074);
                        }
                    }
                    c17716.m41484(iM41485 + iM41495);
                }
                if (!arrayList.isEmpty()) {
                    return new C23896(arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49490(C17714 c17714) {
        int iM41485 = c17714.m41485();
        c17714.m41478(4);
        if (c17714.m41493() != 1751411826) {
            iM41485 += 4;
        }
        c17714.m41484(iM41485);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20628 m49487(C14276 c14276, C0780 c0780, C7718 c7718) throws C9080 {
        InterfaceC19176 c7886;
        boolean z;
        int iM41492;
        int iM41493;
        int iM41494;
        int iMo3099;
        int i;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iM41495;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        int iM41496;
        int i4;
        int iM41497;
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
        C14276 c14277;
        String str;
        int i11;
        int[] iArr3;
        long j5;
        boolean zM36838;
        int i12;
        int i13;
        int iMo3098;
        int i14;
        int iM41498;
        int iM41499;
        long j6;
        C14276 c14276M34035;
        long j7;
        C8353 c8353;
        int i15;
        long[] jArr3;
        int i16;
        long jM11017;
        long[] jArr4;
        int i17;
        C8353 c8354;
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
        long jM11018;
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
        long jM11019;
        C14276 c14276M34036 = c14276;
        C8353 c8355 = c14276M34036.f43020;
        C7836 c7836M2975 = c0780.m2975(1937011578);
        if (c7836M2975 != null) {
            c7886 = new C0830(c7836M2975, c8355);
        } else {
            C7836 c7836M2976 = c0780.m2975(1937013298);
            if (c7836M2976 == null) {
                throw C9080.m23440("Track has no sample table size information", (Throwable) null);
            }
            c7886 = new C7886(c7836M2976);
        }
        int iMo3100 = c7886.mo3100();
        if (iMo3100 == 0) {
            return new C20628(c14276, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (c14276M34036.f43011 == 2) {
            long j13 = c14276M34036.f43022;
            if (j13 > 0) {
                C1297 c1297M21948 = c8355.m21948();
                c1297M21948.m4441(iMo3100 / (j13 / 1000000.0f));
                c14276M34036 = c14276M34036.m34035(c1297M21948.m4440());
            }
        }
        C8353 c8356 = c14276M34036.f43020;
        C7836 c7836M2977 = c0780.m2975(1937007471);
        if (c7836M2977 == null) {
            c7836M2977 = c0780.m2975(1668232756);
            c7836M2977.getClass();
            z = true;
        } else {
            z = false;
        }
        C17714 c17714 = c7836M2977.f24238;
        C7836 c7836M2978 = c0780.m2975(1937011555);
        c7836M2978.getClass();
        C17714 c17715 = c7836M2978.f24238;
        C7836 c7836M2979 = c0780.m2975(1937011827);
        c7836M2979.getClass();
        C17714 c17716 = c7836M2979.f24238;
        C7836 c7836M29710 = c0780.m2975(1937011571);
        C17714 c17717 = c7836M29710 != null ? c7836M29710.f24238 : null;
        C7836 c7836M29711 = c0780.m2975(1668576371);
        C17714 c17718 = c7836M29711 != null ? c7836M29711.f24238 : null;
        C15646 c15646 = new C15646(c17715, c17714, z);
        c17716.m41484(12);
        int iM414910 = c17716.m41492() - 1;
        int iM414911 = c17716.m41492();
        int iM414912 = c17716.m41492();
        if (c17718 != null) {
            c17718.m41484(12);
            iM41492 = c17718.m41492();
        } else {
            iM41492 = 0;
        }
        if (c17717 != null) {
            c17717.m41484(12);
            iM41493 = c17717.m41492();
            if (iM41493 > 0) {
                iM41494 = c17717.m41492() - 1;
            } else {
                c17717 = null;
            }
            iMo3099 = c7886.mo3099();
            i = iM41494;
            String str2 = c8356.f25614;
            if (iMo3099 == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM414910 == 0 && iM41492 == 0 && iM41493 == 0)) {
                int i36 = c15646.f48163;
                long[] jArr8 = new long[i36];
                int[] iArr12 = new int[i36];
                while (c15646.m36838()) {
                    int i37 = c15646.f48161;
                    jArr8[i37] = c15646.f48165;
                    iArr12[i37] = c15646.f48160;
                }
                long j14 = iM414912;
                int i38 = 8192 / iMo3099;
                int iM10999 = 0;
                for (int i39 = 0; i39 < i36; i39++) {
                    iM10999 += C3603.m10999(iArr12[i39], i38);
                }
                long[] jArr9 = new long[iM10999];
                iArrCopyOf2 = new int[iM10999];
                jArrCopyOf2 = new long[iM10999];
                int[] iArr13 = new int[iM10999];
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
                        int i50 = iMo3099 * iMin;
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
                c14277 = c14276M34036;
                j4 = j14 * ((long) i40);
                jArrCopyOf = jArr9;
                iArr3 = iArr13;
            } else {
                jArr = new long[iMo3100];
                iArr = new int[iMo3100];
                jArr2 = new long[iMo3100];
                iArr2 = new int[iMo3100];
                iM41495 = i;
                C14276 c14278 = c14276M34036;
                i2 = 0;
                i3 = 0;
                j = 0;
                j2 = 0;
                j3 = 0;
                iM41496 = 0;
                i4 = 0;
                iM41497 = 0;
                int i52 = iM41492;
                i5 = iM414912;
                i6 = iM414911;
                i7 = i52;
                while (true) {
                    if (i2 >= iMo3100) {
                        jArrCopyOf = jArr;
                        i8 = i6;
                        jArrCopyOf2 = jArr2;
                        iArrCopyOf = iArr2;
                        i9 = i4;
                        iArrCopyOf2 = iArr;
                        break;
                    }
                    zM36838 = true;
                    while (i4 == 0) {
                        zM36838 = c15646.m36838();
                        if (!zM36838) {
                            break;
                        }
                        int i53 = i6;
                        long j16 = c15646.f48165;
                        i4 = c15646.f48160;
                        j = j16;
                        i5 = i5;
                        iMo3100 = iMo3100;
                        i6 = i53;
                    }
                    i12 = iMo3100;
                    i8 = i6;
                    i13 = i5;
                    if (!zM36838) {
                        C19956.m46037("Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArr, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                        iArrCopyOf = Arrays.copyOf(iArr2, i2);
                        iMo3100 = i2;
                        i9 = i4;
                        break;
                    }
                    if (c17718 != null) {
                        while (iM41496 == 0 && i7 > 0) {
                            iM41496 = c17718.m41492();
                            iM41497 = c17718.m41493();
                            i7--;
                        }
                        iM41496--;
                    }
                    int i54 = iM41497;
                    jArr[i2] = j;
                    iMo3098 = c7886.mo3098();
                    iArr[i2] = iMo3098;
                    long[] jArr11 = jArr;
                    int[] iArr15 = iArr;
                    j3 += (long) iMo3098;
                    if (iMo3098 > i3) {
                        i3 = iMo3098;
                    }
                    jArr2[i2] = j2 + ((long) i54);
                    if (c17717 == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    iArr2[i2] = i14;
                    if (i2 == iM41495) {
                        iArr2[i2] = 1;
                        iM41493--;
                        if (iM41493 > 0) {
                            c17717.getClass();
                            iM41495 = c17717.m41492() - 1;
                        }
                    }
                    j2 += (long) i13;
                    iM41498 = i8 - 1;
                    if (iM41498 == 0 || iM414910 <= 0) {
                        iM41499 = i13;
                    } else {
                        iM41498 = c17716.m41492();
                        iM41499 = c17716.m41493();
                        iM414910--;
                    }
                    i6 = iM41498;
                    int i55 = iM41499;
                    j += (long) iArr15[i2];
                    i4--;
                    i2++;
                    iM41497 = i54;
                    jArr = jArr11;
                    iArr = iArr15;
                    iMo3100 = i12;
                    i5 = i55;
                }
                j4 = j2 + ((long) iM41497);
                if (c17718 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i7 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (c17718.m41492() != 0) {
                        z2 = false;
                        break;
                    }
                    c17718.m41493();
                    i7--;
                }
                if (iM41493 != 0 && i8 == 0 && i9 == 0 && iM414910 == 0) {
                    i10 = iM41496;
                    if (i10 == 0 && z2) {
                        c14277 = c14278;
                    }
                    iMo3100 = iMo3100;
                    i11 = i3;
                    iArr3 = iArrCopyOf;
                    j5 = j3;
                } else {
                    i10 = iM41496;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                c14277 = c14278;
                C5834.m16344(sb, c14277.f43016, ": remainingSynchronizationSamples ", iM41493, ", remainingSamplesAtTimestampDelta ");
                C5834.m16344(sb, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb.append(iM414910);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i10);
                if (z2) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb.append(str);
                C19956.m46037(sb.toString());
                iMo3100 = iMo3100;
                i11 = i3;
                iArr3 = iArrCopyOf;
                j5 = j3;
            }
            j6 = c14277.f43022;
            if (j6 > 0) {
                jM11019 = C3603.m11017(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
                if (jM11019 > 0 || jM11019 >= 2147483647L) {
                    c14276M34035 = c14277;
                } else {
                    C1297 c1297M21949 = c8356.m21948();
                    c1297M21949.m4468((int) jM11019);
                    c14276M34035 = c14277.m34035(c1297M21949.m4440());
                }
            } else {
                c14276M34035 = c14277;
            }
            j7 = c14276M34035.f43017;
            c8353 = c14276M34035.f43020;
            i15 = c14276M34035.f43011;
            jArr3 = c14276M34035.f43018;
            long[] jArr12 = c14276M34035.f43015;
            RoundingMode roundingMode = RoundingMode.DOWN;
            i16 = iMo3100;
            jM11017 = C3603.m11017(j4, 1000000L, j7, roundingMode);
            jArr4 = jArr12;
            if (jArr4 == null) {
                C3603.m11026(jArrCopyOf2, j7);
                return new C20628(c14276M34035, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM11017);
            }
            if (jArr4.length == 1 || i15 != 1 || jArrCopyOf2.length < 2) {
                i17 = i15;
                c8354 = c8353;
            } else {
                jArr3.getClass();
                long j17 = jArr3[0];
                long jM110110 = j17 + C3603.m11017(jArr4[0], c14276M34035.f43017, c14276M34035.f43012, roundingMode);
                int length = jArrCopyOf2.length - 1;
                int iM11000 = C3603.m11000(4, 0, length);
                int iM11001 = C3603.m11000(jArrCopyOf2.length - 4, 0, length);
                long j18 = jArrCopyOf2[0];
                if (j18 <= j17 && j17 < jArrCopyOf2[iM11000] && jArrCopyOf2[iM11001] < jM110110 && jM110110 <= j4) {
                    long j19 = j4 - jM110110;
                    long jM110111 = C3603.m11017(j17 - j18, c8353.f25624, c14276M34035.f43017, roundingMode);
                    i17 = i15;
                    c8354 = c8353;
                    long jM110112 = C3603.m11017(j19, c8353.f25624, c14276M34035.f43017, roundingMode);
                    if ((jM110111 != 0 || jM110112 != 0) && jM110111 <= 2147483647L && jM110112 <= 2147483647L) {
                        c7718.f23852 = (int) jM110111;
                        c7718.f23853 = (int) jM110112;
                        C3603.m11026(jArrCopyOf2, j7);
                        return new C20628(c14276M34035, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C3603.m11017(jArr4[0], 1000000L, c14276M34035.f43012, roundingMode));
                    }
                } else {
                    i17 = i15;
                    c8354 = c8353;
                }
            }
            i18 = 1;
            if (jArr4.length == 1) {
                if (jArr4[0] == 0) {
                    jArr3.getClass();
                    j12 = jArr3[0];
                    for (i35 = 0; i35 < jArrCopyOf2.length; i35++) {
                        jArrCopyOf2[i35] = C3603.m11017(jArrCopyOf2[i35] - j12, 1000000L, c14276M34035.f43017, RoundingMode.DOWN);
                    }
                    return new C20628(c14276M34035, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C3603.m11017(j4 - j12, 1000000L, c14276M34035.f43017, RoundingMode.DOWN));
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
                    long jM110113 = C3603.m11017(jArr4[i21], c14276M34035.f43017, c14276M34035.f43012, RoundingMode.DOWN);
                    iArr10[i21] = C3603.m11036(jArrCopyOf2, j10, true);
                    j11 = j10 + jM110113;
                    iArr11[i21] = C3603.m11012(jArrCopyOf2, j11, z3);
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
                    long j20 = c14276M34035.f43012;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jM110114 = C3603.m11017(j8, 1000000L, j20, roundingMode2);
                    long[] jArr14 = jArrCopyOf2;
                    long[] jArr15 = jArrCopyOf;
                    jM11018 = C3603.m11017(jArrCopyOf2[i28] - j9, 1000000L, c14276M34035.f43017, roundingMode2);
                    if (jM11018 < 0) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    jArr6[i24] = jM110114 + jM11018;
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
            long jM110115 = C3603.m11017(j8, 1000000L, c14276M34035.f43012, RoundingMode.DOWN);
            if (z7) {
                C1297 c1297M219410 = c8354.m21948();
                c1297M219410.m4459();
                c14276M34035 = c14276M34035.m34035(c1297M219410.m4440());
            }
            return new C20628(c14276M34035, jArr5, iArr8, i23, jArr6, iArr19, jM110115);
        }
        iM41493 = 0;
        iM41494 = -1;
        iMo3099 = c7886.mo3099();
        i = iM41494;
        String str3 = c8356.f25614;
        if (iMo3099 == -1) {
            jArr = new long[iMo3100];
            iArr = new int[iMo3100];
            jArr2 = new long[iMo3100];
            iArr2 = new int[iMo3100];
            iM41495 = i;
            C14276 c14279 = c14276M34036;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM41496 = 0;
            i4 = 0;
            iM41497 = 0;
            int i510 = iM41492;
            i5 = iM414912;
            i6 = iM414911;
            i7 = i510;
            while (true) {
                if (i2 >= iMo3100) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM36838 = true;
                while (i4 == 0) {
                    zM36838 = c15646.m36838();
                    if (!zM36838) {
                        break;
                        break;
                    }
                    int i511 = i6;
                    long j110 = c15646.f48165;
                    i4 = c15646.f48160;
                    j = j110;
                    i5 = i5;
                    iMo3100 = iMo3100;
                    i6 = i511;
                }
                i12 = iMo3100;
                i8 = i6;
                i13 = i5;
                if (!zM36838) {
                    C19956.m46037("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo3100 = i2;
                    i9 = i4;
                    break;
                }
                if (c17718 != null) {
                    while (iM41496 == 0) {
                        iM41496 = c17718.m41492();
                        iM41497 = c17718.m41493();
                        i7--;
                    }
                    iM41496--;
                }
                int i512 = iM41497;
                jArr[i2] = j;
                iMo3098 = c7886.mo3098();
                iArr[i2] = iMo3098;
                long[] jArr16 = jArr;
                int[] iArr110 = iArr;
                j3 += (long) iMo3098;
                if (iMo3098 > i3) {
                    i3 = iMo3098;
                }
                jArr2[i2] = j2 + ((long) i512);
                if (c17717 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM41495) {
                    iArr2[i2] = 1;
                    iM41493--;
                    if (iM41493 > 0) {
                        c17717.getClass();
                        iM41495 = c17717.m41492() - 1;
                    }
                }
                j2 += (long) i13;
                iM41498 = i8 - 1;
                if (iM41498 == 0) {
                    iM41499 = i13;
                } else {
                    iM41499 = i13;
                }
                i6 = iM41498;
                int i513 = iM41499;
                j += (long) iArr110[i2];
                i4--;
                i2++;
                iM41497 = i512;
                jArr = jArr16;
                iArr = iArr110;
                iMo3100 = i12;
                i5 = i513;
            }
            j4 = j2 + ((long) iM41497);
            if (c17718 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c17718.m41492() != 0) {
                    z2 = false;
                    break;
                }
                c17718.m41493();
                i7--;
            }
            if (iM41493 != 0) {
                i10 = iM41496;
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                c14277 = c14279;
                C5834.m16344(sb2, c14277.f43016, ": remainingSynchronizationSamples ", iM41493, ", remainingSamplesAtTimestampDelta ");
                C5834.m16344(sb2, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb2.append(iM414910);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                C19956.m46037(sb2.toString());
            } else {
                i10 = iM41496;
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                c14277 = c14279;
                C5834.m16344(sb3, c14277.f43016, ": remainingSynchronizationSamples ", iM41493, ", remainingSamplesAtTimestampDelta ");
                C5834.m16344(sb3, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb3.append(iM414910);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                C19956.m46037(sb3.toString());
            }
            iMo3100 = iMo3100;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        } else {
            jArr = new long[iMo3100];
            iArr = new int[iMo3100];
            jArr2 = new long[iMo3100];
            iArr2 = new int[iMo3100];
            iM41495 = i;
            C14276 c142710 = c14276M34036;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM41496 = 0;
            i4 = 0;
            iM41497 = 0;
            int i514 = iM41492;
            i5 = iM414912;
            i6 = iM414911;
            i7 = i514;
            while (true) {
                if (i2 >= iMo3100) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM36838 = true;
                while (i4 == 0) {
                    zM36838 = c15646.m36838();
                    if (!zM36838) {
                        break;
                        break;
                    }
                    int i515 = i6;
                    long j111 = c15646.f48165;
                    i4 = c15646.f48160;
                    j = j111;
                    i5 = i5;
                    iMo3100 = iMo3100;
                    i6 = i515;
                }
                i12 = iMo3100;
                i8 = i6;
                i13 = i5;
                if (!zM36838) {
                    C19956.m46037("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo3100 = i2;
                    i9 = i4;
                    break;
                }
                if (c17718 != null) {
                    while (iM41496 == 0) {
                        iM41496 = c17718.m41492();
                        iM41497 = c17718.m41493();
                        i7--;
                    }
                    iM41496--;
                }
                int i516 = iM41497;
                jArr[i2] = j;
                iMo3098 = c7886.mo3098();
                iArr[i2] = iMo3098;
                long[] jArr17 = jArr;
                int[] iArr111 = iArr;
                j3 += (long) iMo3098;
                if (iMo3098 > i3) {
                    i3 = iMo3098;
                }
                jArr2[i2] = j2 + ((long) i516);
                if (c17717 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM41495) {
                    iArr2[i2] = 1;
                    iM41493--;
                    if (iM41493 > 0) {
                        c17717.getClass();
                        iM41495 = c17717.m41492() - 1;
                    }
                }
                j2 += (long) i13;
                iM41498 = i8 - 1;
                if (iM41498 == 0) {
                    iM41499 = i13;
                } else {
                    iM41499 = i13;
                }
                i6 = iM41498;
                int i517 = iM41499;
                j += (long) iArr111[i2];
                i4--;
                i2++;
                iM41497 = i516;
                jArr = jArr17;
                iArr = iArr111;
                iMo3100 = i12;
                i5 = i517;
            }
            j4 = j2 + ((long) iM41497);
            if (c17718 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c17718.m41492() != 0) {
                    z2 = false;
                    break;
                }
                c17718.m41493();
                i7--;
            }
            if (iM41493 != 0) {
                i10 = iM41496;
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                c14277 = c142710;
                C5834.m16344(sb4, c14277.f43016, ": remainingSynchronizationSamples ", iM41493, ", remainingSamplesAtTimestampDelta ");
                C5834.m16344(sb4, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb4.append(iM414910);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                C19956.m46037(sb4.toString());
            } else {
                i10 = iM41496;
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                c14277 = c142710;
                C5834.m16344(sb5, c14277.f43016, ": remainingSynchronizationSamples ", iM41493, ", remainingSamplesAtTimestampDelta ");
                C5834.m16344(sb5, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb5.append(iM414910);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                C19956.m46037(sb5.toString());
            }
            iMo3100 = iMo3100;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        }
        j6 = c14277.f43022;
        if (j6 > 0) {
            jM11019 = C3603.m11017(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
            if (jM11019 > 0) {
                c14276M34035 = c14277;
            } else {
                c14276M34035 = c14277;
            }
        } else {
            c14276M34035 = c14277;
        }
        j7 = c14276M34035.f43017;
        c8353 = c14276M34035.f43020;
        i15 = c14276M34035.f43011;
        jArr3 = c14276M34035.f43018;
        long[] jArr18 = c14276M34035.f43015;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        i16 = iMo3100;
        jM11017 = C3603.m11017(j4, 1000000L, j7, roundingMode3);
        jArr4 = jArr18;
        if (jArr4 == null) {
            C3603.m11026(jArrCopyOf2, j7);
            return new C20628(c14276M34035, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM11017);
        }
        if (jArr4.length == 1) {
            i17 = i15;
            c8354 = c8353;
        } else {
            i17 = i15;
            c8354 = c8353;
        }
        i18 = 1;
        if (jArr4.length == 1) {
            if (jArr4[0] == 0) {
                jArr3.getClass();
                j12 = jArr3[0];
                while (i35 < jArrCopyOf2.length) {
                    jArrCopyOf2[i35] = C3603.m11017(jArrCopyOf2[i35] - j12, 1000000L, c14276M34035.f43017, RoundingMode.DOWN);
                }
                return new C20628(c14276M34035, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C3603.m11017(j4 - j12, 1000000L, c14276M34035.f43017, RoundingMode.DOWN));
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
                long jM110116 = C3603.m11017(jArr4[i21], c14276M34035.f43017, c14276M34035.f43012, RoundingMode.DOWN);
                iArr10[i21] = C3603.m11036(jArrCopyOf2, j10, true);
                j11 = j10 + jM110116;
                iArr11[i21] = C3603.m11012(jArrCopyOf2, j11, z3);
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
                long j21 = c14276M34035.f43012;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jM110117 = C3603.m11017(j8, 1000000L, j21, roundingMode4);
                long[] jArr110 = jArrCopyOf2;
                long[] jArr111 = jArrCopyOf;
                jM11018 = C3603.m11017(jArrCopyOf2[i28] - j9, 1000000L, c14276M34035.f43017, roundingMode4);
                if (jM11018 < 0) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                jArr6[i24] = jM110117 + jM11018;
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
        long jM110118 = C3603.m11017(j8, 1000000L, c14276M34035.f43012, RoundingMode.DOWN);
        if (z7) {
            C1297 c1297M219411 = c8354.m21948();
            c1297M219411.m4459();
            c14276M34035 = c14276M34035.m34035(c1297M219411.m4440());
        }
        return new C20628(c14276M34035, jArr5, iArr8, i23, jArr6, iArr115, jM110118);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0456 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0458  */
    /* JADX WARN: Code duplicated, block: B:204:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0462  */
    /* JADX WARN: Code duplicated, block: B:208:0x0465  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:343:0x0739  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49491(C17714 c17714, int i, int i2, int i3, int i4, String str, int i5, C19643 c19643, C5064 c5064, int i6) throws C9080 {
        int i7;
        int i8;
        int i9;
        int i10;
        C7131 c7131;
        String str2;
        ByteBuffer byteBufferOrder;
        float fM41492;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM38343;
        int i19;
        C21054 c21054M18751;
        int i20;
        int iM38344;
        int i21;
        String str3;
        int i22 = i2;
        int i23 = i3;
        C19643 c19643M45154 = c19643;
        C5064 c5065 = c5064;
        c17714.m41484(i22 + 16);
        c17714.m41478(16);
        int iM41464 = c17714.m41464();
        int iM41465 = c17714.m41464();
        c17714.m41478(50);
        int iM41485 = c17714.m41485();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM49484 = m49484(c17714, i22, i23);
            if (pairM49484 != null) {
                iIntValue = ((Integer) pairM49484.first).intValue();
                c19643M45154 = c19643M45154 == null ? null : c19643M45154.m45154(((C23449) pairM49484.second).f75272);
                c5065.f15928[i6] = (C23449) pairM49484.second;
            }
            c17714.m41484(iM41485);
        }
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i24 = -1;
        List listM6131 = null;
        int i25 = -1;
        C8592 c8592 = null;
        C2242 c2242M49486 = null;
        boolean z = false;
        ByteBuffer byteBuffer = null;
        String str5 = null;
        byte[] bArr = null;
        C7131 c7132 = null;
        int i26 = 8;
        int i27 = 8;
        int iM47897 = -1;
        int i28 = -1;
        float f = 1.0f;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        C19643 c19644 = c19643M45154;
        int i32 = -1;
        while (iM41485 - i22 < i23) {
            c17714.m41484(iM41485);
            int iM41486 = c17714.m41485();
            int i33 = iM41485;
            int iM41493 = c17714.m41493();
            if (iM41493 == 0 && c17714.m41485() - i22 == i23) {
                break;
            }
            C22535.m50531("childAtomSize must be positive", iM41493 > 0);
            int iM41494 = c17714.m41493();
            if (iM41494 == 1635148611) {
                C22535.m50531(null, str4 == null);
                c17714.m41484(iM41486 + 8);
                C7304 c7304M19582 = C7304.m19582(c17714);
                ArrayList arrayList = c7304M19582.f22415;
                c5065.f15927 = c7304M19582.f22417;
                float f2 = !z ? c7304M19582.f22416 : f;
                String str6 = c7304M19582.f22421;
                int i34 = c7304M19582.f22424;
                int i35 = c7304M19582.f22422;
                int i36 = c7304M19582.f22423;
                iM47897 = c7304M19582.f22419;
                byteBufferOrder = byteBuffer;
                str5 = str6;
                i30 = i34;
                f = f2;
                i27 = c7304M19582.f22418;
                i26 = c7304M19582.f22414;
                i24 = i35;
                i28 = i36;
                str4 = "video/avc";
                listM6131 = arrayList;
            } else {
                int i37 = i32;
                if (iM41494 == 1752589123) {
                    C22535.m50531(null, str4 == null);
                    c17714.m41484(iM41486 + 8);
                    C10916 c10916M27219 = C10916.m27219(c17714);
                    List list = c10916M27219.f32808;
                    c5065.f15927 = c10916M27219.f32794;
                    float f3 = !z ? c10916M27219.f32795 : f;
                    int i38 = c10916M27219.f32798;
                    int i39 = c10916M27219.f32802;
                    String str7 = c10916M27219.f32803;
                    int i40 = c10916M27219.f32791;
                    if (i40 != -1) {
                        i37 = i40;
                    }
                    int i41 = c10916M27219.f32797;
                    int i42 = c10916M27219.f32809;
                    i24 = c10916M27219.f32804;
                    int i43 = c10916M27219.f32805;
                    int i44 = c10916M27219.f32801;
                    int i45 = c10916M27219.f32800;
                    int i46 = c10916M27219.f32793;
                    C7131 c7133 = c10916M27219.f32796;
                    c5065.f15926 = c10916M27219.f32806;
                    i30 = i38;
                    i31 = i39;
                    str5 = str7;
                    i25 = i41;
                    i27 = i45;
                    i26 = i46;
                    c7132 = c7133;
                    str4 = "video/hevc";
                    f = f3;
                    i28 = i43;
                    listM6131 = list;
                    i32 = i37;
                    i29 = i42;
                    iM47897 = i44;
                    byteBufferOrder = byteBuffer;
                } else {
                    String str8 = "childAtomSize must be positive";
                    if (iM41494 == 1818785347) {
                        C22535.m50531("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                        C22535.m50531("must have at least two layers", c7132 != null && c7132.f21883.size() >= 2);
                        c17714.m41484(iM41486 + 8);
                        c7132.getClass();
                        C10916 c10916M27220 = C10916.m27220(c17714, c7132);
                        C22535.m50531("invalid lhvC parameter sets", (c10916M27220.f32792 || c10916M27220.f32807 || c10916M27220.f32799) ? false : true);
                        C22535.m50531("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c5065.f15927 == c10916M27220.f32794);
                        int i47 = c10916M27220.f32804;
                        if (i47 != -1) {
                            C22535.m50531("colorSpace must be the same for both views", i24 == i47);
                        }
                        int i48 = c10916M27220.f32805;
                        if (i48 != -1) {
                            C22535.m50531("colorRange must be the same for both views", i28 == i48);
                        }
                        int i49 = c10916M27220.f32801;
                        if (i49 != -1) {
                            C22535.m50531("colorTransfer must be the same for both views", iM47897 == i49);
                        }
                        C22535.m50531("bitdepthLuma must be the same for both views", i27 == c10916M27220.f32800);
                        C22535.m50531("bitdepthChroma must be the same for both views", i26 == c10916M27220.f32793);
                        if (listM6131 != null) {
                            int i50 = AbstractC14545.f44556;
                            C1846 c1846 = new C1846();
                            c1846.m16263(listM6131);
                            c1846.m16263(c10916M27220.f32808);
                            listM6131 = c1846.m6131();
                        } else {
                            C22535.m50531("initializationData must be already set from hvcC atom", false);
                        }
                        String str9 = c10916M27220.f32803;
                        c5065.f15926 = false;
                        byteBufferOrder = byteBuffer;
                        str5 = str9;
                        str4 = "video/mv-hevc";
                        i32 = i37;
                    } else {
                        if (iM41494 == 1986361461) {
                            c17714.m41484(iM41486 + 8);
                            int iM41487 = c17714.m41485();
                            C3653 c3653 = null;
                            while (iM41487 - iM41486 < iM41493) {
                                c17714.m41484(iM41487);
                                int iM41495 = c17714.m41493();
                                String str10 = str8;
                                C22535.m50531(str10, iM41495 > 0);
                                int i51 = i26;
                                if (c17714.m41493() == 1702454643) {
                                    c17714.m41484(iM41487 + 8);
                                    int iM41488 = c17714.m41485();
                                    while (true) {
                                        if (iM41488 - iM41487 >= iM41495) {
                                            str3 = str10;
                                            c3653 = null;
                                            break;
                                        }
                                        c17714.m41484(iM41488);
                                        int iM41496 = c17714.m41493();
                                        C22535.m50531(str10, iM41496 > 0);
                                        str3 = str10;
                                        if (c17714.m41493() == 1937011305) {
                                            c17714.m41478(4);
                                            int iM41456 = c17714.m41456();
                                            c3653 = new C3653(new C0124((iM41456 & 1) == 1, (iM41456 & 2) == 2, (iM41456 & 8) == 8));
                                            break;
                                        }
                                        iM41488 += iM41496;
                                        str10 = str3;
                                    }
                                } else {
                                    str3 = str10;
                                }
                                iM41487 += iM41495;
                                i26 = i51;
                                str8 = str3;
                                i27 = i27;
                                i28 = i28;
                            }
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            C21293 c21293 = c3653 == null ? null : new C21293(c3653);
                            if (c21293 == null) {
                                i32 = i37;
                            } else if (c7132 == null || c7132.f21883.size() < 2) {
                                i32 = i37;
                                if (i32 == -1) {
                                    i32 = c21293.f68657.f11518.f1231 ? 5 : 4;
                                }
                            } else {
                                C22535.m50531("both eye views must be marked as available", c21293.m48328());
                                C22535.m50531("for MV-HEVC, eye_views_reversed must be set to false", !c21293.f68657.f11518.f1231);
                                i32 = i37;
                            }
                            byteBufferOrder = byteBuffer;
                            i11 = iIntValue;
                        } else {
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            i32 = i37;
                            if (iM41494 == 1685480259 || iM41494 == 1685485123 || iM41494 == 1685485379) {
                                i10 = i32;
                                c7131 = c7132;
                                int i52 = iM41493 - 8;
                                byte[] bArr2 = new byte[i52];
                                c17714.m41461(0, i52, bArr2);
                                if (listM6131 != null) {
                                    int i53 = AbstractC14545.f44556;
                                    C1846 c1847 = new C1846();
                                    c1847.m16263(listM6131);
                                    c1847.m16264(bArr2);
                                    listM6131 = c1847.m6131();
                                } else {
                                    C22535.m50531("initializationData must already be set from hvcC or avcC atom", false);
                                }
                                c17714.m41484(iM41486 + 8);
                                C19126 c19126M44156 = C19126.m44156(c17714);
                                if (c19126M44156 != null) {
                                    str2 = c19126M44156.f60276;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str2 = str5;
                                }
                                byteBufferOrder = byteBuffer;
                                fM41492 = f;
                            } else {
                                int i54 = 12;
                                if (iM41494 == 1987076931) {
                                    C22535.m50531(null, str4 == null);
                                    int i55 = iIntValue;
                                    String str11 = i55 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c17714.m41484(iM41486 + 12);
                                    byte bM41456 = (byte) c17714.m41456();
                                    byte bM41457 = (byte) c17714.m41456();
                                    int iM41457 = c17714.m41456();
                                    i26 = iM41457 >> 4;
                                    byte b = (byte) ((iM41457 >> 1) & 7);
                                    if (str11.equals("video/x-vnd.on2.vp9")) {
                                        int i56 = C17839.f54488;
                                        listM6131 = AbstractC14545.of((Object) new byte[]{1, 1, bM41456, 2, 1, bM41457, 3, 1, (byte) i26, 4, 1, b});
                                    }
                                    boolean z2 = (iM41457 & 1) != 0;
                                    int iM41458 = c17714.m41456();
                                    int iM41459 = c17714.m41456();
                                    int iM47898 = C21054.m47898(iM41458);
                                    byteBufferOrder = byteBuffer;
                                    str4 = str11;
                                    i28 = z2 ? 1 : 2;
                                    i24 = iM47898;
                                    iM47897 = C21054.m47897(iM41459);
                                    iIntValue = i55;
                                    i27 = i26;
                                } else {
                                    i11 = iIntValue;
                                    if (iM41494 == 1635135811) {
                                        int i57 = iM41493 - 8;
                                        byte[] bArr3 = new byte[i57];
                                        c17714.m41461(0, i57, bArr3);
                                        listM6131 = AbstractC14545.of((Object) bArr3);
                                        c17714.m41484(iM41486 + 8);
                                        C6942 c6942 = new C6942();
                                        byte[] bArrM41482 = c17714.m41482();
                                        C16302 c16302 = new C16302(bArrM41482, bArrM41482.length);
                                        c16302.m38354(c17714.m41485() * 8);
                                        c16302.m38347(1);
                                        int iM38345 = c16302.m38343(3);
                                        c16302.m38351(6);
                                        boolean zM38352 = c16302.m38352();
                                        boolean zM38353 = c16302.m38352();
                                        int i58 = 2;
                                        if (iM38345 != 2) {
                                            if (iM38345 <= i58) {
                                                if (zM38352) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c6942.m18756(i15);
                                                if (zM38352) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c6942.m18752(i16);
                                            }
                                        } else if (zM38352) {
                                            c6942.m18756(zM38353 ? 12 : 10);
                                            c6942.m18752(zM38353 ? 12 : 10);
                                        } else {
                                            i58 = 2;
                                            if (iM38345 <= i58) {
                                                if (zM38352) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c6942.m18756(i15);
                                                if (zM38352) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c6942.m18752(i16);
                                            }
                                        }
                                        c16302.m38351(13);
                                        c16302.m38346();
                                        int iM38346 = c16302.m38343(4);
                                        if (iM38346 != 1) {
                                            C19956.m46035("Unsupported obu_type: " + iM38346);
                                            c21054M18751 = c6942.m18751();
                                        } else if (c16302.m38352()) {
                                            C19956.m46035("Unsupported obu_extension_flag");
                                            c21054M18751 = c6942.m18751();
                                        } else {
                                            boolean zM38354 = c16302.m38352();
                                            c16302.m38346();
                                            if (zM38354 && c16302.m38343(8) > 127) {
                                                C19956.m46035("Excessive obu_size");
                                                c21054M18751 = c6942.m18751();
                                            } else {
                                                int iM38347 = c16302.m38343(3);
                                                c16302.m38346();
                                                if (c16302.m38352()) {
                                                    C19956.m46035("Unsupported reduced_still_picture_header");
                                                    c21054M18751 = c6942.m18751();
                                                } else if (c16302.m38352()) {
                                                    C19956.m46035("Unsupported timing_info_present_flag");
                                                    c21054M18751 = c6942.m18751();
                                                } else if (c16302.m38352()) {
                                                    C19956.m46035("Unsupported initial_display_delay_present_flag");
                                                    c21054M18751 = c6942.m18751();
                                                } else {
                                                    int i59 = 5;
                                                    int iM38348 = c16302.m38343(5);
                                                    int i60 = 0;
                                                    while (i60 <= iM38348) {
                                                        c16302.m38351(i54);
                                                        if (c16302.m38343(i59) > 7) {
                                                            c16302.m38346();
                                                        }
                                                        i60++;
                                                        i59 = 5;
                                                        i54 = 12;
                                                    }
                                                    int iM38349 = c16302.m38343(4);
                                                    int iM383410 = c16302.m38343(4);
                                                    c16302.m38351(iM38349 + 1);
                                                    c16302.m38351(iM383410 + 1);
                                                    if (c16302.m38352()) {
                                                        i17 = 7;
                                                        c16302.m38351(7);
                                                    } else {
                                                        i17 = 7;
                                                    }
                                                    c16302.m38351(i17);
                                                    boolean zM38355 = c16302.m38352();
                                                    if (zM38355) {
                                                        c16302.m38351(2);
                                                    }
                                                    if (c16302.m38352()) {
                                                        i18 = 1;
                                                        iM38343 = 2;
                                                    } else {
                                                        i18 = 1;
                                                        iM38343 = c16302.m38343(1);
                                                    }
                                                    if (iM38343 > 0 && !c16302.m38352()) {
                                                        c16302.m38351(i18);
                                                    }
                                                    if (zM38355) {
                                                        i19 = 3;
                                                        c16302.m38351(3);
                                                    } else {
                                                        i19 = 3;
                                                    }
                                                    c16302.m38351(i19);
                                                    boolean zM38356 = c16302.m38352();
                                                    if (iM38347 == 2 && zM38356) {
                                                        c16302.m38346();
                                                    }
                                                    boolean z3 = iM38347 != 1 && c16302.m38352();
                                                    if (c16302.m38352()) {
                                                        int iM383411 = c16302.m38343(8);
                                                        int iM383412 = c16302.m38343(8);
                                                        int iM383413 = c16302.m38343(8);
                                                        if (z3) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 1;
                                                            if (iM383411 == 1 && iM383412 == 13 && iM383413 == 0) {
                                                                iM38344 = 1;
                                                            }
                                                            c6942.m18755(C21054.m47898(iM383411));
                                                            if (iM38344 == i20) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = 2;
                                                            }
                                                            c6942.m18754(i21);
                                                            c6942.m18757(C21054.m47897(iM383412));
                                                        }
                                                        iM38344 = c16302.m38343(i20);
                                                        c6942.m18755(C21054.m47898(iM383411));
                                                        if (iM38344 == i20) {
                                                            i21 = 1;
                                                        } else {
                                                            i21 = 2;
                                                        }
                                                        c6942.m18754(i21);
                                                        c6942.m18757(C21054.m47897(iM383412));
                                                    }
                                                    c21054M18751 = c6942.m18751();
                                                }
                                            }
                                        }
                                        i27 = c21054M18751.f67920;
                                        i26 = c21054M18751.f67914;
                                        i24 = c21054M18751.f67917;
                                        i28 = c21054M18751.f67915;
                                        iM47897 = c21054M18751.f67919;
                                        str4 = "video/av01";
                                        iIntValue = i11;
                                        c7131 = c7132;
                                    } else if (iM41494 == 1668050025) {
                                        byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        byteBufferOrder.position(21);
                                        byteBufferOrder.putShort(c17714.m41455());
                                        byteBufferOrder.putShort(c17714.m41455());
                                    } else {
                                        if (iM41494 == 1835295606) {
                                            byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short sM41455 = c17714.m41455();
                                            short sM41456 = c17714.m41455();
                                            short sM41457 = c17714.m41455();
                                            short sM41458 = c17714.m41455();
                                            short sM41459 = c17714.m41455();
                                            short sM414510 = c17714.m41455();
                                            iIntValue = i11;
                                            short sM414511 = c17714.m41455();
                                            c7131 = c7132;
                                            short sM414512 = c17714.m41455();
                                            long jM41479 = c17714.m41479();
                                            long jM414710 = c17714.m41479();
                                            i10 = i32;
                                            byteBufferOrder.position(1);
                                            byteBufferOrder.putShort(sM41459);
                                            byteBufferOrder.putShort(sM414510);
                                            byteBufferOrder.putShort(sM41455);
                                            byteBufferOrder.putShort(sM41456);
                                            byteBufferOrder.putShort(sM41457);
                                            byteBufferOrder.putShort(sM41458);
                                            byteBufferOrder.putShort(sM414511);
                                            byteBufferOrder.putShort(sM414512);
                                            byteBufferOrder.putShort((short) (jM41479 / 10000));
                                            byteBufferOrder.putShort((short) (jM414710 / 10000));
                                        } else {
                                            iIntValue = i11;
                                            i10 = i32;
                                            c7131 = c7132;
                                            if (iM41494 == 1681012275) {
                                                C22535.m50531(null, str4 == null);
                                                str4 = "video/3gpp";
                                            } else {
                                                byte[] bArrCopyOfRange = null;
                                                if (iM41494 == 1702061171) {
                                                    C22535.m50531(null, str4 == null);
                                                    c2242M49486 = m49486(iM41486, c17714);
                                                    str4 = c2242M49486.f7312;
                                                    byte[] bArr4 = c2242M49486.f7311;
                                                    if (bArr4 != null) {
                                                        listM6131 = AbstractC14545.of((Object) bArr4);
                                                    }
                                                } else if (iM41494 == 1651798644) {
                                                    c17714.m41484(iM41486 + 8);
                                                    c17714.m41478(4);
                                                    byteBufferOrder = byteBuffer;
                                                    c8592 = new C8592(c17714.m41479(), c17714.m41479());
                                                } else if (iM41494 == 1885434736) {
                                                    c17714.m41484(iM41486 + 8);
                                                    fM41492 = c17714.m41492() / c17714.m41492();
                                                    z = true;
                                                    byteBufferOrder = byteBuffer;
                                                    str2 = str5;
                                                } else if (iM41494 == 1937126244) {
                                                    int i61 = iM41486 + 8;
                                                    while (i61 - iM41486 < iM41493) {
                                                        c17714.m41484(i61);
                                                        int iM41497 = c17714.m41493();
                                                        if (c17714.m41493() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(c17714.m41482(), i61, iM41497 + i61);
                                                            break;
                                                        }
                                                        i61 += iM41497;
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    bArr = bArrCopyOfRange;
                                                } else if (iM41494 == 1936995172) {
                                                    int iM414510 = c17714.m41456();
                                                    c17714.m41478(3);
                                                    if (iM414510 != 0) {
                                                        i32 = i10;
                                                    } else {
                                                        int iM414511 = c17714.m41456();
                                                        if (iM414511 == 0) {
                                                            i32 = 0;
                                                        } else if (iM414511 == 1) {
                                                            i32 = 1;
                                                        } else if (iM414511 == 2) {
                                                            i32 = 2;
                                                        } else if (iM414511 != 3) {
                                                            i32 = i10;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                    i26 = i7;
                                                    i27 = i8;
                                                    i28 = i9;
                                                } else {
                                                    if (iM41494 == 1634760259) {
                                                        int i62 = iM41493 - 12;
                                                        byte[] bArr5 = new byte[i62];
                                                        c17714.m41484(iM41486 + 12);
                                                        c17714.m41461(0, i62, bArr5);
                                                        listM6131 = AbstractC14545.of((Object) bArr5);
                                                        C17714 c17715 = new C17714(bArr5);
                                                        C6942 c6943 = new C6942();
                                                        byte[] bArrM41483 = c17715.m41482();
                                                        C16302 c16303 = new C16302(bArrM41483, bArrM41483.length);
                                                        c16303.m38354(c17715.m41485() * 8);
                                                        int i63 = 1;
                                                        c16303.m38347(1);
                                                        int iM383414 = c16303.m38343(8);
                                                        int i64 = 0;
                                                        while (i64 < iM383414) {
                                                            c16303.m38347(i63);
                                                            int iM383415 = c16303.m38343(8);
                                                            for (int i65 = 0; i65 < iM383415; i65++) {
                                                                c16303.m38351(6);
                                                                boolean zM38357 = c16303.m38352();
                                                                c16303.m38346();
                                                                c16303.m38347(11);
                                                                c16303.m38351(4);
                                                                int iM383416 = c16303.m38343(4) + 8;
                                                                c6943.m18756(iM383416);
                                                                c6943.m18752(iM383416);
                                                                c16303.m38347(1);
                                                                if (zM38357) {
                                                                    int iM383417 = c16303.m38343(8);
                                                                    int iM383418 = c16303.m38343(8);
                                                                    c16303.m38347(1);
                                                                    boolean zM38358 = c16303.m38352();
                                                                    c6943.m18755(C21054.m47898(iM383417));
                                                                    c6943.m18754(zM38358 ? 1 : 2);
                                                                    c6943.m18757(C21054.m47897(iM383418));
                                                                }
                                                            }
                                                            i64++;
                                                            i63 = 1;
                                                        }
                                                        C21054 c21054M18752 = c6943.m18751();
                                                        i27 = c21054M18752.f67920;
                                                        i26 = c21054M18752.f67914;
                                                        i13 = c21054M18752.f67917;
                                                        i12 = c21054M18752.f67915;
                                                        i14 = c21054M18752.f67919;
                                                        str4 = "video/apv";
                                                    } else if (iM41494 == 1668246642 && i24 == -1 && iM47897 == -1) {
                                                        int iM41498 = c17714.m41493();
                                                        if (iM41498 == 1852009592 || iM41498 == 1852009571) {
                                                            int iM41466 = c17714.m41464();
                                                            int iM41467 = c17714.m41464();
                                                            c17714.m41478(2);
                                                            boolean z4 = iM41493 == 19 && (c17714.m41456() & 128) != 0;
                                                            int iM47899 = C21054.m47898(iM41466);
                                                            i12 = z4 ? 1 : 2;
                                                            int iM478910 = C21054.m47897(iM41467);
                                                            i26 = i7;
                                                            i27 = i8;
                                                            i13 = iM47899;
                                                            i14 = iM478910;
                                                        } else {
                                                            C19956.m46037("Unsupported color type: " + AbstractC14891.m35327(iM41498));
                                                        }
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    iM47897 = i14;
                                                    i24 = i13;
                                                    i28 = i12;
                                                    c7132 = c7131;
                                                    i32 = i10;
                                                }
                                            }
                                            byteBufferOrder = byteBuffer;
                                        }
                                        fM41492 = f;
                                        str2 = str5;
                                    }
                                    byteBufferOrder = byteBuffer;
                                    c7132 = c7131;
                                }
                            }
                            f = fM41492;
                            str5 = str2;
                            c7132 = c7131;
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
            iM41485 = i33 + iM41493;
            i22 = i2;
            i23 = i3;
            c5065 = c5064;
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
        C1297 c1297 = new C1297();
        c1297.m4467(i4);
        c1297.m4465(str4);
        c1297.m4445(str5);
        c1297.m4453(iM41464);
        c1297.m4457(iM41465);
        c1297.m4455(i25);
        c1297.m4480(i29);
        c1297.m4460(f);
        c1297.m4439(i5);
        c1297.m4450(bArr);
        c1297.m4478(i66);
        c1297.m4446(listM6131);
        c1297.m4452(i30);
        c1297.m4474(i31);
        c1297.m4447(c19644);
        c1297.m4471(str);
        C6942 c6944 = new C6942();
        c6944.m18755(i24);
        c6944.m18754(i69);
        c6944.m18757(iM47897);
        c6944.m18753(byteBuffer != null ? byteBuffer.array() : null);
        c6944.m18756(i68);
        c6944.m18752(i67);
        c1297.m4448(c6944.m18751());
        if (c8592 != null) {
            c1297.m4468(C13426.m32450(c8592.f26238));
            c1297.m4438(C13426.m32450(c8592.f26239));
        } else if (c2242M49486 != null) {
            c1297.m4468(C13426.m32450(c2242M49486.f7310));
            c1297.m4438(C13426.m32450(c2242M49486.f7313));
        }
        c5064.f15925 = c1297.m4440();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2242 m49486(int i, C17714 c17714) {
        c17714.m41484(i + 12);
        c17714.m41478(1);
        m49492(c17714);
        c17714.m41478(2);
        int iM41456 = c17714.m41456();
        if ((iM41456 & 128) != 0) {
            c17714.m41478(2);
        }
        if ((iM41456 & 64) != 0) {
            c17714.m41478(c17714.m41456());
        }
        if ((iM41456 & 32) != 0) {
            c17714.m41478(2);
        }
        c17714.m41478(1);
        m49492(c17714);
        String strM24796 = C9786.m24796(c17714.m41456());
        if ("audio/mpeg".equals(strM24796) || "audio/vnd.dts".equals(strM24796) || "audio/vnd.dts.hd".equals(strM24796)) {
            return new C2242(-1L, -1L, strM24796, null);
        }
        c17714.m41478(4);
        long jM41479 = c17714.m41479();
        long jM414710 = c17714.m41479();
        c17714.m41478(1);
        int iM49492 = m49492(c17714);
        byte[] bArr = new byte[iM49492];
        c17714.m41461(0, iM49492, bArr);
        if (jM414710 <= 0) {
            jM414710 = -1;
        }
        return new C2242(jM414710, jM41479 > 0 ? jM41479 : -1L, strM24796, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m49484(C17714 c17714, int i, int i2) throws C9080 {
        int i3;
        int i4;
        int iM41485 = c17714.m41485();
        while (iM41485 - i < i2) {
            c17714.m41484(iM41485);
            int iM41493 = c17714.m41493();
            C22535.m50531("childAtomSize must be positive", iM41493 > 0);
            if (c17714.m41493() == 1936289382) {
                int i5 = iM41485 + 8;
                int i6 = -1;
                Integer numValueOf = null;
                int i7 = 0;
                String strM41459 = null;
                while (i5 - iM41485 < iM41493) {
                    c17714.m41484(i5);
                    int iM41494 = c17714.m41493();
                    int iM41495 = c17714.m41493();
                    if (iM41495 == 1718775137) {
                        numValueOf = Integer.valueOf(c17714.m41493());
                    } else if (iM41495 == 1935894637) {
                        c17714.m41478(4);
                        strM41459 = c17714.m41459(4, StandardCharsets.UTF_8);
                    } else if (iM41495 == 1935894633) {
                        i6 = i5;
                        i7 = iM41494;
                    }
                    i5 += iM41494;
                }
                C23449 c23449 = null;
                Pair pairCreate = null;
                bArr = null;
                byte[] bArr = null;
                if ("cenc".equals(strM41459) || "cbc1".equals(strM41459) || "cens".equals(strM41459) || "cbcs".equals(strM41459)) {
                    C22535.m50531("frma atom is mandatory", numValueOf != null);
                    C22535.m50531("schi atom is mandatory", i6 != -1);
                    int i8 = i6 + 8;
                    while (i8 - i6 < i7) {
                        c17714.m41484(i8);
                        int iM41496 = c17714.m41493();
                        if (c17714.m41493() == 1952804451) {
                            int iM49483 = m49483(c17714.m41493());
                            c17714.m41478(1);
                            if (iM49483 == 0) {
                                c17714.m41478(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM41456 = c17714.m41456();
                                i3 = iM41456 & 15;
                                i4 = (iM41456 & 240) >> 4;
                            }
                            boolean z = c17714.m41456() == 1;
                            int iM41457 = c17714.m41456();
                            byte[] bArr2 = new byte[16];
                            c17714.m41461(0, 16, bArr2);
                            if (z && iM41457 == 0) {
                                int iM41458 = c17714.m41456();
                                bArr = new byte[iM41458];
                                c17714.m41461(0, iM41458, bArr);
                            }
                            c23449 = new C23449(z, strM41459, iM41457, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM41496;
                    }
                    C22535.m50531("tenc atom is mandatory", c23449 != null);
                    String str = C3603.f11424;
                    pairCreate = Pair.create(numValueOf, c23449);
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM41485 += iM41493;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49492(C17714 c17714) {
        int iM41456 = c17714.m41456();
        int i = iM41456 & 127;
        while ((iM41456 & 128) == 128) {
            iM41456 = c17714.m41456();
            i = (i << 7) | (iM41456 & 127);
        }
        return i;
    }
}
