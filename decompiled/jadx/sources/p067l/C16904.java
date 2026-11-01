package p067l;

import net.p069sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.p069sf.sevenzipjbinding.IOutItemBase;
import net.p069sf.sevenzipjbinding.SevenZipException;
import net.p069sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ܶܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C16904 extends C22941 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ String f50055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16904(InterfaceC6847 interfaceC6847, String str) {
        super(interfaceC6847);
        this.f50055 = str;
    }

    @Override // net.p069sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f50055;
    }

    @Override // p067l.C22941, net.p069sf.sevenzipjbinding.IOutCreateCallback
    public final IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC6847 interfaceC6847 = this.f72183;
        if (interfaceC6847.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC6847.getItemInformation(i, outItemFactory);
    }
}
