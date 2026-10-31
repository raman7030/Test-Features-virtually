package l;

import com.alipay.sdk.m.p.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4CH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2211 implements InterfaceC23037 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19511 f7259;

    public C2211(InterfaceC19511 interfaceC19511) {
        this.f7259 = interfaceC19511;
    }

    @Override // l.InterfaceC23037
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 mo7384(C7855 c7855) {
        boolean z;
        C8743 c8743M21045 = c7855.m21045();
        C9449 c9449M22618 = c8743M21045.m22618();
        AbstractC2393 abstractC2393M22616 = c8743M21045.m22616();
        if (abstractC2393M22616 != null) {
            C13864 c13864Mo1980 = abstractC2393M22616.mo1980();
            if (c13864Mo1980 != null) {
                c9449M22618.m24283("Content-Type", c13864Mo1980.toString());
            }
            long jMo1976 = abstractC2393M22616.mo1976();
            if (jMo1976 != -1) {
                c9449M22618.m24283("Content-Length", Long.toString(jMo1976));
                c9449M22618.m24275("Transfer-Encoding");
            } else {
                c9449M22618.m24283("Transfer-Encoding", "chunked");
                c9449M22618.m24275("Content-Length");
            }
        }
        if (c8743M21045.m22615("Host") == null) {
            c9449M22618.m24283("Host", C20032.m46172(c8743M21045.m22622(), false));
        }
        if (c8743M21045.m22615("Connection") == null) {
            c9449M22618.m24283("Connection", "Keep-Alive");
        }
        if (c8743M21045.m22615("Accept-Encoding") == null && c8743M21045.m22615("Range") == null) {
            c9449M22618.m24283("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        InterfaceC19511 interfaceC19511 = this.f7259;
        interfaceC19511.mo43455();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C3988 c3988 = (C3988) list.get(i);
                sb.append(c3988.m12035());
                sb.append(a.h);
                sb.append(c3988.m12036());
            }
            c9449M22618.m24283("Cookie", sb.toString());
        }
        if (c8743M21045.m22615("User-Agent") == null) {
            c9449M22618.m24283("User-Agent", "okhttp/3.12.13");
        }
        C18621 c18621M21036 = c7855.m21036(c9449M22618.m24274());
        C11749 c11749M22622 = c8743M21045.m22622();
        C10338 c10338M43180 = c18621M21036.m43180();
        int i2 = C0799.f2925;
        if (interfaceC19511 != InterfaceC19511.f63052) {
            C3988.m12034(c11749M22622, c10338M43180).isEmpty();
        }
        C3804 c3804M43172 = c18621M21036.m43172();
        c3804M43172.m11479(c8743M21045);
        if (z && "gzip".equalsIgnoreCase(c18621M21036.m43169("Content-Encoding")) && C0799.m3019(c18621M21036)) {
            C1980 c1980 = new C1980(c18621M21036.m43170().mo1616());
            C12454 c12454M26138 = c18621M21036.m43180().m26138();
            c12454M26138.m30617("Content-Encoding");
            c12454M26138.m30617("Content-Length");
            c3804M43172.m11480(c12454M26138.m30612());
            c3804M43172.m11478(new C14910(c18621M21036.m43169("Content-Type"), -1L, C23852.m52567(c1980)));
        }
        return c3804M43172.m11474();
    }
}
