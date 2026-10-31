package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes.dex */
public final class C21778 extends AbstractC8540 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern[][] f69763 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*+\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Pattern f69765;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20660 f69764 = new C20660();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f69767 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17544 f69766 = new C17544();

    public C21778(Pattern pattern) {
        this.f69765 = pattern;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f69764;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (this.f69767) {
            return null;
        }
        if (interfaceC19124.mo44149() && this.f69765 == null) {
            return null;
        }
        return C14721.m35022(interfaceC19124.getIndex());
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        this.f69766.m41024(c16300.m38335());
        Pattern pattern = this.f69765;
        if (pattern == null || !pattern.matcher(c16300.m38335()).find()) {
            return;
        }
        this.f69767 = true;
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ۜ */
    public final void mo7221() {
        this.f69764.m47244(this.f69766.m41023());
        this.f69766 = null;
    }
}
