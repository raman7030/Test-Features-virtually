package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes.dex */
public final class C23066 extends AbstractC10484 {

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern[][] f72471 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*+\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: ۧ */
    public final Pattern f72473;

    /* JADX INFO: renamed from: ֫ */
    public final C22003 f72472 = new C22003();

    /* JADX INFO: renamed from: ᩳ */
    public boolean f72475 = false;

    /* JADX INFO: renamed from: ܽ */
    public C19042 f72474 = new C19042();

    public C23066(Pattern pattern) {
        this.f72473 = pattern;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f72472;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (this.f72475) {
            return null;
        }
        if (interfaceC20543.mo46443() && this.f72473 == null) {
            return null;
        }
        return C16359.m37169(interfaceC20543.getIndex());
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        this.f72474.m43269(c17859.m40550());
        Pattern pattern = this.f72473;
        if (pattern == null || !pattern.matcher(c17859.m40550()).find()) {
            return;
        }
        this.f72475 = true;
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ۜ */
    public final void mo9300() {
        this.f72472.m49571(this.f72474.m43268());
        this.f72474 = null;
    }
}
