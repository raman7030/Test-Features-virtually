package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۗۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5410 implements InterfaceC18263, InterfaceC9934, InterfaceC22729, InterfaceC3986, InterfaceC24274 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12886;

    public /* synthetic */ C5410(int i) {
        this.f12886 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11876(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11877(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m11879(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11881(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    @Override // p067l.InterfaceC24274
    /* JADX INFO: renamed from: ֫ */
    public int mo4456(String str, boolean z) {
        C10748 c10748 = C15556.f44442;
        return 2;
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        switch (this.f12886) {
            case 4:
                C23048 c23048 = (C23048) obj;
                return c23048.f72433 + ": " + c23048.f72434;
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f12886) {
            case 5:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        switch (this.f12886) {
            case 8:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 m11882(String str) {
        return C18524.m42109(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11878(boolean z, boolean z2) {
        if (z && z2) {
            return C7050.m16203(R.string.MT_Protector, "V2 + V3");
        }
        if (z) {
            return C7050.m16203(R.string.MT_Protector, "V2");
        }
        if (z2) {
            return C7050.m16203(R.string.MT_Protector, "V3");
        }
        throw new RuntimeException();
    }
}
