package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes.dex */
public final class C25021 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f79877 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4154 f79878;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f79879;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f79880;

    public C25021(InterfaceC4154 interfaceC4154, CharSequence charSequence, CharSequence charSequence2) {
        this.f79878 = interfaceC4154;
        this.f79879 = charSequence;
        this.f79880 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4154 m54940() {
        Iterator itMo8422 = this.f79878.mo8420().f44736.mo8422();
        while (true) {
            boolean zHasNext = itMo8422.hasNext();
            ArrayList arrayList = this.f79877;
            CharSequence charSequence = this.f79880;
            CharSequence charSequence2 = this.f79879;
            if (zHasNext) {
                C23600 c23600 = (C23600) itMo8422.next();
                int iM12346 = c23600.f75123;
                int iM12347 = c23600.f75124;
                int iM12342 = c23600.f75121;
                int iM12343 = c23600.f75122;
                if (C22340.m50157(iM12346, charSequence2)) {
                    iM12346 = C5575.m12346(iM12346, iM12342, charSequence2);
                }
                if (C22340.m50157(iM12342 - 1, charSequence2)) {
                    iM12342 = C5575.m12342(iM12346, iM12342, charSequence2);
                }
                if (C22340.m50157(iM12347, charSequence)) {
                    iM12347 = C5575.m12346(iM12347, iM12343, charSequence);
                }
                if (C22340.m50157(iM12343 - 1, charSequence)) {
                    iM12343 = C5575.m12342(iM12347, iM12343, charSequence);
                }
                C23600 c23601 = new C23600(iM12346, iM12342, iM12347, iM12343);
                if (!c23601.m52411() && !C10269.m23885(charSequence2.subSequence(iM12346, iM12342), charSequence.subSequence(iM12347, iM12343), EnumC7587.DEFAULT)) {
                    arrayList.add(c23601);
                }
            } else {
                return C24941.m54809(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
