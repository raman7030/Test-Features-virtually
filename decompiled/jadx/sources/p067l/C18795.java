package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18795 {

    /* JADX INFO: renamed from: ۡ */
    public static final Set f56146;

    /* JADX INFO: renamed from: ۢ */
    public static final Set f56147;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f56148;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f56149;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56150;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f56151 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final String f56152;

    /* JADX INFO: renamed from: ܿ */
    public final C5660 f56153;

    /* JADX INFO: renamed from: ᩳ */
    public final String f56154;

    /* JADX INFO: renamed from: ᩷ */
    public final CharSequence f56155;

    /* JADX INFO: renamed from: ᩻ */
    public final C24830 f56156;

    static {
        String[] strArr = {"html", "head", "body", "address", "article", "aside", "blockquote", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", C0172c.f707c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "menu", "nav", "ol", C0655am.f2322ax, "pre", "section", "table", "thead", "tbody", "tfoot", "tr", "td", "th", "ul", "script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet = new HashSet(48);
        for (int i = 0; i < 48; i++) {
            String str = strArr[i];
            C12826.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f56147 = C21562.unmodifiableSet(hashSet);
        Object[] objArr = {"script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet2 = new HashSet(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Object obj = objArr[i2];
            C12826.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f56146 = C21562.unmodifiableSet(hashSet2);
    }

    public C18795(CharSequence charSequence, C5660 c5660, C22877 c22877, boolean z) {
        String string;
        this.f56155 = charSequence;
        this.f56156 = new C24830(charSequence);
        this.f56153 = c5660;
        this.f56150 = z;
        this.f56149 = !z && c22877.m51092() == EnumC16840.READABLE;
        this.f56148 = c22877.m51092() == EnumC16840.READABLE;
        this.f56154 = C22149.m49957(charSequence);
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
        this.f56152 = string;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42830(CharSequence charSequence, C5660 c5660, C22877 c22877, boolean z, C20438 c20438) {
        try {
            C22149.m49958();
            C18795 c18795 = new C18795(charSequence, c5660, c22877, z);
            if (c18795.m42838()) {
                c18795.m42829();
                c18795.m42836();
                c18795.m42831(c20438);
            } else {
                c20438.append(charSequence);
            }
            C22149.m49958();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C8737 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [l.ۡܳ֡, l.ۤ۫ۢ] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v29, types: [l.ۡܳ֡, l.ܰ۫ۢ] */
    /* JADX INFO: renamed from: ܽ */
    private boolean m42838() {
        Iterator it;
        Iterator it2;
        ?? r7;
        ?? M38720;
        boolean z;
        boolean z2;
        C24830 c24830 = this.f56156;
        C14829 c14829 = new C14829(new C22149(c24830.m54530()));
        c14829.m45727();
        C12761 c12761 = new C12761(c14829, this.f56155.length());
        c12761.m8408();
        boolean z3 = false;
        z3 = false;
        if (!c14829.m32642()) {
            C9465 c9465 = new C9465(c12761);
            c9465.m45727();
            Iterator it3 = c9465.m21985().m25011(C13489.class).iterator();
            while (true) {
                int i = 1;
                if (!it3.hasNext()) {
                    return true;
                }
                C13489 c13489 = (C13489) it3.next();
                C22149.m49958();
                C19466 c19466 = new C19466(c13489.f30091.mo4434(), c13489.f30090.mo4433() + 1, c13489.f30091.getType());
                c19466.f59307 = c24830.m54531(c19466.f59304, c19466.f59311);
                C24217 c24217 = (C24217) c13489.m25013(C24217.class, z3 ? 1 : 0);
                if (c24217 != null) {
                    int i2 = 14;
                    InterfaceC2808 interfaceC2808Mo14503 = c24217.m25012(14, z3 ? 1 : 0).mo14503();
                    if (!c24830.m54531(interfaceC2808Mo14503.mo4434(), interfaceC2808Mo14503.mo4433() + 1)) {
                        c19466.f59313 = AbstractC14159.m32637(c24217.m25012(14, z3 ? 1 : 0).getText());
                        c19466.f59317 = c24217.m25012(14, z3 ? 1 : 0).getText();
                        c19466.f59318 = c24217.m25012(6, z3 ? 1 : 0) != null;
                        c19466.f59309 = c24217.m25012(10, z3 ? 1 : 0) != null;
                        boolean z4 = c24217.m25012(11, z3 ? 1 : 0) != null || c19466.f59309;
                        c19466.f59320 = z4;
                        c19466.f59326 = z4;
                        Iterator it4 = c24217.m25011(C15499.class).iterator();
                        ?? r4 = z3;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            ArrayList arrayList = c19466.f59305;
                            if (!zHasNext) {
                                it = it3;
                                if (c19466.f59318 && (!arrayList.isEmpty() || c19466.f59309)) {
                                    c19466.f59326 = false;
                                }
                                if (c19466.f59307 && !c19466.f59326) {
                                    c19466.f59321 = true;
                                    break;
                                }
                                break;
                            }
                            ?? r8 = (C15499) it4.next();
                            ?? r10 = (C12148) r8.m25013(C12148.class, r4);
                            if (c24830.m54531(r8.f30091.mo4434(), r8.f30090.mo4433() + i)) {
                                boolean z5 = c19466.f59321;
                                if (r10 == 0 || r10.m25012(19, r4) == null || c24830.m54531(r10.m25012(i2, r4).mo14503().mo4434(), r10.m25012(i2, r4).mo14503().mo4433() + i)) {
                                    it2 = it3;
                                } else {
                                    String str = c19466.f59313;
                                    String strM32637 = AbstractC14159.m32637(r10.m25012(i2, r4).getText());
                                    if (strM32637.equals("style") || strM32637.equals("xml:space") || strM32637.equals("xmlns") || strM32637.startsWith("xmlns:")) {
                                        it2 = it3;
                                    } else {
                                        if (str.equals("script")) {
                                            Object[] objArr = new Object[3];
                                            objArr[r4] = "type";
                                            objArr[1] = C0655am.f2259N;
                                            objArr[2] = "src";
                                            HashSet hashSet = new HashSet(3);
                                            it2 = it3;
                                            int i3 = 0;
                                            for (int i4 = 3; i3 < i4; i4 = 3) {
                                                Object obj = objArr[i3];
                                                C12826.requireNonNull(obj);
                                                if (!hashSet.add(obj)) {
                                                    throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
                                                }
                                                i3++;
                                            }
                                            if (!C21562.unmodifiableSet(hashSet).contains(strM32637)) {
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                        z2 = (str.equals("style") && strM32637.equals("type")) || (str.equals("annotation-xml") && strM32637.equals("encoding"));
                                    }
                                }
                                c19466.f59321 = z2 | z5;
                            } else {
                                it2 = it3;
                            }
                            if (r10 == 0) {
                                z = false;
                                z = false;
                                if (r8.m25012(12, 0) == null) {
                                    c19466.f59326 = false;
                                }
                            } else {
                                String text = r10.m25012(14, 0).getText();
                                ?? text2 = r10.m25012(19, 0) != null ? r10.m25012(19, 0).getText() : r10.m25012(20, 0) != null ? r10.m25012(20, 0).getText() : 0;
                                boolean z6 = r10.m25012(13, 0) != null;
                                if (!(z6 && text2 == 0) && text.indexOf(123) < 0 && text.indexOf(37) < 0) {
                                    r7 = 0;
                                } else {
                                    r7 = 0;
                                    c19466.f59326 = false;
                                }
                                if (text2 != 0 && ((text2.charAt(r7) == '\'' || text2.charAt(r7) == '\"') && (text2.length() < 2 || C9417.m21911(1, (String) text2) != text2.charAt(r7)))) {
                                    c19466.f59326 = r7;
                                }
                                arrayList.add(new C4043(text, text2, z6));
                                String strM32638 = AbstractC14159.m32637(text);
                                if (text2 == 0) {
                                    M38720 = "";
                                } else if (text2.length() > 1 && (text2.charAt(0) == '\'' || text2.charAt(0) == '\"')) {
                                    M38720 = text2;
                                    M38720 = text2;
                                    M38720 = text2;
                                    char cM21911 = C9417.m21911(1, (String) text2);
                                    char cCharAt = text2.charAt(0);
                                    M38720 = text2;
                                    if (cM21911 == cCharAt) {
                                        M38720 = C17073.m38720(1, 1, text2);
                                    }
                                }
                                M38720 = text2;
                                M38720 = text2;
                                M38720 = text2;
                                C15525.putIfAbsent(c19466.f59323, strM32638, M38720);
                                z = false;
                            }
                            i = 1;
                            i2 = 14;
                            it3 = it2;
                            r4 = z;
                        }
                    }
                } else {
                    it = it3;
                }
                this.f56151.add(c19466);
                z3 = false;
                it3 = it;
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42829() {
        C6783 c6783M11958;
        C19466 c19466;
        C19466 c19467;
        C5442 c5442 = new C5442();
        for (C19466 c19468 : this.f56151) {
            C22149.m49958();
            String str = c19468.f59313;
            int i = c19468.f59325;
            if (str == null || !c19468.f59320) {
                c6783M11958 = null;
            } else {
                c6783M11958 = c19468.f59318 ? c5442.m11958(str) : c5442.m11959(str, c19468.f59323, c19468.f59309, c19468);
                if (c19468.f59318 && c6783M11958 != null) {
                    C19466 c19469 = (C19466) c6783M11958.f17559;
                    c19469.f59327 = c19468;
                    c19468.f59312 = c19469;
                }
            }
            C6783 c6783M11957 = (c6783M11958 == null || c19468.f59318) ? c5442.m11957() : c6783M11958.f17561;
            c19468.f59319 = (c6783M11958 == null || c19468.f59318) ? c5442.m11960() : c6783M11958.f17558;
            C19466 c194610 = c6783M11957 != null ? (C19466) c6783M11957.f17559 : null;
            c19468.f59306 = c194610;
            boolean z = false;
            c19468.f59310 = c6783M11958 == null ? !(c6783M11957 == null || c6783M11957.f17563 == 0) : c6783M11958.f17563 != 0;
            boolean z2 = (c6783M11958 != null && c6783M11958.f17565) || (c6783M11957 != null && c6783M11957.f17565);
            c19468.f59303 = z2;
            c19468.f59303 = z2 | (c19468.f59321 || (c194610 != null && c194610.f59303) || ((c19467 = c19468.f59312) != null && c19467.f59303));
            if (i == 8 && m42833(new C14847(c19468.f59304, c19468.f59311, this.f56155))) {
                z = true;
            }
            c19468.f59308 = z;
            if (c19468.f59313 == null && (c19466 = c19468.f59306) != null && i != 2 && i != 1 && !z) {
                c19466.f59316 = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0216  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:175:0x0300 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x0307  */
    /* JADX WARN: Code duplicated, block: B:180:0x030c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x030e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0313  */
    /* JADX WARN: Code duplicated, block: B:184:0x0318  */
    /* JADX WARN: Code duplicated, block: B:198:0x0369  */
    /* JADX WARN: Code duplicated, block: B:202:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0379 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0393 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x03aa A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03b5 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x03b9 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03be A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03d0 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:216:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:223:0x03f9 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0406  */
    /* JADX WARN: Code duplicated, block: B:227:0x0408  */
    /* JADX WARN: Code duplicated, block: B:230:0x040e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0415  */
    /* JADX WARN: Code duplicated, block: B:233:0x0417 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0420  */
    /* JADX WARN: Code duplicated, block: B:236:0x0423  */
    /* JADX WARN: Code duplicated, block: B:239:0x042b  */
    /* JADX WARN: Code duplicated, block: B:240:0x042e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0438 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x043b A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x047e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0482 A[Catch: all -> 0x0489, TRY_LEAVE, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x052d  */
    /* JADX WARN: Code duplicated, block: B:331:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:345:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:376:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: switch over string: strings are not added: [[aspect], [jscript], [method], [ecmascript], [ld+json], [json], [javascript], [livescript]] */
    /* JADX INFO: renamed from: ֫ */
    private void m42831(C20438 c20438) throws Throwable {
        int i;
        CharSequence charSequence;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        int i5;
        C19466 c19466;
        String str2;
        C19466 c19467;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        String string;
        C20438 c20438M46121;
        String str7;
        String str8;
        String str9;
        EnumC19980 enumC19980;
        EnumC19980 enumC19981;
        String str10;
        boolean z3;
        int i6;
        CharSequence c18124;
        String str11;
        int i7;
        String string2;
        C19466 c19468;
        int i8;
        int i9;
        int i10;
        CharSequence string3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f56151;
            int size = arrayList.size();
            String str12 = this.f56154;
            boolean z4 = this.f56149;
            CharSequence charSequence2 = this.f56155;
            if (i11 >= size) {
                if (i12 < charSequence2.length()) {
                    c20438.m46122(i12, charSequence2.length(), charSequence2);
                }
                if (!z4 || arrayList.isEmpty()) {
                    return;
                }
                C19466 c19469 = (C19466) C20013.m45383(arrayList, 1);
                if (c19469.f59308 && (i = c19469.f59322) >= 0) {
                    c19469 = (C19466) arrayList.get(i);
                }
                if (c19469.f59315 && c19469.f59318 && c19469.f59313.equals("html") && !c19469.f59303) {
                    c20438.append((CharSequence) str12);
                    return;
                }
                return;
            }
            C19466 c194610 = (C19466) arrayList.get(i11);
            C22149.m49958();
            int i13 = c194610.f59304;
            int i14 = c194610.f59311;
            if (i13 > i12) {
                c20438.m46122(i12, i13, charSequence2);
            }
            C14847 c14847 = new C14847(c194610.f59304, i14, charSequence2);
            String str13 = " bytes String ";
            String str14 = this.f56152;
            if (z4 && m42832(i11)) {
                i2 = i14;
                int length = c20438.length();
                while (true) {
                    if (length > 0) {
                        charSequence = charSequence2;
                        if (AbstractC14159.m32638(c20438.charAt(length - 1))) {
                            length--;
                            charSequence2 = charSequence;
                        }
                    } else {
                        charSequence = charSequence2;
                    }
                }
                c20438.m46123(length);
                if (c20438.length() > 0) {
                    C20438 c20438Append = c20438.append((CharSequence) str12);
                    int i15 = c194610.f59324;
                    if (i15 < 0) {
                        throw new IllegalArgumentException(C20778.m46922(i15, "count is negative: "));
                    }
                    int length2 = str14.length();
                    if (i15 == 0 || length2 == 0) {
                        str12 = str12;
                        str = "";
                        string3 = str;
                    } else {
                        str12 = str12;
                        if (i15 == 1) {
                            string3 = str14;
                            str = "";
                        } else {
                            str = "";
                            if (str14.length() > Integer.MAX_VALUE / i15) {
                                throw new OutOfMemoryError("Repeating " + str14.length() + " bytes String " + i15 + " times will produce a String exceeding maximum size.");
                            }
                            StringBuilder sb = new StringBuilder(length2 * i15);
                            for (int i16 = 0; i16 < i15; i16++) {
                                sb.append(str14);
                            }
                            string3 = sb.toString();
                        }
                    }
                    c20438Append.append(string3);
                }
                if (!z4 && c194610.f59308 && (i10 = i11 + 1) < arrayList.size() && m42832(i10) && !c194610.f59303) {
                    i4 = i11;
                    i5 = i4;
                } else if (c194610.f59307) {
                    c20438.append((CharSequence) c14847);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c194610.f59325;
                    z = this.f56148;
                    if (i3 == 1 || (c19467 = c194610.f59306) == null) {
                        i4 = i11;
                        if (c194610.f59313 == null && c194610.f59326 && !c194610.f59303) {
                            boolean z5 = c194610.f59318;
                            ArrayList<C4043> arrayList2 = c194610.f59305;
                            c20438.append(z5 ? "</" : "<").append(c194610.f59317);
                            for (C4043 c4043 : arrayList2) {
                                c20438.append(' ');
                                c20438.append(c4043.f8887);
                                if (c4043.f8886) {
                                    c20438.append(C0184a.f880h);
                                    c20438.append(c4043.f8888);
                                }
                            }
                            if (c194610.f59309) {
                                if (!arrayList2.isEmpty() && (str2 = ((C4043) C20013.m45383(arrayList2, 1)).f8888) != null && str2.charAt(0) != '\'' && str2.charAt(0) != '\"') {
                                    c20438.append(' ');
                                }
                                c20438.append("/>");
                            } else {
                                c20438.append('>');
                            }
                        } else if (z || i3 != 8 || c194610.f59303 || !((c19466 = c194610.f59306) == null || c19466.f59326)) {
                            i5 = i4;
                            c20438.append((CharSequence) c14847);
                        } else {
                            i5 = i4;
                            C19466 c194611 = (C19466) arrayList.get(i5);
                            if (!m42833(c14847)) {
                                boolean z6 = false;
                                for (int i17 = 0; i17 < c14847.length(); i17++) {
                                    if ((i17 & 1023) == 0) {
                                        C22149.m49958();
                                    }
                                    char cCharAt = c14847.charAt(i17);
                                    if (AbstractC14159.m32638(cCharAt)) {
                                        if (!z6) {
                                            c20438.append(' ');
                                        }
                                        z6 = true;
                                    } else {
                                        c20438.append(cCharAt);
                                        z6 = false;
                                    }
                                }
                            } else if (c194611.f59306 != null || (i5 != 0 && i5 + 1 != arrayList.size())) {
                                int i18 = i5 + 1;
                                if (i18 >= arrayList.size()) {
                                    c20438.append(' ');
                                } else if (((C19466) arrayList.get(i18)).f59314 != 1) {
                                    C19466 c194612 = (C19466) arrayList.get(i18);
                                    if (!c194612.f59326 || c194612.f59303 || !f56147.contains(c194612.f59313) || ((i5 <= 0 || !c194612.f59318 || c194612.f59312 != arrayList.get(i5 - 1)) && (i5 <= 0 || ((C19466) arrayList.get(i5 - 1)).f59325 != 4 || c194611.f59306 != null))) {
                                        c20438.append(' ');
                                    }
                                }
                            }
                        }
                    } else if (c194610.f59303 || !c19467.f59326 || c19467.f59327 == null) {
                        i4 = i11;
                        c20438.append((CharSequence) c14847);
                    } else {
                        String str15 = c19467.f59313;
                        HashMap map = c19467.f59323;
                        i4 = i11;
                        if (str15.equals("script") || c19467.f59313.equals("style")) {
                            str3 = " times will produce a String exceeding maximum size.";
                            String str16 = str;
                            String str17 = (String) C15525.getOrDefault(map, "type", str16);
                            str4 = str16;
                            if (c19467.f59313.equals("script") && !map.containsKey("type") && map.containsKey(C0655am.f2259N) && !((String) map.get(C0655am.f2259N)).isEmpty()) {
                                str17 = "text/" + ((String) map.get(C0655am.f2259N));
                            }
                            String strM32637 = AbstractC14159.m32637(str17.trim());
                            if (strM32637.indexOf(38) >= 0 || strM32637.indexOf(123) >= 0 || map.containsKey("src")) {
                                str5 = "Repeating ";
                            } else if (!strM32637.isEmpty()) {
                                if (c19467.f59313.equals("script") && strM32637.equals(C0655am.f2344e)) {
                                    str5 = "Repeating ";
                                } else {
                                    if (c19467.f59313.equals("script") && strM32637.equals("importmap")) {
                                        str5 = "Repeating ";
                                    } else {
                                        int iIndexOf = strM32637.indexOf(59);
                                        if (iIndexOf >= 0) {
                                            strM32637 = strM32637.substring(0, iIndexOf).trim();
                                        }
                                        if (!c19467.f59313.equals("style")) {
                                            int iIndexOf2 = strM32637.indexOf(47);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = strM32637.substring(0, iIndexOf2);
                                                Object[] objArr = {TextBundle.TEXT_ENTRY, "application", "dojo"};
                                                HashSet hashSet = new HashSet(3);
                                                str5 = "Repeating ";
                                                int i19 = 0;
                                                for (int i20 = 3; i19 < i20; i20 = 3) {
                                                    Object obj = objArr[i19];
                                                    C12826.requireNonNull(obj);
                                                    if (!hashSet.add(obj)) {
                                                        throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
                                                    }
                                                    i19++;
                                                }
                                                if (C21562.unmodifiableSet(hashSet).contains(strSubstring)) {
                                                    String strSubstring2 = strM32637.substring(iIndexOf2 + 1);
                                                    if (strSubstring2.startsWith("x-")) {
                                                        strSubstring2 = strSubstring2.substring(2);
                                                    }
                                                    strSubstring2.getClass();
                                                    switch (strSubstring2) {
                                                    }
                                                }
                                            }
                                        } else if (strM32637.equals("text/css")) {
                                            str5 = "Repeating ";
                                            str6 = "css";
                                        }
                                        str5 = "Repeating ";
                                    }
                                    str6 = "json";
                                }
                                str6 = "js";
                            } else if (c19467.f59313.equals("style")) {
                                str5 = "Repeating ";
                                str6 = "css";
                            } else {
                                str5 = "Repeating ";
                                str6 = "js";
                            }
                            if (str6 == null) {
                                c20438.append((CharSequence) c14847);
                            } else if (m42833(c14847)) {
                                z2 = this.f56150;
                                if (z2) {
                                    string = str4;
                                } else {
                                    if (z4) {
                                        i8 = 1;
                                        i9 = c19467.f59324 + 1;
                                    } else {
                                        i8 = 1;
                                        i9 = c194610.f59319;
                                    }
                                    if (i9 >= 0) {
                                        throw new IllegalArgumentException(C20778.m46922(i9, "count is negative: "));
                                    }
                                    int length3 = str14.length();
                                    if (i9 != 0 || length3 == 0) {
                                        string = str4;
                                    } else if (i9 == i8) {
                                        string = str14;
                                    } else {
                                        if (str14.length() > Integer.MAX_VALUE / i9) {
                                            throw new OutOfMemoryError(str5 + str14.length() + str13 + i9 + str3);
                                        }
                                        StringBuilder sb2 = new StringBuilder(length3 * i9);
                                        for (int i21 = 0; i21 < i9; i21++) {
                                            sb2.append(str14);
                                        }
                                        string = sb2.toString();
                                    }
                                }
                                c20438M46121 = c20438.m46121();
                                try {
                                    if (str6.equals("css")) {
                                        str7 = str14;
                                        str8 = str12;
                                        str9 = str4;
                                        if (str6.equals("json")) {
                                            enumC19980 = EnumC19980.JSON;
                                        } else {
                                            enumC19980 = EnumC19980.JAVASCRIPT;
                                        }
                                        enumC19981 = enumC19980;
                                        if (z2) {
                                            str10 = str8;
                                            C12167.m28089(c14847, enumC19981, new C5660(0, false), C20651.f63778, true, c20438M46121);
                                        } else {
                                            str10 = str8;
                                            C12167.m28089(c14847, enumC19981, this.f56153, new C20651(string, str10), false, c20438M46121);
                                        }
                                    } else if (z2) {
                                        str7 = str14;
                                        str9 = str4;
                                        C4557.m9634(c14847, new C5660(0, false), C14377.f41090, EnumC15047.STYLESHEET, true, c20438M46121);
                                        str10 = str12;
                                    } else {
                                        str7 = str14;
                                        str9 = str4;
                                        String str18 = str12;
                                        C4557.m9634(c14847, this.f56153, new C14377(string, str18), EnumC15047.STYLESHEET, false, c20438M46121);
                                        str10 = str18;
                                    }
                                    if (c20438M46121.length() == c14847.length()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    for (i6 = 0; z3 && i6 < c14847.length(); i6++) {
                                        if ((i6 & 1023) == 0) {
                                            C22149.m49958();
                                        }
                                        if (c20438M46121.charAt(i6) == c14847.charAt(i6)) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (z3) {
                                        c20438.append((CharSequence) c14847);
                                    } else {
                                        if (z2) {
                                            c18124 = c20438M46121;
                                        } else {
                                            if (m42835(c20438M46121, true)) {
                                                str11 = str9;
                                            } else {
                                                str11 = str10;
                                            }
                                            if (m42835(c20438M46121, false)) {
                                                string2 = str9;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str10);
                                                if (z4) {
                                                    i7 = c19467.f59324;
                                                } else {
                                                    i7 = c19467.f59319;
                                                }
                                                sb3.append(C21459.m48620(i7, str7));
                                                string2 = sb3.toString();
                                            }
                                            c18124 = new C18124(str11, c20438M46121, string2);
                                        }
                                        c19468 = c19467.f59327;
                                        if (AbstractC14159.m32636(new C18124(c18124, new C14847(c19468.f59304, c19468.f59311, charSequence)), c19467.f59313) != c18124.length()) {
                                            c20438.append((CharSequence) c14847);
                                        } else {
                                            c20438.append(c18124);
                                        }
                                    }
                                    c20438M46121.close();
                                } catch (Throwable th) {
                                    try {
                                        c20438M46121.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } else if (!z) {
                                c20438.append((CharSequence) c14847);
                            }
                        } else {
                            str3 = " times will produce a String exceeding maximum size.";
                            str13 = " bytes String ";
                            str5 = "Repeating ";
                            str4 = str;
                        }
                        str6 = null;
                        if (str6 == null) {
                            c20438.append((CharSequence) c14847);
                        } else if (m42833(c14847)) {
                            z2 = this.f56150;
                            if (z2) {
                                if (z4) {
                                    i8 = 1;
                                    i9 = c19467.f59324 + 1;
                                } else {
                                    i8 = 1;
                                    i9 = c194610.f59319;
                                }
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException(C20778.m46922(i9, "count is negative: "));
                                }
                                int length4 = str14.length();
                                if (i9 != 0) {
                                    string = str4;
                                } else {
                                    string = str4;
                                }
                            } else {
                                string = str4;
                            }
                            c20438M46121 = c20438.m46121();
                            if (str6.equals("css")) {
                                str7 = str14;
                                str8 = str12;
                                str9 = str4;
                                if (str6.equals("json")) {
                                    enumC19980 = EnumC19980.JSON;
                                } else {
                                    enumC19980 = EnumC19980.JAVASCRIPT;
                                }
                                enumC19981 = enumC19980;
                                if (z2) {
                                    str10 = str8;
                                    C12167.m28089(c14847, enumC19981, new C5660(0, false), C20651.f63778, true, c20438M46121);
                                } else {
                                    str10 = str8;
                                    C12167.m28089(c14847, enumC19981, this.f56153, new C20651(string, str10), false, c20438M46121);
                                }
                            } else if (z2) {
                                str7 = str14;
                                str9 = str4;
                                C4557.m9634(c14847, new C5660(0, false), C14377.f41090, EnumC15047.STYLESHEET, true, c20438M46121);
                                str10 = str12;
                            } else {
                                str7 = str14;
                                str9 = str4;
                                String str19 = str12;
                                C4557.m9634(c14847, this.f56153, new C14377(string, str19), EnumC15047.STYLESHEET, false, c20438M46121);
                                str10 = str19;
                            }
                            if (c20438M46121.length() == c14847.length()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            while (z3) {
                                if ((i6 & 1023) == 0) {
                                    C22149.m49958();
                                }
                                if (c20438M46121.charAt(i6) == c14847.charAt(i6)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                c20438.append((CharSequence) c14847);
                            } else {
                                if (z2) {
                                    c18124 = c20438M46121;
                                } else {
                                    if (m42835(c20438M46121, true)) {
                                        str11 = str9;
                                    } else {
                                        str11 = str10;
                                    }
                                    if (m42835(c20438M46121, false)) {
                                        string2 = str9;
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(str10);
                                        if (z4) {
                                            i7 = c19467.f59324;
                                        } else {
                                            i7 = c19467.f59319;
                                        }
                                        sb4.append(C21459.m48620(i7, str7));
                                        string2 = sb4.toString();
                                    }
                                    c18124 = new C18124(str11, c20438M46121, string2);
                                }
                                c19468 = c19467.f59327;
                                if (AbstractC14159.m32636(new C18124(c18124, new C14847(c19468.f59304, c19468.f59311, charSequence)), c19467.f59313) != c18124.length()) {
                                    c20438.append((CharSequence) c14847);
                                } else {
                                    c20438.append(c18124);
                                }
                            }
                            c20438M46121.close();
                        } else if (!z) {
                            c20438.append((CharSequence) c14847);
                        }
                    }
                    i5 = i4;
                }
                i11 = i5 + 1;
                i12 = i2;
            } else {
                charSequence = charSequence2;
                i2 = i14;
            }
            str = "";
            if (!z4) {
                if (c194610.f59307) {
                    c20438.append((CharSequence) c14847);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c194610.f59325;
                    z = this.f56148;
                    if (i3 == 1) {
                        i4 = i11;
                        if (c194610.f59313 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c20438.append((CharSequence) c14847);
                        } else {
                            i5 = i4;
                            c20438.append((CharSequence) c14847);
                        }
                    } else {
                        i4 = i11;
                        if (c194610.f59313 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c20438.append((CharSequence) c14847);
                        } else {
                            i5 = i4;
                            c20438.append((CharSequence) c14847);
                        }
                    }
                }
            } else if (c194610.f59307) {
                c20438.append((CharSequence) c14847);
                i4 = i11;
                i5 = i4;
            } else {
                i3 = c194610.f59325;
                z = this.f56148;
                if (i3 == 1) {
                    i4 = i11;
                    if (c194610.f59313 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c20438.append((CharSequence) c14847);
                    } else {
                        i5 = i4;
                        c20438.append((CharSequence) c14847);
                    }
                } else {
                    i4 = i11;
                    if (c194610.f59313 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c20438.append((CharSequence) c14847);
                    } else {
                        i5 = i4;
                        c20438.append((CharSequence) c14847);
                    }
                }
            }
            i11 = i5 + 1;
            i12 = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:215:0x027c  */
    /* JADX WARN: Code duplicated, block: B:216:0x027e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* JADX INFO: renamed from: ۧ */
    private void m42836() {
        ArrayList arrayList;
        int iContains;
        C19466 c19466;
        boolean z;
        int i;
        C19466 c19467;
        C19466 c19468;
        C19466 c19469;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            arrayList = this.f56151;
            if (i3 >= arrayList.size()) {
                break;
            }
            C22149.m49958();
            C19466 c194610 = (C19466) arrayList.get(i3);
            c194610.f59322 = i2;
            String str = c194610.f59313;
            boolean z2 = str != null && !c194610.f59310 && c194610.f59326 && (!c194610.f59318 ? !((str.equals("html") && c194610.f59306 == null) || ((c194610.f59313.equals("head") || c194610.f59313.equals("body")) && ((c19468 = c194610.f59306) == null || (c19468.f59315 && c19468.f59313.equals("html"))))) : (c19469 = c194610.f59312) == null || !c19469.f59315);
            c194610.f59315 = z2;
            if (z2) {
                i = 0;
            } else if (!c194610.f59318 || (c19467 = c194610.f59312) == null) {
                C19466 c194611 = c194610.f59306;
                if (c194611 == null) {
                    i = 0;
                } else {
                    i = c194611.f59324 + 1;
                }
            } else {
                i = c19467.f59324;
            }
            c194610.f59324 = i;
            if (!c194610.f59308) {
                i2 = i3;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C22149.m49958();
            C19466 c194612 = (C19466) arrayList.get(i4);
            if (c194612.f59308 || ((c194612.f59307 && (c194612.f59313 == null || c194612.f59303)) || c194612.f59310 || ((c19466 = c194612.f59306) != null && c19466.f59303))) {
                iContains = 0;
            } else {
                int i5 = c194612.f59322;
                C19466 c194613 = i5 < 0 ? null : (C19466) arrayList.get(i5);
                if (c194613 != null && c194613.f59307 && (c194613.f59313 == null || c194613.f59303)) {
                    iContains = 0;
                } else {
                    int i6 = c194612.f59325;
                    if (i6 != 4) {
                        Object obj = c194612.f59313;
                        if (obj != null && (!c194612.f59326 || (((z = c194612.f59318) && c194612.f59312 == null) || (z && c194612.f59303)))) {
                            iContains = 0;
                        } else if (c194612.f59315) {
                            iContains = 1;
                        } else {
                            C19466 c194614 = c194612.f59306;
                            if (c194614 == null || !c194614.f59316) {
                                iContains = 2;
                                iContains = 2;
                                iContains = 2;
                                Set set = f56147;
                                if (i6 == 2) {
                                    if (c194614 != null && !set.contains(c194614.f59313)) {
                                        iContains = 0;
                                    } else if (c194613 == null || m42837(c194613)) {
                                        iContains = 1;
                                    }
                                } else if (obj == null || (c194612.f59318 && c194612.f59312.f59316)) {
                                    iContains = 0;
                                } else if (c194613 == null) {
                                    iContains = set.contains(obj);
                                } else {
                                    int i7 = c194613.f59325;
                                    if (i7 == 1) {
                                        iContains = 0;
                                    } else if (c194613.f59313 == null && i7 != 2 && i7 != 4) {
                                        C19466 c194615 = c194613.f59306;
                                        if (c194615 != null && c194615 != c194614 && !c194615.f59303 && set.contains(c194615.f59313)) {
                                            if (!c194612.f59318) {
                                                String str2 = c194613.f59306.f59313;
                                                String str3 = c194612.f59313;
                                                if (str2.equals(C0655am.f2322ax) && set.contains(str3)) {
                                                    Object[] objArr = {"script", "style", "meta", "link", "base"};
                                                    HashSet hashSet = new HashSet(5);
                                                    for (int i8 = 0; i8 < 5; i8++) {
                                                        Object obj2 = objArr[i8];
                                                        C12826.requireNonNull(obj2);
                                                        if (!hashSet.add(obj2)) {
                                                            throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
                                                        }
                                                    }
                                                    if (C21562.unmodifiableSet(hashSet).contains(str3)) {
                                                        if (str2.equals("li")) {
                                                        }
                                                    }
                                                } else if ((str2.equals("li") || !str3.equals("li")) && (((!str2.equals("dt") && !str2.equals("dd")) || (!str3.equals("dt") && !str3.equals("dd"))) && ((!str2.equals("option") || (!str3.equals("option") && !str3.equals("optgroup"))) && ((!str2.equals("optgroup") || !str3.equals("optgroup")) && ((!str2.equals("tr") || !str3.equals("tr")) && (((!str2.equals("td") && !str2.equals("th")) || (!str3.equals("td") && !str3.equals("th"))) && ((!str2.equals("thead") && !str2.equals("tbody") && !str2.equals("tfoot")) || (!str3.equals("tbody") && !str3.equals("tfoot"))))))))) {
                                                }
                                            }
                                            iContains = 1;
                                        }
                                        iContains = 0;
                                    } else if (c194612.f59312 == c194613) {
                                        iContains = 0;
                                    } else if (!set.contains(obj)) {
                                        C19466 c194616 = c194612.f59306;
                                        if (c194616 == null || (!c194616.f59315 && c194616.f59313.indexOf(58) < 0)) {
                                            iContains = 0;
                                        } else if (m42837(c194613)) {
                                            iContains = 1;
                                        }
                                    } else if (m42837(c194613)) {
                                        iContains = 1;
                                    }
                                }
                            } else {
                                iContains = 0;
                            }
                        }
                    } else if (c194612.f59306 == null && m42834(c194612)) {
                        iContains = 1;
                    } else {
                        iContains = 0;
                    }
                }
            }
            c194612.f59314 = iContains;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m42837(C19466 c19466) {
        int i;
        C19466 c19467 = c19466.f59318 ? c19466.f59312 : c19466;
        String str = c19466.f59313;
        return (str != null && c19466.f59326 && f56147.contains(str) && (!f56146.contains(c19466.f59313) || (c19467 != null && c19467.f59314 == 1))) || ((i = c19466.f59325) == 2 && c19466.f59314 == 1) || (i == 4 && m42834(c19466));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42834(C19466 c19466) {
        int i;
        int i2 = c19466.f59304;
        if (c19466.f59325 != 4) {
            return false;
        }
        CharSequence charSequence = this.f56155;
        return C4965.m10524(charSequence, true, i2, "<!doctype", 9) && (i = c19466.f59311) > i2 + 9 && charSequence.charAt(i - 1) == '>';
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42832(int i) {
        ArrayList arrayList = this.f56151;
        int i2 = ((C19466) arrayList.get(i)).f59314;
        return i2 == 1 || (i2 == 2 && i > 0 && ((C19466) arrayList.get(i - 1)).f59308);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42835(C20438 c20438, boolean z) {
        int length = z ? 0 : c20438.length() - 1;
        while (length >= 0 && length < c20438.length()) {
            char cCharAt = c20438.charAt(length);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            if (!AbstractC14159.m32638(cCharAt)) {
                break;
            }
            length += z ? 1 : -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42833(C14847 c14847) {
        for (int i = 0; i < c14847.length(); i++) {
            if ((i & 1023) == 0) {
                C22149.m49958();
            }
            if (!AbstractC14159.m32638(c14847.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
