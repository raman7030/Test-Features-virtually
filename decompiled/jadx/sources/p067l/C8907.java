package p067l;

/* JADX INFO: renamed from: l.ۜܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8907 {

    /* JADX INFO: renamed from: ۘ */
    public static final AbstractC8146 f24133 = C16667.m37745(EnumC11590.LIST_ITEM_OPEN_TAG, EnumC11590.PARAGRAPH_OPEN_TAG, EnumC11590.HEADER_OPEN_TAG);

    /* JADX INFO: renamed from: ֫ */
    public boolean f24134;

    /* JADX INFO: renamed from: ۖ */
    public boolean f24135;

    /* JADX INFO: renamed from: ۡ */
    public C10919 f24137;

    /* JADX INFO: renamed from: ۢ */
    public int f24138;

    /* JADX INFO: renamed from: ۧ */
    public final int f24139;

    /* JADX INFO: renamed from: ܳ */
    public boolean f24140;

    /* JADX INFO: renamed from: ܽ */
    public boolean f24142;

    /* JADX INFO: renamed from: ᩻ */
    public int f24146;

    /* JADX INFO: renamed from: ۜ */
    public final StringBuilder f24136 = new StringBuilder();

    /* JADX INFO: renamed from: ܿ */
    public final C22319 f24143 = new C22319();

    /* JADX INFO: renamed from: ᩳ */
    public final C22319 f24144 = new C22319();

    /* JADX INFO: renamed from: ᩷ */
    public final C22319 f24145 = new C22319();

    /* JADX INFO: renamed from: ܺ */
    public EnumC25000 f24141 = EnumC25000.NONE;

    public C8907(int i) {
        this.f24139 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20579() {
        EnumC25000 enumC25000 = EnumC25000.WHITESPACE;
        EnumC25000 enumC25001 = this.f24141;
        if (enumC25000.compareTo(enumC25001) < 0) {
            enumC25000 = enumC25001;
        }
        this.f24141 = enumC25000;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20580(C10919 c10919) {
        this.f24137 = c10919;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20588() {
        this.f24136.append("/**");
        m20572(EnumC16282.AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20593() {
        StringBuilder sb = this.f24136;
        sb.append("\n");
        m20571(this.f24139 + 1);
        sb.append("*/");
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m20590(C10919 c10919) {
        this.f24140 = false;
        this.f24143.m50132();
        this.f24144.m50132();
        this.f24145.m50132();
        if (this.f24135) {
            if (!this.f24142) {
                m20573();
            } else {
                this.f24142 = false;
                m20576();
            }
        }
        m20575(c10919);
        this.f24142 = true;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m20583(C10919 c10919) {
        m20573();
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m20578(C10919 c10919) {
        m20575(c10919);
        m20573();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m20592(C10919 c10919) {
        m20573();
        m20575(c10919);
        this.f24140 = false;
        this.f24144.m50129();
        this.f24145.m50129();
        m20576();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m20587(C10919 c10919) {
        m20576();
        this.f24143.m50128();
        this.f24144.m50128();
        m20575(c10919);
        this.f24145.m50128();
        m20573();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m20586(C10919 c10919) {
        m20576();
        boolean z = this.f24140;
        C22319 c22319 = this.f24143;
        if (z) {
            this.f24140 = false;
            c22319.m50128();
        }
        m20575(c10919);
        this.f24140 = true;
        c22319.m50129();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m20584(C10919 c10919) {
        m20573();
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m20601(C10919 c10919) {
        m20575(c10919);
        m20573();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m20598(C10919 c10919) {
        if (this.f24135) {
            m20573();
            m20575(c10919);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20589(C10919 c10919) {
        m20573();
        m20575(c10919);
        m20573();
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m20577(C10919 c10919) {
        m20573();
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m20599(C10919 c10919) {
        m20575(c10919);
        m20573();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m20595(C10919 c10919) {
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20597(C10919 c10919) {
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m20591(C10919 c10919) {
        m20573();
        m20575(c10919);
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m20585(C10919 c10919) {
        m20575(c10919);
        m20573();
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m20582(C10919 c10919) {
        m20596();
        m20571(this.f24146);
        m20575(c10919);
        m20576();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m20600(C10919 c10919) {
        m20576();
        m20575(c10919);
        m20576();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20594(C10919 c10919) {
        m20575(c10919);
        m20576();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20596() {
        m20572(EnumC16282.NO_AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m20581(C10919 c10919) {
        m20575(c10919);
    }

    public final String toString() {
        return this.f24136.toString();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m20573() {
        EnumC25000 enumC25000 = EnumC25000.BLANK_LINE;
        EnumC25000 enumC25001 = this.f24141;
        if (enumC25000.compareTo(enumC25001) < 0) {
            enumC25000 = enumC25001;
        }
        this.f24141 = enumC25000;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m20576() {
        EnumC25000 enumC25000 = EnumC25000.NEWLINE;
        EnumC25000 enumC25001 = this.f24141;
        if (enumC25000.compareTo(enumC25001) < 0) {
            enumC25000 = enumC25001;
        }
        this.f24141 = enumC25000;
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m20575(C10919 c10919) {
        if (this.f24137 != null) {
            m20576();
        }
        EnumC25000 enumC25000 = this.f24141;
        EnumC25000 enumC25001 = EnumC25000.BLANK_LINE;
        if (enumC25000 == enumC25001 && (this.f24145.m50133() || this.f24142)) {
            this.f24141 = EnumC25000.NEWLINE;
        }
        EnumC25000 enumC25002 = this.f24141;
        StringBuilder sb = this.f24136;
        if (enumC25002 != enumC25001) {
            if (enumC25002 == EnumC25000.NEWLINE) {
                m20572(EnumC16282.AUTO_INDENT);
                this.f24141 = EnumC25000.NONE;
            }
        } else {
            sb.append("\n");
            m20571(this.f24139 + 1);
            sb.append("*");
            m20572(EnumC16282.AUTO_INDENT);
            this.f24141 = EnumC25000.NONE;
        }
        int i = this.f24141 == EnumC25000.WHITESPACE ? 1 : 0;
        if (!this.f24134 && c10919.m25181() + i > this.f24138) {
            m20572(EnumC16282.AUTO_INDENT);
        }
        if (!this.f24134 && i != 0) {
            sb.append(" ");
            this.f24138--;
        }
        C10919 c109110 = this.f24137;
        if (c109110 != null) {
            sb.append(c109110.m25180());
            this.f24137 = null;
            this.f24146 = m20574();
            m20576();
            m20575(c10919);
            return;
        }
        sb.append(c10919.m25180());
        if (!f24133.contains(c10919.m25179())) {
            this.f24134 = false;
        }
        this.f24138 -= c10919.m25181();
        this.f24141 = EnumC25000.NONE;
        this.f24135 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20572(EnumC16282 enumC16282) {
        StringBuilder sb = this.f24136;
        sb.append("\n");
        int i = this.f24139;
        m20571(i + 1);
        sb.append("*");
        m20571(1);
        this.f24138 = 97 - i;
        if (enumC16282 == EnumC16282.AUTO_INDENT) {
            m20571(m20574());
            this.f24138 -= m20574();
        }
        this.f24134 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m20574() {
        int iM50130 = (this.f24144.m50130() * 2) + (this.f24143.m50130() * 4);
        return this.f24142 ? iM50130 + 4 : iM50130;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20571(int i) {
        String string;
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "count is negative: "));
        }
        if (i != 0) {
            string = " ";
            if (i != 1) {
                if (1 > Integer.MAX_VALUE / i) {
                    throw new OutOfMemoryError(C19768.m44906(i, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(i);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        this.f24136.append(string);
    }
}
