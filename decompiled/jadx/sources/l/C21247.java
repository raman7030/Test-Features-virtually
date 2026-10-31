package l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩸֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21247 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C8353 c8353 = ((C13417) obj).f40104;
        int i = c8353.f25623;
        if (i > 0) {
            return i;
        }
        int i2 = c8353.f25615;
        return i2 > 0 ? i2 : C13132.FOREVER_NS;
    }
}
