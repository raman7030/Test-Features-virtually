package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.google.android.material.timepicker.RadialViewGroup;

/* JADX INFO: renamed from: l.ᩴܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M7BP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20323 extends C6727 {

    /* JADX INFO: renamed from: ֫֫ */
    public final Object f62771;

    /* JADX INFO: renamed from: ۛ */
    public String f62772;

    /* JADX INFO: renamed from: ۟ */
    public final C10334 f62773;

    /* JADX INFO: renamed from: ۤ */
    public boolean f62774;

    /* JADX INFO: renamed from: ۧ֫ */
    public final String f62775;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f62776;

    /* JADX INFO: renamed from: ۫ */
    public boolean f62777;

    /* JADX INFO: renamed from: ۬ */
    public int f62778;

    /* JADX INFO: renamed from: ܰ */
    public long f62779;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f62780;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f62781;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public C20323(String str, C10334 c10334, boolean z) {
        boolean z2;
        super(false);
        this.f62771 = new Object();
        if (C23219.m51754()) {
            z2 = C7050.f18355.getBoolean("def_mov_recycle_bin", true);
        }
        this.f62781 = z2;
        this.f62778 = 0;
        this.f62779 = 1L;
        this.f62772 = "";
        this.f62775 = str;
        this.f62773 = c10334;
        this.f62776 = z;
    }

    /* JADX INFO: renamed from: ܺ */
    public static int m45878(String str) {
        if ("replace".equals(str)) {
            return 0;
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            return 1;
        }
        return "keep_both".equals(str) ? 2 : -1;
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܿ֫ */
    public final void mo15384() {
        synchronized (this.f62771) {
        }
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo15385() {
        boolean z;
        synchronized (this.f62771) {
            z = !this.f62777;
        }
        return z;
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15381(boolean z) {
        return (z || this.f62776 || !mo15385()) ? false : true;
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo15383() {
        boolean z;
        synchronized (this.f62771) {
            z = this.f62778 == 0 && this.f62781;
        }
        return z;
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final void mo15380(String str, C23568 c23568, C23568 c23569, boolean z) {
        synchronized (this.f62771) {
            if (this.f62774) {
                return;
            }
            if (this.f62776) {
                throw new RuntimeException(C7050.m16224(R.string.MT_Protector));
            }
            if (this.f62777) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f62775);
            sb.append("-c");
            long j = this.f62779;
            this.f62779 = 1 + j;
            sb.append(j);
            String string = sb.toString();
            this.f62772 = string;
            this.f62780 = true;
            if (!this.f62773.m23957(this.f62775, string, str, c23568, c23569, this, z)) {
                m45881(string);
                return;
            }
            synchronized (this.f62771) {
                while (this.f62780 && !this.f62774 && TextUtils.equals(string, this.f62772)) {
                    try {
                        this.f62771.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f62774 = true;
                        this.f62780 = false;
                        this.f62772 = "";
                    }
                }
            }
        }
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final int mo15379(String str, C23568 c23568, C23568 c23569, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (mo15385()) {
            mo15380(str, c23568, c23569, z);
        }
        return mo15382();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m45882() {
        String str;
        synchronized (this.f62771) {
            int i = this.f62778;
            if (i == 1) {
                str = RadialViewGroup.SKIP_TAG;
            } else {
                str = i == 2 ? "keep_both" : "replace";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m45883(String str) {
        boolean z;
        synchronized (this.f62771) {
            z = this.f62780 && TextUtils.equals(this.f62772, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45879(String str, String str2, boolean z, boolean z2) {
        int iM45878 = m45878(str2);
        if (iM45878 == -1) {
            return false;
        }
        synchronized (this.f62771) {
            if (this.f62780 && TextUtils.equals(this.f62772, str)) {
                this.f62778 = iM45878;
                this.f62777 = z;
                this.f62781 = iM45878 == 0 && z2;
                this.f62780 = false;
                this.f62772 = "";
                this.f62771.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45881(String str) {
        synchronized (this.f62771) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f62772, str)) {
                this.f62774 = true;
                this.f62780 = false;
                this.f62772 = "";
                this.f62771.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45880() {
        boolean z;
        synchronized (this.f62771) {
            z = this.f62781;
        }
        return z;
    }

    @Override // p067l.C6727, p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        boolean z;
        synchronized (this.f62771) {
            z = this.f62774;
        }
        return z;
    }

    @Override // p067l.C6727, p067l.InterfaceC22898
    /* JADX INFO: renamed from: ۬ */
    public final int mo15382() {
        int i;
        synchronized (this.f62771) {
            i = this.f62778;
        }
        return i;
    }
}
