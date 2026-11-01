package p067l;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ᩴۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20122 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        String strM31240 = ((C13731) c17613.m40106()).m31240();
        C13731 c13731 = new C13731();
        c13731.m31208(new BufferedInputStream(new FileInputStream(strM31240)));
        c17613.m40105(c13731);
    }
}
