package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;

/* JADX INFO: renamed from: l.۫۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12257 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new C12962(new BufferedBlockCipher(new DESEngine()));
    }
}
