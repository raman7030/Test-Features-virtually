package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2058 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f6862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f6863 = new byte[1];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17580 f6864;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6865;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6866;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f6867;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2058(C17580 c17580) {
        this.f6864 = c17580;
        this.f6867 = new ByteArrayInputStream(c17580.f53733);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f6863;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream c21109;
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f6866) {
            C17580 c17580 = this.f6864;
            if (!c17580.f53734) {
                if (i2 == 0) {
                    return 0;
                }
                while (true) {
                    InputStream inputStream = this.f6867;
                    if (inputStream == null) {
                        return -1;
                    }
                    int i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        return i3;
                    }
                    this.f6867.close();
                    this.f6867 = null;
                    if (this.f6862) {
                        List list = c17580.f53735;
                        int i4 = this.f6865;
                        this.f6865 = i4 + 1;
                        C16874 c16874 = (C16874) ((ArrayList) list).get(i4);
                        C9820 c9820 = c16874.f51782;
                        if (c9820 == null) {
                            c21109 = new ByteArrayInputStream(c16874.f51781);
                        } else {
                            C9114.m23481(c9820.f29678);
                            c21109 = new C21109(c9820);
                        }
                        this.f6867 = c21109;
                        this.f6862 = false;
                    } else if (this.f6865 < ((ArrayList) c17580.f53735).size()) {
                        C16874 c16875 = (C16874) ((ArrayList) c17580.f53735).get(this.f6865);
                        C10130 c10130 = new C10130(12);
                        c10130.writeInt(c16875.f51783);
                        C9820 c9821 = c16875.f51782;
                        c10130.m25431(c9821 == null ? c16875.f51781.length : c9821.m24893());
                        this.f6867 = new ByteArrayInputStream(c10130.m25444());
                        this.f6862 = true;
                    }
                }
            }
        }
        throw new IOException("Legacy app state stream is closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6866) {
            return;
        }
        this.f6866 = true;
        InputStream inputStream = this.f6867;
        if (inputStream != null) {
            inputStream.close();
            this.f6867 = null;
        }
    }
}
