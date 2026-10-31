package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12104 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f36177;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12104(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f36177 = abstractDialogInterfaceOnClickListenerC22687;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f36177;
        String strM31260 = m31260();
        if (strM31260.length() == 0) {
            m31262();
            return;
        }
        AbstractC15440 abstractC15440M5957 = C1789.m5957(strM31260);
        if (abstractC15440M5957.mo23120()) {
            m31263(R.string.MT_Protector);
            return;
        }
        try {
            abstractC15440M5957.mo35195();
            if (!abstractC15440M5957.mo23545()) {
                throw new IOException("Can not create file: " + abstractC15440M5957.mo23554());
            }
            abstractDialogInterfaceOnClickListenerC22687.f73310 = C1789.m5956();
            if (!abstractDialogInterfaceOnClickListenerC22687.f73310.isEmpty()) {
                abstractDialogInterfaceOnClickListenerC22687.f73314.notifyDataSetChanged();
            } else {
                abstractDialogInterfaceOnClickListenerC22687.f73304.dismiss();
            }
            m31262();
        } catch (IOException e) {
            m31251(e.getMessage());
        }
    }
}
