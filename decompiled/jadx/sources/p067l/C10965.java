package p067l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۡᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10965 implements InterfaceC9934, InterfaceC4595, TextInputLayout.LengthCounter {
    /* JADX INFO: renamed from: ֫ */
    public static String m25286(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m25287(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
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

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        System.out.println("SmaliCache progress " + i + "%");
    }
}
