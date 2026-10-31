package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16971 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13876 f52077;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7527 f52078;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f52080;

    public C16971(C13876 c13876, AbstractViewOnClickListenerC17677 abstractViewOnClickListenerC17677, View view) {
        this.f52077 = c13876;
        this.f52080 = view;
        C7527 c7527 = abstractViewOnClickListenerC17677.f54077;
        this.f52078 = c7527;
        this.f52079 = abstractViewOnClickListenerC17677.getBindingAdapterPosition();
        if (c7527.m20188()) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39806() {
        this.f52077.m33279(this.f52078);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m39800() {
        boolean z;
        int iMo15999;
        int i;
        C7527 c7527 = this.f52078;
        boolean zM20181 = c7527.m20181();
        C7527 c7528 = c7527.f23158;
        C13876 c13876 = this.f52077;
        if (zM20181) {
            c13876.m33276(c7527);
        }
        if (c7528 != null) {
            c7528.f23154.remove(c7527);
            if (c7528.f23154.isEmpty()) {
                C7527 c7529 = c7528.f23158;
                if (c7529 != null) {
                    c7529.f23154.remove(c7528);
                }
                z = true;
            }
            iMo15999 = c13876.mo15999();
            i = this.f52079;
            if (z) {
                int i2 = i - 1;
                c13876.m33284().subList(i2 - iMo15999, (i + 1) - iMo15999).clear();
                c13876.notifyItemRangeRemoved(i2, 2);
            } else {
                c13876.m33284().remove(i - iMo15999);
                c13876.notifyItemRemoved(i);
            }
        }
        c13876.m33283().f33901.remove(c7527);
        z = false;
        iMo15999 = c13876.mo15999();
        i = this.f52079;
        if (z) {
            int i3 = i - 1;
            c13876.m33284().subList(i3 - iMo15999, (i + 1) - iMo15999).clear();
            c13876.notifyItemRangeRemoved(i3, 2);
        } else {
            c13876.m33284().remove(i - iMo15999);
            c13876.notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m39807() {
        return this.f52078.m20189();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View m39802() {
        return this.f52080;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39805() {
        return this.f52078.f23157;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39799() {
        return this.f52078.m20184();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39803() {
        C7527 c7527 = this.f52078.f23158;
        if (c7527 == null) {
            return null;
        }
        return c7527.f23157;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39801() {
        return C6554.m18061(200, this.f52078.f23155);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m39804() {
        return this.f52079;
    }
}
