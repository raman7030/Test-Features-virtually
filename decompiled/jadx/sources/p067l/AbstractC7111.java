package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7111 implements InterfaceC2436 {

    /* JADX INFO: renamed from: ֫ */
    public final char f18548;

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ۧ */
    public final int mo3418() {
        return 1;
    }

    public AbstractC7111(char c) {
        this.f18548 = c;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ܽ */
    public final char mo3419() {
        return this.f18548;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final char mo3416() {
        return this.f18548;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final int mo3417(C17700 c17700, C17700 c17701) {
        AbstractC2555 c18649;
        ArrayList arrayList = c17701.f52867;
        if ((c17700.m40232() || c17701.m40234()) && c17701.m40236() % 3 != 0) {
            if ((c17701.m40236() + c17700.m40236()) % 3 == 0) {
                return 0;
            }
        }
        int size = c17700.f52867.size();
        char c = this.f18548;
        int i = 2;
        if (size < 2 || arrayList.size() < 2) {
            String.valueOf(c);
            c18649 = new C18649();
            i = 1;
        } else {
            String.valueOf(c);
            c18649 = new C5238();
        }
        C6579 c6579 = new C6579();
        c6579.m15034(c17700.m40233(i));
        C14625 c14625M40235 = c17700.m40235();
        for (AbstractC2555 abstractC2555 : C9932.m23232(c14625M40235, (C14625) arrayList.get(0))) {
            c18649.m3756(abstractC2555);
            c6579.m15033(abstractC2555.m3764());
        }
        c6579.m15034(c17701.m40231(i));
        c18649.m3755(c6579.m15032());
        c14625M40235.m3763(c18649);
        return i;
    }
}
