package p067l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۙܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X95L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6824 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f17707 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public volatile Logger f17708;

    /* JADX INFO: renamed from: ܽ */
    public final String f17709;

    public C6824(Class cls) {
        this.f17709 = cls.getName();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Logger m15619() {
        Logger logger = this.f17708;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f17707) {
            Logger logger2 = this.f17708;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f17709);
            this.f17708 = logger3;
            return logger3;
        }
    }
}
