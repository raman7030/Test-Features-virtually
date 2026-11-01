package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4325 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f9645;

    /* JADX INFO: renamed from: ۙ */
    public final byte[] f9646 = new byte[1];

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C19077 f9647;

    /* JADX INFO: renamed from: ᩶ */
    public int f9648;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f9649;

    /* JADX INFO: renamed from: ᩹ */
    public InputStream f9650;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4325(C19077 c19077) {
        this.f9647 = c19077;
        this.f9650 = new ByteArrayInputStream(c19077.f56923);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f9646;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream c22431;
        C12826.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f9649) {
            C19077 c19077 = this.f9647;
            if (!c19077.f56924) {
                if (i2 == 0) {
                    return 0;
                }
                while (true) {
                    InputStream inputStream = this.f9650;
                    if (inputStream == null) {
                        return -1;
                    }
                    int i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        return i3;
                    }
                    this.f9650.close();
                    this.f9650 = null;
                    if (this.f9645) {
                        List list = c19077.f56925;
                        int i4 = this.f9648;
                        this.f9648 = i4 + 1;
                        C18406 c18406 = (C18406) ((ArrayList) list).get(i4);
                        C11702 c11702 = c18406.f54961;
                        if (c11702 == null) {
                            c22431 = new ByteArrayInputStream(c18406.f54960);
                        } else {
                            C11031.m25428(c11702.f32629);
                            c22431 = new C22431(c11702);
                        }
                        this.f9650 = c22431;
                        this.f9645 = false;
                    } else if (this.f9648 < ((ArrayList) c19077.f56925).size()) {
                        C18406 c18407 = (C18406) ((ArrayList) c19077.f56925).get(this.f9648);
                        C11996 c11996 = new C11996(12);
                        c11996.writeInt(c18407.f54962);
                        C11702 c11703 = c18407.f54961;
                        c11996.m27451(c11703 == null ? c18407.f54960.length : c11703.m26908());
                        this.f9650 = new ByteArrayInputStream(c11996.m27464());
                        this.f9645 = true;
                    }
                }
            }
        }
        throw new IOException("Legacy app state stream is closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9649) {
            return;
        }
        this.f9649 = true;
        InputStream inputStream = this.f9650;
        if (inputStream != null) {
            inputStream.close();
            this.f9650 = null;
        }
    }
}
