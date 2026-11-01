package p067l;

import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3826 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f8197 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList f8198 = new ArrayList();

    static {
        m7474();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m7474() {
        C14677 c14677M33572;
        boolean z;
        try {
            byte[] bArrMo20201 = ApplicationC21448.f67649.mo20201("mfr", (byte[]) null);
            if (bArrMo20201 != null) {
                c14677M33572 = new C14677(bArrMo20201);
                z = false;
            } else {
                String string = ApplicationC21448.f67649.getString("mfr", null);
                if (string == null) {
                    return;
                }
                c14677M33572 = C14677.m33572(Base64.decode(string, 0));
                z = true;
            }
            C23395.m52060((InterfaceC21384) c14677M33572, 1419064394);
            int i = c14677M33572.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C9562(c14677M33572.m33574(), c14677M33572.m33591()));
            }
            f8198 = arrayList;
            if (z) {
                m7475();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m7473() {
        return f8198;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m7475() {
        ArrayList<C9562> arrayList = new ArrayList(f8198);
        C11996 c11996M45308 = C19965.m45308(1419064394);
        c11996M45308.writeInt(arrayList.size());
        for (C9562 c9562 : arrayList) {
            c11996M45308.m27452(c9562.f26287);
            c11996M45308.m27443((CharSequence) c9562.f26288);
        }
        ApplicationC21448.f67649.edit().mo27877("mfr", c11996M45308.m27464()).apply();
    }
}
