package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܿ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17570 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f53688;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f53689;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f53690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21099[] f53691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f53692;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f53693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f53694;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C17570(byte[] bArr, boolean z) {
        int i;
        this.f53689 = bArr;
        if (z && m41078(6) > 70) {
            throw new IllegalArgumentException(C19370.m44628(m41078(6), "Unsupported class file major version "));
        }
        int iM41077 = m41077(8);
        this.f53692 = new int[iM41077];
        this.f53693 = new String[iM41077];
        int i2 = 10;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int iM41078 = 4;
            if (i3 >= iM41077) {
                this.f53694 = i4;
                this.f53690 = i2;
                int[] iArr = null;
                this.f53691 = z2 ? new C21099[iM41077] : null;
                if (z3) {
                    char[] cArr = new char[i4];
                    int iM41069 = m41069();
                    for (int iM41079 = m41077(iM41069 - 2); iM41079 > 0; iM41079--) {
                        String strM41074 = m41074(cArr, iM41069);
                        int iM41073 = m41073(iM41069 + 2);
                        int i5 = iM41069 + 6;
                        if ("BootstrapMethods".equals(strM41074)) {
                            int iM410710 = m41077(i5);
                            int[] iArr2 = new int[iM410710];
                            int iM410711 = iM41069 + 8;
                            for (int i6 = 0; i6 < iM410710; i6++) {
                                iArr2[i6] = iM410711;
                                iM410711 += (m41077(iM410711 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            iM41069 = i5 + iM41073;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f53688 = iArr;
                return;
            }
            int i7 = i3 + 1;
            int i8 = i2 + 1;
            this.f53692[i3] = i8;
            switch (bArr[i2]) {
                case 1:
                    iM41078 = m41077(i8) + 3;
                    if (iM41078 > i4) {
                        i4 = iM41078;
                    }
                    i = iM41078;
                    i2 += i;
                    i3 = i7;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i = 5;
                    i2 += i;
                    i3 = i7;
                    break;
                case 5:
                case 6:
                    i7 = i3 + 2;
                    i = 9;
                    i2 += i;
                    i3 = i7;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i = 3;
                    i2 += i;
                    i3 = i7;
                    break;
                case 15:
                    i = iM41078;
                    i2 += i;
                    i3 = i7;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i7;
                    break;
                case 18:
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i7;
                    break;
            }
        }
    }

    public C17570(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        int iMin = iAvailable < 256 ? 4096 : Math.min(iAvailable, 1048576);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] byteArray = new byte[iMin];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(byteArray, 0, iMin);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(byteArray, 0, i2);
                i++;
            }
            byteArrayOutputStream.flush();
            if (i != 1) {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.close();
            int length = byteArray.length;
            this(byteArray, true);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41072(AbstractC23920 abstractC23920, C16864[] c16864Arr, int i) {
        AbstractC23920 abstractC23921;
        int i2;
        String str;
        C9104 c9104;
        String str2;
        String str3;
        String str4;
        String str5;
        C17570 c17570;
        String str6;
        String str7;
        String str8;
        int i3;
        String str9;
        String str10;
        String str11;
        String[] strArr;
        String[] strArr2;
        int i4;
        int i5;
        C9104 c9105 = new C9104();
        c9105.f27582 = c16864Arr;
        c9105.f27581 = i;
        char[] cArr = new char[this.f53694];
        c9105.f27589 = cArr;
        int i6 = this.f53690;
        int iM41077 = m41077(i6);
        String strM41068 = m41068(cArr, i6 + 2);
        String strM41069 = m41068(cArr, i6 + 4);
        int iM41078 = m41077(i6 + 6);
        String[] strArr3 = new String[iM41078];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < iM41078; i8++) {
            strArr3[i8] = m41068(cArr, i7);
            i7 += 2;
        }
        int iM41069 = m41069();
        String strM41074 = null;
        int iM41079 = m41077(iM41069 - 2);
        String strM410610 = null;
        String strM410611 = null;
        C16864 c16864 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = iM41077;
        int i20 = 0;
        String strM41075 = null;
        String strM41063 = null;
        while (true) {
            C9104 c9106 = c9105;
            int i21 = i7;
            String str12 = strM41069;
            if (iM41079 > 0) {
                String str13 = strM410610;
                String strM41076 = m41074(cArr, iM41069);
                int i22 = i20;
                int iM41073 = m41073(iM41069 + 2);
                int i23 = iM41069 + 6;
                String str14 = strM41063;
                if ("SourceFile".equals(strM41076)) {
                    strM41075 = m41074(cArr, i23);
                } else if ("InnerClasses".equals(strM41076)) {
                    i16 = i23;
                } else if ("EnclosingMethod".equals(strM41076)) {
                    i9 = i23;
                } else if ("NestHost".equals(strM41076)) {
                    strM410611 = m41068(cArr, i23);
                } else if ("NestMembers".equals(strM41076)) {
                    i14 = i23;
                } else if ("PermittedSubclasses".equals(strM41076)) {
                    i15 = i23;
                } else if ("Signature".equals(strM41076)) {
                    strM41074 = m41074(cArr, i23);
                } else if ("RuntimeVisibleAnnotations".equals(strM41076)) {
                    i10 = i23;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM41076)) {
                    i12 = i23;
                } else if ("Deprecated".equals(strM41076)) {
                    i19 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                } else if ("Synthetic".equals(strM41076)) {
                    i19 |= 4096;
                } else {
                    if ("SourceDebugExtension".equals(strM41076)) {
                        if (iM41073 > this.f53689.length - i23) {
                            throw new IllegalArgumentException();
                        }
                        strM41063 = m41063(new char[iM41073], i23, iM41073);
                        strM410610 = str13;
                        i4 = i23;
                        i5 = iM41073;
                        i21 = i21;
                        i20 = i22;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM41076)) {
                        i11 = i23;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM41076)) {
                        i13 = i23;
                    } else if ("Record".equals(strM41076)) {
                        i19 |= 65536;
                        i17 = i23;
                    } else if ("Module".equals(strM41076)) {
                        i18 = i23;
                    } else if ("ModuleMainClass".equals(strM41076)) {
                        strM410610 = m41068(cArr, i23);
                        strM41063 = str14;
                        i4 = i23;
                        i5 = iM41073;
                        i21 = i21;
                        i20 = i22;
                    } else if ("ModulePackages".equals(strM41076)) {
                        i22 = i23;
                    } else {
                        if ("BootstrapMethods".equals(strM41076)) {
                            i4 = i23;
                            i5 = iM41073;
                        } else {
                            i4 = i23;
                            i5 = iM41073;
                            C16864 c16864M41065 = m41065(c16864Arr, strM41076, i4, i5, cArr, -1, null);
                            c16864M41065.f51744 = c16864;
                            c16864 = c16864M41065;
                        }
                        strM410610 = str13;
                        strM41063 = str14;
                        i19 = i19;
                        i20 = i22;
                        strM41075 = strM41075;
                    }
                    iM41069 = i4 + i5;
                    iM41079--;
                    i7 = i21;
                    c9105 = c9106;
                    strM41069 = str12;
                }
                strM410610 = str13;
                strM41063 = str14;
                i4 = i23;
                i5 = iM41073;
                i21 = i21;
                i20 = i22;
                iM41069 = i4 + i5;
                iM41079--;
                i7 = i21;
                c9105 = c9106;
                strM41069 = str12;
            } else {
                String str15 = strM41075;
                int i24 = i20;
                int[] iArr = this.f53692;
                String str16 = "Synthetic";
                String str17 = strM410610;
                String str18 = "RuntimeInvisibleAnnotations";
                String str19 = strM41063;
                String str20 = strM41074;
                String str21 = "Deprecated";
                abstractC23920.mo18883(m41073(iArr[1] - 7), i19, strM41068, str20, str12, strArr3);
                String str22 = "RuntimeVisibleTypeAnnotations";
                if ((i & 2) != 0 || (str15 == null && str19 == null)) {
                    abstractC23921 = abstractC23920;
                } else {
                    abstractC23921 = abstractC23920;
                    abstractC23921.mo18886(str15, str19);
                }
                int i25 = i18;
                if (i25 != 0) {
                    c9104 = c9106;
                    char[] cArr2 = c9104.f27589;
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    int i26 = i25 + 6;
                    AbstractC22509 abstractC22509Mo18881 = abstractC23921.mo18881(m41077(i25 + 2), m41068(cArr2, i25), m41074(cArr2, i25 + 4));
                    if (abstractC22509Mo18881 != null) {
                        if (str17 != null) {
                            abstractC22509Mo18881.mo41755(str17);
                        }
                        if (i24 != 0) {
                            int iM410710 = m41077(i24);
                            int i27 = i24 + 2;
                            while (true) {
                                int i28 = iM410710 - 1;
                                if (iM410710 <= 0) {
                                    break;
                                }
                                abstractC22509Mo18881.mo41758(m41068(cArr2, i27));
                                i27 += 2;
                                iM410710 = i28;
                            }
                        }
                        int iM410711 = m41077(i26);
                        int i29 = i25 + 8;
                        while (true) {
                            int i30 = iM410711 - 1;
                            if (iM410711 <= 0) {
                                break;
                            }
                            String strM410612 = m41068(cArr2, i29);
                            int iM410712 = m41077(i29 + 2);
                            String strM41077 = m41074(cArr2, i29 + 4);
                            i29 += 6;
                            abstractC22509Mo18881.mo41754(iM410712, strM410612, strM41077);
                            iM410711 = i30;
                        }
                        int iM410713 = m41077(i29);
                        int i31 = i29 + 2;
                        while (true) {
                            int i32 = iM410713 - 1;
                            if (iM410713 <= 0) {
                                break;
                            }
                            String strM410613 = m41068(cArr2, i31);
                            int iM410714 = m41077(i31 + 2);
                            int iM410715 = m41077(i31 + 4);
                            i31 += 6;
                            if (iM410715 != 0) {
                                strArr2 = new String[iM410715];
                                for (int i33 = 0; i33 < iM410715; i33++) {
                                    strArr2[i33] = m41068(cArr2, i31);
                                    i31 += 2;
                                }
                            } else {
                                strArr2 = null;
                            }
                            abstractC22509Mo18881.mo41756(strM410613, iM410714, strArr2);
                            iM410713 = i32;
                        }
                        int iM410716 = m41077(i31);
                        int i34 = i31 + 2;
                        while (true) {
                            int i35 = iM410716 - 1;
                            if (iM410716 <= 0) {
                                break;
                            }
                            String strM410614 = m41068(cArr2, i34);
                            int iM410717 = m41077(i34 + 2);
                            int iM410718 = m41077(i34 + 4);
                            i34 += 6;
                            if (iM410718 != 0) {
                                strArr = new String[iM410718];
                                for (int i36 = 0; i36 < iM410718; i36++) {
                                    strArr[i36] = m41068(cArr2, i34);
                                    i34 += 2;
                                }
                            } else {
                                strArr = null;
                            }
                            abstractC22509Mo18881.mo41759(strM410614, iM410717, strArr);
                            iM410716 = i35;
                        }
                        int iM410719 = m41077(i34);
                        int i37 = i34 + 2;
                        while (true) {
                            int i38 = iM410719 - 1;
                            if (iM410719 <= 0) {
                                break;
                            }
                            abstractC22509Mo18881.mo41760(m41068(cArr2, i37));
                            i37 += 2;
                            iM410719 = i38;
                        }
                        int iM410720 = m41077(i37);
                        int i39 = i37 + 2;
                        while (true) {
                            int i40 = iM410720 - 1;
                            if (iM410720 <= 0) {
                                break;
                            }
                            String strM410615 = m41068(cArr2, i39);
                            int iM410721 = m41077(i39 + 2);
                            i39 += 4;
                            String[] strArr4 = new String[iM410721];
                            for (int i41 = 0; i41 < iM410721; i41++) {
                                strArr4[i41] = m41068(cArr2, i39);
                                i39 += 2;
                            }
                            abstractC22509Mo18881.mo41757(strM410615, strArr4);
                            iM410720 = i40;
                        }
                        abstractC22509Mo18881.mo46701();
                    }
                } else {
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    c9104 = c9106;
                }
                String str23 = strM410611;
                if (str23 != null) {
                    abstractC23921.mo18884(str23);
                }
                int i42 = i9;
                if (i42 != 0) {
                    String strM410616 = m41068(cArr, i42);
                    int iM410722 = m41077(i42 + 2);
                    abstractC23921.mo18887(strM410616, iM410722 == 0 ? null : m41074(cArr, iArr[iM410722]), iM410722 == 0 ? null : m41074(cArr, iArr[iM410722] + 2));
                }
                int i43 = i10;
                if (i43 != 0) {
                    int iM410723 = m41077(i43);
                    int iM41061 = i43 + 2;
                    while (true) {
                        int i44 = iM410723 - 1;
                        if (iM410723 <= 0) {
                            break;
                        }
                        iM41061 = m41061(abstractC23921.mo18879(m41074(cArr, iM41061), true), iM41061 + 2, true, cArr);
                        iM410723 = i44;
                    }
                }
                int i45 = i11;
                if (i45 != 0) {
                    int iM410724 = m41077(i45);
                    int iM41062 = i45 + 2;
                    while (true) {
                        int i46 = iM410724 - 1;
                        if (iM410724 <= 0) {
                            break;
                        }
                        iM41062 = m41061(abstractC23921.mo18879(m41074(cArr, iM41062), false), iM41062 + 2, true, cArr);
                        iM410724 = i46;
                    }
                }
                int i47 = i12;
                if (i47 != 0) {
                    int iM410725 = m41077(i47);
                    int iM41063 = i47 + 2;
                    while (true) {
                        int i48 = iM410725 - 1;
                        if (iM410725 <= 0) {
                            break;
                        }
                        int iM41059 = m41059(c9104, iM41063);
                        iM41063 = m41061(abstractC23921.mo18878(c9104.f27580, c9104.f27585, m41074(cArr, iM41059), true), iM41059 + 2, true, cArr);
                        iM410725 = i48;
                    }
                }
                int i49 = i13;
                if (i49 != 0) {
                    int iM410726 = m41077(i49);
                    int iM41064 = i49 + 2;
                    while (true) {
                        int i50 = iM410726 - 1;
                        if (iM410726 <= 0) {
                            break;
                        }
                        int iM410510 = m41059(c9104, iM41064);
                        iM41064 = m41061(abstractC23921.mo18878(c9104.f27580, c9104.f27585, m41074(cArr, iM410510), false), iM410510 + 2, true, cArr);
                        iM410726 = i50;
                    }
                }
                C16864 c16865 = c16864;
                while (c16865 != null) {
                    C16864 c16866 = c16865.f51744;
                    c16865.f51744 = null;
                    abstractC23921.mo18888(c16865);
                    c16865 = c16866;
                }
                int i51 = i14;
                if (i51 != 0) {
                    int iM410727 = m41077(i51);
                    int i52 = i51 + 2;
                    while (true) {
                        int i53 = iM410727 - 1;
                        if (iM410727 <= 0) {
                            break;
                        }
                        abstractC23921.mo18890(m41068(cArr, i52));
                        i52 += 2;
                        iM410727 = i53;
                    }
                }
                int i54 = i15;
                if (i54 != 0) {
                    int iM410728 = m41077(i54);
                    int i55 = i54 + 2;
                    while (true) {
                        int i56 = iM410728 - 1;
                        if (iM410728 <= 0) {
                            break;
                        }
                        abstractC23921.mo18892(m41068(cArr, i55));
                        i55 += 2;
                        iM410728 = i56;
                    }
                }
                int i57 = i16;
                if (i57 != 0) {
                    int iM410729 = m41077(i57);
                    int i58 = i57 + 2;
                    while (true) {
                        int i59 = iM410729 - 1;
                        if (iM410729 <= 0) {
                            break;
                        }
                        abstractC23921.mo18885(m41068(cArr, i58), m41077(i58 + 6), m41068(cArr, i58 + 2), m41074(cArr, i58 + 4));
                        i58 += 8;
                        iM410729 = i59;
                    }
                }
                int i60 = i17;
                if (i60 != 0) {
                    int iM410730 = m41077(i60);
                    C17570 c17571 = this;
                    int i61 = i60 + 2;
                    while (true) {
                        int i62 = iM410730 - 1;
                        if (iM410730 <= 0) {
                            break;
                        }
                        char[] cArr3 = c9104.f27589;
                        String strM41078 = c17571.m41074(cArr3, i61);
                        String strM41079 = c17571.m41074(cArr3, i61 + 2);
                        int iM410731 = c17571.m41077(i61 + 4);
                        i61 += 6;
                        String strM410710 = null;
                        C16864 c16867 = null;
                        int i63 = 0;
                        int i64 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        while (true) {
                            int i67 = iM410731 - 1;
                            if (iM410731 <= 0) {
                                break;
                            }
                            String strM410711 = c17571.m41074(cArr3, i61);
                            int i68 = i63;
                            int iM41074 = c17571.m41073(i61 + 2);
                            i63 = i61 + 6;
                            if ("Signature".equals(strM410711)) {
                                strM410710 = c17571.m41074(cArr3, i63);
                            } else if ("RuntimeVisibleAnnotations".equals(strM410711)) {
                                i64 = i63;
                            } else {
                                if (str22.equals(strM410711)) {
                                    i65 = i63;
                                } else if (str18.equals(strM410711)) {
                                    str10 = str;
                                    str11 = str22;
                                } else {
                                    str9 = str;
                                    if (str9.equals(strM410711)) {
                                        i66 = i63;
                                        str10 = str9;
                                        str11 = str22;
                                        i63 = i68;
                                    } else {
                                        str10 = str9;
                                        str11 = str22;
                                        C16864 c16864M41066 = m41065(c9104.f27582, strM410711, i63, iM41074, cArr3, -1, null);
                                        c16864M41066.f51744 = c16867;
                                        c17571 = this;
                                        c16867 = c16864M41066;
                                        i64 = i64;
                                        i63 = i68;
                                    }
                                }
                                i61 = i63 + iM41074;
                                abstractC23921 = abstractC23920;
                                str16 = str16;
                                str22 = str11;
                                iM410731 = i67;
                                str = str10;
                                str18 = str18;
                                i62 = i62;
                            }
                            str9 = str;
                            str10 = str9;
                            str11 = str22;
                            i63 = i68;
                            i61 = i63 + iM41074;
                            abstractC23921 = abstractC23920;
                            str16 = str16;
                            str22 = str11;
                            iM410731 = i67;
                            str = str10;
                            str18 = str18;
                            i62 = i62;
                        }
                        int i69 = i63;
                        String str24 = str18;
                        int i70 = i64;
                        int i71 = i62;
                        String str25 = str;
                        String str26 = str16;
                        C16864 c16868 = c16867;
                        String str27 = str22;
                        AbstractC23920 abstractC23922 = abstractC23921;
                        AbstractC4870 abstractC4870Mo18889 = abstractC23922.mo18889(strM41078, strM41079, strM410710);
                        if (abstractC4870Mo18889 != null) {
                            if (i70 != 0) {
                                int iM410732 = c17571.m41077(i70);
                                int iM41065 = i70 + 2;
                                while (true) {
                                    int i72 = iM410732 - 1;
                                    if (iM410732 <= 0) {
                                        break;
                                    }
                                    iM41065 = c17571.m41061(abstractC4870Mo18889.mo10594(c17571.m41074(cArr3, iM41065), true), iM41065 + 2, true, cArr3);
                                    iM410732 = i72;
                                }
                            }
                            if (i69 != 0) {
                                int iM410733 = c17571.m41077(i69);
                                int iM41066 = i69 + 2;
                                while (true) {
                                    int i73 = iM410733 - 1;
                                    if (iM410733 <= 0) {
                                        break;
                                    }
                                    iM41066 = c17571.m41061(abstractC4870Mo18889.mo10594(c17571.m41074(cArr3, iM41066), false), iM41066 + 2, true, cArr3);
                                    iM410733 = i73;
                                }
                            }
                            int i74 = i65;
                            if (i74 != 0) {
                                int iM410734 = c17571.m41077(i74);
                                int iM41067 = i74 + 2;
                                while (true) {
                                    int i75 = iM410734 - 1;
                                    if (iM410734 <= 0) {
                                        break;
                                    }
                                    int iM410511 = c17571.m41059(c9104, iM41067);
                                    iM41067 = c17571.m41061(abstractC4870Mo18889.mo10593(c9104.f27580, c9104.f27585, c17571.m41074(cArr3, iM410511), true), iM410511 + 2, true, cArr3);
                                    iM410734 = i75;
                                }
                            }
                            int i76 = i66;
                            if (i76 != 0) {
                                int iM410735 = c17571.m41077(i76);
                                int iM41068 = i76 + 2;
                                while (true) {
                                    int i77 = iM410735 - 1;
                                    if (iM410735 <= 0) {
                                        break;
                                    }
                                    int iM410512 = c17571.m41059(c9104, iM41068);
                                    iM41068 = c17571.m41061(abstractC4870Mo18889.mo10593(c9104.f27580, c9104.f27585, c17571.m41074(cArr3, iM410512), false), iM410512 + 2, true, cArr3);
                                    iM410735 = i77;
                                }
                            }
                            while (c16868 != null) {
                                C16864 c16869 = c16868.f51744;
                                c16868.f51744 = null;
                                abstractC4870Mo18889.mo10597(c16868);
                                c16868 = c16869;
                            }
                            abstractC4870Mo18889.mo10595();
                        }
                        iM410730 = i71;
                        abstractC23921 = abstractC23922;
                        str16 = str26;
                        str22 = str27;
                        str = str25;
                        str18 = str24;
                    }
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c17570 = c17571;
                } else {
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c17570 = this;
                }
                int i78 = i2;
                int iM410736 = c17570.m41077(i78);
                int i79 = i78 + 2;
                while (true) {
                    int i80 = iM410736 - 1;
                    if (iM410736 <= 0) {
                        break;
                    }
                    char[] cArr4 = c9104.f27589;
                    int iM410737 = c17570.m41077(i79);
                    String strM410712 = c17570.m41074(cArr4, i79 + 2);
                    String strM410713 = c17570.m41074(cArr4, i79 + 4);
                    int iM410738 = c17570.m41077(i79 + 6);
                    int i81 = i79 + 8;
                    C16864 c168610 = null;
                    String strM410714 = null;
                    Object objM41071 = null;
                    int i82 = 0;
                    int i83 = 0;
                    int i84 = 0;
                    int i85 = 0;
                    while (true) {
                        int i86 = iM410738 - 1;
                        if (iM410738 <= 0) {
                            break;
                        }
                        String strM410715 = c17570.m41074(cArr4, i81);
                        int i87 = i83;
                        int iM41075 = c17570.m41073(i81 + 2);
                        int i88 = i81 + 6;
                        int i89 = i85;
                        if ("ConstantValue".equals(strM410715)) {
                            int iM410739 = c17570.m41077(i88);
                            objM41071 = iM410739 == 0 ? null : c17570.m41071(cArr4, iM410739);
                            str6 = str21;
                        } else {
                            if ("Signature".equals(strM410715)) {
                                strM410714 = c17570.m41074(cArr4, i88);
                                i3 = i82;
                                str7 = str5;
                            } else {
                                str6 = str21;
                                if (str6.equals(strM410715)) {
                                    iM410737 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                } else {
                                    if (str4.equals(strM410715)) {
                                        iM410737 |= 4096;
                                    } else if ("RuntimeVisibleAnnotations".equals(strM410715)) {
                                        i3 = i82;
                                        str21 = str6;
                                        i84 = i88;
                                        i85 = i89;
                                    } else {
                                        str21 = str6;
                                        str7 = str5;
                                        if (str7.equals(strM410715)) {
                                            i3 = i88;
                                        } else {
                                            str5 = str7;
                                            String str28 = str2;
                                            if (str28.equals(strM410715)) {
                                                str2 = str28;
                                                i89 = i88;
                                                str8 = str3;
                                                i3 = i82;
                                                str3 = str8;
                                                i85 = i89;
                                            } else {
                                                str2 = str28;
                                                str8 = str3;
                                                if (str8.equals(strM410715)) {
                                                    i87 = i88;
                                                    i3 = i82;
                                                    str3 = str8;
                                                    i85 = i89;
                                                } else {
                                                    str3 = str8;
                                                    C16864 c16864M41067 = c17570.m41065(c9104.f27582, strM410715, i88, iM41075, cArr4, -1, null);
                                                    c16864M41067.f51744 = c168610;
                                                    c168610 = c16864M41067;
                                                    i85 = i89;
                                                    i3 = i82;
                                                }
                                            }
                                        }
                                    }
                                    i81 = i88 + iM41075;
                                    i82 = i3;
                                    iM410738 = i86;
                                    i83 = i87;
                                }
                            }
                            str5 = str7;
                            str8 = str3;
                            str3 = str8;
                            i85 = i89;
                            i81 = i88 + iM41075;
                            i82 = i3;
                            iM410738 = i86;
                            i83 = i87;
                        }
                        str21 = str6;
                        str8 = str3;
                        i3 = i82;
                        str3 = str8;
                        i85 = i89;
                        i81 = i88 + iM41075;
                        i82 = i3;
                        iM410738 = i86;
                        i83 = i87;
                    }
                    int i90 = i85;
                    int i91 = i83;
                    AbstractC4165 abstractC4165Mo18877 = abstractC23920.mo18877(iM410737, strM410712, strM410713, strM410714, objM41071);
                    if (abstractC4165Mo18877 != null) {
                        if (i84 != 0) {
                            int iM410740 = c17570.m41077(i84);
                            int iM410610 = i84 + 2;
                            while (true) {
                                int i92 = iM410740 - 1;
                                if (iM410740 <= 0) {
                                    break;
                                }
                                iM410610 = c17570.m41061(abstractC4165Mo18877.mo5447(c17570.m41074(cArr4, iM410610), true), iM410610 + 2, true, cArr4);
                                iM410740 = i92;
                            }
                        }
                        if (i90 != 0) {
                            int iM410741 = c17570.m41077(i90);
                            int iM410611 = i90 + 2;
                            while (true) {
                                int i93 = iM410741 - 1;
                                if (iM410741 <= 0) {
                                    break;
                                }
                                iM410611 = c17570.m41061(abstractC4165Mo18877.mo5447(c17570.m41074(cArr4, iM410611), false), iM410611 + 2, true, cArr4);
                                iM410741 = i93;
                            }
                        }
                        if (i82 != 0) {
                            int i94 = i82;
                            int iM410742 = c17570.m41077(i94);
                            int iM410612 = i94 + 2;
                            while (true) {
                                int i95 = iM410742 - 1;
                                if (iM410742 <= 0) {
                                    break;
                                }
                                int iM410513 = c17570.m41059(c9104, iM410612);
                                iM410612 = c17570.m41061(abstractC4165Mo18877.mo5446(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM410513), true), iM410513 + 2, true, cArr4);
                                iM410742 = i95;
                            }
                        }
                        if (i91 != 0) {
                            int iM410743 = c17570.m41077(i91);
                            int iM410613 = i91 + 2;
                            while (true) {
                                int i96 = iM410743 - 1;
                                if (iM410743 <= 0) {
                                    break;
                                }
                                int iM410514 = c17570.m41059(c9104, iM410613);
                                iM410613 = c17570.m41061(abstractC4165Mo18877.mo5446(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM410514), false), iM410514 + 2, true, cArr4);
                                iM410743 = i96;
                            }
                        }
                        while (c168610 != null) {
                            C16864 c168611 = c168610.f51744;
                            c168610.f51744 = null;
                            abstractC4165Mo18877.mo12600(c168610);
                            c168610 = c168611;
                        }
                        abstractC4165Mo18877.mo12599();
                    }
                    iM410736 = i80;
                    i79 = i81;
                }
                int iM410744 = c17570.m41077(i79);
                int iM410614 = i79 + 2;
                while (true) {
                    int i97 = iM410744 - 1;
                    if (iM410744 <= 0) {
                        abstractC23920.mo18882();
                        return;
                    } else {
                        iM410614 = c17570.m41062(abstractC23920, c9104, iM410614);
                        iM410744 = i97;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:446:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:456:0x0cc0  */
    /* JADX WARN: Code duplicated, block: B:460:0x0cc7  */
    /* JADX WARN: Code duplicated, block: B:461:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:595:0x0cb4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:248:0x062c. Please report as an issue. */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41062(AbstractC23920 abstractC23920, C9104 c9104, int i) {
        int i2;
        String str;
        int i3;
        AbstractC15452 abstractC15452;
        int i4;
        int[] iArr;
        String strM41074;
        boolean z;
        int i5;
        C17570 c17570;
        int i6;
        C17570 c17571;
        int i7;
        C16864 c16864;
        int i8;
        boolean z2;
        int i9;
        int iM41057;
        int i10;
        int i11;
        int i12;
        C17570 c17572;
        int iM41058;
        C1342[] c1342Arr;
        int iM41077;
        int i13;
        int i14;
        int[] iArrM41067;
        String str2;
        int i15;
        C1342[] c1342Arr2;
        String str3;
        int i16;
        int i17;
        int i18;
        int i19;
        char[] cArr = c9104.f27589;
        c9104.f27583 = m41077(i);
        c9104.f27596 = m41074(cArr, i + 2);
        int i20 = i + 4;
        c9104.f27584 = m41074(cArr, i20);
        int iM41078 = m41077(i + 6);
        boolean z3 = false;
        int i21 = 0;
        C16864 c16864M41065 = null;
        String[] strArr = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM41079 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = i + 8;
        int i31 = 0;
        while (true) {
            int i32 = iM41078 - 1;
            i2 = iM41079;
            str = "RuntimeInvisibleTypeAnnotations";
            i3 = i28;
            if (iM41078 <= 0) {
                break;
            }
            String strM41075 = m41074(cArr, i30);
            int i33 = i31;
            int iM41073 = m41073(i30 + 2);
            int i34 = i30 + 6;
            int i35 = i22;
            if ("Code".equals(strM41075)) {
                if ((c9104.f27581 & 1) == 0) {
                    iM41079 = i2;
                    i29 = i34;
                } else {
                    iM41079 = i2;
                }
                i22 = i35;
                i28 = i3;
                int i36 = i33;
                i19 = i34;
                i31 = i36;
                i23 = i23;
            } else {
                if ("Exceptions".equals(strM41075)) {
                    int iM410710 = m41077(i34);
                    String[] strArr2 = new String[iM410710];
                    int i37 = i30 + 8;
                    for (int i38 = 0; i38 < iM410710; i38++) {
                        strArr2[i38] = m41068(cArr, i37);
                        i37 += 2;
                    }
                    iM41079 = i2;
                    i21 = i34;
                    strArr = strArr2;
                } else if ("Signature".equals(strM41075)) {
                    iM41079 = m41077(i34);
                } else if ("Deprecated".equals(strM41075)) {
                    c9104.f27583 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    iM41079 = i2;
                } else if ("RuntimeVisibleAnnotations".equals(strM41075)) {
                    iM41079 = i2;
                    i27 = i34;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM41075)) {
                    iM41079 = i2;
                    i25 = i34;
                } else {
                    if ("AnnotationDefault".equals(strM41075)) {
                        iM41079 = i2;
                        i26 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i26;
                    } else if ("Synthetic".equals(strM41075)) {
                        c9104.f27583 |= 4096;
                        z3 = true;
                        iM41079 = i2;
                        i22 = i35;
                        i28 = i3;
                        i19 = i34;
                        i31 = i33;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM41075)) {
                        iM41079 = i2;
                        i28 = i34;
                        i22 = i35;
                        int i39 = i33;
                        i19 = i34;
                        i31 = i39;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM41075)) {
                        iM41079 = i2;
                        i24 = i34;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(strM41075)) {
                        iM41079 = i2;
                        i23 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i23;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(strM41075)) {
                        iM41079 = i2;
                        i33 = i34;
                    } else if ("MethodParameters".equals(strM41075)) {
                        iM41079 = i2;
                        i22 = i34;
                        i28 = i3;
                        int i310 = i33;
                        i19 = i34;
                        i31 = i310;
                    } else {
                        i19 = i34;
                        C16864 c16865 = c16864M41065;
                        c16864M41065 = m41065(c9104.f27582, strM41075, i19, iM41073, cArr, -1, null);
                        c16864M41065.f51744 = c16865;
                        iM41079 = i2;
                        i31 = i33;
                        i28 = i3;
                        i22 = i35;
                        i24 = i24;
                        i25 = i25;
                    }
                    i23 = i23;
                }
                i22 = i35;
                i28 = i3;
                int i311 = i33;
                i19 = i34;
                i31 = i311;
                i23 = i23;
            }
            i30 = i19 + iM41073;
            iM41078 = i32;
        }
        int i40 = i22;
        int i41 = i23;
        int i42 = i24;
        int i43 = i25;
        String str4 = "RuntimeVisibleTypeAnnotations";
        int i44 = i31;
        C16864 c16866 = c16864M41065;
        AbstractC15452 abstractC15452Mo18880 = abstractC23920.mo18880(c9104.f27583, c9104.f27596, c9104.f27584, i2 == 0 ? null : m41076(cArr, i2), strArr);
        if (abstractC15452Mo18880 == null) {
            return i30;
        }
        if (abstractC15452Mo18880 instanceof C21804) {
            ((C21804) abstractC15452Mo18880).m49146(this, z3, (c9104.f27583 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, m41077(i20), i2, i21);
        }
        if (i40 != 0 && (c9104.f27581 & 2) == 0) {
            int iM41070 = m41070(i40);
            int i45 = i40 + 1;
            while (true) {
                int i46 = iM41070 - 1;
                if (iM41070 <= 0) {
                    break;
                }
                abstractC15452Mo18880.mo28291(m41077(i45 + 2), m41074(cArr, i45));
                i45 += 4;
                iM41070 = i46;
            }
        }
        if (i26 != 0) {
            AbstractC14104 abstractC14104Mo26963 = abstractC15452Mo18880.mo26963();
            m41060(abstractC14104Mo26963, i26, (String) null, cArr);
            if (abstractC14104Mo26963 != null) {
                abstractC14104Mo26963.mo20790();
            }
        }
        if (i27 != 0) {
            int iM410711 = m41077(i27);
            int iM41061 = i27 + 2;
            while (true) {
                int i47 = iM410711 - 1;
                if (iM410711 <= 0) {
                    break;
                }
                iM41061 = m41061(abstractC15452Mo18880.mo26968(m41074(cArr, iM41061), true), iM41061 + 2, true, cArr);
                iM410711 = i47;
            }
        }
        if (i3 != 0) {
            int iM410712 = m41077(i3);
            int iM41062 = i3 + 2;
            while (true) {
                int i48 = iM410712 - 1;
                if (iM410712 <= 0) {
                    break;
                }
                iM41062 = m41061(abstractC15452Mo18880.mo26968(m41074(cArr, iM41062), false), iM41062 + 2, true, cArr);
                iM410712 = i48;
            }
        }
        if (i43 != 0) {
            int iM410713 = m41077(i43);
            int iM41063 = i43 + 2;
            while (true) {
                int i49 = iM410713 - 1;
                if (iM410713 <= 0) {
                    break;
                }
                int iM41059 = m41059(c9104, iM41063);
                iM41063 = m41061(abstractC15452Mo18880.mo26977(c9104.f27580, c9104.f27585, m41074(cArr, iM41059), true), iM41059 + 2, true, cArr);
                iM410713 = i49;
            }
        }
        if (i42 != 0) {
            int iM410714 = m41077(i42);
            int iM41064 = i42 + 2;
            while (true) {
                int i50 = iM410714 - 1;
                if (iM410714 <= 0) {
                    break;
                }
                int iM410510 = m41059(c9104, iM41064);
                iM41064 = m41061(abstractC15452Mo18880.mo26977(c9104.f27580, c9104.f27585, m41074(cArr, iM410510), false), iM410510 + 2, true, cArr);
                iM410714 = i50;
            }
        }
        if (i41 != 0) {
            m41066(abstractC15452Mo18880, c9104, i41, true);
        }
        if (i44 != 0) {
            m41066(abstractC15452Mo18880, c9104, i44, false);
        }
        C16864 c16867 = c16866;
        while (c16867 != null) {
            C16864 c16868 = c16867.f51744;
            c16867.f51744 = null;
            abstractC15452Mo18880.mo28288(c16867);
            c16867 = c16868;
        }
        int i51 = i29;
        if (i51 != 0) {
            abstractC15452Mo18880.mo28289();
            char[] cArr2 = c9104.f27589;
            int iM410715 = m41077(i51);
            int iM410716 = m41077(i51 + 2);
            int iM41074 = m41073(i51 + 4);
            int i52 = i51 + 8;
            byte[] bArr = this.f53689;
            if (iM41074 > bArr.length - i52) {
                throw new IllegalArgumentException();
            }
            int i53 = i52 + iM41074;
            C1342[] c1342Arr3 = new C1342[iM41074 + 1];
            c9104.f27595 = c1342Arr3;
            int i54 = i52;
            while (i54 < i53) {
                int i55 = i54 - i52;
                switch (bArr[i54] & 255) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                    case 85:
                    case HRSS1373Polynomial.K /* 86 */:
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    case 93:
                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case q.f /* 99 */:
                    case 100:
                    case 101:
                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    case 108:
                    case 109:
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    case 114:
                    case 115:
                    case 116:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    case 118:
                    case 119:
                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                    case 122:
                    case 123:
                    case 124:
                    case q.h /* 125 */:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 172:
                    case 173:
                    case 174:
                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    case 177:
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                        i54++;
                        break;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    case 169:
                    case 188:
                        i54 += 2;
                        break;
                    case 17:
                    case 19:
                    case 20:
                    case 132:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 187:
                    case 189:
                    case 192:
                    case 193:
                        i54 += 3;
                        break;
                    case 153:
                    case EnumC17734.f54268 /* 154 */:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                        m41064(m41078(i54 + 1) + i55, c1342Arr3);
                        i54 += 3;
                        break;
                    case 170:
                        int i56 = (4 - (i55 & 3)) + i54;
                        m41064(m41073(i56) + i55, c1342Arr3);
                        int iM41075 = (m41073(i56 + 8) - m41073(i56 + 4)) + 1;
                        i18 = i56 + 12;
                        while (true) {
                            int i57 = iM41075 - 1;
                            if (iM41075 <= 0) {
                                i54 = i18;
                            } else {
                                m41064(m41073(i18) + i55, c1342Arr3);
                                i18 += 4;
                                iM41075 = i57;
                            }
                            break;
                        }
                        break;
                    case 171:
                        int i58 = (4 - (i55 & 3)) + i54;
                        m41064(m41073(i58) + i55, c1342Arr3);
                        int iM41076 = m41073(i58 + 4);
                        i18 = i58 + 8;
                        while (true) {
                            int i59 = iM41076 - 1;
                            if (iM41076 <= 0) {
                                i54 = i18;
                            } else {
                                m41064(m41073(i18 + 4) + i55, c1342Arr3);
                                i18 += 8;
                                iM41076 = i59;
                            }
                            break;
                        }
                        break;
                    case 185:
                    case 186:
                        i54 += 5;
                        break;
                    case 196:
                        int i60 = bArr[i54 + 1] & 255;
                        if (i60 != 132) {
                            if (i60 != 169) {
                                switch (i60) {
                                    default:
                                        switch (i60) {
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            case 56:
                                            case 57:
                                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        i54 += 4;
                                        break;
                                }
                            }
                            i54 += 4;
                        } else {
                            i54 += 6;
                        }
                        break;
                    case 197:
                        i54 += 4;
                        break;
                    case 200:
                    case 201:
                    case 220:
                        m41064(m41073(i54 + 1) + i55, c1342Arr3);
                        i54 += 5;
                        break;
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                    case 218:
                    case 219:
                        m41064(m41077(i54 + 1) + i55, c1342Arr3);
                        i54 += 3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            int iM410717 = m41077(i54);
            int i61 = i54 + 2;
            while (true) {
                int i62 = iM410717 - 1;
                int[] iArr2 = this.f53692;
                if (iM410717 > 0) {
                    C1342 c1342M41064 = m41064(m41077(i61), c1342Arr3);
                    C1342 c1342M41065 = m41064(m41077(i61 + 2), c1342Arr3);
                    int i63 = i53;
                    C1342 c1342M41066 = m41064(m41077(i61 + 4), c1342Arr3);
                    String strM41076 = m41074(cArr2, iArr2[m41077(i61 + 6)]);
                    i61 += 8;
                    abstractC15452Mo18880.mo26975(c1342M41064, c1342M41065, c1342M41066, strM41076);
                    iM410717 = i62;
                    i53 = i63;
                    bArr = bArr;
                } else {
                    int i64 = i53;
                    byte[] bArr2 = bArr;
                    int iM410718 = m41077(i61);
                    int i65 = i61 + 2;
                    int[] iArr3 = null;
                    int i66 = 0;
                    int i67 = 0;
                    int i68 = 0;
                    int i69 = 0;
                    boolean z4 = true;
                    int[] iArrM41068 = null;
                    C16864 c16869 = null;
                    while (true) {
                        int i70 = iM410718 - 1;
                        if (iM410718 > 0) {
                            String strM41077 = m41074(cArr2, i65);
                            C16864 c168610 = c16869;
                            int iM410719 = m41073(i65 + 2);
                            int i71 = i65 + 6;
                            int[] iArr4 = iArr2;
                            if (!"LocalVariableTable".equals(strM41077)) {
                                iArrM41067 = iArr3;
                                if ("LocalVariableTypeTable".equals(strM41077)) {
                                    i67 = i71;
                                    i15 = i71;
                                    iArr3 = iArrM41067;
                                    c16869 = c168610;
                                    str3 = str;
                                    c1342Arr2 = c1342Arr3;
                                } else if ("LineNumberTable".equals(strM41077)) {
                                    if ((c9104.f27581 & 2) == 0) {
                                        int iM410720 = m41077(i71);
                                        int i72 = i65 + 8;
                                        while (true) {
                                            int i73 = iM410720 - 1;
                                            if (iM410720 > 0) {
                                                int iM410721 = m41077(i72);
                                                int iM410722 = m41077(i72 + 2);
                                                int i74 = i72 + 4;
                                                C1342 c1342 = c1342Arr3[iM410721];
                                                if (c1342 == null) {
                                                    if (c1342 == null) {
                                                        c1342Arr3[iM410721] = new C1342();
                                                    }
                                                    C1342 c1343 = c1342Arr3[iM410721];
                                                    c1343.f4880 = (short) (c1343.f4880 | 1);
                                                }
                                                c1342Arr3[iM410721].m4681(iM410722);
                                                i72 = i74;
                                                iM410720 = i73;
                                            }
                                        }
                                    }
                                    str2 = str;
                                    i17 = i66;
                                    i16 = i68;
                                    i68 = i16;
                                    i66 = i17;
                                    i15 = i71;
                                    c16869 = c168610;
                                    c1342Arr2 = c1342Arr3;
                                    int[] iArr5 = iArrM41067;
                                    str3 = str2;
                                    iArr3 = iArr5;
                                } else {
                                    if (str4.equals(strM41077)) {
                                        iArrM41068 = m41067(abstractC15452Mo18880, c9104, i71, true);
                                        str2 = str;
                                    } else {
                                        str2 = str;
                                        if (str2.equals(strM41077)) {
                                            iArrM41067 = m41067(abstractC15452Mo18880, c9104, i71, false);
                                        } else {
                                            if ("StackMapTable".equals(strM41077)) {
                                                if ((c9104.f27581 & 4) == 0) {
                                                    i68 = i65 + 8;
                                                    i66 = i71 + iM410719;
                                                }
                                            } else if ("StackMap".equals(strM41077)) {
                                                if ((c9104.f27581 & 4) == 0) {
                                                    i16 = i65 + 8;
                                                    i17 = i71 + iM410719;
                                                    z4 = false;
                                                }
                                                i68 = i16;
                                                i66 = i17;
                                            } else {
                                                i15 = i71;
                                                c1342Arr2 = c1342Arr3;
                                                str3 = str2;
                                                C16864 c16864M41066 = m41065(c9104.f27582, strM41077, i15, iM410719, cArr2, i51, c1342Arr2);
                                                c16864M41066.f51744 = c168610;
                                                c16869 = c16864M41066;
                                                iArrM41068 = iArrM41068;
                                                iArr3 = iArrM41067;
                                            }
                                            i17 = i66;
                                            i16 = i68;
                                            i68 = i16;
                                            i66 = i17;
                                        }
                                    }
                                    i15 = i71;
                                    c16869 = c168610;
                                    c1342Arr2 = c1342Arr3;
                                    int[] iArr6 = iArrM41067;
                                    str3 = str2;
                                    iArr3 = iArr6;
                                }
                            } else if ((c9104.f27581 & 2) == 0) {
                                int iM410723 = m41077(i71);
                                int i75 = i65 + 8;
                                while (true) {
                                    int i76 = iM410723 - 1;
                                    if (iM410723 > 0) {
                                        int iM410724 = m41077(i75);
                                        C1342 c1344 = c1342Arr3[iM410724];
                                        if (c1344 == null) {
                                            if (c1344 == null) {
                                                c1342Arr3[iM410724] = new C1342();
                                            }
                                            C1342 c1345 = c1342Arr3[iM410724];
                                            c1345.f4880 = (short) (c1345.f4880 | 1);
                                        }
                                        int iM410725 = m41077(i75 + 2) + iM410724;
                                        C1342 c1346 = c1342Arr3[iM410725];
                                        if (c1346 == null) {
                                            if (c1346 == null) {
                                                c1342Arr3[iM410725] = new C1342();
                                            }
                                            C1342 c1347 = c1342Arr3[iM410725];
                                            c1347.f4880 = (short) (c1347.f4880 | 1);
                                        }
                                        i75 += 10;
                                        iM410723 = i76;
                                        iArr3 = iArr3;
                                    } else {
                                        iArrM41067 = iArr3;
                                        i69 = i71;
                                        i15 = i71;
                                        iArr3 = iArrM41067;
                                        c16869 = c168610;
                                        str3 = str;
                                        c1342Arr2 = c1342Arr3;
                                    }
                                }
                            } else {
                                iArrM41067 = iArr3;
                                str2 = str;
                                i17 = i66;
                                i16 = i68;
                                i68 = i16;
                                i66 = i17;
                                i15 = i71;
                                c16869 = c168610;
                                c1342Arr2 = c1342Arr3;
                                int[] iArr7 = iArrM41067;
                                str3 = str2;
                                iArr3 = iArr7;
                            }
                            i65 = i15 + iM410719;
                            c1342Arr3 = c1342Arr2;
                            cArr2 = cArr2;
                            iM41074 = iM41074;
                            iM410718 = i70;
                            iArr2 = iArr4;
                            str = str3;
                            str4 = str4;
                            i51 = i51;
                        } else {
                            C16864 c168611 = c16869;
                            int[] iArr8 = iArr2;
                            C1342[] c1342Arr4 = c1342Arr3;
                            int[] iArr9 = iArr3;
                            int i77 = iM41074;
                            char[] cArr3 = cArr2;
                            int[] iArr10 = iArrM41068;
                            boolean z5 = (c9104.f27581 & 8) != 0;
                            if (i68 != 0) {
                                c9104.f27590 = -1;
                                c9104.f27597 = 0;
                                c9104.f27592 = 0;
                                c9104.f27594 = 0;
                                Object[] objArr = new Object[iM410716];
                                c9104.f27593 = objArr;
                                c9104.f27598 = 0;
                                c9104.f27586 = new Object[iM410715];
                                if (z5) {
                                    String str5 = c9104.f27584;
                                    if ((c9104.f27583 & 8) == 0) {
                                        if ("<init>".equals(c9104.f27596)) {
                                            objArr[0] = 6;
                                        } else {
                                            objArr[0] = m41068(c9104.f27589, this.f53690 + 2);
                                        }
                                        i13 = 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i78 = 1;
                                    while (true) {
                                        int i79 = i78 + 1;
                                        char cCharAt = str5.charAt(i78);
                                        if (cCharAt == 'F') {
                                            i14 = i13 + 1;
                                            objArr[i13] = 2;
                                        } else if (cCharAt != 'L') {
                                            if (cCharAt != 'S' && cCharAt != 'I') {
                                                if (cCharAt == 'J') {
                                                    i14 = i13 + 1;
                                                    objArr[i13] = 4;
                                                } else if (cCharAt != 'Z') {
                                                    if (cCharAt != '[') {
                                                        switch (cCharAt) {
                                                            case 'D':
                                                                i14 = i13 + 1;
                                                                objArr[i13] = 3;
                                                                break;
                                                        }
                                                        c9104.f27592 = i13;
                                                    } else {
                                                        while (str5.charAt(i79) == '[') {
                                                            i79++;
                                                        }
                                                        if (str5.charAt(i79) == 'L') {
                                                            do {
                                                                i79++;
                                                            } while (str5.charAt(i79) != ';');
                                                        }
                                                        i14 = i13 + 1;
                                                        i79++;
                                                        objArr[i13] = str5.substring(i78, i79);
                                                    }
                                                }
                                            }
                                            i14 = i13 + 1;
                                            objArr[i13] = 1;
                                        } else {
                                            int i80 = i79;
                                            while (str5.charAt(i80) != ';') {
                                                i80++;
                                            }
                                            i78 = i80 + 1;
                                            objArr[i13] = str5.substring(i79, i80);
                                            i13++;
                                        }
                                        i13 = i14;
                                        i78 = i79;
                                    }
                                }
                                int i81 = i68;
                                while (i81 < i66 - 2) {
                                    if (bArr2[i81] != 8 || (iM41077 = m41077(i81 + 1)) < 0 || iM41077 >= i77 || (bArr2[i52 + iM41077] & 255) != 187) {
                                        c1342Arr = c1342Arr4;
                                    } else {
                                        c1342Arr = c1342Arr4;
                                        m41064(iM41077, c1342Arr);
                                    }
                                    i81++;
                                    c1342Arr4 = c1342Arr;
                                }
                            }
                            C1342[] c1342Arr5 = c1342Arr4;
                            if (z5 && (c9104.f27581 & 256) != 0) {
                                abstractC15452Mo18880.mo26969(-1, iM410716, 0, (Object[]) null, (Object[]) null);
                            }
                            int iM410511 = m41057(0, iArr10);
                            int i82 = 0;
                            int iM410512 = m41057(0, iArr9);
                            int i83 = (c9104.f27581 & 256) == 0 ? 33 : 0;
                            C16864 c168612 = c168611;
                            AbstractC15452 abstractC15453 = abstractC15452Mo18880;
                            int i84 = iM410715;
                            int i85 = iM410716;
                            int i86 = i64;
                            int i87 = i66;
                            int i88 = 0;
                            C17570 c17573 = this;
                            int[] iArr11 = iArr10;
                            int i89 = i30;
                            char[] cArr4 = cArr3;
                            int i90 = iM410511;
                            int i91 = i67;
                            boolean z6 = false;
                            int[] iArr12 = iArr9;
                            C1342[] c1342Arr6 = c1342Arr5;
                            int i92 = i69;
                            C17570 c17574 = c17573;
                            int i93 = i52;
                            while (i93 < i86) {
                                int i94 = i93 - i52;
                                int i95 = i86;
                                C1342 c1348 = c1342Arr6[i94];
                                boolean z7 = z6;
                                if (c1348 != null) {
                                    c1348.m4683(abstractC15453, (c9104.f27581 & 2) == 0);
                                }
                                int i96 = i68;
                                boolean z8 = z7;
                                while (true) {
                                    if (i96 != 0) {
                                        i85 = i85;
                                        int i97 = c9104.f27590;
                                        i84 = i84;
                                        if (i97 == i94 || i97 == -1) {
                                            if (i97 != -1) {
                                                if (!z4 || z5) {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC15453.mo26969(-1, c9104.f27592, c9104.f27598, c9104.f27593, c9104.f27586);
                                                } else {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC15453.mo26969(c9104.f27597, c9104.f27594, c9104.f27598, c9104.f27593, c9104.f27586);
                                                }
                                                z8 = false;
                                            } else {
                                                iArr11 = iArr11;
                                                iArr12 = iArr12;
                                                i85 = i85;
                                                i84 = i84;
                                                i91 = i91;
                                                cArr4 = cArr4;
                                                i94 = i94;
                                            }
                                            if (i96 < i87) {
                                                char[] cArr5 = c9104.f27589;
                                                C1342[] c1342Arr7 = c9104.f27595;
                                                if (z4) {
                                                    i11 = i96 + 1;
                                                    i12 = bArr2[i96] & 255;
                                                } else {
                                                    c9104.f27590 = -1;
                                                    i11 = i96;
                                                    i12 = 255;
                                                }
                                                c9104.f27594 = 0;
                                                if (i12 < 64) {
                                                    c9104.f27597 = 3;
                                                    c9104.f27598 = 0;
                                                } else {
                                                    if (i12 < 128) {
                                                        i12 -= 64;
                                                        int iM410513 = c17574.m41058(i11, c9104.f27586, 0, cArr5, c1342Arr7);
                                                        c9104.f27597 = 4;
                                                        c9104.f27598 = 1;
                                                        i11 = iM410513;
                                                    } else {
                                                        if (i12 < 247) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        c17572 = c17574;
                                                        int iM410726 = c17572.m41077(i11);
                                                        i87 = i87;
                                                        int iM410514 = i11 + 2;
                                                        if (i12 == 247) {
                                                            iM410514 = c17572.m41058(iM410514, c9104.f27586, 0, cArr5, c1342Arr7);
                                                            c9104.f27597 = 4;
                                                            c9104.f27598 = 1;
                                                            z8 = z8;
                                                        } else {
                                                            z8 = z8;
                                                            if (i12 >= 248 && i12 < 251) {
                                                                c9104.f27597 = 2;
                                                                int i98 = 251 - i12;
                                                                c9104.f27594 = i98;
                                                                c9104.f27592 -= i98;
                                                                c9104.f27598 = 0;
                                                            } else if (i12 == 251) {
                                                                c9104.f27597 = 3;
                                                                c9104.f27598 = 0;
                                                            } else {
                                                                if (i12 < 255) {
                                                                    int i99 = i12 - 251;
                                                                    iM41058 = iM410514;
                                                                    int i100 = i99;
                                                                    int i101 = z5 ? c9104.f27592 : 0;
                                                                    while (i100 > 0) {
                                                                        iM41058 = c17572.m41058(iM41058, c9104.f27593, i101, cArr5, c1342Arr7);
                                                                        i100--;
                                                                        i101++;
                                                                    }
                                                                    c9104.f27597 = 1;
                                                                    c9104.f27594 = i99;
                                                                    c9104.f27592 += i99;
                                                                    c9104.f27598 = 0;
                                                                } else {
                                                                    int iM410727 = c17572.m41077(iM410514);
                                                                    int iM410515 = i11 + 4;
                                                                    c9104.f27597 = 0;
                                                                    c9104.f27594 = iM410727;
                                                                    c9104.f27592 = iM410727;
                                                                    for (int i102 = 0; i102 < iM410727; i102++) {
                                                                        iM410515 = c17572.m41058(iM410515, c9104.f27593, i102, cArr5, c1342Arr7);
                                                                    }
                                                                    int iM410728 = c17572.m41077(iM410515);
                                                                    c9104.f27598 = iM410728;
                                                                    iM41058 = iM410515 + 2;
                                                                    for (int i103 = 0; i103 < iM410728; i103++) {
                                                                        iM41058 = c17572.m41058(iM41058, c9104.f27586, i103, cArr5, c1342Arr7);
                                                                    }
                                                                }
                                                                iM410514 = iM41058;
                                                            }
                                                        }
                                                        i11 = iM410514;
                                                        i12 = iM410726;
                                                    }
                                                    int i104 = i12 + 1 + c9104.f27590;
                                                    c9104.f27590 = i104;
                                                    m41064(i104, c1342Arr7);
                                                    i96 = i11;
                                                    c17574 = c17572;
                                                    i87 = i87;
                                                    z8 = z8;
                                                }
                                                c17572 = c17574;
                                                int i105 = i12 + 1 + c9104.f27590;
                                                c9104.f27590 = i105;
                                                m41064(i105, c1342Arr7);
                                                i96 = i11;
                                                c17574 = c17572;
                                                i87 = i87;
                                                z8 = z8;
                                            } else {
                                                i96 = 0;
                                            }
                                        } else {
                                            i85 = i85;
                                            i84 = i84;
                                        }
                                    } else {
                                        i85 = i85;
                                        i84 = i84;
                                    }
                                }
                                int i106 = i94;
                                C17570 c17575 = c17574;
                                if (z8) {
                                    if ((c9104.f27581 & 8) != 0) {
                                        abstractC15453.mo26969(256, 0, 0, (Object[]) null, (Object[]) null);
                                    }
                                    z = false;
                                } else {
                                    z5 = z5;
                                    c17575 = c17575;
                                    z = z8;
                                }
                                int i107 = bArr2[i93] & 255;
                                switch (i107) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case q.f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case q.h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case 142:
                                    case 143:
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    case 151:
                                    case 152:
                                    case 172:
                                    case 173:
                                    case 174:
                                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                    case 177:
                                    case 190:
                                    case 191:
                                    case 194:
                                    case 195:
                                        z = z;
                                        i83 = i83;
                                        abstractC15453.mo28279(i107);
                                        i5 = i93 + 1;
                                        c17570 = c17575;
                                        z6 = z;
                                        i6 = i83;
                                        c17571 = c17570;
                                        C16864 c168613 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168613;
                                        while (true) {
                                            C1342[] c1342Arr8 = c1342Arr6;
                                            if (iArr11 == null && i88 < iArr11.length && i90 <= i106) {
                                                if (i90 == i106) {
                                                    int iM410516 = c17570.m41059(c9104, iArr11[i88]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM410516), true), iM410516 + 2, true, cArr4);
                                                }
                                                int i108 = i88 + 1;
                                                int iM410517 = c17570.m41057(i108, iArr11);
                                                i6 = i6;
                                                i95 = i95;
                                                i5 = i5;
                                                c16864 = c16864;
                                                i8 = i8;
                                                c17570 = c17570;
                                                i92 = i92;
                                                i90 = iM410517;
                                                abstractC15453 = abstractC15453;
                                                i88 = i108;
                                                i96 = i96;
                                                bArr2 = bArr2;
                                                i89 = i89;
                                                c17571 = c17571;
                                                i91 = i91;
                                                z5 = z5;
                                                z4 = z4;
                                                i52 = i52;
                                                c1342Arr6 = c1342Arr8;
                                                i82 = i82;
                                                iArr8 = iArr8;
                                                iArr12 = iArr12;
                                            }
                                        }
                                        int i109 = i6;
                                        int i110 = i95;
                                        int i111 = i5;
                                        iM41057 = i8;
                                        i10 = i82;
                                        while (iArr12 != null && i10 < iArr12.length && iM41057 <= i106) {
                                            if (iM41057 == i106) {
                                                int iM410518 = c17570.m41059(c9104, iArr12[i10]);
                                                c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM410518), false), iM410518 + 2, true, cArr4);
                                            }
                                            i10++;
                                            iM41057 = c17570.m41057(i10, iArr12);
                                            i90 = i90;
                                            i88 = i88;
                                        }
                                        int i112 = i90;
                                        int i113 = i88;
                                        c168612 = c16864;
                                        c17573 = c17570;
                                        iM410512 = iM41057;
                                        i91 = i91;
                                        z5 = z5;
                                        c1342Arr6 = c1342Arr8;
                                        i86 = i110;
                                        i93 = i111;
                                        i87 = i87;
                                        i68 = i96;
                                        c17574 = c17571;
                                        i88 = i113;
                                        iArr12 = iArr12;
                                        i92 = i92;
                                        i90 = i112;
                                        i82 = i10;
                                        i83 = i109;
                                        break;
                                    case 16:
                                    case 188:
                                        abstractC15453.mo28290(i107, bArr2[i93 + 1]);
                                        i5 = i93 + 2;
                                        c17570 = c17575;
                                        z6 = z;
                                        i6 = i83;
                                        c17571 = c17570;
                                        C16864 c168614 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168614;
                                        while (true) {
                                            C1342[] c1342Arr9 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1010 = i6;
                                            int i114 = i95;
                                            int i115 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM410519 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM410519), false), iM410519 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i116 = i90;
                                            int i117 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr9;
                                            i86 = i114;
                                            i93 = i115;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i116;
                                            i82 = i10;
                                            i83 = i1010;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr9;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 17:
                                        z = z;
                                        i83 = i83;
                                        abstractC15453.mo28290(i107, c17575.m41078(i93 + 1));
                                        i5 = i93 + 3;
                                        c17570 = c17575;
                                        z6 = z;
                                        i6 = i83;
                                        c17571 = c17570;
                                        C16864 c168615 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168615;
                                        while (true) {
                                            C1342[] c1342Arr10 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1011 = i6;
                                            int i118 = i95;
                                            int i119 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105110 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105110), false), iM4105110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1110 = i90;
                                            int i1111 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr10;
                                            i86 = i118;
                                            i93 = i119;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1110;
                                            i82 = i10;
                                            i83 = i1011;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr10;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 18:
                                        abstractC15453.mo26971(c17575.m41071(cArr4, bArr2[i93 + 1] & 255));
                                        i5 = i93 + 2;
                                        c17570 = c17575;
                                        z6 = z;
                                        i6 = i83;
                                        c17571 = c17570;
                                        C16864 c168616 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168616;
                                        while (true) {
                                            C1342[] c1342Arr11 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1012 = i6;
                                            int i1112 = i95;
                                            int i1113 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105111 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105111), false), iM4105111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1114 = i90;
                                            int i1115 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr11;
                                            i86 = i1112;
                                            i93 = i1113;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1114;
                                            i82 = i10;
                                            i83 = i1012;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr11;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 19:
                                    case 20:
                                        abstractC15453.mo26971(c17575.m41071(cArr4, c17575.m41077(i93 + 1)));
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c17576 = c17575;
                                        int i120 = i89;
                                        int[] iArr13 = iArr8;
                                        byte[] bArr3 = bArr2;
                                        int i121 = i82;
                                        int i122 = i96;
                                        int i123 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr12 = c1342Arr6;
                                        boolean z9 = z4;
                                        AbstractC15452 abstractC15454 = abstractC15453;
                                        boolean z10 = z5;
                                        int i124 = i90;
                                        int i125 = i91;
                                        int i126 = iM410512;
                                        c16864 = c168612;
                                        i8 = i126;
                                        c17570 = c17576;
                                        i92 = i92;
                                        i90 = i124;
                                        abstractC15453 = abstractC15454;
                                        i88 = i88;
                                        i96 = i122;
                                        bArr2 = bArr3;
                                        i89 = i120;
                                        c17571 = c17576;
                                        i91 = i125;
                                        z5 = z10;
                                        z4 = z9;
                                        i52 = i123;
                                        c1342Arr6 = c1342Arr12;
                                        i82 = i121;
                                        iArr8 = iArr13;
                                        while (true) {
                                            C1342[] c1342Arr13 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1013 = i6;
                                            int i1116 = i95;
                                            int i1117 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105112 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105112), false), iM4105112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1118 = i90;
                                            int i1119 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr13;
                                            i86 = i1116;
                                            i93 = i1117;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1118;
                                            i82 = i10;
                                            i83 = i1013;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr13;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case 169:
                                        z = z;
                                        i83 = i83;
                                        abstractC15453.mo28295(i107, bArr2[i93 + 1] & 255);
                                        i7 = i93 + 2;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c17577 = c17575;
                                        int i127 = i89;
                                        int[] iArr14 = iArr8;
                                        byte[] bArr4 = bArr2;
                                        int i128 = i82;
                                        int i129 = i96;
                                        int i1210 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr14 = c1342Arr6;
                                        boolean z11 = z4;
                                        AbstractC15452 abstractC15455 = abstractC15453;
                                        boolean z12 = z5;
                                        int i1211 = i90;
                                        int i1212 = i91;
                                        int i1213 = iM410512;
                                        c16864 = c168612;
                                        i8 = i1213;
                                        c17570 = c17577;
                                        i92 = i92;
                                        i90 = i1211;
                                        abstractC15453 = abstractC15455;
                                        i88 = i88;
                                        i96 = i129;
                                        bArr2 = bArr4;
                                        i89 = i127;
                                        c17571 = c17577;
                                        i91 = i1212;
                                        z5 = z12;
                                        z4 = z11;
                                        i52 = i1210;
                                        c1342Arr6 = c1342Arr14;
                                        i82 = i128;
                                        iArr8 = iArr14;
                                        while (true) {
                                            C1342[] c1342Arr15 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1014 = i6;
                                            int i11110 = i95;
                                            int i11111 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105113 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105113), false), iM4105113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11112 = i90;
                                            int i11113 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr15;
                                            i86 = i11110;
                                            i93 = i11111;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i11113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11112;
                                            i82 = i10;
                                            i83 = i1014;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr15;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                        int i130 = i107 - 26;
                                        abstractC15453.mo28295((i130 >> 2) + 21, i130 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c17578 = c17575;
                                        int i1214 = i89;
                                        int[] iArr15 = iArr8;
                                        byte[] bArr5 = bArr2;
                                        int i1215 = i82;
                                        int i1216 = i96;
                                        int i1217 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr16 = c1342Arr6;
                                        boolean z13 = z4;
                                        AbstractC15452 abstractC15456 = abstractC15453;
                                        boolean z14 = z5;
                                        int i1218 = i90;
                                        int i1219 = i91;
                                        int i12110 = iM410512;
                                        c16864 = c168612;
                                        i8 = i12110;
                                        c17570 = c17578;
                                        i92 = i92;
                                        i90 = i1218;
                                        abstractC15453 = abstractC15456;
                                        i88 = i88;
                                        i96 = i1216;
                                        bArr2 = bArr5;
                                        i89 = i1214;
                                        c17571 = c17578;
                                        i91 = i1219;
                                        z5 = z14;
                                        z4 = z13;
                                        i52 = i1217;
                                        c1342Arr6 = c1342Arr16;
                                        i82 = i1215;
                                        iArr8 = iArr15;
                                        while (true) {
                                            C1342[] c1342Arr17 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1015 = i6;
                                            int i11114 = i95;
                                            int i11115 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105114 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105114), false), iM4105114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11116 = i90;
                                            int i11117 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr17;
                                            i86 = i11114;
                                            i93 = i11115;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i11117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11116;
                                            i82 = i10;
                                            i83 = i1015;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr17;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                        int i131 = i107 - 59;
                                        abstractC15453.mo28295((i131 >> 2) + 54, i131 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c17579 = c17575;
                                        int i12111 = i89;
                                        int[] iArr16 = iArr8;
                                        byte[] bArr6 = bArr2;
                                        int i12112 = i82;
                                        int i12113 = i96;
                                        int i12114 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr18 = c1342Arr6;
                                        boolean z15 = z4;
                                        AbstractC15452 abstractC15457 = abstractC15453;
                                        boolean z16 = z5;
                                        int i12115 = i90;
                                        int i12116 = i91;
                                        int i12117 = iM410512;
                                        c16864 = c168612;
                                        i8 = i12117;
                                        c17570 = c17579;
                                        i92 = i92;
                                        i90 = i12115;
                                        abstractC15453 = abstractC15457;
                                        i88 = i88;
                                        i96 = i12113;
                                        bArr2 = bArr6;
                                        i89 = i12111;
                                        c17571 = c17579;
                                        i91 = i12116;
                                        z5 = z16;
                                        z4 = z15;
                                        i52 = i12114;
                                        c1342Arr6 = c1342Arr18;
                                        i82 = i12112;
                                        iArr8 = iArr16;
                                        while (true) {
                                            C1342[] c1342Arr19 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1016 = i6;
                                            int i11118 = i95;
                                            int i11119 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105115 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105115), false), iM4105115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111110 = i90;
                                            int i111111 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr19;
                                            i86 = i11118;
                                            i93 = i11119;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111110;
                                            i82 = i10;
                                            i83 = i1016;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr19;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 132:
                                        abstractC15453.mo28280(bArr2[i93 + 1] & 255, bArr2[i93 + 2]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c175710 = c17575;
                                        int i12118 = i89;
                                        int[] iArr17 = iArr8;
                                        byte[] bArr7 = bArr2;
                                        int i12119 = i82;
                                        int i121110 = i96;
                                        int i121111 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr110 = c1342Arr6;
                                        boolean z17 = z4;
                                        AbstractC15452 abstractC15458 = abstractC15453;
                                        boolean z18 = z5;
                                        int i121112 = i90;
                                        int i121113 = i91;
                                        int i121114 = iM410512;
                                        c16864 = c168612;
                                        i8 = i121114;
                                        c17570 = c175710;
                                        i92 = i92;
                                        i90 = i121112;
                                        abstractC15453 = abstractC15458;
                                        i88 = i88;
                                        i96 = i121110;
                                        bArr2 = bArr7;
                                        i89 = i12118;
                                        c17571 = c175710;
                                        i91 = i121113;
                                        z5 = z18;
                                        z4 = z17;
                                        i52 = i121111;
                                        c1342Arr6 = c1342Arr110;
                                        i82 = i12119;
                                        iArr8 = iArr17;
                                        while (true) {
                                            C1342[] c1342Arr111 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1017 = i6;
                                            int i111112 = i95;
                                            int i111113 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105116 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105116), false), iM4105116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111114 = i90;
                                            int i111115 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr111;
                                            i86 = i111112;
                                            i93 = i111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111114;
                                            i82 = i10;
                                            i83 = i1017;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 153:
                                    case EnumC17734.f54268 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 198:
                                    case 199:
                                        abstractC15453.mo28282(i107, c1342Arr6[c17575.m41078(i93 + 1) + i106]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c175711 = c17575;
                                        int i121115 = i89;
                                        int[] iArr18 = iArr8;
                                        byte[] bArr8 = bArr2;
                                        int i121116 = i82;
                                        int i121117 = i96;
                                        int i121118 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr112 = c1342Arr6;
                                        boolean z19 = z4;
                                        AbstractC15452 abstractC15459 = abstractC15453;
                                        boolean z110 = z5;
                                        int i121119 = i90;
                                        int i1211110 = i91;
                                        int i1211111 = iM410512;
                                        c16864 = c168612;
                                        i8 = i1211111;
                                        c17570 = c175711;
                                        i92 = i92;
                                        i90 = i121119;
                                        abstractC15453 = abstractC15459;
                                        i88 = i88;
                                        i96 = i121117;
                                        bArr2 = bArr8;
                                        i89 = i121115;
                                        c17571 = c175711;
                                        i91 = i1211110;
                                        z5 = z110;
                                        z4 = z19;
                                        i52 = i121118;
                                        c1342Arr6 = c1342Arr112;
                                        i82 = i121116;
                                        iArr8 = iArr18;
                                        while (true) {
                                            C1342[] c1342Arr113 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1018 = i6;
                                            int i111116 = i95;
                                            int i111117 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105117 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105117), false), iM4105117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111118 = i90;
                                            int i111119 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr113;
                                            i86 = i111116;
                                            i93 = i111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111118;
                                            i82 = i10;
                                            i83 = i1018;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr113;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 170:
                                        z = z;
                                        i83 = i83;
                                        int i132 = (4 - (i106 & 3)) + i93;
                                        C1342 c1349 = c1342Arr6[c17575.m41073(i132) + i106];
                                        int iM410729 = c17575.m41073(i132 + 4);
                                        int iM410730 = c17575.m41073(i132 + 8);
                                        i7 = i132 + 12;
                                        int i133 = (iM410730 - iM410729) + 1;
                                        C1342[] c1342Arr20 = new C1342[i133];
                                        for (int i134 = 0; i134 < i133; i134++) {
                                            c1342Arr20[i134] = c1342Arr6[c17575.m41073(i7) + i106];
                                            i7 += 4;
                                        }
                                        abstractC15453.mo28281(iM410729, iM410730, c1349, c1342Arr20);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c175712 = c17575;
                                        int i1211112 = i89;
                                        int[] iArr19 = iArr8;
                                        byte[] bArr9 = bArr2;
                                        int i1211113 = i82;
                                        int i1211114 = i96;
                                        int i1211115 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr114 = c1342Arr6;
                                        boolean z111 = z4;
                                        AbstractC15452 abstractC154510 = abstractC15453;
                                        boolean z112 = z5;
                                        int i1211116 = i90;
                                        int i1211117 = i91;
                                        int i1211118 = iM410512;
                                        c16864 = c168612;
                                        i8 = i1211118;
                                        c17570 = c175712;
                                        i92 = i92;
                                        i90 = i1211116;
                                        abstractC15453 = abstractC154510;
                                        i88 = i88;
                                        i96 = i1211114;
                                        bArr2 = bArr9;
                                        i89 = i1211112;
                                        c17571 = c175712;
                                        i91 = i1211117;
                                        z5 = z112;
                                        z4 = z111;
                                        i52 = i1211115;
                                        c1342Arr6 = c1342Arr114;
                                        i82 = i1211113;
                                        iArr8 = iArr19;
                                        while (true) {
                                            C1342[] c1342Arr115 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1019 = i6;
                                            int i1111110 = i95;
                                            int i1111111 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105118 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105118), false), iM4105118 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111112 = i90;
                                            int i1111113 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr115;
                                            i86 = i1111110;
                                            i93 = i1111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111112;
                                            i82 = i10;
                                            i83 = i1019;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr115;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 171:
                                        z = z;
                                        i83 = i83;
                                        int i135 = (4 - (i106 & 3)) + i93;
                                        C1342 c13410 = c1342Arr6[c17575.m41073(i135) + i106];
                                        int iM410731 = c17575.m41073(i135 + 4);
                                        i7 = i135 + 8;
                                        int[] iArr20 = new int[iM410731];
                                        C1342[] c1342Arr21 = new C1342[iM410731];
                                        for (int i136 = 0; i136 < iM410731; i136++) {
                                            iArr20[i136] = c17575.m41073(i7);
                                            c1342Arr21[i136] = c1342Arr6[c17575.m41073(i7 + 4) + i106];
                                            i7 += 8;
                                        }
                                        abstractC15453.mo28285(c13410, iArr20, c1342Arr21);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C17570 c175713 = c17575;
                                        int i1211119 = i89;
                                        int[] iArr110 = iArr8;
                                        byte[] bArr10 = bArr2;
                                        int i12111110 = i82;
                                        int i12111111 = i96;
                                        int i12111112 = i52;
                                        i95 = i95;
                                        C1342[] c1342Arr116 = c1342Arr6;
                                        boolean z113 = z4;
                                        AbstractC15452 abstractC154511 = abstractC15453;
                                        boolean z114 = z5;
                                        int i12111113 = i90;
                                        int i12111114 = i91;
                                        int i12111115 = iM410512;
                                        c16864 = c168612;
                                        i8 = i12111115;
                                        c17570 = c175713;
                                        i92 = i92;
                                        i90 = i12111113;
                                        abstractC15453 = abstractC154511;
                                        i88 = i88;
                                        i96 = i12111111;
                                        bArr2 = bArr10;
                                        i89 = i1211119;
                                        c17571 = c175713;
                                        i91 = i12111114;
                                        z5 = z114;
                                        z4 = z113;
                                        i52 = i12111112;
                                        c1342Arr6 = c1342Arr116;
                                        i82 = i12111110;
                                        iArr8 = iArr110;
                                        while (true) {
                                            C1342[] c1342Arr117 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10110 = i6;
                                            int i1111114 = i95;
                                            int i1111115 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM4105119 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM4105119), false), iM4105119 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111116 = i90;
                                            int i1111117 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr117;
                                            i86 = i1111114;
                                            i93 = i1111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111116;
                                            i82 = i10;
                                            i83 = i10110;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr117;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 178:
                                    case 179:
                                    case 180:
                                    case 181:
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        z2 = z;
                                        i9 = i83;
                                        int i137 = iArr8[c17575.m41077(i93 + 1)];
                                        int i138 = iArr8[c17575.m41077(i137 + 2)];
                                        String strM41068 = c17575.m41068(cArr4, i137);
                                        String strM41078 = c17575.m41074(cArr4, i138);
                                        String strM41079 = c17575.m41074(cArr4, i138 + 2);
                                        if (i107 < 182) {
                                            abstractC15453.mo26972(strM41068, i107, strM41078, strM41079);
                                        } else {
                                            abstractC15453.mo12089(i107, strM41068, strM41078, strM41079, bArr2[i137 + (-1)] == 11);
                                        }
                                        i5 = i107 == 185 ? i93 + 5 : i93 + 3;
                                        z = z2;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c168617 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168617;
                                        while (true) {
                                            C1342[] c1342Arr118 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10111 = i6;
                                            int i1111118 = i95;
                                            int i1111119 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051110 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051110), false), iM41051110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111110 = i90;
                                            int i11111111 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr118;
                                            i86 = i1111118;
                                            i93 = i1111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i11111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111110;
                                            i82 = i10;
                                            i83 = i10111;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr118;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 186:
                                        int i139 = iArr8[c17575.m41077(i93 + 1)];
                                        int i140 = iArr8[c17575.m41077(i139 + 2)];
                                        String strM410710 = c17575.m41074(cArr4, i140);
                                        String strM410711 = c17575.m41074(cArr4, i140 + 2);
                                        int i141 = c17575.f53688[c17575.m41077(i139)];
                                        C0636 c0636 = (C0636) c17575.m41071(cArr4, c17575.m41077(i141));
                                        int iM410732 = c17575.m41077(i141 + 2);
                                        Object[] objArr2 = new Object[iM410732];
                                        int i142 = i141 + 4;
                                        z2 = z;
                                        int i143 = 0;
                                        while (i143 < iM410732) {
                                            objArr2[i143] = c17575.m41071(cArr4, c17575.m41077(i142));
                                            i142 += 2;
                                            i143++;
                                            i83 = i83;
                                        }
                                        i9 = i83;
                                        abstractC15453.mo26974(strM410710, strM410711, c0636, objArr2);
                                        z = z2;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c168618 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168618;
                                        while (true) {
                                            C1342[] c1342Arr119 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10112 = i6;
                                            int i11111112 = i95;
                                            int i11111113 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051111 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051111), false), iM41051111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111114 = i90;
                                            int i11111115 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr119;
                                            i86 = i11111112;
                                            i93 = i11111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i11111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111114;
                                            i82 = i10;
                                            i83 = i10112;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr119;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 187:
                                    case 189:
                                    case 192:
                                    case 193:
                                        abstractC15453.mo26978(i107, c17575.m41068(cArr4, i93 + 1));
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c168619 = c168612;
                                        i8 = iM410512;
                                        c16864 = c168619;
                                        while (true) {
                                            C1342[] c1342Arr1110 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10113 = i6;
                                            int i11111116 = i95;
                                            int i11111117 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051112 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051112), false), iM41051112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111118 = i90;
                                            int i11111119 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1110;
                                            i86 = i11111116;
                                            i93 = i11111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i11111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111118;
                                            i82 = i10;
                                            i83 = i10113;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1110;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 196:
                                        int i144 = bArr2[i93 + 1] & 255;
                                        if (i144 == 132) {
                                            abstractC15453.mo28280(c17575.m41077(i93 + 2), c17575.m41078(i93 + 4));
                                            i5 = i93 + 6;
                                        } else {
                                            abstractC15453.mo28295(i144, c17575.m41077(i93 + 2));
                                            i5 = i93 + 4;
                                        }
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c1686110 = c168612;
                                        i8 = iM410512;
                                        c16864 = c1686110;
                                        while (true) {
                                            C1342[] c1342Arr1111 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10114 = i6;
                                            int i111111110 = i95;
                                            int i111111111 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051113 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051113), false), iM41051113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111112 = i90;
                                            int i111111113 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1111;
                                            i86 = i111111110;
                                            i93 = i111111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i111111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111112;
                                            i82 = i10;
                                            i83 = i10114;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 197:
                                        abstractC15453.mo26970(bArr2[i93 + 3] & 255, c17575.m41068(cArr4, i93 + 1));
                                        i5 = i93 + 4;
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c1686111 = c168612;
                                        i8 = iM410512;
                                        c16864 = c1686111;
                                        while (true) {
                                            C1342[] c1342Arr1112 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10115 = i6;
                                            int i111111114 = i95;
                                            int i111111115 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051114 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051114), false), iM41051114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111116 = i90;
                                            int i111111117 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1112;
                                            i86 = i111111114;
                                            i93 = i111111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i111111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111116;
                                            i82 = i10;
                                            i83 = i10115;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1112;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 200:
                                    case 201:
                                        abstractC15453.mo28282(i107 - i83, c1342Arr6[c17575.m41073(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c1686112 = c168612;
                                        i8 = iM410512;
                                        c16864 = c1686112;
                                        while (true) {
                                            C1342[] c1342Arr1113 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10116 = i6;
                                            int i111111118 = i95;
                                            int i111111119 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051115 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051115), false), iM41051115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111110 = i90;
                                            int i1111111111 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1113;
                                            i86 = i111111118;
                                            i93 = i111111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111110;
                                            i82 = i10;
                                            i83 = i10116;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1113;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                    case 208:
                                    case 209:
                                    case 210:
                                    case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                                    case 212:
                                    case 213:
                                    case 214:
                                    case 215:
                                    case 216:
                                    case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                                    case 218:
                                    case 219:
                                        int i145 = i107 < 218 ? i107 - 49 : i107 - 20;
                                        C1342 c13411 = c1342Arr6[c17575.m41077(i93 + 1) + i106];
                                        if (i145 == 167 || i145 == 168) {
                                            abstractC15453.mo28282(i145 + 33, c13411);
                                        } else {
                                            abstractC15453.mo28282(i145 < 167 ? ((i145 + 1) ^ 1) - 1 : i145 ^ 1, m41064(i106 + 3, c1342Arr6));
                                            abstractC15453.mo28282(200, c13411);
                                            z = true;
                                        }
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c1686113 = c168612;
                                        i8 = iM410512;
                                        c16864 = c1686113;
                                        while (true) {
                                            C1342[] c1342Arr1114 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10117 = i6;
                                            int i1111111112 = i95;
                                            int i1111111113 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051116 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051116), false), iM41051116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111114 = i90;
                                            int i1111111115 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1114;
                                            i86 = i1111111112;
                                            i93 = i1111111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111114;
                                            i82 = i10;
                                            i83 = i10117;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1114;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 220:
                                        abstractC15453.mo28282(200, c1342Arr6[c17575.m41073(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        z = true;
                                        i9 = i83;
                                        z6 = z;
                                        c17570 = c17575;
                                        i6 = i9;
                                        c17571 = c17570;
                                        C16864 c1686114 = c168612;
                                        i8 = iM410512;
                                        c16864 = c1686114;
                                        while (true) {
                                            C1342[] c1342Arr1115 = c1342Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10118 = i6;
                                            int i1111111116 = i95;
                                            int i1111111117 = i5;
                                            iM41057 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM41057 == i106) {
                                                    int iM41051117 = c17570.m41059(c9104, iArr12[i10]);
                                                    c17570.m41061(abstractC15453.mo26965(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, iM41051117), false), iM41051117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM41057 = c17570.m41057(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111118 = i90;
                                            int i1111111119 = i88;
                                            c168612 = c16864;
                                            c17573 = c17570;
                                            iM410512 = iM41057;
                                            i91 = i91;
                                            z5 = z5;
                                            c1342Arr6 = c1342Arr1115;
                                            i86 = i1111111116;
                                            i93 = i1111111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c17574 = c17571;
                                            i88 = i1111111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111118;
                                            i82 = i10;
                                            i83 = i10118;
                                            c16864 = c16864;
                                            i8 = i8;
                                            c17570 = c17570;
                                            i92 = i92;
                                            i90 = iM410517;
                                            abstractC15453 = abstractC15453;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c17571 = c17571;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c1342Arr6 = c1342Arr1115;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            }
                            int i146 = i91;
                            int i147 = i85;
                            int i148 = i84;
                            char[] cArr6 = cArr4;
                            int[] iArr21 = iArr11;
                            int[] iArr22 = iArr12;
                            C1342 c13412 = c1342Arr6[i77];
                            if (c13412 != null) {
                                abstractC15453.mo28284(c13412);
                            }
                            if (i92 != 0 && (c9104.f27581 & 2) == 0) {
                                if (i146 != 0) {
                                    int iM410733 = c17573.m41077(i146) * 3;
                                    iArr = new int[iM410733];
                                    int i149 = i146 + 2;
                                    while (iM410733 > 0) {
                                        iArr[iM410733 - 1] = i149 + 6;
                                        iArr[iM410733 - 2] = c17573.m41077(i149 + 8);
                                        iM410733 -= 3;
                                        iArr[iM410733] = c17573.m41077(i149);
                                        i149 += 10;
                                    }
                                } else {
                                    iArr = null;
                                }
                                int iM410734 = c17573.m41077(i92);
                                int i150 = i92 + 2;
                                while (true) {
                                    int i151 = iM410734 - 1;
                                    if (iM410734 > 0) {
                                        int iM410735 = c17573.m41077(i150);
                                        int iM410736 = c17573.m41077(i150 + 2);
                                        String strM410712 = c17573.m41074(cArr6, i150 + 4);
                                        String strM410713 = c17573.m41074(cArr6, i150 + 6);
                                        int iM410737 = c17573.m41077(i150 + 8);
                                        i150 += 10;
                                        if (iArr == null) {
                                            strM41074 = null;
                                            break;
                                            break;
                                        }
                                        int i152 = 0;
                                        while (true) {
                                            if (i152 >= iArr.length) {
                                                strM41074 = null;
                                                break;
                                            }
                                            if (iArr[i152] == iM410735 && iArr[i152 + 1] == iM410737) {
                                                strM41074 = c17573.m41074(cArr6, iArr[i152 + 2]);
                                                break;
                                            }
                                            i152 += 3;
                                        }
                                        abstractC15453.mo26973(strM410712, strM410713, strM41074, c1342Arr6[iM410735], c1342Arr6[iM410735 + iM410736], iM410737);
                                        iM410734 = i151;
                                        c17573 = c17573;
                                    }
                                }
                            }
                            C17570 c175714 = c17573;
                            if (iArr21 != null) {
                                for (int i153 : iArr21) {
                                    int iM41071 = c175714.m41070(i153);
                                    if (iM41071 == 64 || iM41071 == 65) {
                                        int iM410520 = c175714.m41059(c9104, i153);
                                        c175714.m41061(abstractC15453.mo26966(c9104.f27580, c9104.f27585, c9104.f27591, c9104.f27588, c9104.f27587, c175714.m41074(cArr6, iM410520), true), iM410520 + 2, true, cArr6);
                                    }
                                }
                            }
                            if (iArr22 != null) {
                                for (int i154 : iArr22) {
                                    int iM41072 = c175714.m41070(i154);
                                    if (iM41072 == 64 || iM41072 == 65) {
                                        int iM410521 = c175714.m41059(c9104, i154);
                                        c175714.m41061(abstractC15453.mo26966(c9104.f27580, c9104.f27585, c9104.f27591, c9104.f27588, c9104.f27587, c175714.m41074(cArr6, iM410521), false), iM410521 + 2, true, cArr6);
                                    }
                                }
                            }
                            C16864 c168620 = c168612;
                            while (c168620 != null) {
                                C16864 c168621 = c168620.f51744;
                                c168620.f51744 = null;
                                abstractC15453.mo28288(c168620);
                                c168620 = c168621;
                            }
                            abstractC15453.mo28294(i148, i147);
                            abstractC15452 = abstractC15453;
                            i4 = i89;
                        }
                    }
                }
            }
        } else {
            abstractC15452 = abstractC15452Mo18880;
            i4 = i30;
        }
        abstractC15452.mo28293();
        return i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1342 m41064(int i, C1342[] c1342Arr) {
        if (c1342Arr[i] == null) {
            c1342Arr[i] = new C1342();
        }
        C1342 c1342 = c1342Arr[i];
        c1342.f4880 = (short) (c1342.f4880 & (-2));
        return c1342;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int[] m41067(AbstractC15452 abstractC15452, C9104 c9104, int i, boolean z) {
        int i2;
        char[] cArr = c9104.f27589;
        int iM41077 = m41077(i);
        int[] iArr = new int[iM41077];
        int iM41061 = i + 2;
        for (int i3 = 0; i3 < iM41077; i3++) {
            iArr[i3] = iM41061;
            int iM41073 = m41073(iM41061);
            int i4 = iM41073 >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int iM41078 = m41077(iM41061 + 1);
                                i2 = iM41061 + 3;
                                while (true) {
                                    int i5 = iM41078 - 1;
                                    if (iM41078 > 0) {
                                        int iM41079 = m41077(i2);
                                        int iM410710 = m41077(i2 + 2);
                                        i2 += 6;
                                        m41064(iM41079, c9104.f27595);
                                        m41064(iM41079 + iM410710, c9104.f27595);
                                        iM41078 = i5;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = iM41061 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iM41061 + 3;
                        break;
                }
            } else {
                i2 = iM41061 + 3;
            }
            int iM41070 = m41070(i2);
            if (i4 == 66) {
                C23214 c23214 = iM41070 != 0 ? new C23214(this.f53689, i2) : null;
                int iM51496 = C23202.m51496(iM41070, 2, 1, i2);
                iM41061 = m41061(abstractC15452.mo26976(iM41073 & (-256), c23214, m41074(cArr, iM51496), z), iM51496 + 2, true, cArr);
            } else {
                iM41061 = m41061((AbstractC14104) null, C23202.m51496(iM41070, 2, 3, i2), true, cArr);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41057(int i, int[] iArr) {
        if (iArr == null || i >= iArr.length || m41070(iArr[i]) < 67) {
            return -1;
        }
        return m41077(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41059(C9104 c9104, int i) {
        int i2;
        int i3;
        int iM41073 = m41073(i);
        int i4 = iM41073 >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iM41073 & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM41073 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = iM41073 & (-65536);
                    i3 = i + 2;
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iM41073 & (-16777216);
                            int iM41077 = m41077(i + 1);
                            i3 = i + 3;
                            c9104.f27591 = new C1342[iM41077];
                            c9104.f27588 = new C1342[iM41077];
                            c9104.f27587 = new int[iM41077];
                            for (int i5 = 0; i5 < iM41077; i5++) {
                                int iM41078 = m41077(i3);
                                int iM41079 = m41077(i3 + 2);
                                int iM410710 = m41077(i3 + 4);
                                i3 += 6;
                                c9104.f27591[i5] = m41064(iM41078, c9104.f27595);
                                c9104.f27588[i5] = m41064(iM41078 + iM41079, c9104.f27595);
                                c9104.f27587[i5] = iM410710;
                            }
                            break;
                        case 66:
                            i2 = iM41073 & (-256);
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iM41073 & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iM41073 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = iM41073 & (-65536);
            i3 = i + 2;
        }
        c9104.f27580 = i2;
        int iM41070 = m41070(i3);
        c9104.f27585 = iM41070 == 0 ? null : new C23214(this.f53689, i3);
        return (iM41070 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41066(AbstractC15452 abstractC15452, C9104 c9104, int i, boolean z) {
        int iM41061 = i + 1;
        int i2 = this.f53689[i] & 255;
        abstractC15452.mo28283(i2, z);
        char[] cArr = c9104.f27589;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM41077 = m41077(iM41061);
            iM41061 += 2;
            while (true) {
                int i4 = iM41077 - 1;
                if (iM41077 > 0) {
                    iM41061 = m41061(abstractC15452.mo26964(i3, m41074(cArr, iM41061), z), iM41061 + 2, true, cArr);
                    iM41077 = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41061(AbstractC14104 abstractC14104, int i, boolean z, char[] cArr) {
        int iM41077 = m41077(i);
        int iM41060 = i + 2;
        if (!z) {
            while (true) {
                int i2 = iM41077 - 1;
                if (iM41077 <= 0) {
                    break;
                }
                iM41060 = m41060(abstractC14104, iM41060, (String) null, cArr);
                iM41077 = i2;
            }
        } else {
            while (true) {
                int i3 = iM41077 - 1;
                if (iM41077 <= 0) {
                    break;
                }
                iM41060 = m41060(abstractC14104, iM41060 + 2, m41074(cArr, iM41060), cArr);
                iM41077 = i3;
            }
        }
        if (abstractC14104 != null) {
            abstractC14104.mo20790();
        }
        return iM41060;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41060(AbstractC14104 abstractC14104, int i, String str, char[] cArr) {
        Object obj;
        byte[] bArr = this.f53689;
        int i2 = 0;
        if (abstractC14104 == null) {
            int i3 = bArr[i] & 255;
            if (i3 == 64) {
                return m41061((AbstractC14104) null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return m41061((AbstractC14104) null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                int[] iArr = this.f53692;
                if (i5 == 83) {
                    abstractC14104.mo20792(Short.valueOf((short) m41073(iArr[m41077(i4)])), str);
                    return i + 3;
                }
                if (i5 == 99) {
                    abstractC14104.mo20792(C11926.m29091(m41074(cArr, i4)), str);
                    return i + 3;
                }
                if (i5 == 101) {
                    abstractC14104.mo20793(str, m41074(cArr, i4), m41074(cArr, i + 3));
                    return i + 5;
                }
                if (i5 == 115) {
                    abstractC14104.mo20792(m41074(cArr, i4), str);
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (m41073(iArr[m41077(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        abstractC14104.mo20792(obj, str);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                abstractC14104.mo20792(Byte.valueOf((byte) m41073(iArr[m41077(i4)])), str);
                                return i + 3;
                            case 67:
                                abstractC14104.mo20792(Character.valueOf((char) m41073(iArr[m41077(i4)])), str);
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int iM41077 = m41077(i4);
                        int i6 = i + 3;
                        if (iM41077 == 0) {
                            return m41061(abstractC14104.mo20788(str), i4, false, cArr);
                        }
                        int i7 = bArr[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[iM41077];
                            while (i2 < iM41077) {
                                fArr[i2] = Float.intBitsToFloat(m41073(iArr[m41077(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(fArr, str);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[iM41077];
                            while (i2 < iM41077) {
                                sArr[i2] = (short) m41073(iArr[m41077(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(sArr, str);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[iM41077];
                            for (int i8 = 0; i8 < iM41077; i8++) {
                                zArr[i8] = m41073(iArr[m41077(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            abstractC14104.mo20792(zArr, str);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr2 = new int[iM41077];
                            while (i2 < iM41077) {
                                iArr2[i2] = m41073(iArr[m41077(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(iArr2, str);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr2 = new byte[iM41077];
                                    while (i2 < iM41077) {
                                        bArr2[i2] = (byte) m41073(iArr[m41077(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(bArr2, str);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[iM41077];
                                    while (i2 < iM41077) {
                                        cArr2[i2] = (char) m41073(iArr[m41077(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(cArr2, str);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[iM41077];
                                    while (i2 < iM41077) {
                                        dArr[i2] = Double.longBitsToDouble(m41075(iArr[m41077(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(dArr, str);
                                    return i6;
                                default:
                                    return m41061(abstractC14104.mo20788(str), i4, false, cArr);
                            }
                        }
                        long[] jArr = new long[iM41077];
                        while (i2 < iM41077) {
                            jArr[i2] = m41075(iArr[m41077(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        abstractC14104.mo20792(jArr, str);
                        return i6;
                    }
                }
            }
            abstractC14104.mo20792(m41071(cArr, m41077(i4)), str);
            return i + 3;
        }
        return m41061(abstractC14104.mo20789(str, m41074(cArr, i4)), i + 3, true, cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41058(int i, Object[] objArr, int i2, char[] cArr, C1342[] c1342Arr) {
        int i3 = i + 1;
        switch (this.f53689[i] & 255) {
            case 0:
                objArr[i2] = 0;
                return i3;
            case 1:
                objArr[i2] = 1;
                return i3;
            case 2:
                objArr[i2] = 2;
                return i3;
            case 3:
                objArr[i2] = 3;
                return i3;
            case 4:
                objArr[i2] = 4;
                return i3;
            case 5:
                objArr[i2] = 5;
                return i3;
            case 6:
                objArr[i2] = 6;
                return i3;
            case 7:
                objArr[i2] = m41068(cArr, i3);
                break;
            case 8:
                objArr[i2] = m41064(m41077(i3), c1342Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41069() {
        int i = this.f53690;
        int iM41077 = (m41077(i + 6) * 2) + i + 8;
        int iM41078 = m41077(iM41077);
        int iM41073 = iM41077 + 2;
        while (true) {
            int i2 = iM41078 - 1;
            if (iM41078 <= 0) {
                break;
            }
            int iM41079 = m41077(iM41073 + 6);
            iM41073 += 8;
            while (true) {
                int i3 = iM41079 - 1;
                if (iM41079 > 0) {
                    iM41073 += m41073(iM41073 + 2) + 6;
                    iM41079 = i3;
                }
            }
            iM41078 = i2;
        }
        int iM410710 = m41077(iM41073);
        int iM41074 = iM41073 + 2;
        while (true) {
            int i4 = iM410710 - 1;
            if (iM410710 <= 0) {
                return iM41074 + 2;
            }
            int iM410711 = m41077(iM41074 + 6);
            iM41074 += 8;
            while (true) {
                int i5 = iM410711 - 1;
                if (iM410711 > 0) {
                    iM41074 += m41073(iM41074 + 2) + 6;
                    iM410711 = i5;
                }
            }
            iM410710 = i4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16864 m41065(C16864[] c16864Arr, String str, int i, int i2, char[] cArr, int i3, C1342[] c1342Arr) {
        if (i2 > this.f53689.length - i) {
            throw new IllegalArgumentException();
        }
        for (C16864 c16864 : c16864Arr) {
            if (c16864.f51745.equals(str)) {
                return c16864.m39637(this, i, i2, cArr);
            }
        }
        return new C16864(str).m39637(this, i, i2, (char[]) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41070(int i) {
        return this.f53689[i] & 255;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m41077(int i) {
        byte[] bArr = this.f53689;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short m41078(int i) {
        byte[] bArr = this.f53689;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41073(int i) {
        byte[] bArr = this.f53689;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m41075(int i) {
        return (((long) m41073(i)) << 32) | (((long) m41073(i + 4)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41074(char[] cArr, int i) {
        int iM41077 = m41077(i);
        if (i == 0 || iM41077 == 0) {
            return null;
        }
        return m41076(cArr, iM41077);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m41076(char[] cArr, int i) {
        String[] strArr = this.f53693;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f53692[i];
        String strM41063 = m41063(cArr, i2 + 2, m41077(i2));
        strArr[i] = strM41063;
        return strM41063;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m41063(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f53689;
            byte b = bArr[i];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                cArr[i5] = (char) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                i5++;
                i = i6;
            } else {
                if ((b & bo.k) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & bo.j) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m41068(char[] cArr, int i) {
        return m41074(cArr, this.f53692[m41077(i)]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m41071(char[] cArr, int i) {
        int[] iArr = this.f53692;
        int i2 = iArr[i];
        byte[] bArr = this.f53689;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m41073(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m41073(i2)));
            case 5:
                return Long.valueOf(m41075(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m41075(i2)));
            case 7:
                return C11926.m29095(m41074(cArr, i2));
            case 8:
                return m41074(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int iM41070 = m41070(i2);
                        int i3 = iArr[m41077(i2 + 1)];
                        int i4 = iArr[m41077(i3 + 2)];
                        return new C0636(iM41070, m41068(cArr, i3), m41074(cArr, i4), m41074(cArr, i4 + 2), bArr[i3 - 1] == 11);
                    case 16:
                        return C11926.m29096(m41074(cArr, i2));
                    case 17:
                        C21099[] c21099Arr = this.f53691;
                        C21099 c21099 = c21099Arr[i];
                        if (c21099 != null) {
                            return c21099;
                        }
                        int i5 = iArr[m41077(i2 + 2)];
                        String strM41074 = m41074(cArr, i5);
                        String strM41075 = m41074(cArr, i5 + 2);
                        int i6 = this.f53688[m41077(i2)];
                        C0636 c0636 = (C0636) m41071(cArr, m41077(i6));
                        int iM41077 = m41077(i6 + 2);
                        Object[] objArr = new Object[iM41077];
                        int i7 = i6 + 4;
                        for (int i8 = 0; i8 < iM41077; i8++) {
                            objArr[i8] = m41071(cArr, m41077(i7));
                            i7 += 2;
                        }
                        C21099 c210910 = new C21099(strM41074, strM41075, c0636, objArr);
                        c21099Arr[i] = c210910;
                        return c210910;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
