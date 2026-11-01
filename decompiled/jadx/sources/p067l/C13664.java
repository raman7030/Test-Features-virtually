package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13664 implements InterfaceC11201 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ long f38445;

    public C13664(long j) {
        this.f38445 = j;
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
        long j = c16564.f48647;
        long j2 = this.f38445;
        if (j2 > j) {
            throw C8299.m19117("Truncation cannot extend the file.", j, j2);
        }
        InputStream inputStreamM37544 = c16564.m37544();
        try {
            C22972.m51298(inputStreamM37544, bufferedOutputStream, j2, j2 == j);
            if (inputStreamM37544 != null) {
                inputStreamM37544.close();
            }
        } catch (Throwable th) {
            if (inputStreamM37544 != null) {
                try {
                    inputStreamM37544.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9169() throws C5276 {
        C22972.m51297();
    }
}
