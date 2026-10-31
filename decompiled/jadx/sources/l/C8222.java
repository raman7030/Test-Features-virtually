package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۠ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8222 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25329;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f25330;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25331;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25332;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8222(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        super(abstractActivityC3346, -1);
        this.f25330 = viewOnClickListenerC21628;
        this.f25329 = str;
        this.f25333 = str2;
        this.f25332 = str3;
        this.f25331 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (this.f25329.equals(strM31260)) {
            m31263(R.string.MT_Protector);
            return;
        }
        if (!strM31260.startsWith(this.f25333)) {
            m31251(d.O);
            return;
        }
        try {
            String strM49025 = C21707.m48999(strM31260.substring(this.f25333.length()), this.f25330.f69432.m44847(this.f25332)).m49025();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25331);
            String strM23341 = C9045.m23341(sb, this.f25333, strM49025);
            if (this.f25330.f69432.m44838(strM23341)) {
                m31263(R.string.MT_Protector);
                return;
            }
            try {
                C19452 c19452 = this.f25330.f69432;
                String str = this.f25332;
                synchronized (c19452) {
                    c19452.m44819(strM23341, c19452.m44856(str));
                }
                this.f25330.m48890();
                this.f25330.m48891(strM23341);
                m31262();
            } catch (Exception e) {
                this.f25330.f69427.m11384((Throwable) e);
            }
        } catch (Exception e2) {
            this.f25330.f69427.m11384((Throwable) e2);
        }
    }
}
