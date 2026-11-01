package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9XD */
/* JADX INFO: loaded from: classes4.dex */
public class C16993 extends AbstractC6936 {

    /* JADX INFO: renamed from: ܽ */
    public byte[] f50249;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f50250;

    public C16993() {
        super(0, "NegTokenInit");
        this.f50250 = new ArrayList();
    }

    @Override // p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public final void mo15896(C14192 c14192) throws C21689 {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f50250;
            if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                AbstractC13503 abstractC13503 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 0).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) new C4096(arrayList3), true));
            }
            byte[] bArr = this.f50249;
            if (bArr != null && bArr.length > 0) {
                AbstractC13503 abstractC13504 = AbstractC13503.f37968;
                arrayList.add(new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, 2).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) new C12143(this.f50249), true));
            }
            mo15897(c14192, new C4096(arrayList));
        } catch (IOException e) {
            throw new C21689("Unable to write NegTokenInit", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38586(byte[] bArr) throws C21689 {
        try {
            C10821 c10821 = new C10821(new C20880(), new C14192(bArr).m28110());
            try {
                C24883 c24883 = (C24883) c10821.readObject();
                if (c24883.m17239().m30659() != EnumC24231.APPLICATION) {
                    throw new C21689("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + c24883);
                }
                C4096 c4096 = (C4096) c24883.m54636(AbstractC13503.f37964);
                AbstractC7468 abstractC7468 = c4096.get(0);
                if (!(abstractC7468 instanceof C22872)) {
                    throw new C21689("Expected to find the SPNEGO OID (" + C23700.f75424 + "), not: " + abstractC7468);
                }
                m15895(c4096.get(1));
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
            throw new C21689("Could not read NegTokenInit from buffer", e);
        }
    }

    @Override // p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public void mo15898(C24883 c24883) throws C21689 {
        if (c24883.m54638().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM54637 = c24883.m54637();
        if (iM54637 == 0) {
            m38589(c24883.m54638());
            return;
        }
        if (iM54637 != 1) {
            if (iM54637 == 2) {
                m38587(c24883.m54638());
            } else {
                if (iM54637 == 3) {
                    return;
                }
                throw new C21689("Unknown Object Tag " + c24883.m54637() + " encountered.");
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38587(AbstractC7468 abstractC7468) throws C21689 {
        if (!(abstractC7468 instanceof C12143)) {
            throw new C21689("Expected the MechToken (OCTET_STRING) contents, not: " + abstractC7468);
        }
        this.f50249 = ((C12143) abstractC7468).getValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38589(AbstractC7468 abstractC7468) throws C21689 {
        if (!(abstractC7468 instanceof C4096)) {
            throw new C21689("Expected the MechTypeList (SEQUENCE) contents, not: " + abstractC7468);
        }
        for (AbstractC7468 abstractC7469 : (C4096) abstractC7468) {
            if (!(abstractC7469 instanceof C22872)) {
                throw new C21689("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + abstractC7469);
            }
            this.f50250.add((C22872) abstractC7469);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38585(C22872 c22872) {
        this.f50250.add(c22872);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38588(byte[] bArr) {
        this.f50249 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m38584() {
        return this.f50250;
    }
}
