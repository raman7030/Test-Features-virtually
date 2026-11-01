package p067l;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K3ZR */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13035 extends Closeable, Flushable, InterfaceC19069 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: ֫ */
    Iterable mo4100(InterfaceC4317 interfaceC4317, String str, Set set, boolean z);

    /* JADX INFO: renamed from: ֫ */
    String mo4101(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740);

    /* JADX INFO: renamed from: ֫ */
    ServiceLoader mo4102(InterfaceC4317 interfaceC4317, Class cls);

    /* JADX INFO: renamed from: ֫ */
    InterfaceC9741 mo4103(InterfaceC4317 interfaceC4317, String str);

    /* JADX INFO: renamed from: ֫ */
    InterfaceC19740 mo4105(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398);

    /* JADX INFO: renamed from: ֫ */
    InterfaceC19740 mo4106(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398, InterfaceC9741 interfaceC9741);

    /* JADX INFO: renamed from: ֫ */
    boolean mo4107(Iterator it, String str);

    /* JADX INFO: renamed from: ֫ */
    boolean mo4108(InterfaceC4317 interfaceC4317);

    /* JADX INFO: renamed from: ֫ */
    boolean mo4109(InterfaceC4317 interfaceC4317, InterfaceC9741 interfaceC9741);

    /* JADX INFO: renamed from: ֫ */
    boolean mo4110(InterfaceC9741 interfaceC9741, InterfaceC9741 interfaceC9742);

    /* JADX INFO: renamed from: ۧ */
    Iterable mo4111(InterfaceC4317 interfaceC4317);

    /* JADX INFO: renamed from: ۧ */
    InterfaceC4317 mo4112(InterfaceC4317 interfaceC4317, String str);

    /* JADX INFO: renamed from: ۧ */
    InterfaceC4317 mo4113(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740);

    /* JADX INFO: renamed from: ܽ */
    ClassLoader mo4114(InterfaceC4317 interfaceC4317);

    /* JADX INFO: renamed from: ᩳ */
    String mo4115(InterfaceC4317 interfaceC4317);
}
