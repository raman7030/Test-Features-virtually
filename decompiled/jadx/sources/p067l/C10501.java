package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10501 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17205 f29076;

    public C10501(C17205 c17205) {
        this.f29076 = c17205;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 0;
        ConcurrentMapC12768 concurrentMapC12768 = this.f29076.f51215;
        Integer num2 = (Integer) concurrentMapC12768.get(((InterfaceC6024) obj).mo3408());
        Integer num3 = (Integer) concurrentMapC12768.get(((InterfaceC6024) obj2).mo3408());
        if (num2 == null) {
            num2 = num;
        }
        return Integer.compare(num2.intValue(), (num3 != null ? num3 : 0).intValue());
    }
}
