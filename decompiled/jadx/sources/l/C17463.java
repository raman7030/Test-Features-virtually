package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17P5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17463 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53373;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53345 = Pattern.compile("\r\n?");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f53363 = AbstractC11581.m28472('\n');

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53347 = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53360 = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f53365 = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f53366 = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53361 = Pattern.compile("^<!--.*?-->", 32);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53349 = m40831("pre");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53354 = m40827("pre");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53352 = m40831("code");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53353 = m40827("code");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53358 = m40831("table");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f53367 = m40827("table");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f53351 = m40831("ul|ol|dl");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f53342 = m40827("ul|ol|dl");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f53343 = m40831("li|dt|dd");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53348 = m40827("li|dt|dd");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53346 = m40831("h[1-6]");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53344 = m40827("h[1-6]");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f53356 = m40831(am.ax);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f53357 = m40827(am.ax);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53350 = m40831("blockquote");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f53368 = m40827("blockquote");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f53364 = m40831("br");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53355 = Pattern.compile("^[{]@snippet\\b");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f53362 = Pattern.compile("^[{]@\\w*");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53359 = Pattern.compile("^.[^ \t\n@<{}*]*", 32);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20992 f53369 = new C20992();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20992 f53374 = new C20992();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20992 f53370 = new C20992();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20992 f53371 = new C20992();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m40829(String str) throws C18169 {
        boolean z;
        int iMo25528;
        EnumC9703 enumC9703;
        EnumC9703 enumC9704;
        C4025.m12107(str, "Missing /**: %s", str.startsWith("/**"));
        C4025.m12107(str, "Missing */: %s", str.endsWith("*/") && str.length() > 4);
        String strReplaceAll = f53345.matcher(str.substring(3, str.length() - 2)).replaceAll("\n");
        C1941 c1941 = new C1941();
        strReplaceAll.getClass();
        c1941.f6489 = strReplaceAll;
        C17463 c17463 = new C17463(c1941);
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        c1846.m16264(new C8997(EnumC9703.BEGIN_JAVADOC, "/**"));
        while (!c1941.f6489.isEmpty()) {
            boolean zM40830 = c17463.m40830();
            if (c1941.m6400(f53347)) {
                c17463.f53373 = false;
                enumC9704 = zM40830 ? EnumC9703.FORCED_NEWLINE : EnumC9703.WHITESPACE;
            } else if (c1941.m6399(" ") || c1941.m6399("\t")) {
                enumC9704 = zM40830 ? EnumC9703.LITERAL : EnumC9703.WHITESPACE;
            } else if (c17463.f53373 || !c1941.m6400(f53360)) {
                c17463.f53373 = true;
                boolean zM6400 = c1941.m6400(f53355);
                C20992 c20992 = c17463.f53369;
                if (zM6400) {
                    if (c20992.m47800() == 0) {
                        c20992.m47799();
                        c17463.f53372 = true;
                        enumC9704 = EnumC9703.SNIPPET_BEGIN;
                    } else {
                        c20992.m47799();
                        enumC9704 = EnumC9703.LITERAL;
                    }
                } else if (c1941.m6400(f53362)) {
                    c20992.m47799();
                    enumC9704 = EnumC9703.LITERAL;
                } else if (c1941.m6399("{")) {
                    c20992.m47801();
                    enumC9704 = EnumC9703.LITERAL;
                } else if (!c1941.m6399(l.d)) {
                    boolean zM47803 = c20992.m47803();
                    Pattern pattern = f53359;
                    if (!zM47803) {
                        boolean zM6401 = c1941.m6400(f53349);
                        C20992 c20993 = c17463.f53374;
                        if (zM6401) {
                            c20993.m47799();
                            enumC9704 = zM40830 ? EnumC9703.LITERAL : EnumC9703.PRE_OPEN_TAG;
                        } else if (c1941.m6400(f53354)) {
                            c20993.m47798();
                            enumC9704 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.PRE_CLOSE_TAG;
                        } else {
                            boolean zM6402 = c1941.m6400(f53352);
                            C20992 c20994 = c17463.f53370;
                            if (zM6402) {
                                c20994.m47799();
                                enumC9704 = zM40830 ? EnumC9703.LITERAL : EnumC9703.CODE_OPEN_TAG;
                            } else if (c1941.m6400(f53353)) {
                                c20994.m47798();
                                enumC9704 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.CODE_CLOSE_TAG;
                            } else {
                                boolean zM6403 = c1941.m6400(f53358);
                                C20992 c20995 = c17463.f53371;
                                if (zM6403) {
                                    c20995.m47799();
                                    enumC9704 = zM40830 ? EnumC9703.LITERAL : EnumC9703.TABLE_OPEN_TAG;
                                } else if (c1941.m6400(f53367)) {
                                    c20995.m47798();
                                    enumC9704 = c17463.m40830() ? EnumC9703.LITERAL : EnumC9703.TABLE_CLOSE_TAG;
                                } else if (zM40830) {
                                    if (!c1941.m6400(pattern)) {
                                        throw new C17619();
                                    }
                                    enumC9704 = EnumC9703.LITERAL;
                                } else if (c1941.m6400(f53356)) {
                                    enumC9704 = EnumC9703.PARAGRAPH_OPEN_TAG;
                                } else if (c1941.m6400(f53357)) {
                                    enumC9704 = EnumC9703.PARAGRAPH_CLOSE_TAG;
                                } else if (c1941.m6400(f53351)) {
                                    enumC9704 = EnumC9703.LIST_OPEN_TAG;
                                } else if (c1941.m6400(f53342)) {
                                    enumC9704 = EnumC9703.LIST_CLOSE_TAG;
                                } else if (c1941.m6400(f53343)) {
                                    enumC9704 = EnumC9703.LIST_ITEM_OPEN_TAG;
                                } else if (c1941.m6400(f53348)) {
                                    enumC9704 = EnumC9703.LIST_ITEM_CLOSE_TAG;
                                } else if (c1941.m6400(f53350)) {
                                    enumC9704 = EnumC9703.BLOCKQUOTE_OPEN_TAG;
                                } else if (c1941.m6400(f53368)) {
                                    enumC9704 = EnumC9703.BLOCKQUOTE_CLOSE_TAG;
                                } else if (c1941.m6400(f53346)) {
                                    enumC9704 = EnumC9703.HEADER_OPEN_TAG;
                                } else if (c1941.m6400(f53344)) {
                                    enumC9704 = EnumC9703.HEADER_CLOSE_TAG;
                                } else if (c1941.m6400(f53364)) {
                                    enumC9704 = EnumC9703.BR_TAG;
                                } else if (c1941.m6400(f53365)) {
                                    enumC9704 = EnumC9703.MOE_BEGIN_STRIP_COMMENT;
                                } else if (c1941.m6400(f53366)) {
                                    enumC9704 = EnumC9703.MOE_END_STRIP_COMMENT;
                                } else if (c1941.m6400(f53361)) {
                                    enumC9704 = EnumC9703.HTML_COMMENT;
                                } else {
                                    if (!c1941.m6400(pattern)) {
                                        throw new AssertionError();
                                    }
                                    enumC9704 = EnumC9703.LITERAL;
                                }
                            }
                        }
                    } else {
                        if (!c1941.m6400(pattern)) {
                            throw new C17619();
                        }
                        enumC9704 = EnumC9703.LITERAL;
                    }
                } else if (c17463.f53372 && c20992.m47800() == 1) {
                    c20992.m47798();
                    c17463.f53372 = false;
                    enumC9704 = EnumC9703.SNIPPET_END;
                } else {
                    c20992.m47798();
                    enumC9704 = EnumC9703.LITERAL;
                }
            } else {
                c17463.m40828();
                c17463.f53373 = true;
                enumC9704 = EnumC9703.FOOTER_JAVADOC_TAG_START;
            }
            String strSubstring = c1941.f6489.substring(0, c1941.f6490);
            c1941.f6489 = c1941.f6489.substring(c1941.f6490);
            c1941.f6490 = 0;
            c1846.m16264(new C8997(enumC9704, strSubstring));
        }
        c17463.m40828();
        c1846.m16264(new C8997(EnumC9703.END_JAVADOC, "*/"));
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        int i2 = AbstractC14545.f44556;
        C1846 c1847 = new C1846();
        StringBuilder sb = new StringBuilder();
        InterfaceC5998 interfaceC5998M13612 = C4648.m13612(abstractC14545M6131.listIterator(0));
        while (interfaceC5998M13612.hasNext()) {
            if (((C8997) interfaceC5998M13612.peek()).m23235() == EnumC9703.LITERAL) {
                sb.append(((C8997) interfaceC5998M13612.peek()).m23236());
                interfaceC5998M13612.next();
            } else if (sb.length() == 0) {
                c1847.m16264((C8997) interfaceC5998M13612.peek());
                interfaceC5998M13612.next();
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    EnumC9703 enumC9703M23235 = ((C8997) interfaceC5998M13612.peek()).m23235();
                    enumC9703 = EnumC9703.WHITESPACE;
                    if (enumC9703M23235 != enumC9703) {
                        break;
                    }
                    sb2.append(((C8997) interfaceC5998M13612.next()).m23236());
                }
                EnumC9703 enumC9703M23236 = ((C8997) interfaceC5998M13612.peek()).m23235();
                EnumC9703 enumC9705 = EnumC9703.LITERAL;
                if (enumC9703M23236 == enumC9705 && ((C8997) interfaceC5998M13612.peek()).m23236().startsWith("@")) {
                    sb.append(" ");
                    sb.append(((C8997) interfaceC5998M13612.peek()).m23236());
                    interfaceC5998M13612.next();
                } else {
                    c1847.m16264(new C8997(enumC9705, sb.toString()));
                    sb.setLength(0);
                    if (sb2.length() > 0) {
                        c1847.m16264(new C8997(enumC9703, sb2.toString()));
                    }
                }
            }
        }
        AbstractC14545 abstractC14545M6132 = c1847.m6131();
        int i3 = AbstractC14545.f44556;
        C1846 c1848 = new C1846();
        InterfaceC5998 interfaceC5998M13613 = C4648.m13612(abstractC14545M6132.listIterator(0));
        while (interfaceC5998M13613.hasNext()) {
            EnumC9703 enumC9703M23237 = ((C8997) interfaceC5998M13613.peek()).m23235();
            EnumC9703 enumC9706 = EnumC9703.LITERAL;
            if (enumC9703M23237 == enumC9706) {
                c1848.m16264((C8997) interfaceC5998M13613.next());
                if (((C8997) interfaceC5998M13613.peek()).m23235() == EnumC9703.WHITESPACE) {
                    if (f53363.mo25529(((C8997) interfaceC5998M13613.peek()).m23236()) > 1) {
                        c1848.m16264((C8997) interfaceC5998M13613.next());
                        if (((C8997) interfaceC5998M13613.peek()).m23235() == enumC9706) {
                            c1848.m16264(new C8997(EnumC9703.PARAGRAPH_OPEN_TAG, "<p>"));
                        }
                    }
                }
            } else {
                c1848.m16264((C8997) interfaceC5998M13613.next());
            }
        }
        AbstractC14545 abstractC14545M6133 = c1848.m6131();
        int i4 = AbstractC14545.f44556;
        C1846 c1849 = new C1846();
        InterfaceC5998 interfaceC5998M13614 = C4648.m13612(abstractC14545M6133.listIterator(0));
        while (interfaceC5998M13614.hasNext()) {
            if (((C8997) interfaceC5998M13614.peek()).m23235() == EnumC9703.LITERAL && ((C8997) interfaceC5998M13614.peek()).m23236().matches("^href=[^>]*>")) {
                c1849.m16264((C8997) interfaceC5998M13614.next());
                if (((C8997) interfaceC5998M13614.peek()).m23235() == EnumC9703.WHITESPACE) {
                    c1849.m16264(new C8997(EnumC9703.OPTIONAL_LINE_BREAK, ((C8997) interfaceC5998M13614.next()).m23236()));
                }
            } else {
                c1849.m16264((C8997) interfaceC5998M13614.next());
            }
        }
        AbstractC14545 abstractC14545M6134 = c1849.m6131();
        int i5 = AbstractC14545.f44556;
        C1846 c18410 = new C1846();
        InterfaceC5998 interfaceC5998M13615 = C4648.m13612(abstractC14545M6134.listIterator(0));
        while (interfaceC5998M13615.hasNext()) {
            if (((C8997) interfaceC5998M13615.peek()).m23235() != EnumC9703.PRE_OPEN_TAG) {
                c18410.m16264((C8997) interfaceC5998M13615.next());
            } else {
                c18410.m16264((C8997) interfaceC5998M13615.next());
                ArrayList arrayList = new ArrayList();
                while (interfaceC5998M13615.hasNext() && ((C8997) interfaceC5998M13615.peek()).m23235() == EnumC9703.FORCED_NEWLINE) {
                    arrayList.add((C8997) interfaceC5998M13615.next());
                }
                EnumC9703 enumC9703M23238 = ((C8997) interfaceC5998M13615.peek()).m23235();
                EnumC9703 enumC9707 = EnumC9703.LITERAL;
                if (enumC9703M23238 == enumC9707 && ((C8997) interfaceC5998M13615.peek()).m23236().matches("[ \t]*[{]@code")) {
                    ArrayDeque<C8997> arrayDeque = new ArrayDeque();
                    c18410.m16264(new C8997(enumC9707, ((C8997) interfaceC5998M13615.next()).m23236().trim()));
                    while (interfaceC5998M13615.hasNext() && ((C8997) interfaceC5998M13615.peek()).m23235() != EnumC9703.PRE_CLOSE_TAG) {
                        arrayDeque.addLast((C8997) interfaceC5998M13615.next());
                    }
                    while (!arrayDeque.isEmpty() && ((C8997) arrayDeque.peekFirst()).m23235() == EnumC9703.FORCED_NEWLINE) {
                        arrayDeque.removeFirst();
                    }
                    while (!arrayDeque.isEmpty() && ((C8997) arrayDeque.peekLast()).m23235() == EnumC9703.FORCED_NEWLINE) {
                        arrayDeque.removeLast();
                    }
                    if (!arrayDeque.isEmpty()) {
                        C8997 c8997 = (C8997) arrayDeque.peekLast();
                        EnumC9703 enumC9703M23239 = c8997.m23235();
                        EnumC9703 enumC9708 = EnumC9703.LITERAL;
                        if (enumC9703M23239 == enumC9708 && c8997.m23236().endsWith(l.d)) {
                            arrayDeque.removeLast();
                            if (c8997.m23237() > 1) {
                                arrayDeque.addLast(new C8997(enumC9708, c8997.m23236().substring(0, c8997.m23236().length() - 1)));
                                arrayDeque.addLast(new C8997(EnumC9703.FORCED_NEWLINE, null));
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        int i6 = -1;
                        for (C8997 c8998 : arrayDeque) {
                            if (c8998.m23235() == EnumC9703.LITERAL && (iMo25528 = AbstractC11581.m28471().mo25528(0, c8998.m23236())) != -1 && (i6 == -1 || iMo25528 < i6)) {
                                i6 = iMo25528;
                            }
                        }
                        c18410.m16264(new C8997(EnumC9703.FORCED_NEWLINE, "\n"));
                        for (C8997 c8999 : arrayDeque) {
                            EnumC9703 enumC9703M232310 = c8999.m23235();
                            EnumC9703 enumC9709 = EnumC9703.LITERAL;
                            if (enumC9703M232310 == enumC9709) {
                                c18410.m16264(new C8997(enumC9709, (i6 <= 0 || c8999.m23237() <= i6) ? c8999.m23236() : c8999.m23236().substring(i6)));
                            } else {
                                c18410.m16264(c8999);
                            }
                        }
                        if (z) {
                            c18410.m16264(new C8997(EnumC9703.LITERAL, l.d));
                        } else {
                            c18410.m16264(new C8997(EnumC9703.FORCED_NEWLINE, "\n"));
                        }
                    }
                } else {
                    c18410.m16263((List) arrayList);
                    c18410.m16264((C8997) interfaceC5998M13615.next());
                }
            }
        }
        return c18410.m6131();
    }

    public C17463(C1941 c1941) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40830() {
        return this.f53374.m47803() || this.f53371.m47803() || this.f53370.m47803() || this.f53372;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40828() throws C18169 {
        if (this.f53369.m47803() || this.f53374.m47803() || this.f53371.m47803() || this.f53370.m47803()) {
            throw new C18169();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Pattern m40831(String str) {
        return Pattern.compile("^<(?:" + str + ")\\b[^>]*>", 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m40827(String str) {
        return Pattern.compile("^</(?:" + str + ")\\b[^>]*>", 2);
    }
}
