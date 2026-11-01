package p067l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5908 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public boolean f14566;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ boolean f14567;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20661 f14568;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f14569;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5908(C20661 c20661, BufferedInputStream bufferedInputStream, String str, boolean z) {
        super(bufferedInputStream);
        this.f14568 = c20661;
        this.f14569 = str;
        this.f14567 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        String str = this.f14569;
        C20661 c20661 = this.f14568;
        try {
            int i = super.read();
            if (i == -1 && !this.f14566) {
                this.f14566 = true;
                C12248.m28250(c20661.f63811.mo25505(), str);
            }
            return i;
        } catch (C6150 e) {
            C12248.m28243(c20661.f63811.mo25505(), str);
            if (this.f14567) {
                C23775.m52842();
            }
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str = this.f14569;
        C20661 c20661 = this.f14568;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && !this.f14566) {
                this.f14566 = true;
                C12248.m28250(c20661.f63811.mo25505(), str);
            }
            return i3;
        } catch (C6150 e) {
            C12248.m28243(c20661.f63811.mo25505(), str);
            if (this.f14567) {
                C23775.m52842();
            }
            throw e;
        }
    }
}
