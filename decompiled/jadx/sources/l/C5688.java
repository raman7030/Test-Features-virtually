package l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ۚ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4W4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5688 implements InterfaceC16724, InterfaceC2780, InterfaceC0300 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m16003(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16005(int i) {
        if (i >= 0 && i <= 8) {
            return true;
        }
        if (i < 16 || i > 18) {
            return i >= 28 && i <= 31;
        }
        return true;
    }

    @Override // l.InterfaceC0300
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return ((InterfaceC1368) obj).mo4843().getClass().getSimpleName();
    }

    @Override // l.InterfaceC2780
    /* JADX INFO: renamed from: ֫ */
    public Constructor mo8584() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1368.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
