package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.p.a;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17284 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Set f52964;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Set f52965;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52966;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f52967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52969 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f52970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3463 f52971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52972;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence f52973;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23634 f52974;

    static {
        String[] strArr = {"html", "head", "body", "address", "article", "aside", "blockquote", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "menu", "nav", "ol", am.ax, "pre", "section", "table", "thead", "tbody", "tfoot", "tr", "td", "th", "ul", "script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet = new HashSet(48);
        for (int i = 0; i < 48; i++) {
            String str = strArr[i];
            C11003.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f52965 = C20195.unmodifiableSet(hashSet);
        Object[] objArr = {"script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet2 = new HashSet(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Object obj = objArr[i2];
            C11003.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f52964 = C20195.unmodifiableSet(hashSet2);
    }

    public C17284(CharSequence charSequence, C3463 c3463, C21579 c21579, boolean z) {
        String string;
        this.f52973 = charSequence;
        this.f52974 = new C23634(charSequence);
        this.f52971 = c3463;
        this.f52968 = z;
        this.f52967 = !z && c21579.m48746() == EnumC15227.READABLE;
        this.f52966 = c21579.m48746() == EnumC15227.READABLE;
        this.f52972 = C20813.m47629(charSequence);
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
        this.f52970 = string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40579(CharSequence charSequence, C3463 c3463, C21579 c21579, boolean z, C19012 c19012) {
        try {
            C20813.m47630();
            C17284 c17284 = new C17284(charSequence, c3463, c21579, z);
            if (c17284.m40587()) {
                c17284.m40578();
                c17284.m40585();
                c17284.m40580(c19012);
            } else {
                c19012.append(charSequence);
            }
            C20813.m47630();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C6701 unused) {
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m40587() {
        Iterator it;
        Iterator it2;
        ?? r7;
        ?? M36561;
        boolean z;
        boolean z2;
        C23634 c23634 = this.f52974;
        C13111 c13111 = new C13111(new C20813(c23634.m52127()));
        c13111.m43458();
        C10935 c10935 = new C10935(c13111, this.f52973.length());
        c10935.m6206();
        boolean z3 = false;
        z3 = false;
        if (!c13111.m30578()) {
            C7467 c7467 = new C7467(c10935);
            c7467.m43458();
            Iterator it3 = c7467.m20010().m23037(C11701.class).iterator();
            while (true) {
                int i = 1;
                if (!it3.hasNext()) {
                    return true;
                }
                C11701 c11701 = (C11701) it3.next();
                C20813.m47630();
                C17990 c17990 = new C17990(c11701.f27156.mo2054(), c11701.f27155.mo2053() + 1, c11701.f27156.getType());
                c17990.f56110 = c23634.m52128(c17990.f56107, c17990.f56114);
                C22989 c22989 = (C22989) c11701.m23039(C22989.class, z3 ? 1 : 0);
                if (c22989 != null) {
                    int i2 = 14;
                    InterfaceC0463 interfaceC0463Mo12628 = c22989.m23038(14, z3 ? 1 : 0).mo12628();
                    if (!c23634.m52128(interfaceC0463Mo12628.mo2054(), interfaceC0463Mo12628.mo2053() + 1)) {
                        c17990.f56116 = AbstractC12406.m30573(c22989.m23038(14, z3 ? 1 : 0).getText());
                        c17990.f56120 = c22989.m23038(14, z3 ? 1 : 0).getText();
                        c17990.f56121 = c22989.m23038(6, z3 ? 1 : 0) != null;
                        c17990.f56112 = c22989.m23038(10, z3 ? 1 : 0) != null;
                        boolean z4 = c22989.m23038(11, z3 ? 1 : 0) != null || c17990.f56112;
                        c17990.f56123 = z4;
                        c17990.f56129 = z4;
                        Iterator it4 = c22989.m23037(C13816.class).iterator();
                        ?? r4 = z3;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            ArrayList arrayList = c17990.f56108;
                            if (!zHasNext) {
                                it = it3;
                                if (c17990.f56121 && (!arrayList.isEmpty() || c17990.f56112)) {
                                    c17990.f56129 = false;
                                }
                                if (c17990.f56110 && !c17990.f56129) {
                                    c17990.f56124 = true;
                                    break;
                                }
                                break;
                            }
                            ?? r8 = (C13816) it4.next();
                            ?? r10 = (C10290) r8.m23039(C10290.class, r4);
                            if (c23634.m52128(r8.f27156.mo2054(), r8.f27155.mo2053() + i)) {
                                boolean z5 = c17990.f56124;
                                if (r10 == 0 || r10.m23038(19, r4) == null || c23634.m52128(r10.m23038(i2, r4).mo12628().mo2054(), r10.m23038(i2, r4).mo12628().mo2053() + i)) {
                                    it2 = it3;
                                } else {
                                    String str = c17990.f56116;
                                    String strM30573 = AbstractC12406.m30573(r10.m23038(i2, r4).getText());
                                    if (strM30573.equals("style") || strM30573.equals("xml:space") || strM30573.equals("xmlns") || strM30573.startsWith("xmlns:")) {
                                        it2 = it3;
                                    } else {
                                        if (str.equals("script")) {
                                            Object[] objArr = new Object[3];
                                            objArr[r4] = "type";
                                            objArr[1] = am.N;
                                            objArr[2] = "src";
                                            HashSet hashSet = new HashSet(3);
                                            it2 = it3;
                                            int i3 = 0;
                                            for (int i4 = 3; i3 < i4; i4 = 3) {
                                                Object obj = objArr[i3];
                                                C11003.requireNonNull(obj);
                                                if (!hashSet.add(obj)) {
                                                    throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
                                                }
                                                i3++;
                                            }
                                            if (!C20195.unmodifiableSet(hashSet).contains(strM30573)) {
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                        z2 = (str.equals("style") && strM30573.equals("type")) || (str.equals("annotation-xml") && strM30573.equals("encoding"));
                                    }
                                }
                                c17990.f56124 = z2 | z5;
                            } else {
                                it2 = it3;
                            }
                            if (r10 == 0) {
                                z = false;
                                z = false;
                                if (r8.m23038(12, 0) == null) {
                                    c17990.f56129 = false;
                                }
                            } else {
                                String text = r10.m23038(14, 0).getText();
                                ?? text2 = r10.m23038(19, 0) != null ? r10.m23038(19, 0).getText() : r10.m23038(20, 0) != null ? r10.m23038(20, 0).getText() : 0;
                                boolean z6 = r10.m23038(13, 0) != null;
                                if (!(z6 && text2 == 0) && text.indexOf(123) < 0 && text.indexOf(37) < 0) {
                                    r7 = 0;
                                } else {
                                    r7 = 0;
                                    c17990.f56129 = false;
                                }
                                if (text2 != 0 && ((text2.charAt(r7) == '\'' || text2.charAt(r7) == '\"') && (text2.length() < 2 || C7416.m19937(1, (String) text2) != text2.charAt(r7)))) {
                                    c17990.f56129 = r7;
                                }
                                arrayList.add(new C1762(text, text2, z6));
                                String strM30574 = AbstractC12406.m30573(text);
                                if (text2 == 0) {
                                    M36561 = "";
                                } else if (text2.length() > 1 && (text2.charAt(0) == '\'' || text2.charAt(0) == '\"')) {
                                    M36561 = text2;
                                    M36561 = text2;
                                    M36561 = text2;
                                    char cM19937 = C7416.m19937(1, (String) text2);
                                    char cCharAt = text2.charAt(0);
                                    M36561 = text2;
                                    if (cM19937 == cCharAt) {
                                        M36561 = C15472.m36561(1, 1, text2);
                                    }
                                }
                                M36561 = text2;
                                M36561 = text2;
                                M36561 = text2;
                                C13843.putIfAbsent(c17990.f56126, strM30574, M36561);
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
                this.f52969.add(c17990);
                z3 = false;
                it3 = it;
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40578() {
        C4645 c4645M9910;
        C17990 c17990;
        C17990 c17991;
        C3234 c3234 = new C3234();
        for (C17990 c17992 : this.f52969) {
            C20813.m47630();
            String str = c17992.f56116;
            int i = c17992.f56128;
            if (str == null || !c17992.f56123) {
                c4645M9910 = null;
            } else {
                c4645M9910 = c17992.f56121 ? c3234.m9910(str) : c3234.m9911(str, c17992.f56126, c17992.f56112, c17992);
                if (c17992.f56121 && c4645M9910 != null) {
                    C17990 c17993 = (C17990) c4645M9910.f14731;
                    c17993.f56130 = c17992;
                    c17992.f56115 = c17993;
                }
            }
            C4645 c4645M9909 = (c4645M9910 == null || c17992.f56121) ? c3234.m9909() : c4645M9910.f14733;
            c17992.f56122 = (c4645M9910 == null || c17992.f56121) ? c3234.m9912() : c4645M9910.f14730;
            C17990 c17994 = c4645M9909 != null ? (C17990) c4645M9909.f14731 : null;
            c17992.f56109 = c17994;
            boolean z = false;
            c17992.f56113 = c4645M9910 == null ? !(c4645M9909 == null || c4645M9909.f14735 == 0) : c4645M9910.f14735 != 0;
            boolean z2 = (c4645M9910 != null && c4645M9910.f14737) || (c4645M9909 != null && c4645M9909.f14737);
            c17992.f56106 = z2;
            c17992.f56106 = z2 | (c17992.f56124 || (c17994 != null && c17994.f56106) || ((c17991 = c17992.f56115) != null && c17991.f56106));
            if (i == 8 && m40582(new C13130(c17992.f56107, c17992.f56114, this.f52973))) {
                z = true;
            }
            c17992.f56111 = z;
            if (c17992.f56116 == null && (c17990 = c17992.f56109) != null && i != 2 && i != 1 && !z) {
                c17990.f56119 = true;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40580(C19012 c19012) throws Throwable {
        int i;
        CharSequence charSequence;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        int i5;
        C17990 c17990;
        String str2;
        C17990 c17991;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        String string;
        C19012 c19012M43853;
        String str7;
        String str8;
        String str9;
        EnumC18531 enumC18531;
        EnumC18531 enumC18532;
        String str10;
        boolean z3;
        int i6;
        CharSequence c16578;
        String str11;
        int i7;
        String string2;
        C17990 c17992;
        int i8;
        int i9;
        int i10;
        CharSequence string3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f52969;
            int size = arrayList.size();
            String str12 = this.f52972;
            boolean z4 = this.f52967;
            CharSequence charSequence2 = this.f52973;
            if (i11 >= size) {
                if (i12 < charSequence2.length()) {
                    c19012.m43854(i12, charSequence2.length(), charSequence2);
                }
                if (!z4 || arrayList.isEmpty()) {
                    return;
                }
                C17990 c17993 = (C17990) C18566.m43105(arrayList, 1);
                if (c17993.f56111 && (i = c17993.f56125) >= 0) {
                    c17993 = (C17990) arrayList.get(i);
                }
                if (c17993.f56118 && c17993.f56121 && c17993.f56116.equals("html") && !c17993.f56106) {
                    c19012.append((CharSequence) str12);
                    return;
                }
                return;
            }
            C17990 c17994 = (C17990) arrayList.get(i11);
            C20813.m47630();
            int i13 = c17994.f56107;
            int i14 = c17994.f56114;
            if (i13 > i12) {
                c19012.m43854(i12, i13, charSequence2);
            }
            C13130 c13130 = new C13130(c17994.f56107, i14, charSequence2);
            String str13 = " bytes String ";
            String str14 = this.f52970;
            if (z4 && m40581(i11)) {
                i2 = i14;
                int length = c19012.length();
                while (true) {
                    if (length > 0) {
                        charSequence = charSequence2;
                        if (AbstractC12406.m30574(c19012.charAt(length - 1))) {
                            length--;
                            charSequence2 = charSequence;
                        }
                    } else {
                        charSequence = charSequence2;
                    }
                }
                c19012.m43855(length);
                if (c19012.length() > 0) {
                    C19012 c19012Append = c19012.append((CharSequence) str12);
                    int i15 = c17994.f56127;
                    if (i15 < 0) {
                        throw new IllegalArgumentException(C19370.m44628(i15, "count is negative: "));
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
                    c19012Append.append(string3);
                }
                if (!z4 && c17994.f56111 && (i10 = i11 + 1) < arrayList.size() && m40581(i10) && !c17994.f56106) {
                    i4 = i11;
                    i5 = i4;
                } else if (c17994.f56110) {
                    c19012.append((CharSequence) c13130);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c17994.f56128;
                    z = this.f52966;
                    if (i3 == 1 || (c17991 = c17994.f56109) == null) {
                        i4 = i11;
                        if (c17994.f56116 == null && c17994.f56129 && !c17994.f56106) {
                            boolean z5 = c17994.f56121;
                            ArrayList<C1762> arrayList2 = c17994.f56108;
                            c19012.append(z5 ? "</" : "<").append(c17994.f56120);
                            for (C1762 c1762 : arrayList2) {
                                c19012.append(' ');
                                c19012.append(c1762.f6111);
                                if (c1762.f6110) {
                                    c19012.append(a.h);
                                    c19012.append(c1762.f6112);
                                }
                            }
                            if (c17994.f56112) {
                                if (!arrayList2.isEmpty() && (str2 = ((C1762) C18566.m43105(arrayList2, 1)).f6112) != null && str2.charAt(0) != '\'' && str2.charAt(0) != '\"') {
                                    c19012.append(' ');
                                }
                                c19012.append("/>");
                            } else {
                                c19012.append('>');
                            }
                        } else if (z || i3 != 8 || c17994.f56106 || !((c17990 = c17994.f56109) == null || c17990.f56129)) {
                            i5 = i4;
                            c19012.append((CharSequence) c13130);
                        } else {
                            i5 = i4;
                            C17990 c17995 = (C17990) arrayList.get(i5);
                            if (!m40582(c13130)) {
                                boolean z6 = false;
                                for (int i17 = 0; i17 < c13130.length(); i17++) {
                                    if ((i17 & 1023) == 0) {
                                        C20813.m47630();
                                    }
                                    char cCharAt = c13130.charAt(i17);
                                    if (AbstractC12406.m30574(cCharAt)) {
                                        if (!z6) {
                                            c19012.append(' ');
                                        }
                                        z6 = true;
                                    } else {
                                        c19012.append(cCharAt);
                                        z6 = false;
                                    }
                                }
                            } else if (c17995.f56109 != null || (i5 != 0 && i5 + 1 != arrayList.size())) {
                                int i18 = i5 + 1;
                                if (i18 >= arrayList.size()) {
                                    c19012.append(' ');
                                } else if (((C17990) arrayList.get(i18)).f56117 != 1) {
                                    C17990 c17996 = (C17990) arrayList.get(i18);
                                    if (!c17996.f56129 || c17996.f56106 || !f52965.contains(c17996.f56116) || ((i5 <= 0 || !c17996.f56121 || c17996.f56115 != arrayList.get(i5 - 1)) && (i5 <= 0 || ((C17990) arrayList.get(i5 - 1)).f56128 != 4 || c17995.f56109 != null))) {
                                        c19012.append(' ');
                                    }
                                }
                            }
                        }
                    } else if (c17994.f56106 || !c17991.f56129 || c17991.f56130 == null) {
                        i4 = i11;
                        c19012.append((CharSequence) c13130);
                    } else {
                        String str15 = c17991.f56116;
                        HashMap map = c17991.f56126;
                        i4 = i11;
                        if (str15.equals("script") || c17991.f56116.equals("style")) {
                            str3 = " times will produce a String exceeding maximum size.";
                            String str16 = str;
                            String str17 = (String) C13843.getOrDefault(map, "type", str16);
                            str4 = str16;
                            if (c17991.f56116.equals("script") && !map.containsKey("type") && map.containsKey(am.N) && !((String) map.get(am.N)).isEmpty()) {
                                str17 = "text/" + ((String) map.get(am.N));
                            }
                            String strM30573 = AbstractC12406.m30573(str17.trim());
                            if (strM30573.indexOf(38) >= 0 || strM30573.indexOf(123) >= 0 || map.containsKey("src")) {
                                str5 = "Repeating ";
                            } else if (!strM30573.isEmpty()) {
                                if (c17991.f56116.equals("script") && strM30573.equals(am.e)) {
                                    str5 = "Repeating ";
                                } else {
                                    if (c17991.f56116.equals("script") && strM30573.equals("importmap")) {
                                        str5 = "Repeating ";
                                    } else {
                                        int iIndexOf = strM30573.indexOf(59);
                                        if (iIndexOf >= 0) {
                                            strM30573 = strM30573.substring(0, iIndexOf).trim();
                                        }
                                        if (!c17991.f56116.equals("style")) {
                                            int iIndexOf2 = strM30573.indexOf(47);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = strM30573.substring(0, iIndexOf2);
                                                Object[] objArr = {TextBundle.TEXT_ENTRY, "application", "dojo"};
                                                HashSet hashSet = new HashSet(3);
                                                str5 = "Repeating ";
                                                int i19 = 0;
                                                for (int i20 = 3; i19 < i20; i20 = 3) {
                                                    Object obj = objArr[i19];
                                                    C11003.requireNonNull(obj);
                                                    if (!hashSet.add(obj)) {
                                                        throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
                                                    }
                                                    i19++;
                                                }
                                                if (C20195.unmodifiableSet(hashSet).contains(strSubstring)) {
                                                    String strSubstring2 = strM30573.substring(iIndexOf2 + 1);
                                                    if (strSubstring2.startsWith("x-")) {
                                                        strSubstring2 = strSubstring2.substring(2);
                                                    }
                                                    strSubstring2.getClass();
                                                    switch (strSubstring2) {
                                                    }
                                                }
                                            }
                                        } else if (strM30573.equals("text/css")) {
                                            str5 = "Repeating ";
                                            str6 = "css";
                                        }
                                        str5 = "Repeating ";
                                    }
                                    str6 = "json";
                                }
                                str6 = "js";
                            } else if (c17991.f56116.equals("style")) {
                                str5 = "Repeating ";
                                str6 = "css";
                            } else {
                                str5 = "Repeating ";
                                str6 = "js";
                            }
                            if (str6 == null) {
                                c19012.append((CharSequence) c13130);
                            } else if (m40582(c13130)) {
                                z2 = this.f52968;
                                if (z2) {
                                    string = str4;
                                } else {
                                    if (z4) {
                                        i8 = 1;
                                        i9 = c17991.f56127 + 1;
                                    } else {
                                        i8 = 1;
                                        i9 = c17994.f56122;
                                    }
                                    if (i9 >= 0) {
                                        throw new IllegalArgumentException(C19370.m44628(i9, "count is negative: "));
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
                                c19012M43853 = c19012.m43853();
                                try {
                                    if (str6.equals("css")) {
                                        str7 = str14;
                                        str8 = str12;
                                        str9 = str4;
                                        if (str6.equals("json")) {
                                            enumC18531 = EnumC18531.JSON;
                                        } else {
                                            enumC18531 = EnumC18531.JAVASCRIPT;
                                        }
                                        enumC18532 = enumC18531;
                                        if (z2) {
                                            str10 = str8;
                                            C10310.m26065(c13130, enumC18532, new C3463(0, false), C19237.f60547, true, c19012M43853);
                                        } else {
                                            str10 = str8;
                                            C10310.m26065(c13130, enumC18532, this.f52971, new C19237(string, str10), false, c19012M43853);
                                        }
                                    } else if (z2) {
                                        str7 = str14;
                                        str9 = str4;
                                        C2303.m7566(c13130, new C3463(0, false), C12635.f38064, EnumC13340.STYLESHEET, true, c19012M43853);
                                        str10 = str12;
                                    } else {
                                        str7 = str14;
                                        str9 = str4;
                                        String str18 = str12;
                                        C2303.m7566(c13130, this.f52971, new C12635(string, str18), EnumC13340.STYLESHEET, false, c19012M43853);
                                        str10 = str18;
                                    }
                                    if (c19012M43853.length() == c13130.length()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    for (i6 = 0; z3 && i6 < c13130.length(); i6++) {
                                        if ((i6 & 1023) == 0) {
                                            C20813.m47630();
                                        }
                                        if (c19012M43853.charAt(i6) == c13130.charAt(i6)) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (z3) {
                                        c19012.append((CharSequence) c13130);
                                    } else {
                                        if (z2) {
                                            c16578 = c19012M43853;
                                        } else {
                                            if (m40584(c19012M43853, true)) {
                                                str11 = str9;
                                            } else {
                                                str11 = str10;
                                            }
                                            if (m40584(c19012M43853, false)) {
                                                string2 = str9;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str10);
                                                if (z4) {
                                                    i7 = c17991.f56127;
                                                } else {
                                                    i7 = c17991.f56122;
                                                }
                                                sb3.append(C20087.m46304(i7, str7));
                                                string2 = sb3.toString();
                                            }
                                            c16578 = new C16578(str11, c19012M43853, string2);
                                        }
                                        c17992 = c17991.f56130;
                                        if (AbstractC12406.m30572(new C16578(c16578, new C13130(c17992.f56107, c17992.f56114, charSequence)), c17991.f56116) != c16578.length()) {
                                            c19012.append((CharSequence) c13130);
                                        } else {
                                            c19012.append(c16578);
                                        }
                                    }
                                    c19012M43853.close();
                                } catch (Throwable th) {
                                    try {
                                        c19012M43853.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } else if (!z) {
                                c19012.append((CharSequence) c13130);
                            }
                        } else {
                            str3 = " times will produce a String exceeding maximum size.";
                            str13 = " bytes String ";
                            str5 = "Repeating ";
                            str4 = str;
                        }
                        str6 = null;
                        if (str6 == null) {
                            c19012.append((CharSequence) c13130);
                        } else if (m40582(c13130)) {
                            z2 = this.f52968;
                            if (z2) {
                                if (z4) {
                                    i8 = 1;
                                    i9 = c17991.f56127 + 1;
                                } else {
                                    i8 = 1;
                                    i9 = c17994.f56122;
                                }
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException(C19370.m44628(i9, "count is negative: "));
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
                            c19012M43853 = c19012.m43853();
                            if (str6.equals("css")) {
                                str7 = str14;
                                str8 = str12;
                                str9 = str4;
                                if (str6.equals("json")) {
                                    enumC18531 = EnumC18531.JSON;
                                } else {
                                    enumC18531 = EnumC18531.JAVASCRIPT;
                                }
                                enumC18532 = enumC18531;
                                if (z2) {
                                    str10 = str8;
                                    C10310.m26065(c13130, enumC18532, new C3463(0, false), C19237.f60547, true, c19012M43853);
                                } else {
                                    str10 = str8;
                                    C10310.m26065(c13130, enumC18532, this.f52971, new C19237(string, str10), false, c19012M43853);
                                }
                            } else if (z2) {
                                str7 = str14;
                                str9 = str4;
                                C2303.m7566(c13130, new C3463(0, false), C12635.f38064, EnumC13340.STYLESHEET, true, c19012M43853);
                                str10 = str12;
                            } else {
                                str7 = str14;
                                str9 = str4;
                                String str19 = str12;
                                C2303.m7566(c13130, this.f52971, new C12635(string, str19), EnumC13340.STYLESHEET, false, c19012M43853);
                                str10 = str19;
                            }
                            if (c19012M43853.length() == c13130.length()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            while (z3) {
                                if ((i6 & 1023) == 0) {
                                    C20813.m47630();
                                }
                                if (c19012M43853.charAt(i6) == c13130.charAt(i6)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                c19012.append((CharSequence) c13130);
                            } else {
                                if (z2) {
                                    c16578 = c19012M43853;
                                } else {
                                    if (m40584(c19012M43853, true)) {
                                        str11 = str9;
                                    } else {
                                        str11 = str10;
                                    }
                                    if (m40584(c19012M43853, false)) {
                                        string2 = str9;
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(str10);
                                        if (z4) {
                                            i7 = c17991.f56127;
                                        } else {
                                            i7 = c17991.f56122;
                                        }
                                        sb4.append(C20087.m46304(i7, str7));
                                        string2 = sb4.toString();
                                    }
                                    c16578 = new C16578(str11, c19012M43853, string2);
                                }
                                c17992 = c17991.f56130;
                                if (AbstractC12406.m30572(new C16578(c16578, new C13130(c17992.f56107, c17992.f56114, charSequence)), c17991.f56116) != c16578.length()) {
                                    c19012.append((CharSequence) c13130);
                                } else {
                                    c19012.append(c16578);
                                }
                            }
                            c19012M43853.close();
                        } else if (!z) {
                            c19012.append((CharSequence) c13130);
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
                if (c17994.f56110) {
                    c19012.append((CharSequence) c13130);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c17994.f56128;
                    z = this.f52966;
                    if (i3 == 1) {
                        i4 = i11;
                        if (c17994.f56116 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c19012.append((CharSequence) c13130);
                        } else {
                            i5 = i4;
                            c19012.append((CharSequence) c13130);
                        }
                    } else {
                        i4 = i11;
                        if (c17994.f56116 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c19012.append((CharSequence) c13130);
                        } else {
                            i5 = i4;
                            c19012.append((CharSequence) c13130);
                        }
                    }
                }
            } else if (c17994.f56110) {
                c19012.append((CharSequence) c13130);
                i4 = i11;
                i5 = i4;
            } else {
                i3 = c17994.f56128;
                z = this.f52966;
                if (i3 == 1) {
                    i4 = i11;
                    if (c17994.f56116 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c19012.append((CharSequence) c13130);
                    } else {
                        i5 = i4;
                        c19012.append((CharSequence) c13130);
                    }
                } else {
                    i4 = i11;
                    if (c17994.f56116 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c19012.append((CharSequence) c13130);
                    } else {
                        i5 = i4;
                        c19012.append((CharSequence) c13130);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40585() {
        ArrayList arrayList;
        int iContains;
        C17990 c17990;
        boolean z;
        int i;
        C17990 c17991;
        C17990 c17992;
        C17990 c17993;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            arrayList = this.f52969;
            if (i3 >= arrayList.size()) {
                break;
            }
            C20813.m47630();
            C17990 c17994 = (C17990) arrayList.get(i3);
            c17994.f56125 = i2;
            String str = c17994.f56116;
            boolean z2 = str != null && !c17994.f56113 && c17994.f56129 && (!c17994.f56121 ? !((str.equals("html") && c17994.f56109 == null) || ((c17994.f56116.equals("head") || c17994.f56116.equals("body")) && ((c17992 = c17994.f56109) == null || (c17992.f56118 && c17992.f56116.equals("html"))))) : (c17993 = c17994.f56115) == null || !c17993.f56118);
            c17994.f56118 = z2;
            if (z2) {
                i = 0;
            } else if (!c17994.f56121 || (c17991 = c17994.f56115) == null) {
                C17990 c17995 = c17994.f56109;
                if (c17995 == null) {
                    i = 0;
                } else {
                    i = c17995.f56127 + 1;
                }
            } else {
                i = c17991.f56127;
            }
            c17994.f56127 = i;
            if (!c17994.f56111) {
                i2 = i3;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C20813.m47630();
            C17990 c17996 = (C17990) arrayList.get(i4);
            if (c17996.f56111 || ((c17996.f56110 && (c17996.f56116 == null || c17996.f56106)) || c17996.f56113 || ((c17990 = c17996.f56109) != null && c17990.f56106))) {
                iContains = 0;
            } else {
                int i5 = c17996.f56125;
                C17990 c17997 = i5 < 0 ? null : (C17990) arrayList.get(i5);
                if (c17997 != null && c17997.f56110 && (c17997.f56116 == null || c17997.f56106)) {
                    iContains = 0;
                } else {
                    int i6 = c17996.f56128;
                    if (i6 != 4) {
                        Object obj = c17996.f56116;
                        if (obj != null && (!c17996.f56129 || (((z = c17996.f56121) && c17996.f56115 == null) || (z && c17996.f56106)))) {
                            iContains = 0;
                        } else if (c17996.f56118) {
                            iContains = 1;
                        } else {
                            C17990 c17998 = c17996.f56109;
                            if (c17998 == null || !c17998.f56119) {
                                iContains = 2;
                                iContains = 2;
                                iContains = 2;
                                Set set = f52965;
                                if (i6 == 2) {
                                    if (c17998 != null && !set.contains(c17998.f56116)) {
                                        iContains = 0;
                                    } else if (c17997 == null || m40586(c17997)) {
                                        iContains = 1;
                                    }
                                } else if (obj == null || (c17996.f56121 && c17996.f56115.f56119)) {
                                    iContains = 0;
                                } else if (c17997 == null) {
                                    iContains = set.contains(obj);
                                } else {
                                    int i7 = c17997.f56128;
                                    if (i7 == 1) {
                                        iContains = 0;
                                    } else if (c17997.f56116 == null && i7 != 2 && i7 != 4) {
                                        C17990 c17999 = c17997.f56109;
                                        if (c17999 != null && c17999 != c17998 && !c17999.f56106 && set.contains(c17999.f56116)) {
                                            if (!c17996.f56121) {
                                                String str2 = c17997.f56109.f56116;
                                                String str3 = c17996.f56116;
                                                if (str2.equals(am.ax) && set.contains(str3)) {
                                                    Object[] objArr = {"script", "style", "meta", "link", "base"};
                                                    HashSet hashSet = new HashSet(5);
                                                    for (int i8 = 0; i8 < 5; i8++) {
                                                        Object obj2 = objArr[i8];
                                                        C11003.requireNonNull(obj2);
                                                        if (!hashSet.add(obj2)) {
                                                            throw new IllegalArgumentException(C5368.m15337(obj2, "duplicate element: "));
                                                        }
                                                    }
                                                    if (C20195.unmodifiableSet(hashSet).contains(str3)) {
                                                        if (str2.equals("li")) {
                                                        }
                                                    }
                                                } else if ((str2.equals("li") || !str3.equals("li")) && (((!str2.equals("dt") && !str2.equals("dd")) || (!str3.equals("dt") && !str3.equals("dd"))) && ((!str2.equals("option") || (!str3.equals("option") && !str3.equals("optgroup"))) && ((!str2.equals("optgroup") || !str3.equals("optgroup")) && ((!str2.equals("tr") || !str3.equals("tr")) && (((!str2.equals("td") && !str2.equals("th")) || (!str3.equals("td") && !str3.equals("th"))) && ((!str2.equals("thead") && !str2.equals("tbody") && !str2.equals("tfoot")) || (!str3.equals("tbody") && !str3.equals("tfoot"))))))))) {
                                                }
                                            }
                                            iContains = 1;
                                        }
                                        iContains = 0;
                                    } else if (c17996.f56115 == c17997) {
                                        iContains = 0;
                                    } else if (!set.contains(obj)) {
                                        C17990 c179910 = c17996.f56109;
                                        if (c179910 == null || (!c179910.f56118 && c179910.f56116.indexOf(58) < 0)) {
                                            iContains = 0;
                                        } else if (m40586(c17997)) {
                                            iContains = 1;
                                        }
                                    } else if (m40586(c17997)) {
                                        iContains = 1;
                                    }
                                }
                            } else {
                                iContains = 0;
                            }
                        }
                    } else if (c17996.f56109 == null && m40583(c17996)) {
                        iContains = 1;
                    } else {
                        iContains = 0;
                    }
                }
            }
            c17996.f56117 = iContains;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40586(C17990 c17990) {
        int i;
        C17990 c17991 = c17990.f56121 ? c17990.f56115 : c17990;
        String str = c17990.f56116;
        return (str != null && c17990.f56129 && f52965.contains(str) && (!f52964.contains(c17990.f56116) || (c17991 != null && c17991.f56117 == 1))) || ((i = c17990.f56128) == 2 && c17990.f56117 == 1) || (i == 4 && m40583(c17990));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40583(C17990 c17990) {
        int i;
        int i2 = c17990.f56107;
        if (c17990.f56128 != 4) {
            return false;
        }
        CharSequence charSequence = this.f52973;
        return C2732.m8477(charSequence, true, i2, "<!doctype", 9) && (i = c17990.f56114) > i2 + 9 && charSequence.charAt(i - 1) == '>';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40581(int i) {
        ArrayList arrayList = this.f52969;
        int i2 = ((C17990) arrayList.get(i)).f56117;
        return i2 == 1 || (i2 == 2 && i > 0 && ((C17990) arrayList.get(i - 1)).f56111);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40584(C19012 c19012, boolean z) {
        int length = z ? 0 : c19012.length() - 1;
        while (length >= 0 && length < c19012.length()) {
            char cCharAt = c19012.charAt(length);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            if (!AbstractC12406.m30574(cCharAt)) {
                break;
            }
            length += z ? 1 : -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40582(C13130 c13130) {
        for (int i = 0; i < c13130.length(); i++) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            if (!AbstractC12406.m30574(c13130.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
