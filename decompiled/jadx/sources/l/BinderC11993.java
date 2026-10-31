package l;

import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.PowerManager;
import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC11993 extends Binder {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f35901;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35902;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f35903;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17574 f35904;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC23281 f35906;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f35907 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f35905 = -1;

    public BinderC11993(ServiceC23281 serviceC23281) {
        this.f35906 = serviceC23281;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m29303() {
        C17574 c17574 = this.f35904;
        if (c17574 == null) {
            return;
        }
        if (this.f35901) {
            C21374 c21374M48458 = C21374.m48458(0, c17574.f53704);
            c21374M48458.m48467(this.f35903, this.f35902);
            c21374M48458.m48468();
            return;
        }
        C21374.m48459((CharSequence) c17574.f53704);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29307(int i, int i2, boolean z) {
        this.f35901 = z;
        this.f35903 = i;
        this.f35902 = i2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29315() {
        C17574 c17574 = this.f35904;
        return c17574 != null && c17574.m41098();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29318(C0640 c0640, boolean z) {
        C17574 c17574 = this.f35904;
        if (c17574 == null) {
            return;
        }
        if (c17574.m41098()) {
            C0682.m2767(this.f35904);
        }
        String str = this.f35904.f53704;
        C17574 c17574M2766 = C0682.m2766(m29304(), z, this.f35904.m41092());
        this.f35904 = c17574M2766;
        c17574M2766.f53704 = str;
        this.f35907.set(this.f35905, c17574M2766);
        c0640.m2650(this.f35904);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29311(C0640 c0640, boolean z) {
        if (this.f35904 == null) {
            C17574 c17574M2766 = C0682.m2766(m29304(), z, false);
            this.f35904 = c17574M2766;
            ServiceC23281 serviceC23281 = this.f35906;
            int i = serviceC23281.f74757 + 1;
            serviceC23281.f74757 = i;
            c17574M2766.m41096(i);
            ArrayList arrayList = this.f35907;
            this.f35905 = arrayList.size();
            arrayList.add(this.f35904);
            serviceC23281.m51603();
        }
        c0640.m2650(this.f35904);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m29320() {
        C17574 c17574 = this.f35904;
        if (c17574 != null) {
            return c17574.m41100().m41261().m7011();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29309(String str) {
        C17574 c17574 = this.f35904;
        if (c17574 != null) {
            c17574.m8717(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29317(int i) {
        if (this.f35904 != null) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f35904.m41091(127, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29310(C0640 c0640, int i) {
        if (i == this.f35905 || i < 0) {
            return;
        }
        ArrayList arrayList = this.f35907;
        if (i >= arrayList.size()) {
            return;
        }
        this.f35905 = i;
        C17574 c17574 = (C17574) arrayList.get(i);
        this.f35904 = c17574;
        c0640.m2650(c17574);
        m29303();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29312(C0640 c0640, boolean z, boolean z2, float f) {
        C17574 c17574M2766 = C0682.m2766(m29304(), z, z2);
        this.f35904 = c17574M2766;
        ServiceC23281 serviceC23281 = this.f35906;
        int i = serviceC23281.f74757 + 1;
        serviceC23281.f74757 = i;
        c17574M2766.m41096(i);
        this.f35904.m41089(f * serviceC23281.getResources().getDisplayMetrics().scaledDensity);
        int i2 = this.f35905 + 1;
        this.f35905 = i2;
        this.f35907.add(i2, this.f35904);
        c0640.m2650(this.f35904);
        m29303();
        serviceC23281.m51603();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29324() {
        for (C17574 c17574 : this.f35907) {
            if (c17574 != null && c17574.m41100() != null) {
                c17574.m41100().f53920.m39774();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29314(C0640 c0640) {
        C17574 c17574 = this.f35904;
        if (c17574 == null) {
            return true;
        }
        if (c17574.m41098()) {
            C0682.m2767(this.f35904);
        }
        int i = this.f35905;
        ArrayList arrayList = this.f35907;
        arrayList.remove(i);
        this.f35906.m51603();
        if (arrayList.isEmpty()) {
            this.f35904 = null;
            this.f35905 = -1;
            return true;
        }
        if (this.f35905 >= arrayList.size()) {
            this.f35905 = arrayList.size() - 1;
        }
        C17574 c17575 = (C17574) arrayList.get(this.f35905);
        this.f35904 = c17575;
        c0640.m2650(c17575);
        m29303();
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29316() {
        ArrayList<C17574> arrayList = this.f35907;
        for (C17574 c17574 : arrayList) {
            if (c17574 != this.f35904) {
                C0682.m2767(c17574);
            }
        }
        arrayList.clear();
        C17574 c17575 = this.f35904;
        if (c17575 != null) {
            arrayList.add(c17575);
            this.f35905 = 0;
        }
        this.f35906.m51603();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29306() {
        ArrayList arrayList = this.f35907;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0682.m2767((C17574) it.next());
        }
        arrayList.clear();
        this.f35906.m51603();
        this.f35904 = null;
        this.f35905 = -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m29325() {
        return !this.f35907.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29313(boolean z) {
        ServiceC23281 serviceC23281 = this.f35906;
        if (serviceC23281.f74756 == null || !serviceC23281.f74756.isHeld()) {
            serviceC23281.f74756 = ((PowerManager) serviceC23281.getSystemService("power")).newWakeLock(1, serviceC23281.getPackageName() + ":MTermWakeLock");
            serviceC23281.f74756.acquire();
        }
        if (serviceC23281.f74755 == null || !serviceC23281.f74755.isHeld()) {
            serviceC23281.f74755 = ((WifiManager) serviceC23281.getApplicationContext().getSystemService("wifi")).createWifiLock(3, serviceC23281.getPackageName() + ":MTermWifiLock");
            serviceC23281.f74755.acquire();
        }
        if (!C11287.m27900(serviceC23281)) {
            C11287.m27901(serviceC23281);
        }
        if (z) {
            if (this.f35901) {
                C21374 c21374M48462 = C21374.m48462(R.string.MT_Protector, 0);
                c21374M48462.m48467(this.f35903, this.f35902);
                c21374M48462.m48468();
            } else {
                C21374.m48457(R.string.MT_Protector);
            }
        }
        serviceC23281.m51603();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29319(boolean z) {
        ServiceC23281 serviceC23281 = this.f35906;
        if (serviceC23281.f74756 != null) {
            if (serviceC23281.f74756.isHeld()) {
                serviceC23281.f74756.release();
            }
            serviceC23281.f74756 = null;
        }
        if (serviceC23281.f74755 != null) {
            if (serviceC23281.f74755.isHeld()) {
                serviceC23281.f74755.release();
            }
            serviceC23281.f74755 = null;
        }
        if (z) {
            if (this.f35901) {
                C21374 c21374M48462 = C21374.m48462(R.string.MT_Protector, 0);
                c21374M48462.m48467(this.f35903, this.f35902);
                c21374M48462.m48468();
            } else {
                C21374.m48457(R.string.MT_Protector);
            }
        }
        serviceC23281.m51603();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m29322() {
        ArrayList arrayList = this.f35907;
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            charSequenceArr[i] = ((C17574) arrayList.get(i)).f53704;
        }
        return charSequenceArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m29305(int i) {
        if (i < 0) {
            return "";
        }
        ArrayList arrayList = this.f35907;
        return i >= arrayList.size() ? "" : ((C17574) arrayList.get(i)).f53704;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29308(int i, String str) {
        if (i >= 0) {
            ArrayList arrayList = this.f35907;
            if (i < arrayList.size()) {
                ((C17574) arrayList.get(i)).f53704 = str;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29323() {
        return this.f35907.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29321() {
        return this.f35905;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String m29304() {
        File file = new File(ApplicationC20075.f65010.getString("term_start_path", "/sdcard"));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return new File(C4925.m14322(), "term/home").getAbsolutePath();
    }
}
