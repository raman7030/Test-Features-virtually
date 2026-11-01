package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4084 extends AbstractC18422 {

    /* JADX INFO: renamed from: ᩸ */
    public final String f9001;

    /* JADX INFO: renamed from: ᩹ */
    public final C13315 f9002;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "compress";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
    }

    static {
        C15345.m34927("compress");
        C11126.m25655("compress", "local", new C24043());
    }

    public C4084(int i, String str) throws C20807 {
        super(i, "/");
        C13315 c13315 = new C13315(str);
        this.f9002 = c13315;
        this.f9001 = c13315.m30396().getName();
        m41986(str);
        try {
            mo16732(false);
        } catch (IOException e) {
            C20807 c20807 = new C20807(C7050.m16224(R.string.MT_Protector));
            c20807.initCause((Throwable) e);
            throw c20807;
        }
    }

    public C4084(C14677 c14677) {
        super(c14677);
        C13315 c13315 = new C13315(c14677.m33593());
        this.f9002 = c13315;
        this.f9001 = c13315.m30396().getName();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        this.f9002.mo9714(c11996);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return this.f9001 + super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f9002;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        C13315 c13315 = this.f9002;
        if (c13315.m30395() == null) {
            mo16732(false);
        }
        ArrayList arrayListMo9708 = c13315.mo9708(m41982(), true);
        arrayListMo9708.add(0, C17278.f51496);
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new C14655(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        return new C14005(this.f9001, this.f9002.m30394(), C21265.f66869);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return this.f9002.m30398();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return this.f9002.m30397();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18108.m41279(this.f9001);
        c18108.m41259(this.f9002.m30396().m38669(), true);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        m41978(c18107);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043M38684 = C18524.m42109(this.f55050.mo25505(), C6458.m14757(m41982())).m38684(interfaceC19370.getName());
        abstractC17043M38684.mo25496();
        return abstractC17043M38684;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        new C9291(this, c18107, list, runnable).m22250();
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m8216() {
        return this.f9002.m30394();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, AbstractC18422.f55045, AbstractC18422.f55040, new C9943(), AbstractC18422.f55038, AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, true));
    }
}
