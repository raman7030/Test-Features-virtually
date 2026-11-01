package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3591 {

    /* JADX INFO: renamed from: ֫ */
    public final C9234 f7290;

    /* JADX INFO: renamed from: ۧ */
    public final C12249 f7291;

    public C3591(C23708 c23708, int i, int i2) {
        if (c23708 == null) {
            throw new NullPointerException("cf == null");
        }
        this.f7291 = c23708.m52728();
        this.f7290 = new C9234(new C4282(c23708.m52729().m29812(i, i2 + i)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15405 m6599() {
        try {
            AbstractC15405 abstractC15405M6598 = m6598();
            if (this.f7290.available() == 0) {
                return abstractC15405M6598;
            }
            throw new C24378("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15425 m6601(EnumC13415 enumC13415) {
        C9234 c9234 = this.f7290;
        try {
            int unsignedByte = c9234.readUnsignedByte();
            C15425 c15425 = new C15425(unsignedByte);
            for (int i = 0; i < unsignedByte; i++) {
                int unsignedShort = c9234.readUnsignedShort();
                C24143 c24143 = new C24143();
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    c24143.m53386(m6597(enumC13415));
                }
                c24143.mo22326();
                c15425.m35152(i, c24143);
            }
            c15425.mo22326();
            if (c9234.available() == 0) {
                return c15425;
            }
            throw new C24378("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24143 m6600(EnumC13415 enumC13415) {
        C9234 c9234 = this.f7290;
        try {
            int unsignedShort = c9234.readUnsignedShort();
            C24143 c24143 = new C24143();
            for (int i = 0; i < unsignedShort; i++) {
                c24143.m53386(m6597(enumC13415));
            }
            c24143.mo22326();
            if (c9234.available() == 0) {
                return c24143;
            }
            throw new C24378("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private C8050 m6597(EnumC13415 enumC13415) throws IOException {
        m6595(4);
        C9234 c9234 = this.f7290;
        int unsignedShort = c9234.readUnsignedShort();
        int unsignedShort2 = c9234.readUnsignedShort();
        C12249 c12249 = this.f7291;
        C8050 c8050 = new C8050(new C14260(C9566.m22274(((C14930) c12249.get(unsignedShort)).getString())), enumC13415);
        for (int i = 0; i < unsignedShort2; i++) {
            m6595(5);
            c8050.m18702(new C9391((C14930) c12249.get(c9234.readUnsignedShort()), m6598()));
        }
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ܽ */
    private AbstractC15405 m6598() throws IOException {
        C9234 c9234 = this.f7290;
        int unsignedByte = c9234.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C9371(m6597(EnumC13415.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (C17612) m6596();
        }
        if (unsignedByte == 83) {
            return C5543.m12238(((C4873) m6596()).mo4598());
        }
        C12249 c12249 = this.f7291;
        if (unsignedByte == 99) {
            String string = ((C14930) c12249.get(c9234.readUnsignedShort())).getString();
            C9566 c9566 = C9566.f26314;
            try {
                return new C14260(string.equals("V") ? C9566.f26318 : C9566.m22274(string));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m6595(4);
            int unsignedShort = c9234.readUnsignedShort();
            return new C11579(new C21637((C14930) c12249.get(c9234.readUnsignedShort()), (C14930) c12249.get(unsignedShort)));
        }
        if (unsignedByte == 115) {
            return m6596();
        }
        if (unsignedByte == 73) {
            return (C4873) m6596();
        }
        if (unsignedByte == 74) {
            return (C10237) m6596();
        }
        if (unsignedByte == 90) {
            return C19625.m44526(((C4873) m6596()).mo4598());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return C18954.m43081(((C4873) m6596()).mo4598());
                case 67:
                    return C8896.m20501(((C4873) m6596()).mo4598());
                case 68:
                    return (C22308) m6596();
                default:
                    throw new C24378("unknown annotation tag: ".concat(C16351.m37152(unsignedByte)), null);
            }
        }
        m6595(2);
        int unsignedShort2 = c9234.readUnsignedShort();
        C4202 c4202 = new C4202(unsignedShort2);
        for (int i = 0; i < unsignedShort2; i++) {
            c4202.mo14144(i, m6598());
        }
        c4202.mo22326();
        return new C12920(c4202);
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC15405 m6596() throws IOException {
        return this.f7291.get(this.f7290.readUnsignedShort());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6595(int i) {
        if (this.f7290.available() < i) {
            throw new C24378("truncated annotation attribute", null);
        }
    }
}
