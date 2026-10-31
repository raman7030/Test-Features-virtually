package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19919 implements InterfaceC9294 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f64365;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f64366;

    public C19919(long[] jArr, byte[] bArr) {
        this.f64365 = jArr;
        this.f64366 = bArr;
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) throws C3059, IOException {
        long j = c14937.f45532;
        this.f64365[0] = j;
        byte[] bArr = this.f64366;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 >= length) {
            InputStream inputStreamM35392 = c14937.m35392();
            try {
                C21679.m48949(inputStreamM35392, bufferedOutputStream, j, true);
                if (inputStreamM35392 != null) {
                    inputStreamM35392.close();
                }
                bufferedOutputStream.write(bArr);
                C21679.m48948();
                return;
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
        throw C6240.m17179("Appended bytes exceed the supported final file size.", j2, length);
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7074() throws C3059 {
        C21679.m48948();
    }
}
