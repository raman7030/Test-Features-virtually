package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1E */
/* JADX INFO: loaded from: classes.dex */
public final class C23030 extends AbstractC6936 {

    /* JADX INFO: renamed from: ܳ */
    public C22872 f72414;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f72415;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f72416;

    /* JADX INFO: renamed from: ᩳ */
    public BigInteger f72417;

    public C23030() {
        super(1, "NegTokenTarg");
    }

    @Override // p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public final void mo15897(C14192 c14192, C4096 c4096) throws IOException {
        AbstractC13503 abstractC13503 = AbstractC13503.f37968;
        C24883 c24883 = new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 1).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) c4096, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17525 c17525 = new C17525(new C10330(), byteArrayOutputStream);
        try {
            c17525.m39897(c24883);
            c17525.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c14192.m28102(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c17525.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public final void mo15896(C14192 c14192) throws C21689 {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f72417 != null) {
                AbstractC13503 abstractC13503 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 0).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) new C4767(this.f72417), true));
            }
            if (this.f72414 != null) {
                AbstractC13503 abstractC13504 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 1).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) this.f72414, true));
            }
            byte[] bArr = this.f72416;
            if (bArr != null && bArr.length > 0) {
                AbstractC13503 abstractC13505 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 2).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) new C12143(this.f72416), true));
            }
            byte[] bArr2 = this.f72415;
            if (bArr2 != null && bArr2.length > 0) {
                AbstractC13503 abstractC13506 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 3).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) new C12143(this.f72415), true));
            }
            mo15897(c14192, new C4096(arrayList));
        } catch (IOException e) {
            throw new C21689("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51415(byte[] bArr) {
        try {
            C10821 c10821 = new C10821(new C20880(), new C14192(bArr).m28110());
            try {
                m15895(c10821.readObject());
                c10821.close();
            } catch (Throwable th) {
                try {
                    c10821.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C21689("Could not read NegTokenTarg from buffer", e);
        }
    }

    @Override // p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public final void mo15898(C24883 c24883) throws C21689 {
        int iM54637 = c24883.m54637();
        if (iM54637 == 0) {
            AbstractC7468 abstractC7468M54638 = c24883.m54638();
            if (abstractC7468M54638 instanceof C4767) {
                this.f72417 = ((C4767) abstractC7468M54638).getValue();
                return;
            } else {
                throw new C21689("Expected the negResult (ENUMERATED) contents, not: " + this.f72414);
            }
        }
        if (iM54637 == 1) {
            AbstractC7468 abstractC7468M54639 = c24883.m54638();
            if (abstractC7468M54639 instanceof C22872) {
                this.f72414 = (C22872) abstractC7468M54639;
                return;
            } else {
                throw new C21689("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + abstractC7468M54639);
            }
        }
        if (iM54637 == 2) {
            AbstractC7468 abstractC7468M546310 = c24883.m54638();
            if (abstractC7468M546310 instanceof C12143) {
                this.f72416 = ((C12143) abstractC7468M546310).getValue();
                return;
            } else {
                throw new C21689("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC7468M546310);
            }
        }
        if (iM54637 != 3) {
            throw new C21689("Unknown Object Tag " + c24883.m54637() + " encountered.");
        }
        AbstractC7468 abstractC7468M546311 = c24883.m54638();
        if (abstractC7468M546311 instanceof C12143) {
            this.f72415 = ((C12143) abstractC7468M546311).getValue();
        } else {
            throw new C21689("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC7468M546311);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m51416() {
        return this.f72416;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51418(byte[] bArr) {
        this.f72416 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51417(byte[] bArr) {
        this.f72415 = bArr;
    }
}
