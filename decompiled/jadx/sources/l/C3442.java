package l;

import android.text.TextUtils;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۗ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3442 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C7675 c7675 = (C7675) obj;
        if (TextUtils.isEmpty(c7675.f23709)) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < c7675.f23709.length(); i2++) {
            if (c7675.f23709.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }
}
