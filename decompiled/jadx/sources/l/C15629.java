package l;

import android.os.SystemClock;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ܺ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15629 implements LongSupplier {
    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        return SystemClock.uptimeMillis();
    }
}
