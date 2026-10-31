package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16034 extends EnumC0121 {
    public /* synthetic */ C16034(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("DEFAULT_MODULE_FOR_CREATED_FILES", 45, "--default-module-for-created-files", "opt.arg.default.module.for.created.files", "opt.default.module.for.created.files", enumC18467, enumC3650);
    }

    public C16034(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        EnumC0121 enumC0121 = EnumC0121.f1157;
        if (abstractC0827.mo3073(enumC0121) != null) {
            String str3 = enumC0121.f1214;
            C12281 c12281 = C6241.f19132;
            throw abstractC0827.m3074(new C12281("compiler", "option.too.many", str3));
        }
        if (str2.isEmpty()) {
            throw abstractC0827.m3074(C6241.m17181(str));
        }
        if (mo1186().matcher(str2).matches()) {
            abstractC0827.mo3077(enumC0121.f1214, str2);
            return;
        }
        throw abstractC0827.m3074(C6241.m17182(str, str2));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo1186() {
        return Pattern.compile("[^,].*");
    }
}
