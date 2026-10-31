package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12507 extends EnumC0121 {
    public /* synthetic */ C12507(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("LIMIT_MODULES", 77, "--limit-modules", "opt.arg.limitmods", "opt.limitmods", enumC18467, enumC3650);
    }

    public C12507(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (str2.isEmpty()) {
            throw abstractC0827.m3074(C6241.m17181(str));
        }
        if (mo1186().matcher(str2).matches()) {
            abstractC0827.mo3077(EnumC0121.f1144.f1214, str2);
            return;
        }
        throw abstractC0827.m3074(C6241.m17182(str, str2));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo1186() {
        return Pattern.compile(",*[^,].*");
    }
}
