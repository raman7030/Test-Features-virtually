package p067l;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩺ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC23965 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AtomicBoolean f76141;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC16191 f76142;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C20689 f76143;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C9952 f76144;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C20765 f76145;

    public /* synthetic */ CallableC23965(AtomicBoolean atomicBoolean, InterfaceC16191 interfaceC16191, C20689 c20689, C20765 c20765, C9952 c9952) {
        this.f76141 = atomicBoolean;
        this.f76142 = interfaceC16191;
        this.f76143 = c20689;
        this.f76145 = c20765;
        this.f76144 = c9952;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        C20765 c20765 = this.f76145;
        C9952 c9952 = this.f76144;
        AtomicBoolean atomicBoolean = this.f76141;
        if (atomicBoolean.get() || this.f76142.mo3924()) {
            return null;
        }
        this.f76143.m46754(1);
        try {
            c20765.m46900((InterfaceC10509) c9952);
            return null;
        } catch (Throwable th) {
            atomicBoolean.set(true);
            throw new IOException(c9952.getType() + ":\n" + th.getMessage(), th);
        }
    }
}
