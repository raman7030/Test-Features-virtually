package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes.dex */
public final class C21965 extends AbstractC16891 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70357 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5031 f70358;

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ */
    public final String mo6007() {
        return "payload";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6014(String str) {
        return false;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺ */
    public final void mo6021() {
    }

    static {
        C13654.m32812("payload");
        C9214.m23656("payload", "local", new C0797());
    }

    public C21965(String str, int i, long j, long j2) throws C19401 {
        super(i, "/");
        this.f70358 = new C5031(C16999.m39866(str, new String[0]), j, j2);
        m39745(str);
        try {
            mo14824(false);
        } catch (IOException e) {
            C19401 c19401 = new C19401(C4925.m14327(R.string.MT_Protector));
            c19401.initCause((Throwable) e);
            throw c19401;
        }
    }

    public C21965(int i, String str, String str2, int i2, C22670 c22670) {
        super(i, "/");
        C5031 c5031M14527 = C5031.m14527(i2, str, str2);
        this.f70358 = c5031M14527;
        c5031M14527.m14535(c22670);
    }

    public C21965(C12951 c12951) {
        super(c12951);
        this.f70358 = C5031.m14528(c12951);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        this.f70358.mo7643(c10130);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ */
    public final String mo6009() {
        return "payload.bin" + super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return this.f70358;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final Runnable mo39734(boolean z) {
        C22670 c22670M14534 = this.f70358.m14534(z);
        if (c22670M14534 == null) {
            return null;
        }
        return new RunnableC7853(c22670M14534);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ */
    public final List mo6012() {
        ArrayList arrayListMo7637 = this.f70358.mo7637(m39741(), true);
        arrayListMo7637.add(0, C15688.f48358);
        return arrayListMo7637;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1661 mo39503(C2450 c2450) {
        if (this.f70358.m14529() && c2450.m7919().m39035("local")) {
            return new C3039(true);
        }
        return C9214.m23655(c2450);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new C12916(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC1661 mo35231() {
        return C10087.m25350();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC1661 mo35227() {
        return C3031.m9281();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo35226(C16560 c16560, InterfaceC17889 interfaceC17889) {
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ */
    public final C12244 mo6017() {
        return new C12244("payload.bin", this.f70358.m14532(), C19883.f64233);
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m49453() {
        return this.f70358.m14531();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo6011() {
        return this.f70358.m14537();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo6016() {
        return this.f70358.m14536();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo6015() {
        return !this.f70358.m14529();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        AbstractC15440 abstractC15440M14533 = this.f70358.m14533();
        if (abstractC15440M14533 != null) {
            c16561.m39053(abstractC15440M14533.getName());
            c16561.m39033(abstractC15440M14533.m36511(), true);
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        m39737(c16560);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        new C21260(this, c16560, list, runnable).m20274();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440M36526 = this.f51870.m36526(C4303.m12893(m39741()) + "/" + interfaceC17889.getName());
        abstractC15440M36526.mo23545();
        return abstractC15440M36526;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, AbstractC16891.f51865, AbstractC16891.f51860, AbstractC16891.f51857, AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector, true));
    }
}
