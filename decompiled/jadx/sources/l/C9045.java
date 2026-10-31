package l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۡᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9045 implements InterfaceC7961, InterfaceC2343, TextInputLayout.LengthCounter {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23341(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m23342(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        System.out.println("SmaliCache progress " + i + "%");
    }
}
