package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928 implements InterfaceC2436 {
    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final char mo3416() {
        return '~';
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ۧ */
    public final int mo3418() {
        return 1;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ܽ */
    public final char mo3419() {
        return '~';
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final int mo3417(C17700 c17700, C17700 c17701) {
        ArrayList arrayList = c17700.f52867;
        int size = arrayList.size();
        ArrayList arrayList2 = c17701.f52867;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C14625 c14625M40235 = c17700.m40235();
        if (arrayList.size() == 1) {
            c14625M40235.getClass();
        } else {
            c14625M40235.getClass();
        }
        C6282 c6282 = new C6282();
        C6579 c6579 = new C6579();
        c6579.m15034(c17700.m40233(arrayList.size()));
        for (AbstractC2555 abstractC2555 : C9932.m23232(c14625M40235, (C14625) arrayList2.get(0))) {
            c6282.m3756(abstractC2555);
            c6579.m15033(abstractC2555.m3764());
        }
        c6579.m15034(c17701.m40231(arrayList2.size()));
        c6282.m3755(c6579.m15032());
        c14625M40235.m3763(c6282);
        return arrayList.size();
    }
}
