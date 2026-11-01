package p067l;

import android.os.Handler;
import android.os.Trace;

/* JADX INFO: renamed from: l.۫᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14410 extends AbstractC16899 {
    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // p067l.AbstractC16899
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3681 mo33026(C10307 c10307) {
        Trace.beginSection("createFfmpegVideoDecoder");
        Trace.endSection();
        return null;
    }

    public C14410(long j, Handler handler, InterfaceC18027 interfaceC18027, int i) {
        super(j, handler, interfaceC18027, i);
    }

    @Override // p067l.AbstractC16899
    /* JADX INFO: renamed from: ֫ */
    public final C15100 mo33025(String str, C10307 c10307, C10307 c10308) {
        boolean zEquals = C12826.equals(c10307.f28528, c10308.f28528);
        return new C15100(str, c10307, c10308, zEquals ? 3 : 0, zEquals ? 0 : 8);
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        return C12832.m29410(0, 0, 0, 0);
    }
}
