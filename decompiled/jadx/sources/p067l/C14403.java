package p067l;

import android.widget.TextView;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۫᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14403 implements InterfaceC9934, InterfaceC22729, InterfaceC3986, InterfaceC13560 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f41200;

    public /* synthetic */ C14403(int i) {
        this.f41200 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33021(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        switch (this.f41200) {
            case 3:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    @Override // p067l.InterfaceC13560
    /* JADX INFO: renamed from: ֫ */
    public String mo14444(C5318 c5318) {
        String str = c5318.f12518;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Media cache key is missing");
    }
}
