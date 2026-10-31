package l;

/* JADX INFO: renamed from: l.ۗۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BHQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3135 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f9807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f9808;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7573 f9809;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f9810;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f9811;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f9812;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f9813;

    public C3135(int i, C7573 c7573, InterfaceC10711 interfaceC10711, InterfaceC10711 interfaceC10712, int i2, boolean z, String str) {
        if (c7573 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC10712 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(C19370.m44628(i2, "invalid branchingness: "));
        }
        if (interfaceC10712.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f9811 = i;
        this.f9809 = c7573;
        this.f9813 = interfaceC10711;
        this.f9808 = interfaceC10712;
        this.f9807 = i2;
        this.f9810 = z;
        this.f9812 = str;
    }

    public C3135(int i, C7573 c7573, InterfaceC10711 interfaceC10711, int i2, String str) {
        this(i, c7573, interfaceC10711, C13922.f41594, i2, false, str);
    }

    public C3135(int i, C7573 c7573, InterfaceC10711 interfaceC10711, String str) {
        this(i, c7573, interfaceC10711, C13922.f41594, 1, false, str);
    }

    public C3135(int i, C7573 c7573, InterfaceC10711 interfaceC10711, InterfaceC10711 interfaceC10712, String str) {
        this(i, c7573, interfaceC10711, interfaceC10712, 6, false, str);
    }

    public C3135(int i, C13922 c13922, InterfaceC10711 interfaceC10711) {
        this(i, C7573.f23406, c13922, interfaceC10711, 6, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3135)) {
            return false;
        }
        C3135 c3135 = (C3135) obj;
        return this.f9811 == c3135.f9811 && this.f9807 == c3135.f9807 && this.f9809 == c3135.f9809 && this.f9813.equals(c3135.f9813) && this.f9808.equals(c3135.f9808);
    }

    public final int hashCode() {
        return this.f9808.hashCode() + ((this.f9813.hashCode() + ((this.f9809.hashCode() + (((this.f9811 * 31) + this.f9807) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(40, "Rop{");
        sbM32307.append(C23467.m51905(this.f9811));
        C7573 c7573 = C7573.f23406;
        C7573 c7574 = this.f9809;
        if (c7574 != c7573) {
            sbM32307.append(" ");
            sbM32307.append(c7574);
        } else {
            sbM32307.append(" .");
        }
        sbM32307.append(" <-");
        InterfaceC10711 interfaceC10711 = this.f9813;
        int size = interfaceC10711.size();
        if (size == 0) {
            sbM32307.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sbM32307.append(' ');
                sbM32307.append(interfaceC10711.getType(i));
            }
        }
        if (this.f9810) {
            sbM32307.append(" call");
        }
        InterfaceC10711 interfaceC10712 = this.f9808;
        int size2 = interfaceC10712.size();
        if (size2 != 0) {
            sbM32307.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sbM32307.append(' ');
                if (interfaceC10712.getType(i2) == C7573.f23403) {
                    sbM32307.append("<any>");
                } else {
                    sbM32307.append(interfaceC10712.getType(i2));
                }
            }
        } else {
            int i3 = this.f9807;
            if (i3 == 1) {
                sbM32307.append(" flows");
            } else if (i3 == 2) {
                sbM32307.append(" returns");
            } else if (i3 == 3) {
                sbM32307.append(" gotos");
            } else if (i3 == 4) {
                sbM32307.append(" ifs");
            } else if (i3 != 5) {
                sbM32307.append(" ".concat(C14712.m35005(i3)));
            } else {
                sbM32307.append(" switches");
            }
        }
        sbM32307.append('}');
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m9562() {
        return this.f9811;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7573 m9561() {
        return this.f9809;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m9559() {
        return this.f9813;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9558() {
        return this.f9807;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m9563() {
        return this.f9810;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m9557() {
        int i = this.f9811;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m9560() {
        String str = this.f9812;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9556() {
        return this.f9808.size() != 0;
    }
}
