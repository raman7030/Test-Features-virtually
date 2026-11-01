package p067l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11812 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public long f32968;

    /* JADX INFO: renamed from: ۡ */
    public Uri f32969;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C17984 f32970;

    /* JADX INFO: renamed from: ܳ */
    public C15826 f32971;

    /* JADX INFO: renamed from: ܿ */
    public long f32972;

    /* JADX INFO: renamed from: ᩷ */
    public C24618 f32973;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f32974;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11812(C17984 c17984) {
        super(c17984.f53715 instanceof AbstractC5375);
        this.f32970 = c17984;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws Throwable {
        boolean zM40952;
        Uri uri = c5318.f12514;
        long jM35924 = c5318.f12516;
        this.f32969 = uri;
        long j = c5318.f12521;
        this.f32968 = j;
        m9837(c5318);
        Uri uri2 = this.f32969;
        C17984 c17984 = this.f32970;
        InterfaceC19370 interfaceC19370M40962 = c17984.m40962(uri2);
        if (C19267.m43905(interfaceC19370M40962.getName()) != null) {
            zM40952 = C17984.m40952(c17984, interfaceC19370M40962);
        } else {
            c17984.m40966(interfaceC19370M40962);
            zM40952 = false;
        }
        if (c17984.f53710 == null) {
            return m27072(c5318, interfaceC19370M40962.mo26445());
        }
        String strM40949 = C17984.m40949(interfaceC19370M40962);
        AbstractC17043 abstractC17043M40931 = C17984.m40931(c17984, strM40949);
        if (c17984.m40941(interfaceC19370M40962, abstractC17043M40931)) {
            c17984.m40951(interfaceC19370M40962, strM40949);
            return m27072(c5318, abstractC17043M40931);
        }
        if (!zM40952) {
            if (!C17984.m40948(c17984, interfaceC19370M40962)) {
                return m27072(c5318, abstractC17043M40931);
            }
            C15826 c15826M40930 = c17984.m40930(interfaceC19370M40962, strM40949, true);
            this.f32971 = c15826M40930;
            if (jM35924 == -1) {
                jM35924 = c15826M40930.m35924() - j;
            }
            this.f32972 = jM35924;
            if (jM35924 < 0) {
                throw new C23423(null, null, 2008);
            }
            this.f32974 = true;
            m9839(c5318);
            return this.f32972;
        }
        AbstractC15599 abstractC15599 = c17984.f53715;
        if (!(abstractC15599 instanceof AbstractC5375)) {
            throw new IOException("Network range cache is not available");
        }
        C15826 c15826 = new C15826(new C18576((AbstractC5375) abstractC15599, interfaceC19370M40962), interfaceC19370M40962.getName(), interfaceC19370M40962.getSize());
        this.f32971 = c15826;
        if (jM35924 == -1) {
            jM35924 = c15826.m35924() - j;
        }
        this.f32972 = jM35924;
        if (jM35924 < 0) {
            throw new C23423(null, null, 2008);
        }
        this.f32974 = true;
        m9839(c5318);
        return this.f32972;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m27072(C5318 c5318, AbstractC17043 abstractC17043) throws C23423 {
        C24618 c24618M38671 = abstractC17043.m38671("r");
        this.f32973 = c24618M38671;
        c24618M38671.seek(c5318.f12521);
        long length = c5318.f12516;
        if (length == -1) {
            length = this.f32973.length() - c5318.f12521;
        }
        this.f32972 = length;
        if (length < 0) {
            throw new C23423(null, null, 2008);
        }
        this.f32974 = true;
        m9839(c5318);
        return this.f32972;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C23423 {
        int iM35922;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f32972;
        if (j == 0) {
            return -1;
        }
        try {
            C24618 c24618 = this.f32973;
            if (c24618 != null) {
                iM35922 = c24618.read(bArr, i, (int) Math.min(j, i2));
            } else {
                iM35922 = this.f32971.m35922(this.f32968, bArr, i, (int) Math.min(j, i2));
            }
            if (iM35922 > 0) {
                long j2 = iM35922;
                this.f32968 += j2;
                this.f32972 -= j2;
                m9840(iM35922);
            }
            return iM35922;
        } catch (IOException e) {
            throw new C23423(2000, e);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f32969;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f32969 = null;
        try {
            try {
                C24618 c24618 = this.f32973;
                if (c24618 != null) {
                    c24618.close();
                }
                C15826 c15826 = this.f32971;
                if (c15826 != null) {
                    c15826.close();
                }
                this.f32973 = null;
                this.f32971 = null;
                if (this.f32974) {
                    this.f32974 = false;
                    m9838();
                }
            } catch (IOException e) {
                throw new C23423(2000, e);
            }
        } catch (Throwable th) {
            this.f32973 = null;
            this.f32971 = null;
            if (this.f32974) {
                this.f32974 = false;
                m9838();
            }
            throw th;
        }
    }
}
