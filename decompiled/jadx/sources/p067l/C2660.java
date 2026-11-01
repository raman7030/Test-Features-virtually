package p067l;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O7M7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2660 implements InterfaceC13035 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13035 f4449;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC13035 f4450;

    public /* synthetic */ C2660(InterfaceC13035 interfaceC13035, InterfaceC25104 interfaceC25104) {
        this(interfaceC13035, (InterfaceC13035) interfaceC25104);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4097(C5127 c5127, InterfaceC13035 interfaceC13035, InterfaceC13035 interfaceC13036) {
        Object c2660;
        c5127.m10906(InterfaceC13035.class, (Object) null);
        if (interfaceC13036 instanceof InterfaceC25104) {
            c2660 = new C20767(interfaceC13035, (InterfaceC25104) interfaceC13036);
        } else {
            c2660 = new C2660(interfaceC13035, interfaceC13036);
        }
        c5127.m10906(InterfaceC13035.class, c2660);
    }

    public C2660(InterfaceC13035 interfaceC13035, InterfaceC13035 interfaceC13036) {
        this.f4450 = interfaceC13035;
        this.f4449 = interfaceC13036;
    }

    /* JADX INFO: renamed from: ܳ */
    private InterfaceC13035 m4098(InterfaceC4317 interfaceC4317) {
        InterfaceC13035 interfaceC13035 = this.f4450;
        return interfaceC13035.mo4108(interfaceC4317) ? interfaceC13035 : this.f4449;
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ܽ */
    public final ClassLoader mo4114(InterfaceC4317 interfaceC4317) {
        return m4098(interfaceC4317).mo4114(interfaceC4317);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo4100(InterfaceC4317 interfaceC4317, String str, Set set, boolean z) {
        return m4098(interfaceC4317).mo4100(interfaceC4317, str, set, z);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final String mo4101(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740) {
        return m4098(interfaceC4317).mo4101(interfaceC4317, interfaceC19740);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public boolean mo4110(InterfaceC9741 interfaceC9741, InterfaceC9741 interfaceC9742) {
        return this.f4449.mo4110(interfaceC9741, interfaceC9742);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4107(Iterator it, String str) {
        return this.f4449.mo4107(it, str);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4108(InterfaceC4317 interfaceC4317) {
        return this.f4450.mo4108(interfaceC4317) || this.f4449.mo4108(interfaceC4317);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo4105(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398) {
        return m4098(interfaceC4317).mo4105(interfaceC4317, str, enumC18398);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo4106(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398, InterfaceC9741 interfaceC9741) {
        return m4098(interfaceC4317).mo4106(interfaceC4317, str, enumC18398, interfaceC9741);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9741 mo4103(InterfaceC4317 interfaceC4317, String str) {
        return m4098(interfaceC4317).mo4103(interfaceC4317, str);
    }

    @Override // p067l.InterfaceC13035, java.io.Flushable
    public final void flush() {
        this.f4450.flush();
        this.f4449.flush();
    }

    @Override // p067l.InterfaceC13035, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4450.close();
        this.f4449.close();
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo4112(InterfaceC4317 interfaceC4317, String str) {
        return m4098(interfaceC4317).mo4112(interfaceC4317, str);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo4113(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740) {
        return m4098(interfaceC4317).mo4113(interfaceC4317, interfaceC19740);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final ServiceLoader mo4102(InterfaceC4317 interfaceC4317, Class cls) {
        return m4098(interfaceC4317).mo4102(interfaceC4317, cls);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ᩳ */
    public final String mo4115(InterfaceC4317 interfaceC4317) {
        return m4098(interfaceC4317).mo4115(interfaceC4317);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo4111(InterfaceC4317 interfaceC4317) {
        return m4098(interfaceC4317).mo4111(interfaceC4317);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4109(InterfaceC4317 interfaceC4317, InterfaceC9741 interfaceC9741) {
        return m4098(interfaceC4317).mo4109(interfaceC4317, interfaceC9741);
    }

    @Override // p067l.InterfaceC19069
    /* JADX INFO: renamed from: ֫ */
    public final int mo4099(String str) {
        return this.f4449.mo4099(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13035 m4104() {
        return this.f4449;
    }
}
