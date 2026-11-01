package p067l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* JADX INFO: renamed from: l.᩶۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21394 implements InterfaceC21569 {
    @Override // p067l.InterfaceC21569
    public final Object create() {
        return new C23405(new GCMBlockCipher(new AESEngine()));
    }
}
