package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1E */
/* JADX INFO: loaded from: classes.dex */
public final class C21740 extends AbstractC4806 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21574 f69707;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f69708;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f69709;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BigInteger f69710;

    public C21740() {
        super(1, "NegTokenTarg");
    }

    @Override // l.AbstractC4806
    /* JADX INFO: renamed from: ֫ */
    public final void mo14017(C12441 c12441, C1818 c1818) throws IOException {
        AbstractC11716 abstractC11716 = AbstractC11716.f34968;
        C23690 c23690 = new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 1).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) c1818, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(new C8377(), byteArrayOutputStream);
        try {
            c15948.m37722(c23690);
            c15948.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c12441.m26077(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c15948.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC4806
    /* JADX INFO: renamed from: ֫ */
    public final void mo14016(C12441 c12441) throws C20329 {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f69710 != null) {
                AbstractC11716 abstractC11716 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 0).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C2524(this.f69710), true));
            }
            if (this.f69707 != null) {
                AbstractC11716 abstractC11717 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 1).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) this.f69707, true));
            }
            byte[] bArr = this.f69709;
            if (bArr != null && bArr.length > 0) {
                AbstractC11716 abstractC11718 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 2).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C10285(this.f69709), true));
            }
            byte[] bArr2 = this.f69708;
            if (bArr2 != null && bArr2.length > 0) {
                AbstractC11716 abstractC11719 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 3).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C10285(this.f69708), true));
            }
            mo14017(c12441, new C1818(arrayList));
        } catch (IOException e) {
            throw new C20329("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49066(byte[] bArr) {
        try {
            C8894 c8894 = new C8894(new C19478(), new C12441(bArr).m26085());
            try {
                m14015(c8894.readObject());
                c8894.close();
            } catch (Throwable th) {
                try {
                    c8894.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C20329("Could not read NegTokenTarg from buffer", e);
        }
    }

    @Override // l.AbstractC4806
    /* JADX INFO: renamed from: ֫ */
    public final void mo14018(C23690 c23690) throws C20329 {
        int iM52234 = c23690.m52234();
        if (iM52234 == 0) {
            AbstractC5366 abstractC5366M52235 = c23690.m52235();
            if (abstractC5366M52235 instanceof C2524) {
                this.f69710 = ((C2524) abstractC5366M52235).getValue();
                return;
            } else {
                throw new C20329("Expected the negResult (ENUMERATED) contents, not: " + this.f69707);
            }
        }
        if (iM52234 == 1) {
            AbstractC5366 abstractC5366M52236 = c23690.m52235();
            if (abstractC5366M52236 instanceof C21574) {
                this.f69707 = (C21574) abstractC5366M52236;
                return;
            } else {
                throw new C20329("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + abstractC5366M52236);
            }
        }
        if (iM52234 == 2) {
            AbstractC5366 abstractC5366M52237 = c23690.m52235();
            if (abstractC5366M52237 instanceof C10285) {
                this.f69709 = ((C10285) abstractC5366M52237).getValue();
                return;
            } else {
                throw new C20329("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC5366M52237);
            }
        }
        if (iM52234 != 3) {
            throw new C20329("Unknown Object Tag " + c23690.m52234() + " encountered.");
        }
        AbstractC5366 abstractC5366M52238 = c23690.m52235();
        if (abstractC5366M52238 instanceof C10285) {
            this.f69708 = ((C10285) abstractC5366M52238).getValue();
        } else {
            throw new C20329("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC5366M52238);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m49067() {
        return this.f69709;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49069(byte[] bArr) {
        this.f69709 = bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49068(byte[] bArr) {
        this.f69708 = bArr;
    }
}
