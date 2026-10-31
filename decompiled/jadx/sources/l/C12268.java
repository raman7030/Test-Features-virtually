package l;

import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۫۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66VE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12268 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m29803(C12164 c12164) throws C14501 {
        m29800();
        boolean zFind = c12164.find();
        m29801(c12164);
        return zFind;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29802(C12164 c12164, int i) throws C14501 {
        m29800();
        boolean zFind = c12164.find(i);
        m29801(c12164);
        return zFind;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29801(C12164 c12164) throws C14501 {
        m29800();
        if (c12164.m29603()) {
            throw new C14501(R.string.MT_Protector);
        }
        if (c12164.m29613()) {
            throw new C14501(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29800() {
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search canceled");
        }
    }
}
