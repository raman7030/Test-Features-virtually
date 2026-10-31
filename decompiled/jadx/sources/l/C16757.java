package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16757 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C8997 f51450 = new C8997(EnumC9703.BR_TAG, "<br>");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C8997 f51451 = new C8997(EnumC9703.PARAGRAPH_OPEN_TAG, "<p>");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f51449 = Pattern.compile("^<\\w+\\s*/?\\s*>", 2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f51448 = Pattern.compile(" */[*][*]\n *[*] (.*)\n *[*]/");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39433(int i, String str) {
        try {
            AbstractC14545 abstractC14545M40829 = C17463.m40829(str);
            C6880 c6880 = new C6880(i);
            AbstractC4628 abstractC4628ListIterator = abstractC14545M40829.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                C8997 c8997 = (C8997) abstractC4628ListIterator.next();
                int i2 = C11114.f33347[c8997.m23235().ordinal()];
                Pattern pattern = f51449;
                switch (i2) {
                    case 1:
                        c6880.m18639();
                        break;
                    case 2:
                        c6880.m18644();
                        String string = c6880.toString();
                        Matcher matcher = f51448.matcher(string);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if (strGroup.isEmpty()) {
                                return "/** */";
                            }
                            if (strGroup.length() <= 93 - i && (!strGroup.startsWith("@") || strGroup.equals("@hide"))) {
                                return C4860.m14172("/** ", strGroup, " */");
                            }
                        }
                        return string;
                    case 3:
                        c6880.m18641(c8997);
                        break;
                    case 4:
                        c6880.m18634(c8997);
                        break;
                    case 5:
                        c6880.m18629(c8997);
                        break;
                    case 6:
                        c6880.m18643(c8997);
                        break;
                    case 7:
                        c6880.m18638(c8997);
                        break;
                    case 8:
                        c6880.m18637(c8997);
                        break;
                    case 9:
                        c6880.m18635(c8997);
                        break;
                    case 10:
                        c6880.m18652(c8997);
                        break;
                    case 11:
                        if (pattern.matcher(c8997.m23236()).matches()) {
                            c8997 = f51451;
                        }
                        c6880.m18649(c8997);
                        break;
                    case 12:
                    case 13:
                        c6880.m18640(c8997);
                        break;
                    case 14:
                        c6880.m18628(c8997);
                        break;
                    case 15:
                        c6880.m18650(c8997);
                        break;
                    case 16:
                        c6880.m18646(c8997);
                        break;
                    case 17:
                        c6880.m18648(c8997);
                        break;
                    case 18:
                        c6880.m18642(c8997);
                        break;
                    case 19:
                        c6880.m18636(c8997);
                        break;
                    case 20:
                        c6880.m18631(c8997);
                        break;
                    case 21:
                        c6880.m18633(c8997);
                        break;
                    case 22:
                        c6880.m18651(c8997);
                        break;
                    case 23:
                        if (pattern.matcher(c8997.m23236()).matches()) {
                            c8997 = f51450;
                        }
                        c6880.m18645(c8997);
                        break;
                    case 24:
                        c6880.m18630();
                        break;
                    case 25:
                        c6880.m18647();
                        break;
                    case 26:
                        c6880.m18632(c8997);
                        break;
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        throw new AssertionError(c8997.m23235());
                }
            }
            throw new AssertionError();
        } catch (C18169 unused) {
            return str;
        }
    }
}
