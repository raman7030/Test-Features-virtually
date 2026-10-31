package l;

import android.R;

/* JADX INFO: renamed from: l.᩻۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23552 extends AbstractC7508 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2386 f75611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5198 f75610 = new C17908(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5198 f75609 = new C17202(this);

    public C23552(C2386 c2386) {
        this.f75611 = c2386;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52011() {
        int itemCount;
        int i = R.id.accessibilityActionPageLeft;
        C2386 c2386 = this.f75611;
        C17648.m41337(R.id.accessibilityActionPageLeft, c2386);
        C17648.m41337(R.id.accessibilityActionPageRight, c2386);
        C17648.m41337(R.id.accessibilityActionPageUp, c2386);
        C17648.m41337(R.id.accessibilityActionPageDown, c2386);
        if (c2386.f7607.getAdapter() == null || (itemCount = c2386.f7607.getAdapter().getItemCount()) == 0 || !c2386.m7721()) {
            return;
        }
        int iM7724 = c2386.m7724();
        InterfaceC5198 interfaceC5198 = this.f75609;
        InterfaceC5198 interfaceC5199 = this.f75610;
        if (iM7724 == 0) {
            boolean z = c2386.f7606.getLayoutDirection() == 1;
            int i2 = z ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (z) {
                i = R.id.accessibilityActionPageRight;
            }
            if (c2386.f7611 < itemCount - 1) {
                C17648.m41308(c2386, new C13847(i2, (String) null), null, interfaceC5199);
            }
            if (c2386.f7611 > 0) {
                C17648.m41308(c2386, new C13847(i, (String) null), null, interfaceC5198);
                return;
            }
            return;
        }
        if (c2386.f7611 < itemCount - 1) {
            C17648.m41308(c2386, new C13847(R.id.accessibilityActionPageDown, (String) null), null, interfaceC5199);
        }
        if (c2386.f7611 > 0) {
            C17648.m41308(c2386, new C13847(R.id.accessibilityActionPageUp, (String) null), null, interfaceC5198);
        }
    }
}
