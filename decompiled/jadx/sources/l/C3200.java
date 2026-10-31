package l;

import android.widget.TextView;
import bin.mt.plus.R;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۗۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3200 implements InterfaceC16724, InterfaceC7961, InterfaceC21423, InterfaceC1702, InterfaceC23049 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10082;

    public /* synthetic */ C3200(int i) {
        this.f10082 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9831(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9832(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9834(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9836(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    @Override // l.InterfaceC23049
    /* JADX INFO: renamed from: ֫ */
    public int mo2075(String str, boolean z) {
        C8817 c8817 = C13876.f41361;
        return 2;
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        switch (this.f10082) {
            case 4:
                C21759 c21759 = (C21759) obj;
                return c21759.f69724 + ": " + c21759.f69725;
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f10082) {
            case 5:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        switch (this.f10082) {
            case 8:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 m9837(String str) {
        return C16999.m39866(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9833(boolean z, boolean z2) {
        if (z && z2) {
            return C4925.m14306(R.string.MT_Protector, "V2 + V3");
        }
        if (z) {
            return C4925.m14306(R.string.MT_Protector, "V2");
        }
        if (z2) {
            return C4925.m14306(R.string.MT_Protector, "V3");
        }
        throw new RuntimeException();
    }
}
