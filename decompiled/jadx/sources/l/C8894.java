package l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8894 extends FilterInputStream implements Iterable, InterfaceC14905 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f27061 = C11321.m27961(C8894.class);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13630 f27062;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C8894(C19478 c19478, InputStream inputStream) {
        super(inputStream);
        this.f27062 = c19478;
    }

    public C8894(C13630 c13630, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.f27062 = c13630;
    }

    public final AbstractC5366 readObject() {
        C13630 c13630 = this.f27062;
        try {
            c13630.getClass();
            AbstractC11716 abstractC11716M32773 = C13630.m32773(this);
            InterfaceC2148 interfaceC2148 = f27061;
            interfaceC2148.mo7095(abstractC11716M32773, "Read ASN.1 tag {}");
            int iM32767 = C13630.m32767(this);
            interfaceC2148.mo7095(Integer.valueOf(iM32767), "Read ASN.1 object length: {}");
            AbstractC5366 abstractC5366Mo1923 = abstractC11716M32773.mo3869(c13630).mo1923(abstractC11716M32773, C13630.m32771(iM32767, this));
            interfaceC2148.mo7100(abstractC5366Mo1923, "Read ASN.1 object: {}");
            return abstractC5366Mo1923;
        } catch (C2544 e) {
            throw e;
        } catch (Exception e2) {
            throw new C2544(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22969(int i) {
        this.f27062.getClass();
        return C13630.m32771(i, this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9600(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC11716 m22971() {
        this.f27062.getClass();
        return C13630.m32773(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22970() {
        this.f27062.getClass();
        return C13630.m32767(this);
    }
}
