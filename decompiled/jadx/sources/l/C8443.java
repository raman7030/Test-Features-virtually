package l;

import android.view.View;

/* JADX INFO: renamed from: l.۠᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8443 extends AbstractC9606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25842;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25843;

    public C8443(View view, View view2) {
        this.f25843 = view;
        this.f25842 = view2;
    }

    @Override // l.AbstractC9606
    public final void onScrolled(C13132 c13132, int i, int i2) {
        C4915.m14282((View) c13132, this.f25843, this.f25842);
    }

    @Override // l.AbstractC9606
    public final void onScrollStateChanged(C13132 c13132, int i) {
        C4915.m14282((View) c13132, this.f25843, this.f25842);
    }
}
