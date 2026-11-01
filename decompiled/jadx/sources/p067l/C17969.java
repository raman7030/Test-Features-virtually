package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17969 {

    /* JADX INFO: renamed from: ܿ */
    public final String f53665;

    /* JADX INFO: renamed from: ᩳ */
    public final String f53666;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f53664 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public int f53663 = 0;

    /* JADX INFO: renamed from: ֫ */
    public boolean f53662 = true;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40893() {
        this.f53662 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40894(C13946 c13946) {
        if (this.f53662) {
            this.f53664.add(c13946);
        }
    }

    public C17969(String str, String str2) {
        this.f53665 = str;
        this.f53666 = str2;
    }
}
