package p067l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10821 extends FilterInputStream implements Iterable, InterfaceC16534 {

    /* JADX INFO: renamed from: ᩹ */
    public static final InterfaceC4410 f29985 = C13128.m30022(C10821.class);

    /* JADX INFO: renamed from: ᩸ */
    public final C15322 f29986;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C10821(C20880 c20880, InputStream inputStream) {
        super(inputStream);
        this.f29986 = c20880;
    }

    public C10821(C15322 c15322, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.f29986 = c15322;
    }

    public final AbstractC7468 readObject() {
        C15322 c15322 = this.f29986;
        try {
            c15322.getClass();
            AbstractC13503 abstractC13503M34888 = C15322.m34888(this);
            InterfaceC4410 interfaceC4410 = f29985;
            interfaceC4410.mo9190(abstractC13503M34888, "Read ASN.1 tag {}");
            int iM34882 = C15322.m34882(this);
            interfaceC4410.mo9190(Integer.valueOf(iM34882), "Read ASN.1 object length: {}");
            AbstractC7468 abstractC7468Mo4315 = abstractC13503M34888.mo6110(c15322).mo4315(abstractC13503M34888, C15322.m34886(iM34882, this));
            interfaceC4410.mo9195(abstractC7468Mo4315, "Read ASN.1 object: {}");
            return abstractC7468Mo4315;
        } catch (C4786 e) {
            throw e;
        } catch (Exception e2) {
            throw new C4786(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m24940(int i) {
        this.f29986.getClass();
        return C15322.m34886(i, this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C11492(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC13503 m24942() {
        this.f29986.getClass();
        return C15322.m34888(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24941() {
        this.f29986.getClass();
        return C15322.m34882(this);
    }
}
