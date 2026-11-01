package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes3.dex */
public final class C13752 {

    /* JADX INFO: renamed from: ֫ */
    public volatile InterfaceC7046 f38855;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f38856;

    /* JADX INFO: renamed from: ܳ */
    public volatile Error f38857;

    /* JADX INFO: renamed from: ܽ */
    public volatile C21089 f38858;

    /* JADX INFO: renamed from: ܿ */
    public volatile RuntimeException f38859;

    /* JADX INFO: renamed from: ᩳ */
    public volatile IOException f38860;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31301() {
        this.f38856 = true;
        if (this.f38858 != null) {
            this.f38858.m47648();
            return;
        }
        if (this.f38855 != null) {
            C2700.m4192(this.f38855);
            this.f38855 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31302(IOException iOException) {
        if (!this.f38856) {
            this.f38860 = iOException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31303(Error error) {
        if (!this.f38856) {
            this.f38857 = error;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31304(RuntimeException runtimeException) {
        if (!this.f38856) {
            this.f38859 = runtimeException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31305(C21089 c21089) {
        this.f38855 = null;
        if (this.f38856) {
            c21089.m47648();
        } else {
            this.f38858 = c21089;
        }
    }
}
