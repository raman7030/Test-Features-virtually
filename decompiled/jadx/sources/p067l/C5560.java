package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5560 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String f13425;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f13426;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ long f13427;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f13428;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ String f13429;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f13430;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f13431;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Predicate f13432;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f13433;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f13434;

    public C5560(int i, String str, boolean z, boolean z2, boolean z3, C14121 c14121, long j, String str2, boolean z4, Predicate predicate) {
        this.f13433 = i;
        this.f13425 = str;
        this.f13434 = z;
        this.f13431 = z2;
        this.f13430 = z3;
        this.f13428 = c14121;
        this.f13427 = j;
        this.f13429 = str2;
        this.f13426 = z4;
        this.f13432 = predicate;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۙܽۢ] */
    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        final C12266 c12266 = new C12266();
        boolean z = this.f13431;
        boolean z2 = this.f13434;
        String str = this.f13425;
        int i = this.f13433;
        if (i == 0) {
            final C16673 c16673M11399 = C5275.m11399(str, z2, z);
            return new InterfaceC9969() { // from class: l.ۚܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C12266 c12267 = c12266;
                    C16673 c16673 = c16673M11399;
                    InterfaceC15206 interfaceC15206 = (InterfaceC15206) obj;
                    try {
                        C23948 c23948 = c12267.get();
                        if (!interfaceC15206.mo33759(c23948)) {
                            return null;
                        }
                        C13220 c13220M53043 = c23948.m53043();
                        C13929 c13929 = c16673.get();
                        c13929.m56473reset((CharSequence) c13220M53043);
                        ArrayList<C11998> arrayList = new ArrayList();
                        C7974.m18464(c13929, c13220M53043, 0, 500, arrayList);
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (C11998 c11998 : arrayList) {
                            C20699 c20699 = new C20699(0);
                            int i2 = c11998.f33456;
                            c20699.f63914 = i2;
                            int i3 = c11998.f33455;
                            c20699.f63915 = i3;
                            c20699.m46762(i2, i3, c13220M53043);
                            arrayList2.add(c20699);
                        }
                        return arrayList2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        final boolean z3 = this.f13430;
        if (i == 1) {
            C13259 c13259M11401 = C5275.m11401(str, z2, z);
            final C16673 c16673 = new C16673(c13259M11401);
            String strPattern = c13259M11401.pattern();
            final boolean z4 = z3 || strPattern.contains("/");
            final boolean z5 = z3 || strPattern.contains("\\.");
            final Map mapM32116 = this.f13428.m32116();
            final C10254 c10254 = new C10254();
            final ?? r7 = new ThreadLocal() { // from class: l.ۙܽۢ
                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    c10254.getClass();
                    return new C6215();
                }
            };
            final boolean z6 = this.f13430;
            return new InterfaceC9969() { // from class: l.ܶܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C6901 c6901 = r7;
                    Map map = mapM32116;
                    C16673 c16674 = c16673;
                    boolean z7 = z6;
                    boolean z8 = z4;
                    boolean z9 = z5;
                    InterfaceC15206 interfaceC15206 = (InterfaceC15206) obj;
                    try {
                        C6215 c6215 = (C6215) c6901.get();
                        C12826.requireNonNull(c6215);
                        String strMo33760 = interfaceC15206.mo33760();
                        String str2 = (String) map.get(strMo33760);
                        if (str2 == null) {
                            c6215.m14084(strMo33760);
                        } else if ("".equals(str2)) {
                            C9952 c9952Mo33762 = interfaceC15206.mo33762();
                            if (c9952Mo33762 == null || !c6215.m14082(c9952Mo33762.getType())) {
                                return null;
                            }
                        } else {
                            c6215.m14084(str2);
                        }
                        if (C8242.m19026(c6215, c16674.get(), z7, z8, z9)) {
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
            final C16673 c16673M113910 = C5275.m11399(str, z2, z);
            return new InterfaceC9969() { // from class: l.᩹ܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C16673 c16674 = c16673M113910;
                    try {
                        return C8242.m19016(((InterfaceC15206) obj).mo33762(), c16674.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 3) {
            final C16673 c16673M113911 = C5275.m11399(str, z2, z);
            return new InterfaceC9969() { // from class: l.᩸ܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C16673 c16674 = c16673M113911;
                    try {
                        return C8242.m19030(((InterfaceC15206) obj).mo33762(), c16674.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 4) {
            final C16673 c16673M113912 = C5275.m11399(str, z2, z);
            return new InterfaceC9969() { // from class: l.֨ܽۢ
                @Override // p067l.InterfaceC9969
                public final List accept(Object obj) {
                    C16673 c16674 = c16673M113912;
                    try {
                        return C8242.m19032(((InterfaceC15206) obj).mo33762(), c16674.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i != 5) {
            return null;
        }
        final long j = this.f13427;
        return new InterfaceC9969() { // from class: l.᩶ܽۢ
            @Override // p067l.InterfaceC9969
            public final List accept(Object obj) {
                try {
                    return C8242.m19015(((InterfaceC15206) obj).mo33762(), j);
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f13428.m32094(concurrentLinkedQueue, this.f13429, this.f13426, this.f13432);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263(this.f13429, this.f13425, arrayList);
    }
}
