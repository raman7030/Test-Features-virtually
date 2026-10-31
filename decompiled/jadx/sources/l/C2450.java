package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1IX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2450 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f7828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f7829;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f7830;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f7831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16560 f7832;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f7833;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f7834;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Exception f7835;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f7836;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f7837;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7838;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f7839;

    public C2450(C16560 c16560) {
        String strM38991;
        this.f7832 = c16560;
        this.f7839 = c16560.m39058();
        this.f7838 = c16560.m39020();
        try {
            strM38991 = c16560.m38991();
        } catch (Exception e) {
            this.f7835 = e;
            strM38991 = null;
        }
        this.f7831 = strM38991;
        this.f7829 = c16560.m38990();
        this.f7834 = c16560.m39059();
        List<InterfaceC17889> listM39062 = c16560.m39062();
        boolean z = false;
        if (listM39062.isEmpty() && c16560.f50893.m24367()) {
            listM39062 = Collections.singletonList(c16560.m39017());
            this.f7830 = listM39062;
            this.f7837 = false;
        } else {
            this.f7830 = listM39062;
            this.f7837 = c16560.f50892.m37542();
        }
        this.f7828 = c16560.m39028();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (InterfaceC17889 interfaceC17889 : listM39062) {
            if (interfaceC17889.mo36969()) {
                i++;
            } else if (interfaceC17889.isDirectory()) {
                i2++;
            } else {
                i3++;
            }
        }
        this.f7833 = i > 0 && i2 == 0 && i3 == 0;
        if (i == 0 && i2 > 0 && i3 == 0) {
            z = true;
        }
        this.f7836 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Main m7917() {
        return this.f7832.m39056();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16560 m7919() {
        return this.f7832.m39026();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m7923() {
        return this.f7832.m39038();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC16891 m7922() {
        return this.f7832.m39044();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m7924() {
        return this.f7837;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m7916(String str) {
        return this.f7832.m39035(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7907(String str) {
        this.f7832.m38998(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7906() {
        this.f7832.m39041();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7908(ArrayList arrayList) {
        this.f7832.m39000((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7920(String str) {
        this.f7832.m39053(str);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m7905() {
        this.f7832.m39015();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16560 m7921() {
        return this.f7832;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m7926() {
        return this.f7839;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m7925() {
        return this.f7838;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m7914() {
        String str = this.f7831;
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException(this.f7835);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m7912() {
        return this.f7829;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m7910() {
        return this.f7834;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m7909() {
        return this.f7830;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m7911() {
        return this.f7833;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m7904() {
        return this.f7836;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m7915() {
        return this.f7828;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m7913() {
        List list = this.f7830;
        if (list.size() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC17889) list.get(0);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m7918() {
        return this.f7830.size();
    }
}
