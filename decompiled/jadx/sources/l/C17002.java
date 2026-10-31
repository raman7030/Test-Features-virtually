package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KA0F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17002 extends AbstractC8536 {
    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10996(int i, byte[] bArr) {
        return 0;
    }

    public C17002(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f26094 = new C16296(interfaceC1023);
    }

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ֫ */
    public final int mo10994(int i, byte[] bArr) {
        return m22222(i, bArr);
    }

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ۧ */
    public final int mo10995(int i, byte[] bArr) {
        if (this.f26076 != 0 || this.f26089 != 0) {
            return 0;
        }
        byte b = bArr[i];
        int iM22218 = AbstractC8536.m22218(i + 2, bArr);
        if (iM22218 != 0) {
            this.f26086[this.f26088] = new C15590(this.f26094, iM22218);
            return 6;
        }
        this.f26086[this.f26088] = null;
        return 6;
    }

    @Override // l.AbstractC8536
    public final String toString() {
        StringBuilder sb = new StringBuilder("NameQueryResponse[");
        sb.append(super.toString());
        sb.append(",addrEntry=");
        C15590[] c15590Arr = this.f26086;
        return new String(C9045.m23341(sb, c15590Arr != null ? Arrays.toString(c15590Arr) : "", "]"));
    }
}
