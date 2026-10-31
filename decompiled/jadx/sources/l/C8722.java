package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public class C8722 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f26552;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14156 f26553;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14156 f26554;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14156 f26555;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f26556 = 0;

    public C8722(C2372 c2372) {
        this.f26552 = c2372;
        this.f26554 = c2372.f7571;
    }

    public final boolean hasNext() {
        return this.f26554 != null;
    }

    public final boolean hasPrevious() {
        return this.f26553 != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo22542() {
        this.f26554 = this.f26554.m33775();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14156 m22540() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14156 c14156 = this.f26554;
        this.f26553 = c14156;
        this.f26555 = c14156;
        this.f26556++;
        mo22542();
        return this.f26555;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo22543() {
        this.f26553 = this.f26553.m33770();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14156 m22541() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C14156 c14156 = this.f26553;
        this.f26554 = c14156;
        this.f26555 = c14156;
        this.f26556--;
        mo22543();
        return this.f26555;
    }

    public final int nextIndex() {
        return this.f26556;
    }

    public final int previousIndex() {
        return this.f26556 - 1;
    }

    public final void remove() {
        C14156 c14156 = this.f26555;
        if (c14156 == null) {
            throw new IllegalStateException();
        }
        if (c14156 == this.f26553) {
            this.f26556--;
        }
        this.f26553 = c14156;
        this.f26554 = c14156;
        mo22543();
        mo22542();
        this.f26552.remove(this.f26555.f17057);
        this.f26555 = null;
    }

    public Object previous() {
        return m22541();
    }
}
