package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3358 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10617;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10618;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f10619;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f10620;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10621;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10623;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f10624;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10625;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10626;

    public C3358(int i, String str, boolean z, boolean z2, boolean z3, C12366 c12366, long j, String str2, boolean z4, Predicate predicate) {
        this.f10625 = i;
        this.f10617 = str;
        this.f10626 = z;
        this.f10623 = z2;
        this.f10622 = z3;
        this.f10620 = c12366;
        this.f10619 = j;
        this.f10621 = str2;
        this.f10618 = z4;
        this.f10624 = predicate;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۙܽۢ] */
    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        final C10414 c10414 = new C10414();
        boolean z = this.f10623;
        boolean z2 = this.f10626;
        String str = this.f10617;
        int i = this.f10625;
        if (i == 0) {
            final C15051 c15051M9357 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.ۚܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c10415 = c10414;
                    C15051 c15051 = c15051M9357;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c10415.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 c11418M50717 = c22706.m50717();
                        C12164 c12164 = c15051.get();
                        c12164.m29615reset((CharSequence) c11418M50717);
                        ArrayList<C10132> arrayList = new ArrayList();
                        C5898.m16538(c12164, c11418M50717, 0, 500, arrayList);
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (C10132 c10132 : arrayList) {
                            C19287 c19287 = new C19287(0);
                            int i2 = c10132.f30494;
                            c19287.f60684 = i2;
                            int i3 = c10132.f30493;
                            c19287.f60685 = i3;
                            c19287.m44468(i2, i3, c11418M50717);
                            arrayList2.add(c19287);
                        }
                        return arrayList2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        final boolean z3 = this.f10622;
        if (i == 1) {
            C11459 c11459M9359 = C3058.m9359(str, z2, z);
            final C15051 c15051 = new C15051(c11459M9359);
            String strPattern = c11459M9359.pattern();
            final boolean z4 = z3 || strPattern.contains("/");
            final boolean z5 = z3 || strPattern.contains("\\.");
            final Map mapM30055 = this.f10620.m30055();
            final C8297 c8297 = new C8297();
            final ?? r7 = new ThreadLocal() { // from class: l.ۙܽۢ
                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    c8297.getClass();
                    return new C4047();
                }
            };
            final boolean z6 = this.f10622;
            return new InterfaceC7997() { // from class: l.ܶܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C4769 c4769 = r7;
                    Map map = mapM30055;
                    C15051 c15052 = c15051;
                    boolean z7 = z6;
                    boolean z8 = z4;
                    boolean z9 = z5;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C4047 c4047 = (C4047) c4769.get();
                        C11003.requireNonNull(c4047);
                        String strMo31672 = interfaceC13508.mo31672();
                        String str2 = (String) map.get(strMo31672);
                        if (str2 == null) {
                            c4047.m12163(strMo31672);
                        } else if ("".equals(str2)) {
                            C7980 c7980Mo31674 = interfaceC13508.mo31674();
                            if (c7980Mo31674 == null || !c4047.m12161(c7980Mo31674.getType())) {
                                return null;
                            }
                        } else {
                            c4047.m12163(str2);
                        }
                        if (C6180.m17094(c4047, c15052.get(), z7, z8, z9)) {
                            return Collections.EMPTY_LIST;
                        }
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 2) {
            final C15051 c15051M9358 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.᩹ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c15052 = c15051M9358;
                    try {
                        return C6180.m17084(((InterfaceC13508) obj).mo31674(), c15052.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 3) {
            final C15051 c15051M9359 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.᩸ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c15052 = c15051M9359;
                    try {
                        return C6180.m17098(((InterfaceC13508) obj).mo31674(), c15052.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 4) {
            final C15051 c15051M93510 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.֨ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c15052 = c15051M93510;
                    try {
                        return C6180.m17100(((InterfaceC13508) obj).mo31674(), c15052.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i != 5) {
            return null;
        }
        final long j = this.f10619;
        return new InterfaceC7997() { // from class: l.᩶ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                try {
                    return C6180.m17083(((InterfaceC13508) obj).mo31674(), j);
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f10620.m30033(concurrentLinkedQueue, this.f10621, this.f10618, this.f10624);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941(this.f10621, this.f10617, arrayList);
    }
}
