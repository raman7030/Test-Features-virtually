package l;

import android.content.DialogInterface;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11444 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11026 f34216;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f34217;

    public C11444(C11026 c11026) {
        this.f34216 = c11026;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f34216.f33146, 300);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f34217 = this.f34216.f33153.m24454();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f34216.m27358(this.f34217);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f34216.f33146.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
