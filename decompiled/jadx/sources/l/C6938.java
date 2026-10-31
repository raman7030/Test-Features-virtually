package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۜᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes3.dex */
public class C6938 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f21400;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f21401 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76970;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f21400;
        if (str == null) {
            str = "null";
        }
        return C4925.m14306(R.string.MT_Protector, str, C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        AbstractC15440[] abstractC15440ArrM39875 = C16999.m39875(m11558("ARG_PATHS"));
        boolean z = abstractC15440ArrM39875.length == 1;
        if (z) {
            m50128();
        }
        String strM11556 = m11556("password");
        boolean zM11552 = m11552("removeSource");
        long jMo23127 = 0;
        for (AbstractC15440 abstractC15440 : abstractC15440ArrM39875) {
            jMo23127 += abstractC15440.mo23127();
        }
        C19277 c19277 = new C19277(jMo23127);
        if (!z) {
            c19277.m44459(new C16648(4, this));
        }
        for (AbstractC15440 abstractC15441 : abstractC15440ArrM39875) {
            String name = abstractC15441.getName();
            this.f21400 = name;
            mo11520(name);
            AbstractC15440 abstractC15440M36524 = abstractC15441.m36524(name + ".encrypt");
            C19277 c19278 = new C19277(abstractC15441.mo23127());
            if (z) {
                c19278.m44459(new C16648(4, this));
            } else {
                c19278.m44459(new C19907(this));
            }
            C5390 c5390 = new C5390(abstractC15440M36524.m36525(), strM11556, 1, true);
            try {
                abstractC15441.m36495(c5390, new C23871(this, c19278, c19277));
                c5390.close();
                if (mo1526()) {
                    abstractC15440M36524.mo27929();
                    break;
                }
                this.f21401.add(abstractC15440M36524.getName());
                if (zM11552) {
                    abstractC15441.mo27929();
                }
            } catch (Throwable th) {
                try {
                    c5390.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return m11545();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        ArrayList arrayList = this.f21401;
        if (arrayList.isEmpty() || !m11542(c16560)) {
            return;
        }
        if (!mo1526()) {
            c16560.m39041();
        }
        c16560.m39000((Collection) arrayList);
        c16560.m39015();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
