package l;

/* JADX INFO: renamed from: l.ܺۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15855 extends EnumC8095 {
    public /* synthetic */ C15855() {
        this("FORMAT_FILL_ARRAY_DATA_PAYLOAD", 35);
    }

    public C15855(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int i2 = interfaceC16186.read();
        int i3 = interfaceC16186.readInt();
        int i4 = 0;
        if (i2 == 1) {
            byte[] bArr = new byte[i3];
            int i5 = 0;
            boolean z = true;
            while (i4 < i3) {
                if (z) {
                    i5 = interfaceC16186.read();
                }
                bArr[i4] = (byte) (i5 & 255);
                i5 >>= 8;
                i4++;
                z = !z;
            }
            return new C19010((EnumC8095) this, i, bArr);
        }
        if (i2 == 2) {
            short[] sArr = new short[i3];
            while (i4 < i3) {
                sArr[i4] = (short) interfaceC16186.read();
                i4++;
            }
            return new C19010((EnumC8095) this, i, sArr);
        }
        if (i2 == 4) {
            int[] iArr = new int[i3];
            while (i4 < i3) {
                iArr[i4] = interfaceC16186.readInt();
                i4++;
            }
            return new C19010((EnumC8095) this, i, iArr);
        }
        if (i2 == 8) {
            long[] jArr = new long[i3];
            while (i4 < i3) {
                jArr[i4] = interfaceC16186.readLong();
                i4++;
            }
            return new C19010(this, i, jArr);
        }
        throw new C0374("bogus element_width: ".concat(C14712.m35006(i2)), null);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        C19010 c19010 = (C19010) abstractC4193;
        short sM43851 = c19010.m43851();
        Object objM43852 = c19010.m43852();
        interfaceC2782.m8586();
        interfaceC2782.m8586();
        interfaceC2782.m8588();
        if (sM43851 == 1) {
            interfaceC2782.m8593();
            return;
        }
        if (sM43851 == 2) {
            interfaceC2782.m8590();
        } else if (sM43851 == 4) {
            interfaceC2782.m8595();
        } else {
            if (sM43851 == 8) {
                interfaceC2782.m8587();
                return;
            }
            throw new C0374("bogus element_width: ".concat(C14712.m35006(sM43851)), null);
        }
    }
}
