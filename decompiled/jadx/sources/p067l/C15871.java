package p067l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.macs.CMac;

/* JADX INFO: renamed from: l.ܳ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15871 implements InterfaceC21569 {
    @Override // p067l.InterfaceC21569
    public final Object create() {
        return new CMac(new AESEngine());
    }
}
