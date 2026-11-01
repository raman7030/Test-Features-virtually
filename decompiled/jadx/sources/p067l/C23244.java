package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes.dex */
public final class C23244 extends AbstractC18422 {

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f73068 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final C7150 f73069;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "payload";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        return false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
    }

    static {
        C15345.m34927("payload");
        C11126.m25655("payload", "local", new C3126());
    }

    public C23244(String str, int i, long j, long j2) throws C20807 {
        super(i, "/");
        this.f73069 = new C7150(C18524.m42109(str, new String[0]), j, j2);
        m41986(str);
        try {
            mo16732(false);
        } catch (IOException e) {
            C20807 c20807 = new C20807(C7050.m16224(R.string.MT_Protector));
            c20807.initCause((Throwable) e);
            throw c20807;
        }
    }

    public C23244(int i, String str, String str2, int i2, C23914 c23914) {
        super(i, "/");
        C7150 c7150M16431 = C7150.m16431(i2, str, str2);
        this.f73069 = c7150M16431;
        c7150M16431.m16439(c23914);
    }

    public C23244(C14677 c14677) {
        super(c14677);
        this.f73069 = C7150.m16432(c14677);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        this.f73069.mo9714(c11996);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return "payload.bin" + super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f73069;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final Runnable mo41975(boolean z) {
        C23914 c23914M16438 = this.f73069.m16438(z);
        if (c23914M16438 == null) {
            return null;
        }
        return new RunnableC9832(c23914M16438);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        ArrayList arrayListMo9708 = this.f73069.mo9708(m41982(), true);
        arrayListMo9708.add(0, C17278.f51496);
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3947 mo41739(C4697 c4697) {
        if (this.f73069.m16433() && c4697.m9967().m41261("local")) {
            return new C5257(true);
        }
        return C11126.m25654(c4697);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new C14644(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC3947 mo37386() {
        return C11955.m27369();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC3947 mo37382() {
        return C5249.m11323();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo37381(C18107 c18107, InterfaceC19370 interfaceC19370) {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        return new C14005("payload.bin", this.f73069.m16436(), C21265.f66869);
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m51790() {
        return this.f73069.m16435();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return this.f73069.m16441();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return this.f73069.m16440();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return !this.f73069.m16433();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        AbstractC17043 abstractC17043M16437 = this.f73069.m16437();
        if (abstractC17043M16437 != null) {
            c18108.m41279(abstractC17043M16437.getName());
            c18108.m41259(abstractC17043M16437.m38669(), true);
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        m41978(c18107);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        new C22574(this, c18107, list, runnable).m22250();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043M38684 = this.f55050.m38684(C6458.m14757(m41982()) + "/" + interfaceC19370.getName());
        abstractC17043M38684.mo25496();
        return abstractC17043M38684;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, AbstractC18422.f55045, AbstractC18422.f55040, AbstractC18422.f55038, AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, true));
    }
}
