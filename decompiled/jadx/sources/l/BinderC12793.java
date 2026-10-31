package l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC12793 extends AbstractBinderC8560 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f38413;

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7379() {
    }

    public BinderC12793(C12088 c12088) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f38413 = new AtomicReference(c12088);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m31102() {
        this.f38413.set(null);
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7349(String str, Bundle bundle, C18001 c18001) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7356(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7354(InterfaceC20555 interfaceC20555) {
        C12088 c12088 = (C12088) this.f38413.get();
        if (c12088 == null) {
            return;
        }
        c12088.f36147.register(interfaceC20555, new C21326("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c12088.f36151) {
        }
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7367(InterfaceC20555 interfaceC20555) {
        C12088 c12088 = (C12088) this.f38413.get();
        if (c12088 == null) {
            return;
        }
        c12088.f36147.unregister(interfaceC20555);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c12088.f36151) {
        }
    }

    @Override // l.InterfaceC2210
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܺ */
    public final Bundle mo7370() {
        ((C12088) this.f38413.get()).getClass();
        return null;
    }

    @Override // l.InterfaceC2210
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩷ */
    public final PendingIntent mo7380() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩻ */
    public final long mo7383() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۗ */
    public final C20824 mo7357() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7345(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7363(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7361() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܽ */
    public final void mo7372(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܿ */
    public final void mo7374(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7347(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܿ */
    public final void mo7373() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7365(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7376(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7364(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7346(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    public final void pause() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    public final void stop() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    public final void next() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    public final void previous() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7382() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܳ */
    public final void mo7368() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7352(C17026 c17026) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7353(C17026 c17026, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7343(float f) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7355(boolean z) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7344(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܽ */
    public final void mo7371(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7348(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩸ */
    public final C10677 mo7381() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩳ */
    public final C19413 mo7375() {
        long j;
        C12088 c12088 = (C12088) this.f38413.get();
        if (c12088 == null) {
            return null;
        }
        C19413 c19413 = c12088.f36148;
        C10677 c10677 = c12088.f36150;
        if (c19413 == null) {
            return c19413;
        }
        long j2 = c19413.f62802;
        long jM26787 = -1;
        if (j2 == -1) {
            return c19413;
        }
        int i = c19413.f62803;
        if (i != 3 && i != 4 && i != 5) {
            return c19413;
        }
        long j3 = c19413.f62806;
        if (j3 <= 0) {
            return c19413;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (c19413.f62801 * (jElapsedRealtime - j3))) + j2;
        if (c10677 != null && c10677.m26786()) {
            jM26787 = c10677.m26787();
        }
        if (jM26787 < 0 || j4 <= jM26787) {
            j = j4 < 0 ? 0L : j4;
        } else {
            j = jM26787;
        }
        C2479 c2479 = new C2479(c19413);
        c2479.m7956(c19413.f62803, j, c19413.f62801, jElapsedRealtime);
        return c2479.m7955();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7366(C13455 c13455) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7351(C13455 c13455, int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7350(C13455 c13455) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۧ */
    public final void mo7362(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ܶ */
    public final CharSequence mo7369() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֡ */
    public final Bundle mo7342() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۢ */
    public final void mo7360() {
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩵ */
    public final void mo7378() {
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۜ */
    public final int mo7358() {
        return ((C12088) this.f38413.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7377() {
        return ((C12088) this.f38413.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo7359() {
        throw new AssertionError();
    }
}
