package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܰۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C15295 {

    /* JADX INFO: renamed from: ܳ */
    public C14969 f43657;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f43652 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f43659 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f43656 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f43653 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f43654 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet f43662 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public LinkedHashSet f43658 = C21055.m47501();

    /* JADX INFO: renamed from: ᩳ */
    public EnumC7920 f43660 = EnumC7920.NONE;

    /* JADX INFO: renamed from: ۢ */
    public int f43655 = 100;

    /* JADX INFO: renamed from: ᩷ */
    public int f43661 = 100;

    /* JADX INFO: renamed from: ֫ */
    public final C3778 m34822() {
        return new C3778(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34823(Iterable iterable) {
        C12826.requireNonNull(iterable, "extensions must not be null");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC4941 interfaceC4941 = (InterfaceC4941) it.next();
            if (interfaceC4941 instanceof InterfaceC9261) {
                ((InterfaceC9261) interfaceC4941).mo8703(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34825(EnumC7920 enumC7920) {
        this.f43660 = enumC7920;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34828(AbstractC17188 abstractC17188) {
        this.f43652.add(abstractC17188);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34827(InterfaceC15847 interfaceC15847) {
        this.f43659.add(interfaceC15847);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34824(C2928 c2928) {
        this.f43656.add(c2928);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34829(C19713 c19713) {
        this.f43654.add(c19713);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34826(C14969 c14969) {
        this.f43657 = c14969;
    }

    /* JADX INFO: renamed from: ۡ */
    public static InterfaceC24013 m34813(C15295 c15295) {
        C14969 c14969 = c15295.f43657;
        return c14969 != null ? c14969 : new C21466(9);
    }
}
