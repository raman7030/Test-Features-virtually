package p067l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۘۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5947 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14684;

    public /* synthetic */ C5947(int i) {
        this.f14684 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f14684) {
            case 0:
                return ServiceC20700.f63917;
            case 1:
                char[] cArr = C16111.f47404;
                try {
                    return MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            default:
                int i = AbstractC8146.f21506;
                return new C14181();
        }
    }
}
