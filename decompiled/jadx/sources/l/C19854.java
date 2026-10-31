package l;

import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19854 extends AbstractC22143 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f64127;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1323 f64128;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21970[] f64129;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64130;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f64131;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20191 f64132;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0317  */
    /* JADX WARN: Code duplicated, block: B:115:0x0337  */
    /* JADX WARN: Code duplicated, block: B:117:0x0341  */
    /* JADX WARN: Code duplicated, block: B:118:0x0347  */
    /* JADX WARN: Code duplicated, block: B:122:0x036d  */
    /* JADX WARN: Code duplicated, block: B:123:0x038c  */
    /* JADX WARN: Code duplicated, block: B:163:0x048a  */
    /* JADX WARN: Code duplicated, block: B:165:0x048e  */
    /* JADX WARN: Code duplicated, block: B:167:0x049a  */
    /* JADX WARN: Code duplicated, block: B:169:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:180:0x050b A[LOOP:6: B:143:0x0440->B:180:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String, l.᩶ۘ۠] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public C19854(String str) throws C18442 {
        int i;
        AbstractC14545<C21265> abstractC14545CopyOf;
        AbstractC6079 abstractC6079;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String strM31533;
        int length;
        int iM45658;
        int i2;
        int i3;
        AbstractC6079 abstractC60710;
        C21265 c21265;
        int i4;
        String text;
        String text2;
        AbstractC14545 abstractC14545Mo34737;
        ?? r7;
        String str4 = str;
        str.getClass();
        this.f64127 = str4;
        m46160(AbstractC14545.m34732(C12970.m31537(str)));
        AbstractC6079 abstractC6079Of = AbstractC6079.of();
        C12429 c12429 = new C12429();
        c12429.mo16260((Iterable) abstractC6079Of);
        c12429.mo6130((Object) EnumC19920.f64381);
        AbstractC6079 abstractC6079Mo30595 = c12429.mo30595();
        C2903 c2903 = new C2903();
        C11781.m28823(c2903).m28828("--enable-preview", "true");
        int i5 = 0;
        c2903.m8839(InterfaceC11223.class, new C11844(c2903, false, StandardCharsets.UTF_8));
        c2903.m8839(InterfaceC14106.class, new C23279());
        C22364 c22364M50099 = C22364.m50099(c2903);
        c22364M50099.m7284(new C14913(URI.create("Source.java"), EnumC16866.SOURCE, str4));
        C5431 c5431 = new C5431(c22364M50099, null);
        C3691 c3691M11248 = C3691.m11248(c2903);
        char[] charArray = str4.concat("\n//EOF").toCharArray();
        C5305 c5305 = new C5305(c3691M11248, charArray, charArray.length);
        C0365 c0365 = new C0365(c3691M11248, c5305);
        C1846 c1846 = new C1846();
        int length2 = str.length();
        int length3 = 0;
        while (true) {
            c0365.m7521();
            C22036 c22036M7520 = c0365.m7520(i5);
            C2609 c2609 = c22036M7520.f70638;
            i = c22036M7520.f70639;
            int i6 = c22036M7520.f70641;
            EnumC19920 enumC19920 = c22036M7520.f70640;
            if (c2609 != null) {
                final HashMap mapM15223 = c5305.m15223();
                C2609 c26010 = c22036M7520.f70638;
                if (c26010 == null) {
                    abstractC14545Mo34737 = AbstractC14545.of();
                } else {
                    InterfaceC17664 interfaceC17664Stream = C5378.stream(c26010);
                    C11003.requireNonNull(mapM15223);
                    abstractC14545Mo34737 = ((AbstractC14545) interfaceC17664Stream.map(new Function() { // from class: l.᩵ۧۖ
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo22274andThen(Function function) {
                            return C20696.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (C1071) mapM15223.get((InterfaceC5102) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C20696.$default$compose(this, function);
                        }
                    }).collect(AbstractC14545.m34736())).mo34737();
                    i5 = 0;
                }
                AbstractC4628 abstractC4628ListIterator = abstractC14545Mo34737.listIterator(i5);
                while (abstractC4628ListIterator.hasNext()) {
                    C1071 c1071 = (C1071) abstractC4628ListIterator.next();
                    if (length3 < c1071.m3640()) {
                        r7 = 0;
                        c1846.m16264(new C8127(null, null, length3, c1071.m3640()));
                    } else {
                        r7 = 0;
                    }
                    c1846.m16264(new C8127(r7, r7, c1071.m3640(), c1071.m3641().length() + c1071.m3640()));
                    length3 = c1071.m3641().length() + c1071.m3640();
                    abstractC4628ListIterator = abstractC4628ListIterator;
                    c5305 = c5305;
                }
            }
            C5305 c5306 = c5305;
            if (abstractC6079Mo30595.contains(enumC19920)) {
                i = length3;
                if (enumC19920 == EnumC19920.f64381) {
                    break;
                }
                length2 = i6;
                break;
            }
            if (length3 < i6) {
                c1846.m16264(new C8127(null, null, length3, i6));
            }
            c1846.m16264(new C8127(enumC19920 == EnumC19920.f64372 ? "\"" + c22036M7520.mo35462() + "\"" : null, enumC19920, i6, i));
            if (c0365.m7520(0).f70640 == EnumC19920.f64381) {
                break;
            }
            i5 = 0;
            str4 = str;
            length3 = i;
            c5305 = c5306;
        }
        if (i < length2) {
            c1846.m16264(new C8127(null, null, i, length2));
        }
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        if (C5378.stream(c5431.m15516()).anyMatch(new C21870(2))) {
            abstractC14545CopyOf = AbstractC14545.of((Object) new C21265(0, "", "", 0, 0, true, null));
        } else {
            ArrayList arrayList = new ArrayList();
            AbstractC4628 abstractC4628ListIterator2 = abstractC14545M6131.listIterator(0);
            int length4 = 0;
            int iM45659 = 0;
            int i7 = 0;
            while (abstractC4628ListIterator2.hasNext()) {
                C8127 c8127 = (C8127) abstractC4628ListIterator2.next();
                if (abstractC6079Mo30595.contains(c8127.m21586())) {
                    break;
                }
                String strSubstring = str4.substring(c8127.m21587(), c8127.m21585());
                String strM21588 = c8127.m21586() == EnumC19920.f64372 ? c8127.m21588() : strSubstring;
                char cCharAt = strM21588.charAt(0);
                ArrayList<String> arrayList2 = new ArrayList();
                if (Character.isWhitespace(cCharAt)) {
                    Iterator itM31537 = C12970.m31537(strSubstring);
                    while (itM31537.hasNext()) {
                        String str5 = (String) itM31537.next();
                        String strM31534 = C12970.m31533(str5);
                        if (strM31534 != null) {
                            abstractC60710 = abstractC6079Mo30595;
                            String strSubstring2 = str5.substring(0, str5.length() - strM31534.length());
                            if (!strSubstring2.isEmpty()) {
                                arrayList2.add(strSubstring2);
                            }
                            arrayList2.add(strM31534);
                        } else {
                            abstractC60710 = abstractC6079Mo30595;
                            if (!str5.isEmpty()) {
                                arrayList2.add(str5);
                            }
                        }
                        abstractC6079Mo30595 = abstractC60710;
                    }
                    abstractC6079 = abstractC6079Mo30595;
                    z = false;
                    str2 = null;
                } else {
                    abstractC6079 = abstractC6079Mo30595;
                    if (strM21588.startsWith("'") || strM21588.startsWith("\"")) {
                        arrayList2.add(strSubstring);
                    } else if (strM21588.startsWith("//") || strM21588.startsWith("/*")) {
                        if (strM21588.startsWith("//") && (strSubstring.endsWith("\n") || strSubstring.endsWith("\r"))) {
                            strM31533 = C12970.m31533(strSubstring);
                            strM21588 = strM21588.substring(0, strM21588.length() - strM31533.length());
                            strSubstring = strSubstring.substring(0, strSubstring.length() - strM31533.length());
                        } else {
                            strM31533 = null;
                        }
                        str2 = strM31533;
                        arrayList2.add(strSubstring);
                        z = true;
                    } else if (Character.isJavaIdentifierStart(cCharAt) || Character.isDigit(cCharAt) || (cCharAt == '.' && strM21588.length() > 1 && Character.isDigit(strM21588.charAt(1)))) {
                        arrayList2.add(strM21588);
                    } else {
                        for (char c : strM21588.toCharArray()) {
                            arrayList2.add(String.valueOf(c));
                        }
                    }
                    z = true;
                    str2 = null;
                    str3 = strM21588;
                    z2 = true;
                    if (arrayList2.size() == 1) {
                        if (z) {
                            i3 = i7;
                            i7++;
                        } else {
                            i3 = -1;
                        }
                        arrayList.add(new C21265(i3, strSubstring, str3, length4, iM45659, z2, c8127.m21586()));
                        length = strSubstring.length() + length4;
                        iM45658 = m45658(iM45659, strSubstring);
                    } else {
                        if (arrayList2.size() == 1 && !str3.equals(strSubstring)) {
                            throw new C18442("Unicode escapes not allowed in whitespace or multi-character operators");
                        }
                        for (String str6 : arrayList2) {
                            if (z) {
                                i2 = i7;
                                i7++;
                            } else {
                                i2 = -1;
                            }
                            arrayList.add(new C21265(i2, str6, str6, length4, iM45659, z2, null));
                            length4 += str6.length();
                            iM45659 = m45658(iM45659, strSubstring);
                        }
                        length = length4;
                        iM45658 = iM45659;
                    }
                    if (str2 != null) {
                        arrayList.add(new C21265(-1, str2, str2, length, iM45658, false, null));
                        length4 = str2.length() + length;
                        iM45659 = 0;
                    } else {
                        length4 = length;
                        iM45659 = iM45658;
                    }
                    str4 = str;
                    abstractC6079Mo30595 = abstractC6079;
                }
                str3 = strM21588;
                z2 = false;
                if (arrayList2.size() == 1) {
                    if (z) {
                        i3 = i7;
                        i7++;
                    } else {
                        i3 = -1;
                    }
                    arrayList.add(new C21265(i3, strSubstring, str3, length4, iM45659, z2, c8127.m21586()));
                    length = strSubstring.length() + length4;
                    iM45658 = m45658(iM45659, strSubstring);
                } else {
                    if (arrayList2.size() == 1) {
                    }
                    while (r5.hasNext()) {
                        if (z) {
                            i2 = i7;
                            i7++;
                        } else {
                            i2 = -1;
                        }
                        arrayList.add(new C21265(i2, str6, str6, length4, iM45659, z2, null));
                        length4 += str6.length();
                        iM45659 = m45658(iM45659, strSubstring);
                    }
                    length = length4;
                    iM45658 = iM45659;
                }
                if (str2 != null) {
                    arrayList.add(new C21265(-1, str2, str2, length, iM45658, false, null));
                    length4 = str2.length() + length;
                    iM45659 = 0;
                } else {
                    length4 = length;
                    iM45659 = iM45658;
                }
                str4 = str;
                abstractC6079Mo30595 = abstractC6079;
            }
            arrayList.add(new C21265(i7, "", "", length4, iM45659, true, null));
            abstractC14545CopyOf = AbstractC14545.copyOf((Collection) arrayList);
        }
        this.f64130 = ((C21265) C8882.m22955(abstractC14545CopyOf)).getIndex();
        m46158(abstractC14545CopyOf);
        C6785 c6785M24537 = AbstractC9608.m24537();
        for (C21265 c21266 : abstractC14545CopyOf) {
            c6785M24537.mo18428(Integer.valueOf(c21266.getPosition()), Integer.valueOf(c21266.m48284()));
        }
        c6785M24537.mo18430();
        int i8 = AbstractC14545.f44556;
        C1846 c1847 = new C1846();
        int size = abstractC14545CopyOf.size();
        C1846 c1848 = new C1846();
        int i9 = 0;
        while (i9 < size) {
            while (!((C21265) abstractC14545CopyOf.get(i9)).m48282()) {
                int i10 = i9 + 1;
                C21265 c21267 = (C21265) abstractC14545CopyOf.get(i9);
                c1848.m16264(c21267);
                if (c21267.mo35699() && c21267.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                    while (((C21265) abstractC14545CopyOf.get(i10)).mo35698()) {
                        i10++;
                    }
                }
                i9 = i10;
            }
            int i11 = i9 + 1;
            C21265 c21268 = (C21265) abstractC14545CopyOf.get(i9);
            C1846 c1849 = new C1846();
            while (true) {
                if (i11 < size && !((C21265) abstractC14545CopyOf.get(i11)).m48282()) {
                    if (((C21265) abstractC14545CopyOf.get(i11)).mo35699()) {
                        String text3 = c21268.getText();
                        text3.getClass();
                        switch (text3) {
                            case "(":
                            case ".":
                            case "<":
                                break;
                            default:
                                if (!((C21265) abstractC14545CopyOf.get(i11)).mo35697()) {
                                    c21265 = (C21265) abstractC14545CopyOf.get(i11);
                                    if (!c21265.mo35699()) {
                                    }
                                    i4 = i11 + 1;
                                    C21265 c21269 = (C21265) abstractC14545CopyOf.get(i11);
                                    c1849.m16264(c21269);
                                    text = c21269.getText();
                                    int i12 = C12970.f38870;
                                    if (AbstractC11581.m28470().mo25532(text)) {
                                        i11 = i4;
                                    } else {
                                        i11 = i4;
                                    }
                                    break;
                                } else {
                                    text2 = c21268.getText();
                                    text2.getClass();
                                    if (!text2.equals(l.b)) {
                                        c21265 = (C21265) abstractC14545CopyOf.get(i11);
                                        if (!c21265.mo35699() && c21265.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                                            c1847.m16264(new C21970(c1848.m6131(), c21268, c1849.m6131()));
                                            c1848 = new C1846();
                                            i9 = i11 + 1;
                                            c1848.m16264((C21265) abstractC14545CopyOf.get(i11));
                                            while (((C21265) abstractC14545CopyOf.get(i9)).mo35698()) {
                                                i9++;
                                            }
                                        }
                                        i4 = i11 + 1;
                                        C21265 c212610 = (C21265) abstractC14545CopyOf.get(i11);
                                        c1849.m16264(c212610);
                                        text = c212610.getText();
                                        int i13 = C12970.f38870;
                                        if (AbstractC11581.m28470().mo25532(text)) {
                                            i11 = i4;
                                        } else {
                                            i11 = i4;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                        }
                    } else if (!((C21265) abstractC14545CopyOf.get(i11)).mo35697()) {
                        text2 = c21268.getText();
                        text2.getClass();
                        if (!text2.equals(l.b)) {
                            c21265 = (C21265) abstractC14545CopyOf.get(i11);
                            if (!c21265.mo35699()) {
                            }
                            i4 = i11 + 1;
                            C21265 c212611 = (C21265) abstractC14545CopyOf.get(i11);
                            c1849.m16264(c212611);
                            text = c212611.getText();
                            int i14 = C12970.f38870;
                            if (AbstractC11581.m28470().mo25532(text)) {
                                i11 = i4;
                            } else {
                                i11 = i4;
                            }
                        }
                    } else {
                        c21265 = (C21265) abstractC14545CopyOf.get(i11);
                        if (!c21265.mo35699()) {
                        }
                        i4 = i11 + 1;
                        C21265 c212612 = (C21265) abstractC14545CopyOf.get(i11);
                        c1849.m16264(c212612);
                        text = c212612.getText();
                        int i15 = C12970.f38870;
                        if (AbstractC11581.m28470().mo25532(text)) {
                            i11 = i4;
                        } else {
                            i11 = i4;
                        }
                    }
                }
                c1847.m16264(new C21970(c1848.m6131(), c21268, c1849.m6131()));
                c1848 = new C1846();
                i9 = i11;
                break;
            }
        }
        AbstractC14545 abstractC14545M6132 = c1847.m6131();
        this.f64131 = abstractC14545M6132;
        int i16 = C20191.f65346;
        C21602 c21602 = new C21602();
        AbstractC4628 abstractC4628ListIterator3 = abstractC14545M6132.listIterator(0);
        while (abstractC4628ListIterator3.hasNext()) {
            C21970 c21970 = (C21970) abstractC4628ListIterator3.next();
            InterfaceC15086 interfaceC15086M43324 = C18711.m43324(c21970);
            int position = interfaceC15086M43324.getPosition();
            if (!interfaceC15086M43324.getText().isEmpty()) {
                position += interfaceC15086M43324.length() - 1;
            }
            c21602.m48780(C13758.m33063(Integer.valueOf(C18711.m43325(c21970).getPosition()), Integer.valueOf(position)), c21970);
        }
        this.f64132 = c21602.m48779();
        this.f64129 = new C21970[this.f64130 + 1];
        int i17 = 0;
        AbstractC4628 abstractC4628ListIterator4 = this.f64131.listIterator(0);
        while (abstractC4628ListIterator4.hasNext()) {
            C21970 c21971 = (C21970) abstractC4628ListIterator4.next();
            AbstractC4628 abstractC4628ListIterator5 = c21971.mo48558().listIterator(i17);
            while (abstractC4628ListIterator5.hasNext()) {
                InterfaceC15086 interfaceC15086 = (InterfaceC15086) abstractC4628ListIterator5.next();
                if (interfaceC15086.getIndex() >= 0) {
                    this.f64129[interfaceC15086.getIndex()] = c21971;
                }
            }
            this.f64129[c21971.mo48557().getIndex()] = c21971;
            AbstractC4628 abstractC4628ListIterator6 = c21971.mo48559().listIterator(0);
            while (abstractC4628ListIterator6.hasNext()) {
                InterfaceC15086 interfaceC15087 = (InterfaceC15086) abstractC4628ListIterator6.next();
                if (interfaceC15087.getIndex() >= 0) {
                    this.f64129[interfaceC15087.getIndex()] = c21971;
                }
            }
            i17 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m45663() {
        return this.f64127;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45658(int i, String str) {
        Object next;
        Iterator itM31536 = C12970.m31536(str);
        do {
            next = itM31536.next();
        } while (itM31536.hasNext());
        Integer num = (Integer) next;
        if (num.intValue() > 0) {
            return str.length() - num.intValue();
        }
        return str.length() + i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m45664() {
        return this.f64130;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 m45665(int i) {
        return this.f64129[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m45667() {
        return this.f64131;
    }

    @Override // l.AbstractC22143
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20191 mo45661() {
        return this.f64132;
    }

    @Override // l.AbstractC22143, l.AbstractC20027
    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f64131, "tokens");
        c8964M37871.m23110((Object) super.toString(), "super");
        return c8964M37871.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m45666(int i) {
        C1323 c1323 = this.f64128;
        Object[] objArr = new Object[0];
        if (c1323 == null) {
            throw new C17619(C10375.m26179("Expected compilation unit to be set.", objArr));
        }
        return c1323.f4741.mo20264(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45662(int i) {
        C1323 c1323 = this.f64128;
        Object[] objArr = new Object[0];
        if (c1323 == null) {
            throw new C17619(C10375.m26179("Expected compilation unit to be set.", objArr));
        }
        return c1323.f4741.mo6871(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45660(C1323 c1323) {
        this.f64128 = c1323;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22267 m45659(Collection collection) throws C18442 {
        C13758 c13758M33067;
        C22267 c22267M49988 = C22267.m49988();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C13758 c13758M33071 = ((C13758) it.next()).m33071(AbstractC19198.m44271());
            int iIntValue = ((Integer) c13758M33071.m33077()).intValue();
            String str = this.f64127;
            if (iIntValue > str.length()) {
                throw new C18442(String.format("error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)", c13758M33071.m33075(), Integer.valueOf(((Integer) c13758M33071.m33077()).intValue() - ((Integer) c13758M33071.m33075()).intValue()), c13758M33071.m33077(), Integer.valueOf(str.length())));
            }
            if (c13758M33071.m33072()) {
                c13758M33071 = C13758.m33067((Integer) c13758M33071.m33075(), Integer.valueOf(((Integer) c13758M33071.m33075()).intValue() + 1));
            }
            AbstractC22725 abstractC22725Values = this.f64132.mo36250(c13758M33071).mo11961().values();
            if (abstractC22725Values.isEmpty()) {
                c13758M33067 = AbstractC20027.f64849;
            } else {
                c13758M33067 = C13758.m33067(Integer.valueOf(((C21970) abstractC22725Values.iterator().next()).mo48557().getIndex()), Integer.valueOf(((C21970) C8882.m22955(abstractC22725Values)).mo48557().getIndex() + 1));
            }
            c22267M49988.mo3773(c13758M33067);
        }
        return c22267M49988;
    }
}
