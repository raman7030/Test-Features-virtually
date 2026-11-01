package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13071 extends C8377 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f36751 = new ArrayList(5);

    /* JADX INFO: renamed from: ۧ */
    public String f36752;

    /* JADX INFO: renamed from: ܽ */
    public EnumC18254 f36753;

    public C13071(String str, EnumC18254 enumC18254) {
        this.f36752 = str;
        this.f36753 = enumC18254;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29935(C8377 c8377, String str, Object obj) {
        if (obj instanceof Object[]) {
            C8377 c8377Mo19521 = c8377.mo19521(str);
            if (c8377Mo19521 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m29935(c8377Mo19521, (String) null, obj2);
                }
                c8377Mo19521.mo19534();
                return;
            }
            return;
        }
        if (obj instanceof C13071) {
            C13071 c13071 = (C13071) obj;
            C8377 c8377Mo19522 = c8377.mo19522(str, c13071.f36752);
            if (c8377Mo19522 != null) {
                for (C4353 c4353 : c13071.f36751) {
                    m29935(c8377Mo19522, c4353.f9748, c4353.f9749);
                }
                c8377Mo19522.mo19534();
                return;
            }
            return;
        }
        if (obj instanceof C15376) {
            C15376 c15376 = (C15376) obj;
            c8377.mo19531(str, c15376.m35049(), c15376.m35047());
        } else {
            c8377.mo19530(obj, str);
        }
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final void mo19530(Object obj, String str) {
        this.f36751.add(new C4353(str, obj));
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final C8377 mo19522(String str, String str2) {
        C13071 c13071 = new C13071(str2, EnumC18254.RUNTIME);
        this.f36751.add(new C4353(str, c13071));
        return c13071;
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final C8377 mo19521(String str) {
        return new C24289(this, str);
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final void mo19531(String str, String str2, String str3) {
        this.f36751.add(new C4353(str, new C15376(str2, str3, str2)));
    }
}
