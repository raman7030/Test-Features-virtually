package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SB */
/* JADX INFO: loaded from: classes.dex */
public class C24356 implements InterfaceC12878 {
    @Override // p067l.InterfaceC12878
    /* JADX INFO: renamed from: ֫ */
    public final int mo29502(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // p067l.InterfaceC12878
    /* JADX INFO: renamed from: ֫ */
    public final C9604 mo29504(C15638 c15638, C4160 c4160) {
        IOException iOException = c4160.f9178;
        if (!(iOException instanceof C24959)) {
            return null;
        }
        int i = ((C24959) iOException).f79694;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && c15638.f44749 - c15638.f44748 > 1) {
            return new C9604(2, 60000L);
        }
        return null;
    }

    @Override // p067l.InterfaceC12878
    /* JADX INFO: renamed from: ֫ */
    public long mo29503(C4160 c4160) {
        Throwable cause = c4160.f9178;
        if ((cause instanceof C10998) || (cause instanceof FileNotFoundException) || (cause instanceof C19595) || (cause instanceof C11537)) {
            return -9223372036854775807L;
        }
        int i = C23423.f74622;
        while (cause != null) {
            if ((cause instanceof C23423) && ((C23423) cause).f74623 == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c4160.f9177 - 1) * 1000, OpenAuthTask.Duplex);
    }
}
