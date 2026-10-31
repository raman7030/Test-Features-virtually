package l;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.֡᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes2.dex */
public final class C0712 extends AbstractC21735 {
    @Override // l.AbstractC21735
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Intent mo2798(Context context, Object obj) {
        if (obj instanceof Intent) {
            return (Intent) obj;
        }
        if (obj instanceof Class) {
            return new Intent(context, (Class<?>) obj);
        }
        throw new RuntimeException(String.valueOf(obj));
    }

    @Override // l.AbstractC21735
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2799(Intent intent, int i) {
        return new C1418(intent, i);
    }
}
