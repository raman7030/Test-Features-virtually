package l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC22980 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f73996;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73997;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11692 f73998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73999;

    public CallableC22980(String str, Context context, C11692 c11692, int i) {
        this.f73997 = str;
        this.f73996 = context;
        this.f73998 = c11692;
        this.f73999 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C16569.m39076(this.f73997, this.f73996, this.f73998, this.f73999);
    }
}
