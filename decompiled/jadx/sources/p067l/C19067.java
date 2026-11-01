package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0684bo;
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
public final class C19067 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f56878;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f56879;

    /* JADX INFO: renamed from: ܳ */
    public final int f56880;

    /* JADX INFO: renamed from: ܽ */
    public final C22421[] f56881;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f56882;

    /* JADX INFO: renamed from: ᩳ */
    public final String[] f56883;

    /* JADX INFO: renamed from: ᩻ */
    public final int f56884;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C19067(byte[] bArr, boolean z) {
        int i;
        this.f56879 = bArr;
        if (z && m43324(6) > 70) {
            throw new IllegalArgumentException(C20778.m46922(m43324(6), "Unsupported class file major version "));
        }
        int iM43323 = m43323(8);
        this.f56882 = new int[iM43323];
        this.f56883 = new String[iM43323];
        int i2 = 10;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int iM43324 = 4;
            if (i3 >= iM43323) {
                this.f56884 = i4;
                this.f56880 = i2;
                int[] iArr = null;
                this.f56881 = z2 ? new C22421[iM43323] : null;
                if (z3) {
                    char[] cArr = new char[i4];
                    int iM43315 = m43315();
                    for (int iM43325 = m43323(iM43315 - 2); iM43325 > 0; iM43325--) {
                        String strM43320 = m43320(cArr, iM43315);
                        int iM43319 = m43319(iM43315 + 2);
                        int i5 = iM43315 + 6;
                        if ("BootstrapMethods".equals(strM43320)) {
                            int iM43326 = m43323(i5);
                            int[] iArr2 = new int[iM43326];
                            int iM43327 = iM43315 + 8;
                            for (int i6 = 0; i6 < iM43326; i6++) {
                                iArr2[i6] = iM43327;
                                iM43327 += (m43323(iM43327 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            iM43315 = i5 + iM43319;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f56878 = iArr;
                return;
            }
            int i7 = i3 + 1;
            int i8 = i2 + 1;
            this.f56882[i3] = i8;
            switch (bArr[i2]) {
                case 1:
                    iM43324 = m43323(i8) + 3;
                    if (iM43324 > i4) {
                        i4 = iM43324;
                    }
                    i = iM43324;
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
                    i = iM43324;
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

    public C19067(InputStream inputStream) throws IOException {
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

    /* JADX INFO: renamed from: ֫ */
    public final void m43318(AbstractC25102 abstractC25102, C18396[] c18396Arr, int i) {
        AbstractC25102 abstractC25103;
        int i2;
        String str;
        C11021 c11021;
        String str2;
        String str3;
        String str4;
        String str5;
        C19067 c19067;
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
        C11021 c11022 = new C11021();
        c11022.f30519 = c18396Arr;
        c11022.f30518 = i;
        char[] cArr = new char[this.f56884];
        c11022.f30526 = cArr;
        int i6 = this.f56880;
        int iM43323 = m43323(i6);
        String strM43314 = m43314(cArr, i6 + 2);
        String strM43315 = m43314(cArr, i6 + 4);
        int iM43324 = m43323(i6 + 6);
        String[] strArr3 = new String[iM43324];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < iM43324; i8++) {
            strArr3[i8] = m43314(cArr, i7);
            i7 += 2;
        }
        int iM43315 = m43315();
        String strM43320 = null;
        int iM43325 = m43323(iM43315 - 2);
        String strM43316 = null;
        String strM43317 = null;
        C18396 c18396 = null;
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
        int i19 = iM43323;
        int i20 = 0;
        String strM43321 = null;
        String strM43309 = null;
        while (true) {
            C11021 c11023 = c11022;
            int i21 = i7;
            String str12 = strM43315;
            if (iM43325 > 0) {
                String str13 = strM43316;
                String strM43322 = m43320(cArr, iM43315);
                int i22 = i20;
                int iM43319 = m43319(iM43315 + 2);
                int i23 = iM43315 + 6;
                String str14 = strM43309;
                if ("SourceFile".equals(strM43322)) {
                    strM43321 = m43320(cArr, i23);
                } else if ("InnerClasses".equals(strM43322)) {
                    i16 = i23;
                } else if ("EnclosingMethod".equals(strM43322)) {
                    i9 = i23;
                } else if ("NestHost".equals(strM43322)) {
                    strM43317 = m43314(cArr, i23);
                } else if ("NestMembers".equals(strM43322)) {
                    i14 = i23;
                } else if ("PermittedSubclasses".equals(strM43322)) {
                    i15 = i23;
                } else if ("Signature".equals(strM43322)) {
                    strM43320 = m43320(cArr, i23);
                } else if ("RuntimeVisibleAnnotations".equals(strM43322)) {
                    i10 = i23;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM43322)) {
                    i12 = i23;
                } else if ("Deprecated".equals(strM43322)) {
                    i19 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                } else if ("Synthetic".equals(strM43322)) {
                    i19 |= 4096;
                } else {
                    if ("SourceDebugExtension".equals(strM43322)) {
                        if (iM43319 > this.f56879.length - i23) {
                            throw new IllegalArgumentException();
                        }
                        strM43309 = m43309(new char[iM43319], i23, iM43319);
                        strM43316 = str13;
                        i4 = i23;
                        i5 = iM43319;
                        i21 = i21;
                        i20 = i22;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM43322)) {
                        i11 = i23;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM43322)) {
                        i13 = i23;
                    } else if ("Record".equals(strM43322)) {
                        i19 |= 65536;
                        i17 = i23;
                    } else if ("Module".equals(strM43322)) {
                        i18 = i23;
                    } else if ("ModuleMainClass".equals(strM43322)) {
                        strM43316 = m43314(cArr, i23);
                        strM43309 = str14;
                        i4 = i23;
                        i5 = iM43319;
                        i21 = i21;
                        i20 = i22;
                    } else if ("ModulePackages".equals(strM43322)) {
                        i22 = i23;
                    } else {
                        if ("BootstrapMethods".equals(strM43322)) {
                            i4 = i23;
                            i5 = iM43319;
                        } else {
                            i4 = i23;
                            i5 = iM43319;
                            C18396 c18396M43311 = m43311(c18396Arr, strM43322, i4, i5, cArr, -1, null);
                            c18396M43311.f54924 = c18396;
                            c18396 = c18396M43311;
                        }
                        strM43316 = str13;
                        strM43309 = str14;
                        i19 = i19;
                        i20 = i22;
                        strM43321 = strM43321;
                    }
                    iM43315 = i4 + i5;
                    iM43325--;
                    i7 = i21;
                    c11022 = c11023;
                    strM43315 = str12;
                }
                strM43316 = str13;
                strM43309 = str14;
                i4 = i23;
                i5 = iM43319;
                i21 = i21;
                i20 = i22;
                iM43315 = i4 + i5;
                iM43325--;
                i7 = i21;
                c11022 = c11023;
                strM43315 = str12;
            } else {
                String str15 = strM43321;
                int i24 = i20;
                int[] iArr = this.f56882;
                String str16 = "Synthetic";
                String str17 = strM43316;
                String str18 = "RuntimeInvisibleAnnotations";
                String str19 = strM43309;
                String str20 = strM43320;
                String str21 = "Deprecated";
                abstractC25102.mo20837(m43319(iArr[1] - 7), i19, strM43314, str20, str12, strArr3);
                String str22 = "RuntimeVisibleTypeAnnotations";
                if ((i & 2) != 0 || (str15 == null && str19 == null)) {
                    abstractC25103 = abstractC25102;
                } else {
                    abstractC25103 = abstractC25102;
                    abstractC25103.mo20840(str15, str19);
                }
                int i25 = i18;
                if (i25 != 0) {
                    c11021 = c11023;
                    char[] cArr2 = c11021.f30526;
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    int i26 = i25 + 6;
                    AbstractC23761 abstractC23761Mo20835 = abstractC25103.mo20835(m43323(i25 + 2), m43314(cArr2, i25), m43320(cArr2, i25 + 4));
                    if (abstractC23761Mo20835 != null) {
                        if (str17 != null) {
                            abstractC23761Mo20835.mo44001(str17);
                        }
                        if (i24 != 0) {
                            int iM43326 = m43323(i24);
                            int i27 = i24 + 2;
                            while (true) {
                                int i28 = iM43326 - 1;
                                if (iM43326 <= 0) {
                                    break;
                                }
                                abstractC23761Mo20835.mo44004(m43314(cArr2, i27));
                                i27 += 2;
                                iM43326 = i28;
                            }
                        }
                        int iM43327 = m43323(i26);
                        int i29 = i25 + 8;
                        while (true) {
                            int i30 = iM43327 - 1;
                            if (iM43327 <= 0) {
                                break;
                            }
                            String strM43318 = m43314(cArr2, i29);
                            int iM43328 = m43323(i29 + 2);
                            String strM43323 = m43320(cArr2, i29 + 4);
                            i29 += 6;
                            abstractC23761Mo20835.mo44000(iM43328, strM43318, strM43323);
                            iM43327 = i30;
                        }
                        int iM43329 = m43323(i29);
                        int i31 = i29 + 2;
                        while (true) {
                            int i32 = iM43329 - 1;
                            if (iM43329 <= 0) {
                                break;
                            }
                            String strM43319 = m43314(cArr2, i31);
                            int iM433210 = m43323(i31 + 2);
                            int iM433211 = m43323(i31 + 4);
                            i31 += 6;
                            if (iM433211 != 0) {
                                strArr2 = new String[iM433211];
                                for (int i33 = 0; i33 < iM433211; i33++) {
                                    strArr2[i33] = m43314(cArr2, i31);
                                    i31 += 2;
                                }
                            } else {
                                strArr2 = null;
                            }
                            abstractC23761Mo20835.mo44002(strM43319, iM433210, strArr2);
                            iM43329 = i32;
                        }
                        int iM433212 = m43323(i31);
                        int i34 = i31 + 2;
                        while (true) {
                            int i35 = iM433212 - 1;
                            if (iM433212 <= 0) {
                                break;
                            }
                            String strM433110 = m43314(cArr2, i34);
                            int iM433213 = m43323(i34 + 2);
                            int iM433214 = m43323(i34 + 4);
                            i34 += 6;
                            if (iM433214 != 0) {
                                strArr = new String[iM433214];
                                for (int i36 = 0; i36 < iM433214; i36++) {
                                    strArr[i36] = m43314(cArr2, i34);
                                    i34 += 2;
                                }
                            } else {
                                strArr = null;
                            }
                            abstractC23761Mo20835.mo44005(strM433110, iM433213, strArr);
                            iM433212 = i35;
                        }
                        int iM433215 = m43323(i34);
                        int i37 = i34 + 2;
                        while (true) {
                            int i38 = iM433215 - 1;
                            if (iM433215 <= 0) {
                                break;
                            }
                            abstractC23761Mo20835.mo44006(m43314(cArr2, i37));
                            i37 += 2;
                            iM433215 = i38;
                        }
                        int iM433216 = m43323(i37);
                        int i39 = i37 + 2;
                        while (true) {
                            int i40 = iM433216 - 1;
                            if (iM433216 <= 0) {
                                break;
                            }
                            String strM433111 = m43314(cArr2, i39);
                            int iM433217 = m43323(i39 + 2);
                            i39 += 4;
                            String[] strArr4 = new String[iM433217];
                            for (int i41 = 0; i41 < iM433217; i41++) {
                                strArr4[i41] = m43314(cArr2, i39);
                                i39 += 2;
                            }
                            abstractC23761Mo20835.mo44003(strM433111, strArr4);
                            iM433216 = i40;
                        }
                        abstractC23761Mo20835.mo49024();
                    }
                } else {
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    c11021 = c11023;
                }
                String str23 = strM43317;
                if (str23 != null) {
                    abstractC25103.mo20838(str23);
                }
                int i42 = i9;
                if (i42 != 0) {
                    String strM433112 = m43314(cArr, i42);
                    int iM433218 = m43323(i42 + 2);
                    abstractC25103.mo20841(strM433112, iM433218 == 0 ? null : m43320(cArr, iArr[iM433218]), iM433218 == 0 ? null : m43320(cArr, iArr[iM433218] + 2));
                }
                int i43 = i10;
                if (i43 != 0) {
                    int iM433219 = m43323(i43);
                    int iM43307 = i43 + 2;
                    while (true) {
                        int i44 = iM433219 - 1;
                        if (iM433219 <= 0) {
                            break;
                        }
                        iM43307 = m43307(abstractC25103.mo20833(m43320(cArr, iM43307), true), iM43307 + 2, true, cArr);
                        iM433219 = i44;
                    }
                }
                int i45 = i11;
                if (i45 != 0) {
                    int iM433220 = m43323(i45);
                    int iM43308 = i45 + 2;
                    while (true) {
                        int i46 = iM433220 - 1;
                        if (iM433220 <= 0) {
                            break;
                        }
                        iM43308 = m43307(abstractC25103.mo20833(m43320(cArr, iM43308), false), iM43308 + 2, true, cArr);
                        iM433220 = i46;
                    }
                }
                int i47 = i12;
                if (i47 != 0) {
                    int iM433221 = m43323(i47);
                    int iM43309 = i47 + 2;
                    while (true) {
                        int i48 = iM433221 - 1;
                        if (iM433221 <= 0) {
                            break;
                        }
                        int iM43305 = m43305(c11021, iM43309);
                        iM43309 = m43307(abstractC25103.mo20832(c11021.f30517, c11021.f30522, m43320(cArr, iM43305), true), iM43305 + 2, true, cArr);
                        iM433221 = i48;
                    }
                }
                int i49 = i13;
                if (i49 != 0) {
                    int iM433222 = m43323(i49);
                    int iM433010 = i49 + 2;
                    while (true) {
                        int i50 = iM433222 - 1;
                        if (iM433222 <= 0) {
                            break;
                        }
                        int iM43306 = m43305(c11021, iM433010);
                        iM433010 = m43307(abstractC25103.mo20832(c11021.f30517, c11021.f30522, m43320(cArr, iM43306), false), iM43306 + 2, true, cArr);
                        iM433222 = i50;
                    }
                }
                C18396 c18397 = c18396;
                while (c18397 != null) {
                    C18396 c18398 = c18397.f54924;
                    c18397.f54924 = null;
                    abstractC25103.mo20842(c18397);
                    c18397 = c18398;
                }
                int i51 = i14;
                if (i51 != 0) {
                    int iM433223 = m43323(i51);
                    int i52 = i51 + 2;
                    while (true) {
                        int i53 = iM433223 - 1;
                        if (iM433223 <= 0) {
                            break;
                        }
                        abstractC25103.mo20844(m43314(cArr, i52));
                        i52 += 2;
                        iM433223 = i53;
                    }
                }
                int i54 = i15;
                if (i54 != 0) {
                    int iM433224 = m43323(i54);
                    int i55 = i54 + 2;
                    while (true) {
                        int i56 = iM433224 - 1;
                        if (iM433224 <= 0) {
                            break;
                        }
                        abstractC25103.mo20846(m43314(cArr, i55));
                        i55 += 2;
                        iM433224 = i56;
                    }
                }
                int i57 = i16;
                if (i57 != 0) {
                    int iM433225 = m43323(i57);
                    int i58 = i57 + 2;
                    while (true) {
                        int i59 = iM433225 - 1;
                        if (iM433225 <= 0) {
                            break;
                        }
                        abstractC25103.mo20839(m43314(cArr, i58), m43323(i58 + 6), m43314(cArr, i58 + 2), m43320(cArr, i58 + 4));
                        i58 += 8;
                        iM433225 = i59;
                    }
                }
                int i60 = i17;
                if (i60 != 0) {
                    int iM433226 = m43323(i60);
                    C19067 c19068 = this;
                    int i61 = i60 + 2;
                    while (true) {
                        int i62 = iM433226 - 1;
                        if (iM433226 <= 0) {
                            break;
                        }
                        char[] cArr3 = c11021.f30526;
                        String strM43324 = c19068.m43320(cArr3, i61);
                        String strM43325 = c19068.m43320(cArr3, i61 + 2);
                        int iM433227 = c19068.m43323(i61 + 4);
                        i61 += 6;
                        String strM43326 = null;
                        C18396 c18399 = null;
                        int i63 = 0;
                        int i64 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        while (true) {
                            int i67 = iM433227 - 1;
                            if (iM433227 <= 0) {
                                break;
                            }
                            String strM43327 = c19068.m43320(cArr3, i61);
                            int i68 = i63;
                            int iM433110 = c19068.m43319(i61 + 2);
                            i63 = i61 + 6;
                            if ("Signature".equals(strM43327)) {
                                strM43326 = c19068.m43320(cArr3, i63);
                            } else if ("RuntimeVisibleAnnotations".equals(strM43327)) {
                                i64 = i63;
                            } else {
                                if (str22.equals(strM43327)) {
                                    i65 = i63;
                                } else if (str18.equals(strM43327)) {
                                    str10 = str;
                                    str11 = str22;
                                } else {
                                    str9 = str;
                                    if (str9.equals(strM43327)) {
                                        i66 = i63;
                                        str10 = str9;
                                        str11 = str22;
                                        i63 = i68;
                                    } else {
                                        str10 = str9;
                                        str11 = str22;
                                        C18396 c18396M43312 = m43311(c11021.f30519, strM43327, i63, iM433110, cArr3, -1, null);
                                        c18396M43312.f54924 = c18399;
                                        c19068 = this;
                                        c18399 = c18396M43312;
                                        i64 = i64;
                                        i63 = i68;
                                    }
                                }
                                i61 = i63 + iM433110;
                                abstractC25103 = abstractC25102;
                                str16 = str16;
                                str22 = str11;
                                iM433227 = i67;
                                str = str10;
                                str18 = str18;
                                i62 = i62;
                            }
                            str9 = str;
                            str10 = str9;
                            str11 = str22;
                            i63 = i68;
                            i61 = i63 + iM433110;
                            abstractC25103 = abstractC25102;
                            str16 = str16;
                            str22 = str11;
                            iM433227 = i67;
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
                        C18396 c183910 = c18399;
                        String str27 = str22;
                        AbstractC25102 abstractC25104 = abstractC25103;
                        AbstractC6997 abstractC6997Mo20843 = abstractC25104.mo20843(strM43324, strM43325, strM43326);
                        if (abstractC6997Mo20843 != null) {
                            if (i70 != 0) {
                                int iM433228 = c19068.m43323(i70);
                                int iM433011 = i70 + 2;
                                while (true) {
                                    int i72 = iM433228 - 1;
                                    if (iM433228 <= 0) {
                                        break;
                                    }
                                    iM433011 = c19068.m43307(abstractC6997Mo20843.mo12602(c19068.m43320(cArr3, iM433011), true), iM433011 + 2, true, cArr3);
                                    iM433228 = i72;
                                }
                            }
                            if (i69 != 0) {
                                int iM433229 = c19068.m43323(i69);
                                int iM433012 = i69 + 2;
                                while (true) {
                                    int i73 = iM433229 - 1;
                                    if (iM433229 <= 0) {
                                        break;
                                    }
                                    iM433012 = c19068.m43307(abstractC6997Mo20843.mo12602(c19068.m43320(cArr3, iM433012), false), iM433012 + 2, true, cArr3);
                                    iM433229 = i73;
                                }
                            }
                            int i74 = i65;
                            if (i74 != 0) {
                                int iM433230 = c19068.m43323(i74);
                                int iM433013 = i74 + 2;
                                while (true) {
                                    int i75 = iM433230 - 1;
                                    if (iM433230 <= 0) {
                                        break;
                                    }
                                    int iM433014 = c19068.m43305(c11021, iM433013);
                                    iM433013 = c19068.m43307(abstractC6997Mo20843.mo12601(c11021.f30517, c11021.f30522, c19068.m43320(cArr3, iM433014), true), iM433014 + 2, true, cArr3);
                                    iM433230 = i75;
                                }
                            }
                            int i76 = i66;
                            if (i76 != 0) {
                                int iM433231 = c19068.m43323(i76);
                                int iM433015 = i76 + 2;
                                while (true) {
                                    int i77 = iM433231 - 1;
                                    if (iM433231 <= 0) {
                                        break;
                                    }
                                    int iM433016 = c19068.m43305(c11021, iM433015);
                                    iM433015 = c19068.m43307(abstractC6997Mo20843.mo12601(c11021.f30517, c11021.f30522, c19068.m43320(cArr3, iM433016), false), iM433016 + 2, true, cArr3);
                                    iM433231 = i77;
                                }
                            }
                            while (c183910 != null) {
                                C18396 c183911 = c183910.f54924;
                                c183910.f54924 = null;
                                abstractC6997Mo20843.mo12605(c183910);
                                c183910 = c183911;
                            }
                            abstractC6997Mo20843.mo12603();
                        }
                        iM433226 = i71;
                        abstractC25103 = abstractC25104;
                        str16 = str26;
                        str22 = str27;
                        str = str25;
                        str18 = str24;
                    }
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c19067 = c19068;
                } else {
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c19067 = this;
                }
                int i78 = i2;
                int iM433232 = c19067.m43323(i78);
                int i79 = i78 + 2;
                while (true) {
                    int i80 = iM433232 - 1;
                    if (iM433232 <= 0) {
                        break;
                    }
                    char[] cArr4 = c11021.f30526;
                    int iM433233 = c19067.m43323(i79);
                    String strM43328 = c19067.m43320(cArr4, i79 + 2);
                    String strM43329 = c19067.m43320(cArr4, i79 + 4);
                    int iM433234 = c19067.m43323(i79 + 6);
                    int i81 = i79 + 8;
                    C18396 c183912 = null;
                    String strM433210 = null;
                    Object objM43317 = null;
                    int i82 = 0;
                    int i83 = 0;
                    int i84 = 0;
                    int i85 = 0;
                    while (true) {
                        int i86 = iM433234 - 1;
                        if (iM433234 <= 0) {
                            break;
                        }
                        String strM433211 = c19067.m43320(cArr4, i81);
                        int i87 = i83;
                        int iM433111 = c19067.m43319(i81 + 2);
                        int i88 = i81 + 6;
                        int i89 = i85;
                        if ("ConstantValue".equals(strM433211)) {
                            int iM433235 = c19067.m43323(i88);
                            objM43317 = iM433235 == 0 ? null : c19067.m43317(cArr4, iM433235);
                            str6 = str21;
                        } else {
                            if ("Signature".equals(strM433211)) {
                                strM433210 = c19067.m43320(cArr4, i88);
                                i3 = i82;
                                str7 = str5;
                            } else {
                                str6 = str21;
                                if (str6.equals(strM433211)) {
                                    iM433233 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                } else {
                                    if (str4.equals(strM433211)) {
                                        iM433233 |= 4096;
                                    } else if ("RuntimeVisibleAnnotations".equals(strM433211)) {
                                        i3 = i82;
                                        str21 = str6;
                                        i84 = i88;
                                        i85 = i89;
                                    } else {
                                        str21 = str6;
                                        str7 = str5;
                                        if (str7.equals(strM433211)) {
                                            i3 = i88;
                                        } else {
                                            str5 = str7;
                                            String str28 = str2;
                                            if (str28.equals(strM433211)) {
                                                str2 = str28;
                                                i89 = i88;
                                                str8 = str3;
                                                i3 = i82;
                                                str3 = str8;
                                                i85 = i89;
                                            } else {
                                                str2 = str28;
                                                str8 = str3;
                                                if (str8.equals(strM433211)) {
                                                    i87 = i88;
                                                    i3 = i82;
                                                    str3 = str8;
                                                    i85 = i89;
                                                } else {
                                                    str3 = str8;
                                                    C18396 c18396M43313 = c19067.m43311(c11021.f30519, strM433211, i88, iM433111, cArr4, -1, null);
                                                    c18396M43313.f54924 = c183912;
                                                    c183912 = c18396M43313;
                                                    i85 = i89;
                                                    i3 = i82;
                                                }
                                            }
                                        }
                                    }
                                    i81 = i88 + iM433111;
                                    i82 = i3;
                                    iM433234 = i86;
                                    i83 = i87;
                                }
                            }
                            str5 = str7;
                            str8 = str3;
                            str3 = str8;
                            i85 = i89;
                            i81 = i88 + iM433111;
                            i82 = i3;
                            iM433234 = i86;
                            i83 = i87;
                        }
                        str21 = str6;
                        str8 = str3;
                        i3 = i82;
                        str3 = str8;
                        i85 = i89;
                        i81 = i88 + iM433111;
                        i82 = i3;
                        iM433234 = i86;
                        i83 = i87;
                    }
                    int i90 = i85;
                    int i91 = i83;
                    AbstractC6327 abstractC6327Mo20831 = abstractC25102.mo20831(iM433233, strM43328, strM43329, strM433210, objM43317);
                    if (abstractC6327Mo20831 != null) {
                        if (i84 != 0) {
                            int iM433236 = c19067.m43323(i84);
                            int iM433017 = i84 + 2;
                            while (true) {
                                int i92 = iM433236 - 1;
                                if (iM433236 <= 0) {
                                    break;
                                }
                                iM433017 = c19067.m43307(abstractC6327Mo20831.mo7677(c19067.m43320(cArr4, iM433017), true), iM433017 + 2, true, cArr4);
                                iM433236 = i92;
                            }
                        }
                        if (i90 != 0) {
                            int iM433237 = c19067.m43323(i90);
                            int iM433018 = i90 + 2;
                            while (true) {
                                int i93 = iM433237 - 1;
                                if (iM433237 <= 0) {
                                    break;
                                }
                                iM433018 = c19067.m43307(abstractC6327Mo20831.mo7677(c19067.m43320(cArr4, iM433018), false), iM433018 + 2, true, cArr4);
                                iM433237 = i93;
                            }
                        }
                        if (i82 != 0) {
                            int i94 = i82;
                            int iM433238 = c19067.m43323(i94);
                            int iM433019 = i94 + 2;
                            while (true) {
                                int i95 = iM433238 - 1;
                                if (iM433238 <= 0) {
                                    break;
                                }
                                int iM433020 = c19067.m43305(c11021, iM433019);
                                iM433019 = c19067.m43307(abstractC6327Mo20831.mo7676(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM433020), true), iM433020 + 2, true, cArr4);
                                iM433238 = i95;
                            }
                        }
                        if (i91 != 0) {
                            int iM433239 = c19067.m43323(i91);
                            int iM433021 = i91 + 2;
                            while (true) {
                                int i96 = iM433239 - 1;
                                if (iM433239 <= 0) {
                                    break;
                                }
                                int iM433022 = c19067.m43305(c11021, iM433021);
                                iM433021 = c19067.m43307(abstractC6327Mo20831.mo7676(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM433022), false), iM433022 + 2, true, cArr4);
                                iM433239 = i96;
                            }
                        }
                        while (c183912 != null) {
                            C18396 c183913 = c183912.f54924;
                            c183912.f54924 = null;
                            abstractC6327Mo20831.mo14474(c183912);
                            c183912 = c183913;
                        }
                        abstractC6327Mo20831.mo14473();
                    }
                    iM433232 = i80;
                    i79 = i81;
                }
                int iM433240 = c19067.m43323(i79);
                int iM433023 = i79 + 2;
                while (true) {
                    int i97 = iM433240 - 1;
                    if (iM433240 <= 0) {
                        abstractC25102.mo20836();
                        return;
                    } else {
                        iM433023 = c19067.m43308(abstractC25102, c11021, iM433023);
                        iM433240 = i97;
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
    /* JADX INFO: renamed from: ֫ */
    private int m43308(AbstractC25102 abstractC25102, C11021 c11021, int i) {
        int i2;
        String str;
        int i3;
        AbstractC17054 abstractC17054;
        int i4;
        int[] iArr;
        String strM43320;
        boolean z;
        int i5;
        C19067 c19067;
        int i6;
        C19067 c19068;
        int i7;
        C18396 c18396;
        int i8;
        boolean z2;
        int i9;
        int iM43303;
        int i10;
        int i11;
        int i12;
        C19067 c19069;
        int iM43304;
        C3644[] c3644Arr;
        int iM43323;
        int i13;
        int i14;
        int[] iArrM43313;
        String str2;
        int i15;
        C3644[] c3644Arr2;
        String str3;
        int i16;
        int i17;
        int i18;
        int i19;
        char[] cArr = c11021.f30526;
        c11021.f30520 = m43323(i);
        c11021.f30533 = m43320(cArr, i + 2);
        int i20 = i + 4;
        c11021.f30521 = m43320(cArr, i20);
        int iM43324 = m43323(i + 6);
        boolean z3 = false;
        int i21 = 0;
        C18396 c18396M43311 = null;
        String[] strArr = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM43325 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = i + 8;
        int i31 = 0;
        while (true) {
            int i32 = iM43324 - 1;
            i2 = iM43325;
            str = "RuntimeInvisibleTypeAnnotations";
            i3 = i28;
            if (iM43324 <= 0) {
                break;
            }
            String strM43321 = m43320(cArr, i30);
            int i33 = i31;
            int iM43319 = m43319(i30 + 2);
            int i34 = i30 + 6;
            int i35 = i22;
            if ("Code".equals(strM43321)) {
                if ((c11021.f30518 & 1) == 0) {
                    iM43325 = i2;
                    i29 = i34;
                } else {
                    iM43325 = i2;
                }
                i22 = i35;
                i28 = i3;
                int i36 = i33;
                i19 = i34;
                i31 = i36;
                i23 = i23;
            } else {
                if ("Exceptions".equals(strM43321)) {
                    int iM43326 = m43323(i34);
                    String[] strArr2 = new String[iM43326];
                    int i37 = i30 + 8;
                    for (int i38 = 0; i38 < iM43326; i38++) {
                        strArr2[i38] = m43314(cArr, i37);
                        i37 += 2;
                    }
                    iM43325 = i2;
                    i21 = i34;
                    strArr = strArr2;
                } else if ("Signature".equals(strM43321)) {
                    iM43325 = m43323(i34);
                } else if ("Deprecated".equals(strM43321)) {
                    c11021.f30520 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    iM43325 = i2;
                } else if ("RuntimeVisibleAnnotations".equals(strM43321)) {
                    iM43325 = i2;
                    i27 = i34;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM43321)) {
                    iM43325 = i2;
                    i25 = i34;
                } else {
                    if ("AnnotationDefault".equals(strM43321)) {
                        iM43325 = i2;
                        i26 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i26;
                    } else if ("Synthetic".equals(strM43321)) {
                        c11021.f30520 |= 4096;
                        z3 = true;
                        iM43325 = i2;
                        i22 = i35;
                        i28 = i3;
                        i19 = i34;
                        i31 = i33;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM43321)) {
                        iM43325 = i2;
                        i28 = i34;
                        i22 = i35;
                        int i39 = i33;
                        i19 = i34;
                        i31 = i39;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM43321)) {
                        iM43325 = i2;
                        i24 = i34;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(strM43321)) {
                        iM43325 = i2;
                        i23 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i23;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(strM43321)) {
                        iM43325 = i2;
                        i33 = i34;
                    } else if ("MethodParameters".equals(strM43321)) {
                        iM43325 = i2;
                        i22 = i34;
                        i28 = i3;
                        int i310 = i33;
                        i19 = i34;
                        i31 = i310;
                    } else {
                        i19 = i34;
                        C18396 c18397 = c18396M43311;
                        c18396M43311 = m43311(c11021.f30519, strM43321, i19, iM43319, cArr, -1, null);
                        c18396M43311.f54924 = c18397;
                        iM43325 = i2;
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
            i30 = i19 + iM43319;
            iM43324 = i32;
        }
        int i40 = i22;
        int i41 = i23;
        int i42 = i24;
        int i43 = i25;
        String str4 = "RuntimeVisibleTypeAnnotations";
        int i44 = i31;
        C18396 c18398 = c18396M43311;
        AbstractC17054 abstractC17054Mo20834 = abstractC25102.mo20834(c11021.f30520, c11021.f30533, c11021.f30521, i2 == 0 ? null : m43322(cArr, i2), strArr);
        if (abstractC17054Mo20834 == null) {
            return i30;
        }
        if (abstractC17054Mo20834 instanceof C23091) {
            ((C23091) abstractC17054Mo20834).m51497(this, z3, (c11021.f30520 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, m43323(i20), i2, i21);
        }
        if (i40 != 0 && (c11021.f30518 & 2) == 0) {
            int iM43316 = m43316(i40);
            int i45 = i40 + 1;
            while (true) {
                int i46 = iM43316 - 1;
                if (iM43316 <= 0) {
                    break;
                }
                abstractC17054Mo20834.mo30335(m43323(i45 + 2), m43320(cArr, i45));
                i45 += 4;
                iM43316 = i46;
            }
        }
        if (i26 != 0) {
            AbstractC15773 abstractC15773Mo29008 = abstractC17054Mo20834.mo29008();
            m43306(abstractC15773Mo29008, i26, (String) null, cArr);
            if (abstractC15773Mo29008 != null) {
                abstractC15773Mo29008.mo22771();
            }
        }
        if (i27 != 0) {
            int iM43327 = m43323(i27);
            int iM43307 = i27 + 2;
            while (true) {
                int i47 = iM43327 - 1;
                if (iM43327 <= 0) {
                    break;
                }
                iM43307 = m43307(abstractC17054Mo20834.mo29013(m43320(cArr, iM43307), true), iM43307 + 2, true, cArr);
                iM43327 = i47;
            }
        }
        if (i3 != 0) {
            int iM43328 = m43323(i3);
            int iM43308 = i3 + 2;
            while (true) {
                int i48 = iM43328 - 1;
                if (iM43328 <= 0) {
                    break;
                }
                iM43308 = m43307(abstractC17054Mo20834.mo29013(m43320(cArr, iM43308), false), iM43308 + 2, true, cArr);
                iM43328 = i48;
            }
        }
        if (i43 != 0) {
            int iM43329 = m43323(i43);
            int iM43309 = i43 + 2;
            while (true) {
                int i49 = iM43329 - 1;
                if (iM43329 <= 0) {
                    break;
                }
                int iM43305 = m43305(c11021, iM43309);
                iM43309 = m43307(abstractC17054Mo20834.mo29022(c11021.f30517, c11021.f30522, m43320(cArr, iM43305), true), iM43305 + 2, true, cArr);
                iM43329 = i49;
            }
        }
        if (i42 != 0) {
            int iM433210 = m43323(i42);
            int iM433010 = i42 + 2;
            while (true) {
                int i50 = iM433210 - 1;
                if (iM433210 <= 0) {
                    break;
                }
                int iM43306 = m43305(c11021, iM433010);
                iM433010 = m43307(abstractC17054Mo20834.mo29022(c11021.f30517, c11021.f30522, m43320(cArr, iM43306), false), iM43306 + 2, true, cArr);
                iM433210 = i50;
            }
        }
        if (i41 != 0) {
            m43312(abstractC17054Mo20834, c11021, i41, true);
        }
        if (i44 != 0) {
            m43312(abstractC17054Mo20834, c11021, i44, false);
        }
        C18396 c18399 = c18398;
        while (c18399 != null) {
            C18396 c183910 = c18399.f54924;
            c18399.f54924 = null;
            abstractC17054Mo20834.mo30332(c18399);
            c18399 = c183910;
        }
        int i51 = i29;
        if (i51 != 0) {
            abstractC17054Mo20834.mo30333();
            char[] cArr2 = c11021.f30526;
            int iM433211 = m43323(i51);
            int iM433212 = m43323(i51 + 2);
            int iM433110 = m43319(i51 + 4);
            int i52 = i51 + 8;
            byte[] bArr = this.f56879;
            if (iM433110 > bArr.length - i52) {
                throw new IllegalArgumentException();
            }
            int i53 = i52 + iM433110;
            C3644[] c3644Arr3 = new C3644[iM433110 + 1];
            c11021.f30532 = c3644Arr3;
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
                    case HRSS1373Polynomial.f81792K /* 86 */:
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
                    case C0254q.f1216f /* 99 */:
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
                    case C0254q.f1218h /* 125 */:
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
                    case EnumC19222.f57460 /* 154 */:
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
                        m43310(m43324(i54 + 1) + i55, c3644Arr3);
                        i54 += 3;
                        break;
                    case 170:
                        int i56 = (4 - (i55 & 3)) + i54;
                        m43310(m43319(i56) + i55, c3644Arr3);
                        int iM433111 = (m43319(i56 + 8) - m43319(i56 + 4)) + 1;
                        i18 = i56 + 12;
                        while (true) {
                            int i57 = iM433111 - 1;
                            if (iM433111 <= 0) {
                                i54 = i18;
                            } else {
                                m43310(m43319(i18) + i55, c3644Arr3);
                                i18 += 4;
                                iM433111 = i57;
                            }
                            break;
                        }
                        break;
                    case 171:
                        int i58 = (4 - (i55 & 3)) + i54;
                        m43310(m43319(i58) + i55, c3644Arr3);
                        int iM433112 = m43319(i58 + 4);
                        i18 = i58 + 8;
                        while (true) {
                            int i59 = iM433112 - 1;
                            if (iM433112 <= 0) {
                                i54 = i18;
                            } else {
                                m43310(m43319(i18 + 4) + i55, c3644Arr3);
                                i18 += 8;
                                iM433112 = i59;
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
                        m43310(m43319(i54 + 1) + i55, c3644Arr3);
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
                        m43310(m43323(i54 + 1) + i55, c3644Arr3);
                        i54 += 3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            int iM433213 = m43323(i54);
            int i61 = i54 + 2;
            while (true) {
                int i62 = iM433213 - 1;
                int[] iArr2 = this.f56882;
                if (iM433213 > 0) {
                    C3644 c3644M43310 = m43310(m43323(i61), c3644Arr3);
                    C3644 c3644M43311 = m43310(m43323(i61 + 2), c3644Arr3);
                    int i63 = i53;
                    C3644 c3644M43312 = m43310(m43323(i61 + 4), c3644Arr3);
                    String strM43322 = m43320(cArr2, iArr2[m43323(i61 + 6)]);
                    i61 += 8;
                    abstractC17054Mo20834.mo29020(c3644M43310, c3644M43311, c3644M43312, strM43322);
                    iM433213 = i62;
                    i53 = i63;
                    bArr = bArr;
                } else {
                    int i64 = i53;
                    byte[] bArr2 = bArr;
                    int iM433214 = m43323(i61);
                    int i65 = i61 + 2;
                    int[] iArr3 = null;
                    int i66 = 0;
                    int i67 = 0;
                    int i68 = 0;
                    int i69 = 0;
                    boolean z4 = true;
                    int[] iArrM43314 = null;
                    C18396 c183911 = null;
                    while (true) {
                        int i70 = iM433214 - 1;
                        if (iM433214 > 0) {
                            String strM43323 = m43320(cArr2, i65);
                            C18396 c183912 = c183911;
                            int iM433113 = m43319(i65 + 2);
                            int i71 = i65 + 6;
                            int[] iArr4 = iArr2;
                            if (!"LocalVariableTable".equals(strM43323)) {
                                iArrM43313 = iArr3;
                                if ("LocalVariableTypeTable".equals(strM43323)) {
                                    i67 = i71;
                                    i15 = i71;
                                    iArr3 = iArrM43313;
                                    c183911 = c183912;
                                    str3 = str;
                                    c3644Arr2 = c3644Arr3;
                                } else if ("LineNumberTable".equals(strM43323)) {
                                    if ((c11021.f30518 & 2) == 0) {
                                        int iM433215 = m43323(i71);
                                        int i72 = i65 + 8;
                                        while (true) {
                                            int i73 = iM433215 - 1;
                                            if (iM433215 > 0) {
                                                int iM433216 = m43323(i72);
                                                int iM433217 = m43323(i72 + 2);
                                                int i74 = i72 + 4;
                                                C3644 c3644 = c3644Arr3[iM433216];
                                                if (c3644 == null) {
                                                    if (c3644 == null) {
                                                        c3644Arr3[iM433216] = new C3644();
                                                    }
                                                    C3644 c3645 = c3644Arr3[iM433216];
                                                    c3645.f7650 = (short) (c3645.f7650 | 1);
                                                }
                                                c3644Arr3[iM433216].m6913(iM433217);
                                                i72 = i74;
                                                iM433215 = i73;
                                            }
                                        }
                                    }
                                    str2 = str;
                                    i17 = i66;
                                    i16 = i68;
                                    i68 = i16;
                                    i66 = i17;
                                    i15 = i71;
                                    c183911 = c183912;
                                    c3644Arr2 = c3644Arr3;
                                    int[] iArr5 = iArrM43313;
                                    str3 = str2;
                                    iArr3 = iArr5;
                                } else {
                                    if (str4.equals(strM43323)) {
                                        iArrM43314 = m43313(abstractC17054Mo20834, c11021, i71, true);
                                        str2 = str;
                                    } else {
                                        str2 = str;
                                        if (str2.equals(strM43323)) {
                                            iArrM43313 = m43313(abstractC17054Mo20834, c11021, i71, false);
                                        } else {
                                            if ("StackMapTable".equals(strM43323)) {
                                                if ((c11021.f30518 & 4) == 0) {
                                                    i68 = i65 + 8;
                                                    i66 = i71 + iM433113;
                                                }
                                            } else if ("StackMap".equals(strM43323)) {
                                                if ((c11021.f30518 & 4) == 0) {
                                                    i16 = i65 + 8;
                                                    i17 = i71 + iM433113;
                                                    z4 = false;
                                                }
                                                i68 = i16;
                                                i66 = i17;
                                            } else {
                                                i15 = i71;
                                                c3644Arr2 = c3644Arr3;
                                                str3 = str2;
                                                C18396 c18396M43312 = m43311(c11021.f30519, strM43323, i15, iM433113, cArr2, i51, c3644Arr2);
                                                c18396M43312.f54924 = c183912;
                                                c183911 = c18396M43312;
                                                iArrM43314 = iArrM43314;
                                                iArr3 = iArrM43313;
                                            }
                                            i17 = i66;
                                            i16 = i68;
                                            i68 = i16;
                                            i66 = i17;
                                        }
                                    }
                                    i15 = i71;
                                    c183911 = c183912;
                                    c3644Arr2 = c3644Arr3;
                                    int[] iArr6 = iArrM43313;
                                    str3 = str2;
                                    iArr3 = iArr6;
                                }
                            } else if ((c11021.f30518 & 2) == 0) {
                                int iM433218 = m43323(i71);
                                int i75 = i65 + 8;
                                while (true) {
                                    int i76 = iM433218 - 1;
                                    if (iM433218 > 0) {
                                        int iM433219 = m43323(i75);
                                        C3644 c3646 = c3644Arr3[iM433219];
                                        if (c3646 == null) {
                                            if (c3646 == null) {
                                                c3644Arr3[iM433219] = new C3644();
                                            }
                                            C3644 c3647 = c3644Arr3[iM433219];
                                            c3647.f7650 = (short) (c3647.f7650 | 1);
                                        }
                                        int iM433220 = m43323(i75 + 2) + iM433219;
                                        C3644 c3648 = c3644Arr3[iM433220];
                                        if (c3648 == null) {
                                            if (c3648 == null) {
                                                c3644Arr3[iM433220] = new C3644();
                                            }
                                            C3644 c3649 = c3644Arr3[iM433220];
                                            c3649.f7650 = (short) (c3649.f7650 | 1);
                                        }
                                        i75 += 10;
                                        iM433218 = i76;
                                        iArr3 = iArr3;
                                    } else {
                                        iArrM43313 = iArr3;
                                        i69 = i71;
                                        i15 = i71;
                                        iArr3 = iArrM43313;
                                        c183911 = c183912;
                                        str3 = str;
                                        c3644Arr2 = c3644Arr3;
                                    }
                                }
                            } else {
                                iArrM43313 = iArr3;
                                str2 = str;
                                i17 = i66;
                                i16 = i68;
                                i68 = i16;
                                i66 = i17;
                                i15 = i71;
                                c183911 = c183912;
                                c3644Arr2 = c3644Arr3;
                                int[] iArr7 = iArrM43313;
                                str3 = str2;
                                iArr3 = iArr7;
                            }
                            i65 = i15 + iM433113;
                            c3644Arr3 = c3644Arr2;
                            cArr2 = cArr2;
                            iM433110 = iM433110;
                            iM433214 = i70;
                            iArr2 = iArr4;
                            str = str3;
                            str4 = str4;
                            i51 = i51;
                        } else {
                            C18396 c183913 = c183911;
                            int[] iArr8 = iArr2;
                            C3644[] c3644Arr4 = c3644Arr3;
                            int[] iArr9 = iArr3;
                            int i77 = iM433110;
                            char[] cArr3 = cArr2;
                            int[] iArr10 = iArrM43314;
                            boolean z5 = (c11021.f30518 & 8) != 0;
                            if (i68 != 0) {
                                c11021.f30527 = -1;
                                c11021.f30534 = 0;
                                c11021.f30529 = 0;
                                c11021.f30531 = 0;
                                Object[] objArr = new Object[iM433212];
                                c11021.f30530 = objArr;
                                c11021.f30535 = 0;
                                c11021.f30523 = new Object[iM433211];
                                if (z5) {
                                    String str5 = c11021.f30521;
                                    if ((c11021.f30520 & 8) == 0) {
                                        if ("<init>".equals(c11021.f30533)) {
                                            objArr[0] = 6;
                                        } else {
                                            objArr[0] = m43314(c11021.f30526, this.f56880 + 2);
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
                                                        c11021.f30529 = i13;
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
                                    if (bArr2[i81] != 8 || (iM43323 = m43323(i81 + 1)) < 0 || iM43323 >= i77 || (bArr2[i52 + iM43323] & 255) != 187) {
                                        c3644Arr = c3644Arr4;
                                    } else {
                                        c3644Arr = c3644Arr4;
                                        m43310(iM43323, c3644Arr);
                                    }
                                    i81++;
                                    c3644Arr4 = c3644Arr;
                                }
                            }
                            C3644[] c3644Arr5 = c3644Arr4;
                            if (z5 && (c11021.f30518 & 256) != 0) {
                                abstractC17054Mo20834.mo29014(-1, iM433212, 0, (Object[]) null, (Object[]) null);
                            }
                            int iM433011 = m43303(0, iArr10);
                            int i82 = 0;
                            int iM433012 = m43303(0, iArr9);
                            int i83 = (c11021.f30518 & 256) == 0 ? 33 : 0;
                            C18396 c183914 = c183913;
                            AbstractC17054 abstractC17055 = abstractC17054Mo20834;
                            int i84 = iM433211;
                            int i85 = iM433212;
                            int i86 = i64;
                            int i87 = i66;
                            int i88 = 0;
                            C19067 c190610 = this;
                            int[] iArr11 = iArr10;
                            int i89 = i30;
                            char[] cArr4 = cArr3;
                            int i90 = iM433011;
                            int i91 = i67;
                            boolean z6 = false;
                            int[] iArr12 = iArr9;
                            C3644[] c3644Arr6 = c3644Arr5;
                            int i92 = i69;
                            C19067 c190611 = c190610;
                            int i93 = i52;
                            while (i93 < i86) {
                                int i94 = i93 - i52;
                                int i95 = i86;
                                C3644 c36410 = c3644Arr6[i94];
                                boolean z7 = z6;
                                if (c36410 != null) {
                                    c36410.m6915(abstractC17055, (c11021.f30518 & 2) == 0);
                                }
                                int i96 = i68;
                                boolean z8 = z7;
                                while (true) {
                                    if (i96 != 0) {
                                        i85 = i85;
                                        int i97 = c11021.f30527;
                                        i84 = i84;
                                        if (i97 == i94 || i97 == -1) {
                                            if (i97 != -1) {
                                                if (!z4 || z5) {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC17055.mo29014(-1, c11021.f30529, c11021.f30535, c11021.f30530, c11021.f30523);
                                                } else {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC17055.mo29014(c11021.f30534, c11021.f30531, c11021.f30535, c11021.f30530, c11021.f30523);
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
                                                char[] cArr5 = c11021.f30526;
                                                C3644[] c3644Arr7 = c11021.f30532;
                                                if (z4) {
                                                    i11 = i96 + 1;
                                                    i12 = bArr2[i96] & 255;
                                                } else {
                                                    c11021.f30527 = -1;
                                                    i11 = i96;
                                                    i12 = 255;
                                                }
                                                c11021.f30531 = 0;
                                                if (i12 < 64) {
                                                    c11021.f30534 = 3;
                                                    c11021.f30535 = 0;
                                                } else {
                                                    if (i12 < 128) {
                                                        i12 -= 64;
                                                        int iM433013 = c190611.m43304(i11, c11021.f30523, 0, cArr5, c3644Arr7);
                                                        c11021.f30534 = 4;
                                                        c11021.f30535 = 1;
                                                        i11 = iM433013;
                                                    } else {
                                                        if (i12 < 247) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        c19069 = c190611;
                                                        int iM433221 = c19069.m43323(i11);
                                                        i87 = i87;
                                                        int iM433014 = i11 + 2;
                                                        if (i12 == 247) {
                                                            iM433014 = c19069.m43304(iM433014, c11021.f30523, 0, cArr5, c3644Arr7);
                                                            c11021.f30534 = 4;
                                                            c11021.f30535 = 1;
                                                            z8 = z8;
                                                        } else {
                                                            z8 = z8;
                                                            if (i12 >= 248 && i12 < 251) {
                                                                c11021.f30534 = 2;
                                                                int i98 = 251 - i12;
                                                                c11021.f30531 = i98;
                                                                c11021.f30529 -= i98;
                                                                c11021.f30535 = 0;
                                                            } else if (i12 == 251) {
                                                                c11021.f30534 = 3;
                                                                c11021.f30535 = 0;
                                                            } else {
                                                                if (i12 < 255) {
                                                                    int i99 = i12 - 251;
                                                                    iM43304 = iM433014;
                                                                    int i100 = i99;
                                                                    int i101 = z5 ? c11021.f30529 : 0;
                                                                    while (i100 > 0) {
                                                                        iM43304 = c19069.m43304(iM43304, c11021.f30530, i101, cArr5, c3644Arr7);
                                                                        i100--;
                                                                        i101++;
                                                                    }
                                                                    c11021.f30534 = 1;
                                                                    c11021.f30531 = i99;
                                                                    c11021.f30529 += i99;
                                                                    c11021.f30535 = 0;
                                                                } else {
                                                                    int iM433222 = c19069.m43323(iM433014);
                                                                    int iM433015 = i11 + 4;
                                                                    c11021.f30534 = 0;
                                                                    c11021.f30531 = iM433222;
                                                                    c11021.f30529 = iM433222;
                                                                    for (int i102 = 0; i102 < iM433222; i102++) {
                                                                        iM433015 = c19069.m43304(iM433015, c11021.f30530, i102, cArr5, c3644Arr7);
                                                                    }
                                                                    int iM433223 = c19069.m43323(iM433015);
                                                                    c11021.f30535 = iM433223;
                                                                    iM43304 = iM433015 + 2;
                                                                    for (int i103 = 0; i103 < iM433223; i103++) {
                                                                        iM43304 = c19069.m43304(iM43304, c11021.f30523, i103, cArr5, c3644Arr7);
                                                                    }
                                                                }
                                                                iM433014 = iM43304;
                                                            }
                                                        }
                                                        i11 = iM433014;
                                                        i12 = iM433221;
                                                    }
                                                    int i104 = i12 + 1 + c11021.f30527;
                                                    c11021.f30527 = i104;
                                                    m43310(i104, c3644Arr7);
                                                    i96 = i11;
                                                    c190611 = c19069;
                                                    i87 = i87;
                                                    z8 = z8;
                                                }
                                                c19069 = c190611;
                                                int i105 = i12 + 1 + c11021.f30527;
                                                c11021.f30527 = i105;
                                                m43310(i105, c3644Arr7);
                                                i96 = i11;
                                                c190611 = c19069;
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
                                C19067 c190612 = c190611;
                                if (z8) {
                                    if ((c11021.f30518 & 8) != 0) {
                                        abstractC17055.mo29014(256, 0, 0, (Object[]) null, (Object[]) null);
                                    }
                                    z = false;
                                } else {
                                    z5 = z5;
                                    c190612 = c190612;
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
                                    case HRSS1373Polynomial.f81792K /* 86 */:
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
                                    case C0254q.f1216f /* 99 */:
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
                                    case C0254q.f1218h /* 125 */:
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
                                        abstractC17055.mo30323(i107);
                                        i5 = i93 + 1;
                                        c19067 = c190612;
                                        z6 = z;
                                        i6 = i83;
                                        c19068 = c19067;
                                        C18396 c183915 = c183914;
                                        i8 = iM433012;
                                        c18396 = c183915;
                                        while (true) {
                                            C3644[] c3644Arr8 = c3644Arr6;
                                            if (iArr11 == null && i88 < iArr11.length && i90 <= i106) {
                                                if (i90 == i106) {
                                                    int iM433016 = c19067.m43305(c11021, iArr11[i88]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM433016), true), iM433016 + 2, true, cArr4);
                                                }
                                                int i108 = i88 + 1;
                                                int iM433017 = c19067.m43303(i108, iArr11);
                                                i6 = i6;
                                                i95 = i95;
                                                i5 = i5;
                                                c18396 = c18396;
                                                i8 = i8;
                                                c19067 = c19067;
                                                i92 = i92;
                                                i90 = iM433017;
                                                abstractC17055 = abstractC17055;
                                                i88 = i108;
                                                i96 = i96;
                                                bArr2 = bArr2;
                                                i89 = i89;
                                                c19068 = c19068;
                                                i91 = i91;
                                                z5 = z5;
                                                z4 = z4;
                                                i52 = i52;
                                                c3644Arr6 = c3644Arr8;
                                                i82 = i82;
                                                iArr8 = iArr8;
                                                iArr12 = iArr12;
                                            }
                                        }
                                        int i109 = i6;
                                        int i110 = i95;
                                        int i111 = i5;
                                        iM43303 = i8;
                                        i10 = i82;
                                        while (iArr12 != null && i10 < iArr12.length && iM43303 <= i106) {
                                            if (iM43303 == i106) {
                                                int iM433018 = c19067.m43305(c11021, iArr12[i10]);
                                                c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM433018), false), iM433018 + 2, true, cArr4);
                                            }
                                            i10++;
                                            iM43303 = c19067.m43303(i10, iArr12);
                                            i90 = i90;
                                            i88 = i88;
                                        }
                                        int i112 = i90;
                                        int i113 = i88;
                                        c183914 = c18396;
                                        c190610 = c19067;
                                        iM433012 = iM43303;
                                        i91 = i91;
                                        z5 = z5;
                                        c3644Arr6 = c3644Arr8;
                                        i86 = i110;
                                        i93 = i111;
                                        i87 = i87;
                                        i68 = i96;
                                        c190611 = c19068;
                                        i88 = i113;
                                        iArr12 = iArr12;
                                        i92 = i92;
                                        i90 = i112;
                                        i82 = i10;
                                        i83 = i109;
                                        break;
                                    case 16:
                                    case 188:
                                        abstractC17055.mo30334(i107, bArr2[i93 + 1]);
                                        i5 = i93 + 2;
                                        c19067 = c190612;
                                        z6 = z;
                                        i6 = i83;
                                        c19068 = c19067;
                                        C18396 c183916 = c183914;
                                        i8 = iM433012;
                                        c18396 = c183916;
                                        while (true) {
                                            C3644[] c3644Arr9 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1010 = i6;
                                            int i114 = i95;
                                            int i115 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM433019 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM433019), false), iM433019 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i116 = i90;
                                            int i117 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr9;
                                            i86 = i114;
                                            i93 = i115;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i116;
                                            i82 = i10;
                                            i83 = i1010;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr9;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 17:
                                        z = z;
                                        i83 = i83;
                                        abstractC17055.mo30334(i107, c190612.m43324(i93 + 1));
                                        i5 = i93 + 3;
                                        c19067 = c190612;
                                        z6 = z;
                                        i6 = i83;
                                        c19068 = c19067;
                                        C18396 c183917 = c183914;
                                        i8 = iM433012;
                                        c18396 = c183917;
                                        while (true) {
                                            C3644[] c3644Arr10 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1011 = i6;
                                            int i118 = i95;
                                            int i119 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330110 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330110), false), iM4330110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1110 = i90;
                                            int i1111 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr10;
                                            i86 = i118;
                                            i93 = i119;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1110;
                                            i82 = i10;
                                            i83 = i1011;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr10;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 18:
                                        abstractC17055.mo29016(c190612.m43317(cArr4, bArr2[i93 + 1] & 255));
                                        i5 = i93 + 2;
                                        c19067 = c190612;
                                        z6 = z;
                                        i6 = i83;
                                        c19068 = c19067;
                                        C18396 c183918 = c183914;
                                        i8 = iM433012;
                                        c18396 = c183918;
                                        while (true) {
                                            C3644[] c3644Arr11 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1012 = i6;
                                            int i1112 = i95;
                                            int i1113 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330111 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330111), false), iM4330111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1114 = i90;
                                            int i1115 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr11;
                                            i86 = i1112;
                                            i93 = i1113;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1114;
                                            i82 = i10;
                                            i83 = i1012;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr11;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 19:
                                    case 20:
                                        abstractC17055.mo29016(c190612.m43317(cArr4, c190612.m43323(i93 + 1)));
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190613 = c190612;
                                        int i120 = i89;
                                        int[] iArr13 = iArr8;
                                        byte[] bArr3 = bArr2;
                                        int i121 = i82;
                                        int i122 = i96;
                                        int i123 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr12 = c3644Arr6;
                                        boolean z9 = z4;
                                        AbstractC17054 abstractC17056 = abstractC17055;
                                        boolean z10 = z5;
                                        int i124 = i90;
                                        int i125 = i91;
                                        int i126 = iM433012;
                                        c18396 = c183914;
                                        i8 = i126;
                                        c19067 = c190613;
                                        i92 = i92;
                                        i90 = i124;
                                        abstractC17055 = abstractC17056;
                                        i88 = i88;
                                        i96 = i122;
                                        bArr2 = bArr3;
                                        i89 = i120;
                                        c19068 = c190613;
                                        i91 = i125;
                                        z5 = z10;
                                        z4 = z9;
                                        i52 = i123;
                                        c3644Arr6 = c3644Arr12;
                                        i82 = i121;
                                        iArr8 = iArr13;
                                        while (true) {
                                            C3644[] c3644Arr13 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1013 = i6;
                                            int i1116 = i95;
                                            int i1117 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330112 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330112), false), iM4330112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1118 = i90;
                                            int i1119 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr13;
                                            i86 = i1116;
                                            i93 = i1117;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1118;
                                            i82 = i10;
                                            i83 = i1013;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr13;
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
                                        abstractC17055.mo30339(i107, bArr2[i93 + 1] & 255);
                                        i7 = i93 + 2;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190614 = c190612;
                                        int i127 = i89;
                                        int[] iArr14 = iArr8;
                                        byte[] bArr4 = bArr2;
                                        int i128 = i82;
                                        int i129 = i96;
                                        int i1210 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr14 = c3644Arr6;
                                        boolean z11 = z4;
                                        AbstractC17054 abstractC17057 = abstractC17055;
                                        boolean z12 = z5;
                                        int i1211 = i90;
                                        int i1212 = i91;
                                        int i1213 = iM433012;
                                        c18396 = c183914;
                                        i8 = i1213;
                                        c19067 = c190614;
                                        i92 = i92;
                                        i90 = i1211;
                                        abstractC17055 = abstractC17057;
                                        i88 = i88;
                                        i96 = i129;
                                        bArr2 = bArr4;
                                        i89 = i127;
                                        c19068 = c190614;
                                        i91 = i1212;
                                        z5 = z12;
                                        z4 = z11;
                                        i52 = i1210;
                                        c3644Arr6 = c3644Arr14;
                                        i82 = i128;
                                        iArr8 = iArr14;
                                        while (true) {
                                            C3644[] c3644Arr15 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1014 = i6;
                                            int i11110 = i95;
                                            int i11111 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330113 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330113), false), iM4330113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11112 = i90;
                                            int i11113 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr15;
                                            i86 = i11110;
                                            i93 = i11111;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i11113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11112;
                                            i82 = i10;
                                            i83 = i1014;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr15;
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
                                        abstractC17055.mo30339((i130 >> 2) + 21, i130 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190615 = c190612;
                                        int i1214 = i89;
                                        int[] iArr15 = iArr8;
                                        byte[] bArr5 = bArr2;
                                        int i1215 = i82;
                                        int i1216 = i96;
                                        int i1217 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr16 = c3644Arr6;
                                        boolean z13 = z4;
                                        AbstractC17054 abstractC17058 = abstractC17055;
                                        boolean z14 = z5;
                                        int i1218 = i90;
                                        int i1219 = i91;
                                        int i12110 = iM433012;
                                        c18396 = c183914;
                                        i8 = i12110;
                                        c19067 = c190615;
                                        i92 = i92;
                                        i90 = i1218;
                                        abstractC17055 = abstractC17058;
                                        i88 = i88;
                                        i96 = i1216;
                                        bArr2 = bArr5;
                                        i89 = i1214;
                                        c19068 = c190615;
                                        i91 = i1219;
                                        z5 = z14;
                                        z4 = z13;
                                        i52 = i1217;
                                        c3644Arr6 = c3644Arr16;
                                        i82 = i1215;
                                        iArr8 = iArr15;
                                        while (true) {
                                            C3644[] c3644Arr17 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1015 = i6;
                                            int i11114 = i95;
                                            int i11115 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330114 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330114), false), iM4330114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11116 = i90;
                                            int i11117 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr17;
                                            i86 = i11114;
                                            i93 = i11115;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i11117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11116;
                                            i82 = i10;
                                            i83 = i1015;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr17;
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
                                        abstractC17055.mo30339((i131 >> 2) + 54, i131 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190616 = c190612;
                                        int i12111 = i89;
                                        int[] iArr16 = iArr8;
                                        byte[] bArr6 = bArr2;
                                        int i12112 = i82;
                                        int i12113 = i96;
                                        int i12114 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr18 = c3644Arr6;
                                        boolean z15 = z4;
                                        AbstractC17054 abstractC17059 = abstractC17055;
                                        boolean z16 = z5;
                                        int i12115 = i90;
                                        int i12116 = i91;
                                        int i12117 = iM433012;
                                        c18396 = c183914;
                                        i8 = i12117;
                                        c19067 = c190616;
                                        i92 = i92;
                                        i90 = i12115;
                                        abstractC17055 = abstractC17059;
                                        i88 = i88;
                                        i96 = i12113;
                                        bArr2 = bArr6;
                                        i89 = i12111;
                                        c19068 = c190616;
                                        i91 = i12116;
                                        z5 = z16;
                                        z4 = z15;
                                        i52 = i12114;
                                        c3644Arr6 = c3644Arr18;
                                        i82 = i12112;
                                        iArr8 = iArr16;
                                        while (true) {
                                            C3644[] c3644Arr19 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1016 = i6;
                                            int i11118 = i95;
                                            int i11119 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330115 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330115), false), iM4330115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111110 = i90;
                                            int i111111 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr19;
                                            i86 = i11118;
                                            i93 = i11119;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111110;
                                            i82 = i10;
                                            i83 = i1016;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr19;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 132:
                                        abstractC17055.mo30324(bArr2[i93 + 1] & 255, bArr2[i93 + 2]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190617 = c190612;
                                        int i12118 = i89;
                                        int[] iArr17 = iArr8;
                                        byte[] bArr7 = bArr2;
                                        int i12119 = i82;
                                        int i121110 = i96;
                                        int i121111 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr110 = c3644Arr6;
                                        boolean z17 = z4;
                                        AbstractC17054 abstractC170510 = abstractC17055;
                                        boolean z18 = z5;
                                        int i121112 = i90;
                                        int i121113 = i91;
                                        int i121114 = iM433012;
                                        c18396 = c183914;
                                        i8 = i121114;
                                        c19067 = c190617;
                                        i92 = i92;
                                        i90 = i121112;
                                        abstractC17055 = abstractC170510;
                                        i88 = i88;
                                        i96 = i121110;
                                        bArr2 = bArr7;
                                        i89 = i12118;
                                        c19068 = c190617;
                                        i91 = i121113;
                                        z5 = z18;
                                        z4 = z17;
                                        i52 = i121111;
                                        c3644Arr6 = c3644Arr110;
                                        i82 = i12119;
                                        iArr8 = iArr17;
                                        while (true) {
                                            C3644[] c3644Arr111 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1017 = i6;
                                            int i111112 = i95;
                                            int i111113 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330116 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330116), false), iM4330116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111114 = i90;
                                            int i111115 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr111;
                                            i86 = i111112;
                                            i93 = i111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111114;
                                            i82 = i10;
                                            i83 = i1017;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 153:
                                    case EnumC19222.f57460 /* 154 */:
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
                                        abstractC17055.mo30326(i107, c3644Arr6[c190612.m43324(i93 + 1) + i106]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190618 = c190612;
                                        int i121115 = i89;
                                        int[] iArr18 = iArr8;
                                        byte[] bArr8 = bArr2;
                                        int i121116 = i82;
                                        int i121117 = i96;
                                        int i121118 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr112 = c3644Arr6;
                                        boolean z19 = z4;
                                        AbstractC17054 abstractC170511 = abstractC17055;
                                        boolean z110 = z5;
                                        int i121119 = i90;
                                        int i1211110 = i91;
                                        int i1211111 = iM433012;
                                        c18396 = c183914;
                                        i8 = i1211111;
                                        c19067 = c190618;
                                        i92 = i92;
                                        i90 = i121119;
                                        abstractC17055 = abstractC170511;
                                        i88 = i88;
                                        i96 = i121117;
                                        bArr2 = bArr8;
                                        i89 = i121115;
                                        c19068 = c190618;
                                        i91 = i1211110;
                                        z5 = z110;
                                        z4 = z19;
                                        i52 = i121118;
                                        c3644Arr6 = c3644Arr112;
                                        i82 = i121116;
                                        iArr8 = iArr18;
                                        while (true) {
                                            C3644[] c3644Arr113 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1018 = i6;
                                            int i111116 = i95;
                                            int i111117 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330117 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330117), false), iM4330117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111118 = i90;
                                            int i111119 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr113;
                                            i86 = i111116;
                                            i93 = i111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111118;
                                            i82 = i10;
                                            i83 = i1018;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr113;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 170:
                                        z = z;
                                        i83 = i83;
                                        int i132 = (4 - (i106 & 3)) + i93;
                                        C3644 c36411 = c3644Arr6[c190612.m43319(i132) + i106];
                                        int iM433114 = c190612.m43319(i132 + 4);
                                        int iM433115 = c190612.m43319(i132 + 8);
                                        i7 = i132 + 12;
                                        int i133 = (iM433115 - iM433114) + 1;
                                        C3644[] c3644Arr20 = new C3644[i133];
                                        for (int i134 = 0; i134 < i133; i134++) {
                                            c3644Arr20[i134] = c3644Arr6[c190612.m43319(i7) + i106];
                                            i7 += 4;
                                        }
                                        abstractC17055.mo30325(iM433114, iM433115, c36411, c3644Arr20);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c190619 = c190612;
                                        int i1211112 = i89;
                                        int[] iArr19 = iArr8;
                                        byte[] bArr9 = bArr2;
                                        int i1211113 = i82;
                                        int i1211114 = i96;
                                        int i1211115 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr114 = c3644Arr6;
                                        boolean z111 = z4;
                                        AbstractC17054 abstractC170512 = abstractC17055;
                                        boolean z112 = z5;
                                        int i1211116 = i90;
                                        int i1211117 = i91;
                                        int i1211118 = iM433012;
                                        c18396 = c183914;
                                        i8 = i1211118;
                                        c19067 = c190619;
                                        i92 = i92;
                                        i90 = i1211116;
                                        abstractC17055 = abstractC170512;
                                        i88 = i88;
                                        i96 = i1211114;
                                        bArr2 = bArr9;
                                        i89 = i1211112;
                                        c19068 = c190619;
                                        i91 = i1211117;
                                        z5 = z112;
                                        z4 = z111;
                                        i52 = i1211115;
                                        c3644Arr6 = c3644Arr114;
                                        i82 = i1211113;
                                        iArr8 = iArr19;
                                        while (true) {
                                            C3644[] c3644Arr115 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1019 = i6;
                                            int i1111110 = i95;
                                            int i1111111 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330118 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330118), false), iM4330118 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111112 = i90;
                                            int i1111113 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr115;
                                            i86 = i1111110;
                                            i93 = i1111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111112;
                                            i82 = i10;
                                            i83 = i1019;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr115;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 171:
                                        z = z;
                                        i83 = i83;
                                        int i135 = (4 - (i106 & 3)) + i93;
                                        C3644 c36412 = c3644Arr6[c190612.m43319(i135) + i106];
                                        int iM433116 = c190612.m43319(i135 + 4);
                                        i7 = i135 + 8;
                                        int[] iArr20 = new int[iM433116];
                                        C3644[] c3644Arr21 = new C3644[iM433116];
                                        for (int i136 = 0; i136 < iM433116; i136++) {
                                            iArr20[i136] = c190612.m43319(i7);
                                            c3644Arr21[i136] = c3644Arr6[c190612.m43319(i7 + 4) + i106];
                                            i7 += 8;
                                        }
                                        abstractC17055.mo30329(c36412, iArr20, c3644Arr21);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C19067 c1906110 = c190612;
                                        int i1211119 = i89;
                                        int[] iArr110 = iArr8;
                                        byte[] bArr10 = bArr2;
                                        int i12111110 = i82;
                                        int i12111111 = i96;
                                        int i12111112 = i52;
                                        i95 = i95;
                                        C3644[] c3644Arr116 = c3644Arr6;
                                        boolean z113 = z4;
                                        AbstractC17054 abstractC170513 = abstractC17055;
                                        boolean z114 = z5;
                                        int i12111113 = i90;
                                        int i12111114 = i91;
                                        int i12111115 = iM433012;
                                        c18396 = c183914;
                                        i8 = i12111115;
                                        c19067 = c1906110;
                                        i92 = i92;
                                        i90 = i12111113;
                                        abstractC17055 = abstractC170513;
                                        i88 = i88;
                                        i96 = i12111111;
                                        bArr2 = bArr10;
                                        i89 = i1211119;
                                        c19068 = c1906110;
                                        i91 = i12111114;
                                        z5 = z114;
                                        z4 = z113;
                                        i52 = i12111112;
                                        c3644Arr6 = c3644Arr116;
                                        i82 = i12111110;
                                        iArr8 = iArr110;
                                        while (true) {
                                            C3644[] c3644Arr117 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10110 = i6;
                                            int i1111114 = i95;
                                            int i1111115 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM4330119 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM4330119), false), iM4330119 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111116 = i90;
                                            int i1111117 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr117;
                                            i86 = i1111114;
                                            i93 = i1111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111116;
                                            i82 = i10;
                                            i83 = i10110;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr117;
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
                                        int i137 = iArr8[c190612.m43323(i93 + 1)];
                                        int i138 = iArr8[c190612.m43323(i137 + 2)];
                                        String strM43314 = c190612.m43314(cArr4, i137);
                                        String strM43324 = c190612.m43320(cArr4, i138);
                                        String strM43325 = c190612.m43320(cArr4, i138 + 2);
                                        if (i107 < 182) {
                                            abstractC17055.mo29017(strM43314, i107, strM43324, strM43325);
                                        } else {
                                            abstractC17055.mo14009(i107, strM43314, strM43324, strM43325, bArr2[i137 + (-1)] == 11);
                                        }
                                        i5 = i107 == 185 ? i93 + 5 : i93 + 3;
                                        z = z2;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c183919 = c183914;
                                        i8 = iM433012;
                                        c18396 = c183919;
                                        while (true) {
                                            C3644[] c3644Arr118 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10111 = i6;
                                            int i1111118 = i95;
                                            int i1111119 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301110 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301110), false), iM43301110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111110 = i90;
                                            int i11111111 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr118;
                                            i86 = i1111118;
                                            i93 = i1111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i11111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111110;
                                            i82 = i10;
                                            i83 = i10111;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr118;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 186:
                                        int i139 = iArr8[c190612.m43323(i93 + 1)];
                                        int i140 = iArr8[c190612.m43323(i139 + 2)];
                                        String strM43326 = c190612.m43320(cArr4, i140);
                                        String strM43327 = c190612.m43320(cArr4, i140 + 2);
                                        int i141 = c190612.f56878[c190612.m43323(i139)];
                                        C2973 c2973 = (C2973) c190612.m43317(cArr4, c190612.m43323(i141));
                                        int iM433224 = c190612.m43323(i141 + 2);
                                        Object[] objArr2 = new Object[iM433224];
                                        int i142 = i141 + 4;
                                        z2 = z;
                                        int i143 = 0;
                                        while (i143 < iM433224) {
                                            objArr2[i143] = c190612.m43317(cArr4, c190612.m43323(i142));
                                            i142 += 2;
                                            i143++;
                                            i83 = i83;
                                        }
                                        i9 = i83;
                                        abstractC17055.mo29019(strM43326, strM43327, c2973, objArr2);
                                        z = z2;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839110 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839110;
                                        while (true) {
                                            C3644[] c3644Arr119 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10112 = i6;
                                            int i11111112 = i95;
                                            int i11111113 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301111 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301111), false), iM43301111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111114 = i90;
                                            int i11111115 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr119;
                                            i86 = i11111112;
                                            i93 = i11111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i11111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111114;
                                            i82 = i10;
                                            i83 = i10112;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr119;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 187:
                                    case 189:
                                    case 192:
                                    case 193:
                                        abstractC17055.mo29023(i107, c190612.m43314(cArr4, i93 + 1));
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839111 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839111;
                                        while (true) {
                                            C3644[] c3644Arr1110 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10113 = i6;
                                            int i11111116 = i95;
                                            int i11111117 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301112 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301112), false), iM43301112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111118 = i90;
                                            int i11111119 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1110;
                                            i86 = i11111116;
                                            i93 = i11111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i11111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111118;
                                            i82 = i10;
                                            i83 = i10113;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1110;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 196:
                                        int i144 = bArr2[i93 + 1] & 255;
                                        if (i144 == 132) {
                                            abstractC17055.mo30324(c190612.m43323(i93 + 2), c190612.m43324(i93 + 4));
                                            i5 = i93 + 6;
                                        } else {
                                            abstractC17055.mo30339(i144, c190612.m43323(i93 + 2));
                                            i5 = i93 + 4;
                                        }
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839112 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839112;
                                        while (true) {
                                            C3644[] c3644Arr1111 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10114 = i6;
                                            int i111111110 = i95;
                                            int i111111111 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301113 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301113), false), iM43301113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111112 = i90;
                                            int i111111113 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1111;
                                            i86 = i111111110;
                                            i93 = i111111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i111111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111112;
                                            i82 = i10;
                                            i83 = i10114;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 197:
                                        abstractC17055.mo29015(bArr2[i93 + 3] & 255, c190612.m43314(cArr4, i93 + 1));
                                        i5 = i93 + 4;
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839113 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839113;
                                        while (true) {
                                            C3644[] c3644Arr1112 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10115 = i6;
                                            int i111111114 = i95;
                                            int i111111115 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301114 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301114), false), iM43301114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111116 = i90;
                                            int i111111117 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1112;
                                            i86 = i111111114;
                                            i93 = i111111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i111111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111116;
                                            i82 = i10;
                                            i83 = i10115;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1112;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 200:
                                    case 201:
                                        abstractC17055.mo30326(i107 - i83, c3644Arr6[c190612.m43319(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839114 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839114;
                                        while (true) {
                                            C3644[] c3644Arr1113 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10116 = i6;
                                            int i111111118 = i95;
                                            int i111111119 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301115 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301115), false), iM43301115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111110 = i90;
                                            int i1111111111 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1113;
                                            i86 = i111111118;
                                            i93 = i111111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111110;
                                            i82 = i10;
                                            i83 = i10116;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1113;
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
                                        C3644 c36413 = c3644Arr6[c190612.m43323(i93 + 1) + i106];
                                        if (i145 == 167 || i145 == 168) {
                                            abstractC17055.mo30326(i145 + 33, c36413);
                                        } else {
                                            abstractC17055.mo30326(i145 < 167 ? ((i145 + 1) ^ 1) - 1 : i145 ^ 1, m43310(i106 + 3, c3644Arr6));
                                            abstractC17055.mo30326(200, c36413);
                                            z = true;
                                        }
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839115 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839115;
                                        while (true) {
                                            C3644[] c3644Arr1114 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10117 = i6;
                                            int i1111111112 = i95;
                                            int i1111111113 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301116 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301116), false), iM43301116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111114 = i90;
                                            int i1111111115 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1114;
                                            i86 = i1111111112;
                                            i93 = i1111111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111114;
                                            i82 = i10;
                                            i83 = i10117;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1114;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 220:
                                        abstractC17055.mo30326(200, c3644Arr6[c190612.m43319(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        z = true;
                                        i9 = i83;
                                        z6 = z;
                                        c19067 = c190612;
                                        i6 = i9;
                                        c19068 = c19067;
                                        C18396 c1839116 = c183914;
                                        i8 = iM433012;
                                        c18396 = c1839116;
                                        while (true) {
                                            C3644[] c3644Arr1115 = c3644Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10118 = i6;
                                            int i1111111116 = i95;
                                            int i1111111117 = i5;
                                            iM43303 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM43303 == i106) {
                                                    int iM43301117 = c19067.m43305(c11021, iArr12[i10]);
                                                    c19067.m43307(abstractC17055.mo29010(c11021.f30517, c11021.f30522, c19067.m43320(cArr4, iM43301117), false), iM43301117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM43303 = c19067.m43303(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111118 = i90;
                                            int i1111111119 = i88;
                                            c183914 = c18396;
                                            c190610 = c19067;
                                            iM433012 = iM43303;
                                            i91 = i91;
                                            z5 = z5;
                                            c3644Arr6 = c3644Arr1115;
                                            i86 = i1111111116;
                                            i93 = i1111111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c190611 = c19068;
                                            i88 = i1111111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111118;
                                            i82 = i10;
                                            i83 = i10118;
                                            c18396 = c18396;
                                            i8 = i8;
                                            c19067 = c19067;
                                            i92 = i92;
                                            i90 = iM433017;
                                            abstractC17055 = abstractC17055;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c19068 = c19068;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c3644Arr6 = c3644Arr1115;
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
                            C3644 c36414 = c3644Arr6[i77];
                            if (c36414 != null) {
                                abstractC17055.mo30328(c36414);
                            }
                            if (i92 != 0 && (c11021.f30518 & 2) == 0) {
                                if (i146 != 0) {
                                    int iM433225 = c190610.m43323(i146) * 3;
                                    iArr = new int[iM433225];
                                    int i149 = i146 + 2;
                                    while (iM433225 > 0) {
                                        iArr[iM433225 - 1] = i149 + 6;
                                        iArr[iM433225 - 2] = c190610.m43323(i149 + 8);
                                        iM433225 -= 3;
                                        iArr[iM433225] = c190610.m43323(i149);
                                        i149 += 10;
                                    }
                                } else {
                                    iArr = null;
                                }
                                int iM433226 = c190610.m43323(i92);
                                int i150 = i92 + 2;
                                while (true) {
                                    int i151 = iM433226 - 1;
                                    if (iM433226 > 0) {
                                        int iM433227 = c190610.m43323(i150);
                                        int iM433228 = c190610.m43323(i150 + 2);
                                        String strM43328 = c190610.m43320(cArr6, i150 + 4);
                                        String strM43329 = c190610.m43320(cArr6, i150 + 6);
                                        int iM433229 = c190610.m43323(i150 + 8);
                                        i150 += 10;
                                        if (iArr == null) {
                                            strM43320 = null;
                                            break;
                                            break;
                                        }
                                        int i152 = 0;
                                        while (true) {
                                            if (i152 >= iArr.length) {
                                                strM43320 = null;
                                                break;
                                            }
                                            if (iArr[i152] == iM433227 && iArr[i152 + 1] == iM433229) {
                                                strM43320 = c190610.m43320(cArr6, iArr[i152 + 2]);
                                                break;
                                            }
                                            i152 += 3;
                                        }
                                        abstractC17055.mo29018(strM43328, strM43329, strM43320, c3644Arr6[iM433227], c3644Arr6[iM433227 + iM433228], iM433229);
                                        iM433226 = i151;
                                        c190610 = c190610;
                                    }
                                }
                            }
                            C19067 c190620 = c190610;
                            if (iArr21 != null) {
                                for (int i153 : iArr21) {
                                    int iM43317 = c190620.m43316(i153);
                                    if (iM43317 == 64 || iM43317 == 65) {
                                        int iM433020 = c190620.m43305(c11021, i153);
                                        c190620.m43307(abstractC17055.mo29011(c11021.f30517, c11021.f30522, c11021.f30528, c11021.f30525, c11021.f30524, c190620.m43320(cArr6, iM433020), true), iM433020 + 2, true, cArr6);
                                    }
                                }
                            }
                            if (iArr22 != null) {
                                for (int i154 : iArr22) {
                                    int iM43318 = c190620.m43316(i154);
                                    if (iM43318 == 64 || iM43318 == 65) {
                                        int iM433021 = c190620.m43305(c11021, i154);
                                        c190620.m43307(abstractC17055.mo29011(c11021.f30517, c11021.f30522, c11021.f30528, c11021.f30525, c11021.f30524, c190620.m43320(cArr6, iM433021), false), iM433021 + 2, true, cArr6);
                                    }
                                }
                            }
                            C18396 c183920 = c183914;
                            while (c183920 != null) {
                                C18396 c183921 = c183920.f54924;
                                c183920.f54924 = null;
                                abstractC17055.mo30332(c183920);
                                c183920 = c183921;
                            }
                            abstractC17055.mo30338(i148, i147);
                            abstractC17054 = abstractC17055;
                            i4 = i89;
                        }
                    }
                }
            }
        } else {
            abstractC17054 = abstractC17054Mo20834;
            i4 = i30;
        }
        abstractC17054.mo30337();
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3644 m43310(int i, C3644[] c3644Arr) {
        if (c3644Arr[i] == null) {
            c3644Arr[i] = new C3644();
        }
        C3644 c3644 = c3644Arr[i];
        c3644.f7650 = (short) (c3644.f7650 & (-2));
        return c3644;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۧ */
    private int[] m43313(AbstractC17054 abstractC17054, C11021 c11021, int i, boolean z) {
        int i2;
        char[] cArr = c11021.f30526;
        int iM43323 = m43323(i);
        int[] iArr = new int[iM43323];
        int iM43307 = i + 2;
        for (int i3 = 0; i3 < iM43323; i3++) {
            iArr[i3] = iM43307;
            int iM43319 = m43319(iM43307);
            int i4 = iM43319 >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int iM43324 = m43323(iM43307 + 1);
                                i2 = iM43307 + 3;
                                while (true) {
                                    int i5 = iM43324 - 1;
                                    if (iM43324 > 0) {
                                        int iM43325 = m43323(i2);
                                        int iM43326 = m43323(i2 + 2);
                                        i2 += 6;
                                        m43310(iM43325, c11021.f30532);
                                        m43310(iM43325 + iM43326, c11021.f30532);
                                        iM43324 = i5;
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
                                i2 = iM43307 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iM43307 + 3;
                        break;
                }
            } else {
                i2 = iM43307 + 3;
            }
            int iM43316 = m43316(i2);
            if (i4 == 66) {
                C24431 c24431 = iM43316 != 0 ? new C24431(this.f56879, i2) : null;
                int iM53892 = C24420.m53892(iM43316, 2, 1, i2);
                iM43307 = m43307(abstractC17054.mo29021(iM43319 & (-256), c24431, m43320(cArr, iM53892), z), iM53892 + 2, true, cArr);
            } else {
                iM43307 = m43307((AbstractC15773) null, C24420.m53892(iM43316, 2, 3, i2), true, cArr);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43303(int i, int[] iArr) {
        if (iArr == null || i >= iArr.length || m43316(iArr[i]) < 67) {
            return -1;
        }
        return m43323(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX INFO: renamed from: ֫ */
    private int m43305(C11021 c11021, int i) {
        int i2;
        int i3;
        int iM43319 = m43319(i);
        int i4 = iM43319 >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iM43319 & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM43319 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = iM43319 & (-65536);
                    i3 = i + 2;
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iM43319 & (-16777216);
                            int iM43323 = m43323(i + 1);
                            i3 = i + 3;
                            c11021.f30528 = new C3644[iM43323];
                            c11021.f30525 = new C3644[iM43323];
                            c11021.f30524 = new int[iM43323];
                            for (int i5 = 0; i5 < iM43323; i5++) {
                                int iM43324 = m43323(i3);
                                int iM43325 = m43323(i3 + 2);
                                int iM43326 = m43323(i3 + 4);
                                i3 += 6;
                                c11021.f30528[i5] = m43310(iM43324, c11021.f30532);
                                c11021.f30525[i5] = m43310(iM43324 + iM43325, c11021.f30532);
                                c11021.f30524[i5] = iM43326;
                            }
                            break;
                        case 66:
                            i2 = iM43319 & (-256);
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iM43319 & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iM43319 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = iM43319 & (-65536);
            i3 = i + 2;
        }
        c11021.f30517 = i2;
        int iM43316 = m43316(i3);
        c11021.f30522 = iM43316 == 0 ? null : new C24431(this.f56879, i3);
        return (iM43316 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43312(AbstractC17054 abstractC17054, C11021 c11021, int i, boolean z) {
        int iM43307 = i + 1;
        int i2 = this.f56879[i] & 255;
        abstractC17054.mo30327(i2, z);
        char[] cArr = c11021.f30526;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM43323 = m43323(iM43307);
            iM43307 += 2;
            while (true) {
                int i4 = iM43323 - 1;
                if (iM43323 > 0) {
                    iM43307 = m43307(abstractC17054.mo29009(i3, m43320(cArr, iM43307), z), iM43307 + 2, true, cArr);
                    iM43323 = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43307(AbstractC15773 abstractC15773, int i, boolean z, char[] cArr) {
        int iM43323 = m43323(i);
        int iM43306 = i + 2;
        if (!z) {
            while (true) {
                int i2 = iM43323 - 1;
                if (iM43323 <= 0) {
                    break;
                }
                iM43306 = m43306(abstractC15773, iM43306, (String) null, cArr);
                iM43323 = i2;
            }
        } else {
            while (true) {
                int i3 = iM43323 - 1;
                if (iM43323 <= 0) {
                    break;
                }
                iM43306 = m43306(abstractC15773, iM43306 + 2, m43320(cArr, iM43306), cArr);
                iM43323 = i3;
            }
        }
        if (abstractC15773 != null) {
            abstractC15773.mo22771();
        }
        return iM43306;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43306(AbstractC15773 abstractC15773, int i, String str, char[] cArr) {
        Object obj;
        byte[] bArr = this.f56879;
        int i2 = 0;
        if (abstractC15773 == null) {
            int i3 = bArr[i] & 255;
            if (i3 == 64) {
                return m43307((AbstractC15773) null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return m43307((AbstractC15773) null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                int[] iArr = this.f56882;
                if (i5 == 83) {
                    abstractC15773.mo22773(Short.valueOf((short) m43319(iArr[m43323(i4)])), str);
                    return i + 3;
                }
                if (i5 == 99) {
                    abstractC15773.mo22773(C13703.m31144(m43320(cArr, i4)), str);
                    return i + 3;
                }
                if (i5 == 101) {
                    abstractC15773.mo22774(str, m43320(cArr, i4), m43320(cArr, i + 3));
                    return i + 5;
                }
                if (i5 == 115) {
                    abstractC15773.mo22773(m43320(cArr, i4), str);
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (m43319(iArr[m43323(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        abstractC15773.mo22773(obj, str);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                abstractC15773.mo22773(Byte.valueOf((byte) m43319(iArr[m43323(i4)])), str);
                                return i + 3;
                            case 67:
                                abstractC15773.mo22773(Character.valueOf((char) m43319(iArr[m43323(i4)])), str);
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int iM43323 = m43323(i4);
                        int i6 = i + 3;
                        if (iM43323 == 0) {
                            return m43307(abstractC15773.mo22769(str), i4, false, cArr);
                        }
                        int i7 = bArr[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[iM43323];
                            while (i2 < iM43323) {
                                fArr[i2] = Float.intBitsToFloat(m43319(iArr[m43323(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            abstractC15773.mo22773(fArr, str);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[iM43323];
                            while (i2 < iM43323) {
                                sArr[i2] = (short) m43319(iArr[m43323(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC15773.mo22773(sArr, str);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[iM43323];
                            for (int i8 = 0; i8 < iM43323; i8++) {
                                zArr[i8] = m43319(iArr[m43323(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            abstractC15773.mo22773(zArr, str);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr2 = new int[iM43323];
                            while (i2 < iM43323) {
                                iArr2[i2] = m43319(iArr[m43323(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC15773.mo22773(iArr2, str);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr2 = new byte[iM43323];
                                    while (i2 < iM43323) {
                                        bArr2[i2] = (byte) m43319(iArr[m43323(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC15773.mo22773(bArr2, str);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[iM43323];
                                    while (i2 < iM43323) {
                                        cArr2[i2] = (char) m43319(iArr[m43323(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC15773.mo22773(cArr2, str);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[iM43323];
                                    while (i2 < iM43323) {
                                        dArr[i2] = Double.longBitsToDouble(m43321(iArr[m43323(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC15773.mo22773(dArr, str);
                                    return i6;
                                default:
                                    return m43307(abstractC15773.mo22769(str), i4, false, cArr);
                            }
                        }
                        long[] jArr = new long[iM43323];
                        while (i2 < iM43323) {
                            jArr[i2] = m43321(iArr[m43323(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        abstractC15773.mo22773(jArr, str);
                        return i6;
                    }
                }
            }
            abstractC15773.mo22773(m43317(cArr, m43323(i4)), str);
            return i + 3;
        }
        return m43307(abstractC15773.mo22770(str, m43320(cArr, i4)), i + 3, true, cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43304(int i, Object[] objArr, int i2, char[] cArr, C3644[] c3644Arr) {
        int i3 = i + 1;
        switch (this.f56879[i] & 255) {
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
                objArr[i2] = m43314(cArr, i3);
                break;
            case 8:
                objArr[i2] = m43310(m43323(i3), c3644Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43315() {
        int i = this.f56880;
        int iM43323 = (m43323(i + 6) * 2) + i + 8;
        int iM43324 = m43323(iM43323);
        int iM43319 = iM43323 + 2;
        while (true) {
            int i2 = iM43324 - 1;
            if (iM43324 <= 0) {
                break;
            }
            int iM43325 = m43323(iM43319 + 6);
            iM43319 += 8;
            while (true) {
                int i3 = iM43325 - 1;
                if (iM43325 > 0) {
                    iM43319 += m43319(iM43319 + 2) + 6;
                    iM43325 = i3;
                }
            }
            iM43324 = i2;
        }
        int iM43326 = m43323(iM43319);
        int iM433110 = iM43319 + 2;
        while (true) {
            int i4 = iM43326 - 1;
            if (iM43326 <= 0) {
                return iM433110 + 2;
            }
            int iM43327 = m43323(iM433110 + 6);
            iM433110 += 8;
            while (true) {
                int i5 = iM43327 - 1;
                if (iM43327 > 0) {
                    iM433110 += m43319(iM433110 + 2) + 6;
                    iM43327 = i5;
                }
            }
            iM43326 = i4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C18396 m43311(C18396[] c18396Arr, String str, int i, int i2, char[] cArr, int i3, C3644[] c3644Arr) {
        if (i2 > this.f56879.length - i) {
            throw new IllegalArgumentException();
        }
        for (C18396 c18396 : c18396Arr) {
            if (c18396.f54925.equals(str)) {
                return c18396.m41873(this, i, i2, cArr);
            }
        }
        return new C18396(str).m41873(this, i, i2, (char[]) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43316(int i) {
        return this.f56879[i] & 255;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m43323(int i) {
        byte[] bArr = this.f56879;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final short m43324(int i) {
        byte[] bArr = this.f56879;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43319(int i) {
        byte[] bArr = this.f56879;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m43321(int i) {
        return (((long) m43319(i)) << 32) | (((long) m43319(i + 4)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m43320(char[] cArr, int i) {
        int iM43323 = m43323(i);
        if (i == 0 || iM43323 == 0) {
            return null;
        }
        return m43322(cArr, iM43323);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m43322(char[] cArr, int i) {
        String[] strArr = this.f56883;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f56882[i];
        String strM43309 = m43309(cArr, i2 + 2, m43323(i2));
        strArr[i] = strM43309;
        return strM43309;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m43309(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f56879;
            byte b = bArr[i];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                cArr[i5] = (char) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                i5++;
                i = i6;
            } else {
                if ((b & C0684bo.f2506k) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & C0684bo.f2505j) << 6) + (bArr[i6] & 63));
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

    /* JADX INFO: renamed from: ᩳ */
    private String m43314(char[] cArr, int i) {
        return m43320(cArr, this.f56882[m43323(i)]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m43317(char[] cArr, int i) {
        int[] iArr = this.f56882;
        int i2 = iArr[i];
        byte[] bArr = this.f56879;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m43319(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m43319(i2)));
            case 5:
                return Long.valueOf(m43321(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m43321(i2)));
            case 7:
                return C13703.m31148(m43320(cArr, i2));
            case 8:
                return m43320(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int iM43316 = m43316(i2);
                        int i3 = iArr[m43323(i2 + 1)];
                        int i4 = iArr[m43323(i3 + 2)];
                        return new C2973(iM43316, m43314(cArr, i3), m43320(cArr, i4), m43320(cArr, i4 + 2), bArr[i3 - 1] == 11);
                    case 16:
                        return C13703.m31149(m43320(cArr, i2));
                    case 17:
                        C22421[] c22421Arr = this.f56881;
                        C22421 c22421 = c22421Arr[i];
                        if (c22421 != null) {
                            return c22421;
                        }
                        int i5 = iArr[m43323(i2 + 2)];
                        String strM43320 = m43320(cArr, i5);
                        String strM43321 = m43320(cArr, i5 + 2);
                        int i6 = this.f56878[m43323(i2)];
                        C2973 c2973 = (C2973) m43317(cArr, m43323(i6));
                        int iM43323 = m43323(i6 + 2);
                        Object[] objArr = new Object[iM43323];
                        int i7 = i6 + 4;
                        for (int i8 = 0; i8 < iM43323; i8++) {
                            objArr[i8] = m43317(cArr, m43323(i7));
                            i7 += 2;
                        }
                        C22421 c22422 = new C22421(strM43320, strM43321, c2973, objArr);
                        c22421Arr[i] = c22422;
                        return c22422;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
