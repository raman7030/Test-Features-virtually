package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۜᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes3.dex */
public class C8963 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۘ֫ */
    public String f24283;

    /* JADX INFO: renamed from: ᩴ֫ */
    public ArrayList f24284 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79722;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        String str = this.f24283;
        if (str == null) {
            str = "null";
        }
        return C7050.m16203(R.string.MT_Protector, str, C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        AbstractC17043[] abstractC17043ArrM42118 = C18524.m42118(m13494("ARG_PATHS"));
        boolean z = abstractC17043ArrM42118.length == 1;
        if (z) {
            m52468();
        }
        String strM13492 = m13492("password");
        boolean zM13488 = m13488("removeSource");
        long jMo25101 = 0;
        for (AbstractC17043 abstractC17043 : abstractC17043ArrM42118) {
            jMo25101 += abstractC17043.mo25101();
        }
        C20689 c20689 = new C20689(jMo25101);
        if (!z) {
            c20689.m46753(new C18191(4, this));
        }
        for (AbstractC17043 abstractC17044 : abstractC17043ArrM42118) {
            String name = abstractC17044.getName();
            this.f24283 = name;
            mo13456(name);
            AbstractC17043 abstractC17043M38682 = abstractC17044.m38682(name + ".encrypt");
            C20689 c206810 = new C20689(abstractC17044.mo25101());
            if (z) {
                c206810.m46753(new C18191(4, this));
            } else {
                c206810.m46753(new C21288(this));
            }
            C7491 c7491 = new C7491(abstractC17043M38682.m38683(), strM13492, 1, true);
            try {
                abstractC17044.m38653(c7491, new C25056(this, c206810, c20689));
                c7491.close();
                if (mo3924()) {
                    abstractC17043M38682.mo29990();
                    break;
                }
                this.f24284.add(abstractC17043M38682.getName());
                if (zM13488) {
                    abstractC17044.mo29990();
                }
            } catch (Throwable th) {
                try {
                    c7491.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return m13481();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        ArrayList arrayList = this.f24284;
        if (arrayList.isEmpty() || !m13478(c18107)) {
            return;
        }
        if (!mo3924()) {
            c18107.m41267();
        }
        c18107.m41226((Collection) arrayList);
        c18107.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
