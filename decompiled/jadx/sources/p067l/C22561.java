package p067l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩸֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22561 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C10307 c10307 = ((C15120) obj).f43173;
        int i = c10307.f28537;
        if (i > 0) {
            return i;
        }
        int i2 = c10307.f28529;
        return i2 > 0 ? i2 : C14849.FOREVER_NS;
    }
}
