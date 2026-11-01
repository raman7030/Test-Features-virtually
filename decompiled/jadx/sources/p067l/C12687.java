package p067l;

import android.content.Context;
import bin.p000mt.plus.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12687 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C16213 f35587;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ Context f35588;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C18050 f35589;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C8838 f35590;

    public C12687(C18050 c18050, C8838 c8838, Context context, C16213 c16213) {
        this.f35589 = c18050;
        this.f35590 = c8838;
        this.f35588 = context;
        this.f35587 = c16213;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f35589.f53887 = this.f35590.f23986.m29464();
        Context context = this.f35588;
        if (context instanceof AbstractActivityC5549) {
            final C16213 c16213 = this.f35587;
            m22245((AbstractActivityC5549) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܰܰܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44404.f26234.m33952(new Runnable() { // from class: l.֫۟ܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c16213.m36970();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m29165() {
        if (this.f35587.m36971()) {
            return true;
        }
        C14853 c14853 = this.f26234;
        return (c14853 != null && c14853.m33960()) || !C19392.m44141(this.f35590);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.۟ܰܿ] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C18050 c18050 = this.f35589;
        if (c18050.f53887 != null) {
            C12862 c12862 = this.f35590.f23986;
            C15801 c15801 = c18050.f53887;
            File cacheDir = this.f35588.getCacheDir();
            ?? r4 = new InterfaceC18588() { // from class: l.۟ܰܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f26017.m29165();
                }
            };
            c12862.getClass();
            if (c15801.f45708 != c12862) {
                throw new IllegalArgumentException("Copy request belongs to another HexData");
            }
            c15801.m35864();
            try {
                C11598 c11598M41678 = c15801.f45704.m41678(c15801.f45705, c15801.length(), cacheDir, r4);
                c15801.m35865();
                c18050.f53888 = c11598M41678;
            } catch (Throwable th) {
                c15801.m35865();
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (m29165()) {
            return;
        }
        C18050 c18050 = this.f35589;
        if (c18050.f53888 == null || !this.f35590.f23986.m29460(c18050.f53887, c18050.f53888)) {
            return;
        }
        c18050.f53888 = null;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C8838 c8838 = this.f35590;
        C12862 c12862 = c8838.f23986;
        if ((exc instanceof C25008) || m29165()) {
            return;
        }
        boolean z = exc instanceof C23256;
        C18050 c18050 = this.f35589;
        if (z) {
            if (C19392.m44141(c8838)) {
                if (c18050.f53887 == null || c12862.m29459(c18050.f53887)) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                return;
            }
            return;
        }
        if ((c18050.f53887 == null || c12862.m29459(c18050.f53887)) && C19392.m44141(c8838)) {
            if (exc instanceof IOException) {
                c8838.m20428((IOException) exc);
            } else {
                c8838.m20428(new IOException("Unable to copy hex range", exc));
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f35589.m41090();
        m22249();
        this.f35587.close();
    }
}
