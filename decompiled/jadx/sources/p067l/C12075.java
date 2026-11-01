package p067l;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ۤۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12075 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        String strM31240 = ((C13731) c17613.m40106()).m31240();
        C13731 c13731 = new C13731();
        try {
            c13731.m31208(new FileInputStream(new File(strM31240)));
        } catch (Exception unused) {
        }
        c17613.m40105(c13731);
    }
}
