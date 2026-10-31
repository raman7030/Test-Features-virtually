package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۚۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes3.dex */
public final class C5168 extends AbstractC16891 implements InterfaceC19944 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3051 f16171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16415 f16172;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2346 f16173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6993 f16174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f16175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23926 f16176;

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo13541(C16560 c16560, View view, C16415 c16415, InterfaceC17827 interfaceC17827) {
        C22060.m49619(this, c16560, c16415, interfaceC17827);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m14823(IInArchive iInArchive) {
        this.f16173.m7651(iInArchive);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ */
    public final String mo6007() {
        return "archive";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m14825() {
        return this.f16173.m7659();
    }

    static {
        C13654.m32812("archive");
        C9214.m23656("archive", "local", new C3757());
    }

    public C5168(int i, IInArchive iInArchive, String str, ArrayList arrayList) throws C19401 {
        super(i, "/");
        this.f16172 = new C16415("archive", null);
        this.f16176 = new C23926(this);
        this.f16174 = new C6993(this);
        C2346 c2346 = new C2346(str, arrayList);
        this.f16173 = c2346;
        this.f16175 = c2346.m7648().getName();
        m39745(str);
        try {
            c2346.m7645(iInArchive);
            if (c2346.mo7652()) {
                this.f16171 = new C3051(c2346);
            }
        } catch (IOException e) {
            C19401 c19401 = new C19401(C4925.m14327(R.string.MT_Protector));
            c19401.initCause((Throwable) e);
            throw c19401;
        }
    }

    public C5168(C12951 c12951) {
        super(c12951);
        this.f16172 = new C16415("archive", null);
        this.f16176 = new C23926(this);
        this.f16174 = new C6993(this);
        C2346 c2346M7634 = C2346.m7634(c12951);
        this.f16173 = c2346M7634;
        this.f16175 = c2346M7634.m7648().getName();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        this.f16173.mo7643(c10130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14822(AbstractC15440 abstractC15440) {
        this.f16173.m7644(abstractC15440);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ */
    public final String mo6009() {
        return this.f16175 + super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return this.f16173;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC10834 mo14827() {
        if (this.f16173.mo7652()) {
            return this.f16171;
        }
        return C12347.m29966();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo14824(boolean z) {
        C2346 c2346 = this.f16173;
        c2346.mo7646(z);
        if (c2346.mo7652()) {
            C3051 c3051 = this.f16171;
            if (c3051 != null) {
                c3051.m9352();
            }
            this.f16171 = new C3051(c2346);
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ */
    public final List mo6012() {
        C2346 c2346 = this.f16173;
        if (c2346.m7657() == null) {
            mo14824(false);
        }
        ArrayList arrayListMo7637 = c2346.mo7637(m39741(), true);
        arrayListMo7637.add(0, C15688.f48358);
        return arrayListMo7637;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new C0934(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ */
    public final C12244 mo6017() {
        return new C12244(this.f16175, this.f16173.m7650(), C19883.f64233);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo6011() {
        return this.f16173.m7653();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo6016() {
        return this.f16173.m7635();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        c16561.m39053(this.f16175);
        c16561.m39033(this.f16173.m7648().m36511(), true);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6014(String str) {
        C4007 entry = this.f16173.getEntry(str.substring(1));
        return (entry == null || entry.m12076()) ? false : true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        m39737(c16560);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺ */
    public final void mo6021() {
        C3051 c3051 = this.f16171;
        if (c3051 != null) {
            c3051.m9352();
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m14826() {
        return this.f16173.m7650();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f16176, this.f16174, AbstractC16891.f51865, AbstractC16891.f51860, new C7970(), AbstractC16891.f51857, m39743(), AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final void mo13540(C16415 c16415) {
        this.f16172 = c16415;
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final C16415 mo13539() {
        return this.f16172;
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
        new C0228(this, c16560, list, runnable).m20274();
    }
}
