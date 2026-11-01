package p067l;

import android.widget.TextView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ۘ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6357 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16472;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f16473;

    public /* synthetic */ RunnableC6357(int i, Object obj) {
        this.f16472 = i;
        this.f16473 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16472;
        int i2 = 1;
        Object obj = this.f16473;
        switch (i) {
            case 0:
                ((ActivityC4030) obj).m8066();
                break;
            case 1:
                C19223 c19223 = (C19223) obj;
                int i3 = C19223.f57470;
                c19223.getClass();
                System.currentTimeMillis();
                c19223.setVisibility(0);
                break;
            case 2:
                int i4 = ActivityC2822.f4836;
                ((ActivityC2822) obj).m4496(true);
                break;
            case 3:
                ((TextView) obj).setVisibility(4);
                break;
            case 4:
                ((InterfaceC6616) obj).mo5697();
                break;
            case 5:
                int i5 = C8362.f22369;
                ((C8362) obj).m36360(new C18844(i2));
                break;
            case 6:
                C15556.m35360((C15556) obj);
                break;
            case 7:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            default:
                int i6 = AbstractC6465.f16709;
                ((AbstractC6465) obj).m14832();
                break;
        }
    }
}
