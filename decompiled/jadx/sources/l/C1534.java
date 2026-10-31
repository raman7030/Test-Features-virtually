package l;

import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1534 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5415 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList f5416 = new ArrayList();

    static {
        m5245();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5245() {
        C12951 c12951M31485;
        boolean z;
        try {
            byte[] bArrMo18253 = ApplicationC20075.f65008.mo18253("mfr", (byte[]) null);
            if (bArrMo18253 != null) {
                c12951M31485 = new C12951(bArrMo18253);
                z = false;
            } else {
                String string = ApplicationC20075.f65008.getString("mfr", null);
                if (string == null) {
                    return;
                }
                c12951M31485 = C12951.m31485(Base64.decode(string, 0));
                z = true;
            }
            C22124.m49722((InterfaceC20008) c12951M31485, 1419064394);
            int i = c12951M31485.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C7569(c12951M31485.m31487(), c12951M31485.m31504()));
            }
            f5416 = arrayList;
            if (z) {
                m5246();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5244() {
        return f5416;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5246() {
        ArrayList<C7569> arrayList = new ArrayList(f5416);
        C10130 c10130M43030 = C18515.m43030(1419064394);
        c10130M43030.writeInt(arrayList.size());
        for (C7569 c7569 : arrayList) {
            c10130M43030.m25432(c7569.f23375);
            c10130M43030.m25423((CharSequence) c7569.f23376);
        }
        ApplicationC20075.f65008.edit().mo25855("mfr", c10130M43030.m25444()).apply();
    }
}
