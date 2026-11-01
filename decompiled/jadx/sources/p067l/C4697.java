package p067l;

import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1IX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4697 {

    /* JADX INFO: renamed from: ֫ */
    public final List f10617;

    /* JADX INFO: renamed from: ۜ */
    public final String f10618;

    /* JADX INFO: renamed from: ۡ */
    public final List f10619;

    /* JADX INFO: renamed from: ۢ */
    public final String f10620;

    /* JADX INFO: renamed from: ۧ */
    public final C18107 f10621;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f10622;

    /* JADX INFO: renamed from: ܺ */
    public final String f10623;

    /* JADX INFO: renamed from: ܽ */
    public Exception f10624;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f10625;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f10626;

    /* JADX INFO: renamed from: ᩷ */
    public final String f10627;

    /* JADX INFO: renamed from: ᩻ */
    public final String f10628;

    public C4697(C18107 c18107) {
        String strM41217;
        this.f10621 = c18107;
        this.f10628 = c18107.m41284();
        this.f10627 = c18107.m41246();
        try {
            strM41217 = c18107.m41217();
        } catch (Exception e) {
            this.f10624 = e;
            strM41217 = null;
        }
        this.f10620 = strM41217;
        this.f10618 = c18107.m41216();
        this.f10623 = c18107.m41285();
        List<InterfaceC19370> listM41288 = c18107.m41288();
        boolean z = false;
        if (listM41288.isEmpty() && c18107.f54070.m26377()) {
            listM41288 = Collections.singletonList(c18107.m41243());
            this.f10619 = listM41288;
            this.f10626 = false;
        } else {
            this.f10619 = listM41288;
            this.f10626 = c18107.f54069.m39714();
        }
        this.f10617 = c18107.m41254();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (InterfaceC19370 interfaceC19370 : listM41288) {
            if (interfaceC19370.mo39135()) {
                i++;
            } else if (interfaceC19370.isDirectory()) {
                i2++;
            } else {
                i3++;
            }
        }
        this.f10622 = i > 0 && i2 == 0 && i3 == 0;
        if (i == 0 && i2 > 0 && i3 == 0) {
            z = true;
        }
        this.f10625 = z;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Main m9965() {
        return this.f10621.m41282();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18107 m9967() {
        return this.f10621.m41252();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m9971() {
        return this.f10621.m41264();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC18422 m9970() {
        return this.f10621.m41270();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m9972() {
        return this.f10626;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m9964(String str) {
        return this.f10621.m41261(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9955(String str) {
        this.f10621.m41224(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9954() {
        this.f10621.m41267();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9956(ArrayList arrayList) {
        this.f10621.m41226((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9968(String str) {
        this.f10621.m41279(str);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m9953() {
        this.f10621.m41241();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C18107 m9969() {
        return this.f10621;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m9974() {
        return this.f10628;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m9973() {
        return this.f10627;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m9962() {
        String str = this.f10620;
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException(this.f10624);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m9960() {
        return this.f10618;
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m9958() {
        return this.f10623;
    }

    /* JADX INFO: renamed from: ۖ */
    public final List m9957() {
        return this.f10619;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m9959() {
        return this.f10622;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m9952() {
        return this.f10625;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m9963() {
        return this.f10617;
    }

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC19370 m9961() {
        List list = this.f10619;
        if (list.size() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC19370) list.get(0);
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m9966() {
        return this.f10619.size();
    }
}
