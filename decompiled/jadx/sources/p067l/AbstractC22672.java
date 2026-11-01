package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22672 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f71505;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f71506;

    /* JADX INFO: renamed from: ܽ */
    public String f71507;

    /* JADX INFO: renamed from: ܿ */
    public C18107 f71508;

    /* JADX INFO: renamed from: ᩳ */
    public C12574 f71509;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo31727();

    public AbstractC22672(C18107 c18107, C12574 c12574, ArrayList arrayList, boolean z, String str) {
        this.f71508 = c18107;
        this.f71509 = c12574;
        this.f71506 = arrayList;
        this.f71505 = z;
        this.f71507 = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: ۧ */
    public final void m50742() {
        C12574 c12574 = this.f71509;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c12574.m28981(), new String[0]);
        boolean zMo29985 = abstractC17043M42109.mo29985();
        C18107 c18107 = this.f71508;
        if (zMo29985) {
            AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
            C12826.requireNonNull(abstractC17043M38694);
            if (!abstractC17043M38694.mo29985()) {
                if (!C11164.m25781()) {
                    c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, c12574.m28981()), false);
                    return;
                }
            }
        } else if (!C11164.m25781()) {
            c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, c12574.m28981()), false);
            return;
        }
        if (this.f71505) {
            C11896.m27214(new C7249(this), c18107.m41282(), this.f71507);
        } else {
            new C16635(this, null, false).m22250();
        }
    }
}
