package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9160 extends AbstractC16891 implements InterfaceC19944 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f27722 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27723 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16415 f27724;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f27725;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17626 f27726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6993 f27727;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f27728;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23926 f27729;

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ */
    public final String mo6007() {
        return "tar";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    static {
        C13654.m32812("tar");
        C9214.m23656("tar", "local", new C14803());
    }

    public C9160(int i, String str, String str2) throws C19401 {
        super(i, "/");
        this.f27724 = new C16415("tar", null);
        this.f27729 = new C23926(this);
        this.f27727 = new C6993(this);
        this.f27728 = new C9866(this);
        C17626 c17626 = new C17626(str, str2);
        this.f27726 = c17626;
        String str3 = (String) f27722.get(str);
        if (str3 != null && !str3.isEmpty()) {
            c17626.m41205(str3);
        }
        this.f27725 = c17626.m41201().getName();
        m39745(str2);
        try {
            mo14824(false);
        } catch (IOException e) {
            C19401 c19401 = new C19401(C4925.m14327(R.string.MT_Protector));
            c19401.initCause((Throwable) e);
            throw c19401;
        }
    }

    public C9160(C12951 c12951) {
        super(c12951);
        this.f27724 = new C16415("tar", null);
        this.f27729 = new C23926(this);
        this.f27727 = new C6993(this);
        this.f27728 = new C9866(this);
        C17626 c17626M41198 = C17626.m41198(c12951);
        this.f27726 = c17626M41198;
        this.f27725 = c17626M41198.m41201().getName();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        this.f27726.mo7643(c10130);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ */
    public final String mo6009() {
        return this.f27725 + super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return this.f27726;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ */
    public final List mo6012() {
        C17626 c17626 = this.f27726;
        if (c17626.m41208() == null) {
            mo14824(false);
        }
        ArrayList arrayListMo7637 = c17626.mo7637(m39741(), true);
        arrayListMo7637.add(0, C15688.f48358);
        return arrayListMo7637;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new C4737(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return C6148.m17063();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ */
    public final C12244 mo6017() {
        return new C12244(this.f27725, this.f27726.m41202(), C19883.f64233);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo6011() {
        return this.f27726.m41204();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo6016() {
        return this.f27726.m41200();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        c16561.m39053(this.f27725);
        c16561.m39033(this.f27726.m41201().m36511(), true);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6014(String str) {
        C1358 entry = this.f27726.getEntry(str.substring(1));
        return (entry == null || entry.m4768()) ? false : true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        m39737(c16560);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440M36526 = C16999.m39866(this.f51870.mo23554(), C4303.m12893(m39741())).m36526(interfaceC17889.getName());
        abstractC15440M36526.mo23545();
        return abstractC15440M36526;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        new C7043(this, c16560, list, runnable).m20274();
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final String m23568() {
        return this.f27726.m41206();
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m23569() {
        return this.f27726.m41202();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺ */
    public final void mo6021() {
        C17626 c17626 = this.f27726;
        if (c17626.m41202().equals(c17626.m41206()) || !c17626.m41206().endsWith("._tar")) {
            return;
        }
        c17626.m41207().mo23552();
        C15528.m36596();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f27729, this.f27727, AbstractC16891.f51865, AbstractC16891.f51860, new C7970(), AbstractC16891.f51857, this.f27728, m39743(), AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final void mo13540(C16415 c16415) {
        this.f27724 = c16415;
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final C16415 mo13539() {
        return this.f27724;
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final void mo13541(C16560 c16560, View view, C16415 c16415, InterfaceC17827 interfaceC17827) {
        new C14298(c16560, this).m34118(c16415.f50492, new RunnableC16251(2, interfaceC17827));
    }
}
