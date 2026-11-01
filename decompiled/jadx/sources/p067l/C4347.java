package p067l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4347 extends ByteArrayInputStream implements InterfaceC16534, InterfaceC2452 {

    /* JADX INFO: renamed from: ᩹ */
    public static InterfaceC4410 f9727 = C13128.m30023(C4347.class.getName());

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f9728;

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4347(byte[] bArr, int i) {
        super(bArr, 0, i);
        this.f9728 = new HashMap();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8978() {
        return read() & 255;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m8979() {
        return (m8978() << 8) | m8978();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m8977(int i) {
        int i2;
        int iM8978;
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (i3 < i) {
            int iM8979 = m8978();
            switch (iM8979 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    continue;
                    sb.append((char) iM8979);
                    i3++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i2 = (iM8979 & 63) << 4;
                    iM8978 = m8978() & 15;
                    break;
                case 12:
                case 13:
                    i2 = (iM8979 & 31) << 6;
                    iM8978 = m8978() & 63;
                    break;
                case 14:
                    iM8979 = ((iM8979 & 15) << 12) | ((m8978() & 63) << 6) | (m8978() & 63);
                    i3 += 2;
                    continue;
                    sb.append((char) iM8979);
                    i3++;
                    break;
            }
            iM8979 = i2 | iM8978;
            i3++;
            sb.append((char) iM8979);
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m8976() {
        HashMap map;
        int iM8978;
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            map = this.f9728;
            if (z || (iM8978 = m8978()) == 0) {
                break;
            }
            int i = C9317.f25333[EnumC14090.m31992(iM8978).ordinal()];
            if (i != 1) {
                InterfaceC4410 interfaceC4410 = f9727;
                if (i == 2) {
                    int iM31993 = (EnumC14090.m31993(iM8978) << 8) | m8978();
                    String str = (String) map.get(Integer.valueOf(iM31993));
                    if (str == null) {
                        interfaceC4410.mo9193("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(iM31993), Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str = "";
                    }
                    sb.append(str);
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    z = true;
                } else if (i == 3) {
                    interfaceC4410.mo9183("Extended label are not currently supported.");
                } else {
                    interfaceC4410.mo9198(Integer.toHexString(iM8978 & 192), "Unsupported DNS label type: '{}'");
                }
            } else {
                int i2 = ((ByteArrayInputStream) this).pos - 1;
                String str2 = m8977(iM8978) + ".";
                sb.append(str2);
                Iterator it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    ((StringBuilder) it2.next()).append(str2);
                }
                map2.put(Integer.valueOf(i2), new StringBuilder(str2));
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((Integer) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
        }
        return sb.toString();
    }
}
