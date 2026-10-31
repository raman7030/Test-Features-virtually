package l;

/* JADX INFO: renamed from: l.ۧᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11191 extends AbstractC17540 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f33590 = C11321.m27961(C11191.class);

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f33591;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f33592;

    public C11191(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        m41009(C1480.m5121(0, bArr));
        this.f33592 = C1480.m5121(2, bArr);
        m41011(C1480.m5121(4, bArr));
        this.f33591 = C1480.m5121(6, bArr);
        return 8;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        m28217(false);
        InterfaceC14325[] interfaceC14325Arr = new C16834[m41013()];
        int i3 = i;
        for (int i4 = 0; i4 < m41013(); i4++) {
            C16834 c16834 = new C16834();
            interfaceC14325Arr[i4] = c16834;
            c16834.f51686 = m28199(false, i3, 13, bArr);
            c16834.f51685 = C1480.m5121(i3 + 14, bArr);
            int iM5123 = C1480.m5123(i3 + 16, bArr);
            i3 += 20;
            c16834.f51687 = m28199(false, ((iM5123 & 65535) - this.f33592) + i, 128, bArr);
            InterfaceC2148 interfaceC2148 = f33590;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(c16834.toString());
            }
        }
        m41006(interfaceC14325Arr);
        return i3 - i;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetShareEnumResponse[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m41008());
        sb.append(",converter=");
        sb.append(this.f33592);
        sb.append(",entriesReturned=");
        sb.append(m41013());
        sb.append(",totalAvailableEntries=");
        return new String(C3200.m9831(this.f33591, "]", sb));
    }
}
