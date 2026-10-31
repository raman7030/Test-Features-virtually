package l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC7458 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f22883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f22884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11692 f22885;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22886;

    public CallableC7458(String str, Context context, C11692 c11692, int i) {
        this.f22884 = str;
        this.f22883 = context;
        this.f22885 = c11692;
        this.f22886 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return C16569.m39076(this.f22884, this.f22883, this.f22885, this.f22886);
        } catch (Throwable unused) {
            return new C10926(-3);
        }
    }
}
