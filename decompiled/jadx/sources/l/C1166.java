package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.Collections;

/* JADX INFO: renamed from: l.֨ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1166 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4208;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f4209;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4210;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4211;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        super(abstractActivityC3346, -1);
        this.f4209 = viewOnClickListenerC21628;
        this.f4208 = str;
        this.f4212 = str2;
        this.f4211 = str3;
        this.f4210 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (this.f4208.equals(strM31260)) {
            m31262();
            return;
        }
        if (!strM31260.startsWith(this.f4212)) {
            m31251(d.O);
            return;
        }
        try {
            String strM49025 = C21707.m48999(strM31260.substring(this.f4212.length()), this.f4209.f69432.m44847(this.f4211)).m49025();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4210);
            String strM23341 = C9045.m23341(sb, this.f4212, strM49025);
            if (this.f4209.f69432.m44838(strM23341)) {
                m31263(R.string.MT_Protector);
                return;
            }
            try {
                C19452 c19452 = this.f4209.f69432;
                String str = this.f4211;
                synchronized (c19452) {
                    String strM44856 = c19452.m44856(str);
                    c19452.m44820(Collections.singleton(str));
                    c19452.m44819(strM23341, strM44856);
                }
                this.f4209.m48890();
                this.f4209.m48891(strM23341);
                m31262();
            } catch (Exception e) {
                this.f4209.f69427.m11384((Throwable) e);
            }
        } catch (Exception e2) {
            this.f4209.f69427.m11384((Throwable) e2);
        }
    }
}
