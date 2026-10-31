package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8557 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15611 f26160;

    public C8557(C15611 c15611) {
        this.f26160 = c15611;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 0;
        ConcurrentMapC10942 concurrentMapC10942 = this.f26160.f48076;
        Integer num2 = (Integer) concurrentMapC10942.get(((InterfaceC3846) obj).mo1012());
        Integer num3 = (Integer) concurrentMapC10942.get(((InterfaceC3846) obj2).mo1012());
        if (num2 == null) {
            num2 = num;
        }
        return Integer.compare(num2.intValue(), (num3 != null ? num3 : 0).intValue());
    }
}
