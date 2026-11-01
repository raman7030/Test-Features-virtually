package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7N3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5755 {

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14590 f14116;

    /* JADX INFO: renamed from: ֫ */
    public static final void m12836(View view, InterfaceC23548 interfaceC23548) {
        C13045.m29867(view, "<this>");
        view.setTag(R.id.MT_Protector, interfaceC23548);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12839(Set set, Set set2) {
        if (set.size() != set2.size()) {
            return false;
        }
        Iterator it = set.iterator();
        Iterator it2 = set2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!C12826.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ */
    public static byte m12846(long j) {
        return (byte) ((72 - Long.numberOfLeadingZeros(j ^ (j >> 63))) >> 3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12837(Iterable iterable, Iterable iterable2, boolean z) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C11964) it.next()).m27388((C11964) it2.next(), z)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m12841(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        int length = (8 - bArr.length) * 8;
        return (j << length) >> length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12838(Iterable iterable, Iterable iterable2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C18155) it.next()).m41360((C18155) it2.next(), z, z2, z3, z4, z5)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m12842(long j) {
        int iM12846 = m12846(j);
        byte[] bArr = new byte[iM12846];
        for (int i = 0; i < iM12846; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public static byte m12843(long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        return (byte) ((iNumberOfLeadingZeros + 7) >> 3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14590 m12835() {
        if (f14116 == null) {
            try {
                if (C4965.m10522("com.portaudio.PortAudio", false) != null) {
                    f14116 = (InterfaceC14590) C4965.m10522("com.jsyn.devices.jportaudio.JPortAudioDevice", true).newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JPortAudio device. " + th);
            }
        }
        if (f14116 == null) {
            try {
                Class clsM10522 = C4965.m10522("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (clsM10522 != null) {
                    f14116 = (InterfaceC14590) clsM10522.newInstance();
                }
            } catch (Throwable th2) {
                System.err.println("Could not load JavaSound device. " + th2);
            }
        }
        return f14116;
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m12844(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ܽ */
    public static byte[] m12845(long j) {
        int iM12843 = m12843(j);
        byte[] bArr = new byte[iM12843];
        for (int i = 0; i < iM12843; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m12847(long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        return (iNumberOfTrailingZeros + 7) >> 3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m12834(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j << ((8 - bArr.length) * 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m12840(long j) {
        int iM12847 = m12847(j);
        long j2 = j >> (64 - (iM12847 * 8));
        byte[] bArr = new byte[iM12847];
        for (int i = 0; i < iM12847; i++) {
            bArr[i] = (byte) j2;
            j2 >>= 8;
        }
        return bArr;
    }
}
