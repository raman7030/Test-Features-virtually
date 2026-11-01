package p067l;

import java.util.Iterator;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܳܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16270 implements InterfaceC22530 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24988 f47842;

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo20392(AbstractC17043 abstractC17043) {
        C24988 c24988 = this.f47842;
        C7280 c7280 = c24988.f79766;
        if (c7280 == null) {
            C1194.m56393(c24988.f79765, abstractC17043);
        } else {
            c7280.m16730(abstractC17043);
        }
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo20393(IInArchive iInArchive) {
        C24988 c24988 = this.f47842;
        int iM41987 = C1048.m56309(this.f47842.f79763).m41987();
        C24988 c24989 = this.f47842;
        c24988.f79766 = new C7280(iM41987, iInArchive, c24989.f79764, c24989.f79765);
        Iterator itM56090 = C0989.m56090(this.f47842.f79765);
        while (C0930.m55886(itM56090)) {
            this.f47842.f79766.m16730((AbstractC17043) C0955.m56035(itM56090));
        }
        C0894.m55767(this.f47842.f79765);
    }

    public C16270(C24988 c24988) {
        this.f47842 = c24988;
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ܽ */
    public final void mo20394() {
        this.f47842.f79768 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f47842.f79762.m29270();
    }
}
