package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18809 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ int f56181 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public static final Comparator f56182 = C10162.comparingInt(new C18138());

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC24132 mo28850();

    /* JADX INFO: renamed from: ۧ */
    public abstract EnumC19480 mo28851();

    /* JADX INFO: renamed from: ܿ */
    public abstract InterfaceC16706 mo40687();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f56182.compare(this, (AbstractC18809) obj);
    }
}
