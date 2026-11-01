package p067l;

import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.PowerManager;
import bin.p000mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC13767 extends Binder {

    /* JADX INFO: renamed from: ۜ */
    public boolean f38911;

    /* JADX INFO: renamed from: ۡ */
    public int f38912;

    /* JADX INFO: renamed from: ۢ */
    public int f38913;

    /* JADX INFO: renamed from: ܳ */
    public C19071 f38914;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ ServiceC24495 f38916;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f38917 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public int f38915 = -1;

    public BinderC13767(ServiceC24495 serviceC24495) {
        this.f38916 = serviceC24495;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m31358() {
        C19071 c19071 = this.f38914;
        if (c19071 == null) {
            return;
        }
        if (this.f38911) {
            C22682 c22682M50794 = C22682.m50794(0, c19071.f56894);
            c22682M50794.m50803(this.f38913, this.f38912);
            c22682M50794.m50804();
            return;
        }
        C22682.m50795((CharSequence) c19071.f56894);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31362(int i, int i2, boolean z) {
        this.f38911 = z;
        this.f38913 = i;
        this.f38912 = i2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m31370() {
        C19071 c19071 = this.f38914;
        return c19071 != null && c19071.m43344();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31373(C2977 c2977, boolean z) {
        C19071 c19071 = this.f38914;
        if (c19071 == null) {
            return;
        }
        if (c19071.m43344()) {
            C3017.m5106(this.f38914);
        }
        String str = this.f38914.f56894;
        C19071 c19071M5105 = C3017.m5105(m31359(), z, this.f38914.m43338());
        this.f38914 = c19071M5105;
        c19071M5105.f56894 = str;
        this.f38917.set(this.f38915, c19071M5105);
        c2977.m4990(this.f38914);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31366(C2977 c2977, boolean z) {
        if (this.f38914 == null) {
            C19071 c19071M5105 = C3017.m5105(m31359(), z, false);
            this.f38914 = c19071M5105;
            ServiceC24495 serviceC24495 = this.f38916;
            int i = serviceC24495.f77501 + 1;
            serviceC24495.f77501 = i;
            c19071M5105.m43342(i);
            ArrayList arrayList = this.f38917;
            this.f38915 = arrayList.size();
            arrayList.add(this.f38914);
            serviceC24495.m53999();
        }
        c2977.m4990(this.f38914);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m31375() {
        C19071 c19071 = this.f38914;
        if (c19071 != null) {
            return c19071.m43346().m43507().m9122();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31364(String str) {
        C19071 c19071 = this.f38914;
        if (c19071 != null) {
            c19071.m10778(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31372(int i) {
        if (this.f38914 != null) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f38914.m43337(127, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31365(C2977 c2977, int i) {
        if (i == this.f38915 || i < 0) {
            return;
        }
        ArrayList arrayList = this.f38917;
        if (i >= arrayList.size()) {
            return;
        }
        this.f38915 = i;
        C19071 c19071 = (C19071) arrayList.get(i);
        this.f38914 = c19071;
        c2977.m4990(c19071);
        m31358();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31367(C2977 c2977, boolean z, boolean z2, float f) {
        C19071 c19071M5105 = C3017.m5105(m31359(), z, z2);
        this.f38914 = c19071M5105;
        ServiceC24495 serviceC24495 = this.f38916;
        int i = serviceC24495.f77501 + 1;
        serviceC24495.f77501 = i;
        c19071M5105.m43342(i);
        this.f38914.m43335(f * serviceC24495.getResources().getDisplayMetrics().scaledDensity);
        int i2 = this.f38915 + 1;
        this.f38915 = i2;
        this.f38917.add(i2, this.f38914);
        c2977.m4990(this.f38914);
        m31358();
        serviceC24495.m53999();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m31379() {
        for (C19071 c19071 : this.f38917) {
            if (c19071 != null && c19071.m43346() != null) {
                c19071.m43346().f57113.m42015();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31369(C2977 c2977) {
        C19071 c19071 = this.f38914;
        if (c19071 == null) {
            return true;
        }
        if (c19071.m43344()) {
            C3017.m5106(this.f38914);
        }
        int i = this.f38915;
        ArrayList arrayList = this.f38917;
        arrayList.remove(i);
        this.f38916.m53999();
        if (arrayList.isEmpty()) {
            this.f38914 = null;
            this.f38915 = -1;
            return true;
        }
        if (this.f38915 >= arrayList.size()) {
            this.f38915 = arrayList.size() - 1;
        }
        C19071 c19072 = (C19071) arrayList.get(this.f38915);
        this.f38914 = c19072;
        c2977.m4990(c19072);
        m31358();
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31371() {
        ArrayList<C19071> arrayList = this.f38917;
        for (C19071 c19071 : arrayList) {
            if (c19071 != this.f38914) {
                C3017.m5106(c19071);
            }
        }
        arrayList.clear();
        C19071 c19072 = this.f38914;
        if (c19072 != null) {
            arrayList.add(c19072);
            this.f38915 = 0;
        }
        this.f38916.m53999();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31361() {
        ArrayList arrayList = this.f38917;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3017.m5106((C19071) it.next());
        }
        arrayList.clear();
        this.f38916.m53999();
        this.f38914 = null;
        this.f38915 = -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m31380() {
        return !this.f38917.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31368(boolean z) {
        ServiceC24495 serviceC24495 = this.f38916;
        if (serviceC24495.f77500 == null || !serviceC24495.f77500.isHeld()) {
            serviceC24495.f77500 = ((PowerManager) serviceC24495.getSystemService("power")).newWakeLock(1, serviceC24495.getPackageName() + ":MTermWakeLock");
            serviceC24495.f77500.acquire();
        }
        if (serviceC24495.f77499 == null || !serviceC24495.f77499.isHeld()) {
            serviceC24495.f77499 = ((WifiManager) serviceC24495.getApplicationContext().getSystemService("wifi")).createWifiLock(3, serviceC24495.getPackageName() + ":MTermWifiLock");
            serviceC24495.f77499.acquire();
        }
        if (!C13096.m29961(serviceC24495)) {
            C13096.m29962(serviceC24495);
        }
        if (z) {
            if (this.f38911) {
                C22682 c22682M50798 = C22682.m50798(R.string.MT_Protector, 0);
                c22682M50798.m50803(this.f38913, this.f38912);
                c22682M50798.m50804();
            } else {
                C22682.m50793(R.string.MT_Protector);
            }
        }
        serviceC24495.m53999();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31374(boolean z) {
        ServiceC24495 serviceC24495 = this.f38916;
        if (serviceC24495.f77500 != null) {
            if (serviceC24495.f77500.isHeld()) {
                serviceC24495.f77500.release();
            }
            serviceC24495.f77500 = null;
        }
        if (serviceC24495.f77499 != null) {
            if (serviceC24495.f77499.isHeld()) {
                serviceC24495.f77499.release();
            }
            serviceC24495.f77499 = null;
        }
        if (z) {
            if (this.f38911) {
                C22682 c22682M50798 = C22682.m50798(R.string.MT_Protector, 0);
                c22682M50798.m50803(this.f38913, this.f38912);
                c22682M50798.m50804();
            } else {
                C22682.m50793(R.string.MT_Protector);
            }
        }
        serviceC24495.m53999();
    }

    /* JADX INFO: renamed from: ܿ */
    public final CharSequence[] m31377() {
        ArrayList arrayList = this.f38917;
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            charSequenceArr[i] = ((C19071) arrayList.get(i)).f56894;
        }
        return charSequenceArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m31360(int i) {
        if (i < 0) {
            return "";
        }
        ArrayList arrayList = this.f38917;
        return i >= arrayList.size() ? "" : ((C19071) arrayList.get(i)).f56894;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31363(int i, String str) {
        if (i >= 0) {
            ArrayList arrayList = this.f38917;
            if (i < arrayList.size()) {
                ((C19071) arrayList.get(i)).f56894 = str;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m31378() {
        return this.f38917.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m31376() {
        return this.f38915;
    }

    /* JADX INFO: renamed from: ۢ */
    public static String m31359() {
        File file = new File(ApplicationC21448.f67650.getString("term_start_path", "/sdcard"));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return new File(C7050.m16219(), "term/home").getAbsolutePath();
    }
}
