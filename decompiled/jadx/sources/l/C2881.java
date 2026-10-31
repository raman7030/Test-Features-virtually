package l;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2881 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f9185;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InputStream f9186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f9187;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f9188;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f9189;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881(C16431 c16431) {
        super(c16431.f50535 instanceof AbstractC3163);
        this.f9185 = c16431;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        Uri uri = c3104.f9711;
        long j = c3104.f9718;
        this.f9188 = uri;
        m7774(c3104);
        Uri uri2 = this.f9188;
        C16431 c16431 = this.f9185;
        InterfaceC17889 interfaceC17889M38737 = c16431.m38737(uri2);
        long size = interfaceC17889M38737.getSize();
        if (size >= 0 && j > size) {
            throw new C22154(null, null, 2008);
        }
        long j2 = c3104.f9713;
        this.f9187 = j2;
        if (j2 == -1 && size >= 0) {
            this.f9187 = size - j;
        }
        try {
            if (size >= 0 && j == size) {
                this.f9186 = new ByteArrayInputStream(new byte[0]);
                this.f9189 = true;
                m7776(c3104);
                return this.f9187;
            }
            AbstractC13921 abstractC13921 = c16431.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                C16431.m38713(c16431, interfaceC17889M38737);
                if (c16431.f50528) {
                    throw new C3586(interfaceC17889M38737.getName());
                }
                long j3 = c3104.f9713;
                this.f9186 = j3 == -1 ? abstractC3163.mo9681(j, interfaceC17889M38737.getPath()) : abstractC3163.mo9682(interfaceC17889M38737.getPath(), c3104.f9718, j3);
            } else {
                if (!(c16431.f50535 instanceof C2499)) {
                    throw new IOException("HLS direct reading requires a local or network visitor");
                }
                if (c16431.f50528) {
                    throw new C3586(interfaceC17889M38737.getName());
                }
                InputStream inputStreamMo27926 = interfaceC17889M38737.mo24433().mo27926();
                this.f9186 = inputStreamMo27926;
                while (j > 0) {
                    long jSkip = inputStreamMo27926.skip(j);
                    if (jSkip <= 0) {
                        if (inputStreamMo27926.read() == -1) {
                            throw new C22154(null, null, 2008);
                        }
                        jSkip = 1;
                    }
                    j -= jSkip;
                }
            }
            if (!c16431.f50528) {
                this.f9189 = true;
                m7776(c3104);
                return this.f9187;
            }
            InputStream inputStream = this.f9186;
            this.f9186 = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw new C3586(interfaceC17889M38737.getName());
        } catch (IOException e) {
            throw C16431.m38701(c16431, e);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9187;
        if (j == 0) {
            return -1;
        }
        InputStream inputStream = this.f9186;
        if (inputStream == null) {
            throw new IOException("Data source is not open");
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                this.f9187 = 0L;
                return -1;
            }
            long j2 = this.f9187;
            if (j2 != -1) {
                this.f9187 = j2 - ((long) i3);
            }
            m7777(i3);
            return i3;
        } catch (IOException e) {
            throw C16431.m38701(this.f9185, e);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f9188;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f9188 = null;
        try {
            InputStream inputStream = this.f9186;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f9186 = null;
            this.f9187 = 0L;
            if (this.f9189) {
                this.f9189 = false;
                m7775();
            }
        }
    }
}
