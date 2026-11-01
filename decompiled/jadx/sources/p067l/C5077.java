package p067l;

import net.p069sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۖ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5077 extends C17816 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ᩶ */
    public String f11899;

    public C5077(ISequentialOutStream iSequentialOutStream, String str) {
        super(iSequentialOutStream);
        this.f11899 = str;
    }

    @Override // net.p069sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f11899;
    }
}
