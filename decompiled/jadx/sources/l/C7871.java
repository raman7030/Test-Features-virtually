package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7871 extends AbstractC3907 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21278 f24413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7871(C21278 c21278, int i) {
        super(i);
        this.f24413 = c21278;
    }

    @Override // l.AbstractC2496
    /* JADX INFO: renamed from: ۧ */
    public final char mo7995(int i) {
        C21278 c21278 = this.f24413;
        return c21278.f68628.f70388[c21278.f12619 + i];
    }

    @Override // l.AbstractC3907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8109(char c, int i) {
        this.f24413.mo3752(c, i);
    }

    @Override // l.AbstractC3907
    /* JADX INFO: renamed from: ۧ */
    public final void mo8110(char c, int i) {
        this.f24413.mo3747(c, i);
    }

    @Override // l.AbstractC2496
    /* JADX INFO: renamed from: ܽ */
    public final void mo7996(int i) {
        this.f24413.mo3746(i);
    }

    @Override // l.AbstractC2496
    /* JADX INFO: renamed from: ֫ */
    public final int mo7994() {
        C21278 c21278 = this.f24413;
        return c21278.f12618 - c21278.f12619;
    }

    @Override // l.AbstractC2496, l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C21278 c21278 = this.f24413;
        char[] cArr = c21278.f68628.f70388;
        int i = c21278.f12619;
        int i2 = this.f7952;
        this.f7952 = i2 + 1;
        this.f7951 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC3907, l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo7697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C21278 c21278 = this.f24413;
        char[] cArr = c21278.f68628.f70388;
        int i = c21278.f12619;
        int i2 = this.f7952 - 1;
        this.f7952 = i2;
        this.f7951 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC9621, l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C21278 c21278 = this.f24413;
        char[] cArr = c21278.f68628.f70388;
        int i = c21278.f12618 - c21278.f12619;
        while (true) {
            int i2 = this.f7952;
            if (i2 >= i) {
                return;
            }
            int i3 = c21278.f12619;
            this.f7952 = i2 + 1;
            this.f7951 = i2;
            interfaceC23662.mo18328(cArr[i3 + i2]);
        }
    }
}
