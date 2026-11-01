package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18498 {

    /* JADX INFO: renamed from: ֫ */
    public final C15556 f55257;

    /* JADX INFO: renamed from: ۧ */
    public final C9522 f55258;

    /* JADX INFO: renamed from: ܽ */
    public final int f55259;

    /* JADX INFO: renamed from: ᩳ */
    public final View f55260;

    public C18498(C15556 c15556, AbstractViewOnClickListenerC19169 abstractViewOnClickListenerC19169, View view) {
        this.f55257 = c15556;
        this.f55260 = view;
        C9522 c9522 = abstractViewOnClickListenerC19169.f57270;
        this.f55258 = c9522;
        this.f55259 = abstractViewOnClickListenerC19169.getBindingAdapterPosition();
        if (c9522.m22164()) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m42049() {
        this.f55257.m35398(this.f55258);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX INFO: renamed from: ۜ */
    public final void m42043() {
        boolean z;
        int iMo17934;
        int i;
        C9522 c9522 = this.f55258;
        boolean zM22157 = c9522.m22157();
        C9522 c9523 = c9522.f26071;
        C15556 c15556 = this.f55257;
        if (zM22157) {
            c15556.m35395(c9522);
        }
        if (c9523 != null) {
            c9523.f26067.remove(c9522);
            if (c9523.f26067.isEmpty()) {
                C9522 c9524 = c9523.f26071;
                if (c9524 != null) {
                    c9524.f26067.remove(c9523);
                }
                z = true;
            }
            iMo17934 = c15556.mo17934();
            i = this.f55259;
            if (z) {
                int i2 = i - 1;
                c15556.m35403().subList(i2 - iMo17934, (i + 1) - iMo17934).clear();
                c15556.notifyItemRangeRemoved(i2, 2);
            } else {
                c15556.m35403().remove(i - iMo17934);
                c15556.notifyItemRemoved(i);
            }
        }
        c15556.m35402().f36900.remove(c9522);
        z = false;
        iMo17934 = c15556.mo17934();
        i = this.f55259;
        if (z) {
            int i3 = i - 1;
            c15556.m35403().subList(i3 - iMo17934, (i + 1) - iMo17934).clear();
            c15556.notifyItemRangeRemoved(i3, 2);
        } else {
            c15556.m35403().remove(i - iMo17934);
            c15556.notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m42050() {
        return this.f55258.m22165();
    }

    /* JADX INFO: renamed from: ܳ */
    public final View m42045() {
        return this.f55260;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m42048() {
        return this.f55258.f26070;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m42042() {
        return this.f55258.m22160();
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m42046() {
        C9522 c9522 = this.f55258.f26071;
        if (c9522 == null) {
            return null;
        }
        return c9522.f26070;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m42044() {
        return C8597.m20011(200, this.f55258.f26068);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m42047() {
        return this.f55259;
    }
}
