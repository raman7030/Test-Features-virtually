package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0589 implements InterfaceC0072 {
    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final char mo1020() {
        return '~';
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ۧ */
    public final int mo1022() {
        return 1;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ܽ */
    public final char mo1023() {
        return '~';
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final int mo1021(C16132 c16132, C16132 c16133) {
        ArrayList arrayList = c16132.f49701;
        int size = arrayList.size();
        ArrayList arrayList2 = c16133.f49701;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C12897 c12897M38043 = c16132.m38043();
        if (arrayList.size() == 1) {
            c12897M38043.getClass();
        } else {
            c12897M38043.getClass();
        }
        C4118 c4118 = new C4118();
        C4431 c4431 = new C4431();
        c4431.m13153(c16132.m38041(arrayList.size()));
        for (AbstractC0197 abstractC0197 : C7959.m21266(c12897M38043, (C12897) arrayList2.get(0))) {
            c4118.m1343(abstractC0197);
            c4431.m13152(abstractC0197.m1351());
        }
        c4431.m13153(c16133.m38039(arrayList2.size()));
        c4118.m1342(c4431.m13151());
        c12897M38043.m1350(c4118);
        return arrayList.size();
    }
}
