package l;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ܿ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17031 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new HMac(new MD5Digest());
    }
}
