package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4746 extends EnumC0121 {
    public /* synthetic */ C4746(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("ADD_EXPORTS", 72, "--add-exports", "opt.arg.addExports", "opt.addExports", enumC18467, enumC3650);
    }

    public C4746(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (str2.isEmpty()) {
            throw abstractC0827.m3074(C6241.m17181(str));
        }
        if (mo1186().matcher(str2).matches()) {
            EnumC0121 enumC0121 = EnumC0121.f1172;
            String strMo3073 = abstractC0827.mo3073(enumC0121);
            String str3 = enumC0121.f1214;
            if (strMo3073 != null) {
                str2 = strMo3073 + (char) 0 + str2;
            }
            abstractC0827.mo3077(str3, str2);
            return;
        }
        throw abstractC0827.m3074(C6241.m17182(str, str2));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo1186() {
        return Pattern.compile("([^/]+)/([^=]+)=(,*[^,].*)");
    }
}
