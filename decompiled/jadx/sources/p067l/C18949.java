package p067l;

import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18949 extends EnumC2483 {
    public /* synthetic */ C18949(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("RELEASE", 38, "--release", "opt.arg.release", "opt.release", enumC19919, enumC5837);
    }

    public C18949(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3582(C23623 c23623) {
        Set<String> set = (Set) C16474.stream(C21230.spliterator(ServiceLoader.load(InterfaceC23981.class, C17412.class.getClassLoader())), false).flatMap(new C19620()).collect(C24205.toCollection(new C13201()));
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (String str2 : set) {
            sb.append(str);
            sb.append(str2);
            str = ", ";
        }
        super.m3583(c23623, c23623.m52449(EnumC16916.JAVAC, this.f3988, sb.toString()));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ InterfaceC19157 m43037(InterfaceC23981 interfaceC23981) {
        return C16474.stream(C21230.spliterator(interfaceC23981.m53154()), false);
    }
}
