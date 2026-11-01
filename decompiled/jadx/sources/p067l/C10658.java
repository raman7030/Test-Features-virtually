package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public class C10658 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4623 f29477;

    /* JADX INFO: renamed from: ۙ */
    public C15823 f29478;

    /* JADX INFO: renamed from: ᩶ */
    public C15823 f29479;

    /* JADX INFO: renamed from: ᩸ */
    public C15823 f29480;

    /* JADX INFO: renamed from: ᩹ */
    public int f29481 = 0;

    public C10658(C4623 c4623) {
        this.f29477 = c4623;
        this.f29479 = c4623.f10362;
    }

    public final boolean hasNext() {
        return this.f29479 != null;
    }

    public final boolean hasPrevious() {
        return this.f29478 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo24511() {
        this.f29479 = this.f29479.m35908();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15823 m24509() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C15823 c15823 = this.f29479;
        this.f29478 = c15823;
        this.f29480 = c15823;
        this.f29481++;
        mo24511();
        return this.f29480;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo24512() {
        this.f29478 = this.f29478.m35903();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15823 m24510() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C15823 c15823 = this.f29478;
        this.f29479 = c15823;
        this.f29480 = c15823;
        this.f29481--;
        mo24512();
        return this.f29480;
    }

    public final int nextIndex() {
        return this.f29481;
    }

    public final int previousIndex() {
        return this.f29481 - 1;
    }

    public final void remove() {
        C15823 c15823 = this.f29480;
        if (c15823 == null) {
            throw new IllegalStateException();
        }
        if (c15823 == this.f29478) {
            this.f29481--;
        }
        this.f29478 = c15823;
        this.f29479 = c15823;
        mo24512();
        mo24511();
        this.f29477.remove(this.f29480.f19896);
        this.f29480 = null;
    }

    public Object previous() {
        return m24510();
    }
}
