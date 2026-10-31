package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ܶܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C15294 extends C21646 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f46928;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15294(InterfaceC4712 interfaceC4712, String str) {
        super(interfaceC4712);
        this.f46928 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f46928;
    }

    @Override // l.C21646, net.sf.sevenzipjbinding.IOutCreateCallback
    public final IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC4712 interfaceC4712 = this.f69480;
        if (interfaceC4712.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC4712.getItemInformation(i, outItemFactory);
    }
}
