package l;

import android.widget.TextView;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۧ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8QF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11010 implements InterfaceC7961, ISequentialOutStream, InterfaceC1702 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33119;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27348(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27349(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27351(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27352(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        switch (this.f33119) {
            case 4:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) {
        return byteBuffer.remaining();
    }
}
