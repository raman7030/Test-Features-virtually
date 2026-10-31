package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23300 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74912;

    public /* synthetic */ C23300(int i) {
        this.f74912 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f74912) {
            case 0:
                return -Long.compare(((C3545) obj).getSize(), ((C3545) obj2).getSize());
            case 1:
                return Integer.compare(((C10419) obj2).f31322, ((C10419) obj).f31322);
            case 2:
                return Integer.compare(((C20490) obj).f66056, ((C20490) obj2).f66056);
            default:
                return ((String) obj).compareToIgnoreCase((String) obj2);
        }
    }
}
