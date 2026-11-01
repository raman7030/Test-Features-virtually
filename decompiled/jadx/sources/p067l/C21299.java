package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21299 implements InterfaceC11201 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ long[] f67003;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ byte[] f67004;

    public C21299(long[] jArr, byte[] bArr) {
        this.f67003 = jArr;
        this.f67004 = bArr;
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
        long j = c16564.f48647;
        this.f67003[0] = j;
        byte[] bArr = this.f67004;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 >= length) {
            InputStream inputStreamM37544 = c16564.m37544();
            try {
                C22972.m51298(inputStreamM37544, bufferedOutputStream, j, true);
                if (inputStreamM37544 != null) {
                    inputStreamM37544.close();
                }
                bufferedOutputStream.write(bArr);
                C22972.m51297();
                return;
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
        throw C8299.m19117("Appended bytes exceed the supported final file size.", j2, length);
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9169() throws C5276 {
        C22972.m51297();
    }
}
