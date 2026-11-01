package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public class C12987 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩵֫ */
    public static final /* synthetic */ int f36533 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public String f36534;

    /* JADX INFO: renamed from: ᩴ֫ */
    public ArrayList f36535 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        int i;
        AbstractC17043[] abstractC17043ArrM42118 = C18524.m42118(m13494("ARG_PATHS"));
        int i2 = 0;
        boolean z = abstractC17043ArrM42118.length == 1;
        if (z) {
            m52468();
        }
        String strM13492 = m13492("password");
        boolean zM13488 = m13488("removeSource");
        int i3 = C20903.f65643;
        try {
            boolean z2 = C4809.f10911;
            int length = abstractC17043ArrM42118.length;
            long jMo25101 = 0;
            int i4 = 0;
            while (true) {
                i = 20;
                if (i4 >= length) {
                    break;
                }
                jMo25101 += abstractC17043ArrM42118[i4].mo25101() - ((long) 20);
                i4++;
            }
            C20689 c20689 = new C20689(jMo25101);
            int i5 = 2;
            if (!z) {
                c20689.m46753(new C4975(i5, this));
            }
            int length2 = abstractC17043ArrM42118.length;
            while (i2 < length2) {
                final AbstractC17043 abstractC17043 = abstractC17043ArrM42118[i2];
                String name = abstractC17043.getName();
                this.f36534 = name;
                mo13456(name);
                AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(name.endsWith(".encrypt") ? abstractC17043.m38675() : name.concat(".decrypt"));
                AbstractC17043 abstractC17043M38678 = abstractC17043M38682.mo25094() ? abstractC17043M38682.m38678(".tmp") : abstractC17043M38682;
                boolean z3 = zM13488;
                C20689 c206810 = c20689;
                C20689 c206811 = new C20689(abstractC17043.mo25101() - ((long) i));
                if (z) {
                    c206811.m46753(new C4975(2, this));
                } else {
                    c206811.m46753(new C24878(2, this));
                }
                C20903 c20903 = new C20903(abstractC17043, strM13492, new InterfaceC8205() { // from class: l.۟ܽ᩻
                    @Override // p067l.InterfaceC8205
                    public final Object get() {
                        int i6 = C12987.f36533;
                        return new C6150(abstractC17043.getName());
                    }
                });
                try {
                    abstractC17043M38678.m38652(c20903, c20903.m47215(), new C4269(this, c206811, c206810));
                    c20903.close();
                    if (mo3924()) {
                        abstractC17043M38678.mo29990();
                        break;
                    }
                    if (abstractC17043M38678 != abstractC17043M38682) {
                        abstractC17043M38678.m38656(abstractC17043M38682, (Runnable) null);
                    }
                    this.f36535.add(abstractC17043M38682.getName());
                    if (z3) {
                        abstractC17043.mo29990();
                    }
                    i2++;
                    c20689 = c206810;
                    zM13488 = z3;
                    i = 20;
                } catch (Throwable th) {
                    try {
                        c20903.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            return m13481();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79715;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        String str = this.f36534;
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
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        ArrayList arrayList = this.f36535;
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
