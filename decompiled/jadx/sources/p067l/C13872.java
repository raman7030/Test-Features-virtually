package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13872 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC23930 f39188;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13872(AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f39188 = abstractDialogInterfaceOnClickListenerC23930;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930 = this.f39188;
        String strM33346 = m33346();
        if (strM33346.length() == 0) {
            m33348();
            return;
        }
        AbstractC17043 abstractC17043M8152 = C4069.m8152(strM33346);
        if (abstractC17043M8152.mo25094()) {
            m33349(R.string.MT_Protector);
            return;
        }
        try {
            abstractC17043M8152.mo37342();
            if (!abstractC17043M8152.mo25496()) {
                throw new IOException("Can not create file: " + abstractC17043M8152.mo25505());
            }
            abstractDialogInterfaceOnClickListenerC23930.f76035 = C4069.m8151();
            if (!abstractDialogInterfaceOnClickListenerC23930.f76035.isEmpty()) {
                abstractDialogInterfaceOnClickListenerC23930.f76039.notifyDataSetChanged();
            } else {
                abstractDialogInterfaceOnClickListenerC23930.f76029.dismiss();
            }
            m33348();
        } catch (IOException e) {
            m33337(e.getMessage());
        }
    }
}
