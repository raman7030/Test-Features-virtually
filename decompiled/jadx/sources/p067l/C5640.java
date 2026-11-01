package p067l;

import android.text.TextUtils;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۗ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5640 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C9663 c9663 = (C9663) obj;
        if (TextUtils.isEmpty(c9663.f26622)) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < c9663.f26622.length(); i2++) {
            if (c9663.f26622.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }
}
