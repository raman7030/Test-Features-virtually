package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7801 extends AbstractC20456 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13166 f20472;

    public C7801(C13166 c13166) {
        this.f20472 = c13166;
    }

    @Override // p067l.AbstractC20456
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18067(Object obj) {
        Long l2 = (Long) obj;
        C13166 c13166 = this.f20472;
        InterfaceC3678 interfaceC3678M30158 = C13166.m30158(c13166);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            interfaceC3678M30158.seek(l2.longValue() * 102400);
            int iMo4915 = interfaceC3678M30158.mo4915(bArr);
            if (iMo4915 == -1) {
                return new byte[0];
            }
            return iMo4915 != 102400 ? Arrays.copyOf(bArr, iMo4915) : bArr;
        } finally {
            C13166.m30159(c13166, interfaceC3678M30158);
        }
    }
}
