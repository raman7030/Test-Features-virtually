package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18566 implements InterfaceC7961, InterfaceC21423, InterfaceC1702 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57620;

    public /* synthetic */ C18566(int i) {
        this.f57620 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m43105(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        Long l2 = (Long) obj;
        if (l2.longValue() >= 0) {
            return EnumC13555.COMPACTED;
        }
        if (l2.longValue() == -2) {
            return EnumC13555.LOW_GAIN;
        }
        return l2.longValue() == -3 ? EnumC13555.BUDGET_EXHAUSTED : EnumC13555.SKIPPED;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f57620) {
            case 4:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43106(InterfaceC0220 interfaceC0220, InterfaceC0220 interfaceC0221) {
        if (interfaceC0220 == interfaceC0221) {
            return;
        }
        if (interfaceC0221 != null) {
            interfaceC0221.mo1470((C15036) null);
        }
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(null);
        }
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        textView.setText("0");
    }
}
