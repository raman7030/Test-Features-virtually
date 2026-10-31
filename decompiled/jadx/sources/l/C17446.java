package l;

import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17446 extends EnumC0121 {
    public /* synthetic */ C17446(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("RELEASE", 38, "--release", "opt.arg.release", "opt.release", enumC18467, enumC3650);
    }

    public C17446(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1181(C22364 c22364) {
        Set<String> set = (Set) C14841.stream(C19846.spliterator(ServiceLoader.load(InterfaceC22741.class, C15829.class.getClassLoader())), false).flatMap(new C18152()).collect(C22976.toCollection(new C11398()));
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (String str2 : set) {
            sb.append(str);
            sb.append(str2);
            str = ", ";
        }
        super.m1182(c22364, c22364.m50109(EnumC15307.JAVAC, this.f1212, sb.toString()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC17664 m40779(InterfaceC22741 interfaceC22741) {
        return C14841.stream(C19846.spliterator(interfaceC22741.m50821()), false);
    }
}
