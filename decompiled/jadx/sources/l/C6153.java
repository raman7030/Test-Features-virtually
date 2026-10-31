package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6153 extends AbstractC18587 {
    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
        return super.parseDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return super.parseDelimitedFrom(inputStream, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
        return super.parseFrom(inputStream);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, C17798 c17798) {
        return super.parseFrom(inputStream, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
        return super.parseFrom(byteBuffer);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, C17798 c17798) {
        return super.parseFrom(byteBuffer, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC5886 abstractC5886) {
        return super.parseFrom(abstractC5886);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return super.parseFrom(abstractC5886, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC7297 abstractC7297) {
        return super.parseFrom(abstractC7297);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        return super.parseFrom(abstractC7297, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
        return super.parseFrom(bArr);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2) {
        return super.parseFrom(bArr, i, i2);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2, C17798 c17798) {
        return super.parseFrom(bArr, i, i2, c17798);
    }

    @Override // l.AbstractC18587, l.InterfaceC12050
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, C17798 c17798) {
        return super.parseFrom(bArr, c17798);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream) {
        return super.parsePartialDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream, C17798 c17798) {
        return super.parsePartialDelimitedFrom(inputStream, c17798);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream) {
        return super.parsePartialFrom(inputStream);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream, C17798 c17798) {
        return super.parsePartialFrom(inputStream, c17798);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC5886 abstractC5886) {
        return super.parsePartialFrom(abstractC5886);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return super.parsePartialFrom(abstractC5886, c17798);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC7297 abstractC7297) {
        return super.parsePartialFrom(abstractC7297);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr) {
        return super.parsePartialFrom(bArr);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2) {
        return super.parsePartialFrom(bArr, i, i2);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2, C17798 c17798) {
        return super.parsePartialFrom(bArr, i, i2, c17798);
    }

    @Override // l.AbstractC18587
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, C17798 c17798) {
        return super.parsePartialFrom(bArr, c17798);
    }

    @Override // l.InterfaceC12050
    public final Object parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C11798 c11798NewBuilder = C1529.newBuilder();
        try {
            c11798NewBuilder.m28854(abstractC7297, c17798);
            return c11798NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c11798NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c11798NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c11798NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
