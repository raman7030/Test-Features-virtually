package l;

import android.widget.TextView;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۫᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12662 implements InterfaceC7961, InterfaceC21423, InterfaceC1702, InterfaceC11776 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38173;

    public /* synthetic */ C12662(int i) {
        this.f38173 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30943(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        switch (this.f38173) {
            case 3:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    @Override // l.InterfaceC11776
    /* JADX INFO: renamed from: ֫ */
    public String mo12554(C3104 c3104) {
        String str = c3104.f9715;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Media cache key is missing");
    }
}
