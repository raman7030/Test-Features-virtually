package p067l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ᩳ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19225 implements InterfaceC21569 {
    @Override // p067l.InterfaceC21569
    public final Object create() {
        return new HMac(new SHA256Digest());
    }
}
