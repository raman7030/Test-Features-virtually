package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0655am;
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
public final class C14381 {

    /* JADX INFO: renamed from: ܽ */
    public static int f41103;

    /* JADX INFO: renamed from: ֫ */
    public int f41107;

    /* JADX INFO: renamed from: ۧ */
    public final C6322 f41108;

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f41101 = Pattern.compile("v\\d+");

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f41104 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+|\\s([+,-])?\\d+");

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f41102 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+([l,L])?|\\s([+,-])?\\d+([l,L])?");

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f41105 = Pattern.compile("\\s|:|->");

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f41106 = Pattern.compile("\\s|\\(|\\)|->");

    public C14381(C6322 c6322) {
        this.f41108 = c6322;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m32988(C6977 c6977) {
        int[] iArrM19828;
        int i;
        Object[] objArr;
        Object[] objArr2;
        C6322 c6322 = this.f41108;
        if (c6322 == null) {
            return;
        }
        AbstractC4310[] abstractC4310Arr = c6322.f16386;
        int[] iArr = new int[abstractC4310Arr.length];
        Arrays.fill(iArr, -1);
        C8532 c8532 = new C8532(1);
        HashMap map = new HashMap();
        int length = abstractC4310Arr.length;
        int iMo8841 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C8393 c8393 = abstractC4310Arr[i2];
            switch (C15051.f42985[c8393.mo5081().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iArr[i2] = ((InterfaceC16379) c8393).mo7098() + iMo8841;
                    int i3 = C15051.f42986[c8393.f9623.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        map.put(Integer.valueOf(iArr[i2]), Integer.valueOf(iMo8841));
                    }
                    break;
                case 7:
                case 8:
                    int iIntValue = ((Integer) map.get(Integer.valueOf(iMo8841))).intValue();
                    for (int i4 : c8393.mo19557()) {
                        c8532.m19827(iIntValue + i4, 0);
                    }
                    break;
            }
            iMo8841 += c8393.mo8841(iMo8841);
        }
        Arrays.sort(iArr);
        int[] iArrM19829 = {-1};
        if (c8532.m19829() > 0) {
            iArrM19829 = c8532.m19828();
        }
        Arrays.sort(iArrM19829);
        C4981[] c4981Arr = c6322.f16388;
        if (c4981Arr != null && c4981Arr.length > 0) {
            C8532 c8533 = new C8532(3);
            for (C4981 c4981 : c4981Arr) {
                int iM10547 = c4981.m10547();
                int iM10548 = c4981.m10548() + iM10547;
                c8533.m19827(iM10547, 0);
                c8533.m19827(iM10548, 0);
                C11016 c11016 = c4981.f11347;
                int iM25420 = c11016.m25420();
                if (iM25420 != -1) {
                    c8533.m19827(iM25420, 0);
                } else {
                    for (C17720 c17720 : c11016.f30512) {
                        c8533.m19827(c17720.m40272(), 0);
                    }
                }
            }
            iArrM19828 = c8533.m19828();
        } else {
            iArrM19828 = new int[]{-1};
        }
        Arrays.sort(iArrM19828);
        int length2 = abstractC4310Arr.length;
        int i5 = 0;
        int iMo8842 = 0;
        Object[] objArr3 = abstractC4310Arr;
        while (i5 < length2) {
            C8393 c8394 = objArr3[i5];
            if (Arrays.binarySearch(iArr, iMo8842) >= 0 || Arrays.binarySearch(iArrM19828, iMo8842) >= 0) {
                c6977.write("label_");
                c6977.write(String.valueOf(iMo8842));
                c6977.write(58);
                c6977.write(10);
            }
            if (Arrays.binarySearch(iArrM19829, iMo8842) >= 0) {
                c6977.write("switch_");
                c6977.m15995(iMo8842);
                c6977.write(58);
                c6977.write(10);
            }
            int[] iArr2 = C15051.f42985;
            EnumC25137 enumC25137Mo5081 = c8394.mo5081();
            EnumC25097 enumC25097 = c8394.f9623;
            switch (iArr2[enumC25137Mo5081.ordinal()]) {
                case 1:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    m32980(c6977, ((C22456) c8394).mo7098() + iMo8842);
                    c6977.write(10);
                    break;
                case 2:
                case 5:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    m32980(c6977, ((InterfaceC16379) c8394).mo7098() + iMo8842);
                    c6977.write(10);
                    break;
                case 3:
                    objArr = objArr3;
                    C15078 c15078 = (C15078) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c15078.mo5079());
                    c6977.write(32);
                    m32980(c6977, c15078.mo7098() + iMo8842);
                    c6977.write(10);
                    break;
                case 4:
                    objArr = objArr3;
                    C18451 c18451 = (C18451) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c18451.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c18451.m42010());
                    c6977.write(32);
                    m32980(c6977, c18451.mo7098() + iMo8842);
                    c6977.write(10);
                    break;
                case 6:
                    objArr = objArr3;
                    C20464 c20464 = (C20464) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c20464.mo5079());
                    c6977.write(32);
                    m32980(c6977, c20464.mo7098() + iMo8842);
                    c6977.write(10);
                    break;
                case 7:
                    objArr = objArr3;
                    C8393 c8395 = c8394;
                    c6977.write(".pswitch_data ");
                    int iM19556 = c8395.m19556();
                    c6977.m15995(iM19556);
                    c6977.write(10);
                    c6977.m15997();
                    int iIntValue2 = ((Integer) map.get(Integer.valueOf(iMo8842))).intValue();
                    int[] iArrMo19557 = c8395.mo19557();
                    int length3 = iArrMo19557.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = iArrMo19557[i6] + iIntValue2;
                        c6977.write(String.valueOf(iM19556));
                        c6977.write(" : switch_");
                        c6977.write(String.valueOf(i7));
                        c6977.write(10);
                        i6++;
                        iM19556++;
                    }
                    c6977.m15994();
                    c6977.write(".end pswitch_data");
                    c6977.write(10);
                    break;
                case 8:
                    objArr = objArr3;
                    c6977.write(".sswitch_data");
                    c6977.write(10);
                    int iIntValue3 = ((Integer) map.get(Integer.valueOf(iMo8842))).intValue();
                    Iterator itM35838 = ((C15768) c8394).m35838();
                    c6977.m15997();
                    while (itM35838.hasNext()) {
                        C24486 c24486 = (C24486) itM35838.next();
                        int i8 = c24486.f77492;
                        int i9 = c24486.f77493 + iIntValue3;
                        c6977.write(String.valueOf(i8));
                        c6977.write(" : switch_");
                        c6977.write(String.valueOf(i9));
                        c6977.write(10);
                    }
                    c6977.m15994();
                    c6977.write(".end sswitch_data");
                    c6977.write(10);
                    break;
                case 9:
                    objArr = objArr3;
                    if (enumC25097 != EnumC25097.f80112) {
                        c6977.write(enumC25097.f80336);
                        c6977.write(10);
                    }
                    break;
                case 10:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(((C20444) c8394).mo5079());
                    c6977.write(10);
                    break;
                case 11:
                    objArr = objArr3;
                    C5021 c5021 = (C5021) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c5021.mo5079());
                    c6977.write(32);
                    c6977.write(String.valueOf(c5021.mo9101()));
                    c6977.write(32);
                    c6977.write(10);
                    break;
                case 12:
                    objArr = objArr3;
                    C3008 c3008 = (C3008) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c3008.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c3008.m5080());
                    c6977.write(10);
                    break;
                case 13:
                case 14:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(((InterfaceC22416) c8394).mo5079());
                    c6977.write(32);
                    m32981(c6977, c8394);
                    c6977.write(10);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(((InterfaceC22416) c8394).mo5079());
                    c6977.write(32);
                    long jMo9101 = ((InterfaceC19733) c8394).mo9101();
                    if (jMo9101 < 0) {
                        c6977.write("-0x");
                        c6977.m15996(-jMo9101);
                        if (jMo9101 < -2147483648L) {
                            c6977.write(76);
                        }
                    } else {
                        c6977.write("0x");
                        c6977.m15996(jMo9101);
                        if (jMo9101 > 2147483647L) {
                            c6977.write(76);
                        }
                    }
                    c6977.write(10);
                    break;
                case 19:
                    objArr = objArr3;
                    C19122 c19122 = (C19122) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c19122.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c19122.m43464());
                    c6977.write(10);
                    break;
                case 20:
                    objArr = objArr3;
                    C12397 c12397 = (C12397) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c12397.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c12397.m28566());
                    c6977.write(32);
                    c6977.write(String.valueOf(c12397.mo9101()));
                    c6977.write(10);
                    break;
                case 21:
                    objArr = objArr3;
                    C13738 c13738 = (C13738) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c13738.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c13738.m31295());
                    c6977.write(32);
                    m32981(c6977, c13738);
                    c6977.write(10);
                    break;
                case 22:
                    objArr = objArr3;
                    C4370 c4370 = (C4370) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c4370.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c4370.m9102());
                    c6977.write(32);
                    c6977.write(String.valueOf(c4370.mo9101()));
                    c6977.write(10);
                    break;
                case 23:
                    objArr = objArr3;
                    C25157 c25157 = (C25157) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c25157.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c25157.m55203());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c25157.m55204());
                    c6977.write(10);
                    break;
                case 24:
                    objArr = objArr3;
                    C3028 c3028 = (C3028) c8394;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c3028.mo5079());
                    c6977.write(32);
                    c6977.write(118);
                    c6977.m15995(c3028.m5128());
                    c6977.write(10);
                    break;
                case 25:
                case 26:
                    objArr = objArr3;
                    c6977.write(enumC25097.f80336);
                    c6977.write(32);
                    InterfaceC18431 interfaceC18431 = (InterfaceC18431) c8394;
                    byte bMo7133 = interfaceC18431.mo7133();
                    c6977.write(123);
                    if (bMo7133 == 1) {
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7131());
                    } else if (bMo7133 == 2) {
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7131());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7130());
                    } else if (bMo7133 == 3) {
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7131());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7130());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7132());
                    } else if (bMo7133 == 4) {
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7131());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7130());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7132());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7129());
                    } else if (bMo7133 == 5) {
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7131());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7130());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7132());
                        c6977.write(",");
                        c6977.write(118);
                        c6977.m15995((int) interfaceC18431.mo7129());
                        c6977.write(",");
                        c6977.write(C0655am.f2277aE);
                        c6977.m15995((int) interfaceC18431.mo7128());
                    }
                    c6977.write(C0254q.f1218h);
                    c6977.write(32);
                    m32981(c6977, c8394);
                    c6977.write(10);
                    break;
                case 27:
                    objArr = objArr3;
                    C7052 c7052 = (C7052) c8394;
                    c6977.write(enumC25097.f80336);
                    short sM16246 = c7052.m16246();
                    int iM16245 = c7052.m16245();
                    c6977.write(32);
                    c6977.write(123);
                    c6977.write(118);
                    c6977.m15995(iM16245);
                    c6977.write("..");
                    c6977.write(118);
                    c6977.m15995((c7052.m16245() + sM16246) - 1);
                    c6977.write(C0254q.f1218h);
                    c6977.write(32);
                    m32981(c6977, c7052);
                    c6977.write(10);
                    break;
                case 28:
                    C16419 c16419 = (C16419) c8394;
                    c6977.write(".array_data");
                    c6977.write(32);
                    c6977.m15995(c16419.m37318());
                    c6977.write(10);
                    c6977.m15997();
                    Iterator itM37316 = c16419.m37316();
                    Object[] objArr4 = objArr3;
                    while (itM37316.hasNext()) {
                        C19102 c19102 = (C19102) itM37316.next();
                        int i10 = c19102.f56990;
                        Object[] objArr5 = objArr4;
                        while (true) {
                            objArr2 = objArr5;
                            if (i10 < c19102.f56991 + c19102.f56990) {
                                byte b = c19102.f56989[i10];
                                c6977.write("0x");
                                c6977.m15996(b & 255);
                                c6977.write(116);
                                c6977.write(32);
                                i10++;
                                itM37316 = itM37316;
                                objArr5 = objArr2;
                                c19102 = c19102;
                            }
                        }
                        c6977.write(10);
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    c6977.m15994();
                    c6977.write(".end array_data");
                    c6977.write(10);
                    break;
                default:
                    objArr = objArr3;
                    break;
            }
            iMo8842 += c8394.mo8841(iMo8842);
            i5++;
            objArr3 = objArr;
        }
        if (Arrays.binarySearch(iArr, iMo8842) >= 0) {
            c6977.write("label_");
            c6977.write(String.valueOf(iMo8842));
            c6977.write(58);
            i = 10;
            c6977.write(10);
        } else {
            if (Arrays.binarySearch(iArrM19828, iMo8842) >= 0) {
                c6977.write(10);
                c6977.write("label_");
                c6977.write(String.valueOf(iMo8842));
                c6977.write(58);
                c6977.write(10);
            }
            i = 10;
        }
        if (Arrays.binarySearch(iArrM19829, iMo8842) >= 0) {
            c6977.write("switch_");
            c6977.write(String.valueOf(iMo8842));
            c6977.write(58);
            c6977.write(i);
        }
        C4981[] c4981Arr2 = c6322.f16388;
        if (c4981Arr2 == null || c4981Arr2.length <= 0) {
            return;
        }
        c6977.write(i);
        c6977.write(i);
        c6977.write("#Handler Exceptions");
        c6977.write(i);
        c6977.write(i);
        int length4 = c4981Arr2.length;
        int i11 = 0;
        while (i11 < length4) {
            C4981 c4982 = c4981Arr2[i11];
            int iM10549 = c4982.m10547();
            int iM105410 = c4982.m10548() + iM10549;
            C11016 c11017 = c4982.f11347;
            int iM25421 = c11017.m25420();
            if (iM25421 != -1) {
                c6977.write(".catch ");
                c6977.write(ProviderConfigurationPermission.ALL_STR);
                c6977.write(10);
                c6977.m15997();
                c6977.write("start : ");
                c6977.write("label_");
                c6977.m15995(iM10549);
                c6977.write(10);
                c6977.write("end : ");
                c6977.write("label_");
                c6977.m15995(iM105410);
                c6977.write(10);
                c6977.write("handler : ");
                c6977.write("label_");
                c6977.m15995(iM25421);
                c6977.write(10);
                c6977.m15994();
                c6977.write(".end catch");
                c6977.write(10);
                c6977.write(10);
            } else {
                C17720[] c17720Arr = c11017.f30512;
                int length5 = c17720Arr.length;
                int i12 = 0;
                while (i12 < length5) {
                    C17720 c17721 = c17720Arr[i12];
                    c6977.write(".catch ");
                    c6977.write(c17721.f52919.m53168());
                    c6977.write(10);
                    c6977.m15997();
                    c6977.write("start : ");
                    c6977.write("label_");
                    c6977.m15995(iM10549);
                    c6977.write(10);
                    c6977.write("end : ");
                    c6977.write("label_");
                    c6977.m15995(iM105410);
                    c6977.write(10);
                    c6977.write("handler : ");
                    c6977.write("label_");
                    c6977.m15995(c17721.m40272());
                    c6977.write(10);
                    c6977.m15994();
                    c6977.write(".end catch");
                    c6977.write(10);
                    c6977.write(10);
                    i12++;
                    length4 = length4;
                }
            }
            i11++;
            length4 = length4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32980(C6977 c6977, int i) {
        c6977.write(58);
        c6977.write("label_");
        c6977.write(String.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX INFO: renamed from: ֫ */
    public static void m32981(C6977 c6977, AbstractC4310 abstractC4310) {
        AbstractC18391 abstractC18391 = (AbstractC18391) abstractC4310;
        int i = C15051.f42987[abstractC4310.f9623.f80335.ordinal()];
        if (i == 1) {
            c6977.write(((C19971) abstractC18391.m41867()).m45321());
            return;
        }
        if (i == 2) {
            c6977.write(((C23324) abstractC18391.m41867()).m51950());
            return;
        }
        if (i == 3) {
            c6977.write(((C23994) abstractC18391.m41867()).m53168());
            return;
        }
        if (i != 4) {
            return;
        }
        C13266 c13266 = (C13266) abstractC18391.m41867();
        c6977.write(34);
        String strM30317 = c13266.m30317();
        for (int i2 = 0; i2 < strM30317.length(); i2++) {
            char cCharAt = strM30317.charAt(i2);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    c6977.write(92);
                }
                c6977.write(cCharAt);
            } else if (cCharAt > 127) {
                c6977.write(cCharAt);
            } else if (cCharAt == '\t') {
                c6977.write("\\t");
            } else if (cCharAt == '\n') {
                c6977.write("\\n");
            } else if (cCharAt == '\r') {
                c6977.write("\\r");
            } else {
                c6977.write(cCharAt);
            }
        }
        c6977.write(34);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m32987(String str, C5651 c5651) {
        String str2;
        C5651 c5652;
        String[] strArr;
        EnumC25097[] enumC25097Arr;
        HashMap map;
        C18590 c18590M24323;
        C6322 c6322;
        int i;
        ArrayList arrayList;
        String str3;
        int i2;
        int i3;
        int i4;
        AbstractC7230 abstractC7230M32984;
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
        EnumC25097 enumC25097;
        byte b;
        HashMap map2;
        String str6;
        int iMo8841;
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
        C14381 c14381 = this;
        C5651 c5653 = c5651;
        c14381.f41107 = -1;
        C6322 c6323 = c14381.f41108;
        if (c6323 == null) {
            return;
        }
        f41103 = 0;
        String[] strArrSplit = str.split("\n");
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap(1);
        EnumC25097[] enumC25097Arr2 = new EnumC25097[strArrSplit.length];
        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
        ArrayList arrayList4 = new ArrayList(1);
        int length = strArrSplit.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            str2 = "string is null";
            if (i15 < length) {
                c14381.f41107 = i15;
                String strTrim = strArrSplit[i15].trim();
                int i17 = length;
                if (strTrim.equals("") || strTrim.startsWith("#") || strTrim.startsWith("//")) {
                    enumC25097Arr = enumC25097Arr2;
                    enumC25097Arr[i15] = null;
                } else {
                    if (strTrim.endsWith(":")) {
                        map4.put(C17073.m38720(1, 0, strTrim), Integer.valueOf(i16));
                        enumC25097Arr2[i15] = null;
                        enumC25097Arr = enumC25097Arr2;
                    } else {
                        c6323 = c6323;
                        String str8 = " ";
                        arrayList3 = arrayList3;
                        int iIndexOf = strTrim.indexOf(" ");
                        String strSubstring = iIndexOf != -1 ? strTrim.substring(0, iIndexOf) : strTrim.trim();
                        EnumC25097 enumC25097M55082 = EnumC25097.m55082(strSubstring);
                        if (enumC25097M55082 == null) {
                            strSubstring.getClass();
                            enumC25097Arr = enumC25097Arr2;
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
                                    c5653 = c5653;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    map5 = map5;
                                    String strTrim2 = strArrSplit[i15 - 1].trim();
                                    int i19 = 1;
                                    int iIntValue = ((Integer) map5.get(strTrim2.substring(0, strTrim2.length() - 1))).intValue();
                                    C8532 c8532 = new C8532();
                                    while (true) {
                                        i15 += i19;
                                        String strTrim3 = strArrSplit[i15].trim();
                                        if (strTrim3.startsWith(str11)) {
                                            C8393 c8393 = new C8393(c8532.m19826(), c8532.m19830());
                                            iMo8841 = c8393.mo8841(i18) + i18;
                                            arrayList4.add(c8393);
                                        } else {
                                            String[] strArrSplit2 = strTrim3.split(":");
                                            String str12 = str11;
                                            if (strArrSplit2.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim3));
                                            }
                                            try {
                                                c8532.m19827(Integer.parseInt(strArrSplit2[0].trim()), ((Integer) map4.get(strArrSplit2[1].trim())).intValue() - iIntValue);
                                                i19 = 1;
                                                str11 = str12;
                                            } catch (Exception unused) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim3));
                                            }
                                        }
                                    }
                                    i9 = iMo8841;
                                    enumC25097 = enumC25097M55082;
                                    break;
                                case 1:
                                    String str13 = ".end";
                                    ArrayList arrayList5 = arrayList4;
                                    int i20 = i16;
                                    c5653 = c5653;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    int i21 = 1;
                                    String strTrim4 = strArrSplit[i15 - 1].trim();
                                    map5 = map5;
                                    int iIntValue2 = ((Integer) map5.get(strTrim4.substring(0, strTrim4.length() - 1))).intValue();
                                    C8532 c8533 = new C8532();
                                    while (true) {
                                        i15 += i21;
                                        String strTrim5 = strArrSplit[i15].trim();
                                        String str14 = str13;
                                        if (strTrim5.startsWith(str14)) {
                                            C15768 c15768 = new C15768(c8533.m19828(), c8533.m19830());
                                            arrayList4 = arrayList5;
                                            arrayList4.add(c15768);
                                            int i22 = i20;
                                            iMo8841 = c15768.mo8841(i22) + i22;
                                        } else {
                                            int i23 = i20;
                                            ArrayList arrayList6 = arrayList5;
                                            String[] strArrSplit3 = strTrim5.split(":");
                                            if (strArrSplit3.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim5));
                                            }
                                            try {
                                                c8533.m19827(Integer.parseInt(strArrSplit3[0].trim()), ((Integer) map4.get(strArrSplit3[1].trim())).intValue() - iIntValue2);
                                                i21 = 1;
                                                str13 = str14;
                                                arrayList5 = arrayList6;
                                                i20 = i23;
                                            } catch (Exception unused2) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim5));
                                            }
                                        }
                                    }
                                    i9 = iMo8841;
                                    enumC25097 = enumC25097M55082;
                                    break;
                                case 2:
                                    String str15 = " ";
                                    HashMap map6 = map4;
                                    ArrayList arrayList7 = arrayList4;
                                    C10544 c10544 = new C10544();
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
                                                c10544.m24325(iIntValue3, iIntValue4, iIntValue5);
                                            } else {
                                                c10544.m24326(C23994.m53164(strTrim7, c5651), iIntValue3, iIntValue4, iIntValue5);
                                            }
                                        } else {
                                            map2 = map6;
                                            str6 = str15;
                                        }
                                        i15++;
                                        str15 = str6;
                                        map6 = map2;
                                    }
                                    c5652 = c5651;
                                    map = map6;
                                    c18590M24323 = c10544.m24323();
                                    arrayList4 = arrayList7;
                                    break;
                                case 3:
                                    String[] strArrSplit5 = strArrSplit[i15].trim().split(" ");
                                    if (strArrSplit5.length < 2) {
                                        throw new IllegalArgumentException("unknow element Width: " + strArrSplit[i15]);
                                    }
                                    int iM32946 = C14353.m32946(strArrSplit5[1]);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        i15++;
                                        String strTrim8 = strArrSplit[i15].trim();
                                        if (strTrim8.startsWith(str10)) {
                                            C16419 c16419 = new C16419(iM32946, byteArrayOutputStream.toByteArray());
                                            arrayList4.add(c16419);
                                            iMo8841 = c16419.mo8841(i16) + i16;
                                            c5653 = c5653;
                                            strArrSplit = strArrSplit;
                                            map4 = map4;
                                            map5 = map5;
                                        } else {
                                            String[] strArrSplit6 = strTrim8.split(str8);
                                            if (strArrSplit6.length != iM32946) {
                                                throw new IllegalArgumentException("encodeValues width:" + strArrSplit6.length + " does not match : " + iM32946);
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
                                                                i13 = iM32946;
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
                                                            i14 = iM32946;
                                                            b6 = (byte) (b4 * b2);
                                                            if (b4 <= b3) {
                                                                throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                            }
                                                            if (b6 >= 0) {
                                                            }
                                                            b4 = (byte) (b6 + iDigit2);
                                                            i12++;
                                                            iM32946 = i14;
                                                            strArrSplit = strArr2;
                                                        }
                                                    } else {
                                                        b5 = 0;
                                                        i13 = iM32946;
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
                                                            i13 = iM32946;
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
                                                        i14 = iM32946;
                                                        b6 = (byte) (b4 * b2);
                                                        if (b4 <= b3) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        if (b6 >= 0 && b6 >= (-iDigit2)) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        b4 = (byte) (b6 + iDigit2);
                                                        i12++;
                                                        iM32946 = i14;
                                                        strArrSplit = strArr2;
                                                    }
                                                }
                                                byteArrayOutputStream.write(b5);
                                                i24++;
                                                iM32946 = i13;
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
                                            c5653 = c5651;
                                        }
                                    }
                                    i9 = iMo8841;
                                    enumC25097 = enumC25097M55082;
                                    break;
                                    break;
                                default:
                                    throw new IllegalArgumentException("unknow opcodeName: ".concat(str9));
                            }
                        } else {
                            enumC25097Arr = enumC25097Arr2;
                            int i28 = i16;
                            c5653 = c5653;
                            strArrSplit = strArrSplit;
                            map4 = map4;
                            map5 = map5;
                            int i29 = C15051.f42986[enumC25097M55082.ordinal()];
                            if (i29 == 1 || i29 == 2) {
                                String[] strArrSplit7 = strTrim.split(":");
                                if (strArrSplit7.length != 2) {
                                    throw new IllegalArgumentException(" opcode offset error: ".concat(strTrim));
                                }
                                map5.put(strArrSplit7[1].trim(), Integer.valueOf(i28));
                            }
                            enumC25097 = enumC25097M55082;
                            i9 = (enumC25097.f80338.f80466 / 2) + i28;
                        }
                        enumC25097Arr[i15] = enumC25097;
                    }
                    i15++;
                    c14381 = this;
                    strArrSplit = strArrSplit;
                    map5 = map5;
                    map4 = map4;
                    c5653 = c5653;
                    length = i17;
                    enumC25097Arr2 = enumC25097Arr;
                    arrayList3 = arrayList3;
                    i16 = i9;
                    c6323 = c6323;
                }
                i9 = i16;
                i15++;
                c14381 = this;
                strArrSplit = strArrSplit;
                map5 = map5;
                map4 = map4;
                c5653 = c5653;
                length = i17;
                enumC25097Arr2 = enumC25097Arr;
                arrayList3 = arrayList3;
                i16 = i9;
                c6323 = c6323;
            } else {
                c5652 = c5653;
                c6323 = c6323;
                strArr = strArrSplit;
                enumC25097Arr = enumC25097Arr2;
                arrayList3 = arrayList3;
                map = map4;
                c18590M24323 = null;
            }
        }
        int i30 = 0;
        int i31 = 0;
        for (int length3 = strArr.length; i31 < length3; length3 = length3) {
            this.f41107 = i31;
            String strTrim10 = strArr[i31].trim();
            EnumC25097 enumC25098 = enumC25097Arr[i31];
            if (enumC25098 != null) {
                int i32 = C15051.f42985[enumC25098.f80338.ordinal()];
                Pattern pattern = f41101;
                switch (i32) {
                    case 1:
                        strArr = strArr;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C22456(enumC25098, (byte) m32978(i3, strTrim10, map)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 2:
                        strArr = strArr;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C3679(enumC25098, (short) (m32978(i3, strTrim10, map) & 65535)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 3:
                        strArr = strArr;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C15078(enumC25098, (short) m32982(strTrim10), (short) (m32978(i3, strTrim10, map) & 65535)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 4:
                        strArr = strArr;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        Matcher matcher = pattern.matcher(strTrim10);
                        matcher.find();
                        byte b7 = (byte) Integer.parseInt(matcher.group().substring(1));
                        matcher.find();
                        arrayList.add(new C18451(enumC25098, b7, (byte) Integer.parseInt(matcher.group().substring(1)), (short) (m32978(i3, strTrim10, map) & 65535)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 5:
                        strArr = strArr;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C22476(enumC25098, m32978(i3, strTrim10, map)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 6:
                        strArr = strArr;
                        int i33 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        i3 = i33;
                        arrayList.add(new C20464(enumC25098, (short) m32982(strTrim10), m32978(i3, strTrim10, map)));
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 7:
                    case 8:
                    case 26:
                    default:
                        strArr = strArr;
                        c18590M24323 = c18590M24323;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 9:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C11056(enumC25098));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 10:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C20444(enumC25098, (short) m32982(strTrim10)));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 11:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C5021(enumC25098, (byte) m32982(strTrim10), (byte) m32979(strTrim10)));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 12:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        Matcher matcher2 = pattern.matcher(strTrim10);
                        matcher2.find();
                        byte b8 = (byte) Integer.parseInt(matcher2.group().substring(1));
                        matcher2.find();
                        arrayList.add(new C3008(enumC25098, b8, (byte) Integer.parseInt(matcher2.group().substring(1))));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 13:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        c5652 = c5652;
                        str3 = str2;
                        arrayList = arrayList3;
                        short sM32982 = (short) m32982(strTrim10);
                        int i34 = C15051.f42987[enumC25098.f80335.ordinal()];
                        if (i34 == 1) {
                            try {
                                abstractC7230M32984 = m32984(strTrim10, c5652);
                            } catch (Exception unused3) {
                                throw new Exception(C21466.m48631("FieldIdItem error: ", strTrim10));
                            }
                        } else if (i34 == 3) {
                            try {
                                abstractC7230M32984 = m32985(strTrim10, c5652);
                            } catch (Exception unused4) {
                                throw new Exception(C21466.m48631("TypeIdItem error: ", strTrim10));
                            }
                        } else if (i34 != 4) {
                            abstractC7230M32984 = null;
                        } else {
                            try {
                                abstractC7230M32984 = C13266.m30314(C6458.m14761(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c5652);
                            } catch (Exception unused5) {
                                throw new Exception(C21466.m48631("String error: ", strTrim10));
                            }
                        }
                        arrayList.add(new C17089(enumC25098, sM32982, abstractC7230M32984));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 14:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18590M24323 = c18590M24323;
                        arrayList4 = arrayList4;
                        str3 = str2;
                        arrayList = arrayList3;
                        c5652 = c5651;
                        arrayList.add(new C11076(enumC25098, (short) m32982(strTrim10), C13266.m30314(C6458.m14761(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c5652)));
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 15:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C23796(enumC25098, (short) m32982(strTrim10), (short) (m32979(strTrim10) & 65535)));
                        c5652 = c5651;
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 16:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C7032(enumC25098, (short) m32982(strTrim10), (short) (m32979(strTrim10) & 65535)));
                        c5652 = c5651;
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 17:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C5041(enumC25098, (byte) m32982(strTrim10), m32979(strTrim10)));
                        c5652 = c5651;
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 18:
                        ArrayList arrayList9 = arrayList3;
                        short sM32983 = (short) m32982(strTrim10);
                        Matcher matcher3 = f41102.matcher(strTrim10);
                        if (!matcher3.find()) {
                            throw new Exception(C21466.m48631("long exception: ", strTrim10));
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
                            j = C14849.FOREVER_NS / ((long) (i6 / 2));
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
                            C12417 c12417 = new C12417(enumC25098, sM32983, j3);
                            arrayList = arrayList2;
                            arrayList.add(c12417);
                            str3 = str4;
                            c5652 = c5651;
                            i3 = i4;
                            i2 = (enumC25098.f80338.f80466 / 2) + i3;
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
                                j = C14849.FOREVER_NS / ((long) (i6 / 2));
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
                                C12417 c12418 = new C12417(enumC25098, sM32983, j3);
                                arrayList = arrayList2;
                                arrayList.add(c12418);
                                str3 = str4;
                                c5652 = c5651;
                                i3 = i4;
                                i2 = (enumC25098.f80338.f80466 / 2) + i3;
                            } else {
                                arrayList2 = arrayList9;
                                i4 = i30;
                                i31 = i31;
                                str4 = str2;
                            }
                        }
                        j3 = j5;
                        C12417 c12419 = new C12417(enumC25098, sM32983, j3);
                        arrayList = arrayList2;
                        arrayList.add(c12419);
                        str3 = str4;
                        c5652 = c5651;
                        i3 = i4;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                        break;
                    case 19:
                        arrayList = arrayList3;
                        Matcher matcher4 = pattern.matcher(strTrim10);
                        matcher4.find();
                        short s = (short) (Integer.parseInt(matcher4.group().substring(1)) & 65535);
                        matcher4.find();
                        arrayList.add(new C19122(enumC25098, s, Integer.parseInt(matcher4.group().substring(1)) & 65535));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 20:
                        arrayList = arrayList3;
                        Matcher matcher5 = pattern.matcher(strTrim10);
                        matcher5.find();
                        short s2 = (short) Integer.parseInt(matcher5.group().substring(1));
                        matcher5.find();
                        arrayList.add(new C12397(enumC25098, s2, (short) Integer.parseInt(matcher5.group().substring(1)), (byte) (m32979(strTrim10) & 255)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 21:
                        arrayList = arrayList3;
                        Matcher matcher6 = pattern.matcher(strTrim10);
                        matcher6.find();
                        byte b9 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        matcher6.find();
                        byte b10 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        int i36 = C15051.f42987[enumC25098.f80335.ordinal()];
                        arrayList.add(new C13738(enumC25098, b9, b10, i36 != 1 ? i36 != 3 ? null : m32985(strTrim10, c5652) : m32984(strTrim10, c5652)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 22:
                        arrayList = arrayList3;
                        Matcher matcher7 = pattern.matcher(strTrim10);
                        matcher7.find();
                        byte b11 = (byte) Integer.parseInt(matcher7.group().substring(1));
                        matcher7.find();
                        arrayList.add(new C4370(enumC25098, b11, (byte) Integer.parseInt(matcher7.group().substring(1)), (short) (m32979(strTrim10) & 65535)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 23:
                        arrayList = arrayList3;
                        Matcher matcher8 = pattern.matcher(strTrim10);
                        matcher8.find();
                        short s3 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        short s4 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        arrayList.add(new C25157(enumC25098, s3, s4, (short) Integer.parseInt(matcher8.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 24:
                        arrayList = arrayList3;
                        Matcher matcher9 = pattern.matcher(strTrim10);
                        matcher9.find();
                        int i37 = Integer.parseInt(matcher9.group().substring(1));
                        matcher9.find();
                        arrayList.add(new C3028(enumC25098, i37, Integer.parseInt(matcher9.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                    case 25:
                        arrayList = arrayList3;
                        byte[] bArr = new byte[5];
                        Arrays.fill(bArr, (byte) 0);
                        int i38 = 0;
                        for (Matcher matcher10 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(C0254q.f1218h))); matcher10.find() && i38 < 5; matcher10 = matcher10) {
                            bArr[i38] = (byte) Integer.parseInt(matcher10.group().substring(1));
                            i38++;
                        }
                        int[] iArr = {i38};
                        f41103 = Math.max(f41103, i38);
                        int i39 = C15051.f42987[enumC25098.f80335.ordinal()];
                        AbstractC7230 abstractC7230M32985 = i39 != 2 ? i39 != 3 ? null : m32985(strTrim10, c5652) : m32986(strTrim10, c5652);
                        try {
                            arrayList.add(new C3699(enumC25098, iArr[0], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], abstractC7230M32985));
                            i3 = i30;
                            str3 = str2;
                            i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        } catch (Exception unused6) {
                            throw new RuntimeException(strTrim10 + EnumC2483.f3919 + abstractC7230M32985 + EnumC2483.f3919 + iArr[0]);
                        }
                        break;
                    case 27:
                        int[] iArr2 = new int[2];
                        Matcher matcher11 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(C0254q.f1218h)));
                        matcher11.find();
                        iArr2[1] = Integer.parseInt(matcher11.group().substring(1));
                        int i40 = 0;
                        while (matcher11.find()) {
                            i40 = Integer.parseInt(matcher11.group().substring(1));
                        }
                        int i41 = (i40 - iArr2[1]) + 1;
                        iArr2[0] = i41;
                        f41103 = Math.max(f41103, i41);
                        int i42 = C15051.f42987[enumC25098.f80335.ordinal()];
                        arrayList = arrayList3;
                        arrayList.add(new C7052(enumC25098, (short) iArr2[0], iArr2[1], i42 != 2 ? i42 != 3 ? null : m32985(strTrim10, c5652) : m32986(strTrim10, c5652)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC25098.f80338.f80466 / 2) + i3;
                        break;
                }
            } else {
                strArr = strArr;
                i31 = i31;
                c18590M24323 = c18590M24323;
                arrayList4 = arrayList4;
                c5652 = c5652;
                arrayList = arrayList3;
                int i43 = i30;
                str3 = str2;
                i2 = i43;
            }
            i31++;
            arrayList3 = arrayList;
            str2 = str3;
            c5652 = c5652;
            arrayList4 = arrayList4;
            strArr = strArr;
            c18590M24323 = c18590M24323;
            i30 = i2;
        }
        C18590 c18590 = c18590M24323;
        ArrayList arrayList10 = arrayList3;
        this.f41107 = -1;
        arrayList10.addAll(arrayList4);
        AbstractC4310[] abstractC4310Arr = new AbstractC4310[arrayList10.size()];
        arrayList10.toArray(abstractC4310Arr);
        if (c18590 != null) {
            List list = (List) c18590.f55504;
            List list2 = (List) c18590.f55505;
            if (list.size() > 0) {
                C4981[] c4981Arr = new C4981[list.size()];
                C11016[] c11016Arr = new C11016[list2.size()];
                list.toArray(c4981Arr);
                list2.toArray(c11016Arr);
                c6322 = c6323;
                c6322.f16388 = c4981Arr;
                c6322.f16381 = c11016Arr;
            } else {
                c6322 = c6323;
            }
        } else {
            c6322 = c6323;
            c6322.f16388 = null;
            c6322.f16381 = null;
        }
        C15568 parent = c6322.getParent();
        C15276 c15276 = parent.f44483.f73397.f41698;
        if (c15276 == null) {
            i = 0;
        } else {
            int iM53169 = 0;
            for (C23994 c23994 : c15276.f43597) {
                iM53169 += c23994.m53169();
            }
            i = iM53169;
        }
        if ((parent.f44484 & EnumC9242.STATIC.getValue()) == 0) {
            i++;
        }
        c6322.f16387 = i;
        c6322.f16384 = f41103;
        c6322.f16386 = abstractC4310Arr;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C19971 m32984(String str, C5651 c5651) {
        String[] strArrSplit = f41105.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 2) {
            throw new RuntimeException(C21466.m48631("FieldIdItem error: ", str));
        }
        return C19971.m45319(c5651, C23994.m53164(strArrSplit[length - 3], c5651), C23994.m53164(strArrSplit[i], c5651), C13266.m30314(strArrSplit[length - 2], c5651));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C23324 m32986(String str, C5651 c5651) {
        String[] strArrSplit = f41106.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 3) {
            throw new RuntimeException("MethodIdItem error: ".concat(str));
        }
        return C23324.m51947(c5651, C23994.m53164(strArrSplit[length - 4], c5651), C14606.m33395(c5651, C23994.m53164(strArrSplit[i], c5651), m32983(strArrSplit[length - 2], c5651)), C13266.m30314(strArrSplit[length - 3], c5651));
    }

    /* JADX INFO: renamed from: ܿ */
    public static C23994 m32985(String str, C5651 c5651) {
        String strTrim = str.trim();
        return C23994.m53164(strTrim.substring(strTrim.lastIndexOf(" ") + 1), c5651);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m32979(String str) throws Exception {
        Matcher matcher = f41104.matcher(str);
        if (matcher.find()) {
            return C14353.m32946(matcher.group().trim());
        }
        throw new Exception(C21466.m48631("int exception: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m32978(int i, String str, HashMap map) {
        try {
            return ((Integer) map.get(str.split(":")[1].trim())).intValue() - i;
        } catch (Exception unused) {
            throw new IllegalArgumentException(C21466.m48631("unfound label offset: ", str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m32982(String str) throws Exception {
        Matcher matcher = f41101.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group().substring(1));
        }
        throw new Exception(C21466.m48631("register exception: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX INFO: renamed from: ۧ */
    public static C15276 m32983(String str, C5651 c5651) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 'F') {
                i = i2 + 1;
                arrayList.add(C23994.m53164(str.substring(i2, i), c5651));
            } else if (cCharAt == 'L') {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    if (str.charAt(i4) != ';') {
                        i3 = i4;
                    } else {
                        i = i3 + 2;
                        arrayList.add(C23994.m53164(str.substring(i2, i), c5651));
                    }
                }
            } else if (cCharAt == 'S' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z') {
                i = i2 + 1;
                arrayList.add(C23994.m53164(str.substring(i2, i), c5651));
            } else if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                    case 'D':
                        i = i2 + 1;
                        arrayList.add(C23994.m53164(str.substring(i2, i), c5651));
                        break;
                    default:
                        throw new RuntimeException(C21459.m48621(i2, str, new StringBuilder("Invalid type ")));
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
                        arrayList.add(C23994.m53164(str.substring(i2, i), c5651));
                    }
                }
            }
            i2 = i;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return C15276.m34775(c5651, arrayList);
    }
}
