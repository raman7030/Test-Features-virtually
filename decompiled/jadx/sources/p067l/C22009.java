package p067l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73O */
/* JADX INFO: loaded from: classes5.dex */
public final class C22009 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public long f69233;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC22753 f69234;

    /* JADX INFO: renamed from: ܽ */
    public C5318 f69236;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C11280 f69238;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f69237 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public long f69235 = -1;

    public C22009(C11280 c11280) {
        this.f69238 = c11280;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f69237;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
        InterfaceC22753 interfaceC22753 = this.f69234;
        if (interfaceC22753 != null) {
            interfaceC22753.mo8132(interfaceC2830);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        if (this.f69234 != null) {
            throw new IOException("Data source is already open");
        }
        C11280 c11280 = this.f69238;
        long jM37497 = c11280.f31428.m37497();
        InterfaceC22753 interfaceC22753Mo8449 = (jM37497 >= 0 ? c11280.f31429 : c11280.f31430).mo8449();
        this.f69234 = interfaceC22753Mo8449;
        this.f69236 = c5318;
        this.f69233 = 0L;
        this.f69235 = jM37497;
        Iterator it = this.f69237.iterator();
        while (it.hasNext()) {
            interfaceC22753Mo8449.mo8132((InterfaceC2830) it.next());
        }
        return (jM37497 < 0 || c11280.f31428.m37496(jM37497)) ? interfaceC22753Mo8449.mo4020(c5318) : m49610();
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InterfaceC22753 interfaceC22753 = this.f69234;
        if (interfaceC22753 == null) {
            throw new IOException("Data source is not open");
        }
        if (this.f69235 >= 0 && !this.f69238.f31428.m37496(this.f69235)) {
            C5318 c5318 = this.f69236;
            if (c5318 != null) {
                long j = c5318.f12516;
                if (j != -1 && this.f69233 >= j) {
                    return -1;
                }
            }
            m49610();
            interfaceC22753 = this.f69234;
        }
        int i3 = interfaceC22753.read(bArr, i, i2);
        if (i3 > 0) {
            this.f69233 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܳ */
    private long m49610() throws IOException {
        C5318 c5318 = this.f69236;
        if (c5318 == null) {
            throw new IOException("HLS media data spec is missing");
        }
        InterfaceC22753 interfaceC22753 = this.f69234;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } catch (IOException | RuntimeException unused) {
            }
        }
        InterfaceC22753 interfaceC22753Mo8449 = this.f69238.f31430.mo8449();
        this.f69234 = interfaceC22753Mo8449;
        this.f69235 = -1L;
        Iterator it = this.f69237.iterator();
        while (it.hasNext()) {
            interfaceC22753Mo8449.mo8132((InterfaceC2830) it.next());
        }
        long j = this.f69233;
        long j2 = c5318.f12516;
        return interfaceC22753Mo8449.mo4020(c5318.m11509(j, j2 != -1 ? j2 - j : -1L));
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f69234;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f69234;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC22753
    public final void close() {
        InterfaceC22753 interfaceC22753 = this.f69234;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } finally {
                this.f69234 = null;
                this.f69236 = null;
                this.f69233 = 0L;
                this.f69235 = -1L;
            }
        }
    }
}
