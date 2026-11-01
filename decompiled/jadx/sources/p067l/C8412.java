package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8412 extends AbstractC3947 {
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        c4697.m9955("zip");
        final C12574 c12574 = (C12574) c4697.m9970();
        String strM28981 = c12574.m28981();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM28981, new String[0]);
        if (c12574.m28983()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (abstractC17043M42109.mo29985()) {
            AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
            C12826.requireNonNull(abstractC17043M38694);
            if (!abstractC17043M38694.mo29985()) {
                if (!C11164.m25781()) {
                    c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
                    return;
                }
            }
        } else if (!C11164.m25781()) {
            c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
            return;
        }
        final String strM52306 = c12574.m28980() ? C23527.m52306(abstractC17043M42109) : null;
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(AbstractC3947.m7831(c4697));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ᩹᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8412.m19601(this.f18420, c12574, c4697, strM52306);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (c12574.m28980()) {
            C18107 c18107M9969 = c4697.m9969();
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            C11896.m27216(c18107M9969, c20671BuildDialog.m46732(), strM52306);
            return;
        }
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19601(final C8412 c8412, C12574 c12574, final C4697 c4697, String str) {
        if (c12574.m28980()) {
            C11896.m27214(new InterfaceC14577(c8412) { // from class: l.ۗ᩹᩻
                @Override // p067l.InterfaceC14577
                public final /* synthetic */ void onCanceled() {
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final void mo6049(C13457 c13457, boolean z) {
                    C8412.m19602(c4697, c13457, z);
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo6050(Exception exc) {
                    return false;
                }
            }, c4697.m9965(), str);
        } else {
            m19602(c4697, null, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19602(C4697 c4697, C13457 c13457, boolean z) {
        C12574 c12574 = (C12574) c4697.m9970();
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C12436.class);
        c3313.m5786(c4697.m9957());
        c3313.m5777("zipPath", c12574.m28981());
        c3313.m5789(c4697);
        c3313.m5775(c4697.m9965(), c13457);
        c3313.m5778("keepApkSigBlock", z);
        c3313.m5772();
    }
}
