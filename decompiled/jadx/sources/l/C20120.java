package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20120 extends AbstractC3186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f65160;

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ */
    public final int mo9801() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20120(C10242 c10242, EnumC12358 enumC12358, long j) {
        super(c10242, enumC12358, Long.valueOf(j));
        this.f65160 = c10242;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ */
    public final String mo3639() {
        StringBuilder sb;
        String string;
        boolean z = this.f65160.f30885.f29344;
        Object obj = this.f10053;
        if (z) {
            sb = new StringBuilder();
            long jLongValue = ((Long) obj).longValue();
            int i = C23424.f75225;
            int i2 = 16;
            while (i2 > 0 && (jLongValue >> ((i2 - 1) * 4)) == 0) {
                i2--;
            }
            string = C23424.m51890(i2, jLongValue);
        } else {
            sb = new StringBuilder();
            string = ((Long) obj).toString();
        }
        sb.append(string);
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ֫ */
    public final void mo3637(InterfaceC1134 interfaceC1134, int i) {
        super.mo3637(interfaceC1134, i);
        interfaceC1134.mo1973(mo3639() + l.b);
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ */
    public final void mo3638(InterfaceC1134 interfaceC1134, int i) {
        super.mo3638(interfaceC1134, i);
        interfaceC1134.mo1973(mo3639() + l.b);
    }
}
