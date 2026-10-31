package l;

/* JADX INFO: renamed from: l.ܿ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes5.dex */
public final class C17193 extends AbstractC22132 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f52711;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52712;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21972[] f52713;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23543 f52714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17193(C23543 c23543, C12918 c12918, int i, int i2, InterfaceC21972[] interfaceC21972Arr) {
        super(c12918, i);
        this.f52714 = c23543;
        this.f52713 = interfaceC21972Arr;
        this.f52712 = 0;
        this.f52711 = i2;
    }

    @Override // l.AbstractC22132
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        InterfaceC21972 interfaceC21972;
        InterfaceC21972 interfaceC21973;
        C12918 c12918 = this.f52714.f75598;
        while (true) {
            int iM43358 = c18729.m43358();
            String strM31401 = null;
            InterfaceC21972[] interfaceC21972Arr = this.f52713;
            boolean z = true;
            switch (iM43358) {
                case 0:
                    m4715();
                    return null;
                case 1:
                    this.f52712 += c18729.m43368();
                    break;
                case 2:
                    this.f52711 += c18729.m43362();
                    break;
                case 3:
                    int iM43368 = c18729.m43368();
                    String strM31424 = c12918.m31424(c18729.m43368() - 1);
                    int iM43369 = c18729.m43368() - 1;
                    if (iM43369 == -1) {
                        c12918.getClass();
                    } else {
                        strM31401 = c12918.m31401(iM43369);
                    }
                    C8335 c8335 = new C8335(strM31424, this.f52712, strM31401, null, iM43368);
                    if (iM43368 >= 0 && iM43368 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[iM43368] = c8335;
                    }
                    return c8335;
                case 4:
                    int iM433610 = c18729.m43368();
                    String strM31425 = c12918.m31424(c18729.m43368() - 1);
                    int iM433611 = c18729.m43368() - 1;
                    if (iM433611 == -1) {
                        c12918.getClass();
                    } else {
                        strM31401 = c12918.m31401(iM433611);
                    }
                    C8335 c8336 = new C8335(strM31425, this.f52712, strM31401, c12918.m31424(c18729.m43368() - 1), iM433610);
                    if (iM433610 >= 0 && iM433610 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[iM433610] = c8336;
                    }
                    return c8336;
                case 5:
                    int iM433612 = c18729.m43368();
                    boolean z2 = false;
                    if (iM433612 >= 0 && iM433612 < interfaceC21972Arr.length) {
                        interfaceC21972 = interfaceC21972Arr[iM433612];
                    } else {
                        interfaceC21972 = C23543.f75595;
                        z = false;
                    }
                    if (interfaceC21972 instanceof InterfaceC14915) {
                        interfaceC21972 = C23543.f75595;
                    } else {
                        z2 = z;
                    }
                    C9041 c9041 = new C9041(interfaceC21972.getName(), this.f52712, interfaceC21972.getType(), interfaceC21972.getSignature(), iM433612);
                    if (z2) {
                        interfaceC21972Arr[iM433612] = c9041;
                    }
                    return c9041;
                case 6:
                    int iM433613 = c18729.m43368();
                    if (iM433613 >= 0 && iM433613 < interfaceC21972Arr.length) {
                        interfaceC21973 = interfaceC21972Arr[iM433613];
                    } else {
                        interfaceC21973 = C23543.f75595;
                    }
                    C4102 c4102 = new C4102(interfaceC21973.getName(), this.f52712, interfaceC21973.getType(), interfaceC21973.getSignature(), iM433613);
                    if (iM433613 >= 0 && iM433613 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[iM433613] = c4102;
                    }
                    return c4102;
                case 7:
                    return new C2691(this.f52712);
                case 8:
                    return new C16095(this.f52712);
                case 9:
                    return new C19625(this.f52712, c12918.m31424(c18729.m43368() - 1));
                default:
                    int i = iM43358 - 10;
                    int i2 = (i / 15) + this.f52712;
                    this.f52712 = i2;
                    int i3 = ((i % 15) - 4) + this.f52711;
                    this.f52711 = i3;
                    return C5199.m14972(i2, i3);
            }
        }
    }
}
