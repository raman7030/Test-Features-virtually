package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M292 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11403 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f31823;

    /* JADX INFO: renamed from: ۧ */
    public String f31824 = "";

    /* JADX INFO: renamed from: ܽ */
    public final C18107 f31825;

    public C11403(C18107 c18107) {
        this.f31825 = c18107;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26375(boolean z) {
        if (this.f31823 != z) {
            this.f31823 = z;
            this.f31824 = "";
            C18107 c18107 = this.f31825;
            if (!z) {
                c18107.m41228(c18107.m41254());
                c18107.f54068.m31987();
            }
            if (c18107.m41247()) {
                c18107.m41242().m26102();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26371() {
        if (this.f31823) {
            this.f31823 = false;
            this.f31824 = "";
            C18107 c18107 = this.f31825;
            if (c18107.m41247()) {
                c18107.m41242().m26097();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m26377() {
        return this.f31823;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m26376() {
        return this.f31824;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26374(C4341 c4341) {
        this.f31823 = c4341.f9708;
        this.f31824 = c4341.f9709;
        C18107 c18107 = this.f31825;
        if (c18107.m41247()) {
            c18107.m41242().m26102();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26373(String str, boolean z) {
        this.f31823 = z;
        this.f31824 = str;
        C18107 c18107 = this.f31825;
        if (c18107.m41247()) {
            c18107.m41242().m26102();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26372(String str) {
        this.f31824 = str;
        C18107 c18107 = this.f31825;
        c18107.m41228(m26370(str, c18107.m41254()));
        c18107.f54068.m31987();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX INFO: renamed from: ֫ */
    public static List m26370(String str, List list) {
        InterfaceC22132 c10041;
        boolean zIsEmpty = str.isEmpty();
        C24813 c24813 = InterfaceC22132.f70014;
        C8720 c8720 = InterfaceC22132.f70013;
        if (zIsEmpty) {
            c10041 = c8720;
        } else {
            try {
                if (str.startsWith("/")) {
                    if (str.length() > 1) {
                        final Matcher matcher = Pattern.compile(str.substring(1), 66).matcher("");
                        c10041 = new InterfaceC22132() { // from class: l.ܿۢܳ
                            @Override // p067l.InterfaceC22132
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo17050(InterfaceC19370 interfaceC19370) {
                                return matcher.reset(interfaceC19370.getName()).find();
                            }
                        };
                    } else {
                        c10041 = c8720;
                    }
                } else {
                    if (str.startsWith("!/")) {
                        if (str.length() > 2) {
                            c10041 = new C7359(Pattern.compile(str.substring(2), 66).matcher(""));
                        }
                    } else if (str.startsWith("!")) {
                        if (str.length() > 1) {
                            final String lowerCase = str.substring(1).toLowerCase();
                            c10041 = new InterfaceC22132() { // from class: l.ܳۢܳ
                                @Override // p067l.InterfaceC22132
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo17050(InterfaceC19370 interfaceC19370) {
                                    return !interfaceC19370.getName().toLowerCase().contains(lowerCase);
                                }
                            };
                        }
                    } else {
                        c10041 = new C10041(str.toLowerCase());
                    }
                    c10041 = c8720;
                }
            } catch (Exception unused) {
                c10041 = c24813;
            }
        }
        if (c10041 == c24813) {
            return new ArrayList();
        }
        if (c10041 == c8720) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (!interfaceC19370.mo39147() && c10041.mo17050(interfaceC19370)) {
                arrayList.add(interfaceC19370);
            }
        }
        return arrayList;
    }
}
