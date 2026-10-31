package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.macs.CMac;

/* JADX INFO: renamed from: l.ܳ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14208 implements InterfaceC20203 {
    @Override // l.InterfaceC20203
    public final Object create() {
        return new CMac(new AESEngine());
    }
}
