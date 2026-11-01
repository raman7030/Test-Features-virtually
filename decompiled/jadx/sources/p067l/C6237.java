package p067l;

import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۘܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6237 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C3554(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null);
    }
}
