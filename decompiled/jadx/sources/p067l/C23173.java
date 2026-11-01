package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩸᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23173 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72796;

    public /* synthetic */ C23173(int i) {
        this.f72796 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f72796) {
            case 0:
                return Long.compare(((C5738) obj2).getSize(), ((C5738) obj).getSize());
            default:
                C6716 c6716 = (C6716) obj;
                C6716 c6717 = (C6716) obj2;
                int i = C20383.f63001;
                boolean zStartsWith = c6716.m15320().startsWith("_");
                if (zStartsWith == c6717.m15320().startsWith("_")) {
                    return Integer.compare(c6716.m15321(), c6717.m15321());
                }
                return zStartsWith ? 1 : -1;
        }
    }
}
