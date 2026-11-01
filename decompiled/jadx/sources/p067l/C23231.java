package p067l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩹֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23231 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C10307 c10307 = ((C15120) obj).f43173;
        int i = c10307.f28547;
        int i2 = c10307.f28523;
        return (i <= 0 || i2 <= 0) ? C14849.FOREVER_NS : ((long) i) * ((long) i2);
    }
}
