package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6504 extends AbstractC20033 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13880 f16806;

    public C6504(C13880 c13880) {
        this.f16806 = c13880;
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
        return super.parseDelimitedFrom(inputStream);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return super.parseDelimitedFrom(inputStream, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
        return super.parseFrom(inputStream);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, C19283 c19283) {
        return super.parseFrom(inputStream, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
        return super.parseFrom(byteBuffer);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, C19283 c19283) {
        return super.parseFrom(byteBuffer, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC7962 abstractC7962) {
        return super.parseFrom(abstractC7962);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return super.parseFrom(abstractC7962, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC9303 abstractC9303) {
        return super.parseFrom(abstractC9303);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        return super.parseFrom(abstractC9303, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
        return super.parseFrom(bArr);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2) {
        return super.parseFrom(bArr, i, i2);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2, C19283 c19283) {
        return super.parseFrom(bArr, i, i2, c19283);
    }

    @Override // p067l.AbstractC20033, p067l.InterfaceC13820
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, C19283 c19283) {
        return super.parseFrom(bArr, c19283);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream) {
        return super.parsePartialDelimitedFrom(inputStream);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream, C19283 c19283) {
        return super.parsePartialDelimitedFrom(inputStream, c19283);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream) {
        return super.parsePartialFrom(inputStream);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream, C19283 c19283) {
        return super.parsePartialFrom(inputStream, c19283);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC7962 abstractC7962) {
        return super.parsePartialFrom(abstractC7962);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return super.parsePartialFrom(abstractC7962, c19283);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC9303 abstractC9303) {
        return super.parsePartialFrom(abstractC9303);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr) {
        return super.parsePartialFrom(bArr);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2) {
        return super.parsePartialFrom(bArr, i, i2);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2, C19283 c19283) {
        return super.parsePartialFrom(bArr, i, i2, c19283);
    }

    @Override // p067l.AbstractC20033
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, C19283 c19283) {
        return super.parsePartialFrom(bArr, c19283);
    }

    @Override // p067l.InterfaceC13820
    public final Object parsePartialFrom(AbstractC9303 abstractC9303, C19283 c19283) throws C4293 {
        C14550 c14550 = new C14550(this.f16806.f39199, 0);
        try {
            c14550.mergeFrom(abstractC9303, c19283);
            return c14550.buildPartial();
        } catch (C4293 e) {
            e.m8713(c14550.buildPartial());
            throw e;
        } catch (IOException e2) {
            C4293 c4293 = new C4293(e2.getMessage(), e2);
            c4293.m8713(c14550.buildPartial());
            throw c4293;
        }
    }
}
