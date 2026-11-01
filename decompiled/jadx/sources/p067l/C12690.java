package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۧ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12690 extends AbstractC4643 {

    /* JADX INFO: renamed from: ۜ */
    public static final C15545 f35594;

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f35595;

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f35596;

    /* JADX INFO: renamed from: ᩷ */
    public static final C15545 f35597 = C15545.m35336("multipart/mixed");

    /* JADX INFO: renamed from: ᩻ */
    public static final byte[] f35598;

    /* JADX INFO: renamed from: ֫ */
    public final C13598 f35599;

    /* JADX INFO: renamed from: ۧ */
    public long f35600 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final C15545 f35601;

    /* JADX INFO: renamed from: ᩳ */
    public final List f35602;

    public C12690(C13598 c13598, C15545 c15545, ArrayList arrayList) {
        this.f35599 = c13598;
        this.f35601 = C15545.m35336(c15545 + "; boundary=" + c13598.mo4706());
        this.f35602 = C21407.m48491((List) arrayList);
    }

    static {
        C15545.m35336("multipart/alternative");
        C15545.m35336("multipart/digest");
        C15545.m35336("multipart/parallel");
        f35594 = C15545.m35336("multipart/form-data");
        f35596 = new byte[]{58, UTF8.S_CS3};
        f35595 = new byte[]{C0698cb.f2569k, 10};
        f35598 = new byte[]{45, 45};
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ܽ */
    public final C15545 mo4356() {
        return this.f35601;
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final long mo4352() {
        long j = this.f35600;
        if (j != -1) {
            return j;
        }
        long jM29199 = m29199((InterfaceC12257) null, true);
        this.f35600 = jM29199;
        return jM29199;
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final void mo4353(InterfaceC12257 interfaceC12257) {
        m29199(interfaceC12257, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private long m29199(InterfaceC12257 interfaceC12257, boolean z) {
        C14268 c14268;
        InterfaceC12257 c14269;
        if (z) {
            c14269 = new C14268();
            c14268 = c14269;
        } else {
            c14268 = 0;
            c14269 = interfaceC12257;
        }
        List list = this.f35602;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C13598 c13598 = this.f35599;
            byte[] bArr = f35598;
            byte[] bArr2 = f35595;
            if (i < size) {
                C3972 c3972 = (C3972) list.get(i);
                C12194 c12194 = c3972.f8633;
                AbstractC4643 abstractC4643 = c3972.f8632;
                c14269.write(bArr);
                c14269.mo28275(c13598);
                c14269.write(bArr2);
                int iM28164 = c12194.m28164();
                for (int i2 = 0; i2 < iM28164; i2++) {
                    c14269.mo28280(c12194.m28161(i2)).write(f35596).mo28280(c12194.m28165(i2)).write(bArr2);
                }
                C17382 c17382 = (C17382) abstractC4643;
                int i3 = c17382.f51864;
                C15545 c15545 = c17382.f51866;
                if (c15545 != null) {
                    c14269.mo28280("Content-Type: ").mo28280(c15545.toString()).write(bArr2);
                }
                long j2 = i3;
                if (j2 != -1) {
                    c14269.mo28280("Content-Length: ").mo28278(j2).write(bArr2);
                } else if (z) {
                    c14268.m32780();
                    return -1L;
                }
                c14269.write(bArr2);
                if (z) {
                    j += j2;
                } else {
                    c14269.mo28281(0, i3, c17382.f51865);
                }
                c14269.write(bArr2);
                i++;
            } else {
                c14269.write(bArr);
                c14269.mo28275(c13598);
                c14269.write(bArr);
                c14269.write(bArr2);
                if (!z) {
                    return j;
                }
                long size2 = c14268.size() + j;
                c14268.m32780();
                return size2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29200(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }
}
