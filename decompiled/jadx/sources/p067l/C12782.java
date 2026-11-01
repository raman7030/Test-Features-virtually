package p067l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۧۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12782 {

    /* JADX INFO: renamed from: ۧ */
    public static final AtomicLong f35982 = new AtomicLong();

    /* JADX INFO: renamed from: ֫ */
    public final long f35983;

    /* JADX INFO: renamed from: ֫ */
    public static long m29334() {
        return f35982.getAndIncrement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12782(C5318 c5318) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = c5318.f12514;
    }

    public C12782(long j, Map map) {
        this.f35983 = j;
    }
}
