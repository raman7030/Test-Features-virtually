package p067l;

/* JADX INFO: renamed from: l.ܺۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17437 extends EnumC10062 {
    public /* synthetic */ C17437() {
        this("FORMAT_FILL_ARRAY_DATA_PAYLOAD", 35);
    }

    public C17437(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int i2 = interfaceC17752.read();
        int i3 = interfaceC17752.readInt();
        int i4 = 0;
        if (i2 == 1) {
            byte[] bArr = new byte[i3];
            int i5 = 0;
            boolean z = true;
            while (i4 < i3) {
                if (z) {
                    i5 = interfaceC17752.read();
                }
                bArr[i4] = (byte) (i5 & 255);
                i5 >>= 8;
                i4++;
                z = !z;
            }
            return new C20436((EnumC10062) this, i, bArr);
        }
        if (i2 == 2) {
            short[] sArr = new short[i3];
            while (i4 < i3) {
                sArr[i4] = (short) interfaceC17752.read();
                i4++;
            }
            return new C20436((EnumC10062) this, i, sArr);
        }
        if (i2 == 4) {
            int[] iArr = new int[i3];
            while (i4 < i3) {
                iArr[i4] = interfaceC17752.readInt();
                i4++;
            }
            return new C20436((EnumC10062) this, i, iArr);
        }
        if (i2 == 8) {
            long[] jArr = new long[i3];
            while (i4 < i3) {
                jArr[i4] = interfaceC17752.readLong();
                i4++;
            }
            return new C20436(this, i, jArr);
        }
        throw new C2724("bogus element_width: ".concat(C16351.m37153(i2)), null);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        C20436 c20436 = (C20436) abstractC6354;
        short sM46119 = c20436.m46119();
        Object objM46120 = c20436.m46120();
        interfaceC5013.m10649();
        interfaceC5013.m10649();
        interfaceC5013.m10651();
        if (sM46119 == 1) {
            interfaceC5013.m10656();
            return;
        }
        if (sM46119 == 2) {
            interfaceC5013.m10653();
        } else if (sM46119 == 4) {
            interfaceC5013.m10658();
        } else {
            if (sM46119 == 8) {
                interfaceC5013.m10650();
                return;
            }
            throw new C2724("bogus element_width: ".concat(C16351.m37153(sM46119)), null);
        }
    }
}
