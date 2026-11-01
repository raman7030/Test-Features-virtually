package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84M0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12093 implements Comparator {
    /* JADX INFO: renamed from: ۧ */
    public static AbstractC12093 m27883() {
        return C14774.f42115;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC12093 m27884(Comparator comparator) {
        if (comparator instanceof AbstractC12093) {
            return (AbstractC12093) comparator;
        }
        return new C18601(comparator);
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC12093 m27885() {
        return C5426.f12924;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC12093 mo24451() {
        return new C17338(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12093 m27888(InterfaceC18263 interfaceC18263) {
        return new C19983(interfaceC18263, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12093 m27887(Comparator comparator) {
        return new C21955(this, comparator);
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo24450(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m27886(ArrayList arrayList) {
        Object[] objArrM24929 = C10810.m24929(arrayList);
        Arrays.sort(objArrM24929, this);
        return new ArrayList(Arrays.asList(objArrM24929));
    }
}
