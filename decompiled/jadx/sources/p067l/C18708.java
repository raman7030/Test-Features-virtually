package p067l;

/* JADX INFO: renamed from: l.ܿ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18708 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public int f55892;

    /* JADX INFO: renamed from: ۙ */
    public int f55893;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ InterfaceC23250[] f55894;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C24743 f55895;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18708(C24743 c24743, C14645 c14645, int i, int i2, InterfaceC23250[] interfaceC23250Arr) {
        super(c14645, i);
        this.f55895 = c24743;
        this.f55894 = interfaceC23250Arr;
        this.f55893 = 0;
        this.f55892 = i2;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        InterfaceC23250 interfaceC23250;
        InterfaceC23250 interfaceC23251;
        C14645 c14645 = this.f55895.f78344;
        while (true) {
            int iM45625 = c20168.m45625();
            String strM33487 = null;
            InterfaceC23250[] interfaceC23250Arr = this.f55894;
            boolean z = true;
            switch (iM45625) {
                case 0:
                    m6947();
                    return null;
                case 1:
                    this.f55893 += c20168.m45635();
                    break;
                case 2:
                    this.f55892 += c20168.m45629();
                    break;
                case 3:
                    int iM45635 = c20168.m45635();
                    String strM33510 = c14645.m33510(c20168.m45635() - 1);
                    int iM45636 = c20168.m45635() - 1;
                    if (iM45636 == -1) {
                        c14645.getClass();
                    } else {
                        strM33487 = c14645.m33487(iM45636);
                    }
                    C10290 c10290 = new C10290(strM33510, this.f55893, strM33487, null, iM45635);
                    if (iM45635 >= 0 && iM45635 < interfaceC23250Arr.length) {
                        interfaceC23250Arr[iM45635] = c10290;
                    }
                    return c10290;
                case 4:
                    int iM45637 = c20168.m45635();
                    String strM33511 = c14645.m33510(c20168.m45635() - 1);
                    int iM45638 = c20168.m45635() - 1;
                    if (iM45638 == -1) {
                        c14645.getClass();
                    } else {
                        strM33487 = c14645.m33487(iM45638);
                    }
                    C10290 c10291 = new C10290(strM33511, this.f55893, strM33487, c14645.m33510(c20168.m45635() - 1), iM45637);
                    if (iM45637 >= 0 && iM45637 < interfaceC23250Arr.length) {
                        interfaceC23250Arr[iM45637] = c10291;
                    }
                    return c10291;
                case 5:
                    int iM45639 = c20168.m45635();
                    boolean z2 = false;
                    if (iM45639 >= 0 && iM45639 < interfaceC23250Arr.length) {
                        interfaceC23250 = interfaceC23250Arr[iM45639];
                    } else {
                        interfaceC23250 = C24743.f78341;
                        z = false;
                    }
                    if (interfaceC23250 instanceof InterfaceC16543) {
                        interfaceC23250 = C24743.f78341;
                    } else {
                        z2 = z;
                    }
                    C10961 c10961 = new C10961(interfaceC23250.getName(), this.f55893, interfaceC23250.getType(), interfaceC23250.getSignature(), iM45639);
                    if (z2) {
                        interfaceC23250Arr[iM45639] = c10961;
                    }
                    return c10961;
                case 6:
                    int iM456310 = c20168.m45635();
                    if (iM456310 >= 0 && iM456310 < interfaceC23250Arr.length) {
                        interfaceC23251 = interfaceC23250Arr[iM456310];
                    } else {
                        interfaceC23251 = C24743.f78341;
                    }
                    C6267 c6267 = new C6267(interfaceC23251.getName(), this.f55893, interfaceC23251.getType(), interfaceC23251.getSignature(), iM456310);
                    if (iM456310 >= 0 && iM456310 < interfaceC23250Arr.length) {
                        interfaceC23250Arr[iM456310] = c6267;
                    }
                    return c6267;
                case 7:
                    return new C4926(this.f55893);
                case 8:
                    return new C17665(this.f55893);
                case 9:
                    return new C21020(this.f55893, c14645.m33510(c20168.m45635() - 1));
                default:
                    int i = iM45625 - 10;
                    int i2 = (i / 15) + this.f55893;
                    this.f55893 = i2;
                    int i3 = ((i % 15) - 4) + this.f55892;
                    this.f55892 = i3;
                    return C7309.m16882(i2, i3);
            }
        }
    }
}
