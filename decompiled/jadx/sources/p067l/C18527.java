package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KA0F */
/* JADX INFO: loaded from: classes4.dex */
public final class C18527 extends AbstractC10481 {
    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12972(int i, byte[] bArr) {
        return 0;
    }

    public C18527(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
        this.f29009 = new C17856(interfaceC3341);
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ֫ */
    public final int mo12970(int i, byte[] bArr) {
        return m24190(i, bArr);
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ۧ */
    public final int mo12971(int i, byte[] bArr) {
        if (this.f28991 != 0 || this.f29004 != 0) {
            return 0;
        }
        byte b = bArr[i];
        int iM24186 = AbstractC10481.m24186(i + 2, bArr);
        if (iM24186 != 0) {
            this.f29001[this.f29003] = new C17185(this.f29009, iM24186);
            return 6;
        }
        this.f29001[this.f29003] = null;
        return 6;
    }

    @Override // p067l.AbstractC10481
    public final String toString() {
        StringBuilder sb = new StringBuilder("NameQueryResponse[");
        sb.append(super.toString());
        sb.append(",addrEntry=");
        C17185[] c17185Arr = this.f29001;
        return new String(C10965.m25286(sb, c17185Arr != null ? Arrays.toString(c17185Arr) : "", "]"));
    }
}
