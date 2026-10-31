package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9686 extends EnumC0121 {
    public /* synthetic */ C9686(EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        this("A", 44, "-A", "opt.arg.key.equals.value", "opt.A", enumC18467, enumC3650, enumC9295);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo1187() {
        return false;
    }

    public C9686(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, enumC9295, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1183(String str) {
        return str.startsWith("-A");
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) throws C2239 {
        int length = str.length();
        if (length == 2) {
            throw abstractC0827.m3074(C6241.f19204);
        }
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        String strSubstring = str.substring(2, length);
        Pattern pattern = C1302.f4634;
        for (String str2 : strSubstring.split("\\.", -1)) {
            if (!EnumC3503.m10687(str2)) {
                C12281 c12281 = C6241.f19132;
                throw abstractC0827.m3074(new C12281("compiler", "invalid.A.key", str));
            }
        }
        abstractC0827.mo3077(str, str);
    }
}
