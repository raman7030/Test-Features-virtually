package p067l;

import java.util.Calendar;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܽۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4MZ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17899 extends AbstractC13578 implements InterfaceC3519 {

    /* JADX INFO: renamed from: ֫ */
    public Matcher f53484;

    /* JADX INFO: renamed from: ۧ */
    public Pattern f53485;

    /* JADX INFO: renamed from: ܽ */
    public MatchResult f53486;

    /* JADX INFO: renamed from: ᩳ */
    public final C18570 f53487;

    /* JADX INFO: renamed from: ֫ */
    public abstract C5531 mo13109();

    public AbstractC17899() {
        m40707(32, "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)");
        this.f53487 = new C18570();
    }

    public AbstractC17899(String str) {
        m40707(0, str);
        this.f53487 = new C18570();
    }

    @Override // p067l.InterfaceC3519
    /* JADX INFO: renamed from: ֫ */
    public final void mo6295(C5531 c5531) {
        C18570 c18570 = this.f53487;
        if (c18570 != null) {
            C5531 c5531Mo13109 = mo13109();
            if (c5531 != null) {
                if (c5531.m12216() == null) {
                    c5531.m12217(c5531Mo13109.m12216());
                }
                if (c5531.m12218() == null) {
                    c5531.m12219(c5531Mo13109.m12218());
                }
                c18570.mo6295(c5531);
                return;
            }
            c18570.mo6295(c5531Mo13109);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40707(int i, String str) {
        try {
            this.f53485 = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Calendar m40710(String str) {
        return this.f53487.m42263(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m40708(int i) {
        MatchResult matchResult = this.f53486;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40709(String str) {
        this.f53486 = null;
        Matcher matcher = this.f53485.matcher(str);
        this.f53484 = matcher;
        if (matcher.matches()) {
            this.f53486 = this.f53484.toMatchResult();
        }
        return this.f53486 != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40711(String str) {
        m40707(0, str);
    }
}
