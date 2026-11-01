package p067l;

import bin.p000mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۫۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66VE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14028 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m31865(C13929 c13929) throws C16150 {
        m31862();
        boolean zFind = c13929.find();
        m31863(c13929);
        return zFind;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31864(C13929 c13929, int i) throws C16150 {
        m31862();
        boolean zFind = c13929.find(i);
        m31863(c13929);
        return zFind;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31863(C13929 c13929) throws C16150 {
        m31862();
        if (c13929.m31668()) {
            throw new C16150(R.string.MT_Protector);
        }
        if (c13929.m31678()) {
            throw new C16150(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31862() {
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search canceled");
        }
    }
}
