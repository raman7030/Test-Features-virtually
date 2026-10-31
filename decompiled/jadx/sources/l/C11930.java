package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11930 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f35662;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35663;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35664 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35665;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19012 f35666;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35667;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f35668;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f35669;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f35670;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f35671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f35672;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f35673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f35674;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f35675;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29111(int i) {
        return i == 15 || i == 19 || i == 8 || i == 17;
    }

    public C11930(CharSequence charSequence, C1875 c1875, C8931 c8931, C3463 c3463, C12635 c12635, boolean z, C19012 c19012) {
        String string;
        this.f35670 = charSequence;
        this.f35668 = z;
        if (c3463.m10602()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c3463.m10601());
            if (iMax < 0) {
                throw new IllegalArgumentException(C19370.m44628(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C18307.m42645(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f35672 = string;
        this.f35662 = c12635.m30896();
        this.f35675 = c12635.m30897().isEmpty() ? C20813.m47629(charSequence) : c12635.m30897();
        this.f35669 = c12635.m30898();
        this.f35666 = c19012;
        int[] iArr = new int[c1875.size()];
        Arrays.fill(iArr, -1);
        for (InterfaceC0463 interfaceC0463 : c1875.m6210()) {
            C20813.m47630();
            if (interfaceC0463.mo2050() == 0 && interfaceC0463.getType() != -1) {
                iArr[interfaceC0463.mo2052()] = this.f35664.size();
                this.f35664.add(interfaceC0463);
            }
        }
        int[] iArr2 = new int[this.f35664.size()];
        this.f35674 = iArr2;
        Arrays.fill(iArr2, -1);
        int size = this.f35664.size() + 1;
        this.f35673 = new int[size];
        this.f35671 = new int[size];
        this.f35667 = new boolean[size];
        this.f35665 = new boolean[this.f35664.size()];
        this.f35663 = new boolean[this.f35664.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8931);
        while (!arrayDeque.isEmpty()) {
            C20813.m47630();
            InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque.pop();
            if (interfaceC16174 instanceof C8931) {
                C8931 c8932 = (C8931) interfaceC16174;
                int iMo1085 = c8932.mo1085();
                if (iMo1085 == 5 || iMo1085 == 6 || iMo1085 == 7 || iMo1085 == 8) {
                    InterfaceC0463 interfaceC0464 = c8932.f27156;
                    InterfaceC0463 interfaceC0465 = c8932.f27155;
                    if (interfaceC0464 != null && interfaceC0465 != null && interfaceC0464.mo2052() >= 0 && interfaceC0465.mo2052() >= 0) {
                        int i2 = iArr[interfaceC0464.mo2052()];
                        int i3 = iArr[interfaceC0465.mo2052()];
                        if (i2 >= 0 && i3 > i2) {
                            int iM29113 = m29113(i2);
                            int iM29114 = m29113(i3);
                            if ((iM29113 == 15 && iM29114 == 16) || ((iM29113 == 17 && iM29114 == 18) || ((iM29113 == 8 || iM29113 == 19) && iM29114 == 20))) {
                                int[] iArr3 = this.f35674;
                                iArr3[i2] = i3;
                                iArr3[i3] = i2;
                            }
                        }
                    }
                }
                for (int childCount = c8932.getChildCount() - 1; childCount >= 0; childCount--) {
                    arrayDeque.push(c8932.mo23040(childCount));
                }
            }
        }
        for (int i4 = 0; i4 < this.f35664.size(); i4++) {
            C20813.m47630();
            if (m29111(m29113(i4)) && this.f35674[i4] < 0) {
                m29108(i4, this.f35664.size() + 1);
                return;
            }
            if (m29113(i4) == 7) {
                this.f35667[i4 + 1] = true;
            }
            if (m29113(i4) == 24 && ((InterfaceC0463) this.f35664.get(i4)).getText().equals("\\")) {
                this.f35667[i4 + 1] = true;
            }
            int iM29115 = m29113(i4);
            if ((iM29115 == 16 || iM29115 == 20 || iM29115 == 18) && this.f35674[i4] < 0) {
                boolean[] zArr = this.f35667;
                zArr[i4 + 1] = true;
                zArr[i4] = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29115(EnumC13340 enumC13340) {
        ArrayList arrayList = this.f35664;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int[] iArr = this.f35673;
        iArr[size] = 1;
        iArr[0] = 1;
        if (enumC13340 != EnumC13340.COMPONENT_VALUES) {
            m29109(0, arrayList.size(), 0, enumC13340 == EnumC13340.DECLARATION_LIST);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:218:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0301  */
    /* JADX WARN: Code duplicated, block: B:223:0x0315  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:227:0x033b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0341  */
    /* JADX WARN: Code duplicated, block: B:231:0x0359  */
    /* JADX WARN: Code duplicated, block: B:242:0x0383  */
    /* JADX WARN: Code duplicated, block: B:246:0x0395  */
    /* JADX WARN: Code duplicated, block: B:248:0x039c A[PHI: r4 r9
      0x039c: PHI (r4v19 int) = (r4v4 int), (r4v4 int), (r4v21 int) binds: [B:224:0x0331, B:228:0x033f, B:388:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r9v9 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v2 java.util.ArrayList), (r9v11 java.util.ArrayList) binds: [B:224:0x0331, B:228:0x033f, B:388:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:255:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:257:0x03be  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:273:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:294:0x042d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0434  */
    /* JADX WARN: Code duplicated, block: B:297:0x0444  */
    /* JADX WARN: Code duplicated, block: B:299:0x0448  */
    /* JADX WARN: Code duplicated, block: B:301:0x044c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0457  */
    /* JADX WARN: Code duplicated, block: B:305:0x045e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0463  */
    /* JADX WARN: Code duplicated, block: B:332:0x04b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:344:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:347:0x04dd A[LOOP:2: B:343:0x04d1->B:347:0x04dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:350:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29109(int i, int i2, int i3, boolean z) {
        int[] iArr;
        int i4;
        int i5;
        int length;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMo2053;
        int i15;
        ArrayList arrayList;
        int i16;
        int iMo2054;
        int iMo2055;
        CharSequence charSequence;
        int i17;
        byte b;
        int i18;
        boolean z3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int[] iArr2 = this.f35671;
        int i24 = i;
        Arrays.fill(iArr2, i24, i2, i3);
        while (i24 < i2) {
            C20813.m47630();
            int iM29113 = m29113(i24);
            int[] iArr3 = this.f35673;
            if (iM29113 == 22) {
                iArr3[i24] = 1;
                i24++;
                if (i24 < i2) {
                    iArr3[i24] = 3;
                }
            } else {
                ArrayList arrayList2 = this.f35664;
                boolean z4 = z && (i23 = i24 + 1) < i2 && m29113(i24) == 14 && m29113(i23) == 21 && AbstractC14045.m33655(((InterfaceC0463) arrayList2.get(i24)).getText()).startsWith("--");
                int i25 = i24;
                while (true) {
                    iArr = this.f35674;
                    if (i25 < i2) {
                        C20813.m47630();
                        i4 = 1;
                        int iM29114 = m29113(i25);
                        if (m29111(iM29114)) {
                            int i26 = iArr[i25];
                            if (i26 < 0 || i26 >= i2) {
                                m29108(i24, i2);
                                return;
                            } else if (iM29114 != 15 || z4) {
                                i25 = i26 + 1;
                            } else {
                                i5 = i25;
                            }
                        } else if (iM29114 != 22) {
                            if (iM29114 == 16 || iM29114 == 20 || iM29114 == 18) {
                                m29108(i24, i25 + 1);
                            } else {
                                i25++;
                            }
                        }
                    } else {
                        i4 = 1;
                    }
                    i5 = -1;
                }
                boolean z5 = this.f35668;
                if (i5 >= 0) {
                    int i27 = iArr[i5];
                    if (m29113(i24) != 9) {
                        length = (this.f35672.length() * i3) + this.f35662.length();
                        i6 = i24;
                        i7 = 23;
                        while (i6 < i5) {
                            C20813.m47630();
                            iMo2053 = (((InterfaceC0463) arrayList2.get(i6)).mo2053() - ((InterfaceC0463) arrayList2.get(i6)).mo2054()) + 1 + length;
                            if (i6 > i24) {
                                i15 = i24;
                                arrayList = arrayList2;
                                break;
                            }
                            i16 = i6 - 1;
                            if (m29113(i16) == i7) {
                                i15 = i24;
                                arrayList = arrayList2;
                            } else {
                                if (m29113(i6) != i7) {
                                    i15 = i24;
                                    arrayList = arrayList2;
                                    break;
                                }
                                iMo2054 = ((InterfaceC0463) arrayList2.get(i16)).mo2053() + 1;
                                iMo2055 = ((InterfaceC0463) arrayList2.get(i6)).mo2054();
                                while (true) {
                                    if (iMo2054 < iMo2055) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    charSequence = this.f35670;
                                    arrayList = arrayList2;
                                    i15 = i24;
                                    if (charSequence.charAt(iMo2054) != '/') {
                                        if (AbstractC14045.m33654(charSequence.charAt(iMo2054))) {
                                            iMo2054++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                        }
                                    } else if (AbstractC14045.m33654(charSequence.charAt(iMo2054))) {
                                        iMo2054++;
                                        arrayList2 = arrayList;
                                        i24 = i15;
                                    }
                                }
                            }
                            iMo2053++;
                            break;
                            break;
                            length = iMo2053;
                            i6++;
                            i7 = 23;
                            arrayList2 = arrayList;
                            i24 = i15;
                        }
                        i8 = i24;
                        if (z5) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        while (i8 < i5) {
                            C20813.m47630();
                            if (!m29111(m29113(i8))) {
                                if (m29113(i8) == 23) {
                                    iArr3[i8] = i4;
                                    i12 = i8 + 1;
                                    if (i12 < i5) {
                                        if (z2) {
                                            i13 = 3;
                                        } else {
                                            i13 = 2;
                                        }
                                        iArr3[i12] = i13;
                                    }
                                }
                            } else if (m29113(i8) == 23) {
                                iArr3[i8] = i4;
                                i12 = i8 + 1;
                                if (i12 < i5) {
                                    if (z2) {
                                        i13 = 3;
                                    } else {
                                        i13 = 2;
                                    }
                                    iArr3[i12] = i13;
                                }
                            }
                            i8++;
                        }
                        iArr3[i5] = 2;
                        i9 = i5 + 1;
                        if (i9 == i27) {
                            i10 = 1;
                        } else {
                            i10 = 3;
                        }
                        iArr3[i27] = i10;
                        iArr2[i27] = i3;
                        i11 = 3;
                        if (i9 < i27) {
                            iArr3[i9] = 3;
                            m29109(i9, i27, i3 + 1, true);
                        }
                    } else {
                        String strM33653 = AbstractC14045.m33653(AbstractC14045.m33655(((InterfaceC0463) arrayList2.get(i24)).getText()));
                        strM33653.getClass();
                        switch (strM33653.hashCode()) {
                            case -2010008239:
                                if (!strM33653.equals("@styleset")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -1638716285:
                                if (!strM33653.equals("@-moz-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -1580274675:
                                if (!strM33653.equals("@top-center")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case -1565019305:
                                if (!strM33653.equals("@position-try")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case -1376175420:
                                if (!strM33653.equals("@supports")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case -1324184772:
                                if (!strM33653.equals("@right-bottom")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case -1278440229:
                                if (!strM33653.equals("@font-face")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case -1262235164:
                                if (!strM33653.equals("@right-top")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case -1152996743:
                                if (!strM33653.equals("@bottom-left-corner")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case -1138628731:
                                if (!strM33653.equals("@keyframes")) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case -1029700792:
                                if (!strM33653.equals("@bottom-right-corner")) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            case -1015297370:
                                if (!strM33653.equals("@right-middle")) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case -1006843036:
                                if (!strM33653.equals("@top-right")) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case -1002353161:
                                if (!strM33653.equals("@bottom-center")) {
                                    b = -1;
                                } else {
                                    b = cb.k;
                                }
                                break;
                            case -984014295:
                                if (!strM33653.equals("@bottom-left")) {
                                    b = -1;
                                } else {
                                    b = cb.f77931l;
                                }
                                break;
                            case -725398081:
                                if (!strM33653.equals("@top-left")) {
                                    b = -1;
                                } else {
                                    b = 15;
                                }
                                break;
                            case -706109931:
                                if (!strM33653.equals("@property")) {
                                    b = -1;
                                } else {
                                    b = 16;
                                }
                                break;
                            case -595813521:
                                if (!strM33653.equals("@annotation")) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case -442928718:
                                if (!strM33653.equals("@font-palette-values")) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case -434011078:
                                if (!strM33653.equals("@bottom-right")) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case -431592131:
                                if (!strM33653.equals("@view-transition")) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case -391400291:
                                if (!strM33653.equals("@-moz-document")) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case -116166108:
                                if (!strM33653.equals("@starting-style")) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case -102919103:
                                if (!strM33653.equals("@container")) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case -41902889:
                                if (!strM33653.equals("@font-feature-values")) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 42653863:
                                if (!strM33653.equals("@-webkit-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 62538447:
                                if (!strM33653.equals("@page")) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 82937215:
                                if (!strM33653.equals("@ornaments")) {
                                    b = -1;
                                } else {
                                    b = 27;
                                }
                                break;
                            case 286681635:
                                if (!strM33653.equals("@top-left-corner")) {
                                    b = -1;
                                } else {
                                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                }
                                break;
                            case 451773024:
                                if (!strM33653.equals("@counter-style")) {
                                    b = -1;
                                } else {
                                    b = 29;
                                }
                                break;
                            case 594607521:
                                if (!strM33653.equals("@character-variant")) {
                                    b = -1;
                                } else {
                                    b = 30;
                                }
                                break;
                            case 650655966:
                                if (!strM33653.equals("@top-right-corner")) {
                                    b = -1;
                                } else {
                                    b = bo.j;
                                }
                                break;
                            case 1026618993:
                                if (!strM33653.equals("@left-bottom")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_CS3;
                                }
                                break;
                            case 1148752219:
                                if (!strM33653.equals("@document")) {
                                    b = -1;
                                } else {
                                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                                }
                                break;
                            case 1335506395:
                                if (!strM33653.equals("@left-middle")) {
                                    b = -1;
                                } else {
                                    b = 34;
                                }
                                break;
                            case 1935015185:
                                if (!strM33653.equals("@layer")) {
                                    b = -1;
                                } else {
                                    b = 35;
                                }
                                break;
                            case 1936037796:
                                if (!strM33653.equals("@media")) {
                                    b = -1;
                                } else {
                                    b = 36;
                                }
                                break;
                            case 1941530132:
                                if (!strM33653.equals("@scope")) {
                                    b = -1;
                                } else {
                                    b = 37;
                                }
                                break;
                            case 1942112594:
                                if (!strM33653.equals("@swash")) {
                                    b = -1;
                                } else {
                                    b = 38;
                                }
                                break;
                            case 2004302543:
                                if (!strM33653.equals("@left-top")) {
                                    b = -1;
                                } else {
                                    b = 39;
                                }
                                break;
                            case 2117962288:
                                if (!strM33653.equals("@stylistic")) {
                                    b = -1;
                                } else {
                                    b = 40;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
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
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
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
                                length = (this.f35672.length() * i3) + this.f35662.length();
                                i6 = i24;
                                i7 = 23;
                                while (i6 < i5) {
                                    C20813.m47630();
                                    iMo2053 = (((InterfaceC0463) arrayList2.get(i6)).mo2053() - ((InterfaceC0463) arrayList2.get(i6)).mo2054()) + 1 + length;
                                    if (i6 > i24) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    i16 = i6 - 1;
                                    if (m29113(i16) == i7) {
                                        if (m29113(i6) != i7) {
                                            i15 = i24;
                                            arrayList = arrayList2;
                                        }
                                        iMo2054 = ((InterfaceC0463) arrayList2.get(i16)).mo2053() + 1;
                                        iMo2055 = ((InterfaceC0463) arrayList2.get(i6)).mo2054();
                                        while (true) {
                                            if (iMo2054 < iMo2055) {
                                                i15 = i24;
                                                arrayList = arrayList2;
                                            }
                                            charSequence = this.f35670;
                                            arrayList = arrayList2;
                                            i15 = i24;
                                            if (charSequence.charAt(iMo2054) != '/' && (i17 = iMo2054 + 1) < iMo2055 && charSequence.charAt(i17) == '*') {
                                                int iM8474 = C2732.m8474("*/", charSequence, iMo2054 + 2);
                                                if (iM8474 >= 0 && iM8474 < iMo2055) {
                                                    iMo2054 = iM8474 + 1;
                                                }
                                                break;
                                            } else if (AbstractC14045.m33654(charSequence.charAt(iMo2054))) {
                                            }
                                            iMo2054++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                            break;
                                        }
                                        break;
                                    } else {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                    }
                                    iMo2053++;
                                    break;
                                    length = iMo2053;
                                    i6++;
                                    i7 = 23;
                                    arrayList2 = arrayList;
                                    i24 = i15;
                                }
                                i8 = i24;
                                if (z5 || length <= this.f35669) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                while (i8 < i5) {
                                    C20813.m47630();
                                    if (!m29111(m29113(i8)) && (i14 = iArr[i8]) >= 0) {
                                        i8 = i14;
                                    } else if (m29113(i8) == 23) {
                                        iArr3[i8] = i4;
                                        i12 = i8 + 1;
                                        if (i12 < i5) {
                                            if (z2) {
                                                i13 = 3;
                                            } else {
                                                i13 = 2;
                                            }
                                            iArr3[i12] = i13;
                                        }
                                    }
                                    i8++;
                                }
                                iArr3[i5] = 2;
                                i9 = i5 + 1;
                                if (i9 == i27) {
                                    i10 = 1;
                                } else {
                                    i10 = 3;
                                }
                                iArr3[i27] = i10;
                                iArr2[i27] = i3;
                                i11 = 3;
                                if (i9 < i27) {
                                    iArr3[i9] = 3;
                                    m29109(i9, i27, i3 + 1, true);
                                }
                                break;
                            default:
                                m29108(i24, i27 + 1);
                                i11 = 3;
                                break;
                        }
                    }
                    int i28 = i27 + 1;
                    if (i28 < i2) {
                        iArr3[i28] = i11;
                    }
                    i24 = i28;
                } else {
                    int i29 = i24;
                    if (!z || (i22 = i29 + 1) >= i25) {
                        i18 = i29;
                    } else {
                        i18 = i29;
                        if (m29113(i18) == 14 && m29113(i22) == 21) {
                            z3 = true;
                        }
                        if (z3) {
                            iArr3[i18 + 1] = 1;
                            if (z4) {
                                m29108(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                            } else {
                                i20 = i18 + 2;
                                if (i20 < i25) {
                                    iArr3[i20] = 2;
                                    while (i20 < i25) {
                                        C20813.m47630();
                                        if (m29113(i20) == 23) {
                                            iArr3[i20] = 1;
                                            i21 = i20 + 1;
                                            if (i21 < i25) {
                                                iArr3[i21] = 2;
                                            }
                                        }
                                        i20++;
                                    }
                                }
                            }
                        } else if (m29113(i18) != 9 && m29113(i18) != 4 && m29113(i18) != 5) {
                            m29108(i18, Math.min(arrayList2.size(), i25 + 1));
                        }
                        if (i25 >= i2 && m29113(i25) == 22) {
                            if (!z4) {
                                iArr3[i25] = 1;
                            }
                            if (z5 && z3 && !z4 && i25 + 1 == i2 && i2 < arrayList2.size() && m29113(i2) == 16) {
                                this.f35665[i25] = true;
                            }
                            i25++;
                            if (i25 < i2) {
                                iArr3[i25] = 3;
                            }
                        } else {
                            if (!z5 && z3 && !z4 && i18 + 2 < i25 && i25 == i2 && i2 < arrayList2.size() && m29113(i2) == 16) {
                                i19 = i18;
                                while (true) {
                                    if (i19 <= i25) {
                                        C20813.m47630();
                                        if (!this.f35667[i19]) {
                                            i19++;
                                        }
                                    } else {
                                        this.f35663[i25 - 1] = true;
                                    }
                                }
                            }
                            if (i25 == i18) {
                                i25++;
                            }
                        }
                        i24 = i25;
                    }
                    z3 = false;
                    if (z3) {
                        iArr3[i18 + 1] = 1;
                        if (z4) {
                            m29108(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                        } else {
                            i20 = i18 + 2;
                            if (i20 < i25) {
                                iArr3[i20] = 2;
                                while (i20 < i25) {
                                    C20813.m47630();
                                    if (m29113(i20) == 23) {
                                        iArr3[i20] = 1;
                                        i21 = i20 + 1;
                                        if (i21 < i25) {
                                            iArr3[i21] = 2;
                                        }
                                    }
                                    i20++;
                                }
                            }
                        }
                    } else if (m29113(i18) != 9) {
                        m29108(i18, Math.min(arrayList2.size(), i25 + 1));
                    }
                    if (i25 >= i2) {
                        if (!z5) {
                            i19 = i18;
                            while (true) {
                                if (i19 <= i25) {
                                    C20813.m47630();
                                    if (!this.f35667[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f35663[i25 - 1] = true;
                                }
                            }
                        }
                        if (i25 == i18) {
                            i25++;
                        }
                    } else {
                        if (!z5) {
                            i19 = i18;
                            while (true) {
                                if (i19 <= i25) {
                                    C20813.m47630();
                                    if (!this.f35667[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f35663[i25 - 1] = true;
                                }
                            }
                        }
                        if (i25 == i18) {
                            i25++;
                        }
                    }
                    i24 = i25;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29114() throws Throwable {
        int i = 0;
        int iMo2053 = 0;
        InterfaceC0463 interfaceC0463 = null;
        while (true) {
            ArrayList arrayList = this.f35664;
            int size = arrayList.size();
            CharSequence charSequence = this.f35670;
            if (i < size) {
                C20813.m47630();
                InterfaceC0463 interfaceC0464 = (InterfaceC0463) arrayList.get(i);
                if (this.f35665[i]) {
                    m29110(C2732.m8476(iMo2053, interfaceC0464.mo2054(), charSequence), i, interfaceC0463, (InterfaceC0463) null);
                    iMo2053 = interfaceC0464.mo2053() + 1;
                } else {
                    m29110(C2732.m8476(iMo2053, interfaceC0464.mo2054(), charSequence), i, interfaceC0463, interfaceC0464);
                    C19012 c19012 = this.f35666;
                    if (c19012.length() == 0 && !this.f35668) {
                        c19012.append((CharSequence) this.f35662);
                    }
                    c19012.m43854(interfaceC0464.mo2054(), interfaceC0464.mo2053() + 1, charSequence);
                    if (this.f35663[i]) {
                        c19012.append(';');
                    }
                    iMo2053 = interfaceC0464.mo2053() + 1;
                    interfaceC0463 = interfaceC0464;
                }
                i++;
            } else {
                m29110(C2732.m8476(iMo2053, charSequence.length(), charSequence), arrayList.size(), interfaceC0463, (InterfaceC0463) null);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29110(String str, int i, InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC0464) throws Throwable {
        int i2;
        boolean z = this.f35667[i];
        C19012 c19012 = this.f35666;
        if (z) {
            c19012.append((CharSequence) str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int length = str.length();
            boolean z5 = this.f35668;
            if (i3 >= length) {
                if (!z5 && z2) {
                    c19012.append((CharSequence) str);
                    return;
                }
                int i4 = this.f35673[i];
                if (z5) {
                    if (z3) {
                        c19012.append((CharSequence) sb);
                    }
                    if (z4 && i4 == 0 && interfaceC0463 != null && interfaceC0464 != null) {
                        c19012.append(' ');
                        return;
                    }
                    if (z3) {
                        return;
                    }
                    if (m29112(interfaceC0464) || (!str.isEmpty() && C3714.m11298(interfaceC0463, interfaceC0464))) {
                        c19012.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
                if (interfaceC0464 == null || interfaceC0463 == null) {
                    return;
                }
                if (i4 == 3) {
                    c19012.append((CharSequence) this.f35675).append((CharSequence) this.f35662);
                    for (int i5 = 0; i5 < this.f35671[i]; i5++) {
                        c19012.append((CharSequence) this.f35672);
                    }
                    return;
                }
                if (i4 == 2 || (i4 == 0 && z4)) {
                    c19012.append(' ');
                    return;
                } else {
                    if (m29112(interfaceC0464) || (!str.isEmpty() && C3714.m11298(interfaceC0463, interfaceC0464))) {
                        c19012.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
            }
            if ((i3 & 1023) == 0) {
                C20813.m47630();
            }
            char cCharAt = str.charAt(i3);
            if (AbstractC14045.m33654(cCharAt)) {
                i3++;
                z4 = true;
            } else if (cCharAt == '/' && (i2 = i3 + 1) < str.length() && str.charAt(i2) == '*') {
                int i6 = i3 + 2;
                int iIndexOf = str.indexOf("*/", i6);
                boolean z6 = iIndexOf < 0;
                int length2 = z6 ? str.length() : iIndexOf + 2;
                if (!z5 || z6 || (i6 < length2 && str.charAt(i6) == '!')) {
                    sb.append((CharSequence) str, i3, length2);
                    z3 = true;
                } else {
                    String strM33653 = AbstractC14045.m33653(str.substring(i3, length2));
                    if (strM33653.contains("@license") || strM33653.contains("@preserve")) {
                        sb.append((CharSequence) str, i3, length2);
                        z3 = true;
                    }
                }
                z2 = true;
                i3 = length2;
            } else {
                c19012.append((CharSequence) str);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29112(InterfaceC0463 interfaceC0463) {
        C19012 c19012 = this.f35666;
        int length = c19012.length();
        return interfaceC0463 != null && length >= 2 && c19012.charAt(length + (-2)) == '<' && c19012.charAt(length - 1) == '!' && interfaceC0463.getText().startsWith("--");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29108(int i, int i2) {
        boolean[] zArr = this.f35667;
        Arrays.fill(zArr, i, Math.min(zArr.length, i2), true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29113(int i) {
        return ((InterfaceC0463) this.f35664.get(i)).getType();
    }
}
