package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBIX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16221 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f49946 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f49947;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3606 f49948;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f49945 = {",", ">", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "~", " "};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f49944 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49943 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49942 = Pattern.compile("([+-])?(\\d+)");

    public C16221(String str) {
        C16990.m39823(str);
        String strTrim = str.trim();
        this.f49947 = strTrim;
        this.f49948 = new C3606(strTrim);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC21162 m38169(String str) {
        try {
            return new C16221(str).m38178();
        } catch (IllegalArgumentException e) {
            throw new C2817(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21162 m38178() {
        C3606 c3606 = this.f49948;
        c3606.m11069();
        String[] strArr = f49945;
        boolean zM11065 = c3606.m11065(strArr);
        ArrayList arrayList = this.f49946;
        if (zM11065) {
            arrayList.add(new C15515());
            m38170(c3606.m11063());
        } else {
            m38175();
        }
        while (!c3606.m11066()) {
            boolean zM11069 = c3606.m11069();
            if (c3606.m11065(strArr)) {
                m38170(c3606.m11063());
            } else if (zM11069) {
                m38170(' ');
            } else {
                m38175();
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC21162) arrayList.get(0);
        }
        return new C23067(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38170(char c) {
        AbstractC21162 c23067;
        boolean z;
        AbstractC21162 abstractC21162;
        C23067 c23068;
        AbstractC7545 abstractC7545;
        C3606 c3606 = this.f49948;
        c3606.m11069();
        StringBuilder sbM47000 = C20519.m47000();
        while (!c3606.m11066()) {
            if (c3606.m11068(MotionUtils.EASING_TYPE_FORMAT_START)) {
                sbM47000.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sbM47000.append(c3606.m11059('(', ')'));
                sbM47000.append(MotionUtils.EASING_TYPE_FORMAT_END);
            } else if (c3606.m11068("[")) {
                sbM47000.append("[");
                sbM47000.append(c3606.m11059('[', ']'));
                sbM47000.append("]");
            } else if (!c3606.m11065(f49945)) {
                sbM47000.append(c3606.m11063());
            } else if (sbM47000.length() > 0) {
                break;
            } else {
                c3606.m11063();
            }
        }
        AbstractC21162 abstractC21162M38169 = m38169(C20519.m46998(sbM47000));
        ArrayList arrayList = this.f49946;
        if (arrayList.size() == 1) {
            c23067 = (AbstractC21162) arrayList.get(0);
            if ((c23067 instanceof C13894) && c != ',') {
                C13894 c13894 = (C13894) c23067;
                int i = c13894.f23312;
                abstractC21162 = i > 0 ? (AbstractC21162) c13894.f23311.get(i - 1) : null;
                z = true;
            }
            arrayList.clear();
            if (c != ' ') {
                C1405 c1405 = new C1405();
                c1405.f70032 = abstractC21162;
                c23068 = new C23067(c1405, abstractC21162M38169);
            } else if (c != '>') {
                C19751 c19751 = new C19751();
                c19751.f70032 = abstractC21162;
                c23068 = new C23067(c19751, abstractC21162M38169);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        C0699 c0699 = new C0699();
                        c0699.f70032 = abstractC21162;
                        c23068 = new C23067(c0699, abstractC21162M38169);
                    } else {
                        if (c == ',') {
                            throw new C2817("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC21162 instanceof C13894) {
                            abstractC7545 = (C13894) abstractC21162;
                        } else {
                            C13894 c13895 = new C13894();
                            ArrayList arrayList2 = c13895.f23311;
                            arrayList2.add(abstractC21162);
                            c13895.f23312 = arrayList2.size();
                            abstractC7545 = c13895;
                        }
                        ArrayList arrayList3 = abstractC7545.f23311;
                        arrayList3.add(abstractC21162M38169);
                        abstractC7545.f23312 = arrayList3.size();
                    }
                    if (z) {
                        C13894 c13896 = (C13894) c23067;
                        c13896.f23311.set(c13896.f23312 - 1, abstractC7545);
                    } else {
                        c23067 = abstractC7545;
                    }
                    arrayList.add(c23067);
                }
                C8461 c8461 = new C8461();
                c8461.f70032 = abstractC21162;
                c23068 = new C23067(c8461, abstractC21162M38169);
            }
            abstractC7545 = c23068;
            if (z) {
                C13894 c13897 = (C13894) c23067;
                c13897.f23311.set(c13897.f23312 - 1, abstractC7545);
            } else {
                c23067 = abstractC7545;
            }
            arrayList.add(c23067);
        }
        c23067 = new C23067(arrayList);
        z = false;
        abstractC21162 = c23067;
        arrayList.clear();
        if (c != ' ') {
            C1405 c1406 = new C1405();
            c1406.f70032 = abstractC21162;
            c23068 = new C23067(c1406, abstractC21162M38169);
        } else if (c != '>') {
            C19751 c19752 = new C19751();
            c19752.f70032 = abstractC21162;
            c23068 = new C23067(c19752, abstractC21162M38169);
        } else {
            if (c != '~') {
                if (c != '+') {
                    C0699 c06910 = new C0699();
                    c06910.f70032 = abstractC21162;
                    c23068 = new C23067(c06910, abstractC21162M38169);
                } else {
                    if (c == ',') {
                        throw new C2817("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC21162 instanceof C13894) {
                        abstractC7545 = (C13894) abstractC21162;
                    } else {
                        C13894 c13898 = new C13894();
                        ArrayList arrayList4 = c13898.f23311;
                        arrayList4.add(abstractC21162);
                        c13898.f23312 = arrayList4.size();
                        abstractC7545 = c13898;
                    }
                    ArrayList arrayList5 = abstractC7545.f23311;
                    arrayList5.add(abstractC21162M38169);
                    abstractC7545.f23312 = arrayList5.size();
                }
                if (z) {
                    C13894 c13899 = (C13894) c23067;
                    c13899.f23311.set(c13899.f23312 - 1, abstractC7545);
                } else {
                    c23067 = abstractC7545;
                }
                arrayList.add(c23067);
            }
            C8461 c8462 = new C8461();
            c8462.f70032 = abstractC21162;
            c23068 = new C23067(c8462, abstractC21162M38169);
        }
        abstractC7545 = c23068;
        if (z) {
            C13894 c138910 = (C13894) c23067;
            c138910.f23311.set(c138910.f23312 - 1, abstractC7545);
        } else {
            c23067 = abstractC7545;
        }
        arrayList.add(c23067);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38175() {
        C3606 c3606 = this.f49948;
        boolean zM11064 = c3606.m11064("#");
        ArrayList arrayList = this.f49946;
        if (zM11064) {
            String strM11067 = c3606.m11067();
            C16990.m39823(strM11067);
            arrayList.add(new C1384(strM11067));
            return;
        }
        if (c3606.m11064(".")) {
            String strM11068 = c3606.m11067();
            C16990.m39823(strM11068);
            arrayList.add(new C16200(strM11068.trim()));
            return;
        }
        if (c3606.m11071() || c3606.m11068("*|")) {
            String strM51751 = C23340.m51751(c3606.m11070());
            C16990.m39823(strM51751);
            if (!strM51751.startsWith("*|")) {
                if (strM51751.contains("|")) {
                    strM51751 = strM51751.replace("|", ":");
                }
                arrayList.add(new C23983(strM51751));
                return;
            }
            List listAsList = Arrays.asList(new C23983(strM51751.substring(2)), new C7050(strM51751.replace("*|", ":")));
            C13894 c13894 = new C13894();
            int i = c13894.f23312;
            ArrayList arrayList2 = c13894.f23311;
            if (i > 1) {
                arrayList2.add(new C23067(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            c13894.f23312 = arrayList2.size();
            arrayList.add(c13894);
            return;
        }
        boolean zM11068 = c3606.m11068("[");
        String str = this.f49947;
        if (zM11068) {
            C3606 c3607 = new C3606(c3606.m11059('[', ']'));
            String strM11060 = c3607.m11060(f49944);
            C16990.m39823(strM11060);
            c3607.m11069();
            if (c3607.m11066()) {
                if (strM11060.startsWith("^")) {
                    arrayList.add(new C17612(strM11060.substring(1)));
                    return;
                } else {
                    arrayList.add(new C16906(strM11060));
                    return;
                }
            }
            if (c3607.m11064("=")) {
                arrayList.add(new C14789(strM11060, c3607.m11062(), true));
                return;
            }
            if (c3607.m11064("!=")) {
                arrayList.add(new C9852(strM11060, c3607.m11062(), true));
                return;
            }
            if (c3607.m11064("^=")) {
                arrayList.add(new C9146(strM11060, c3607.m11062(), false));
                return;
            }
            if (c3607.m11064("$=")) {
                arrayList.add(new C7029(strM11060, c3607.m11062(), false));
                return;
            }
            if (c3607.m11064("*=")) {
                arrayList.add(new C23962(strM11060, c3607.m11062(), true));
                return;
            }
            if (!c3607.m11064("~=")) {
                throw new C2817("Could not parse attribute query '%s': unexpected token at '%s'", str, c3607.m11062());
            }
            Pattern patternCompile = Pattern.compile(c3607.m11062());
            C21141 c21141 = new C21141();
            c21141.f68168 = C23340.m51751(strM11060);
            c21141.f68169 = patternCompile;
            arrayList.add(c21141);
            return;
        }
        if (c3606.m11064("*")) {
            arrayList.add(new C11263());
            return;
        }
        if (c3606.m11064(":lt(")) {
            arrayList.add(new C22551(m38173()));
            return;
        }
        if (c3606.m11064(":gt(")) {
            arrayList.add(new C21846(m38173()));
            return;
        }
        if (c3606.m11064(":eq(")) {
            arrayList.add(new C8440(m38173()));
            return;
        }
        if (c3606.m11068(":has(")) {
            c3606.m11061(":has");
            String strM11059 = c3606.m11059('(', ')');
            C16990.m39824(strM11059, ":has(selector) sub-select must not be empty");
            arrayList.add(new C19045(m38169(strM11059)));
            return;
        }
        if (c3606.m11068(":contains(")) {
            m38171(false);
            return;
        }
        if (c3606.m11068(":containsOwn(")) {
            m38171(true);
            return;
        }
        if (c3606.m11068(":containsWholeText(")) {
            m38174(false);
            return;
        }
        if (c3606.m11068(":containsWholeOwnText(")) {
            m38174(true);
            return;
        }
        if (c3606.m11068(":containsData(")) {
            c3606.m11061(":containsData");
            String strM11057 = C3606.m11057(c3606.m11059('(', ')'));
            C16990.m39824(strM11057, ":containsData(text) query must not be empty");
            arrayList.add(new C2796(strM11057));
            return;
        }
        if (c3606.m11068(":matches(")) {
            m38176(false);
            return;
        }
        if (c3606.m11068(":matchesOwn(")) {
            m38176(true);
            return;
        }
        if (c3606.m11068(":matchesWholeText(")) {
            m38177(false);
            return;
        }
        if (c3606.m11068(":matchesWholeOwnText(")) {
            m38177(true);
            return;
        }
        if (c3606.m11068(":not(")) {
            c3606.m11061(":not");
            String strM110510 = c3606.m11059('(', ')');
            C16990.m39824(strM110510, ":not(selector) subselect must not be empty");
            AbstractC21162 abstractC21162M38169 = m38169(strM110510);
            C5639 c5639 = new C5639();
            c5639.f70032 = abstractC21162M38169;
            arrayList.add(c5639);
            return;
        }
        if (c3606.m11064(":nth-child(")) {
            m38172(false, false);
            return;
        }
        if (c3606.m11064(":nth-last-child(")) {
            m38172(true, false);
            return;
        }
        if (c3606.m11064(":nth-of-type(")) {
            m38172(false, true);
            return;
        }
        if (c3606.m11064(":nth-last-of-type(")) {
            m38172(true, true);
            return;
        }
        if (c3606.m11064(":first-child")) {
            arrayList.add(new C4912());
            return;
        }
        if (c3606.m11064(":last-child")) {
            arrayList.add(new C13378());
            return;
        }
        if (c3606.m11064(":first-of-type")) {
            arrayList.add(new C3501(0, 1));
            return;
        }
        if (c3606.m11064(":last-of-type")) {
            arrayList.add(new C12673(0, 1));
            return;
        }
        if (c3606.m11064(":only-child")) {
            arrayList.add(new C14083());
            return;
        }
        if (c3606.m11064(":only-of-type")) {
            arrayList.add(new C7734());
            return;
        }
        if (c3606.m11064(":empty")) {
            arrayList.add(new C20435());
        } else if (c3606.m11064(":root")) {
            arrayList.add(new C2111());
        } else {
            if (!c3606.m11064(":matchText")) {
                throw new C2817("Could not parse query '%s': unexpected token at '%s'", str, c3606.m11062());
            }
            arrayList.add(new C11284());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38172(boolean z, boolean z2) {
        String strM51751 = C23340.m51751(this.f49948.m11058());
        Matcher matcher = f49943.matcher(strM51751);
        Matcher matcher2 = f49942.matcher(strM51751);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strM51751)) {
            if ("even".equals(strM51751)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i3;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new C2817("Could not parse nth-index '%s': unexpected format", strM51751);
            }
        }
        ArrayList arrayList = this.f49946;
        if (z2) {
            if (z) {
                arrayList.add(new C11968(i, i2));
                return;
            } else {
                arrayList.add(new C23256(i, i2));
                return;
            }
        }
        if (z) {
            arrayList.add(new C6323(i, i2));
        } else {
            arrayList.add(new C10557(i, i2));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m38173() {
        String strTrim = this.f49948.m11058().trim();
        int i = C20519.f66111;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strTrim.codePointAt(i2))) {
                }
            }
            z = true;
        }
        if (!z) {
            throw new C14167("Index must be numeric");
        }
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38171(boolean z) {
        Object c19024;
        String str = z ? ":containsOwn" : ":contains";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String strM11057 = C3606.m11057(c3606.m11059('(', ')'));
        C16990.m39824(strM11057, str.concat("(text) query must not be empty"));
        if (z) {
            c19024 = new C4207(strM11057);
        } else {
            c19024 = new C19024(strM11057);
        }
        this.f49946.add(c19024);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38174(boolean z) {
        Object c0678;
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String strM11057 = C3606.m11057(c3606.m11059('(', ')'));
        C16990.m39824(strM11057, str.concat("(text) query must not be empty"));
        if (z) {
            c0678 = new C19730(strM11057);
        } else {
            c0678 = new C0678(strM11057);
        }
        this.f49946.add(c0678);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38176(boolean z) {
        Object c16927;
        String str = z ? ":matchesOwn" : ":matches";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String strM11059 = c3606.m11059('(', ')');
        C16990.m39824(strM11059, str.concat("(regex) query must not be empty"));
        if (z) {
            c16927 = new C18339(Pattern.compile(strM11059));
        } else {
            c16927 = new C16927(Pattern.compile(strM11059));
        }
        this.f49946.add(c16927);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m38177(boolean z) {
        Object c14810;
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        C3606 c3606 = this.f49948;
        c3606.m11061(str);
        String strM11059 = c3606.m11059('(', ')');
        C16990.m39824(strM11059, str.concat("(regex) query must not be empty"));
        if (z) {
            c14810 = new C17633(Pattern.compile(strM11059));
        } else {
            c14810 = new C14810(Pattern.compile(strM11059));
        }
        this.f49946.add(c14810);
    }

    public final String toString() {
        return this.f49947;
    }
}
