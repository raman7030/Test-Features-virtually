package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13281 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39763;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f39763) {
            case 0:
                return ((InterfaceC7099) obj).mo18742().compareTo(((InterfaceC7099) obj2).mo18742());
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
    }
}
