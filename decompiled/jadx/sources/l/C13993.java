package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13993 extends AbstractC2021 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11194 f41717;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41718 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23166 f41719;

    public C13993(C11194 c11194) {
        this.f41717 = c11194;
    }

    @Override // l.AbstractC2021
    /* JADX INFO: renamed from: ֫ */
    public final void mo6575(C23166 c23166) {
        C23166 c23167 = this.f41719;
        if (c23166 == c23167) {
            C23166 c23168 = c23167.f74452;
            this.f41719 = c23168;
            this.f41718 = c23168 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41718) {
            return this.f41717.f33600 != null;
        }
        C23166 c23166 = this.f41719;
        return (c23166 == null || c23166.f74454 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41718) {
            this.f41718 = false;
            this.f41719 = this.f41717.f33600;
        } else {
            C23166 c23166 = this.f41719;
            this.f41719 = c23166 != null ? c23166.f74454 : null;
        }
        return this.f41719;
    }
}
