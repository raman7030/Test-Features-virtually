package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17P5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18965 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f56559;

    /* JADX INFO: renamed from: ܿ */
    public boolean f56560;

    /* JADX INFO: renamed from: ۗ */
    public static final Pattern f56532 = Pattern.compile("\r\n?");

    /* JADX INFO: renamed from: ᩶ */
    public static final AbstractC13375 f56550 = AbstractC13375.m30518('\n');

    /* JADX INFO: renamed from: ۙ */
    public static final Pattern f56534 = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");

    /* JADX INFO: renamed from: ܺ */
    public static final Pattern f56547 = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");

    /* JADX INFO: renamed from: ᩸ */
    public static final Pattern f56552 = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩹ */
    public static final Pattern f56553 = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩴ */
    public static final Pattern f56548 = Pattern.compile("^<!--.*?-->", 32);

    /* JADX INFO: renamed from: ۛ */
    public static final Pattern f56536 = m43089("pre");

    /* JADX INFO: renamed from: ۤ */
    public static final Pattern f56541 = m43085("pre");

    /* JADX INFO: renamed from: ۡ */
    public static final Pattern f56539 = m43089("code");

    /* JADX INFO: renamed from: ۢ */
    public static final Pattern f56540 = m43085("code");

    /* JADX INFO: renamed from: ܰ */
    public static final Pattern f56545 = m43089("table");

    /* JADX INFO: renamed from: ᩺ */
    public static final Pattern f56554 = m43085("table");

    /* JADX INFO: renamed from: ۠ */
    public static final Pattern f56538 = m43089("ul|ol|dl");

    /* JADX INFO: renamed from: ֡ */
    public static final Pattern f56529 = m43085("ul|ol|dl");

    /* JADX INFO: renamed from: ֨ */
    public static final Pattern f56530 = m43089("li|dt|dd");

    /* JADX INFO: renamed from: ۚ */
    public static final Pattern f56535 = m43085("li|dt|dd");

    /* JADX INFO: renamed from: ۘ */
    public static final Pattern f56533 = m43089("h[1-6]");

    /* JADX INFO: renamed from: ۖ */
    public static final Pattern f56531 = m43085("h[1-6]");

    /* JADX INFO: renamed from: ۫ */
    public static final Pattern f56543 = m43089(C0655am.f2322ax);

    /* JADX INFO: renamed from: ۬ */
    public static final Pattern f56544 = m43085(C0655am.f2322ax);

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f56537 = m43089("blockquote");

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f56555 = m43085("blockquote");

    /* JADX INFO: renamed from: ᩷ */
    public static final Pattern f56551 = m43089("br");

    /* JADX INFO: renamed from: ۨ */
    public static final Pattern f56542 = Pattern.compile("^[{]@snippet\\b");

    /* JADX INFO: renamed from: ᩵ */
    public static final Pattern f56549 = Pattern.compile("^[{]@\\w*");

    /* JADX INFO: renamed from: ܶ */
    public static final Pattern f56546 = Pattern.compile("^.[^ \t\n@<{}*]*", 32);

    /* JADX INFO: renamed from: ֫ */
    public final C22319 f56556 = new C22319();

    /* JADX INFO: renamed from: ᩳ */
    public final C22319 f56561 = new C22319();

    /* JADX INFO: renamed from: ۧ */
    public final C22319 f56557 = new C22319();

    /* JADX INFO: renamed from: ܳ */
    public final C22319 f56558 = new C22319();

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC16192 m43087(String str) throws C19636 {
        boolean z;
        int iMo27547;
        EnumC11590 enumC11590;
        EnumC11590 enumC11591;
        C6194.m14027(str, "Missing /**: %s", str.startsWith("/**"));
        C6194.m14027(str, "Missing */: %s", str.endsWith("*/") && str.length() > 4);
        String strReplaceAll = f56532.matcher(str.substring(3, str.length() - 2)).replaceAll("\n");
        C4213 c4213 = new C4213();
        strReplaceAll.getClass();
        c4213.f9268 = strReplaceAll;
        C18965 c18965 = new C18965(c4213);
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        c4123.m18184(new C10919(EnumC11590.BEGIN_JAVADOC, "/**"));
        while (!c4213.f9268.isEmpty()) {
            boolean zM43088 = c18965.m43088();
            if (c4213.m8557(f56534)) {
                c18965.f56560 = false;
                enumC11591 = zM43088 ? EnumC11590.FORCED_NEWLINE : EnumC11590.WHITESPACE;
            } else if (c4213.m8556(" ") || c4213.m8556("\t")) {
                enumC11591 = zM43088 ? EnumC11590.LITERAL : EnumC11590.WHITESPACE;
            } else if (c18965.f56560 || !c4213.m8557(f56547)) {
                c18965.f56560 = true;
                boolean zM8557 = c4213.m8557(f56542);
                C22319 c22319 = c18965.f56556;
                if (zM8557) {
                    if (c22319.m50130() == 0) {
                        c22319.m50129();
                        c18965.f56559 = true;
                        enumC11591 = EnumC11590.SNIPPET_BEGIN;
                    } else {
                        c22319.m50129();
                        enumC11591 = EnumC11590.LITERAL;
                    }
                } else if (c4213.m8557(f56549)) {
                    c22319.m50129();
                    enumC11591 = EnumC11590.LITERAL;
                } else if (c4213.m8556("{")) {
                    c22319.m50131();
                    enumC11591 = EnumC11590.LITERAL;
                } else if (!c4213.m8556(C0249l.f1198d)) {
                    boolean zM50133 = c22319.m50133();
                    Pattern pattern = f56546;
                    if (!zM50133) {
                        boolean zM8558 = c4213.m8557(f56536);
                        C22319 c223110 = c18965.f56561;
                        if (zM8558) {
                            c223110.m50129();
                            enumC11591 = zM43088 ? EnumC11590.LITERAL : EnumC11590.PRE_OPEN_TAG;
                        } else if (c4213.m8557(f56541)) {
                            c223110.m50128();
                            enumC11591 = c18965.m43088() ? EnumC11590.LITERAL : EnumC11590.PRE_CLOSE_TAG;
                        } else {
                            boolean zM8559 = c4213.m8557(f56539);
                            C22319 c223111 = c18965.f56557;
                            if (zM8559) {
                                c223111.m50129();
                                enumC11591 = zM43088 ? EnumC11590.LITERAL : EnumC11590.CODE_OPEN_TAG;
                            } else if (c4213.m8557(f56540)) {
                                c223111.m50128();
                                enumC11591 = c18965.m43088() ? EnumC11590.LITERAL : EnumC11590.CODE_CLOSE_TAG;
                            } else {
                                boolean zM85510 = c4213.m8557(f56545);
                                C22319 c223112 = c18965.f56558;
                                if (zM85510) {
                                    c223112.m50129();
                                    enumC11591 = zM43088 ? EnumC11590.LITERAL : EnumC11590.TABLE_OPEN_TAG;
                                } else if (c4213.m8557(f56554)) {
                                    c223112.m50128();
                                    enumC11591 = c18965.m43088() ? EnumC11590.LITERAL : EnumC11590.TABLE_CLOSE_TAG;
                                } else if (zM43088) {
                                    if (!c4213.m8557(pattern)) {
                                        throw new C19114();
                                    }
                                    enumC11591 = EnumC11590.LITERAL;
                                } else if (c4213.m8557(f56543)) {
                                    enumC11591 = EnumC11590.PARAGRAPH_OPEN_TAG;
                                } else if (c4213.m8557(f56544)) {
                                    enumC11591 = EnumC11590.PARAGRAPH_CLOSE_TAG;
                                } else if (c4213.m8557(f56538)) {
                                    enumC11591 = EnumC11590.LIST_OPEN_TAG;
                                } else if (c4213.m8557(f56529)) {
                                    enumC11591 = EnumC11590.LIST_CLOSE_TAG;
                                } else if (c4213.m8557(f56530)) {
                                    enumC11591 = EnumC11590.LIST_ITEM_OPEN_TAG;
                                } else if (c4213.m8557(f56535)) {
                                    enumC11591 = EnumC11590.LIST_ITEM_CLOSE_TAG;
                                } else if (c4213.m8557(f56537)) {
                                    enumC11591 = EnumC11590.BLOCKQUOTE_OPEN_TAG;
                                } else if (c4213.m8557(f56555)) {
                                    enumC11591 = EnumC11590.BLOCKQUOTE_CLOSE_TAG;
                                } else if (c4213.m8557(f56533)) {
                                    enumC11591 = EnumC11590.HEADER_OPEN_TAG;
                                } else if (c4213.m8557(f56531)) {
                                    enumC11591 = EnumC11590.HEADER_CLOSE_TAG;
                                } else if (c4213.m8557(f56551)) {
                                    enumC11591 = EnumC11590.BR_TAG;
                                } else if (c4213.m8557(f56552)) {
                                    enumC11591 = EnumC11590.MOE_BEGIN_STRIP_COMMENT;
                                } else if (c4213.m8557(f56553)) {
                                    enumC11591 = EnumC11590.MOE_END_STRIP_COMMENT;
                                } else if (c4213.m8557(f56548)) {
                                    enumC11591 = EnumC11590.HTML_COMMENT;
                                } else {
                                    if (!c4213.m8557(pattern)) {
                                        throw new AssertionError();
                                    }
                                    enumC11591 = EnumC11590.LITERAL;
                                }
                            }
                        }
                    } else {
                        if (!c4213.m8557(pattern)) {
                            throw new C19114();
                        }
                        enumC11591 = EnumC11590.LITERAL;
                    }
                } else if (c18965.f56559 && c22319.m50130() == 1) {
                    c22319.m50128();
                    c18965.f56559 = false;
                    enumC11591 = EnumC11590.SNIPPET_END;
                } else {
                    c22319.m50128();
                    enumC11591 = EnumC11590.LITERAL;
                }
            } else {
                c18965.m43086();
                c18965.f56560 = true;
                enumC11591 = EnumC11590.FOOTER_JAVADOC_TAG_START;
            }
            String strSubstring = c4213.f9268.substring(0, c4213.f9269);
            c4213.f9268 = c4213.f9268.substring(c4213.f9269);
            c4213.f9269 = 0;
            c4123.m18184(new C10919(enumC11591, strSubstring));
        }
        c18965.m43086();
        c4123.m18184(new C10919(EnumC11590.END_JAVADOC, "*/"));
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        int i2 = AbstractC16192.f47662;
        C4123 c4124 = new C4123();
        StringBuilder sb = new StringBuilder();
        InterfaceC8069 interfaceC8069M15487 = C6786.m15487(abstractC16192M8329.listIterator(0));
        while (interfaceC8069M15487.hasNext()) {
            if (((C10919) interfaceC8069M15487.peek()).m25179() == EnumC11590.LITERAL) {
                sb.append(((C10919) interfaceC8069M15487.peek()).m25180());
                interfaceC8069M15487.next();
            } else if (sb.length() == 0) {
                c4124.m18184((C10919) interfaceC8069M15487.peek());
                interfaceC8069M15487.next();
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    EnumC11590 enumC11590M25179 = ((C10919) interfaceC8069M15487.peek()).m25179();
                    enumC11590 = EnumC11590.WHITESPACE;
                    if (enumC11590M25179 != enumC11590) {
                        break;
                    }
                    sb2.append(((C10919) interfaceC8069M15487.next()).m25180());
                }
                EnumC11590 enumC11590M251710 = ((C10919) interfaceC8069M15487.peek()).m25179();
                EnumC11590 enumC11592 = EnumC11590.LITERAL;
                if (enumC11590M251710 == enumC11592 && ((C10919) interfaceC8069M15487.peek()).m25180().startsWith("@")) {
                    sb.append(" ");
                    sb.append(((C10919) interfaceC8069M15487.peek()).m25180());
                    interfaceC8069M15487.next();
                } else {
                    c4124.m18184(new C10919(enumC11592, sb.toString()));
                    sb.setLength(0);
                    if (sb2.length() > 0) {
                        c4124.m18184(new C10919(enumC11590, sb2.toString()));
                    }
                }
            }
        }
        AbstractC16192 abstractC16192M83210 = c4124.m8329();
        int i3 = AbstractC16192.f47662;
        C4123 c4125 = new C4123();
        InterfaceC8069 interfaceC8069M15488 = C6786.m15487(abstractC16192M83210.listIterator(0));
        while (interfaceC8069M15488.hasNext()) {
            EnumC11590 enumC11590M251711 = ((C10919) interfaceC8069M15488.peek()).m25179();
            EnumC11590 enumC11593 = EnumC11590.LITERAL;
            if (enumC11590M251711 == enumC11593) {
                c4125.m18184((C10919) interfaceC8069M15488.next());
                if (((C10919) interfaceC8069M15488.peek()).m25179() == EnumC11590.WHITESPACE) {
                    if (f56550.mo27548(((C10919) interfaceC8069M15488.peek()).m25180()) > 1) {
                        c4125.m18184((C10919) interfaceC8069M15488.next());
                        if (((C10919) interfaceC8069M15488.peek()).m25179() == enumC11593) {
                            c4125.m18184(new C10919(EnumC11590.PARAGRAPH_OPEN_TAG, "<p>"));
                        }
                    }
                }
            } else {
                c4125.m18184((C10919) interfaceC8069M15488.next());
            }
        }
        AbstractC16192 abstractC16192M83211 = c4125.m8329();
        int i4 = AbstractC16192.f47662;
        C4123 c4126 = new C4123();
        InterfaceC8069 interfaceC8069M15489 = C6786.m15487(abstractC16192M83211.listIterator(0));
        while (interfaceC8069M15489.hasNext()) {
            if (((C10919) interfaceC8069M15489.peek()).m25179() == EnumC11590.LITERAL && ((C10919) interfaceC8069M15489.peek()).m25180().matches("^href=[^>]*>")) {
                c4126.m18184((C10919) interfaceC8069M15489.next());
                if (((C10919) interfaceC8069M15489.peek()).m25179() == EnumC11590.WHITESPACE) {
                    c4126.m18184(new C10919(EnumC11590.OPTIONAL_LINE_BREAK, ((C10919) interfaceC8069M15489.next()).m25180()));
                }
            } else {
                c4126.m18184((C10919) interfaceC8069M15489.next());
            }
        }
        AbstractC16192 abstractC16192M83212 = c4126.m8329();
        int i5 = AbstractC16192.f47662;
        C4123 c4127 = new C4123();
        InterfaceC8069 interfaceC8069M154810 = C6786.m15487(abstractC16192M83212.listIterator(0));
        while (interfaceC8069M154810.hasNext()) {
            if (((C10919) interfaceC8069M154810.peek()).m25179() != EnumC11590.PRE_OPEN_TAG) {
                c4127.m18184((C10919) interfaceC8069M154810.next());
            } else {
                c4127.m18184((C10919) interfaceC8069M154810.next());
                ArrayList arrayList = new ArrayList();
                while (interfaceC8069M154810.hasNext() && ((C10919) interfaceC8069M154810.peek()).m25179() == EnumC11590.FORCED_NEWLINE) {
                    arrayList.add((C10919) interfaceC8069M154810.next());
                }
                EnumC11590 enumC11590M251712 = ((C10919) interfaceC8069M154810.peek()).m25179();
                EnumC11590 enumC11594 = EnumC11590.LITERAL;
                if (enumC11590M251712 == enumC11594 && ((C10919) interfaceC8069M154810.peek()).m25180().matches("[ \t]*[{]@code")) {
                    ArrayDeque<C10919> arrayDeque = new ArrayDeque();
                    c4127.m18184(new C10919(enumC11594, ((C10919) interfaceC8069M154810.next()).m25180().trim()));
                    while (interfaceC8069M154810.hasNext() && ((C10919) interfaceC8069M154810.peek()).m25179() != EnumC11590.PRE_CLOSE_TAG) {
                        arrayDeque.addLast((C10919) interfaceC8069M154810.next());
                    }
                    while (!arrayDeque.isEmpty() && ((C10919) arrayDeque.peekFirst()).m25179() == EnumC11590.FORCED_NEWLINE) {
                        arrayDeque.removeFirst();
                    }
                    while (!arrayDeque.isEmpty() && ((C10919) arrayDeque.peekLast()).m25179() == EnumC11590.FORCED_NEWLINE) {
                        arrayDeque.removeLast();
                    }
                    if (!arrayDeque.isEmpty()) {
                        C10919 c10919 = (C10919) arrayDeque.peekLast();
                        EnumC11590 enumC11590M251713 = c10919.m25179();
                        EnumC11590 enumC11595 = EnumC11590.LITERAL;
                        if (enumC11590M251713 == enumC11595 && c10919.m25180().endsWith(C0249l.f1198d)) {
                            arrayDeque.removeLast();
                            if (c10919.m25181() > 1) {
                                arrayDeque.addLast(new C10919(enumC11595, c10919.m25180().substring(0, c10919.m25180().length() - 1)));
                                arrayDeque.addLast(new C10919(EnumC11590.FORCED_NEWLINE, null));
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        int i6 = -1;
                        for (C10919 c109110 : arrayDeque) {
                            if (c109110.m25179() == EnumC11590.LITERAL && (iMo27547 = AbstractC13375.m30517().mo27547(0, c109110.m25180())) != -1 && (i6 == -1 || iMo27547 < i6)) {
                                i6 = iMo27547;
                            }
                        }
                        c4127.m18184(new C10919(EnumC11590.FORCED_NEWLINE, "\n"));
                        for (C10919 c109111 : arrayDeque) {
                            EnumC11590 enumC11590M251714 = c109111.m25179();
                            EnumC11590 enumC11596 = EnumC11590.LITERAL;
                            if (enumC11590M251714 == enumC11596) {
                                c4127.m18184(new C10919(enumC11596, (i6 <= 0 || c109111.m25181() <= i6) ? c109111.m25180() : c109111.m25180().substring(i6)));
                            } else {
                                c4127.m18184(c109111);
                            }
                        }
                        if (z) {
                            c4127.m18184(new C10919(EnumC11590.LITERAL, C0249l.f1198d));
                        } else {
                            c4127.m18184(new C10919(EnumC11590.FORCED_NEWLINE, "\n"));
                        }
                    }
                } else {
                    c4127.m18183((List) arrayList);
                    c4127.m18184((C10919) interfaceC8069M154810.next());
                }
            }
        }
        return c4127.m8329();
    }

    public C18965(C4213 c4213) {
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m43088() {
        return this.f56561.m50133() || this.f56558.m50133() || this.f56557.m50133() || this.f56559;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43086() throws C19636 {
        if (this.f56556.m50133() || this.f56561.m50133() || this.f56558.m50133() || this.f56557.m50133()) {
            throw new C19636();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static Pattern m43089(String str) {
        return Pattern.compile("^<(?:" + str + ")\\b[^>]*>", 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pattern m43085(String str) {
        return Pattern.compile("^</(?:" + str + ")\\b[^>]*>", 2);
    }
}
