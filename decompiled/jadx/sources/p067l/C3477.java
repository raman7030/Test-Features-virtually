package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.util.Collections;

/* JADX INFO: renamed from: l.֨ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3477 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f6977;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22924 f6978;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ String f6979;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ String f6980;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ String f6981;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str, String str2, String str3, String str4) {
        super(abstractActivityC5549, -1);
        this.f6978 = viewOnClickListenerC22924;
        this.f6977 = str;
        this.f6981 = str2;
        this.f6980 = str3;
        this.f6979 = str4;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (this.f6977.equals(strM33346)) {
            m33348();
            return;
        }
        if (!strM33346.startsWith(this.f6981)) {
            m33337(C0708d.f2599O);
            return;
        }
        try {
            String strM51374 = C22999.m51348(strM33346.substring(this.f6981.length()), this.f6978.f72135.m47143(this.f6980)).m51374();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6979);
            String strM25286 = C10965.m25286(sb, this.f6981, strM51374);
            if (this.f6978.f72135.m47134(strM25286)) {
                m33349(R.string.MT_Protector);
                return;
            }
            try {
                C20856 c20856 = this.f6978.f72135;
                String str = this.f6980;
                synchronized (c20856) {
                    String strM47152 = c20856.m47152(str);
                    c20856.m47116(Collections.singleton(str));
                    c20856.m47115(strM25286, strM47152);
                }
                this.f6978.m51238();
                this.f6978.m51239(strM25286);
                m33348();
            } catch (Exception e) {
                this.f6978.f72130.m13320((Throwable) e);
            }
        } catch (Exception e2) {
            this.f6978.f72130.m13320((Throwable) e2);
        }
    }
}
