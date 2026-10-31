package l;

import android.widget.TextView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ۘ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4196 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13659;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13660;

    public /* synthetic */ RunnableC4196(int i, Object obj) {
        this.f13659 = i;
        this.f13660 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13659;
        int i2 = 1;
        Object obj = this.f13660;
        switch (i) {
            case 0:
                ((ActivityC1748) obj).m5856();
                break;
            case 1:
                C17735 c17735 = (C17735) obj;
                int i3 = C17735.f54278;
                c17735.getClass();
                System.currentTimeMillis();
                c17735.setVisibility(0);
                break;
            case 2:
                int i4 = ActivityC0477.f2061;
                ((ActivityC0477) obj).m2115(true);
                break;
            case 3:
                ((TextView) obj).setVisibility(4);
                break;
            case 4:
                ((InterfaceC4469) obj).mo3378();
                break;
            case 5:
                int i5 = C6306.f19498;
                ((C6306) obj).m34227(new C17335(i2));
                break;
            case 6:
                C13876.m33241((C13876) obj);
                break;
            case 7:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            default:
                int i6 = AbstractC4311.f13894;
                ((AbstractC4311) obj).m12968();
                break;
        }
    }
}
