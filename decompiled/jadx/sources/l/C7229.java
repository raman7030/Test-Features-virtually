package l;

/* JADX INFO: renamed from: l.۟ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7229 extends AbstractC17540 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f22127 = C11321.m27961(C7229.class);

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f22128;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public String f22129;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f22130;

    public C7229(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String m19330() {
        return this.f22129;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        m41009(C1480.m5121(0, bArr));
        this.f22130 = C1480.m5121(2, bArr);
        m41011(C1480.m5121(4, bArr));
        this.f22128 = C1480.m5121(6, bArr);
        return 8;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        InterfaceC14325[] interfaceC14325Arr = new C13578[m41013()];
        int i3 = i;
        C13578 c13578 = null;
        for (int i4 = 0; i4 < m41013(); i4++) {
            c13578 = new C13578();
            interfaceC14325Arr[i4] = c13578;
            c13578.f40513 = m28199(false, i3, 16, bArr);
            c13578.f40510 = bArr[i3 + 16] & 255;
            c13578.f40509 = bArr[i3 + 17] & 255;
            c13578.f40511 = C1480.m5123(i3 + 18, bArr);
            int iM5123 = C1480.m5123(i3 + 22, bArr);
            i3 += 26;
            c13578.f40512 = m28199(false, ((iM5123 & 65535) - this.f22130) + i, 48, bArr);
            InterfaceC2148 interfaceC2148 = f22127;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(c13578.toString());
            }
        }
        m41006(interfaceC14325Arr);
        this.f22129 = c13578 != null ? c13578.f40513 : null;
        return i3 - i;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2Response[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m41008());
        sb.append(",converter=");
        sb.append(this.f22130);
        sb.append(",entriesReturned=");
        sb.append(m41013());
        sb.append(",totalAvailableEntries=");
        sb.append(this.f22128);
        sb.append(",lastName=");
        return new String(C9045.m23341(sb, this.f22129, "]"));
    }
}
