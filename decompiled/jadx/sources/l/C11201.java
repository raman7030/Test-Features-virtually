package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11201 implements InterfaceC19172 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33619;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17550 f33620;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18090 f33621;

    public C11201(C18090 c18090, C17550 c17550, String str) {
        this.f33621 = c18090;
        this.f33620 = c17550;
        this.f33619 = str;
    }

    @Override // l.InterfaceC19172
    /* JADX INFO: renamed from: ֫ */
    public final void mo10516(AbstractC15440 abstractC15440) throws C3059, IOException {
        try {
            InputStream inputStreamM24812 = C9790.m24812(this.f33620.f53647, this.f33621);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC15440.mo23555(false));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        C5556.m15716();
                        int i = inputStreamM24812.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            inputStreamM24812.close();
                            return;
                        } else if (i > 0) {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        try {
                            inputStreamM24812.close();
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
                inputStreamM24812.close();
                throw th4;
            }
        } catch (C6967 e) {
            throw C9790.m24823(e.f21474);
        }
    }

    @Override // l.InterfaceC19172
    /* JADX INFO: renamed from: ֫ */
    public final void mo10515(C7383 c7383) throws C3059 {
        C5556.m15716();
        c7383.m19883(this.f33619);
    }
}
