package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21363 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f68810;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f68811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16560 f68812;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10738 f68813;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo29665();

    public AbstractC21363(C16560 c16560, C10738 c10738, ArrayList arrayList, boolean z, String str) {
        this.f68812 = c16560;
        this.f68813 = c10738;
        this.f68810 = arrayList;
        this.f68809 = z;
        this.f68811 = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48406() {
        C10738 c10738 = this.f68813;
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c10738.m26937(), new String[0]);
        boolean zMo27924 = abstractC15440M39866.mo27924();
        C16560 c16560 = this.f68812;
        if (zMo27924) {
            AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, c10738.m26937()), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, c10738.m26937()), false);
            return;
        }
        if (this.f68809) {
            C10025.m25197(new C5135(this), c16560.m39056(), this.f68811);
        } else {
            new C15011(this, null, false).m20274();
        }
    }
}
