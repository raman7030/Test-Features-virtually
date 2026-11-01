package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes.dex */
public class C23406 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C6642 f74553;

    /* JADX INFO: renamed from: ۙ */
    public C10666 f74554;

    /* JADX INFO: renamed from: ᩶ */
    public C10666 f74555;

    /* JADX INFO: renamed from: ᩸ */
    public C10666 f74556;

    /* JADX INFO: renamed from: ᩹ */
    public int f74557 = 0;

    public C23406(C6642 c6642) {
        this.f74553 = c6642;
        this.f74555 = c6642.f17133;
    }

    public final boolean hasNext() {
        return this.f74555 != null;
    }

    public final boolean hasPrevious() {
        return this.f74554 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo5723() {
        this.f74555 = this.f74555.m24541();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10666 m52074() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C10666 c10666 = this.f74555;
        this.f74554 = c10666;
        this.f74556 = c10666;
        this.f74557++;
        mo5723();
        return this.f74556;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo5724() {
        this.f74554 = this.f74554.m24536();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10666 m52075() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C10666 c10666 = this.f74554;
        this.f74555 = c10666;
        this.f74556 = c10666;
        this.f74557--;
        mo5724();
        return this.f74556;
    }

    public final int nextIndex() {
        return this.f74557;
    }

    public final int previousIndex() {
        return this.f74557 - 1;
    }

    public final void remove() {
        C10666 c10666 = this.f74556;
        if (c10666 == null) {
            throw new IllegalStateException();
        }
        if (c10666 == this.f74554) {
            this.f74557--;
        }
        this.f74554 = c10666;
        this.f74555 = c10666;
        mo5724();
        mo5723();
        this.f74553.mo15134(this.f74556.f56387);
        this.f74556 = null;
    }

    public Object next() {
        return m52074();
    }

    public Object previous() {
        return m52075();
    }
}
