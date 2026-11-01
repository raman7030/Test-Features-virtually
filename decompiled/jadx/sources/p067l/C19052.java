package p067l;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28LT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19052 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f56845 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: ֫ */
    public final C19723 f56846;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56847;

    /* JADX INFO: renamed from: ܳ */
    public LinkedHashMap f56848;

    /* JADX INFO: renamed from: ܿ */
    public float f56850 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩳ */
    public float f56851 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f56849 = new C19203();

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    public C19052(List list) {
        if (list != null && !list.isEmpty()) {
            this.f56847 = true;
            String strM12997 = C5792.m12997((byte[]) list.get(0));
            C23877.m52957(strM12997.startsWith("Format:"));
            C19723 c19723M44855 = C19723.m44855(strM12997);
            c19723M44855.getClass();
            this.f56846 = c19723M44855;
            m43290(new C19203((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f56847 = false;
        this.f56846 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0217  */
    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    /* JADX WARN: Code duplicated, block: B:111:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0247  */
    /* JADX WARN: Code duplicated, block: B:114:0x024b  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0260 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:122:0x0266  */
    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0280 A[LOOP:1: B:126:0x027e->B:127:0x0280, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        Charset charset;
        long j;
        C19203 c19203;
        int i3;
        C8994 c8994;
        float f;
        SpannableString spannableString;
        C23207 c23207;
        int i4;
        PointF pointF;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int iM51737;
        float f2;
        float f3;
        int iM51732;
        C21196 c21196M51720;
        int iM43288;
        int iM43289;
        boolean z;
        Integer num;
        Integer num2;
        int i7;
        int i8;
        float f4;
        boolean z2;
        int i9;
        int i10;
        C19052 c19052 = this;
        long j2 = c22386.f70618;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C19203 c19204 = c19052.f56849;
        c19204.m43708(i + i2, bArr);
        c19204.m43730(i);
        Charset charsetM43721 = c19204.m43721();
        if (charsetM43721 == null) {
            charsetM43721 = StandardCharsets.UTF_8;
        }
        boolean z3 = c19052.f56847;
        if (!z3) {
            c19052.m43290(c19204, charsetM43721);
        }
        C19723 c19723M44855 = z3 ? c19052.f56846 : null;
        while (true) {
            String strM43720 = c19204.m43720(charsetM43721);
            if (strM43720 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c22386.f70617) ? null : new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    List list = (List) arrayList.get(i11);
                    if (!list.isEmpty() || i11 == 0) {
                        if (i11 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i11)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i11 + 1)).longValue();
                        C14596 c14596 = new C14596(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            interfaceC24686.accept(c14596);
                        } else if (arrayList3 != null) {
                            arrayList3.add(c14596);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC24686.accept((C14596) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM43720.startsWith("Format:")) {
                c19723M44855 = C19723.m44855(strM43720);
            } else {
                if (strM43720.startsWith("Dialogue:")) {
                    if (c19723M44855 == null) {
                        C21334.m48351("Skipping dialogue line before complete format: ".concat(strM43720));
                    } else {
                        int i12 = c19723M44855.f60003;
                        C23877.m52957(strM43720.startsWith("Dialogue:"));
                        String strSubstring = strM43720.substring(9);
                        int i13 = c19723M44855.f60001;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            C21334.m48351("Skipping dialogue line with fewer columns than format: ".concat(strM43720));
                        } else {
                            if (i13 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i13].trim());
                                } catch (RuntimeException unused) {
                                    C21334.m48351("Fail to parse layer: " + strArrSplit[i13]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jM43289 = m43289(strArrSplit[c19723M44855.f60005]);
                            if (jM43289 == -9223372036854775807L) {
                                C21334.m48351("Skipping invalid timing: ".concat(strM43720));
                            } else {
                                charset = charsetM43721;
                                long jM432810 = m43289(strArrSplit[c19723M44855.f60000]);
                                if (jM432810 == -9223372036854775807L || jM432810 <= jM43289) {
                                    j = j2;
                                    c19203 = c19204;
                                    C21334.m48351("Skipping invalid timing: ".concat(strM43720));
                                } else {
                                    LinkedHashMap linkedHashMap = c19052.f56848;
                                    if (linkedHashMap != null) {
                                        int i14 = c19723M44855.f60004;
                                        c19203 = c19204;
                                        c8994 = i14 != -1 ? (C8994) linkedHashMap.get(strArrSplit[i14].trim()) : null;
                                        String str = strArrSplit[c19723M44855.f60002];
                                        C25087 c25087M55066 = C25087.m55066(str);
                                        String strReplace = C25087.m55068(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC11265.f31372);
                                        float f5 = c19052.f56850;
                                        f = c19052.f56851;
                                        spannableString = new SpannableString(strReplace);
                                        c23207 = new C23207();
                                        c23207.m51726(spannableString);
                                        c23207.m51736(i3);
                                        if (c8994 != null) {
                                            z = c8994.f24374;
                                            num = c8994.f24377;
                                            j = j2;
                                            num2 = c8994.f24369;
                                            if (num2 != null) {
                                                i7 = 0;
                                                i8 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                i7 = 0;
                                                i8 = 33;
                                            }
                                            if (c8994.f24373 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                            }
                                            f4 = c8994.f24375;
                                            if (f4 != -3.4028235E38f && f != -3.4028235E38f) {
                                                c23207.m51729(f4 / f, 1);
                                            }
                                            z2 = c8994.f24371;
                                            if (z2 || !z) {
                                                i9 = 0;
                                                i10 = 33;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else {
                                                i9 = 0;
                                                i10 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            }
                                            if (c8994.f24370) {
                                                spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                            }
                                            if (c8994.f24376) {
                                                spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                            }
                                        } else {
                                            jM432810 = jM432810;
                                            j = j2;
                                        }
                                        i4 = c25087M55066.f80041;
                                        pointF = c25087M55066.f80042;
                                        if (i4 == -1) {
                                            if (c8994 != null) {
                                                i4 = c8994.f24368;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C10050.m23419(i4, "Unknown alignment: ");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        c23207.m51731(alignment);
                                        i5 = Integer.MIN_VALUE;
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C10050.m23419(i4, "Unknown alignment: ");
                                            case -1:
                                                i6 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i6 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i6 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i6 = 2;
                                                break;
                                        }
                                        c23207.m51730(i6);
                                        switch (i4) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                C10050.m23419(i4, "Unknown alignment: ");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i5 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i5 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i5 = 0;
                                                break;
                                        }
                                        c23207.m51723(i5);
                                        if (pointF != null || f == -3.4028235E38f || f5 == -3.4028235E38f) {
                                            iM51737 = c23207.m51737();
                                            f2 = 0.05f;
                                            if (iM51737 == 0) {
                                                f3 = 0.05f;
                                            } else if (iM51737 == 1) {
                                                f3 = 0.5f;
                                            } else if (iM51737 != 2) {
                                                f3 = -3.4028235E38f;
                                            } else {
                                                f3 = 0.95f;
                                            }
                                            c23207.m51728(f3);
                                            iM51732 = c23207.m51732();
                                            if (iM51732 != 0) {
                                                if (iM51732 == 1) {
                                                    f2 = 0.5f;
                                                } else if (iM51732 != 2) {
                                                    f2 = -3.4028235E38f;
                                                } else {
                                                    f2 = 0.95f;
                                                }
                                            }
                                            c23207.m51722(f2, 0);
                                        } else {
                                            c23207.m51728(pointF.x / f5);
                                            c23207.m51722(pointF.y / f, 0);
                                        }
                                        c21196M51720 = c23207.m51720();
                                        iM43289 = m43288(jM432810, arrayList2, arrayList);
                                        for (iM43288 = m43288(jM43289, arrayList2, arrayList); iM43288 < iM43289; iM43288++) {
                                            ((List) arrayList.get(iM43288)).add(c21196M51720);
                                        }
                                    } else {
                                        c19203 = c19204;
                                    }
                                    String str2 = strArrSplit[c19723M44855.f60002];
                                    C25087 c25087M55067 = C25087.m55066(str2);
                                    String strReplace2 = C25087.m55068(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC11265.f31372);
                                    float f6 = c19052.f56850;
                                    f = c19052.f56851;
                                    spannableString = new SpannableString(strReplace2);
                                    c23207 = new C23207();
                                    c23207.m51726(spannableString);
                                    c23207.m51736(i3);
                                    if (c8994 != null) {
                                        z = c8994.f24374;
                                        num = c8994.f24377;
                                        j = j2;
                                        num2 = c8994.f24369;
                                        if (num2 != null) {
                                            i7 = 0;
                                            i8 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 0;
                                            i8 = 33;
                                        }
                                        if (c8994.f24373 == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                        }
                                        f4 = c8994.f24375;
                                        if (f4 != -3.4028235E38f) {
                                            c23207.m51729(f4 / f, 1);
                                        }
                                        z2 = c8994.f24371;
                                        if (z2) {
                                            i9 = 0;
                                            i10 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else {
                                            i9 = 0;
                                            i10 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c8994.f24370) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (c8994.f24376) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                    } else {
                                        jM432810 = jM432810;
                                        j = j2;
                                    }
                                    i4 = c25087M55067.f80041;
                                    pointF = c25087M55067.f80042;
                                    if (i4 == -1) {
                                        if (c8994 != null) {
                                            i4 = c8994.f24368;
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C10050.m23419(i4, "Unknown alignment: ");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    c23207.m51731(alignment);
                                    i5 = Integer.MIN_VALUE;
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C10050.m23419(i4, "Unknown alignment: ");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    c23207.m51730(i6);
                                    switch (i4) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            C10050.m23419(i4, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i5 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i5 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i5 = 0;
                                            break;
                                    }
                                    c23207.m51723(i5);
                                    if (pointF != null) {
                                        iM51737 = c23207.m51737();
                                        f2 = 0.05f;
                                        if (iM51737 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM51737 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM51737 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c23207.m51728(f3);
                                        iM51732 = c23207.m51732();
                                        if (iM51732 != 0) {
                                            if (iM51732 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM51732 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c23207.m51722(f2, 0);
                                    } else {
                                        iM51737 = c23207.m51737();
                                        f2 = 0.05f;
                                        if (iM51737 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM51737 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM51737 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c23207.m51728(f3);
                                        iM51732 = c23207.m51732();
                                        if (iM51732 != 0) {
                                            if (iM51732 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM51732 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c23207.m51722(f2, 0);
                                    }
                                    c21196M51720 = c23207.m51720();
                                    iM43289 = m43288(jM432810, arrayList2, arrayList);
                                    while (iM43288 < iM43289) {
                                        ((List) arrayList.get(iM43288)).add(c21196M51720);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM43721;
                    j = j2;
                    c19203 = c19204;
                } else {
                    charset = charsetM43721;
                    j = j2;
                    c19203 = c19204;
                }
                c19052 = this;
                c19723M44855 = c19723M44855;
                c19204 = c19203;
                charsetM43721 = charset;
                j2 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43290(C19203 c19203, Charset charset) {
        while (true) {
            String strM43720 = c19203.m43720(charset);
            if (strM43720 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM43720)) {
                while (true) {
                    String strM43721 = c19203.m43720(charset);
                    if (strM43721 == null || (c19203.m43703() != 0 && c19203.m43704(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM43721.split(":");
                    if (strArrSplit.length == 2) {
                        String strM37957 = C16726.m37957(strArrSplit[0].trim());
                        strM37957.getClass();
                        if (strM37957.equals("playresx")) {
                            this.f56850 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM37957.equals("playresy")) {
                            try {
                                this.f56851 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (!"[V4+ Styles]".equalsIgnoreCase(strM43720)) {
                if ("[V4 Styles]".equalsIgnoreCase(strM43720)) {
                    C21334.m48349("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM43720)) {
                    return;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C16369 c16369M37186 = null;
                while (true) {
                    String strM43722 = c19203.m43720(charset);
                    if (strM43722 == null || (c19203.m43703() != 0 && c19203.m43704(charset) == 91)) {
                        break;
                    }
                    if (strM43722.startsWith("Format:")) {
                        c16369M37186 = C16369.m37186(strM43722);
                    } else if (strM43722.startsWith("Style:")) {
                        if (c16369M37186 == null) {
                            C21334.m48351("Skipping 'Style:' line before 'Format:' line: ".concat(strM43722));
                        } else {
                            C8994 c8994M20799 = C8994.m20799(strM43722, c16369M37186);
                            if (c8994M20799 != null) {
                                linkedHashMap.put(c8994M20799.f24372, c8994M20799);
                            }
                        }
                    }
                }
                this.f56848 = linkedHashMap;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m43289(String str) {
        Matcher matcher = f56845.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = C5792.f14228;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43288(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }
}
