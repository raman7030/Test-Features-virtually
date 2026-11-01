package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: CA2B */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6936 {

    /* JADX INFO: renamed from: ֫ */
    public String f18043;

    /* JADX INFO: renamed from: ۧ */
    public int f18044;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15896(C14192 c14192);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15898(C24883 c24883);

    public AbstractC6936(int i, String str) {
        this.f18044 = i;
        this.f18043 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15897(C14192 c14192, C4096 c4096) throws IOException {
        AbstractC13503 abstractC13503 = AbstractC13503.f37968;
        C24883 c24883 = new C24883(AbstractC13503.m30656(EnumC24231.CONTEXT_SPECIFIC, this.f18044).m30658(EnumC2773.CONSTRUCTED), (AbstractC7468) c4096, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C23700.f75424);
        arrayList.add(c24883);
        C24883 c24884 = new C24883(AbstractC13503.m30656(EnumC24231.APPLICATION, 0), (AbstractC7468) new C4096(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17525 c17525 = new C17525(new C10330(), byteArrayOutputStream);
        try {
            c17525.m39897(c24884);
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

    /* JADX INFO: renamed from: ֫ */
    public final void m15895(AbstractC7468 abstractC7468) throws C21689 {
        boolean z = abstractC7468 instanceof C24883;
        int i = this.f18044;
        String str = this.f18043;
        if (z) {
            C24883 c24883 = (C24883) abstractC7468;
            if (c24883.m54637() == i) {
                AbstractC7468 abstractC7468M54638 = c24883.m54638();
                if (!(abstractC7468M54638 instanceof C4096)) {
                    throw new C21689("Expected a " + str + " (SEQUENCE), not: " + abstractC7468M54638);
                }
                for (AbstractC7468 abstractC7469 : (C4096) abstractC7468M54638) {
                    if (!(abstractC7469 instanceof C24883)) {
                        throw new C21689("Expected an ASN.1 TaggedObject as " + str + " contents, not: " + abstractC7469);
                    }
                    mo15898((C24883) abstractC7469);
                }
                return;
            }
        }
        throw new C21689("Expected to find the " + str + " (CHOICE [" + i + "]) header, not: " + abstractC7468);
    }
}
