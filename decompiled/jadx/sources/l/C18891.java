package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.timepicker.RadialViewGroup;

/* JADX INFO: renamed from: l.ᩴܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M7BP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18891 extends C4586 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Object f59542;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f59543;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C8381 f59544;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59545;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f59546;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f59547;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59548;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f59549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f59550;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f59551;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f59552;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public C18891(String str, C8381 c8381, boolean z) {
        boolean z2;
        super(false);
        this.f59542 = new Object();
        if (C21939.m49417()) {
            z2 = C4925.f15523.getBoolean("def_mov_recycle_bin", true);
        }
        this.f59552 = z2;
        this.f59549 = 0;
        this.f59550 = 1L;
        this.f59543 = "";
        this.f59546 = str;
        this.f59544 = c8381;
        this.f59547 = z;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m43612(String str) {
        if ("replace".equals(str)) {
            return 0;
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            return 1;
        }
        return "keep_both".equals(str) ? 2 : -1;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ܿ֫ */
    public final void mo13495() {
        synchronized (this.f59542) {
        }
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo13496() {
        boolean z;
        synchronized (this.f59542) {
            z = !this.f59548;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13492(boolean z) {
        return (z || this.f59547 || !mo13496()) ? false : true;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo13494() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59549 == 0 && this.f59552;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final void mo13491(String str, C22306 c22306, C22306 c22307, boolean z) {
        synchronized (this.f59542) {
            if (this.f59545) {
                return;
            }
            if (this.f59547) {
                throw new RuntimeException(C4925.m14327(R.string.MT_Protector));
            }
            if (this.f59548) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f59546);
            sb.append("-c");
            long j = this.f59550;
            this.f59550 = 1 + j;
            sb.append(j);
            String string = sb.toString();
            this.f59543 = string;
            this.f59551 = true;
            if (!this.f59544.m21986(this.f59546, string, str, c22306, c22307, this, z)) {
                m43615(string);
                return;
            }
            synchronized (this.f59542) {
                while (this.f59551 && !this.f59545 && TextUtils.equals(string, this.f59543)) {
                    try {
                        this.f59542.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f59545 = true;
                        this.f59551 = false;
                        this.f59543 = "";
                    }
                }
            }
        }
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final int mo13490(String str, C22306 c22306, C22306 c22307, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (mo13496()) {
            mo13491(str, c22306, c22307, z);
        }
        return mo13493();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m43616() {
        String str;
        synchronized (this.f59542) {
            int i = this.f59549;
            if (i == 1) {
                str = RadialViewGroup.SKIP_TAG;
            } else {
                str = i == 2 ? "keep_both" : "replace";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m43617(String str) {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59551 && TextUtils.equals(this.f59543, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43613(String str, String str2, boolean z, boolean z2) {
        int iM43612 = m43612(str2);
        if (iM43612 == -1) {
            return false;
        }
        synchronized (this.f59542) {
            if (this.f59551 && TextUtils.equals(this.f59543, str)) {
                this.f59549 = iM43612;
                this.f59548 = z;
                this.f59552 = iM43612 == 0 && z2;
                this.f59551 = false;
                this.f59543 = "";
                this.f59542.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43615(String str) {
        synchronized (this.f59542) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f59543, str)) {
                this.f59545 = true;
                this.f59551 = false;
                this.f59543 = "";
                this.f59542.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43614() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59552;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59545;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* JADX INFO: renamed from: ۬ */
    public final int mo13493() {
        int i;
        synchronized (this.f59542) {
            i = this.f59549;
        }
        return i;
    }
}
