package p067l;

/* JADX INFO: renamed from: l.ۗۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BHQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348 {

    /* JADX INFO: renamed from: ֫ */
    public final int f12610;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12548 f12611;

    /* JADX INFO: renamed from: ܳ */
    public final C9566 f12612;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f12613;

    /* JADX INFO: renamed from: ܿ */
    public final int f12614;

    /* JADX INFO: renamed from: ᩳ */
    public final String f12615;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12548 f12616;

    public C5348(int i, C9566 c9566, InterfaceC12548 interfaceC12548, InterfaceC12548 interfaceC12549, int i2, boolean z, String str) {
        if (c9566 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC12549 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(C20778.m46922(i2, "invalid branchingness: "));
        }
        if (interfaceC12549.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f12614 = i;
        this.f12612 = c9566;
        this.f12616 = interfaceC12548;
        this.f12611 = interfaceC12549;
        this.f12610 = i2;
        this.f12613 = z;
        this.f12615 = str;
    }

    public C5348(int i, C9566 c9566, InterfaceC12548 interfaceC12548, int i2, String str) {
        this(i, c9566, interfaceC12548, C15600.f44675, i2, false, str);
    }

    public C5348(int i, C9566 c9566, InterfaceC12548 interfaceC12548, String str) {
        this(i, c9566, interfaceC12548, C15600.f44675, 1, false, str);
    }

    public C5348(int i, C9566 c9566, InterfaceC12548 interfaceC12548, InterfaceC12548 interfaceC12549, String str) {
        this(i, c9566, interfaceC12548, interfaceC12549, 6, false, str);
    }

    public C5348(int i, C15600 c15600, InterfaceC12548 interfaceC12548) {
        this(i, C9566.f26318, c15600, interfaceC12548, 6, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5348)) {
            return false;
        }
        C5348 c5348 = (C5348) obj;
        return this.f12614 == c5348.f12614 && this.f12610 == c5348.f12610 && this.f12612 == c5348.f12612 && this.f12616.equals(c5348.f12616) && this.f12611.equals(c5348.f12611);
    }

    public final int hashCode() {
        return this.f12611.hashCode() + ((this.f12616.hashCode() + ((this.f12612.hashCode() + (((this.f12614 * 31) + this.f12610) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(40, "Rop{");
        sbM34407.append(C24671.m54307(this.f12614));
        C9566 c9566 = C9566.f26318;
        C9566 c9567 = this.f12612;
        if (c9567 != c9566) {
            sbM34407.append(" ");
            sbM34407.append(c9567);
        } else {
            sbM34407.append(" .");
        }
        sbM34407.append(" <-");
        InterfaceC12548 interfaceC12548 = this.f12616;
        int size = interfaceC12548.size();
        if (size == 0) {
            sbM34407.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sbM34407.append(' ');
                sbM34407.append(interfaceC12548.getType(i));
            }
        }
        if (this.f12613) {
            sbM34407.append(" call");
        }
        InterfaceC12548 interfaceC12549 = this.f12611;
        int size2 = interfaceC12549.size();
        if (size2 != 0) {
            sbM34407.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sbM34407.append(' ');
                if (interfaceC12549.getType(i2) == C9566.f26315) {
                    sbM34407.append("<any>");
                } else {
                    sbM34407.append(interfaceC12549.getType(i2));
                }
            }
        } else {
            int i3 = this.f12610;
            if (i3 == 1) {
                sbM34407.append(" flows");
            } else if (i3 == 2) {
                sbM34407.append(" returns");
            } else if (i3 == 3) {
                sbM34407.append(" gotos");
            } else if (i3 == 4) {
                sbM34407.append(" ifs");
            } else if (i3 != 5) {
                sbM34407.append(" ".concat(C16351.m37152(i3)));
            } else {
                sbM34407.append(" switches");
            }
        }
        sbM34407.append('}');
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m11605() {
        return this.f12614;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9566 m11604() {
        return this.f12612;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC12548 m11602() {
        return this.f12616;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m11601() {
        return this.f12610;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m11606() {
        return this.f12613;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m11600() {
        int i = this.f12614;
        if (i == 14 || i == 16) {
            return true;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m11603() {
        String str = this.f12615;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11599() {
        return this.f12611.size() != 0;
    }
}
