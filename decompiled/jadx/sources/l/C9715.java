package l;

import com.alipay.sdk.m.p.d;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۢܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9715 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C1247(259, XMSSKeyParameters.SHA_256, d.a, "SHA256withRSA", null);
    }
}
