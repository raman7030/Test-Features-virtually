package p067l;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17802 implements InterfaceC4133 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20486 f53158;

    public C17802(C20486 c20486) {
        this.f53158 = c20486;
    }

    @Override // p067l.InterfaceC4133
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8373() {
        this.f53158.f63276.remove(this);
    }

    @Override // p067l.InterfaceC4133
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8372(Uri uri, C4160 c4160, boolean z) {
        C6404 c6404;
        C20486 c20486 = this.f53158;
        if (c20486.f63277 == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C14450 c14450 = c20486.f63273;
            String str = C5792.f14228;
            List list = c14450.f41287;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C6404 c6405 = (C6404) c20486.f63271.get(((C15120) list.get(i2)).f43174);
                if (c6405 != null && jElapsedRealtime < c6405.f16585) {
                    i++;
                }
            }
            C9604 c9604Mo29504 = c20486.f63275.mo29504(new C15638(c20486.f63273.f41287.size(), i), c4160);
            if (c9604Mo29504 != null && c9604Mo29504.f26469 == 2 && (c6404 = (C6404) c20486.f63271.get(uri)) != null) {
                C6404.m14650(c6404, c9604Mo29504.f26468);
            }
        }
        return false;
    }
}
