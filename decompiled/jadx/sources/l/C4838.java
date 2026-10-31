package l;

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
public final class C4838 implements InterfaceC20900 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3322 f15282;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f15283;

    public C4838(AbstractC3322 abstractC3322) {
        this.f15282 = abstractC3322;
        this.f15283 = "file:".concat(C14460.m34531(C14460.m34534().digest(((C4733) abstractC3322).f15019.mo23554().getBytes(StandardCharsets.UTF_8))));
    }

    @Override // l.InterfaceC20900
    public final C6788 identity() throws IOException {
        AbstractC3322 abstractC3322 = this.f15282;
        AbstractC15440 abstractC15440 = ((C4733) abstractC3322).f15019;
        if ((abstractC15440 instanceof C15587) || ((abstractC15440 instanceof C11293) && C16999.m39884(((C4733) abstractC3322).f15019.mo23554()))) {
            String strM29018 = abstractC15440 instanceof C11893 ? ((C11893) abstractC15440).m29018() : ((C4733) abstractC3322).f15019.mo23554();
            try {
                Map attributes = C17229.readAttributes(C6646.of(strM29018, new String[0]), "unix:dev,ino,size,mode,lastModifiedTime,ctime", new EnumC14406[0]);
                if ((((Number) attributes.get("mode")).intValue() & 61440) != 32768) {
                    return new C6788(this.f15283, "", -1L, false);
                }
                return new C6788(this.f15283, attributes.get("dev") + ":" + attributes.get("ino") + ":" + attributes.get("lastModifiedTime") + ":" + attributes.get("ctime"), ((Number) attributes.get("size")).longValue(), true);
            } catch (UnsupportedOperationException unused) {
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        StructStat structStatStat = Os.stat(strM29018);
                        if (!OsConstants.S_ISREG(structStatStat.st_mode)) {
                            return new C6788(this.f15283, "", -1L, false);
                        }
                        return new C6788(this.f15283, structStatStat.st_dev + ":" + structStatStat.st_ino + ":" + structStatStat.st_mtim.tv_sec + ":" + structStatStat.st_mtim.tv_nsec + ":" + structStatStat.st_ctim.tv_sec + ":" + structStatStat.st_ctim.tv_nsec, structStatStat.st_size, true);
                    } catch (ErrnoException e) {
                        throw new IOException("Cannot stat text source", e);
                    }
                }
            }
        }
        return new C6788(this.f15283, "", -1L, false);
    }

    @Override // l.InterfaceC20900
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo14081() {
        return ((C4733) this.f15282).f15019.m36518();
    }
}
