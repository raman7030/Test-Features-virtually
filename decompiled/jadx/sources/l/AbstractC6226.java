package l;

/* JADX INFO: renamed from: l.ۛᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z634 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6226 implements InterfaceC1454 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19072;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19073 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21211 f19074;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19075;

    public AbstractC6226(AbstractC21044 abstractC21044) {
        this.f19074 = abstractC21044;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9922 mo1509() {
        return this.f19074.mo29404();
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4277 mo1510() {
        return this.f19074.mo29407();
    }

    @Override // l.InterfaceC1454
    public InterfaceC21211 getEntry() {
        return this.f19074;
    }

    @Override // l.InterfaceC1454
    public int getValue() {
        return this.f19075;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ۖ */
    public final int mo5004() {
        return this.f19072;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo5005() {
        int i = this.f19072;
        return 28 <= i && i <= 31;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5007() {
        int i = this.f19072;
        return i == 16 || i == 17;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo5009() {
        return this.f19072 == 3;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ᩵ۧ */
    public final boolean mo5010() {
        int i = this.f19072;
        if (i != 0) {
            return (i == 1 || i == 2 || i == 7 || i == 8) && getValue() == 0;
        }
        return true;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ۡ֫ */
    public final int mo5006() {
        return this.f19073;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ܿۧ */
    public InterfaceC3571 mo5008() {
        return mo1509().mo14959().getItem(getValue());
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC1454 interfaceC1454 = (InterfaceC1454) interfaceC8510;
        if (mo5010() && interfaceC1454.mo5010()) {
            return;
        }
        if (this.f19073 != interfaceC1454.mo5006()) {
            throw new RuntimeException(getEntry().getPath() + " " + Integer.toHexString(this.f19073) + " " + Integer.toHexString(interfaceC1454.mo5006()));
        }
        if (this.f19072 != interfaceC1454.mo5004() && ((!mo5005() || !interfaceC1454.mo5005()) && (!mo5007() || !interfaceC1454.mo5007()))) {
            throw new RuntimeException(getEntry().getPath() + " " + mo1511() + " " + this.f19072 + " " + interfaceC1454.mo5004());
        }
        if (mo5009()) {
            try {
                mo5008().mo12336(interfaceC1454.mo5008());
                return;
            } catch (RuntimeException e) {
                throw new RuntimeException(getEntry().getPath(), e);
            }
        }
        if (getValue() != interfaceC1454.getValue()) {
            int i = this.f19072;
            if (i == 18) {
                if ((getValue() != 0) == (interfaceC1454.getValue() != 0)) {
                    return;
                }
            } else {
                if (i == 4) {
                    String string = Float.toString(Float.intBitsToFloat(getValue()));
                    String string2 = Float.toString(Float.intBitsToFloat(interfaceC1454.getValue()));
                    if (string.equals(string2)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + string + " " + string2);
                }
                if (i == 5) {
                    String strM30765 = C12534.m30765(getValue());
                    String strM30766 = C12534.m30765(interfaceC1454.getValue());
                    if (strM30765.equals(strM30766)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM30765 + " " + strM30766);
                }
                if (i == 6) {
                    String strM30762 = C12534.m30762(getValue());
                    String strM30763 = C12534.m30762(interfaceC1454.getValue());
                    if (strM30762.equals(strM30763)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM30762 + " " + strM30763);
                }
            }
            throw new RuntimeException(String.format("%s %d(0x%08x) %d(0x%08x)", getEntry().getPath(), Integer.valueOf(getValue()), Integer.valueOf(getValue()), Integer.valueOf(interfaceC1454.getValue()), Integer.valueOf(interfaceC1454.getValue())));
        }
    }
}
