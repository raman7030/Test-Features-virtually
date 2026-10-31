package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes3.dex */
public final class C11977 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC4921 f35845;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f35846;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Error f35847;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C19697 f35848;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile RuntimeException f35849;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile IOException f35850;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29247() {
        this.f35846 = true;
        if (this.f35848 != null) {
            this.f35848.m45351();
            return;
        }
        if (this.f35845 != null) {
            C0349.m1793(this.f35845);
            this.f35845 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29248(IOException iOException) {
        if (!this.f35846) {
            this.f35850 = iOException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29249(Error error) {
        if (!this.f35846) {
            this.f35847 = error;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29250(RuntimeException runtimeException) {
        if (!this.f35846) {
            this.f35849 = runtimeException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29251(C19697 c19697) {
        this.f35845 = null;
        if (this.f35846) {
            c19697.m45351();
        } else {
            this.f35848 = c19697;
        }
    }
}
