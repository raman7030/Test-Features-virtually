package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes.dex */
public class C24462 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C9710 f77423;

    /* JADX INFO: renamed from: ۙ */
    public C10381 f77424;

    /* JADX INFO: renamed from: ᩶ */
    public C10381 f77425;

    /* JADX INFO: renamed from: ᩸ */
    public C10381 f77426;

    /* JADX INFO: renamed from: ᩹ */
    public int f77427 = 0;

    public C24462(C9710 c9710) {
        this.f77423 = c9710;
        this.f77425 = c9710.f26809;
    }

    public final boolean hasNext() {
        return this.f77425 != null;
    }

    public final boolean hasPrevious() {
        return this.f77424 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo33022() {
        this.f77425 = this.f77425.m24074();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10381 m53962() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C10381 c10381 = this.f77425;
        this.f77424 = c10381;
        this.f77426 = c10381;
        this.f77427++;
        mo33022();
        return this.f77426;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo33023() {
        this.f77424 = this.f77424.m24070();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10381 m53963() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C10381 c10381 = this.f77424;
        this.f77425 = c10381;
        this.f77426 = c10381;
        this.f77427--;
        mo33023();
        return this.f77426;
    }

    public final int nextIndex() {
        return this.f77427;
    }

    public final int previousIndex() {
        return this.f77427 - 1;
    }

    public final void remove() {
        C10381 c10381 = this.f77426;
        if (c10381 == null) {
            throw new IllegalStateException();
        }
        if (c10381 == this.f77424) {
            this.f77427--;
        }
        this.f77424 = c10381;
        this.f77425 = c10381;
        mo33023();
        mo33022();
        this.f77423.remove(this.f77426.f19896);
        this.f77426 = null;
    }

    public Object next() {
        return m53962();
    }

    public Object previous() {
        return m53963();
    }
}
