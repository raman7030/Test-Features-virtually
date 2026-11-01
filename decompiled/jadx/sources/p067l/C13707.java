package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13707 {

    /* JADX INFO: renamed from: ֫ */
    public final String f38671;

    /* JADX INFO: renamed from: ۖ */
    public final boolean[] f38672;

    /* JADX INFO: renamed from: ۘ */
    public final ArrayList f38673 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f38674;

    /* JADX INFO: renamed from: ۡ */
    public final C20438 f38675;

    /* JADX INFO: renamed from: ۢ */
    public final boolean[] f38676;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f38677;

    /* JADX INFO: renamed from: ܳ */
    public final int f38678;

    /* JADX INFO: renamed from: ܺ */
    public final CharSequence f38679;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f38680;

    /* JADX INFO: renamed from: ܿ */
    public final String f38681;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f38682;

    /* JADX INFO: renamed from: ᩷ */
    public final int[] f38683;

    /* JADX INFO: renamed from: ᩻ */
    public final String f38684;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31164(int i) {
        return i == 15 || i == 19 || i == 8 || i == 17;
    }

    public C13707(CharSequence charSequence, C4150 c4150, C10856 c10856, C5660 c5660, C14377 c14377, boolean z, C20438 c20438) {
        String string;
        this.f38679 = charSequence;
        this.f38677 = z;
        if (c5660.m12610()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c5660.m12609());
            if (iMax < 0) {
                throw new IllegalArgumentException(C20778.m46922(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C19768.m44906(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f38681 = string;
        this.f38671 = c14377.m32974();
        this.f38684 = c14377.m32975().isEmpty() ? C22149.m49957(charSequence) : c14377.m32975();
        this.f38678 = c14377.m32976();
        this.f38675 = c20438;
        int[] iArr = new int[c4150.size()];
        Arrays.fill(iArr, -1);
        for (InterfaceC2808 interfaceC2808 : c4150.m8412()) {
            C22149.m49958();
            if (interfaceC2808.mo4430() == 0 && interfaceC2808.getType() != -1) {
                iArr[interfaceC2808.mo4432()] = this.f38673.size();
                this.f38673.add(interfaceC2808);
            }
        }
        int[] iArr2 = new int[this.f38673.size()];
        this.f38683 = iArr2;
        Arrays.fill(iArr2, -1);
        int size = this.f38673.size() + 1;
        this.f38682 = new int[size];
        this.f38680 = new int[size];
        this.f38676 = new boolean[size];
        this.f38674 = new boolean[this.f38673.size()];
        this.f38672 = new boolean[this.f38673.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c10856);
        while (!arrayDeque.isEmpty()) {
            C22149.m49958();
            InterfaceC17740 interfaceC17740 = (InterfaceC17740) arrayDeque.pop();
            if (interfaceC17740 instanceof C10856) {
                C10856 c10857 = (C10856) interfaceC17740;
                int iMo3481 = c10857.mo3481();
                if (iMo3481 == 5 || iMo3481 == 6 || iMo3481 == 7 || iMo3481 == 8) {
                    InterfaceC2808 interfaceC2809 = c10857.f30091;
                    InterfaceC2808 interfaceC28010 = c10857.f30090;
                    if (interfaceC2809 != null && interfaceC28010 != null && interfaceC2809.mo4432() >= 0 && interfaceC28010.mo4432() >= 0) {
                        int i2 = iArr[interfaceC2809.mo4432()];
                        int i3 = iArr[interfaceC28010.mo4432()];
                        if (i2 >= 0 && i3 > i2) {
                            int iM31166 = m31166(i2);
                            int iM31167 = m31166(i3);
                            if ((iM31166 == 15 && iM31167 == 16) || ((iM31166 == 17 && iM31167 == 18) || ((iM31166 == 8 || iM31166 == 19) && iM31167 == 20))) {
                                int[] iArr3 = this.f38683;
                                iArr3[i2] = i3;
                                iArr3[i3] = i2;
                            }
                        }
                    }
                }
                for (int childCount = c10857.getChildCount() - 1; childCount >= 0; childCount--) {
                    arrayDeque.push(c10857.mo25014(childCount));
                }
            }
        }
        for (int i4 = 0; i4 < this.f38673.size(); i4++) {
            C22149.m49958();
            if (m31164(m31166(i4)) && this.f38683[i4] < 0) {
                m31161(i4, this.f38673.size() + 1);
                return;
            }
            if (m31166(i4) == 7) {
                this.f38676[i4 + 1] = true;
            }
            if (m31166(i4) == 24 && ((InterfaceC2808) this.f38673.get(i4)).getText().equals("\\")) {
                this.f38676[i4 + 1] = true;
            }
            int iM31168 = m31166(i4);
            if ((iM31168 == 16 || iM31168 == 20 || iM31168 == 18) && this.f38683[i4] < 0) {
                boolean[] zArr = this.f38676;
                zArr[i4 + 1] = true;
                zArr[i4] = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31168(EnumC15047 enumC15047) {
        ArrayList arrayList = this.f38673;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int[] iArr = this.f38682;
        iArr[size] = 1;
        iArr[0] = 1;
        if (enumC15047 != EnumC15047.COMPONENT_VALUES) {
            m31162(0, arrayList.size(), 0, enumC15047 == EnumC15047.DECLARATION_LIST);
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
    /* JADX INFO: renamed from: ֫ */
    private void m31162(int i, int i2, int i3, boolean z) {
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
        int iMo4433;
        int i15;
        ArrayList arrayList;
        int i16;
        int iMo4434;
        int iMo4435;
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
        int[] iArr2 = this.f38680;
        int i24 = i;
        Arrays.fill(iArr2, i24, i2, i3);
        while (i24 < i2) {
            C22149.m49958();
            int iM31166 = m31166(i24);
            int[] iArr3 = this.f38682;
            if (iM31166 == 22) {
                iArr3[i24] = 1;
                i24++;
                if (i24 < i2) {
                    iArr3[i24] = 3;
                }
            } else {
                ArrayList arrayList2 = this.f38673;
                boolean z4 = z && (i23 = i24 + 1) < i2 && m31166(i24) == 14 && m31166(i23) == 21 && AbstractC15717.m35775(((InterfaceC2808) arrayList2.get(i24)).getText()).startsWith("--");
                int i25 = i24;
                while (true) {
                    iArr = this.f38683;
                    if (i25 < i2) {
                        C22149.m49958();
                        i4 = 1;
                        int iM31167 = m31166(i25);
                        if (m31164(iM31167)) {
                            int i26 = iArr[i25];
                            if (i26 < 0 || i26 >= i2) {
                                m31161(i24, i2);
                                return;
                            } else if (iM31167 != 15 || z4) {
                                i25 = i26 + 1;
                            } else {
                                i5 = i25;
                            }
                        } else if (iM31167 != 22) {
                            if (iM31167 == 16 || iM31167 == 20 || iM31167 == 18) {
                                m31161(i24, i25 + 1);
                            } else {
                                i25++;
                            }
                        }
                    } else {
                        i4 = 1;
                    }
                    i5 = -1;
                }
                boolean z5 = this.f38677;
                if (i5 >= 0) {
                    int i27 = iArr[i5];
                    if (m31166(i24) != 9) {
                        length = (this.f38681.length() * i3) + this.f38671.length();
                        i6 = i24;
                        i7 = 23;
                        while (i6 < i5) {
                            C22149.m49958();
                            iMo4433 = (((InterfaceC2808) arrayList2.get(i6)).mo4433() - ((InterfaceC2808) arrayList2.get(i6)).mo4434()) + 1 + length;
                            if (i6 > i24) {
                                i15 = i24;
                                arrayList = arrayList2;
                                break;
                            }
                            i16 = i6 - 1;
                            if (m31166(i16) == i7) {
                                i15 = i24;
                                arrayList = arrayList2;
                            } else {
                                if (m31166(i6) != i7) {
                                    i15 = i24;
                                    arrayList = arrayList2;
                                    break;
                                }
                                iMo4434 = ((InterfaceC2808) arrayList2.get(i16)).mo4433() + 1;
                                iMo4435 = ((InterfaceC2808) arrayList2.get(i6)).mo4434();
                                while (true) {
                                    if (iMo4434 < iMo4435) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    charSequence = this.f38679;
                                    arrayList = arrayList2;
                                    i15 = i24;
                                    if (charSequence.charAt(iMo4434) != '/') {
                                        if (AbstractC15717.m35774(charSequence.charAt(iMo4434))) {
                                            iMo4434++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                        }
                                    } else if (AbstractC15717.m35774(charSequence.charAt(iMo4434))) {
                                        iMo4434++;
                                        arrayList2 = arrayList;
                                        i24 = i15;
                                    }
                                }
                            }
                            iMo4433++;
                            break;
                            break;
                            length = iMo4433;
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
                            C22149.m49958();
                            if (!m31164(m31166(i8))) {
                                if (m31166(i8) == 23) {
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
                            } else if (m31166(i8) == 23) {
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
                            m31162(i9, i27, i3 + 1, true);
                        }
                    } else {
                        String strM35773 = AbstractC15717.m35773(AbstractC15717.m35775(((InterfaceC2808) arrayList2.get(i24)).getText()));
                        strM35773.getClass();
                        switch (strM35773.hashCode()) {
                            case -2010008239:
                                if (!strM35773.equals("@styleset")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -1638716285:
                                if (!strM35773.equals("@-moz-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -1580274675:
                                if (!strM35773.equals("@top-center")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case -1565019305:
                                if (!strM35773.equals("@position-try")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case -1376175420:
                                if (!strM35773.equals("@supports")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case -1324184772:
                                if (!strM35773.equals("@right-bottom")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case -1278440229:
                                if (!strM35773.equals("@font-face")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case -1262235164:
                                if (!strM35773.equals("@right-top")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case -1152996743:
                                if (!strM35773.equals("@bottom-left-corner")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case -1138628731:
                                if (!strM35773.equals("@keyframes")) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case -1029700792:
                                if (!strM35773.equals("@bottom-right-corner")) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            case -1015297370:
                                if (!strM35773.equals("@right-middle")) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case -1006843036:
                                if (!strM35773.equals("@top-right")) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case -1002353161:
                                if (!strM35773.equals("@bottom-center")) {
                                    b = -1;
                                } else {
                                    b = C0698cb.f2569k;
                                }
                                break;
                            case -984014295:
                                if (!strM35773.equals("@bottom-left")) {
                                    b = -1;
                                } else {
                                    b = C0698cb.f2570l;
                                }
                                break;
                            case -725398081:
                                if (!strM35773.equals("@top-left")) {
                                    b = -1;
                                } else {
                                    b = 15;
                                }
                                break;
                            case -706109931:
                                if (!strM35773.equals("@property")) {
                                    b = -1;
                                } else {
                                    b = 16;
                                }
                                break;
                            case -595813521:
                                if (!strM35773.equals("@annotation")) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case -442928718:
                                if (!strM35773.equals("@font-palette-values")) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case -434011078:
                                if (!strM35773.equals("@bottom-right")) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case -431592131:
                                if (!strM35773.equals("@view-transition")) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case -391400291:
                                if (!strM35773.equals("@-moz-document")) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case -116166108:
                                if (!strM35773.equals("@starting-style")) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case -102919103:
                                if (!strM35773.equals("@container")) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case -41902889:
                                if (!strM35773.equals("@font-feature-values")) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 42653863:
                                if (!strM35773.equals("@-webkit-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 62538447:
                                if (!strM35773.equals("@page")) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 82937215:
                                if (!strM35773.equals("@ornaments")) {
                                    b = -1;
                                } else {
                                    b = 27;
                                }
                                break;
                            case 286681635:
                                if (!strM35773.equals("@top-left-corner")) {
                                    b = -1;
                                } else {
                                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                }
                                break;
                            case 451773024:
                                if (!strM35773.equals("@counter-style")) {
                                    b = -1;
                                } else {
                                    b = 29;
                                }
                                break;
                            case 594607521:
                                if (!strM35773.equals("@character-variant")) {
                                    b = -1;
                                } else {
                                    b = 30;
                                }
                                break;
                            case 650655966:
                                if (!strM35773.equals("@top-right-corner")) {
                                    b = -1;
                                } else {
                                    b = C0684bo.f2505j;
                                }
                                break;
                            case 1026618993:
                                if (!strM35773.equals("@left-bottom")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_CS3;
                                }
                                break;
                            case 1148752219:
                                if (!strM35773.equals("@document")) {
                                    b = -1;
                                } else {
                                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                                }
                                break;
                            case 1335506395:
                                if (!strM35773.equals("@left-middle")) {
                                    b = -1;
                                } else {
                                    b = 34;
                                }
                                break;
                            case 1935015185:
                                if (!strM35773.equals("@layer")) {
                                    b = -1;
                                } else {
                                    b = 35;
                                }
                                break;
                            case 1936037796:
                                if (!strM35773.equals("@media")) {
                                    b = -1;
                                } else {
                                    b = 36;
                                }
                                break;
                            case 1941530132:
                                if (!strM35773.equals("@scope")) {
                                    b = -1;
                                } else {
                                    b = 37;
                                }
                                break;
                            case 1942112594:
                                if (!strM35773.equals("@swash")) {
                                    b = -1;
                                } else {
                                    b = 38;
                                }
                                break;
                            case 2004302543:
                                if (!strM35773.equals("@left-top")) {
                                    b = -1;
                                } else {
                                    b = 39;
                                }
                                break;
                            case 2117962288:
                                if (!strM35773.equals("@stylistic")) {
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
                                length = (this.f38681.length() * i3) + this.f38671.length();
                                i6 = i24;
                                i7 = 23;
                                while (i6 < i5) {
                                    C22149.m49958();
                                    iMo4433 = (((InterfaceC2808) arrayList2.get(i6)).mo4433() - ((InterfaceC2808) arrayList2.get(i6)).mo4434()) + 1 + length;
                                    if (i6 > i24) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    i16 = i6 - 1;
                                    if (m31166(i16) == i7) {
                                        if (m31166(i6) != i7) {
                                            i15 = i24;
                                            arrayList = arrayList2;
                                        }
                                        iMo4434 = ((InterfaceC2808) arrayList2.get(i16)).mo4433() + 1;
                                        iMo4435 = ((InterfaceC2808) arrayList2.get(i6)).mo4434();
                                        while (true) {
                                            if (iMo4434 < iMo4435) {
                                                i15 = i24;
                                                arrayList = arrayList2;
                                            }
                                            charSequence = this.f38679;
                                            arrayList = arrayList2;
                                            i15 = i24;
                                            if (charSequence.charAt(iMo4434) != '/' && (i17 = iMo4434 + 1) < iMo4435 && charSequence.charAt(i17) == '*') {
                                                int iM10521 = C4965.m10521("*/", charSequence, iMo4434 + 2);
                                                if (iM10521 >= 0 && iM10521 < iMo4435) {
                                                    iMo4434 = iM10521 + 1;
                                                }
                                                break;
                                            } else if (AbstractC15717.m35774(charSequence.charAt(iMo4434))) {
                                            }
                                            iMo4434++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                            break;
                                        }
                                        break;
                                    } else {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                    }
                                    iMo4433++;
                                    break;
                                    length = iMo4433;
                                    i6++;
                                    i7 = 23;
                                    arrayList2 = arrayList;
                                    i24 = i15;
                                }
                                i8 = i24;
                                if (z5 || length <= this.f38678) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                while (i8 < i5) {
                                    C22149.m49958();
                                    if (!m31164(m31166(i8)) && (i14 = iArr[i8]) >= 0) {
                                        i8 = i14;
                                    } else if (m31166(i8) == 23) {
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
                                    m31162(i9, i27, i3 + 1, true);
                                }
                                break;
                            default:
                                m31161(i24, i27 + 1);
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
                        if (m31166(i18) == 14 && m31166(i22) == 21) {
                            z3 = true;
                        }
                        if (z3) {
                            iArr3[i18 + 1] = 1;
                            if (z4) {
                                m31161(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                            } else {
                                i20 = i18 + 2;
                                if (i20 < i25) {
                                    iArr3[i20] = 2;
                                    while (i20 < i25) {
                                        C22149.m49958();
                                        if (m31166(i20) == 23) {
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
                        } else if (m31166(i18) != 9 && m31166(i18) != 4 && m31166(i18) != 5) {
                            m31161(i18, Math.min(arrayList2.size(), i25 + 1));
                        }
                        if (i25 >= i2 && m31166(i25) == 22) {
                            if (!z4) {
                                iArr3[i25] = 1;
                            }
                            if (z5 && z3 && !z4 && i25 + 1 == i2 && i2 < arrayList2.size() && m31166(i2) == 16) {
                                this.f38674[i25] = true;
                            }
                            i25++;
                            if (i25 < i2) {
                                iArr3[i25] = 3;
                            }
                        } else {
                            if (!z5 && z3 && !z4 && i18 + 2 < i25 && i25 == i2 && i2 < arrayList2.size() && m31166(i2) == 16) {
                                i19 = i18;
                                while (true) {
                                    if (i19 <= i25) {
                                        C22149.m49958();
                                        if (!this.f38676[i19]) {
                                            i19++;
                                        }
                                    } else {
                                        this.f38672[i25 - 1] = true;
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
                            m31161(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                        } else {
                            i20 = i18 + 2;
                            if (i20 < i25) {
                                iArr3[i20] = 2;
                                while (i20 < i25) {
                                    C22149.m49958();
                                    if (m31166(i20) == 23) {
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
                    } else if (m31166(i18) != 9) {
                        m31161(i18, Math.min(arrayList2.size(), i25 + 1));
                    }
                    if (i25 >= i2) {
                        if (!z5) {
                            i19 = i18;
                            while (true) {
                                if (i19 <= i25) {
                                    C22149.m49958();
                                    if (!this.f38676[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f38672[i25 - 1] = true;
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
                                    C22149.m49958();
                                    if (!this.f38676[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f38672[i25 - 1] = true;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m31167() throws Throwable {
        int i = 0;
        int iMo4433 = 0;
        InterfaceC2808 interfaceC2808 = null;
        while (true) {
            ArrayList arrayList = this.f38673;
            int size = arrayList.size();
            CharSequence charSequence = this.f38679;
            if (i < size) {
                C22149.m49958();
                InterfaceC2808 interfaceC2809 = (InterfaceC2808) arrayList.get(i);
                if (this.f38674[i]) {
                    m31163(C4965.m10523(iMo4433, interfaceC2809.mo4434(), charSequence), i, interfaceC2808, (InterfaceC2808) null);
                    iMo4433 = interfaceC2809.mo4433() + 1;
                } else {
                    m31163(C4965.m10523(iMo4433, interfaceC2809.mo4434(), charSequence), i, interfaceC2808, interfaceC2809);
                    C20438 c20438 = this.f38675;
                    if (c20438.length() == 0 && !this.f38677) {
                        c20438.append((CharSequence) this.f38671);
                    }
                    c20438.m46122(interfaceC2809.mo4434(), interfaceC2809.mo4433() + 1, charSequence);
                    if (this.f38672[i]) {
                        c20438.append(';');
                    }
                    iMo4433 = interfaceC2809.mo4433() + 1;
                    interfaceC2808 = interfaceC2809;
                }
                i++;
            } else {
                m31163(C4965.m10523(iMo4433, charSequence.length(), charSequence), arrayList.size(), interfaceC2808, (InterfaceC2808) null);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX INFO: renamed from: ֫ */
    private void m31163(String str, int i, InterfaceC2808 interfaceC2808, InterfaceC2808 interfaceC2809) throws Throwable {
        int i2;
        boolean z = this.f38676[i];
        C20438 c20438 = this.f38675;
        if (z) {
            c20438.append((CharSequence) str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int length = str.length();
            boolean z5 = this.f38677;
            if (i3 >= length) {
                if (!z5 && z2) {
                    c20438.append((CharSequence) str);
                    return;
                }
                int i4 = this.f38682[i];
                if (z5) {
                    if (z3) {
                        c20438.append((CharSequence) sb);
                    }
                    if (z4 && i4 == 0 && interfaceC2808 != null && interfaceC2809 != null) {
                        c20438.append(' ');
                        return;
                    }
                    if (z3) {
                        return;
                    }
                    if (m31165(interfaceC2809) || (!str.isEmpty() && C5898.m13245(interfaceC2808, interfaceC2809))) {
                        c20438.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
                if (interfaceC2809 == null || interfaceC2808 == null) {
                    return;
                }
                if (i4 == 3) {
                    c20438.append((CharSequence) this.f38684).append((CharSequence) this.f38671);
                    for (int i5 = 0; i5 < this.f38680[i]; i5++) {
                        c20438.append((CharSequence) this.f38681);
                    }
                    return;
                }
                if (i4 == 2 || (i4 == 0 && z4)) {
                    c20438.append(' ');
                    return;
                } else {
                    if (m31165(interfaceC2809) || (!str.isEmpty() && C5898.m13245(interfaceC2808, interfaceC2809))) {
                        c20438.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
            }
            if ((i3 & 1023) == 0) {
                C22149.m49958();
            }
            char cCharAt = str.charAt(i3);
            if (AbstractC15717.m35774(cCharAt)) {
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
                    String strM35773 = AbstractC15717.m35773(str.substring(i3, length2));
                    if (strM35773.contains("@license") || strM35773.contains("@preserve")) {
                        sb.append((CharSequence) str, i3, length2);
                        z3 = true;
                    }
                }
                z2 = true;
                i3 = length2;
            } else {
                c20438.append((CharSequence) str);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m31165(InterfaceC2808 interfaceC2808) {
        C20438 c20438 = this.f38675;
        int length = c20438.length();
        return interfaceC2808 != null && length >= 2 && c20438.charAt(length + (-2)) == '<' && c20438.charAt(length - 1) == '!' && interfaceC2808.getText().startsWith("--");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31161(int i, int i2) {
        boolean[] zArr = this.f38676;
        Arrays.fill(zArr, i, Math.min(zArr.length, i2), true);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m31166(int i) {
        return ((InterfaceC2808) this.f38673.get(i)).getType();
    }
}
