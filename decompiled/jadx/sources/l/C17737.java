package l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ᩳ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes5.dex */
public final class C17737 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new HMac(new SHA256Digest());
    }
}
