package p067l;

/* JADX INFO: renamed from: l.ۛᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z634 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8286 implements InterfaceC3751 {

    /* JADX INFO: renamed from: ۙ */
    public int f21935;

    /* JADX INFO: renamed from: ᩶ */
    public int f21936 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC22528 f21937;

    /* JADX INFO: renamed from: ᩹ */
    public int f21938;

    public AbstractC8286(AbstractC22369 abstractC22369) {
        this.f21937 = abstractC22369;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11799 mo3907() {
        return this.f21937.mo31466();
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC6434 mo3908() {
        return this.f21937.mo31469();
    }

    @Override // p067l.InterfaceC3751
    public InterfaceC22528 getEntry() {
        return this.f21937;
    }

    @Override // p067l.InterfaceC3751
    public int getValue() {
        return this.f21938;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۖ */
    public final int mo7247() {
        return this.f21935;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo7248() {
        int i = this.f21935;
        return 28 <= i && i <= 31;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7250() {
        int i = this.f21935;
        return i == 16 || i == 17;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo7252() {
        return this.f21935 == 3;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ᩵ۧ */
    public final boolean mo7253() {
        int i = this.f21935;
        if (i != 0) {
            return (i == 1 || i == 2 || i == 7 || i == 8) && getValue() == 0;
        }
        return true;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۡ֫ */
    public final int mo7249() {
        return this.f21936;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ܿۧ */
    public InterfaceC5763 mo7251() {
        return mo3907().mo16869().getItem(getValue());
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC3751 interfaceC3751 = (InterfaceC3751) interfaceC10457;
        if (mo7253() && interfaceC3751.mo7253()) {
            return;
        }
        if (this.f21936 != interfaceC3751.mo7249()) {
            throw new RuntimeException(getEntry().getPath() + " " + Integer.toHexString(this.f21936) + " " + Integer.toHexString(interfaceC3751.mo7249()));
        }
        if (this.f21935 != interfaceC3751.mo7247() && ((!mo7248() || !interfaceC3751.mo7248()) && (!mo7250() || !interfaceC3751.mo7250()))) {
            throw new RuntimeException(getEntry().getPath() + " " + mo3909() + " " + this.f21935 + " " + interfaceC3751.mo7247());
        }
        if (mo7252()) {
            try {
                mo7251().mo14241(interfaceC3751.mo7251());
                return;
            } catch (RuntimeException e) {
                throw new RuntimeException(getEntry().getPath(), e);
            }
        }
        if (getValue() != interfaceC3751.getValue()) {
            int i = this.f21935;
            if (i == 18) {
                if ((getValue() != 0) == (interfaceC3751.getValue() != 0)) {
                    return;
                }
            } else {
                if (i == 4) {
                    String string = Float.toString(Float.intBitsToFloat(getValue()));
                    String string2 = Float.toString(Float.intBitsToFloat(interfaceC3751.getValue()));
                    if (string.equals(string2)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + string + " " + string2);
                }
                if (i == 5) {
                    String strM32837 = C14281.m32837(getValue());
                    String strM32838 = C14281.m32837(interfaceC3751.getValue());
                    if (strM32837.equals(strM32838)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM32837 + " " + strM32838);
                }
                if (i == 6) {
                    String strM32834 = C14281.m32834(getValue());
                    String strM32835 = C14281.m32834(interfaceC3751.getValue());
                    if (strM32834.equals(strM32835)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM32834 + " " + strM32835);
                }
            }
            throw new RuntimeException(String.format("%s %d(0x%08x) %d(0x%08x)", getEntry().getPath(), Integer.valueOf(getValue()), Integer.valueOf(getValue()), Integer.valueOf(interfaceC3751.getValue()), Integer.valueOf(interfaceC3751.getValue())));
        }
    }
}
