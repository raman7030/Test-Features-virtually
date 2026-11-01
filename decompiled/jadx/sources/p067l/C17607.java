package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17607 extends EnumC2483 {
    public /* synthetic */ C17607(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("DEFAULT_MODULE_FOR_CREATED_FILES", 45, "--default-module-for-created-files", "opt.arg.default.module.for.created.files", "opt.default.module.for.created.files", enumC19919, enumC5837);
    }

    public C17607(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        EnumC2483 enumC2483 = EnumC2483.f3933;
        if (abstractC3154.mo5387(enumC2483) != null) {
            String str3 = enumC2483.f3990;
            C14040 c14040 = C8300.f21997;
            throw abstractC3154.m5388(new C14040("compiler", "option.too.many", str3));
        }
        if (str2.isEmpty()) {
            throw abstractC3154.m5388(C8300.m19119(str));
        }
        if (mo3587().matcher(str2).matches()) {
            abstractC3154.mo5391(enumC2483.f3990, str2);
            return;
        }
        throw abstractC3154.m5388(C8300.m19120(str, str2));
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo3587() {
        return Pattern.compile("[^,].*");
    }
}
