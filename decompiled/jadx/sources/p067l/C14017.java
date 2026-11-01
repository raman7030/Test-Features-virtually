package p067l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;

/* JADX INFO: renamed from: l.۫۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14017 implements InterfaceC21569 {
    @Override // p067l.InterfaceC21569
    public final Object create() {
        return new C14687(new BufferedBlockCipher(new DESEngine()));
    }
}
