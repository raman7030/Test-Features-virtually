package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۚܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5400 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16810;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f16811;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16812;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16813;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5400(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3) {
        super(abstractActivityC3346, -1);
        this.f16811 = viewOnClickListenerC21628;
        this.f16813 = str;
        this.f16812 = str2;
        this.f16810 = str3;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String str = this.f16812;
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f16811;
        String strM31260 = m31260();
        String str2 = this.f16813;
        if (!strM31260.startsWith(str2)) {
            m31251(d.O);
            return;
        }
        try {
            String str3 = str + "/" + str2 + C21707.m48999(strM31260.substring(str2.length()), viewOnClickListenerC21628.f69432.m44847(str)).m49025();
            if (viewOnClickListenerC21628.f69432.m44838(str3)) {
                m31263(R.string.MT_Protector);
                return;
            }
            try {
                viewOnClickListenerC21628.f69432.m44819(str3, this.f16810);
                viewOnClickListenerC21628.m48890();
                viewOnClickListenerC21628.m48891(str3);
                m31262();
            } catch (Exception e) {
                viewOnClickListenerC21628.f69427.m11384((Throwable) e);
            }
        } catch (Exception e2) {
            viewOnClickListenerC21628.f69427.m11384((Throwable) e2);
        }
    }
}
