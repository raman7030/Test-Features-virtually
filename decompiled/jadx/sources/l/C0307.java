package l;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O7M7 */
/* JADX INFO: loaded from: classes3.dex */
public class C0307 implements InterfaceC11223 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f1672;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f1673;

    public /* synthetic */ C0307(InterfaceC11223 interfaceC11223, InterfaceC23922 interfaceC23922) {
        this(interfaceC11223, (InterfaceC11223) interfaceC23922);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1699(C2903 c2903, InterfaceC11223 interfaceC11223, InterfaceC11223 interfaceC11224) {
        Object c0307;
        c2903.m8839(InterfaceC11223.class, (Object) null);
        if (interfaceC11224 instanceof InterfaceC23922) {
            c0307 = new C19359(interfaceC11223, (InterfaceC23922) interfaceC11224);
        } else {
            c0307 = new C0307(interfaceC11223, interfaceC11224);
        }
        c2903.m8839(InterfaceC11223.class, c0307);
    }

    public C0307(InterfaceC11223 interfaceC11223, InterfaceC11223 interfaceC11224) {
        this.f1673 = interfaceC11223;
        this.f1672 = interfaceC11224;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private InterfaceC11223 m1700(InterfaceC2050 interfaceC2050) {
        InterfaceC11223 interfaceC11223 = this.f1673;
        return interfaceC11223.mo1710(interfaceC2050) ? interfaceC11223 : this.f1672;
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ClassLoader mo1716(InterfaceC2050 interfaceC2050) {
        return m1700(interfaceC2050).mo1716(interfaceC2050);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterable mo1702(InterfaceC2050 interfaceC2050, String str, Set set, boolean z) {
        return m1700(interfaceC2050).mo1702(interfaceC2050, str, set, z);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo1703(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278) {
        return m1700(interfaceC2050).mo1703(interfaceC2050, interfaceC18278);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo1712(InterfaceC7757 interfaceC7757, InterfaceC7757 interfaceC7758) {
        return this.f1672.mo1712(interfaceC7757, interfaceC7758);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1709(Iterator it, String str) {
        return this.f1672.mo1709(it, str);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1710(InterfaceC2050 interfaceC2050) {
        return this.f1673.mo1710(interfaceC2050) || this.f1672.mo1710(interfaceC2050);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 mo1707(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866) {
        return m1700(interfaceC2050).mo1707(interfaceC2050, str, enumC16866);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 mo1708(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866, InterfaceC7757 interfaceC7757) {
        return m1700(interfaceC2050).mo1708(interfaceC2050, str, enumC16866, interfaceC7757);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7757 mo1705(InterfaceC2050 interfaceC2050, String str) {
        return m1700(interfaceC2050).mo1705(interfaceC2050, str);
    }

    @Override // l.InterfaceC11223, java.io.Flushable
    public final void flush() {
        this.f1673.flush();
        this.f1672.flush();
    }

    @Override // l.InterfaceC11223, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1673.close();
        this.f1672.close();
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo1714(InterfaceC2050 interfaceC2050, String str) {
        return m1700(interfaceC2050).mo1714(interfaceC2050, str);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2050 mo1715(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278) {
        return m1700(interfaceC2050).mo1715(interfaceC2050, interfaceC18278);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ServiceLoader mo1704(InterfaceC2050 interfaceC2050, Class cls) {
        return m1700(interfaceC2050).mo1704(interfaceC2050, cls);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo1717(InterfaceC2050 interfaceC2050) {
        return m1700(interfaceC2050).mo1717(interfaceC2050);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterable mo1713(InterfaceC2050 interfaceC2050) {
        return m1700(interfaceC2050).mo1713(interfaceC2050);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1711(InterfaceC2050 interfaceC2050, InterfaceC7757 interfaceC7757) {
        return m1700(interfaceC2050).mo1711(interfaceC2050, interfaceC7757);
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo1701(String str) {
        return this.f1672.mo1701(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 m1706() {
        return this.f1672;
    }
}
