package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* JADX INFO: renamed from: l.᩶۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20019 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new C22135(new GCMBlockCipher(new AESEngine()));
    }
}
