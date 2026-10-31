package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes.dex */
public class C22136 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4497 f71831;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8731 f71832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8731 f71833;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8731 f71834;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f71835 = 0;

    public C22136(C4497 c4497) {
        this.f71831 = c4497;
        this.f71833 = c4497.f14306;
    }

    public final boolean hasNext() {
        return this.f71833 != null;
    }

    public final boolean hasPrevious() {
        return this.f71832 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo3420() {
        this.f71833 = this.f71833.m22571();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8731 m49736() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C8731 c8731 = this.f71833;
        this.f71832 = c8731;
        this.f71834 = c8731;
        this.f71835++;
        mo3420();
        return this.f71834;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo3421() {
        this.f71832 = this.f71832.m22566();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8731 m49737() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C8731 c8731 = this.f71832;
        this.f71833 = c8731;
        this.f71834 = c8731;
        this.f71835--;
        mo3421();
        return this.f71834;
    }

    public final int nextIndex() {
        return this.f71835;
    }

    public final int previousIndex() {
        return this.f71835 - 1;
    }

    public final void remove() {
        C8731 c8731 = this.f71834;
        if (c8731 == null) {
            throw new IllegalStateException();
        }
        if (c8731 == this.f71832) {
            this.f71835--;
        }
        this.f71832 = c8731;
        this.f71833 = c8731;
        mo3421();
        mo3420();
        this.f71831.mo13251(this.f71834.f53201);
        this.f71834 = null;
    }

    public Object next() {
        return m49736();
    }

    public Object previous() {
        return m49737();
    }
}
