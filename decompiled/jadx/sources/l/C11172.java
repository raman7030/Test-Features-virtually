package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public class C11172 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33532 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f33533;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33534 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        int i;
        AbstractC15440[] abstractC15440ArrM39875 = C16999.m39875(m11558("ARG_PATHS"));
        int i2 = 0;
        boolean z = abstractC15440ArrM39875.length == 1;
        if (z) {
            m50128();
        }
        String strM11556 = m11556("password");
        boolean zM11552 = m11552("removeSource");
        int i3 = C19502.f63026;
        try {
            boolean z2 = C2568.f8121;
            int length = abstractC15440ArrM39875.length;
            long jMo23127 = 0;
            int i4 = 0;
            while (true) {
                i = 20;
                if (i4 >= length) {
                    break;
                }
                jMo23127 += abstractC15440ArrM39875[i4].mo23127() - ((long) 20);
                i4++;
            }
            C19277 c19277 = new C19277(jMo23127);
            int i5 = 2;
            if (!z) {
                c19277.m44459(new C2742(i5, this));
            }
            int length2 = abstractC15440ArrM39875.length;
            while (i2 < length2) {
                final AbstractC15440 abstractC15440 = abstractC15440ArrM39875[i2];
                String name = abstractC15440.getName();
                this.f33533 = name;
                mo11520(name);
                AbstractC15440 abstractC15440M36524 = abstractC15440.m36524(name.endsWith(".encrypt") ? abstractC15440.m36517() : name.concat(".decrypt"));
                AbstractC15440 abstractC15440M36520 = abstractC15440M36524.mo23120() ? abstractC15440M36524.m36520(".tmp") : abstractC15440M36524;
                boolean z3 = zM11552;
                C19277 c19278 = c19277;
                C19277 c19279 = new C19277(abstractC15440.mo23127() - ((long) i));
                if (z) {
                    c19279.m44459(new C2742(2, this));
                } else {
                    c19279.m44459(new C23684(2, this));
                }
                C19502 c19502 = new C19502(abstractC15440, strM11556, new InterfaceC6141() { // from class: l.۟ܽ᩻
                    @Override // l.InterfaceC6141
                    public final Object get() {
                        int i6 = C11172.f33532;
                        return new C3979(abstractC15440.getName());
                    }
                });
                try {
                    abstractC15440M36520.m36494(c19502, c19502.m44917(), new C1999(this, c19279, c19278));
                    c19502.close();
                    if (mo1526()) {
                        abstractC15440M36520.mo27929();
                        break;
                    }
                    if (abstractC15440M36520 != abstractC15440M36524) {
                        abstractC15440M36520.m36498(abstractC15440M36524, (Runnable) null);
                    }
                    this.f33534.add(abstractC15440M36524.getName());
                    if (z3) {
                        abstractC15440.mo27929();
                    }
                    i2++;
                    c19277 = c19278;
                    zM11552 = z3;
                    i = 20;
                } catch (Throwable th) {
                    try {
                        c19502.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            return m11545();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76963;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f33533;
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
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        ArrayList arrayList = this.f33534;
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
