package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21073 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f66207;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f66208;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f66209;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f66210;

    public /* synthetic */ ViewOnClickListenerC21073(Object obj, Object obj2, Object obj3, int i) {
        this.f66209 = i;
        this.f66210 = obj;
        this.f66208 = obj2;
        this.f66207 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f66209;
        Object obj = this.f66207;
        Object obj2 = this.f66208;
        Object obj3 = this.f66210;
        switch (i) {
            case 0:
                ViewOnClickListenerC20541.m46378((C10748) obj3, (ViewOnClickListenerC20541) obj2, (C21103) obj);
                break;
            case 1:
                C9315 c9315 = (C9315) obj3;
                c9315.m21562();
                C4345.m8962(c9315.f25331, c9315.f25329, (EditText) obj2, (EditText) obj);
                break;
            default:
                C4697 c4697 = (C4697) obj2;
                AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = (AbstractDialogInterfaceOnClickListenerC14580) obj;
                String path = ((InterfaceC19370) obj3).getPath();
                boolean z = false;
                AbstractC17043 abstractC17043M42109 = C18524.m42109(path, new String[0]);
                AbstractC17043 abstractC17043M421010 = C18524.m42109(C17073.m38720(4, 0, path), new String[0]);
                if (abstractC17043M421010.mo25094()) {
                    try {
                        C19210.m43749(c4697.m9962(), EnumC17868.MODIFY_DIRECTORY_LINKED);
                        AbstractC17043 abstractC17043M38678 = abstractC17043M42109.m38678(".tmp");
                        boolean z2 = abstractC17043M421010.mo25502(abstractC17043M38678) && abstractC17043M42109.mo25502(abstractC17043M421010) && abstractC17043M38678.mo25502(abstractC17043M42109);
                        if (z2) {
                            DialogInterfaceOnClickListenerC12648.m29080(c4697.m9965(), "restore_backup", C7050.m16203(R.string.MT_Protector, abstractC17043M421010.getName()), true);
                        }
                        z = z2;
                    } catch (C3924 e) {
                        c4697.m9965().m12259(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } else if (abstractC17043M42109.mo25502(abstractC17043M421010)) {
                    z = true;
                }
                if (z) {
                    int i2 = C16114.f47424;
                    C16114.m36688(abstractC17043M42109.mo25505(), true);
                    C16114.m36688(abstractC17043M421010.mo25505(), true);
                    c4697.m9968(abstractC17043M421010.getName());
                    C17127.m38756();
                    C10987.m25375();
                } else {
                    C22682.m50793(R.string.MT_Protector);
                }
                abstractDialogInterfaceOnClickListenerC14580.m33348();
                break;
        }
    }
}
