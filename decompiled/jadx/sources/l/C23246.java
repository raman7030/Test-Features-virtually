package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes.dex */
public class C23246 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7724 f74680;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8430 f74681;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8430 f74682;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8430 f74683;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74684 = 0;

    public C23246(C7724 c7724) {
        this.f74680 = c7724;
        this.f74682 = c7724.f23896;
    }

    public final boolean hasNext() {
        return this.f74682 != null;
    }

    public final boolean hasPrevious() {
        return this.f74681 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo30944() {
        this.f74682 = this.f74682.m22104();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8430 m51565() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C8430 c8430 = this.f74682;
        this.f74681 = c8430;
        this.f74683 = c8430;
        this.f74684++;
        mo30944();
        return this.f74683;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo30945() {
        this.f74681 = this.f74681.m22100();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8430 m51566() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C8430 c8430 = this.f74681;
        this.f74682 = c8430;
        this.f74683 = c8430;
        this.f74684--;
        mo30945();
        return this.f74683;
    }

    public final int nextIndex() {
        return this.f74684;
    }

    public final int previousIndex() {
        return this.f74684 - 1;
    }

    public final void remove() {
        C8430 c8430 = this.f74683;
        if (c8430 == null) {
            throw new IllegalStateException();
        }
        if (c8430 == this.f74681) {
            this.f74684--;
        }
        this.f74681 = c8430;
        this.f74682 = c8430;
        mo30945();
        mo30944();
        this.f74680.remove(this.f74683.f17057);
        this.f74683 = null;
    }

    public Object next() {
        return m51565();
    }

    public Object previous() {
        return m51566();
    }
}
