package p067l;

import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۖܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4896 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C3554(514, XMSSKeyParameters.SHA_512, "EC", "SHA512withECDSA", null);
    }
}
