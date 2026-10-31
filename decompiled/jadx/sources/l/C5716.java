package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5716 extends AbstractC19031 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11361 f17627;

    public C5716(C11361 c11361) {
        this.f17627 = c11361;
    }

    @Override // l.AbstractC19031
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo16148(Object obj) {
        Long l2 = (Long) obj;
        C11361 c11361 = this.f17627;
        InterfaceC1377 interfaceC1377M28114 = C11361.m28114(c11361);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            interfaceC1377M28114.seek(l2.longValue() * 102400);
            int iMo2559 = interfaceC1377M28114.mo2559(bArr);
            if (iMo2559 == -1) {
                return new byte[0];
            }
            return iMo2559 != 102400 ? Arrays.copyOf(bArr, iMo2559) : bArr;
        } finally {
            C11361.m28115(c11361, interfaceC1377M28114);
        }
    }
}
