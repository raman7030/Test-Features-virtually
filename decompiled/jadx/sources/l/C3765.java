package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۘۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3765 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11878;

    public /* synthetic */ C3765(int i) {
        this.f11878 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f11878) {
            case 0:
                return ServiceC19288.f60687;
            case 1:
                char[] cArr = C14460.f44310;
                try {
                    return MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            default:
                int i = AbstractC6079.f18650;
                return new C12429();
        }
    }
}
