package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.۫᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12639 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f38077;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4160 f38082;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38075 = Pattern.compile("v\\d+");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38078 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+|\\s([+,-])?\\d+");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38076 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+([l,L])?|\\s([+,-])?\\d+([l,L])?");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f38079 = Pattern.compile("\\s|:|->");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f38080 = Pattern.compile("\\s|\\(|\\)|->");

    public C12639(C4160 c4160) {
        this.f38082 = c4160;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30910(C4849 c4849) {
        int[] iArrM17880;
        int i;
        Object[] objArr;
        Object[] objArr2;
        C4160 c4160 = this.f38082;
        if (c4160 == null) {
            return;
        }
        AbstractC2043[] abstractC2043Arr = c4160.f13573;
        int[] iArr = new int[abstractC2043Arr.length];
        Arrays.fill(iArr, -1);
        C6486 c6486 = new C6486(1);
        HashMap map = new HashMap();
        int length = abstractC2043Arr.length;
        int iMo6715 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C6339 c6339 = abstractC2043Arr[i2];
            switch (C13344.f39919[c6339.mo2742().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iArr[i2] = ((InterfaceC14742) c6339).mo4860() + iMo6715;
                    int i3 = C13344.f39920[c6339.f6840.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        map.put(Integer.valueOf(iArr[i2]), Integer.valueOf(iMo6715));
                    }
                    break;
                case 7:
                case 8:
                    int iIntValue = ((Integer) map.get(Integer.valueOf(iMo6715))).intValue();
                    for (int i4 : c6339.mo17617()) {
                        c6486.m17879(iIntValue + i4, 0);
                    }
                    break;
            }
            iMo6715 += c6339.mo6715(iMo6715);
        }
        Arrays.sort(iArr);
        int[] iArrM17881 = {-1};
        if (c6486.m17881() > 0) {
            iArrM17881 = c6486.m17880();
        }
        Arrays.sort(iArrM17881);
        C2749[] c2749Arr = c4160.f13575;
        if (c2749Arr != null && c2749Arr.length > 0) {
            C6486 c6487 = new C6486(3);
            for (C2749 c2749 : c2749Arr) {
                int iM8500 = c2749.m8500();
                int iM8501 = c2749.m8501() + iM8500;
                c6487.m17879(iM8500, 0);
                c6487.m17879(iM8501, 0);
                C9099 c9099 = c2749.f8553;
                int iM23473 = c9099.m23473();
                if (iM23473 != -1) {
                    c6487.m17879(iM23473, 0);
                } else {
                    for (C16153 c16153 : c9099.f27575) {
                        c6487.m17879(c16153.m38080(), 0);
                    }
                }
            }
            iArrM17880 = c6487.m17880();
        } else {
            iArrM17880 = new int[]{-1};
        }
        Arrays.sort(iArrM17880);
        int length2 = abstractC2043Arr.length;
        int i5 = 0;
        int iMo6716 = 0;
        Object[] objArr3 = abstractC2043Arr;
        while (i5 < length2) {
            C6339 c63310 = objArr3[i5];
            if (Arrays.binarySearch(iArr, iMo6716) >= 0 || Arrays.binarySearch(iArrM17880, iMo6716) >= 0) {
                c4849.write("label_");
                c4849.write(String.valueOf(iMo6716));
                c4849.write(58);
                c4849.write(10);
            }
            if (Arrays.binarySearch(iArrM17881, iMo6716) >= 0) {
                c4849.write("switch_");
                c4849.m14115(iMo6716);
                c4849.write(58);
                c4849.write(10);
            }
            int[] iArr2 = C13344.f39919;
            EnumC23957 enumC23957Mo2742 = c63310.mo2742();
            EnumC23915 enumC23915 = c63310.f6840;
            switch (iArr2[enumC23957Mo2742.ordinal()]) {
                case 1:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    m30902(c4849, ((C21136) c63310).mo4860() + iMo6716);
                    c4849.write(10);
                    break;
                case 2:
                case 5:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    m30902(c4849, ((InterfaceC14742) c63310).mo4860() + iMo6716);
                    c4849.write(10);
                    break;
                case 3:
                    objArr = objArr3;
                    C13373 c13373 = (C13373) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c13373.mo2740());
                    c4849.write(32);
                    m30902(c4849, c13373.mo4860() + iMo6716);
                    c4849.write(10);
                    break;
                case 4:
                    objArr = objArr3;
                    C16922 c16922 = (C16922) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c16922.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c16922.m39769());
                    c4849.write(32);
                    m30902(c4849, c16922.mo4860() + iMo6716);
                    c4849.write(10);
                    break;
                case 6:
                    objArr = objArr3;
                    C19040 c19040 = (C19040) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c19040.mo2740());
                    c4849.write(32);
                    m30902(c4849, c19040.mo4860() + iMo6716);
                    c4849.write(10);
                    break;
                case 7:
                    objArr = objArr3;
                    C6339 c63311 = c63310;
                    c4849.write(".pswitch_data ");
                    int iM17616 = c63311.m17616();
                    c4849.m14115(iM17616);
                    c4849.write(10);
                    c4849.m14117();
                    int iIntValue2 = ((Integer) map.get(Integer.valueOf(iMo6716))).intValue();
                    int[] iArrMo17617 = c63311.mo17617();
                    int length3 = iArrMo17617.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = iArrMo17617[i6] + iIntValue2;
                        c4849.write(String.valueOf(iM17616));
                        c4849.write(" : switch_");
                        c4849.write(String.valueOf(i7));
                        c4849.write(10);
                        i6++;
                        iM17616++;
                    }
                    c4849.m14114();
                    c4849.write(".end pswitch_data");
                    c4849.write(10);
                    break;
                case 8:
                    objArr = objArr3;
                    c4849.write(".sswitch_data");
                    c4849.write(10);
                    int iIntValue3 = ((Integer) map.get(Integer.valueOf(iMo6716))).intValue();
                    Iterator itM33712 = ((C14099) c63310).m33712();
                    c4849.m14117();
                    while (itM33712.hasNext()) {
                        C23272 c23272 = (C23272) itM33712.next();
                        int i8 = c23272.f74748;
                        int i9 = c23272.f74749 + iIntValue3;
                        c4849.write(String.valueOf(i8));
                        c4849.write(" : switch_");
                        c4849.write(String.valueOf(i9));
                        c4849.write(10);
                    }
                    c4849.m14114();
                    c4849.write(".end sswitch_data");
                    c4849.write(10);
                    break;
                case 9:
                    objArr = objArr3;
                    if (enumC23915 != EnumC23915.f77361) {
                        c4849.write(enumC23915.f77585);
                        c4849.write(10);
                    }
                    break;
                case 10:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((C19019) c63310).mo2740());
                    c4849.write(10);
                    break;
                case 11:
                    objArr = objArr3;
                    C2791 c2791 = (C2791) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2791.mo2740());
                    c4849.write(32);
                    c4849.write(String.valueOf(c2791.mo6990()));
                    c4849.write(32);
                    c4849.write(10);
                    break;
                case 12:
                    objArr = objArr3;
                    C0673 c0673 = (C0673) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0673.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0673.m2741());
                    c4849.write(10);
                    break;
                case 13:
                case 14:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((InterfaceC21094) c63310).mo2740());
                    c4849.write(32);
                    m30903(c4849, c63310);
                    c4849.write(10);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(((InterfaceC21094) c63310).mo2740());
                    c4849.write(32);
                    long jMo6990 = ((InterfaceC18271) c63310).mo6990();
                    if (jMo6990 < 0) {
                        c4849.write("-0x");
                        c4849.m14116(-jMo6990);
                        if (jMo6990 < -2147483648L) {
                            c4849.write(76);
                        }
                    } else {
                        c4849.write("0x");
                        c4849.m14116(jMo6990);
                        if (jMo6990 > 2147483647L) {
                            c4849.write(76);
                        }
                    }
                    c4849.write(10);
                    break;
                case 19:
                    objArr = objArr3;
                    C17628 c17628 = (C17628) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c17628.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c17628.m41218());
                    c4849.write(10);
                    break;
                case 20:
                    objArr = objArr3;
                    C10552 c10552 = (C10552) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c10552.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c10552.m26533());
                    c4849.write(32);
                    c4849.write(String.valueOf(c10552.mo6990()));
                    c4849.write(10);
                    break;
                case 21:
                    objArr = objArr3;
                    C11963 c11963 = (C11963) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c11963.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c11963.m29241());
                    c4849.write(32);
                    m30903(c4849, c11963);
                    c4849.write(10);
                    break;
                case 22:
                    objArr = objArr3;
                    C2106 c2106 = (C2106) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2106.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c2106.m6991());
                    c4849.write(32);
                    c4849.write(String.valueOf(c2106.mo6990()));
                    c4849.write(10);
                    break;
                case 23:
                    objArr = objArr3;
                    C23978 c23978 = (C23978) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.m52797());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c23978.m52798());
                    c4849.write(10);
                    break;
                case 24:
                    objArr = objArr3;
                    C0694 c0694 = (C0694) c63310;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0694.mo2740());
                    c4849.write(32);
                    c4849.write(118);
                    c4849.m14115(c0694.m2783());
                    c4849.write(10);
                    break;
                case 25:
                case 26:
                    objArr = objArr3;
                    c4849.write(enumC23915.f77585);
                    c4849.write(32);
                    InterfaceC16901 interfaceC16901 = (InterfaceC16901) c63310;
                    byte bMo4894 = interfaceC16901.mo4894();
                    c4849.write(123);
                    if (bMo4894 == 1) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                    } else if (bMo4894 == 2) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                    } else if (bMo4894 == 3) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                    } else if (bMo4894 == 4) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4890());
                    } else if (bMo4894 == 5) {
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4892());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4891());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4893());
                        c4849.write(",");
                        c4849.write(118);
                        c4849.m14115((int) interfaceC16901.mo4890());
                        c4849.write(",");
                        c4849.write(am.aE);
                        c4849.m14115((int) interfaceC16901.mo4889());
                    }
                    c4849.write(q.h);
                    c4849.write(32);
                    m30903(c4849, c63310);
                    c4849.write(10);
                    break;
                case 27:
                    objArr = objArr3;
                    C4928 c4928 = (C4928) c63310;
                    c4849.write(enumC23915.f77585);
                    short sM14349 = c4928.m14349();
                    int iM14348 = c4928.m14348();
                    c4849.write(32);
                    c4849.write(123);
                    c4849.write(118);
                    c4849.m14115(iM14348);
                    c4849.write("..");
                    c4849.write(118);
                    c4849.m14115((c4928.m14348() + sM14349) - 1);
                    c4849.write(q.h);
                    c4849.write(32);
                    m30903(c4849, c4928);
                    c4849.write(10);
                    break;
                case 28:
                    C14784 c14784 = (C14784) c63310;
                    c4849.write(".array_data");
                    c4849.write(32);
                    c4849.m14115(c14784.m35171());
                    c4849.write(10);
                    c4849.m14117();
                    Iterator itM35169 = c14784.m35169();
                    Object[] objArr4 = objArr3;
                    while (itM35169.hasNext()) {
                        C17607 c17607 = (C17607) itM35169.next();
                        int i10 = c17607.f53796;
                        Object[] objArr5 = objArr4;
                        while (true) {
                            objArr2 = objArr5;
                            if (i10 < c17607.f53797 + c17607.f53796) {
                                byte b = c17607.f53795[i10];
                                c4849.write("0x");
                                c4849.m14116(b & 255);
                                c4849.write(116);
                                c4849.write(32);
                                i10++;
                                itM35169 = itM35169;
                                objArr5 = objArr2;
                                c17607 = c17607;
                            }
                        }
                        c4849.write(10);
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    c4849.m14114();
                    c4849.write(".end array_data");
                    c4849.write(10);
                    break;
                default:
                    objArr = objArr3;
                    break;
            }
            iMo6716 += c63310.mo6715(iMo6716);
            i5++;
            objArr3 = objArr;
        }
        if (Arrays.binarySearch(iArr, iMo6716) >= 0) {
            c4849.write("label_");
            c4849.write(String.valueOf(iMo6716));
            c4849.write(58);
            i = 10;
            c4849.write(10);
        } else {
            if (Arrays.binarySearch(iArrM17880, iMo6716) >= 0) {
                c4849.write(10);
                c4849.write("label_");
                c4849.write(String.valueOf(iMo6716));
                c4849.write(58);
                c4849.write(10);
            }
            i = 10;
        }
        if (Arrays.binarySearch(iArrM17881, iMo6716) >= 0) {
            c4849.write("switch_");
            c4849.write(String.valueOf(iMo6716));
            c4849.write(58);
            c4849.write(i);
        }
        C2749[] c2749Arr2 = c4160.f13575;
        if (c2749Arr2 == null || c2749Arr2.length <= 0) {
            return;
        }
        c4849.write(i);
        c4849.write(i);
        c4849.write("#Handler Exceptions");
        c4849.write(i);
        c4849.write(i);
        int length4 = c2749Arr2.length;
        int i11 = 0;
        while (i11 < length4) {
            C2749 c27410 = c2749Arr2[i11];
            int iM8502 = c27410.m8500();
            int iM8503 = c27410.m8501() + iM8502;
            C9099 c90910 = c27410.f8553;
            int iM23474 = c90910.m23473();
            if (iM23474 != -1) {
                c4849.write(".catch ");
                c4849.write(ProviderConfigurationPermission.ALL_STR);
                c4849.write(10);
                c4849.m14117();
                c4849.write("start : ");
                c4849.write("label_");
                c4849.m14115(iM8502);
                c4849.write(10);
                c4849.write("end : ");
                c4849.write("label_");
                c4849.m14115(iM8503);
                c4849.write(10);
                c4849.write("handler : ");
                c4849.write("label_");
                c4849.m14115(iM23474);
                c4849.write(10);
                c4849.m14114();
                c4849.write(".end catch");
                c4849.write(10);
                c4849.write(10);
            } else {
                C16153[] c16153Arr = c90910.f27575;
                int length5 = c16153Arr.length;
                int i12 = 0;
                while (i12 < length5) {
                    C16153 c16154 = c16153Arr[i12];
                    c4849.write(".catch ");
                    c4849.write(c16154.f49753.m50835());
                    c4849.write(10);
                    c4849.m14117();
                    c4849.write("start : ");
                    c4849.write("label_");
                    c4849.m14115(iM8502);
                    c4849.write(10);
                    c4849.write("end : ");
                    c4849.write("label_");
                    c4849.m14115(iM8503);
                    c4849.write(10);
                    c4849.write("handler : ");
                    c4849.write("label_");
                    c4849.m14115(c16154.m38080());
                    c4849.write(10);
                    c4849.m14114();
                    c4849.write(".end catch");
                    c4849.write(10);
                    c4849.write(10);
                    i12++;
                    length4 = length4;
                }
            }
            i11++;
            length4 = length4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30902(C4849 c4849, int i) {
        c4849.write(58);
        c4849.write("label_");
        c4849.write(String.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30903(C4849 c4849, AbstractC2043 abstractC2043) {
        AbstractC16859 abstractC16859 = (AbstractC16859) abstractC2043;
        int i = C13344.f39921[abstractC2043.f6840.f77584.ordinal()];
        if (i == 1) {
            c4849.write(((C18522) abstractC16859.m39631()).m43043());
            return;
        }
        if (i == 2) {
            c4849.write(((C22050) abstractC16859.m39631()).m49614());
            return;
        }
        if (i == 3) {
            c4849.write(((C22755) abstractC16859.m39631()).m50835());
            return;
        }
        if (i != 4) {
            return;
        }
        C11467 c11467 = (C11467) abstractC16859.m39631();
        c4849.write(34);
        String strM28273 = c11467.m28273();
        for (int i2 = 0; i2 < strM28273.length(); i2++) {
            char cCharAt = strM28273.charAt(i2);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    c4849.write(92);
                }
                c4849.write(cCharAt);
            } else if (cCharAt > 127) {
                c4849.write(cCharAt);
            } else if (cCharAt == '\t') {
                c4849.write("\\t");
            } else if (cCharAt == '\n') {
                c4849.write("\\n");
            } else if (cCharAt == '\r') {
                c4849.write("\\r");
            } else {
                c4849.write(cCharAt);
            }
        }
        c4849.write(34);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0240  */
    /* JADX WARN: Code duplicated, block: B:266:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:268:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:270:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:378:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30909(String str, C3454 c3454) {
        String str2;
        C3454 c3455;
        String[] strArr;
        EnumC23915[] enumC23915Arr;
        HashMap map;
        C17069 c17069M22354;
        C4160 c4160;
        int i;
        ArrayList arrayList;
        String str3;
        int i2;
        int i3;
        int i4;
        AbstractC5116 abstractC5116M30906;
        char c;
        char[] charArray;
        int i5;
        boolean z;
        int i6;
        int i7;
        long j;
        int i8;
        long j2;
        ArrayList arrayList2;
        String str4;
        long j3;
        int iDigit;
        String str5;
        long j4;
        int i9;
        EnumC23915 enumC23915;
        byte b;
        HashMap map2;
        String str6;
        int iMo6715;
        boolean z2;
        int i10;
        byte b2;
        int i11;
        byte b3;
        byte b4;
        String str7;
        HashMap map3;
        int i12;
        String[] strArr2;
        int i13;
        byte b5;
        int iDigit2;
        int i14;
        byte b6;
        C12639 c12639 = this;
        C3454 c3456 = c3454;
        c12639.f38081 = -1;
        C4160 c4161 = c12639.f38082;
        if (c4161 == null) {
            return;
        }
        f38077 = 0;
        String[] strArrSplit = str.split("\n");
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap(1);
        EnumC23915[] enumC23915Arr2 = new EnumC23915[strArrSplit.length];
        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
        ArrayList arrayList4 = new ArrayList(1);
        int length = strArrSplit.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            str2 = "string is null";
            if (i15 < length) {
                c12639.f38081 = i15;
                String strTrim = strArrSplit[i15].trim();
                int i17 = length;
                if (strTrim.equals("") || strTrim.startsWith("#") || strTrim.startsWith("//")) {
                    enumC23915Arr = enumC23915Arr2;
                    enumC23915Arr[i15] = null;
                } else {
                    if (strTrim.endsWith(":")) {
                        map4.put(C15472.m36561(1, 0, strTrim), Integer.valueOf(i16));
                        enumC23915Arr2[i15] = null;
                        enumC23915Arr = enumC23915Arr2;
                    } else {
                        c4161 = c4161;
                        String str8 = " ";
                        arrayList3 = arrayList3;
                        int iIndexOf = strTrim.indexOf(" ");
                        String strSubstring = iIndexOf != -1 ? strTrim.substring(0, iIndexOf) : strTrim.trim();
                        EnumC23915 enumC23915M52676 = EnumC23915.m52676(strSubstring);
                        if (enumC23915M52676 == null) {
                            strSubstring.getClass();
                            enumC23915Arr = enumC23915Arr2;
                            switch (strSubstring) {
                                case ".pswitch_data":
                                    b = 0;
                                    break;
                                case ".sswitch_data":
                                    b = 1;
                                    break;
                                case ".catch":
                                    b = 2;
                                    break;
                                case ".array_data":
                                    b = 3;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            String str9 = strSubstring;
                            String str10 = ".end";
                            switch (b) {
                                case 0:
                                    String str11 = ".end";
                                    int i18 = i16;
                                    c3456 = c3456;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    map5 = map5;
                                    String strTrim2 = strArrSplit[i15 - 1].trim();
                                    int i19 = 1;
                                    int iIntValue = ((Integer) map5.get(strTrim2.substring(0, strTrim2.length() - 1))).intValue();
                                    C6486 c6486 = new C6486();
                                    while (true) {
                                        i15 += i19;
                                        String strTrim3 = strArrSplit[i15].trim();
                                        if (strTrim3.startsWith(str11)) {
                                            C6339 c6339 = new C6339(c6486.m17878(), c6486.m17882());
                                            iMo6715 = c6339.mo6715(i18) + i18;
                                            arrayList4.add(c6339);
                                        } else {
                                            String[] strArrSplit2 = strTrim3.split(":");
                                            String str12 = str11;
                                            if (strArrSplit2.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim3));
                                            }
                                            try {
                                                c6486.m17879(Integer.parseInt(strArrSplit2[0].trim()), ((Integer) map4.get(strArrSplit2[1].trim())).intValue() - iIntValue);
                                                i19 = 1;
                                                str11 = str12;
                                            } catch (Exception unused) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim3));
                                            }
                                        }
                                    }
                                    i9 = iMo6715;
                                    enumC23915 = enumC23915M52676;
                                    break;
                                case 1:
                                    String str13 = ".end";
                                    ArrayList arrayList5 = arrayList4;
                                    int i20 = i16;
                                    c3456 = c3456;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    int i21 = 1;
                                    String strTrim4 = strArrSplit[i15 - 1].trim();
                                    map5 = map5;
                                    int iIntValue2 = ((Integer) map5.get(strTrim4.substring(0, strTrim4.length() - 1))).intValue();
                                    C6486 c6487 = new C6486();
                                    while (true) {
                                        i15 += i21;
                                        String strTrim5 = strArrSplit[i15].trim();
                                        String str14 = str13;
                                        if (strTrim5.startsWith(str14)) {
                                            C14099 c14099 = new C14099(c6487.m17880(), c6487.m17882());
                                            arrayList4 = arrayList5;
                                            arrayList4.add(c14099);
                                            int i22 = i20;
                                            iMo6715 = c14099.mo6715(i22) + i22;
                                        } else {
                                            int i23 = i20;
                                            ArrayList arrayList6 = arrayList5;
                                            String[] strArrSplit3 = strTrim5.split(":");
                                            if (strArrSplit3.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim5));
                                            }
                                            try {
                                                c6487.m17879(Integer.parseInt(strArrSplit3[0].trim()), ((Integer) map4.get(strArrSplit3[1].trim())).intValue() - iIntValue2);
                                                i21 = 1;
                                                str13 = str14;
                                                arrayList5 = arrayList6;
                                                i20 = i23;
                                            } catch (Exception unused2) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim5));
                                            }
                                        }
                                    }
                                    i9 = iMo6715;
                                    enumC23915 = enumC23915M52676;
                                    break;
                                case 2:
                                    String str15 = " ";
                                    HashMap map6 = map4;
                                    ArrayList arrayList7 = arrayList4;
                                    C8603 c8603 = new C8603();
                                    strArr = strArrSplit;
                                    while (i15 < strArr.length) {
                                        String strTrim6 = strArr[i15].trim();
                                        if (strTrim6.startsWith(".catch")) {
                                            str6 = str15;
                                            String[] strArrSplit4 = strTrim6.split(str6);
                                            if (strArrSplit4.length < 2) {
                                                throw new IllegalArgumentException("no exception type : " + strArr[i15]);
                                            }
                                            String strTrim7 = strArrSplit4[1].trim();
                                            map2 = map6;
                                            int iIntValue3 = ((Integer) map2.get(strArr[i15 + 1].trim().split(":")[1].trim())).intValue();
                                            int iIntValue4 = ((Integer) map2.get(strArr[i15 + 2].trim().split(":")[1].trim())).intValue();
                                            i15 += 3;
                                            int iIntValue5 = ((Integer) map2.get(strArr[i15].trim().split(":")[1].trim())).intValue();
                                            if (strTrim7.equals(ProviderConfigurationPermission.ALL_STR)) {
                                                c8603.m22356(iIntValue3, iIntValue4, iIntValue5);
                                            } else {
                                                c8603.m22357(C22755.m50831(strTrim7, c3454), iIntValue3, iIntValue4, iIntValue5);
                                            }
                                        } else {
                                            map2 = map6;
                                            str6 = str15;
                                        }
                                        i15++;
                                        str15 = str6;
                                        map6 = map2;
                                    }
                                    c3455 = c3454;
                                    map = map6;
                                    c17069M22354 = c8603.m22354();
                                    arrayList4 = arrayList7;
                                    break;
                                case 3:
                                    String[] strArrSplit5 = strArrSplit[i15].trim().split(" ");
                                    if (strArrSplit5.length < 2) {
                                        throw new IllegalArgumentException("unknow element Width: " + strArrSplit[i15]);
                                    }
                                    int iM30869 = C12610.m30869(strArrSplit5[1]);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        i15++;
                                        String strTrim8 = strArrSplit[i15].trim();
                                        if (strTrim8.startsWith(str10)) {
                                            C14784 c14784 = new C14784(iM30869, byteArrayOutputStream.toByteArray());
                                            arrayList4.add(c14784);
                                            iMo6715 = c14784.mo6715(i16) + i16;
                                            c3456 = c3456;
                                            strArrSplit = strArrSplit;
                                            map4 = map4;
                                            map5 = map5;
                                        } else {
                                            String[] strArrSplit6 = strTrim8.split(str8);
                                            if (strArrSplit6.length != iM30869) {
                                                throw new IllegalArgumentException("encodeValues width:" + strArrSplit6.length + " does not match : " + iM30869);
                                            }
                                            int length2 = strArrSplit6.length;
                                            int i24 = 0;
                                            while (i24 < length2) {
                                                int i25 = length2;
                                                String strTrim9 = strArrSplit6[i24].trim();
                                                if (strTrim9 == null) {
                                                    throw new NumberFormatException("string is null");
                                                }
                                                if (strTrim9.length() == 0) {
                                                    throw new NumberFormatException("string is blank");
                                                }
                                                int i26 = i16;
                                                ArrayList arrayList8 = arrayList4;
                                                char[] charArray2 = strTrim9.toUpperCase().endsWith("T") ? strTrim9.substring(0, strTrim9.length() - 1).toCharArray() : strTrim9.toCharArray();
                                                String str16 = str10;
                                                if (charArray2[0] == '-') {
                                                    z2 = true;
                                                    i10 = 1;
                                                } else {
                                                    z2 = false;
                                                    i10 = 0;
                                                }
                                                HashMap map7 = map5;
                                                if (charArray2[i10] == '0') {
                                                    int i27 = i10 + 1;
                                                    if (i27 != charArray2.length) {
                                                        char c2 = charArray2[i27];
                                                        i11 = i27;
                                                        if (c2 == 'x' || c2 == 'X') {
                                                            i11 = i10 + 2;
                                                            b2 = 16;
                                                        } else if (Character.digit(c2, 8) >= 0) {
                                                            b2 = 8;
                                                        } else {
                                                            i10 = i11;
                                                            b2 = 10;
                                                            i11 = i10;
                                                        }
                                                        b3 = (byte) (127 / (b2 / 2));
                                                        b4 = 0;
                                                        str7 = str8;
                                                        map3 = map4;
                                                        i12 = i11;
                                                        while (true) {
                                                            strArr2 = strArrSplit;
                                                            if (i12 < charArray2.length) {
                                                                i13 = iM30869;
                                                                if (!z2) {
                                                                    b5 = b4;
                                                                } else {
                                                                    b5 = b4;
                                                                }
                                                            }
                                                            iDigit2 = Character.digit(charArray2[i12], (int) b2);
                                                            if (iDigit2 >= 0) {
                                                                throw new NumberFormatException("The string contains invalid an digit - '" + charArray2[i12] + "'");
                                                            }
                                                            i14 = iM30869;
                                                            b6 = (byte) (b4 * b2);
                                                            if (b4 <= b3) {
                                                                throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                            }
                                                            if (b6 >= 0) {
                                                            }
                                                            b4 = (byte) (b6 + iDigit2);
                                                            i12++;
                                                            iM30869 = i14;
                                                            strArrSplit = strArr2;
                                                        }
                                                    } else {
                                                        b5 = 0;
                                                        i13 = iM30869;
                                                        str7 = str8;
                                                        strArr2 = strArrSplit;
                                                        map3 = map4;
                                                    }
                                                } else {
                                                    b2 = 10;
                                                    i11 = i10;
                                                    b3 = (byte) (127 / (b2 / 2));
                                                    b4 = 0;
                                                    str7 = str8;
                                                    map3 = map4;
                                                    i12 = i11;
                                                    while (true) {
                                                        strArr2 = strArrSplit;
                                                        if (i12 < charArray2.length) {
                                                            i13 = iM30869;
                                                            if (!z2 && b4 != -128) {
                                                                if (b4 < 0) {
                                                                    throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                                }
                                                                b5 = (byte) (b4 * (-1));
                                                            }
                                                            b5 = b4;
                                                        }
                                                        iDigit2 = Character.digit(charArray2[i12], (int) b2);
                                                        if (iDigit2 >= 0) {
                                                            throw new NumberFormatException("The string contains invalid an digit - '" + charArray2[i12] + "'");
                                                        }
                                                        i14 = iM30869;
                                                        b6 = (byte) (b4 * b2);
                                                        if (b4 <= b3) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        if (b6 >= 0 && b6 >= (-iDigit2)) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        b4 = (byte) (b6 + iDigit2);
                                                        i12++;
                                                        iM30869 = i14;
                                                        strArrSplit = strArr2;
                                                    }
                                                }
                                                byteArrayOutputStream.write(b5);
                                                i24++;
                                                iM30869 = i13;
                                                length2 = i25;
                                                i16 = i26;
                                                arrayList4 = arrayList8;
                                                str10 = str16;
                                                map5 = map7;
                                                map4 = map3;
                                                str8 = str7;
                                                strArrSplit = strArr2;
                                                break;
                                            }
                                            i15 = i15;
                                            c3456 = c3454;
                                        }
                                    }
                                    i9 = iMo6715;
                                    enumC23915 = enumC23915M52676;
                                    break;
                                    break;
                                default:
                                    throw new IllegalArgumentException("unknow opcodeName: ".concat(str9));
                            }
                        } else {
                            enumC23915Arr = enumC23915Arr2;
                            int i28 = i16;
                            c3456 = c3456;
                            strArrSplit = strArrSplit;
                            map4 = map4;
                            map5 = map5;
                            int i29 = C13344.f39920[enumC23915M52676.ordinal()];
                            if (i29 == 1 || i29 == 2) {
                                String[] strArrSplit7 = strTrim.split(":");
                                if (strArrSplit7.length != 2) {
                                    throw new IllegalArgumentException(" opcode offset error: ".concat(strTrim));
                                }
                                map5.put(strArrSplit7[1].trim(), Integer.valueOf(i28));
                            }
                            enumC23915 = enumC23915M52676;
                            i9 = (enumC23915.f77587.f77714 / 2) + i28;
                        }
                        enumC23915Arr[i15] = enumC23915;
                    }
                    i15++;
                    c12639 = this;
                    strArrSplit = strArrSplit;
                    map5 = map5;
                    map4 = map4;
                    c3456 = c3456;
                    length = i17;
                    enumC23915Arr2 = enumC23915Arr;
                    arrayList3 = arrayList3;
                    i16 = i9;
                    c4161 = c4161;
                }
                i9 = i16;
                i15++;
                c12639 = this;
                strArrSplit = strArrSplit;
                map5 = map5;
                map4 = map4;
                c3456 = c3456;
                length = i17;
                enumC23915Arr2 = enumC23915Arr;
                arrayList3 = arrayList3;
                i16 = i9;
                c4161 = c4161;
            } else {
                c3455 = c3456;
                c4161 = c4161;
                strArr = strArrSplit;
                enumC23915Arr = enumC23915Arr2;
                arrayList3 = arrayList3;
                map = map4;
                c17069M22354 = null;
            }
        }
        int i30 = 0;
        int i31 = 0;
        for (int length3 = strArr.length; i31 < length3; length3 = length3) {
            this.f38081 = i31;
            String strTrim10 = strArr[i31].trim();
            EnumC23915 enumC23916 = enumC23915Arr[i31];
            if (enumC23916 != null) {
                int i32 = C13344.f39919[enumC23916.f77587.ordinal()];
                Pattern pattern = f38075;
                switch (i32) {
                    case 1:
                        strArr = strArr;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C21136(enumC23916, (byte) m30900(i3, strTrim10, map)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 2:
                        strArr = strArr;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C1379(enumC23916, (short) (m30900(i3, strTrim10, map) & 65535)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 3:
                        strArr = strArr;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C13373(enumC23916, (short) m30904(strTrim10), (short) (m30900(i3, strTrim10, map) & 65535)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 4:
                        strArr = strArr;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        Matcher matcher = pattern.matcher(strTrim10);
                        matcher.find();
                        byte b7 = (byte) Integer.parseInt(matcher.group().substring(1));
                        matcher.find();
                        arrayList.add(new C16922(enumC23916, b7, (byte) Integer.parseInt(matcher.group().substring(1)), (short) (m30900(i3, strTrim10, map) & 65535)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 5:
                        strArr = strArr;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C21157(enumC23916, m30900(i3, strTrim10, map)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 6:
                        strArr = strArr;
                        int i33 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        i3 = i33;
                        arrayList.add(new C19040(enumC23916, (short) m30904(strTrim10), m30900(i3, strTrim10, map)));
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 7:
                    case 8:
                    case 26:
                    default:
                        strArr = strArr;
                        c17069M22354 = c17069M22354;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 9:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C9141(enumC23916));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 10:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C19019(enumC23916, (short) m30904(strTrim10)));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 11:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C2791(enumC23916, (byte) m30904(strTrim10), (byte) m30901(strTrim10)));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 12:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        Matcher matcher2 = pattern.matcher(strTrim10);
                        matcher2.find();
                        byte b8 = (byte) Integer.parseInt(matcher2.group().substring(1));
                        matcher2.find();
                        arrayList.add(new C0673(enumC23916, b8, (byte) Integer.parseInt(matcher2.group().substring(1))));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 13:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        c3455 = c3455;
                        str3 = str2;
                        arrayList = arrayList3;
                        short sM30904 = (short) m30904(strTrim10);
                        int i34 = C13344.f39921[enumC23916.f77584.ordinal()];
                        if (i34 == 1) {
                            try {
                                abstractC5116M30906 = m30906(strTrim10, c3455);
                            } catch (Exception unused3) {
                                throw new Exception(C20094.m46315("FieldIdItem error: ", strTrim10));
                            }
                        } else if (i34 == 3) {
                            try {
                                abstractC5116M30906 = m30907(strTrim10, c3455);
                            } catch (Exception unused4) {
                                throw new Exception(C20094.m46315("TypeIdItem error: ", strTrim10));
                            }
                        } else if (i34 != 4) {
                            abstractC5116M30906 = null;
                        } else {
                            try {
                                abstractC5116M30906 = C11467.m28270(C4303.m12897(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c3455);
                            } catch (Exception unused5) {
                                throw new Exception(C20094.m46315("String error: ", strTrim10));
                            }
                        }
                        arrayList.add(new C15489(enumC23916, sM30904, abstractC5116M30906));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 14:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c17069M22354 = c17069M22354;
                        arrayList4 = arrayList4;
                        str3 = str2;
                        arrayList = arrayList3;
                        c3455 = c3454;
                        arrayList.add(new C9162(enumC23916, (short) m30904(strTrim10), C11467.m28270(C4303.m12897(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c3455)));
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 15:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C22546(enumC23916, (short) m30904(strTrim10), (short) (m30901(strTrim10) & 65535)));
                        c3455 = c3454;
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 16:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C4907(enumC23916, (short) m30904(strTrim10), (short) (m30901(strTrim10) & 65535)));
                        c3455 = c3454;
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 17:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C2812(enumC23916, (byte) m30904(strTrim10), m30901(strTrim10)));
                        c3455 = c3454;
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 18:
                        ArrayList arrayList9 = arrayList3;
                        short sM30905 = (short) m30904(strTrim10);
                        Matcher matcher3 = f38076.matcher(strTrim10);
                        if (!matcher3.find()) {
                            throw new Exception(C20094.m46315("long exception: ", strTrim10));
                        }
                        String strTrim11 = matcher3.group().trim();
                        if (strTrim11 == null) {
                            throw new NumberFormatException(str2);
                        }
                        if (strTrim11.length() == 0) {
                            throw new NumberFormatException("string is blank");
                        }
                        if (strTrim11.toUpperCase().endsWith("L")) {
                            c = 0;
                            charArray = strTrim11.substring(0, strTrim11.length() - 1).toCharArray();
                        } else {
                            c = 0;
                            charArray = strTrim11.toCharArray();
                        }
                        if (charArray[c] == '-') {
                            i5 = 1;
                            z = true;
                        } else {
                            i5 = 0;
                            z = false;
                        }
                        long j5 = 0;
                        if (charArray[i5] != '0') {
                            i6 = 10;
                            i7 = i5;
                            j = C13132.FOREVER_NS / ((long) (i6 / 2));
                            i8 = i7;
                            j2 = 0;
                            while (true) {
                                i31 = i31;
                                if (i8 < charArray.length) {
                                    iDigit = Character.digit(charArray[i8], i6);
                                    if (iDigit >= 0) {
                                        throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i8] + "'");
                                    }
                                    str5 = str2;
                                    j4 = ((long) i6) * j2;
                                    if (j2 <= j) {
                                        throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                    }
                                    if (j4 < 0 && j4 >= (-iDigit)) {
                                        throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                    }
                                    j2 = j4 + ((long) iDigit);
                                    i8++;
                                    i31 = i31;
                                    str2 = str5;
                                    i6 = i6;
                                    i30 = i30;
                                    arrayList9 = arrayList9;
                                } else {
                                    arrayList2 = arrayList9;
                                    i4 = i30;
                                    str4 = str2;
                                    if (z || j2 == Long.MIN_VALUE) {
                                        j3 = j2;
                                    } else {
                                        if (j2 < 0) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        j5 = j2 * (-1);
                                    }
                                }
                            }
                            C10573 c10573 = new C10573(enumC23916, sM30905, j3);
                            arrayList = arrayList2;
                            arrayList.add(c10573);
                            str3 = str4;
                            c3455 = c3454;
                            i3 = i4;
                            i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        } else {
                            int i35 = i5 + 1;
                            if (i35 != charArray.length) {
                                char c3 = charArray[i35];
                                i7 = i35;
                                if (c3 == 'x' || c3 == 'X') {
                                    i7 = i5 + 2;
                                    i6 = 16;
                                } else if (Character.digit(c3, 8) >= 0) {
                                    i6 = 8;
                                } else {
                                    i5 = i7;
                                    i6 = 10;
                                    i7 = i5;
                                }
                                j = C13132.FOREVER_NS / ((long) (i6 / 2));
                                i8 = i7;
                                j2 = 0;
                                while (true) {
                                    i31 = i31;
                                    if (i8 < charArray.length) {
                                        iDigit = Character.digit(charArray[i8], i6);
                                        if (iDigit >= 0) {
                                            throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i8] + "'");
                                        }
                                        str5 = str2;
                                        j4 = ((long) i6) * j2;
                                        if (j2 <= j) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        if (j4 < 0) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        j2 = j4 + ((long) iDigit);
                                        i8++;
                                        i31 = i31;
                                        str2 = str5;
                                        i6 = i6;
                                        i30 = i30;
                                        arrayList9 = arrayList9;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i4 = i30;
                                        str4 = str2;
                                        if (z) {
                                        }
                                        j3 = j2;
                                    }
                                }
                                C10573 c10574 = new C10573(enumC23916, sM30905, j3);
                                arrayList = arrayList2;
                                arrayList.add(c10574);
                                str3 = str4;
                                c3455 = c3454;
                                i3 = i4;
                                i2 = (enumC23916.f77587.f77714 / 2) + i3;
                            } else {
                                arrayList2 = arrayList9;
                                i4 = i30;
                                i31 = i31;
                                str4 = str2;
                            }
                        }
                        j3 = j5;
                        C10573 c10575 = new C10573(enumC23916, sM30905, j3);
                        arrayList = arrayList2;
                        arrayList.add(c10575);
                        str3 = str4;
                        c3455 = c3454;
                        i3 = i4;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                        break;
                    case 19:
                        arrayList = arrayList3;
                        Matcher matcher4 = pattern.matcher(strTrim10);
                        matcher4.find();
                        short s = (short) (Integer.parseInt(matcher4.group().substring(1)) & 65535);
                        matcher4.find();
                        arrayList.add(new C17628(enumC23916, s, Integer.parseInt(matcher4.group().substring(1)) & 65535));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 20:
                        arrayList = arrayList3;
                        Matcher matcher5 = pattern.matcher(strTrim10);
                        matcher5.find();
                        short s2 = (short) Integer.parseInt(matcher5.group().substring(1));
                        matcher5.find();
                        arrayList.add(new C10552(enumC23916, s2, (short) Integer.parseInt(matcher5.group().substring(1)), (byte) (m30901(strTrim10) & 255)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 21:
                        arrayList = arrayList3;
                        Matcher matcher6 = pattern.matcher(strTrim10);
                        matcher6.find();
                        byte b9 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        matcher6.find();
                        byte b10 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        int i36 = C13344.f39921[enumC23916.f77584.ordinal()];
                        arrayList.add(new C11963(enumC23916, b9, b10, i36 != 1 ? i36 != 3 ? null : m30907(strTrim10, c3455) : m30906(strTrim10, c3455)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 22:
                        arrayList = arrayList3;
                        Matcher matcher7 = pattern.matcher(strTrim10);
                        matcher7.find();
                        byte b11 = (byte) Integer.parseInt(matcher7.group().substring(1));
                        matcher7.find();
                        arrayList.add(new C2106(enumC23916, b11, (byte) Integer.parseInt(matcher7.group().substring(1)), (short) (m30901(strTrim10) & 65535)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 23:
                        arrayList = arrayList3;
                        Matcher matcher8 = pattern.matcher(strTrim10);
                        matcher8.find();
                        short s3 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        short s4 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        arrayList.add(new C23978(enumC23916, s3, s4, (short) Integer.parseInt(matcher8.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 24:
                        arrayList = arrayList3;
                        Matcher matcher9 = pattern.matcher(strTrim10);
                        matcher9.find();
                        int i37 = Integer.parseInt(matcher9.group().substring(1));
                        matcher9.find();
                        arrayList.add(new C0694(enumC23916, i37, Integer.parseInt(matcher9.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                    case 25:
                        arrayList = arrayList3;
                        byte[] bArr = new byte[5];
                        Arrays.fill(bArr, (byte) 0);
                        int i38 = 0;
                        for (Matcher matcher10 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(q.h))); matcher10.find() && i38 < 5; matcher10 = matcher10) {
                            bArr[i38] = (byte) Integer.parseInt(matcher10.group().substring(1));
                            i38++;
                        }
                        int[] iArr = {i38};
                        f38077 = Math.max(f38077, i38);
                        int i39 = C13344.f39921[enumC23916.f77584.ordinal()];
                        AbstractC5116 abstractC5116M30907 = i39 != 2 ? i39 != 3 ? null : m30907(strTrim10, c3455) : m30908(strTrim10, c3455);
                        try {
                            arrayList.add(new C1400(enumC23916, iArr[0], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], abstractC5116M30907));
                            i3 = i30;
                            str3 = str2;
                            i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        } catch (Exception unused6) {
                            throw new RuntimeException(strTrim10 + EnumC0121.f1143 + abstractC5116M30907 + EnumC0121.f1143 + iArr[0]);
                        }
                        break;
                    case 27:
                        int[] iArr2 = new int[2];
                        Matcher matcher11 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(q.h)));
                        matcher11.find();
                        iArr2[1] = Integer.parseInt(matcher11.group().substring(1));
                        int i40 = 0;
                        while (matcher11.find()) {
                            i40 = Integer.parseInt(matcher11.group().substring(1));
                        }
                        int i41 = (i40 - iArr2[1]) + 1;
                        iArr2[0] = i41;
                        f38077 = Math.max(f38077, i41);
                        int i42 = C13344.f39921[enumC23916.f77584.ordinal()];
                        arrayList = arrayList3;
                        arrayList.add(new C4928(enumC23916, (short) iArr2[0], iArr2[1], i42 != 2 ? i42 != 3 ? null : m30907(strTrim10, c3455) : m30908(strTrim10, c3455)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC23916.f77587.f77714 / 2) + i3;
                        break;
                }
            } else {
                strArr = strArr;
                i31 = i31;
                c17069M22354 = c17069M22354;
                arrayList4 = arrayList4;
                c3455 = c3455;
                arrayList = arrayList3;
                int i43 = i30;
                str3 = str2;
                i2 = i43;
            }
            i31++;
            arrayList3 = arrayList;
            str2 = str3;
            c3455 = c3455;
            arrayList4 = arrayList4;
            strArr = strArr;
            c17069M22354 = c17069M22354;
            i30 = i2;
        }
        C17069 c17069 = c17069M22354;
        ArrayList arrayList10 = arrayList3;
        this.f38081 = -1;
        arrayList10.addAll(arrayList4);
        AbstractC2043[] abstractC2043Arr = new AbstractC2043[arrayList10.size()];
        arrayList10.toArray(abstractC2043Arr);
        if (c17069 != null) {
            List list = (List) c17069.f52322;
            List list2 = (List) c17069.f52323;
            if (list.size() > 0) {
                C2749[] c2749Arr = new C2749[list.size()];
                C9099[] c9099Arr = new C9099[list2.size()];
                list.toArray(c2749Arr);
                list2.toArray(c9099Arr);
                c4160 = c4161;
                c4160.f13575 = c2749Arr;
                c4160.f13568 = c9099Arr;
            } else {
                c4160 = c4161;
            }
        } else {
            c4160 = c4161;
            c4160.f13575 = null;
            c4160.f13568 = null;
        }
        C13889 parent = c4160.getParent();
        C13582 c13582 = parent.f41402.f70680.f38655;
        if (c13582 == null) {
            i = 0;
        } else {
            int iM50836 = 0;
            for (C22755 c22755 : c13582.f40520) {
                iM50836 += c22755.m50836();
            }
            i = iM50836;
        }
        if ((parent.f41403 & EnumC7233.STATIC.getValue()) == 0) {
            i++;
        }
        c4160.f13574 = i;
        c4160.f13571 = f38077;
        c4160.f13573 = abstractC2043Arr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18522 m30906(String str, C3454 c3454) {
        String[] strArrSplit = f38079.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 2) {
            throw new RuntimeException(C20094.m46315("FieldIdItem error: ", str));
        }
        return C18522.m43041(c3454, C22755.m50831(strArrSplit[length - 3], c3454), C22755.m50831(strArrSplit[i], c3454), C11467.m28270(strArrSplit[length - 2], c3454));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C22050 m30908(String str, C3454 c3454) {
        String[] strArrSplit = f38080.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 3) {
            throw new RuntimeException("MethodIdItem error: ".concat(str));
        }
        return C22050.m49611(c3454, C22755.m50831(strArrSplit[length - 4], c3454), C12877.m31309(c3454, C22755.m50831(strArrSplit[i], c3454), m30905(strArrSplit[length - 2], c3454)), C11467.m28270(strArrSplit[length - 3], c3454));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C22755 m30907(String str, C3454 c3454) {
        String strTrim = str.trim();
        return C22755.m50831(strTrim.substring(strTrim.lastIndexOf(" ") + 1), c3454);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30901(String str) throws Exception {
        Matcher matcher = f38078.matcher(str);
        if (matcher.find()) {
            return C12610.m30869(matcher.group().trim());
        }
        throw new Exception(C20094.m46315("int exception: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30900(int i, String str, HashMap map) {
        try {
            return ((Integer) map.get(str.split(":")[1].trim())).intValue() - i;
        } catch (Exception unused) {
            throw new IllegalArgumentException(C20094.m46315("unfound label offset: ", str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30904(String str) throws Exception {
        Matcher matcher = f38075.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group().substring(1));
        }
        throw new Exception(C20094.m46315("register exception: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13582 m30905(String str, C3454 c3454) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 'F') {
                i = i2 + 1;
                arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
            } else if (cCharAt == 'L') {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    if (str.charAt(i4) != ';') {
                        i3 = i4;
                    } else {
                        i = i3 + 2;
                        arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
                    }
                }
            } else if (cCharAt == 'S' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z') {
                i = i2 + 1;
                arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
            } else if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                    case 'D':
                        i = i2 + 1;
                        arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
                        break;
                    default:
                        throw new RuntimeException(C20087.m46305(i2, str, new StringBuilder("Invalid type ")));
                }
            } else {
                int i5 = i2;
                while (true) {
                    int i6 = i5 + 1;
                    if (str.charAt(i6) == '[') {
                        i5 = i6;
                    } else {
                        i = i5 + 2;
                        if (str.charAt(i6) == 'L') {
                            while (true) {
                                int i7 = i + 1;
                                if (str.charAt(i) != ';') {
                                    i = i7;
                                } else {
                                    i = i7;
                                }
                            }
                        }
                        arrayList.add(C22755.m50831(str.substring(i2, i), c3454));
                    }
                }
            }
            i2 = i;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return C13582.m32663(c3454, arrayList);
    }
}
