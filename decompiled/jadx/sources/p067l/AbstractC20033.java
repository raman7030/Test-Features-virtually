package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ᩴۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9P0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20033 implements InterfaceC13820 {
    public static final C19283 EMPTY_REGISTRY = C19283.m43977();

    /* JADX INFO: renamed from: ۧ */
    private C19204 m45396(InterfaceC10467 interfaceC10467) {
        if (interfaceC10467 instanceof AbstractC5951) {
            return ((AbstractC5951) interfaceC10467).newUninitializedMessageException();
        }
        return new C19204();
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC10467 m45395(InterfaceC10467 interfaceC10467) throws C4293 {
        if (interfaceC10467 == null || interfaceC10467.isInitialized()) {
            return interfaceC10467;
        }
        C4293 c4293M43740 = m45396(interfaceC10467).m43740();
        c4293M43740.m8713(interfaceC10467);
        throw c4293M43740;
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(AbstractC9303 abstractC9303) {
        return (InterfaceC10467) parsePartialFrom(abstractC9303, EMPTY_REGISTRY);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return m45395((InterfaceC10467) parsePartialFrom(abstractC9303, c19283));
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(AbstractC9303 abstractC9303) {
        return parseFrom(abstractC9303, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(AbstractC7962 abstractC7962, C19283 c19283) throws C4293 {
        AbstractC9303 abstractC9303Mo18428 = abstractC7962.mo18428();
        InterfaceC10467 interfaceC10467 = (InterfaceC10467) parsePartialFrom(abstractC9303Mo18428, c19283);
        try {
            abstractC9303Mo18428.mo21522(0);
            return interfaceC10467;
        } catch (C4293 e) {
            e.m8713(interfaceC10467);
            throw e;
        }
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(AbstractC7962 abstractC7962) {
        return parsePartialFrom(abstractC7962, EMPTY_REGISTRY);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return m45395(parsePartialFrom(abstractC7962, c19283));
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(AbstractC7962 abstractC7962) {
        return parseFrom(abstractC7962, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(byte[] bArr, int i, int i2, C19283 c19283) throws C4293 {
        AbstractC9303 abstractC9303M21516 = AbstractC9303.m21516(false, i, i2, bArr);
        InterfaceC10467 interfaceC10467 = (InterfaceC10467) parsePartialFrom(abstractC9303M21516, c19283);
        try {
            abstractC9303M21516.mo21522(0);
            return interfaceC10467;
        } catch (C4293 e) {
            e.m8713(interfaceC10467);
            throw e;
        }
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(byte[] bArr, C19283 c19283) {
        return parsePartialFrom(bArr, 0, bArr.length, c19283);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(ByteBuffer byteBuffer, C19283 c19283) throws C4293 {
        AbstractC9303 abstractC9303M21516;
        if (byteBuffer.hasArray()) {
            abstractC9303M21516 = AbstractC9303.m21516(false, byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
        } else if (byteBuffer.isDirect() && C22558.m50578()) {
            abstractC9303M21516 = new C15337(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC9303M21516 = AbstractC9303.m21516(true, 0, iRemaining, bArr);
        }
        InterfaceC10467 interfaceC10467 = (InterfaceC10467) parsePartialFrom(abstractC9303M21516, c19283);
        try {
            abstractC9303M21516.mo21522(0);
            return m45395(interfaceC10467);
        } catch (C4293 e) {
            e.m8713(interfaceC10467);
            throw e;
        }
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parseFrom(byte[] bArr, int i, int i2, C19283 c19283) {
        return m45395(parsePartialFrom(bArr, i, i2, c19283));
    }

    @Override // 
    public InterfaceC10467 parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(byte[] bArr, C19283 c19283) {
        return parseFrom(bArr, 0, bArr.length, c19283);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(InputStream inputStream, C19283 c19283) throws C4293 {
        AbstractC9303 abstractC9303M21515 = AbstractC9303.m21515(inputStream);
        InterfaceC10467 interfaceC10467 = (InterfaceC10467) parsePartialFrom(abstractC9303M21515, c19283);
        try {
            abstractC9303M21515.mo21522(0);
            return interfaceC10467;
        } catch (C4293 e) {
            e.m8713(interfaceC10467);
            throw e;
        }
    }

    @Override // 
    public InterfaceC10467 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(InputStream inputStream, C19283 c19283) {
        return m45395(parsePartialFrom(inputStream, c19283));
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC10467 parsePartialDelimitedFrom(InputStream inputStream, C19283 c19283) throws C4293 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C17349(inputStream, AbstractC9303.m21513(inputStream, i)), c19283);
        } catch (IOException e) {
            throw new C4293(e.getMessage(), e);
        }
    }

    @Override // 
    public InterfaceC10467 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return m45395(parsePartialDelimitedFrom(inputStream, c19283));
    }

    @Override // p067l.InterfaceC13820
    public InterfaceC10467 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
