package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14255 extends EnumC2483 {
    public /* synthetic */ C14255(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("LIMIT_MODULES", 77, "--limit-modules", "opt.arg.limitmods", "opt.limitmods", enumC19919, enumC5837);
    }

    public C14255(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (str2.isEmpty()) {
            throw abstractC3154.m5388(C8300.m19119(str));
        }
        if (mo3587().matcher(str2).matches()) {
            abstractC3154.mo5391(EnumC2483.f3920.f3990, str2);
            return;
        }
        throw abstractC3154.m5388(C8300.m19120(str, str2));
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo3587() {
        return Pattern.compile(",*[^,].*");
    }
}
