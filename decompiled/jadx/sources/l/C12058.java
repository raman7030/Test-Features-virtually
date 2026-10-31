package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes4.dex */
public class C12058 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C18090 f36066;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C18090 f36067;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public String f36068;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo3145() {
        return false;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("saveAsPath"), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        String strM11556 = m11556("inputPath1");
        String strM11557 = m11556("inputPath2");
        String strM11535 = m11535("zipPath1");
        String strM11536 = m11535("zipPath2");
        AbstractC3163 abstractC3163 = m11543().containsKey("statelessVisitor1") ? (AbstractC3163) C11806.m28856(m11560("statelessVisitor1"), false) : null;
        AbstractC3163 abstractC3164 = m11543().containsKey("statelessVisitor2") ? (AbstractC3163) C11806.m28856(m11560("statelessVisitor2"), false) : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z = strM11535 == null || strM11536 == null;
        boolean z2 = strM11535 == null && strM11536 == null;
        if (strM11535 != null) {
            C18090 c18090 = new C18090(strM11535);
            this.f36066 = c18090;
            C9942.m25066(map, c18090, strM11556, z);
            strM11556 = strM11535.concat(strM11556);
        } else if (abstractC3163 != null) {
            C9942.m25062(map, abstractC3163, strM11556, z2, "", this);
            strM11556 = abstractC3163.m9680() + strM11556;
        } else {
            C9942.m25064(map, C16999.m39866(strM11556, new String[0]), z2, "", this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        if (strM11536 != null) {
            C18090 c18091 = new C18090(strM11536);
            this.f36067 = c18091;
            C9942.m25066(map2, c18091, strM11557, z);
            strM11557 = strM11536.concat(strM11557);
        } else if (abstractC3164 != null) {
            C9942.m25062(map2, abstractC3164, strM11557, z2, "", this);
            strM11557 = abstractC3164.m9680() + strM11557;
        } else {
            C9942.m25064(map2, C16999.m39866(strM11557, new String[0]), z2, "", this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        this.f36068 = C8198.m21696(strM11556, strM11557, map, map2, new C12763(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f36068.isEmpty()) {
                C21374.m48463(R.string.MT_Protector);
                return;
            }
            String str = this.f36068;
            String strM14327 = C4925.m14327(R.string.MT_Protector);
            String strM11556 = m11556("saveAsPath");
            int i = C7017.f21654;
            ActivityC14946.m35399(main, str, strM14327, strM11556, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C0349.m1793(this.f36066);
        C0349.m1793(this.f36067);
        C15528.m36596();
    }
}
