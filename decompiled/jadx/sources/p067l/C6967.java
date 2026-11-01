package p067l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6967 implements InterfaceC22232 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC5526 f18115;

    /* JADX INFO: renamed from: ᩹ */
    public final String f18116;

    public C6967(AbstractC5526 abstractC5526) {
        this.f18115 = abstractC5526;
        this.f18116 = "file:".concat(C16111.m36665(C16111.m36668().digest(((C6867) abstractC5526).f17850.mo25505().getBytes(StandardCharsets.UTF_8))));
    }

    @Override // p067l.InterfaceC22232
    public final C8820 identity() throws IOException {
        AbstractC5526 abstractC5526 = this.f18115;
        AbstractC17043 abstractC17043 = ((C6867) abstractC5526).f17850;
        if ((abstractC17043 instanceof C17182) || ((abstractC17043 instanceof C13102) && C18524.m42127(((C6867) abstractC5526).f17850.mo25505()))) {
            String strM31070 = abstractC17043 instanceof C13672 ? ((C13672) abstractC17043).m31070() : ((C6867) abstractC5526).f17850.mo25505();
            try {
                Map attributes = C18743.readAttributes(C8685.m20115of(strM31070, new String[0]), "unix:dev,ino,size,mode,lastModifiedTime,ctime", new EnumC16060[0]);
                if ((((Number) attributes.get("mode")).intValue() & 61440) != 32768) {
                    return new C8820(this.f18116, "", -1L, false);
                }
                return new C8820(this.f18116, attributes.get("dev") + ":" + attributes.get("ino") + ":" + attributes.get("lastModifiedTime") + ":" + attributes.get("ctime"), ((Number) attributes.get("size")).longValue(), true);
            } catch (UnsupportedOperationException unused) {
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        StructStat structStatStat = Os.stat(strM31070);
                        if (!OsConstants.S_ISREG(structStatStat.st_mode)) {
                            return new C8820(this.f18116, "", -1L, false);
                        }
                        return new C8820(this.f18116, structStatStat.st_dev + ":" + structStatStat.st_ino + ":" + structStatStat.st_mtim.tv_sec + ":" + structStatStat.st_mtim.tv_nsec + ":" + structStatStat.st_ctim.tv_sec + ":" + structStatStat.st_ctim.tv_nsec, structStatStat.st_size, true);
                    } catch (ErrnoException e) {
                        throw new IOException("Cannot stat text source", e);
                    }
                }
            }
        }
        return new C8820(this.f18116, "", -1L, false);
    }

    @Override // p067l.InterfaceC22232
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo15961() {
        return ((C6867) this.f18115).f17850.m38676();
    }
}
