package p067l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬֫ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC1477 extends AbstractBinderC1267 {

    /* JADX INFO: renamed from: ܿ */
    public final AtomicReference f41455;

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩶ */
    public final void mo9462() {
    }

    public BinderC1477(C1442 c1442) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f41455 = new AtomicReference(c1442);
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m33186() {
        this.f41455.set(null);
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9432(String str, Bundle bundle, C1735 c1735) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9439(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9437(InterfaceC1862 interfaceC1862) {
        C1442 c1442 = (C1442) this.f41455.get();
        if (c1442 == null) {
            return;
        }
        c1442.f39158.register(interfaceC1862, new C22636("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c1442.f39162) {
        }
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9450(InterfaceC1862 interfaceC1862) {
        C1442 c1442 = (C1442) this.f41455.get();
        if (c1442 == null) {
            return;
        }
        c1442.f39158.unregister(interfaceC1862);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c1442.f39162) {
        }
    }

    @Override // p067l.InterfaceC0952
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܺ */
    public final Bundle mo9453() {
        ((C1442) this.f41455.get()).getClass();
        return null;
    }

    @Override // p067l.InterfaceC0952
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩷ */
    public final PendingIntent mo9463() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩻ */
    public final long mo9466() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۗ */
    public final C1875 mo9440() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9428(int i, int i2) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9446(int i, int i2) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9444() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܽ */
    public final void mo9455(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܿ */
    public final void mo9457(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9430(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܿ */
    public final void mo9456() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9448(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9459(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9447(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9429(long j) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    public final void pause() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    public final void stop() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    public final void next() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    public final void previous() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩹ */
    public final void mo9465() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܳ */
    public final void mo9451() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9435(C1687 c1687) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9436(C1687 c1687, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9426(float f) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9438(boolean z) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9427(int i) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܽ */
    public final void mo9454(int i) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9431(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩸ */
    public final C1372 mo9464() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩳ */
    public final C1805 mo9458() {
        long j;
        C1442 c1442 = (C1442) this.f41455.get();
        if (c1442 == null) {
            return null;
        }
        C1805 c1805 = c1442.f39159;
        C1372 c1372 = c1442.f39161;
        if (c1805 == null) {
            return c1805;
        }
        long j2 = c1805.f65415;
        long jM28826 = -1;
        if (j2 == -1) {
            return c1805;
        }
        int i = c1805.f65416;
        if (i != 3 && i != 4 && i != 5) {
            return c1805;
        }
        long j3 = c1805.f65419;
        if (j3 <= 0) {
            return c1805;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (c1805.f65414 * (jElapsedRealtime - j3))) + j2;
        if (c1372 != null && c1372.m28825()) {
            jM28826 = c1372.m28826();
        }
        if (jM28826 < 0 || j4 <= jM28826) {
            j = j4 < 0 ? 0L : j4;
        } else {
            j = jM28826;
        }
        C0965 c0965 = new C0965(c1805);
        c0965.m10004(c1805.f65416, j, c1805.f65414, jElapsedRealtime);
        return c0965.m10003();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9449(C1509 c1509) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9434(C1509 c1509, int i) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9433(C1509 c1509) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۧ */
    public final void mo9445(int i) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ܶ */
    public final CharSequence mo9452() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֡ */
    public final Bundle mo9425() {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۢ */
    public final void mo9443() {
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩵ */
    public final void mo9461() {
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۜ */
    public final int mo9441() {
        return ((C1442) this.f41455.get()) != null ? 0 : -1;
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9460() {
        return ((C1442) this.f41455.get()) != null ? 0 : -1;
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo9442() {
        throw new AssertionError();
    }
}
