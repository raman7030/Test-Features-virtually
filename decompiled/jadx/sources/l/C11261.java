package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11261 extends C6322 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33751 = new ArrayList(5);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f33752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC16715 f33753;

    public C11261(String str, EnumC16715 enumC16715) {
        this.f33752 = str;
        this.f33753 = enumC16715;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27874(C6322 c6322, String str, Object obj) {
        if (obj instanceof Object[]) {
            C6322 c6322Mo17581 = c6322.mo17581(str);
            if (c6322Mo17581 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m27874(c6322Mo17581, (String) null, obj2);
                }
                c6322Mo17581.mo17594();
                return;
            }
            return;
        }
        if (obj instanceof C11261) {
            C11261 c11261 = (C11261) obj;
            C6322 c6322Mo17582 = c6322.mo17582(str, c11261.f33752);
            if (c6322Mo17582 != null) {
                for (C2088 c2088 : c11261.f33751) {
                    m27874(c6322Mo17582, c2088.f6964, c2088.f6965);
                }
                c6322Mo17582.mo17594();
                return;
            }
            return;
        }
        if (obj instanceof C13687) {
            C13687 c13687 = (C13687) obj;
            c6322.mo17591(str, c13687.m32934(), c13687.m32932());
        } else {
            c6322.mo17590(obj, str);
        }
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final void mo17590(Object obj, String str) {
        this.f33751.add(new C2088(str, obj));
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final C6322 mo17582(String str, String str2) {
        C11261 c11261 = new C11261(str2, EnumC16715.RUNTIME);
        this.f33751.add(new C2088(str, c11261));
        return c11261;
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final C6322 mo17581(String str) {
        return new C23065(this, str);
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final void mo17591(String str, String str2, String str3) {
        this.f33751.add(new C2088(str, new C13687(str2, str3, str2)));
    }
}
