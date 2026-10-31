package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11885 implements InterfaceC9294 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f35435;

    public C11885(long j) {
        this.f35435 = j;
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) throws C3059, IOException {
        long j = c14937.f45532;
        long j2 = this.f35435;
        if (j2 > j) {
            throw C6240.m17179("Truncation cannot extend the file.", j, j2);
        }
        InputStream inputStreamM35392 = c14937.m35392();
        try {
            C21679.m48949(inputStreamM35392, bufferedOutputStream, j2, j2 == j);
            if (inputStreamM35392 != null) {
                inputStreamM35392.close();
            }
        } catch (Throwable th) {
            if (inputStreamM35392 != null) {
                try {
                    inputStreamM35392.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7074() throws C3059 {
        C21679.m48948();
    }
}
