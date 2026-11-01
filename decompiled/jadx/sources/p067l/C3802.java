package p067l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.֫֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3802 implements InterfaceC21569 {
    @Override // p067l.InterfaceC21569
    public final Object create() {
        return new C9323(new KDFCounterBytesGenerator(new HMac(new SHA256Digest())));
    }
}
