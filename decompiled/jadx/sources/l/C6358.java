package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6358 extends AbstractC1661 {
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907("zip");
        final C10738 c10738 = (C10738) c2450.m7922();
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        if (c10738.m26939()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (abstractC15440M39866.mo27924()) {
            AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
            return;
        }
        final String strM49978 = c10738.m26936() ? C22263.m49978(abstractC15440M39866) : null;
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(AbstractC1661.m5601(c2450));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ᩹᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6358.m17658(this.f15586, c10738, c2450, strM49978);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (c10738.m26936()) {
            C16560 c16560M7921 = c2450.m7921();
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            C10025.m25199(c16560M7921, c19258BuildDialog.m44438(), strM49978);
            return;
        }
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17658(final C6358 c6358, C10738 c10738, final C2450 c2450, String str) {
        if (c10738.m26936()) {
            C10025.m25197(new InterfaceC12846(c6358) { // from class: l.ۗ᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z) {
                    C6358.m17659(c2450, c11667, z);
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }
            }, c2450.m7917(), str);
        } else {
            m17659(c2450, null, false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17659(C2450 c2450, C11667 c11667, boolean z) {
        C10738 c10738 = (C10738) c2450.m7922();
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C10592.class);
        c0994.m3483(c2450.m7909());
        c0994.m3474("zipPath", c10738.m26937());
        c0994.m3486(c2450);
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
