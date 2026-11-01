package p067l;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۛ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8125 {

    /* JADX INFO: renamed from: ֫ */
    public final Executor f21411;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC12175 f21412;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC21537 f21413;

    /* JADX INFO: renamed from: ᩳ */
    public final C19646 f21414;

    public C8125(C19646 c19646, Executor executor) {
        C13045.m29867(executor, "executor");
        this.f21414 = c19646;
        this.f21411 = executor;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18825(InterfaceC21537 interfaceC21537) {
        this.f21413 = interfaceC21537;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18824(Activity activity) {
        InterfaceC12175 interfaceC12175 = this.f21412;
        if (interfaceC12175 != null) {
            ((C19532) interfaceC12175).mo28093((CancellationException) null);
        }
        this.f21412 = C15923.m36044(C23971.m53126(new C22904(this.f21411)), new C12149(this, activity, null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18823() {
        InterfaceC12175 interfaceC12175 = this.f21412;
        if (interfaceC12175 == null) {
            return;
        }
        ((C19532) interfaceC12175).mo28093((CancellationException) null);
    }
}
