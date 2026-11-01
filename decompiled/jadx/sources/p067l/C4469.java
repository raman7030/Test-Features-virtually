package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4CH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4469 implements InterfaceC24263 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20912 f10047;

    public C4469(InterfaceC20912 interfaceC20912) {
        this.f10047 = interfaceC20912;
    }

    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) {
        boolean z;
        C10678 c10678M23010 = c9833.m23010();
        C11349 c11349M24587 = c10678M23010.m24587();
        AbstractC4643 abstractC4643M24585 = c10678M23010.m24585();
        if (abstractC4643M24585 != null) {
            C15545 c15545Mo4356 = abstractC4643M24585.mo4356();
            if (c15545Mo4356 != null) {
                c11349M24587.m26293("Content-Type", c15545Mo4356.toString());
            }
            long jMo4352 = abstractC4643M24585.mo4352();
            if (jMo4352 != -1) {
                c11349M24587.m26293("Content-Length", Long.toString(jMo4352));
                c11349M24587.m26285("Transfer-Encoding");
            } else {
                c11349M24587.m26293("Transfer-Encoding", "chunked");
                c11349M24587.m26285("Content-Length");
            }
        }
        if (c10678M23010.m24584("Host") == null) {
            c11349M24587.m26293("Host", C21407.m48488(c10678M23010.m24591(), false));
        }
        if (c10678M23010.m24584("Connection") == null) {
            c11349M24587.m26293("Connection", "Keep-Alive");
        }
        if (c10678M23010.m24584("Accept-Encoding") == null && c10678M23010.m24584("Range") == null) {
            c11349M24587.m26293("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        InterfaceC20912 interfaceC20912 = this.f10047;
        interfaceC20912.mo45724();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C6159 c6159 = (C6159) list.get(i);
                sb.append(c6159.m13955());
                sb.append(C0184a.f880h);
                sb.append(c6159.m13956());
            }
            c11349M24587.m26293("Cookie", sb.toString());
        }
        if (c10678M23010.m24584("User-Agent") == null) {
            c11349M24587.m26293("User-Agent", "okhttp/3.12.13");
        }
        C20066 c20066M23001 = c9833.m23001(c11349M24587.m26284());
        C13535 c13535M24591 = c10678M23010.m24591();
        C12194 c12194M45446 = c20066M23001.m45446();
        int i2 = C3127.f5696;
        if (interfaceC20912 != InterfaceC20912.f65672) {
            C6159.m13954(c13535M24591, c12194M45446).isEmpty();
        }
        C5984 c5984M45438 = c20066M23001.m45438();
        c5984M45438.m13415(c10678M23010);
        if (z && "gzip".equalsIgnoreCase(c20066M23001.m45435("Content-Encoding")) && C3127.m5332(c20066M23001)) {
            C4250 c4250 = new C4250(c20066M23001.m45436().mo4016());
            C14205 c14205M28163 = c20066M23001.m45446().m28163();
            c14205M28163.m32682("Content-Encoding");
            c14205M28163.m32682("Content-Length");
            c5984M45438.m13416(c14205M28163.m32677());
            c5984M45438.m13414(new C16538(c20066M23001.m45435("Content-Type"), -1L, C25037.m54976(c4250)));
        }
        return c5984M45438.m13410();
    }
}
