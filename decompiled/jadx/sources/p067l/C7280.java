package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۚۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7280 extends AbstractC18422 implements InterfaceC21323 {

    /* JADX INFO: renamed from: ۗ */
    public C5268 f19010;

    /* JADX INFO: renamed from: ۙ */
    public C17969 f19011;

    /* JADX INFO: renamed from: ۬ */
    public final C4598 f19012;

    /* JADX INFO: renamed from: ᩶ */
    public final C9015 f19013;

    /* JADX INFO: renamed from: ᩸ */
    public final String f19014;

    /* JADX INFO: renamed from: ᩹ */
    public final C25108 f19015;

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo15432(C18107 c18107, View view, C17969 c17969, InterfaceC19311 interfaceC19311) {
        C23334.m51955(this, c18107, c17969, interfaceC19311);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m16731(IInArchive iInArchive) {
        this.f19012.m9722(iInArchive);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "archive";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final synchronized IInArchive m16733() {
        return this.f19012.m9730();
    }

    static {
        C15345.m34927("archive");
        C11126.m25655("archive", "local", new C5939());
    }

    public C7280(int i, IInArchive iInArchive, String str, ArrayList arrayList) throws C20807 {
        super(i, "/");
        this.f19011 = new C17969("archive", null);
        this.f19015 = new C25108(this);
        this.f19013 = new C9015(this);
        C4598 c4598 = new C4598(str, arrayList);
        this.f19012 = c4598;
        this.f19014 = c4598.m9719().getName();
        m41986(str);
        try {
            c4598.m9716(iInArchive);
            if (c4598.mo9723()) {
                this.f19010 = new C5268(c4598);
            }
        } catch (IOException e) {
            C20807 c20807 = new C20807(C7050.m16224(R.string.MT_Protector));
            c20807.initCause((Throwable) e);
            throw c20807;
        }
    }

    public C7280(C14677 c14677) {
        super(c14677);
        this.f19011 = new C17969("archive", null);
        this.f19015 = new C25108(this);
        this.f19013 = new C9015(this);
        C4598 c4598M9705 = C4598.m9705(c14677);
        this.f19012 = c4598M9705;
        this.f19014 = c4598M9705.m9719().getName();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        this.f19012.mo9714(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16730(AbstractC17043 abstractC17043) {
        this.f19012.m9715(abstractC17043);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return this.f19014 + super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f19012;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        if (this.f19012.mo9723()) {
            return this.f19010;
        }
        return C14103.m32026();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final void mo16732(boolean z) {
        C4598 c4598 = this.f19012;
        c4598.mo9717(z);
        if (c4598.mo9723()) {
            C5268 c5268 = this.f19010;
            if (c5268 != null) {
                c5268.m11394();
            }
            this.f19010 = new C5268(c4598);
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        C4598 c4598 = this.f19012;
        if (c4598.m9728() == null) {
            mo16732(false);
        }
        ArrayList arrayListMo9708 = c4598.mo9708(m41982(), true);
        arrayListMo9708.add(0, C17278.f51496);
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new C3256(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        return new C14005(this.f19014, this.f19012.m9721(), C21265.f66869);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return this.f19012.m9724();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return this.f19012.m9706();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18108.m41279(this.f19014);
        c18108.m41259(this.f19012.m9719().m38669(), true);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        C6177 entry = this.f19012.getEntry(str.substring(1));
        return (entry == null || entry.m13996()) ? false : true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        m41978(c18107);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
        C5268 c5268 = this.f19010;
        if (c5268 != null) {
            c5268.m11394();
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m16734() {
        return this.f19012.m9721();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, this.f19015, this.f19013, AbstractC18422.f55045, AbstractC18422.f55040, new C9943(), AbstractC18422.f55038, m41984(), AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, true));
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15431(C17969 c17969) {
        this.f19011 = c17969;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final C17969 mo15430() {
        return this.f19011;
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
        new C2585(this, c18107, list, runnable).m22250();
    }
}
