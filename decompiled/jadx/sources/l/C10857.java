package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10857 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14567 f32611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f32612;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16500 f32613;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f32614;

    public C10857(C16500 c16500, C6807 c6807, Context context, C14567 c14567) {
        this.f32613 = c16500;
        this.f32614 = c6807;
        this.f32612 = context;
        this.f32611 = c14567;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f32613.f50710 = this.f32614.f21109.m27402();
        Context context = this.f32612;
        if (context instanceof AbstractActivityC3346) {
            final C14567 c14567 = this.f32611;
            m20269((AbstractActivityC3346) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܰܰܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41325.f23322.m31860(new Runnable() { // from class: l.֫۟ܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c14567.m34821();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m27120() {
        if (this.f32611.m34822()) {
            return true;
        }
        C13136 c13136 = this.f23322;
        return (c13136 != null && c13136.m31868()) || !C17912.m41893(this.f32614);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.۟ܰܿ] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16500 c16500 = this.f32613;
        if (c16500.f50710 != null) {
            C11041 c11041 = this.f32614.f21109;
            C14133 c14133 = c16500.f50710;
            File cacheDir = this.f32612.getCacheDir();
            ?? r4 = new InterfaceC17066() { // from class: l.۟ܰܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f23105.m27120();
                }
            };
            c11041.getClass();
            if (c14133.f42622 != c11041) {
                throw new IllegalArgumentException("Copy request belongs to another HexData");
            }
            c14133.m33732();
            try {
                C9711 c9711M39442 = c14133.f42618.m39442(c14133.f42619, c14133.length(), cacheDir, r4);
                c14133.m33733();
                c16500.f50711 = c9711M39442;
            } catch (Throwable th) {
                c14133.m33733();
                throw th;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (m27120()) {
            return;
        }
        C16500 c16500 = this.f32613;
        if (c16500.f50711 == null || !this.f32614.f21109.m27398(c16500.f50710, c16500.f50711)) {
            return;
        }
        c16500.f50711 = null;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C6807 c6807 = this.f32614;
        C11041 c11041 = c6807.f21109;
        if ((exc instanceof C23821) || m27120()) {
            return;
        }
        boolean z = exc instanceof C21978;
        C16500 c16500 = this.f32613;
        if (z) {
            if (C17912.m41893(c6807)) {
                if (c16500.f50710 == null || c11041.m27397(c16500.f50710)) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                return;
            }
            return;
        }
        if ((c16500.f50710 == null || c11041.m27397(c16500.f50710)) && C17912.m41893(c6807)) {
            if (exc instanceof IOException) {
                c6807.m18479((IOException) exc);
            } else {
                c6807.m18479(new IOException("Unable to copy hex range", exc));
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f32613.m38864();
        m20273();
        this.f32611.close();
    }
}
