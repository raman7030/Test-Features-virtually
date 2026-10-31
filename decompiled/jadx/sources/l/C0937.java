package l;

import android.os.SystemClock;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.֨ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0937 implements LongSupplier {
    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        return SystemClock.elapsedRealtime();
    }
}
