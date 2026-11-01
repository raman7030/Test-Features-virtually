package p067l;

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
public final class C17785 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f53116 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final String f53117;

    /* JADX INFO: renamed from: ܽ */
    public final C5795 f53118;

    /* JADX INFO: renamed from: ᩻ */
    public static final String[] f53115 = {",", ">", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "~", " "};

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f53114 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f53113 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f53112 = Pattern.compile("([+-])?(\\d+)");

    public C17785(String str) {
        C18515.m42066(str);
        String strTrim = str.trim();
        this.f53117 = strTrim;
        this.f53118 = new C5795(strTrim);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC22481 m40381(String str) {
        try {
            return new C17785(str).m40390();
        } catch (IllegalArgumentException e) {
            throw new C5046(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22481 m40390() {
        C5795 c5795 = this.f53118;
        c5795.m13045();
        String[] strArr = f53115;
        boolean zM13041 = c5795.m13041(strArr);
        ArrayList arrayList = this.f53116;
        if (zM13041) {
            arrayList.add(new C17114());
            m40382(c5795.m13039());
        } else {
            m40387();
        }
        while (!c5795.m13042()) {
            boolean zM13045 = c5795.m13045();
            if (c5795.m13041(strArr)) {
                m40382(c5795.m13039());
            } else if (zM13045) {
                m40382(' ');
            } else {
                m40387();
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC22481) arrayList.get(0);
        }
        return new C24291(arrayList);
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
    /* JADX INFO: renamed from: ֫ */
    private void m40382(char c) {
        AbstractC22481 c24291;
        boolean z;
        AbstractC22481 abstractC22481;
        C24291 c24292;
        AbstractC9539 abstractC9539;
        C5795 c5795 = this.f53118;
        c5795.m13045();
        StringBuilder sbM49323 = C21869.m49323();
        while (!c5795.m13042()) {
            if (c5795.m13044(MotionUtils.EASING_TYPE_FORMAT_START)) {
                sbM49323.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sbM49323.append(c5795.m13035('(', ')'));
                sbM49323.append(MotionUtils.EASING_TYPE_FORMAT_END);
            } else if (c5795.m13044("[")) {
                sbM49323.append("[");
                sbM49323.append(c5795.m13035('[', ']'));
                sbM49323.append("]");
            } else if (!c5795.m13041(f53115)) {
                sbM49323.append(c5795.m13039());
            } else if (sbM49323.length() > 0) {
                break;
            } else {
                c5795.m13039();
            }
        }
        AbstractC22481 abstractC22481M40381 = m40381(C21869.m49321(sbM49323));
        ArrayList arrayList = this.f53116;
        if (arrayList.size() == 1) {
            c24291 = (AbstractC22481) arrayList.get(0);
            if ((c24291 instanceof C15573) && c != ',') {
                C15573 c15573 = (C15573) c24291;
                int i = c15573.f26225;
                abstractC22481 = i > 0 ? (AbstractC22481) c15573.f26224.get(i - 1) : null;
                z = true;
            }
            arrayList.clear();
            if (c != ' ') {
                C3704 c3704 = new C3704();
                c3704.f72742 = abstractC22481;
                c24292 = new C24291(c3704, abstractC22481M40381);
            } else if (c != '>') {
                C21140 c21140 = new C21140();
                c21140.f72742 = abstractC22481;
                c24292 = new C24291(c21140, abstractC22481M40381);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        C3033 c3033 = new C3033();
                        c3033.f72742 = abstractC22481;
                        c24292 = new C24291(c3033, abstractC22481M40381);
                    } else {
                        if (c == ',') {
                            throw new C5046("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC22481 instanceof C15573) {
                            abstractC9539 = (C15573) abstractC22481;
                        } else {
                            C15573 c15574 = new C15573();
                            ArrayList arrayList2 = c15574.f26224;
                            arrayList2.add(abstractC22481);
                            c15574.f26225 = arrayList2.size();
                            abstractC9539 = c15574;
                        }
                        ArrayList arrayList3 = abstractC9539.f26224;
                        arrayList3.add(abstractC22481M40381);
                        abstractC9539.f26225 = arrayList3.size();
                    }
                    if (z) {
                        C15573 c15575 = (C15573) c24291;
                        c15575.f26224.set(c15575.f26225 - 1, abstractC9539);
                    } else {
                        c24291 = abstractC9539;
                    }
                    arrayList.add(c24291);
                }
                C10410 c10410 = new C10410();
                c10410.f72742 = abstractC22481;
                c24292 = new C24291(c10410, abstractC22481M40381);
            }
            abstractC9539 = c24292;
            if (z) {
                C15573 c15576 = (C15573) c24291;
                c15576.f26224.set(c15576.f26225 - 1, abstractC9539);
            } else {
                c24291 = abstractC9539;
            }
            arrayList.add(c24291);
        }
        c24291 = new C24291(arrayList);
        z = false;
        abstractC22481 = c24291;
        arrayList.clear();
        if (c != ' ') {
            C3704 c3705 = new C3704();
            c3705.f72742 = abstractC22481;
            c24292 = new C24291(c3705, abstractC22481M40381);
        } else if (c != '>') {
            C21140 c21141 = new C21140();
            c21141.f72742 = abstractC22481;
            c24292 = new C24291(c21141, abstractC22481M40381);
        } else {
            if (c != '~') {
                if (c != '+') {
                    C3033 c3034 = new C3033();
                    c3034.f72742 = abstractC22481;
                    c24292 = new C24291(c3034, abstractC22481M40381);
                } else {
                    if (c == ',') {
                        throw new C5046("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC22481 instanceof C15573) {
                        abstractC9539 = (C15573) abstractC22481;
                    } else {
                        C15573 c15577 = new C15573();
                        ArrayList arrayList4 = c15577.f26224;
                        arrayList4.add(abstractC22481);
                        c15577.f26225 = arrayList4.size();
                        abstractC9539 = c15577;
                    }
                    ArrayList arrayList5 = abstractC9539.f26224;
                    arrayList5.add(abstractC22481M40381);
                    abstractC9539.f26225 = arrayList5.size();
                }
                if (z) {
                    C15573 c15578 = (C15573) c24291;
                    c15578.f26224.set(c15578.f26225 - 1, abstractC9539);
                } else {
                    c24291 = abstractC9539;
                }
                arrayList.add(c24291);
            }
            C10410 c10411 = new C10410();
            c10411.f72742 = abstractC22481;
            c24292 = new C24291(c10411, abstractC22481M40381);
        }
        abstractC9539 = c24292;
        if (z) {
            C15573 c15579 = (C15573) c24291;
            c15579.f26224.set(c15579.f26225 - 1, abstractC9539);
        } else {
            c24291 = abstractC9539;
        }
        arrayList.add(c24291);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40387() {
        C5795 c5795 = this.f53118;
        boolean zM13040 = c5795.m13040("#");
        ArrayList arrayList = this.f53116;
        if (zM13040) {
            String strM13043 = c5795.m13043();
            C18515.m42066(strM13043);
            arrayList.add(new C3684(strM13043));
            return;
        }
        if (c5795.m13040(".")) {
            String strM13044 = c5795.m13043();
            C18515.m42066(strM13044);
            arrayList.add(new C17765(strM13044.trim()));
            return;
        }
        if (c5795.m13047() || c5795.m13044("*|")) {
            String strM54148 = C24550.m54148(c5795.m13046());
            C18515.m42066(strM54148);
            if (!strM54148.startsWith("*|")) {
                if (strM54148.contains("|")) {
                    strM54148 = strM54148.replace("|", ":");
                }
                arrayList.add(new C25162(strM54148));
                return;
            }
            List listAsList = Arrays.asList(new C25162(strM54148.substring(2)), new C9069(strM54148.replace("*|", ":")));
            C15573 c15573 = new C15573();
            int i = c15573.f26225;
            ArrayList arrayList2 = c15573.f26224;
            if (i > 1) {
                arrayList2.add(new C24291(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            c15573.f26225 = arrayList2.size();
            arrayList.add(c15573);
            return;
        }
        boolean zM13044 = c5795.m13044("[");
        String str = this.f53117;
        if (zM13044) {
            C5795 c5796 = new C5795(c5795.m13035('[', ']'));
            String strM13036 = c5796.m13036(f53114);
            C18515.m42066(strM13036);
            c5796.m13045();
            if (c5796.m13042()) {
                if (strM13036.startsWith("^")) {
                    arrayList.add(new C19107(strM13036.substring(1)));
                    return;
                } else {
                    arrayList.add(new C18436(strM13036));
                    return;
                }
            }
            if (c5796.m13040("=")) {
                arrayList.add(new C16424(strM13036, c5796.m13038(), true));
                return;
            }
            if (c5796.m13040("!=")) {
                arrayList.add(new C11732(strM13036, c5796.m13038(), true));
                return;
            }
            if (c5796.m13040("^=")) {
                arrayList.add(new C11061(strM13036, c5796.m13038(), false));
                return;
            }
            if (c5796.m13040("$=")) {
                arrayList.add(new C9049(strM13036, c5796.m13038(), false));
                return;
            }
            if (c5796.m13040("*=")) {
                arrayList.add(new C25142(strM13036, c5796.m13038(), true));
                return;
            }
            if (!c5796.m13040("~=")) {
                throw new C5046("Could not parse attribute query '%s': unexpected token at '%s'", str, c5796.m13038());
            }
            Pattern patternCompile = Pattern.compile(c5796.m13038());
            C22461 c22461 = new C22461();
            c22461.f70850 = C24550.m54148(strM13036);
            c22461.f70851 = patternCompile;
            arrayList.add(c22461);
            return;
        }
        if (c5795.m13040("*")) {
            arrayList.add(new C13073());
            return;
        }
        if (c5795.m13040(":lt(")) {
            arrayList.add(new C23801(m40385()));
            return;
        }
        if (c5795.m13040(":gt(")) {
            arrayList.add(new C23131(m40385()));
            return;
        }
        if (c5795.m13040(":eq(")) {
            arrayList.add(new C10390(m40385()));
            return;
        }
        if (c5795.m13044(":has(")) {
            c5795.m13037(":has");
            String strM13035 = c5795.m13035('(', ')');
            C18515.m42067(strM13035, ":has(selector) sub-select must not be empty");
            arrayList.add(new C20469(m40381(strM13035)));
            return;
        }
        if (c5795.m13044(":contains(")) {
            m40383(false);
            return;
        }
        if (c5795.m13044(":containsOwn(")) {
            m40383(true);
            return;
        }
        if (c5795.m13044(":containsWholeText(")) {
            m40386(false);
            return;
        }
        if (c5795.m13044(":containsWholeOwnText(")) {
            m40386(true);
            return;
        }
        if (c5795.m13044(":containsData(")) {
            c5795.m13037(":containsData");
            String strM13033 = C5795.m13033(c5795.m13035('(', ')'));
            C18515.m42067(strM13033, ":containsData(text) query must not be empty");
            arrayList.add(new C5026(strM13033));
            return;
        }
        if (c5795.m13044(":matches(")) {
            m40388(false);
            return;
        }
        if (c5795.m13044(":matchesOwn(")) {
            m40388(true);
            return;
        }
        if (c5795.m13044(":matchesWholeText(")) {
            m40389(false);
            return;
        }
        if (c5795.m13044(":matchesWholeOwnText(")) {
            m40389(true);
            return;
        }
        if (c5795.m13044(":not(")) {
            c5795.m13037(":not");
            String strM13037 = c5795.m13035('(', ')');
            C18515.m42067(strM13037, ":not(selector) subselect must not be empty");
            AbstractC22481 abstractC22481M40381 = m40381(strM13037);
            C7728 c7728 = new C7728();
            c7728.f72742 = abstractC22481M40381;
            arrayList.add(c7728);
            return;
        }
        if (c5795.m13040(":nth-child(")) {
            m40384(false, false);
            return;
        }
        if (c5795.m13040(":nth-last-child(")) {
            m40384(true, false);
            return;
        }
        if (c5795.m13040(":nth-of-type(")) {
            m40384(false, true);
            return;
        }
        if (c5795.m13040(":nth-last-of-type(")) {
            m40384(true, true);
            return;
        }
        if (c5795.m13040(":first-child")) {
            arrayList.add(new C7037());
            return;
        }
        if (c5795.m13040(":last-child")) {
            arrayList.add(new C15083());
            return;
        }
        if (c5795.m13040(":first-of-type")) {
            arrayList.add(new C5696(0, 1));
            return;
        }
        if (c5795.m13040(":last-of-type")) {
            arrayList.add(new C14413(0, 1));
            return;
        }
        if (c5795.m13040(":only-child")) {
            arrayList.add(new C15753());
            return;
        }
        if (c5795.m13040(":only-of-type")) {
            arrayList.add(new C9719());
            return;
        }
        if (c5795.m13040(":empty")) {
            arrayList.add(new C21790());
        } else if (c5795.m13040(":root")) {
            arrayList.add(new C4375());
        } else {
            if (!c5795.m13040(":matchText")) {
                throw new C5046("Could not parse query '%s': unexpected token at '%s'", str, c5795.m13038());
            }
            arrayList.add(new C13093());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40384(boolean z, boolean z2) {
        String strM54148 = C24550.m54148(this.f53118.m13034());
        Matcher matcher = f53113.matcher(strM54148);
        Matcher matcher2 = f53112.matcher(strM54148);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strM54148)) {
            if ("even".equals(strM54148)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i3;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new C5046("Could not parse nth-index '%s': unexpected format", strM54148);
            }
        }
        ArrayList arrayList = this.f53116;
        if (z2) {
            if (z) {
                arrayList.add(new C13743(i, i2));
                return;
            } else {
                arrayList.add(new C24471(i, i2));
                return;
            }
        }
        if (z) {
            arrayList.add(new C8378(i, i2));
        } else {
            arrayList.add(new C12402(i, i2));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m40385() {
        String strTrim = this.f53118.m13034().trim();
        int i = C21869.f68789;
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
            throw new C15832("Index must be numeric");
        }
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40383(boolean z) {
        Object c20449;
        String str = z ? ":containsOwn" : ":contains";
        C5795 c5795 = this.f53118;
        c5795.m13037(str);
        String strM13033 = C5795.m13033(c5795.m13035('(', ')'));
        C18515.m42067(strM13033, str.concat("(text) query must not be empty"));
        if (z) {
            c20449 = new C6367(strM13033);
        } else {
            c20449 = new C20449(strM13033);
        }
        this.f53116.add(c20449);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m40386(boolean z) {
        Object c3013;
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        C5795 c5795 = this.f53118;
        c5795.m13037(str);
        String strM13033 = C5795.m13033(c5795.m13035('(', ')'));
        C18515.m42067(strM13033, str.concat("(text) query must not be empty"));
        if (z) {
            c3013 = new C21120(strM13033);
        } else {
            c3013 = new C3013(strM13033);
        }
        this.f53116.add(c3013);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40388(boolean z) {
        Object c18456;
        String str = z ? ":matchesOwn" : ":matches";
        C5795 c5795 = this.f53118;
        c5795.m13037(str);
        String strM13035 = c5795.m13035('(', ')');
        C18515.m42067(strM13035, str.concat("(regex) query must not be empty"));
        if (z) {
            c18456 = new C19798(Pattern.compile(strM13035));
        } else {
            c18456 = new C18456(Pattern.compile(strM13035));
        }
        this.f53116.add(c18456);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m40389(boolean z) {
        Object c16444;
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        C5795 c5795 = this.f53118;
        c5795.m13037(str);
        String strM13035 = c5795.m13035('(', ')');
        C18515.m42067(strM13035, str.concat("(regex) query must not be empty"));
        if (z) {
            c16444 = new C19127(Pattern.compile(strM13035));
        } else {
            c16444 = new C16444(Pattern.compile(strM13035));
        }
        this.f53116.add(c16444);
    }

    public final String toString() {
        return this.f53117;
    }
}
