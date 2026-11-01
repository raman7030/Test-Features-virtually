package p067l;

import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۖ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4987 extends AbstractC1057 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ServiceC6328 f11360;

    public C4987(ServiceC6328 serviceC6328) {
        this.f11360 = serviceC6328;
    }

    /* JADX INFO: renamed from: ܿ */
    private C9010 m10554() {
        C9010 c9010M50371 = C22422.m50371();
        if (this.f11360.m14479(c9010M50371)) {
            return c9010M50371;
        }
        return null;
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ۧ */
    public final void mo10558() {
        C9010 c9010M10554 = m10554();
        if (c9010M10554 != null) {
            c9010M10554.m20872();
        }
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ֫ */
    public final void mo10555() {
        C9010 c9010M10554 = m10554();
        if (c9010M10554 != null) {
            c9010M10554.m20867();
        }
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ܽ */
    public final void mo10559() {
        C9010 c9010M10554 = m10554();
        if (c9010M10554 != null) {
            c9010M10554.m20871();
        }
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10560() {
        C9010 c9010M10554 = m10554();
        if (c9010M10554 != null) {
            c9010M10554.m20869();
        }
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ֫ */
    public final void mo10556(long j) {
        C9010 c9010M10554 = m10554();
        if (c9010M10554 != null) {
            c9010M10554.f24454 = true;
            c9010M10554.m20865((int) j);
        }
    }

    @Override // p067l.AbstractC1057
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10557(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            C9010 c9010M10554 = m10554();
            if (c9010M10554 == null) {
                return true;
            }
            c9010M10554.m20870();
            return true;
        }
        return super.mo10557(intent);
    }
}
