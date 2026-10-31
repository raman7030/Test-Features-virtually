package l;

import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۖ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2755 extends AbstractC4327 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC4166 f8566;

    public C2755(ServiceC4166 serviceC4166) {
        this.f8566 = serviceC4166;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C6988 m8507() {
        C6988 c6988M48041 = C21100.m48041();
        if (this.f8566.m12605(c6988M48041)) {
            return c6988M48041;
        }
        return null;
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8511() {
        C6988 c6988M8507 = m8507();
        if (c6988M8507 != null) {
            c6988M8507.m18918();
        }
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8508() {
        C6988 c6988M8507 = m8507();
        if (c6988M8507 != null) {
            c6988M8507.m18913();
        }
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8512() {
        C6988 c6988M8507 = m8507();
        if (c6988M8507 != null) {
            c6988M8507.m18917();
        }
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo8513() {
        C6988 c6988M8507 = m8507();
        if (c6988M8507 != null) {
            c6988M8507.m18915();
        }
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8509(long j) {
        C6988 c6988M8507 = m8507();
        if (c6988M8507 != null) {
            c6988M8507.f21574 = true;
            c6988M8507.m18911((int) j);
        }
    }

    @Override // l.AbstractC4327
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8510(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            C6988 c6988M8507 = m8507();
            if (c6988M8507 == null) {
                return true;
            }
            c6988M8507.m18916();
            return true;
        }
        return super.mo8510(intent);
    }
}
