package l;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16239 implements InterfaceC1857 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19063 f49989;

    public C16239(C19063 c19063) {
        this.f49989 = c19063;
    }

    @Override // l.InterfaceC1857
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6171() {
        this.f49989.f60042.remove(this);
    }

    @Override // l.InterfaceC1857
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6170(Uri uri, C1885 c1885, boolean z) {
        C4246 c4246;
        C19063 c19063 = this.f49989;
        if (c19063.f60043 == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C12712 c12712 = c19063.f60039;
            String str = C3603.f11424;
            List list = c12712.f38258;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C4246 c4247 = (C4246) c19063.f60037.get(((C13417) list.get(i2)).f40105);
                if (c4247 != null && jElapsedRealtime < c4247.f13768) {
                    i++;
                }
            }
            C7613 c7613Mo27442 = c19063.f60041.mo27442(new C13962(c19063.f60039.f38258.size(), i), c1885);
            if (c7613Mo27442 != null && c7613Mo27442.f23556 == 2 && (c4246 = (C4246) c19063.f60037.get(uri)) != null) {
                C4246.m12770(c4246, c7613Mo27442.f23555);
            }
        }
        return false;
    }
}
