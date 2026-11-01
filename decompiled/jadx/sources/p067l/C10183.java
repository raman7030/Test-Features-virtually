package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.۠ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10183 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f28239;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22924 f28240;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ String f28241;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ String f28242;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ String f28243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10183(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str, String str2, String str3, String str4) {
        super(abstractActivityC5549, -1);
        this.f28240 = viewOnClickListenerC22924;
        this.f28239 = str;
        this.f28243 = str2;
        this.f28242 = str3;
        this.f28241 = str4;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (this.f28239.equals(strM33346)) {
            m33349(R.string.MT_Protector);
            return;
        }
        if (!strM33346.startsWith(this.f28243)) {
            m33337(C0708d.f2599O);
            return;
        }
        try {
            String strM51374 = C22999.m51348(strM33346.substring(this.f28243.length()), this.f28240.f72135.m47143(this.f28242)).m51374();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28241);
            String strM25286 = C10965.m25286(sb, this.f28243, strM51374);
            if (this.f28240.f72135.m47134(strM25286)) {
                m33349(R.string.MT_Protector);
                return;
            }
            try {
                C20856 c20856 = this.f28240.f72135;
                String str = this.f28242;
                synchronized (c20856) {
                    c20856.m47115(strM25286, c20856.m47152(str));
                }
                this.f28240.m51238();
                this.f28240.m51239(strM25286);
                m33348();
            } catch (Exception e) {
                this.f28240.f72130.m13320((Throwable) e);
            }
        } catch (Exception e2) {
            this.f28240.f72130.m13320((Throwable) e2);
        }
    }
}
