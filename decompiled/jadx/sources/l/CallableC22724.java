package l;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩺ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC22724 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f73418;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14544 f73419;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f73420;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f73421;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19357 f73422;

    public /* synthetic */ CallableC22724(AtomicBoolean atomicBoolean, InterfaceC14544 interfaceC14544, C19277 c19277, C19357 c19357, C7980 c7980) {
        this.f73418 = atomicBoolean;
        this.f73419 = interfaceC14544;
        this.f73420 = c19277;
        this.f73422 = c19357;
        this.f73421 = c7980;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        C19357 c19357 = this.f73422;
        C7980 c7980 = this.f73421;
        AtomicBoolean atomicBoolean = this.f73418;
        if (atomicBoolean.get() || this.f73419.mo1526()) {
            return null;
        }
        this.f73420.m44460(1);
        try {
            c19357.m44606((InterfaceC8566) c7980);
            return null;
        } catch (Throwable th) {
            atomicBoolean.set(true);
            throw new IOException(c7980.getType() + ":\n" + th.getMessage(), th);
        }
    }
}
