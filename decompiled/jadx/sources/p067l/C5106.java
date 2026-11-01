package p067l;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5106 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C17984 f11983;

    /* JADX INFO: renamed from: ܳ */
    public InputStream f11984;

    /* JADX INFO: renamed from: ܿ */
    public long f11985;

    /* JADX INFO: renamed from: ᩷ */
    public Uri f11986;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f11987;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5106(C17984 c17984) {
        super(c17984.f53715 instanceof AbstractC5375);
        this.f11983 = c17984;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        Uri uri = c5318.f12514;
        long j = c5318.f12521;
        this.f11986 = uri;
        m9837(c5318);
        Uri uri2 = this.f11986;
        C17984 c17984 = this.f11983;
        InterfaceC19370 interfaceC19370M40962 = c17984.m40962(uri2);
        long size = interfaceC19370M40962.getSize();
        if (size >= 0 && j > size) {
            throw new C23423(null, null, 2008);
        }
        long j2 = c5318.f12516;
        this.f11985 = j2;
        if (j2 == -1 && size >= 0) {
            this.f11985 = size - j;
        }
        try {
            if (size >= 0 && j == size) {
                this.f11984 = new ByteArrayInputStream(new byte[0]);
                this.f11987 = true;
                m9839(c5318);
                return this.f11985;
            }
            AbstractC15599 abstractC15599 = c17984.f53715;
            if (abstractC15599 instanceof AbstractC5375) {
                AbstractC5375 abstractC5375 = (AbstractC5375) abstractC15599;
                C17984.m40938(c17984, interfaceC19370M40962);
                if (c17984.f53708) {
                    throw new C5776(interfaceC19370M40962.getName());
                }
                long j3 = c5318.f12516;
                this.f11984 = j3 == -1 ? abstractC5375.mo11725(j, interfaceC19370M40962.getPath()) : abstractC5375.mo11726(interfaceC19370M40962.getPath(), c5318.f12521, j3);
            } else {
                if (!(c17984.f53715 instanceof C4744)) {
                    throw new IOException("HLS direct reading requires a local or network visitor");
                }
                if (c17984.f53708) {
                    throw new C5776(interfaceC19370M40962.getName());
                }
                InputStream inputStreamMo29987 = interfaceC19370M40962.mo26445().mo29987();
                this.f11984 = inputStreamMo29987;
                while (j > 0) {
                    long jSkip = inputStreamMo29987.skip(j);
                    if (jSkip <= 0) {
                        if (inputStreamMo29987.read() == -1) {
                            throw new C23423(null, null, 2008);
                        }
                        jSkip = 1;
                    }
                    j -= jSkip;
                }
            }
            if (!c17984.f53708) {
                this.f11987 = true;
                m9839(c5318);
                return this.f11985;
            }
            InputStream inputStream = this.f11984;
            this.f11984 = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw new C5776(interfaceC19370M40962.getName());
        } catch (IOException e) {
            throw C17984.m40926(c17984, e);
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11985;
        if (j == 0) {
            return -1;
        }
        InputStream inputStream = this.f11984;
        if (inputStream == null) {
            throw new IOException("Data source is not open");
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                this.f11985 = 0L;
                return -1;
            }
            long j2 = this.f11985;
            if (j2 != -1) {
                this.f11985 = j2 - ((long) i3);
            }
            m9840(i3);
            return i3;
        } catch (IOException e) {
            throw C17984.m40926(this.f11983, e);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f11986;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f11986 = null;
        try {
            InputStream inputStream = this.f11984;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f11984 = null;
            this.f11985 = 0L;
            if (this.f11987) {
                this.f11987 = false;
                m9838();
            }
        }
    }
}
