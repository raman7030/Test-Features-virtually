package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14991 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f42828;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f42828) {
            case 0:
                return ((InterfaceC9116) obj).mo20692().compareTo(((InterfaceC9116) obj2).mo20692());
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
    }
}
