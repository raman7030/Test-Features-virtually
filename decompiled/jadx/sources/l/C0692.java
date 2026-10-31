package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֡᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes3.dex */
public class C0692 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f2630;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f2631 = true;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f2629 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C11813 mo2779() {
        return C23777.f76968;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17222 mo2780() {
        HashSet hashSet = new HashSet();
        try {
            ArrayList<C21234> arrayList = (ArrayList) m11529("infos");
            C19277 c19277 = new C19277(arrayList.size());
            c19277.m44459(new C3362(2, this));
            for (C21234 c21234 : arrayList) {
                c19277.m44460(1);
                mo11520(c21234.m48194());
                hashSet.add(c21234.m48198());
                AbstractC15440 abstractC15440M48195 = c21234.m48195();
                hashSet.remove(c21234.m48198());
                if (this.f2631) {
                    String str = this.f2630;
                    ArrayList arrayList2 = this.f2629;
                    if (str == null) {
                        this.f2630 = abstractC15440M48195.getParent();
                        arrayList2.add(abstractC15440M48195.getName());
                    } else if (str.equals(abstractC15440M48195.getParent())) {
                        arrayList2.add(abstractC15440M48195.getName());
                    } else {
                        this.f2631 = false;
                    }
                }
                if (mo1526()) {
                    C17222 c17222M40521 = C17222.m40521();
                    C21939.m49414(hashSet);
                    return c17222M40521;
                }
            }
            C17222 c17222M11545 = m11545();
            C21939.m49414(hashSet);
            return c17222M11545;
        } catch (Throwable th) {
            C21939.m49414(hashSet);
            throw th;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            if (this.f2631) {
                boolean zM39035 = c16561.m39035("local");
                ArrayList arrayList = this.f2629;
                if (zM39035 && m11525(c16561)) {
                    c16561.m39000((Collection) arrayList);
                    c16561.m39033(this.f2630, true);
                } else {
                    c16560.m39000((Collection) arrayList);
                    c16560.m39033(this.f2630, true);
                }
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
