package p067l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20013 implements InterfaceC9934, InterfaceC22729, InterfaceC3986 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f60843;

    public /* synthetic */ C20013(int i) {
        this.f60843 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m45383(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        Long l2 = (Long) obj;
        if (l2.longValue() >= 0) {
            return EnumC15251.COMPACTED;
        }
        if (l2.longValue() == -2) {
            return EnumC15251.LOW_GAIN;
        }
        return l2.longValue() == -3 ? EnumC15251.BUDGET_EXHAUSTED : EnumC15251.SKIPPED;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f60843) {
            case 4:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45384(InterfaceC2577 interfaceC2577, InterfaceC2577 interfaceC2578) {
        if (interfaceC2577 == interfaceC2578) {
            return;
        }
        if (interfaceC2578 != null) {
            interfaceC2578.mo3883((C16658) null);
        }
        if (interfaceC2577 != null) {
            interfaceC2577.mo3885(null);
        }
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        textView.setText("0");
    }
}
