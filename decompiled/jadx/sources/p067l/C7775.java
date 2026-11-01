package p067l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ۚ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4W4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7775 implements InterfaceC18263, InterfaceC5011, InterfaceC2653 {
    /* JADX INFO: renamed from: ֫ */
    public static String m17938(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17940(int i) {
        if (i >= 0 && i <= 8) {
            return true;
        }
        if (i < 16 || i > 18) {
            return i >= 28 && i <= 31;
        }
        return true;
    }

    @Override // p067l.InterfaceC2653
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return ((InterfaceC3669) obj).mo7081().getClass().getSimpleName();
    }

    @Override // p067l.InterfaceC5011
    /* JADX INFO: renamed from: ֫ */
    public Constructor mo10647() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC3669.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
