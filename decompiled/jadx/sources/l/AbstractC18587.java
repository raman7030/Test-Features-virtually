package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ᩴۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9P0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18587 implements InterfaceC12050 {
    public static final C17798 EMPTY_REGISTRY = C17798.m41731();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17715 m43118(InterfaceC8522 interfaceC8522) {
        if (interfaceC8522 instanceof AbstractC3770) {
            return ((AbstractC3770) interfaceC8522).newUninitializedMessageException();
        }
        return new C17715();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC8522 m43117(InterfaceC8522 interfaceC8522) throws C2025 {
        if (interfaceC8522 == null || interfaceC8522.isInitialized()) {
            return interfaceC8522;
        }
        C2025 c2025M41494 = m43118(interfaceC8522).m41494();
        c2025M41494.m6587(interfaceC8522);
        throw c2025M41494;
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(AbstractC7297 abstractC7297) {
        return (InterfaceC8522) parsePartialFrom(abstractC7297, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return m43117((InterfaceC8522) parsePartialFrom(abstractC7297, c17798));
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(AbstractC7297 abstractC7297) {
        return parseFrom(abstractC7297, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(AbstractC5886 abstractC5886, C17798 c17798) throws C2025 {
        AbstractC7297 abstractC7297Mo16502 = abstractC5886.mo16502();
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) parsePartialFrom(abstractC7297Mo16502, c17798);
        try {
            abstractC7297Mo16502.mo19554(0);
            return interfaceC8522;
        } catch (C2025 e) {
            e.m6587(interfaceC8522);
            throw e;
        }
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(AbstractC5886 abstractC5886) {
        return parsePartialFrom(abstractC5886, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return m43117(parsePartialFrom(abstractC5886, c17798));
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(AbstractC5886 abstractC5886) {
        return parseFrom(abstractC5886, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(byte[] bArr, int i, int i2, C17798 c17798) throws C2025 {
        AbstractC7297 abstractC7297M19548 = AbstractC7297.m19548(false, i, i2, bArr);
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) parsePartialFrom(abstractC7297M19548, c17798);
        try {
            abstractC7297M19548.mo19554(0);
            return interfaceC8522;
        } catch (C2025 e) {
            e.m6587(interfaceC8522);
            throw e;
        }
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(byte[] bArr, C17798 c17798) {
        return parsePartialFrom(bArr, 0, bArr.length, c17798);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(ByteBuffer byteBuffer, C17798 c17798) throws C2025 {
        AbstractC7297 abstractC7297M19548;
        if (byteBuffer.hasArray()) {
            abstractC7297M19548 = AbstractC7297.m19548(false, byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
        } else if (byteBuffer.isDirect() && C21244.m48247()) {
            abstractC7297M19548 = new C13646(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC7297M19548 = AbstractC7297.m19548(true, 0, iRemaining, bArr);
        }
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) parsePartialFrom(abstractC7297M19548, c17798);
        try {
            abstractC7297M19548.mo19554(0);
            return m43117(interfaceC8522);
        } catch (C2025 e) {
            e.m6587(interfaceC8522);
            throw e;
        }
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parseFrom(byte[] bArr, int i, int i2, C17798 c17798) {
        return m43117(parsePartialFrom(bArr, i, i2, c17798));
    }

    @Override // 
    public InterfaceC8522 parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(byte[] bArr, C17798 c17798) {
        return parseFrom(bArr, 0, bArr.length, c17798);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(InputStream inputStream, C17798 c17798) throws C2025 {
        AbstractC7297 abstractC7297M19547 = AbstractC7297.m19547(inputStream);
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) parsePartialFrom(abstractC7297M19547, c17798);
        try {
            abstractC7297M19547.mo19554(0);
            return interfaceC8522;
        } catch (C2025 e) {
            e.m6587(interfaceC8522);
            throw e;
        }
    }

    @Override // 
    public InterfaceC8522 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(InputStream inputStream, C17798 c17798) {
        return m43117(parsePartialFrom(inputStream, c17798));
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC8522 parsePartialDelimitedFrom(InputStream inputStream, C17798 c17798) throws C2025 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C15763(inputStream, AbstractC7297.m19545(inputStream, i)), c17798);
        } catch (IOException e) {
            throw new C2025(e.getMessage(), e);
        }
    }

    @Override // 
    public InterfaceC8522 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return m43117(parsePartialDelimitedFrom(inputStream, c17798));
    }

    @Override // l.InterfaceC12050
    public InterfaceC8522 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
