package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16767 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) throws InterruptedException, IOException {
        C14756.f42079 = true;
        C21463 c21463 = new C21463(c17613);
        new C10063(c21463).start();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (c21463.f67696) {
            Thread.sleep(200L);
            if (System.currentTimeMillis() - jCurrentTimeMillis > 15000) {
                c21463.m48625();
                throw new IOException("Connection timed out");
            }
            if (!C14756.f42079) {
                c21463.m48625();
                return;
            }
        }
    }
}
