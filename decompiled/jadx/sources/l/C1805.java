package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1805 extends AbstractC16891 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f6222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11518 f6223;

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String mo6007() {
        return "compress";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6014(String str) {
        return true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo6015() {
        return true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo6021() {
    }

    static {
        C13654.m32812("compress");
        C9214.m23656("compress", "local", new C22806());
    }

    public C1805(int i, String str) throws C19401 {
        super(i, "/");
        C11518 c11518 = new C11518(str);
        this.f6223 = c11518;
        this.f6222 = c11518.m28350().getName();
        m39745(str);
        try {
            mo14824(false);
        } catch (IOException e) {
            C19401 c19401 = new C19401(C4925.m14327(R.string.MT_Protector));
            c19401.initCause((Throwable) e);
            throw c19401;
        }
    }

    public C1805(C12951 c12951) {
        super(c12951);
        C11518 c11518 = new C11518(c12951.m31506());
        this.f6223 = c11518;
        this.f6222 = c11518.m28350().getName();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        this.f6223.mo7643(c10130);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6009() {
        return this.f6222 + super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 mo6020() {
        return this.f6223;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List mo6012() {
        C11518 c11518 = this.f6223;
        if (c11518.m28349() == null) {
            mo14824(false);
        }
        ArrayList arrayListMo7637 = c11518.mo7637(m39741(), true);
        arrayListMo7637.add(0, C15688.f48358);
        return arrayListMo7637;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo6008() {
        return new C12928(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12244 mo6017() {
        return new C12244(this.f6222, this.f6223.m28348(), C19883.f64233);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo6011() {
        return this.f6223.m28352();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo6016() {
        return this.f6223.m28351();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        c16561.m39053(this.f6222);
        c16561.m39033(this.f6223.m28350().m36511(), true);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6018(C16560 c16560) {
        m39737(c16560);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440M36526 = C16999.m39866(this.f51870.mo23554(), C4303.m12893(m39741())).m36526(interfaceC17889.getName());
        abstractC15440M36526.mo23545();
        return abstractC15440M36526;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        new C7284(this, c16560, list, runnable).m20274();
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m6019() {
        return this.f6223.m28348();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, AbstractC16891.f51865, AbstractC16891.f51860, new C7970(), AbstractC16891.f51857, AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector, true));
    }
}
