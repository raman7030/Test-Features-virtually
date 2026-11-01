package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14925 extends EnumC2483 {
    public /* synthetic */ C14925(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("ADD_MODULES", 76, "--add-modules", "opt.arg.addmods", "opt.addmods", enumC19919, enumC5837);
    }

    public C14925(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (str2.isEmpty()) {
            throw abstractC3154.m5388(C8300.m19119(str));
        }
        if (mo3587().matcher(str2).matches()) {
            EnumC2483 enumC2483 = EnumC2483.f3925;
            String strMo5387 = abstractC3154.mo5387(enumC2483);
            String str3 = enumC2483.f3990;
            if (strMo5387 != null) {
                str2 = strMo5387 + ',' + str2;
            }
            abstractC3154.mo5391(str3, str2);
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
