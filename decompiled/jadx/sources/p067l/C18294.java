package p067l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18294 {

    /* JADX INFO: renamed from: ܽ */
    public static final C10919 f54632 = new C10919(EnumC11590.BR_TAG, "<br>");

    /* JADX INFO: renamed from: ᩳ */
    public static final C10919 f54633 = new C10919(EnumC11590.PARAGRAPH_OPEN_TAG, "<p>");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f54631 = Pattern.compile("^<\\w+\\s*/?\\s*>", 2);

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f54630 = Pattern.compile(" */[*][*]\n *[*] (.*)\n *[*]/");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static String m41669(int i, String str) {
        try {
            AbstractC16192 abstractC16192M43087 = C18965.m43087(str);
            C8907 c8907 = new C8907(i);
            AbstractC6767 abstractC6767ListIterator = abstractC16192M43087.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                C10919 c10919 = (C10919) abstractC6767ListIterator.next();
                int i2 = C12931.f36347[c10919.m25179().ordinal()];
                Pattern pattern = f54631;
                switch (i2) {
                    case 1:
                        c8907.m20588();
                        break;
                    case 2:
                        c8907.m20593();
                        String string = c8907.toString();
                        Matcher matcher = f54630.matcher(string);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if (strGroup.isEmpty()) {
                                return "/** */";
                            }
                            if (strGroup.length() <= 93 - i && (!strGroup.startsWith("@") || strGroup.equals("@hide"))) {
                                return C6988.m16053("/** ", strGroup, " */");
                            }
                        }
                        return string;
                    case 3:
                        c8907.m20590(c10919);
                        break;
                    case 4:
                        c8907.m20583(c10919);
                        break;
                    case 5:
                        c8907.m20578(c10919);
                        break;
                    case 6:
                        c8907.m20592(c10919);
                        break;
                    case 7:
                        c8907.m20587(c10919);
                        break;
                    case 8:
                        c8907.m20586(c10919);
                        break;
                    case 9:
                        c8907.m20584(c10919);
                        break;
                    case 10:
                        c8907.m20601(c10919);
                        break;
                    case 11:
                        if (pattern.matcher(c10919.m25180()).matches()) {
                            c10919 = f54633;
                        }
                        c8907.m20598(c10919);
                        break;
                    case 12:
                    case 13:
                        c8907.m20589(c10919);
                        break;
                    case 14:
                        c8907.m20577(c10919);
                        break;
                    case 15:
                        c8907.m20599(c10919);
                        break;
                    case 16:
                        c8907.m20595(c10919);
                        break;
                    case 17:
                        c8907.m20597(c10919);
                        break;
                    case 18:
                        c8907.m20591(c10919);
                        break;
                    case 19:
                        c8907.m20585(c10919);
                        break;
                    case 20:
                        c8907.m20580(c10919);
                        break;
                    case 21:
                        c8907.m20582(c10919);
                        break;
                    case 22:
                        c8907.m20600(c10919);
                        break;
                    case 23:
                        if (pattern.matcher(c10919.m25180()).matches()) {
                            c10919 = f54632;
                        }
                        c8907.m20594(c10919);
                        break;
                    case 24:
                        c8907.m20579();
                        break;
                    case 25:
                        c8907.m20596();
                        break;
                    case 26:
                        c8907.m20581(c10919);
                        break;
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        throw new AssertionError(c10919.m25179());
                }
            }
            throw new AssertionError();
        } catch (C19636 unused) {
            return str;
        }
    }
}
