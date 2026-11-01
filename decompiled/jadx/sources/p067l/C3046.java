package p067l;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.֡᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3046 extends AbstractC1920 {
    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Intent mo5143(Context context, Object obj) {
        if (obj instanceof Intent) {
            return (Intent) obj;
        }
        if (obj instanceof Class) {
            return new Intent(context, (Class<?>) obj);
        }
        throw new RuntimeException(String.valueOf(obj));
    }

    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5144(Intent intent, int i) {
        return new C3717(intent, i);
    }
}
