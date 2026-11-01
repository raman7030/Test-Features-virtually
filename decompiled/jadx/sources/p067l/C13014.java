package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13014 implements InterfaceC20589 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String f36618;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C19048 f36619;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19561 f36620;

    public C13014(C19561 c19561, C19048 c19048, String str) {
        this.f36620 = c19561;
        this.f36619 = c19048;
        this.f36618 = str;
    }

    @Override // p067l.InterfaceC20589
    /* JADX INFO: renamed from: ֫ */
    public final void mo12540(AbstractC17043 abstractC17043) throws C5276, IOException {
        try {
            InputStream inputStreamM26827 = C11673.m26827(this.f36619.f56837, this.f36620);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC17043.mo25506(false));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        C7649.m17630();
                        int i = inputStreamM26827.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            inputStreamM26827.close();
                            return;
                        } else if (i > 0) {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        try {
                            inputStreamM26827.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM26827.close();
                throw th4;
            }
        } catch (C8990 e) {
            throw C11673.m26838(e.f24355);
        }
    }

    @Override // p067l.InterfaceC20589
    /* JADX INFO: renamed from: ֫ */
    public final void mo12539(C9385 c9385) throws C5276 {
        C7649.m17630();
        c9385.m21856(this.f36618);
    }
}
