package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3724 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11759;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f11760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19247 f11761;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f11762;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3724(C19247 c19247, BufferedInputStream bufferedInputStream, String str, boolean z) {
        super(bufferedInputStream);
        this.f11761 = c19247;
        this.f11762 = str;
        this.f11760 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        String str = this.f11762;
        C19247 c19247 = this.f11761;
        try {
            int i = super.read();
            if (i == -1 && !this.f11759) {
                this.f11759 = true;
                C10395.m26221(c19247.f60580.mo23554(), str);
            }
            return i;
        } catch (C3979 e) {
            C10395.m26214(c19247.f60580.mo23554(), str);
            if (this.f11760) {
                C22523.m50500();
            }
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str = this.f11762;
        C19247 c19247 = this.f11761;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && !this.f11759) {
                this.f11759 = true;
                C10395.m26221(c19247.f60580.mo23554(), str);
            }
            return i3;
        } catch (C3979 e) {
            C10395.m26214(c19247.f60580.mo23554(), str);
            if (this.f11760) {
                C22523.m50500();
            }
            throw e;
        }
    }
}
