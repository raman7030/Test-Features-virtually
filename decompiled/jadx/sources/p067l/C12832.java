package p067l;

import android.widget.TextView;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۧ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8QF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12832 implements InterfaceC9934, ISequentialOutStream, InterfaceC3986 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f36113;

    /* JADX INFO: renamed from: ֫ */
    public static int m29410(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m29411(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29413(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29414(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        switch (this.f36113) {
            case 4:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) {
        return byteBuffer.remaining();
    }
}
