package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1286 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7224 f4516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10396 f4517;

    public C1286(C22453 c22453, int i, int i2) {
        if (c22453 == null) {
            throw new NullPointerException("cf == null");
        }
        this.f4517 = c22453.m50387();
        this.f4516 = new C7224(new C2013(c22453.m50388().m27750(i, i2 + i)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m4353() {
        try {
            AbstractC13717 abstractC13717M4352 = m4352();
            if (this.f4516.available() == 0) {
                return abstractC13717M4352;
            }
            throw new C23158("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13738 m4355(EnumC11623 enumC11623) {
        C7224 c7224 = this.f4516;
        try {
            int unsignedByte = c7224.readUnsignedByte();
            C13738 c13738 = new C13738(unsignedByte);
            for (int i = 0; i < unsignedByte; i++) {
                int unsignedShort = c7224.readUnsignedShort();
                C22911 c22911 = new C22911();
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    c22911.m50995(m4351(enumC11623));
                }
                c22911.mo20349();
                c13738.m33038(i, c22911);
            }
            c13738.mo20349();
            if (c7224.available() == 0) {
                return c13738;
            }
            throw new C23158("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22911 m4354(EnumC11623 enumC11623) {
        C7224 c7224 = this.f4516;
        try {
            int unsignedShort = c7224.readUnsignedShort();
            C22911 c22911 = new C22911();
            for (int i = 0; i < unsignedShort; i++) {
                c22911.m50995(m4351(enumC11623));
            }
            c22911.mo20349();
            if (c7224.available() == 0) {
                return c22911;
            }
            throw new C23158("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C5978 m4351(EnumC11623 enumC11623) throws IOException {
        m4349(4);
        C7224 c7224 = this.f4516;
        int unsignedShort = c7224.readUnsignedShort();
        int unsignedShort2 = c7224.readUnsignedShort();
        C10396 c10396 = this.f4517;
        C5978 c5978 = new C5978(new C12512(C7573.m20297(((C13217) c10396.get(unsignedShort)).getString())), enumC11623);
        for (int i = 0; i < unsignedShort2; i++) {
            m4349(5);
            c5978.m16776(new C7389((C13217) c10396.get(c7224.readUnsignedShort()), m4352()));
        }
        c5978.mo20349();
        return c5978;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC13717 m4352() throws IOException {
        C7224 c7224 = this.f4516;
        int unsignedByte = c7224.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C7368(m4351(EnumC11623.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (C16039) m4350();
        }
        if (unsignedByte == 83) {
            return C3340.m10202(((C2635) m4350()).mo2231());
        }
        C10396 c10396 = this.f4517;
        if (unsignedByte == 99) {
            String string = ((C13217) c10396.get(c7224.readUnsignedShort())).getString();
            C7573 c7573 = C7573.f23402;
            try {
                return new C12512(string.equals("V") ? C7573.f23406 : C7573.m20297(string));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m4349(4);
            int unsignedShort = c7224.readUnsignedShort();
            return new C9691(new C20274((C13217) c10396.get(c7224.readUnsignedShort()), (C13217) c10396.get(unsignedShort)));
        }
        if (unsignedByte == 115) {
            return m4350();
        }
        if (unsignedByte == 73) {
            return (C2635) m4350();
        }
        if (unsignedByte == 74) {
            return (C8279) m4350();
        }
        if (unsignedByte == 90) {
            return C18157.m42265(((C2635) m4350()).mo2231());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return C17451.m40823(((C2635) m4350()).mo2231());
                case 67:
                    return C6868.m18552(((C2635) m4350()).mo2231());
                case 68:
                    return (C20980) m4350();
                default:
                    throw new C23158("unknown annotation tag: ".concat(C14712.m35005(unsignedByte)), null);
            }
        }
        m4349(2);
        int unsignedShort2 = c7224.readUnsignedShort();
        C1929 c1929 = new C1929(unsignedShort2);
        for (int i = 0; i < unsignedShort2; i++) {
            c1929.mo12223(i, m4352());
        }
        c1929.mo20349();
        return new C11102(c1929);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC13717 m4350() throws IOException {
        return this.f4517.get(this.f4516.readUnsignedShort());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4349(int i) {
        if (this.f4516.available() < i) {
            throw new C23158("truncated annotation attribute", null);
        }
    }
}
