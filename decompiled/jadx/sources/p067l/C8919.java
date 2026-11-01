package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۜܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8919 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C3554(257, XMSSKeyParameters.SHA_256, C0187d.f883a, "SHA256withRSA/PSS", new PSSParameterSpec(XMSSKeyParameters.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
    }
}
