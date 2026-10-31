package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 474M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19538 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f63114;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8043 f63115;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63116;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f63117;

    public C19538(InterfaceC21449 interfaceC21449, InterfaceC8043 interfaceC8043) {
        this.f63117 = interfaceC21449;
        interfaceC8043.getClass();
        this.f63115 = interfaceC8043;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        long jMo1620 = this.f63117.mo1620(c3104);
        this.f63114 = jMo1620;
        if (jMo1620 == 0) {
            return 0L;
        }
        if (c3104.f9713 == -1 && jMo1620 != -1) {
            c3104 = c3104.m9466(0L, jMo1620);
        }
        this.f63116 = true;
        this.f63115.mo13821(c3104);
        return this.f63114;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f63114 == 0) {
            return -1;
        }
        int i3 = this.f63117.read(bArr, i, i2);
        if (i3 > 0) {
            this.f63115.write(bArr, i, i3);
            long j = this.f63114;
            if (j != -1) {
                this.f63114 = j - ((long) i3);
            }
        }
        return i3;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f63117.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        return this.f63117.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC8043 interfaceC8043 = this.f63115;
        try {
            this.f63117.close();
        } finally {
            if (this.f63116) {
                this.f63116 = false;
                interfaceC8043.close();
            }
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f63117.mo5937(interfaceC0486);
    }
}
