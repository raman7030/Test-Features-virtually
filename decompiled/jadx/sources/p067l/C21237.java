package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C21237 extends AbstractC23413 {

    /* JADX INFO: renamed from: ۜ */
    public final String f66764;

    /* JADX INFO: renamed from: ۢ */
    public C3626 f66765;

    /* JADX INFO: renamed from: ܳ */
    public final C23248[] f66766;

    /* JADX INFO: renamed from: ܿ */
    public int f66767;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC16192 f66768;

    /* JADX INFO: renamed from: ᩻ */
    public final C21558 f66769;

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
    public C21237(String str) throws C19895 {
        int i;
        AbstractC16192<C22578> abstractC16192CopyOf;
        AbstractC8146 abstractC8146;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String strM33618;
        int length;
        int iM47969;
        int i2;
        int i3;
        AbstractC8146 abstractC8147;
        C22578 c22578;
        int i4;
        String text;
        String text2;
        AbstractC16192 abstractC16192Mo36886;
        ?? r7;
        String str4 = str;
        str.getClass();
        this.f66764 = str4;
        m48476(AbstractC16192.m36881(C14695.m33622(str)));
        AbstractC8146 abstractC8146M18915of = AbstractC8146.m18915of();
        C14181 c14181 = new C14181();
        c14181.mo18180((Iterable) abstractC8146M18915of);
        c14181.mo8328((Object) EnumC21300.f67019);
        AbstractC8146 abstractC8146Mo32660 = c14181.mo32660();
        C5127 c5127 = new C5127();
        C13565.m30871(c5127).m30876("--enable-preview", "true");
        int i5 = 0;
        c5127.m10906(InterfaceC13035.class, new C13625(c5127, false, StandardCharsets.UTF_8));
        c5127.m10906(InterfaceC15775.class, new C24493());
        C23623 c23623M52439 = C23623.m52439(c5127);
        c23623M52439.m9363(new C16541(URI.create("Source.java"), EnumC18398.SOURCE, str4));
        C7530 c7530 = new C7530(c23623M52439, null);
        C5876 c5876M13194 = C5876.m13194(c5127);
        char[] charArray = str4.concat("\n//EOF").toCharArray();
        C7410 c7410 = new C7410(c5876M13194, charArray, charArray.length);
        C2715 c2715 = new C2715(c5876M13194, c7410);
        C4123 c4123 = new C4123();
        int length2 = str.length();
        int length3 = 0;
        while (true) {
            c2715.m9589();
            C23311 c23311M9588 = c2715.m9588(i5);
            C4848 c4848 = c23311M9588.f73355;
            i = c23311M9588.f73356;
            int i6 = c23311M9588.f73358;
            EnumC21300 enumC21300 = c23311M9588.f73357;
            if (c4848 != null) {
                final HashMap mapM17127 = c7410.m17127();
                C4848 c4849 = c23311M9588.f73355;
                if (c4849 == null) {
                    abstractC16192Mo36886 = AbstractC16192.m36872of();
                } else {
                    InterfaceC19157 interfaceC19157Stream = C7480.stream(c4849);
                    C12826.requireNonNull(mapM17127);
                    abstractC16192Mo36886 = ((AbstractC16192) interfaceC19157Stream.map(new Function() { // from class: l.᩵ۧۖ
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo56417andThen(Function function) {
                            return C22038.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (C3386) mapM17127.get((InterfaceC7217) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C22038.$default$compose(this, function);
                        }
                    }).collect(AbstractC16192.m36885())).mo36886();
                    i5 = 0;
                }
                AbstractC6767 abstractC6767ListIterator = abstractC16192Mo36886.listIterator(i5);
                while (abstractC6767ListIterator.hasNext()) {
                    C3386 c3386 = (C3386) abstractC6767ListIterator.next();
                    if (length3 < c3386.m5911()) {
                        r7 = 0;
                        c4123.m18184(new C10092(null, null, length3, c3386.m5911()));
                    } else {
                        r7 = 0;
                    }
                    c4123.m18184(new C10092(r7, r7, c3386.m5911(), c3386.m5912().length() + c3386.m5911()));
                    length3 = c3386.m5912().length() + c3386.m5911();
                    abstractC6767ListIterator = abstractC6767ListIterator;
                    c7410 = c7410;
                }
            }
            C7410 c7411 = c7410;
            if (abstractC8146Mo32660.contains(enumC21300)) {
                i = length3;
                if (enumC21300 == EnumC21300.f67019) {
                    break;
                }
                length2 = i6;
                break;
            }
            if (length3 < i6) {
                c4123.m18184(new C10092(null, null, length3, i6));
            }
            c4123.m18184(new C10092(enumC21300 == EnumC21300.f67010 ? "\"" + c23311M9588.mo37618() + "\"" : null, enumC21300, i6, i));
            if (c2715.m9588(0).f73357 == EnumC21300.f67019) {
                break;
            }
            i5 = 0;
            str4 = str;
            length3 = i;
            c7410 = c7411;
        }
        if (i < length2) {
            c4123.m18184(new C10092(null, null, i, length2));
        }
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        if (C7480.stream(c7530.m17427()).anyMatch(new C23154(2))) {
            abstractC16192CopyOf = AbstractC16192.m36873of((Object) new C22578(0, "", "", 0, 0, true, null));
        } else {
            ArrayList arrayList = new ArrayList();
            AbstractC6767 abstractC6767ListIterator2 = abstractC16192M8329.listIterator(0);
            int length4 = 0;
            int iM479610 = 0;
            int i7 = 0;
            while (abstractC6767ListIterator2.hasNext()) {
                C10092 c10092 = (C10092) abstractC6767ListIterator2.next();
                if (abstractC8146Mo32660.contains(c10092.m23554())) {
                    break;
                }
                String strSubstring = str4.substring(c10092.m23555(), c10092.m23553());
                String strM23556 = c10092.m23554() == EnumC21300.f67010 ? c10092.m23556() : strSubstring;
                char cCharAt = strM23556.charAt(0);
                ArrayList<String> arrayList2 = new ArrayList();
                if (Character.isWhitespace(cCharAt)) {
                    Iterator itM33622 = C14695.m33622(strSubstring);
                    while (itM33622.hasNext()) {
                        String str5 = (String) itM33622.next();
                        String strM33619 = C14695.m33618(str5);
                        if (strM33619 != null) {
                            abstractC8147 = abstractC8146Mo32660;
                            String strSubstring2 = str5.substring(0, str5.length() - strM33619.length());
                            if (!strSubstring2.isEmpty()) {
                                arrayList2.add(strSubstring2);
                            }
                            arrayList2.add(strM33619);
                        } else {
                            abstractC8147 = abstractC8146Mo32660;
                            if (!str5.isEmpty()) {
                                arrayList2.add(str5);
                            }
                        }
                        abstractC8146Mo32660 = abstractC8147;
                    }
                    abstractC8146 = abstractC8146Mo32660;
                    z = false;
                    str2 = null;
                } else {
                    abstractC8146 = abstractC8146Mo32660;
                    if (strM23556.startsWith("'") || strM23556.startsWith("\"")) {
                        arrayList2.add(strSubstring);
                    } else if (strM23556.startsWith("//") || strM23556.startsWith("/*")) {
                        if (strM23556.startsWith("//") && (strSubstring.endsWith("\n") || strSubstring.endsWith("\r"))) {
                            strM33618 = C14695.m33618(strSubstring);
                            strM23556 = strM23556.substring(0, strM23556.length() - strM33618.length());
                            strSubstring = strSubstring.substring(0, strSubstring.length() - strM33618.length());
                        } else {
                            strM33618 = null;
                        }
                        str2 = strM33618;
                        arrayList2.add(strSubstring);
                        z = true;
                    } else if (Character.isJavaIdentifierStart(cCharAt) || Character.isDigit(cCharAt) || (cCharAt == '.' && strM23556.length() > 1 && Character.isDigit(strM23556.charAt(1)))) {
                        arrayList2.add(strM23556);
                    } else {
                        for (char c : strM23556.toCharArray()) {
                            arrayList2.add(String.valueOf(c));
                        }
                    }
                    z = true;
                    str2 = null;
                    str3 = strM23556;
                    z2 = true;
                    if (arrayList2.size() == 1) {
                        if (z) {
                            i3 = i7;
                            i7++;
                        } else {
                            i3 = -1;
                        }
                        arrayList.add(new C22578(i3, strSubstring, str3, length4, iM479610, z2, c10092.m23554()));
                        length = strSubstring.length() + length4;
                        iM47969 = m47969(iM479610, strSubstring);
                    } else {
                        if (arrayList2.size() == 1 && !str3.equals(strSubstring)) {
                            throw new C19895("Unicode escapes not allowed in whitespace or multi-character operators");
                        }
                        for (String str6 : arrayList2) {
                            if (z) {
                                i2 = i7;
                                i7++;
                            } else {
                                i2 = -1;
                            }
                            arrayList.add(new C22578(i2, str6, str6, length4, iM479610, z2, null));
                            length4 += str6.length();
                            iM479610 = m47969(iM479610, strSubstring);
                        }
                        length = length4;
                        iM47969 = iM479610;
                    }
                    if (str2 != null) {
                        arrayList.add(new C22578(-1, str2, str2, length, iM47969, false, null));
                        length4 = str2.length() + length;
                        iM479610 = 0;
                    } else {
                        length4 = length;
                        iM479610 = iM47969;
                    }
                    str4 = str;
                    abstractC8146Mo32660 = abstractC8146;
                }
                str3 = strM23556;
                z2 = false;
                if (arrayList2.size() == 1) {
                    if (z) {
                        i3 = i7;
                        i7++;
                    } else {
                        i3 = -1;
                    }
                    arrayList.add(new C22578(i3, strSubstring, str3, length4, iM479610, z2, c10092.m23554()));
                    length = strSubstring.length() + length4;
                    iM47969 = m47969(iM479610, strSubstring);
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
                        arrayList.add(new C22578(i2, str6, str6, length4, iM479610, z2, null));
                        length4 += str6.length();
                        iM479610 = m47969(iM479610, strSubstring);
                    }
                    length = length4;
                    iM47969 = iM479610;
                }
                if (str2 != null) {
                    arrayList.add(new C22578(-1, str2, str2, length, iM47969, false, null));
                    length4 = str2.length() + length;
                    iM479610 = 0;
                } else {
                    length4 = length;
                    iM479610 = iM47969;
                }
                str4 = str;
                abstractC8146Mo32660 = abstractC8146;
            }
            arrayList.add(new C22578(i7, "", "", length4, iM479610, true, null));
            abstractC16192CopyOf = AbstractC16192.copyOf((Collection) arrayList);
        }
        this.f66767 = ((C22578) C10810.m24926(abstractC16192CopyOf)).getIndex();
        m48474(abstractC16192CopyOf);
        C8817 c8817M26550 = AbstractC11500.m26550();
        for (C22578 c22579 : abstractC16192CopyOf) {
            c8817M26550.mo20376(Integer.valueOf(c22579.getPosition()), Integer.valueOf(c22579.m50615()));
        }
        c8817M26550.mo20378();
        int i8 = AbstractC16192.f47662;
        C4123 c4124 = new C4123();
        int size = abstractC16192CopyOf.size();
        C4123 c4125 = new C4123();
        int i9 = 0;
        while (i9 < size) {
            while (!((C22578) abstractC16192CopyOf.get(i9)).m50613()) {
                int i10 = i9 + 1;
                C22578 c225710 = (C22578) abstractC16192CopyOf.get(i9);
                c4125.m18184(c225710);
                if (c225710.mo37857() && c225710.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                    while (((C22578) abstractC16192CopyOf.get(i10)).mo37856()) {
                        i10++;
                    }
                }
                i9 = i10;
            }
            int i11 = i9 + 1;
            C22578 c225711 = (C22578) abstractC16192CopyOf.get(i9);
            C4123 c4126 = new C4123();
            while (true) {
                if (i11 < size && !((C22578) abstractC16192CopyOf.get(i11)).m50613()) {
                    if (((C22578) abstractC16192CopyOf.get(i11)).mo37857()) {
                        String text3 = c225711.getText();
                        text3.getClass();
                        switch (text3) {
                            case "(":
                            case ".":
                            case "<":
                                break;
                            default:
                                if (!((C22578) abstractC16192CopyOf.get(i11)).mo37855()) {
                                    c22578 = (C22578) abstractC16192CopyOf.get(i11);
                                    if (!c22578.mo37857()) {
                                    }
                                    i4 = i11 + 1;
                                    C22578 c225712 = (C22578) abstractC16192CopyOf.get(i11);
                                    c4126.m18184(c225712);
                                    text = c225712.getText();
                                    int i12 = C14695.f41914;
                                    if (AbstractC13375.m30516().mo27551(text)) {
                                        i11 = i4;
                                    } else {
                                        i11 = i4;
                                    }
                                    break;
                                } else {
                                    text2 = c225711.getText();
                                    text2.getClass();
                                    if (!text2.equals(C0249l.f1196b)) {
                                        c22578 = (C22578) abstractC16192CopyOf.get(i11);
                                        if (!c22578.mo37857() && c22578.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                                            c4124.m18184(new C23248(c4125.m8329(), c225711, c4126.m8329()));
                                            c4125 = new C4123();
                                            i9 = i11 + 1;
                                            c4125.m18184((C22578) abstractC16192CopyOf.get(i11));
                                            while (((C22578) abstractC16192CopyOf.get(i9)).mo37856()) {
                                                i9++;
                                            }
                                        }
                                        i4 = i11 + 1;
                                        C22578 c225713 = (C22578) abstractC16192CopyOf.get(i11);
                                        c4126.m18184(c225713);
                                        text = c225713.getText();
                                        int i13 = C14695.f41914;
                                        if (AbstractC13375.m30516().mo27551(text)) {
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
                    } else if (!((C22578) abstractC16192CopyOf.get(i11)).mo37855()) {
                        text2 = c225711.getText();
                        text2.getClass();
                        if (!text2.equals(C0249l.f1196b)) {
                            c22578 = (C22578) abstractC16192CopyOf.get(i11);
                            if (!c22578.mo37857()) {
                            }
                            i4 = i11 + 1;
                            C22578 c225714 = (C22578) abstractC16192CopyOf.get(i11);
                            c4126.m18184(c225714);
                            text = c225714.getText();
                            int i14 = C14695.f41914;
                            if (AbstractC13375.m30516().mo27551(text)) {
                                i11 = i4;
                            } else {
                                i11 = i4;
                            }
                        }
                    } else {
                        c22578 = (C22578) abstractC16192CopyOf.get(i11);
                        if (!c22578.mo37857()) {
                        }
                        i4 = i11 + 1;
                        C22578 c225715 = (C22578) abstractC16192CopyOf.get(i11);
                        c4126.m18184(c225715);
                        text = c225715.getText();
                        int i15 = C14695.f41914;
                        if (AbstractC13375.m30516().mo27551(text)) {
                            i11 = i4;
                        } else {
                            i11 = i4;
                        }
                    }
                }
                c4124.m18184(new C23248(c4125.m8329(), c225711, c4126.m8329()));
                c4125 = new C4123();
                i9 = i11;
                break;
            }
        }
        AbstractC16192 abstractC16192M83210 = c4124.m8329();
        this.f66768 = abstractC16192M83210;
        int i16 = C21558.f67994;
        C22899 c22899 = new C22899();
        AbstractC6767 abstractC6767ListIterator3 = abstractC16192M83210.listIterator(0);
        while (abstractC6767ListIterator3.hasNext()) {
            C23248 c23248 = (C23248) abstractC6767ListIterator3.next();
            InterfaceC16706 interfaceC16706M45591 = C20151.m45591(c23248);
            int position = interfaceC16706M45591.getPosition();
            if (!interfaceC16706M45591.getText().isEmpty()) {
                position += interfaceC16706M45591.length() - 1;
            }
            c22899.m51127(C15444.m35178(Integer.valueOf(C20151.m45592(c23248).getPosition()), Integer.valueOf(position)), c23248);
        }
        this.f66769 = c22899.m51126();
        this.f66766 = new C23248[this.f66767 + 1];
        int i17 = 0;
        AbstractC6767 abstractC6767ListIterator4 = this.f66768.listIterator(0);
        while (abstractC6767ListIterator4.hasNext()) {
            C23248 c23249 = (C23248) abstractC6767ListIterator4.next();
            AbstractC6767 abstractC6767ListIterator5 = c23249.mo50895().listIterator(i17);
            while (abstractC6767ListIterator5.hasNext()) {
                InterfaceC16706 interfaceC16706 = (InterfaceC16706) abstractC6767ListIterator5.next();
                if (interfaceC16706.getIndex() >= 0) {
                    this.f66766[interfaceC16706.getIndex()] = c23249;
                }
            }
            this.f66766[c23249.mo50894().getIndex()] = c23249;
            AbstractC6767 abstractC6767ListIterator6 = c23249.mo50896().listIterator(0);
            while (abstractC6767ListIterator6.hasNext()) {
                InterfaceC16706 interfaceC16707 = (InterfaceC16706) abstractC6767ListIterator6.next();
                if (interfaceC16707.getIndex() >= 0) {
                    this.f66766[interfaceC16707.getIndex()] = c23249;
                }
            }
            i17 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m47974() {
        return this.f66764;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47969(int i, String str) {
        Object next;
        Iterator itM33621 = C14695.m33621(str);
        do {
            next = itM33621.next();
        } while (itM33621.hasNext());
        Integer num = (Integer) next;
        if (num.intValue() > 0) {
            return str.length() - num.intValue();
        }
        return str.length() + i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m47975() {
        return this.f66767;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC22743 m47976(int i) {
        return this.f66766[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC16192 m47978() {
        return this.f66768;
    }

    @Override // p067l.AbstractC23413
    /* JADX INFO: renamed from: ۧ */
    public final C21558 mo47972() {
        return this.f66769;
    }

    @Override // p067l.AbstractC23413, p067l.AbstractC21402
    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f66768, "tokens");
        c10888M40057.m25084((Object) super.toString(), "super");
        return c10888M40057.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m47977(int i) {
        C3626 c3626 = this.f66765;
        Object[] objArr = new Object[0];
        if (c3626 == null) {
            throw new C19114(C12229.m28208("Expected compilation unit to be set.", objArr));
        }
        return c3626.f7512.mo22240(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47973(int i) {
        C3626 c3626 = this.f66765;
        Object[] objArr = new Object[0];
        if (c3626 == null) {
            throw new C19114(C12229.m28208("Expected compilation unit to be set.", objArr));
        }
        return c3626.f7512.mo8997(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47971(C3626 c3626) {
        this.f66765 = c3626;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23531 m47970(Collection collection) throws C19895 {
        C15444 c15444M35182;
        C23531 c23531M52316 = C23531.m52316();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C15444 c15444M35186 = ((C15444) it.next()).m35186(AbstractC20614.m46566());
            int iIntValue = ((Integer) c15444M35186.m35192()).intValue();
            String str = this.f66764;
            if (iIntValue > str.length()) {
                throw new C19895(String.format("error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)", c15444M35186.m35190(), Integer.valueOf(((Integer) c15444M35186.m35192()).intValue() - ((Integer) c15444M35186.m35190()).intValue()), c15444M35186.m35192(), Integer.valueOf(str.length())));
            }
            if (c15444M35186.m35187()) {
                c15444M35186 = C15444.m35182((Integer) c15444M35186.m35190(), Integer.valueOf(((Integer) c15444M35186.m35190()).intValue() + 1));
            }
            AbstractC23966 abstractC23966Values = this.f66769.mo38411(c15444M35186).mo13881().values();
            if (abstractC23966Values.isEmpty()) {
                c15444M35182 = AbstractC21402.f67491;
            } else {
                c15444M35182 = C15444.m35182(Integer.valueOf(((C23248) abstractC23966Values.iterator().next()).mo50894().getIndex()), Integer.valueOf(((C23248) C10810.m24926(abstractC23966Values)).mo50894().getIndex() + 1));
            }
            c23531M52316.mo6046(c15444M35182);
        }
        return c23531M52316;
    }
}
