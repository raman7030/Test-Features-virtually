package p067l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N74D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225 implements InterfaceC18885 {

    /* JADX INFO: renamed from: ᩸ */
    public final C20486 f12269;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14612 f12270;

    public C5225(C14612 c14612, C20486 c20486) {
        this.f12270 = c14612;
        this.f12269 = c20486;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11227(Uri uri, C10099 c10099, InterfaceC19556 interfaceC19556) {
        this.f12269.mo11227(uri, c10099, new C15516(this, interfaceC19556));
    }

    @Override // p067l.InterfaceC18885
    public final void stop() {
        C14612 c14612 = this.f12270;
        try {
            this.f12269.stop();
        } finally {
            c14612.f41722.m46475();
        }
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final void mo11232(InterfaceC4133 interfaceC4133) {
        this.f12269.mo11232(interfaceC4133);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11228(InterfaceC4133 interfaceC4133) {
        this.f12269.mo11228(interfaceC4133);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final C14450 mo11230() {
        return this.f12269.mo11230();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final C7074 mo11225(Uri uri, boolean z) {
        C7074 c7074Mo11225 = this.f12269.mo11225(uri, z);
        C14612 c14612 = this.f12270;
        C16524 c16524 = c14612.f41723;
        if (c16524 != null) {
            c16524.m37494(c7074Mo11225);
        }
        c14612.f41722.m46476(uri, c7074Mo11225);
        return c7074Mo11225;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11223(C5225 c5225, InterfaceC19556 interfaceC19556, C7074 c7074) {
        C14612 c14612 = c5225.f12270;
        C16524 c16524 = c14612.f41723;
        if (c16524 != null) {
            c16524.m37494(c7074);
        }
        C20486 c20486 = c5225.f12269;
        C14450 c14450Mo11230 = c20486.mo11230();
        if (c14450Mo11230 != null) {
            for (C15120 c15120 : c14450Mo11230.f41287) {
                C7074 c7074Mo11225 = c20486.mo11225(c15120.f43174, false);
                C16524 c16525 = c14612.f41723;
                if (c16525 != null) {
                    c16525.m37494(c7074Mo11225);
                }
                c14612.f41722.m46476(c15120.f43174, c7074Mo11225);
            }
        }
        interfaceC19556.mo18800(c7074);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final long mo11224() {
        return this.f12269.mo11224();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11236(Uri uri) {
        return this.f12269.mo11236(uri);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11235() throws IOException {
        this.f12269.mo11235();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final void mo11231(Uri uri) throws IOException {
        this.f12269.mo11231(uri);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11229(Uri uri, long j) {
        return this.f12269.mo11229(uri, j);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ܽ */
    public final void mo11233(Uri uri) {
        this.f12269.mo11233(uri);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo11234() {
        return this.f12269.mo11234();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11226(Uri uri) {
        this.f12269.mo11226(uri);
    }
}
