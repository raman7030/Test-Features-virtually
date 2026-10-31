package l;

/* JADX INFO: renamed from: l.ۜۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17975 f20768;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f20769;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f20770;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f20771;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f20772;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9302 f20773;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23097 f20774;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f20775;

    public C6686(InterfaceC20445 interfaceC20445, C23097 c23097, C9302 c9302, C17975 c17975, int i, int i2) {
        C11003.requireNonNull(interfaceC20445, "textOwner");
        this.f20769 = interfaceC20445;
        this.f20774 = c23097;
        C11003.requireNonNull(c9302, "store");
        this.f20773 = c9302;
        C11003.requireNonNull(c17975, "contexts");
        this.f20768 = c17975;
        this.f20775 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        this.f20771 = length;
        C11003.checkFromToIndex(i, i2, length);
        if (c9302.m23880() != length || c17975.m42010() != i2 - i || !c17975.m42007(c17975.m42010(), c23097.f74313)) {
            throw new IllegalArgumentException("Syntax consumer context differs from display");
        }
        this.f20772 = i;
        this.f20770 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6686 m18220(InterfaceC7785 interfaceC7785, C23097 c23097, C9302 c9302, C17975 c17975) {
        return new C6686(interfaceC7785, c23097, c9302, c17975, 0, interfaceC7785.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6686 m18221(InterfaceC7785 interfaceC7785, C23097 c23097, C9302 c9302, C17975 c17975, int i, int i2) {
        return new C6686(interfaceC7785, c23097, c9302, c17975, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18229(InterfaceC7785 interfaceC7785, C23097 c23097) {
        return this.f20769 == interfaceC7785 && this.f20774 == c23097 && this.f20775 == interfaceC7785.mo26548() && this.f20771 == interfaceC7785.length();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18230() {
        return this.f20771;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18232(int i, int i2) {
        int i3 = this.f20771;
        C11003.checkFromToIndex(i, i2, i3);
        int i4 = this.f20770;
        int i5 = this.f20772;
        if (i < i2) {
            return i5 <= i && i2 <= i4;
        }
        if (i3 == 0) {
            return i5 == 0 && i4 == 0;
        }
        if (i < i3) {
            return i5 <= i && i < i4;
        }
        return i4 == i3 && i5 < i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18226(int i) {
        C11003.checkIndex(i, this.f20771);
        m18225(i, i + 1);
        return this.f20768.m42005(i - this.f20772);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18227(int i, int i2) {
        m18225(i, i2);
        int i3 = this.f20772;
        C17975 c17975 = this.f20768;
        if (i == i2) {
            int i4 = this.f20771;
            if (i4 == 0) {
                return 0;
            }
            if (i >= i4) {
                i--;
            }
            return c17975.m42005(i - i3);
        }
        return c17975.m42006(i - i3, i2 - i3);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15068 m18235(int i, int i2) {
        return this.f20768.m42015(m18227(i, i2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15068 m18234(int i) {
        return this.f20768.m42015(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m18236(int i) {
        return this.f20768.m42012(i) + this.f20772;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m18237(int i) {
        return this.f20768.m42013(i) + this.f20772;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18231(int i) {
        return this.f20768.m42011(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m18233(int i) {
        C11003.checkIndex(i, this.f20771);
        m18225(i, i + 1);
        return this.f20773.m23883(i).m49205();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m18228() {
        return this.f20773;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m18225(int i, int i2) {
        if (!m18232(i, i2)) {
            throw new IllegalStateException("Syntax context is unknown outside coverage");
        }
    }
}
