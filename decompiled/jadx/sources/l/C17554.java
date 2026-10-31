package l;

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
public final class C17554 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f53655 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18260 f53656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f53658;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f53660 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f53661 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f53659 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C17554(List list) {
        if (list != null && !list.isEmpty()) {
            this.f53657 = true;
            String strM11021 = C3603.m11021((byte[]) list.get(0));
            C22632.m50631(strM11021.startsWith("Format:"));
            C18260 c18260M42596 = C18260.m42596(strM11021);
            c18260M42596.getClass();
            this.f53656 = c18260M42596;
            m41044(new C17714((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f53657 = false;
        this.f53656 = null;
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
    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        Charset charset;
        long j;
        C17714 c17714;
        int i3;
        C6971 c6971;
        float f;
        SpannableString spannableString;
        C21927 c21927;
        int i4;
        PointF pointF;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int iM49400;
        float f2;
        float f3;
        int iM49395;
        C19811 c19811M49383;
        int iM41042;
        int iM41043;
        boolean z;
        Integer num;
        Integer num2;
        int i7;
        int i8;
        float f4;
        boolean z2;
        int i9;
        int i10;
        C17554 c17554 = this;
        long j2 = c21062.f67934;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C17714 c17715 = c17554.f53659;
        c17715.m41462(i + i2, bArr);
        c17715.m41484(i);
        Charset charsetM41475 = c17715.m41475();
        if (charsetM41475 == null) {
            charsetM41475 = StandardCharsets.UTF_8;
        }
        boolean z3 = c17554.f53657;
        if (!z3) {
            c17554.m41044(c17715, charsetM41475);
        }
        C18260 c18260M42596 = z3 ? c17554.f53656 : null;
        while (true) {
            String strM41474 = c17715.m41474(charsetM41475);
            if (strM41474 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c21062.f67933) ? null : new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    List list = (List) arrayList.get(i11);
                    if (!list.isEmpty() || i11 == 0) {
                        if (i11 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i11)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i11 + 1)).longValue();
                        C12866 c12866 = new C12866(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            interfaceC23483.accept(c12866);
                        } else if (arrayList3 != null) {
                            arrayList3.add(c12866);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC23483.accept((C12866) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM41474.startsWith("Format:")) {
                c18260M42596 = C18260.m42596(strM41474);
            } else {
                if (strM41474.startsWith("Dialogue:")) {
                    if (c18260M42596 == null) {
                        C19956.m46037("Skipping dialogue line before complete format: ".concat(strM41474));
                    } else {
                        int i12 = c18260M42596.f56786;
                        C22632.m50631(strM41474.startsWith("Dialogue:"));
                        String strSubstring = strM41474.substring(9);
                        int i13 = c18260M42596.f56784;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            C19956.m46037("Skipping dialogue line with fewer columns than format: ".concat(strM41474));
                        } else {
                            if (i13 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i13].trim());
                                } catch (RuntimeException unused) {
                                    C19956.m46037("Fail to parse layer: " + strArrSplit[i13]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jM41043 = m41043(strArrSplit[c18260M42596.f56788]);
                            if (jM41043 == -9223372036854775807L) {
                                C19956.m46037("Skipping invalid timing: ".concat(strM41474));
                            } else {
                                charset = charsetM41475;
                                long jM41044 = m41043(strArrSplit[c18260M42596.f56783]);
                                if (jM41044 == -9223372036854775807L || jM41044 <= jM41043) {
                                    j = j2;
                                    c17714 = c17715;
                                    C19956.m46037("Skipping invalid timing: ".concat(strM41474));
                                } else {
                                    LinkedHashMap linkedHashMap = c17554.f53658;
                                    if (linkedHashMap != null) {
                                        int i14 = c18260M42596.f56787;
                                        c17714 = c17715;
                                        c6971 = i14 != -1 ? (C6971) linkedHashMap.get(strArrSplit[i14].trim()) : null;
                                        String str = strArrSplit[c18260M42596.f56785];
                                        C23904 c23904M52657 = C23904.m52657(str);
                                        String strReplace = C23904.m52659(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC9361.f28423);
                                        float f5 = c17554.f53660;
                                        f = c17554.f53661;
                                        spannableString = new SpannableString(strReplace);
                                        c21927 = new C21927();
                                        c21927.m49389(spannableString);
                                        c21927.m49399(i3);
                                        if (c6971 != null) {
                                            z = c6971.f21494;
                                            num = c6971.f21497;
                                            j = j2;
                                            num2 = c6971.f21489;
                                            if (num2 != null) {
                                                i7 = 0;
                                                i8 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                i7 = 0;
                                                i8 = 33;
                                            }
                                            if (c6971.f21493 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                            }
                                            f4 = c6971.f21495;
                                            if (f4 != -3.4028235E38f && f != -3.4028235E38f) {
                                                c21927.m49392(f4 / f, 1);
                                            }
                                            z2 = c6971.f21491;
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
                                            if (c6971.f21490) {
                                                spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                            }
                                            if (c6971.f21496) {
                                                spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                            }
                                        } else {
                                            jM41044 = jM41044;
                                            j = j2;
                                        }
                                        i4 = c23904M52657.f77290;
                                        pointF = c23904M52657.f77291;
                                        if (i4 == -1) {
                                            if (c6971 != null) {
                                                i4 = c6971.f21488;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C8083.m21451(i4, "Unknown alignment: ");
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
                                        c21927.m49394(alignment);
                                        i5 = Integer.MIN_VALUE;
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C8083.m21451(i4, "Unknown alignment: ");
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
                                        c21927.m49393(i6);
                                        switch (i4) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                C8083.m21451(i4, "Unknown alignment: ");
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
                                        c21927.m49386(i5);
                                        if (pointF != null || f == -3.4028235E38f || f5 == -3.4028235E38f) {
                                            iM49400 = c21927.m49400();
                                            f2 = 0.05f;
                                            if (iM49400 == 0) {
                                                f3 = 0.05f;
                                            } else if (iM49400 == 1) {
                                                f3 = 0.5f;
                                            } else if (iM49400 != 2) {
                                                f3 = -3.4028235E38f;
                                            } else {
                                                f3 = 0.95f;
                                            }
                                            c21927.m49391(f3);
                                            iM49395 = c21927.m49395();
                                            if (iM49395 != 0) {
                                                if (iM49395 == 1) {
                                                    f2 = 0.5f;
                                                } else if (iM49395 != 2) {
                                                    f2 = -3.4028235E38f;
                                                } else {
                                                    f2 = 0.95f;
                                                }
                                            }
                                            c21927.m49385(f2, 0);
                                        } else {
                                            c21927.m49391(pointF.x / f5);
                                            c21927.m49385(pointF.y / f, 0);
                                        }
                                        c19811M49383 = c21927.m49383();
                                        iM41043 = m41042(jM41044, arrayList2, arrayList);
                                        for (iM41042 = m41042(jM41043, arrayList2, arrayList); iM41042 < iM41043; iM41042++) {
                                            ((List) arrayList.get(iM41042)).add(c19811M49383);
                                        }
                                    } else {
                                        c17714 = c17715;
                                    }
                                    String str2 = strArrSplit[c18260M42596.f56785];
                                    C23904 c23904M52658 = C23904.m52657(str2);
                                    String strReplace2 = C23904.m52659(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC9361.f28423);
                                    float f6 = c17554.f53660;
                                    f = c17554.f53661;
                                    spannableString = new SpannableString(strReplace2);
                                    c21927 = new C21927();
                                    c21927.m49389(spannableString);
                                    c21927.m49399(i3);
                                    if (c6971 != null) {
                                        z = c6971.f21494;
                                        num = c6971.f21497;
                                        j = j2;
                                        num2 = c6971.f21489;
                                        if (num2 != null) {
                                            i7 = 0;
                                            i8 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 0;
                                            i8 = 33;
                                        }
                                        if (c6971.f21493 == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                        }
                                        f4 = c6971.f21495;
                                        if (f4 != -3.4028235E38f) {
                                            c21927.m49392(f4 / f, 1);
                                        }
                                        z2 = c6971.f21491;
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
                                        if (c6971.f21490) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (c6971.f21496) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                    } else {
                                        jM41044 = jM41044;
                                        j = j2;
                                    }
                                    i4 = c23904M52658.f77290;
                                    pointF = c23904M52658.f77291;
                                    if (i4 == -1) {
                                        if (c6971 != null) {
                                            i4 = c6971.f21488;
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C8083.m21451(i4, "Unknown alignment: ");
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
                                    c21927.m49394(alignment);
                                    i5 = Integer.MIN_VALUE;
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C8083.m21451(i4, "Unknown alignment: ");
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
                                    c21927.m49393(i6);
                                    switch (i4) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            C8083.m21451(i4, "Unknown alignment: ");
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
                                    c21927.m49386(i5);
                                    if (pointF != null) {
                                        iM49400 = c21927.m49400();
                                        f2 = 0.05f;
                                        if (iM49400 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM49400 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM49400 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c21927.m49391(f3);
                                        iM49395 = c21927.m49395();
                                        if (iM49395 != 0) {
                                            if (iM49395 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM49395 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c21927.m49385(f2, 0);
                                    } else {
                                        iM49400 = c21927.m49400();
                                        f2 = 0.05f;
                                        if (iM49400 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM49400 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM49400 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c21927.m49391(f3);
                                        iM49395 = c21927.m49395();
                                        if (iM49395 != 0) {
                                            if (iM49395 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM49395 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c21927.m49385(f2, 0);
                                    }
                                    c19811M49383 = c21927.m49383();
                                    iM41043 = m41042(jM41044, arrayList2, arrayList);
                                    while (iM41042 < iM41043) {
                                        ((List) arrayList.get(iM41042)).add(c19811M49383);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM41475;
                    j = j2;
                    c17714 = c17715;
                } else {
                    charset = charsetM41475;
                    j = j2;
                    c17714 = c17715;
                }
                c17554 = this;
                c18260M42596 = c18260M42596;
                c17715 = c17714;
                charsetM41475 = charset;
                j2 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41044(C17714 c17714, Charset charset) {
        while (true) {
            String strM41474 = c17714.m41474(charset);
            if (strM41474 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM41474)) {
                while (true) {
                    String strM41475 = c17714.m41474(charset);
                    if (strM41475 == null || (c17714.m41457() != 0 && c17714.m41458(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM41475.split(":");
                    if (strArrSplit.length == 2) {
                        String strM35799 = C15107.m35799(strArrSplit[0].trim());
                        strM35799.getClass();
                        if (strM35799.equals("playresx")) {
                            this.f53660 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM35799.equals("playresy")) {
                            try {
                                this.f53661 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (!"[V4+ Styles]".equalsIgnoreCase(strM41474)) {
                if ("[V4 Styles]".equalsIgnoreCase(strM41474)) {
                    C19956.m46035("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM41474)) {
                    return;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C14731 c14731M35039 = null;
                while (true) {
                    String strM41476 = c17714.m41474(charset);
                    if (strM41476 == null || (c17714.m41457() != 0 && c17714.m41458(charset) == 91)) {
                        break;
                    }
                    if (strM41476.startsWith("Format:")) {
                        c14731M35039 = C14731.m35039(strM41476);
                    } else if (strM41476.startsWith("Style:")) {
                        if (c14731M35039 == null) {
                            C19956.m46037("Skipping 'Style:' line before 'Format:' line: ".concat(strM41476));
                        } else {
                            C6971 c6971M18845 = C6971.m18845(strM41476, c14731M35039);
                            if (c6971M18845 != null) {
                                linkedHashMap.put(c6971M18845.f21492, c6971M18845);
                            }
                        }
                    }
                }
                this.f53658 = linkedHashMap;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m41043(String str) {
        Matcher matcher = f53655.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = C3603.f11424;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41042(long j, ArrayList arrayList, ArrayList arrayList2) {
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
