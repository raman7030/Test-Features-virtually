package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4725 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f14996;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashSet f14997;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC20248 f14998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f14999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f15000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22364 f15001;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC20347 f15002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f15003;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f15004;

    public C4725(C22364 c22364, EnumC16280 enumC16280, boolean z, String str, EnumC20347 enumC20347) {
        this.f15001 = c22364;
        this.f15004 = enumC16280;
        this.f15003 = z;
        this.f14999 = str;
        this.f15002 = enumC20347;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13840(InterfaceC3109 interfaceC3109, C11076 c11076) {
        C22364 c22364 = this.f15001;
        InterfaceC18278 interfaceC18278M50117 = c22364.m50117();
        if (this.f15003) {
            if (this.f14997 == null) {
                this.f14997 = new HashSet();
            }
            if (c22364.f72451 >= c22364.f72463) {
                EnumC20248 enumC20248 = this.f14998;
                if (enumC20248 == null) {
                    if (this.f14997.contains(interfaceC18278M50117)) {
                        this.f14998 = EnumC20248.ADDITIONAL_IN_FILE;
                    } else {
                        this.f14998 = EnumC20248.IN_FILE;
                    }
                    this.f15000 = interfaceC18278M50117;
                    this.f14996 = interfaceC18278M50117;
                    return;
                }
                if ((enumC20248 == EnumC20248.IN_FILE || enumC20248 == EnumC20248.ADDITIONAL_IN_FILE) && !C11003.equals(this.f15000, interfaceC18278M50117)) {
                    this.f14998 = EnumC20248.ADDITIONAL_IN_FILES;
                    this.f14996 = null;
                    return;
                }
                return;
            }
            c22364.m7281(this.f15002, interfaceC3109, c11076);
            this.f14997.add(interfaceC18278M50117);
            return;
        }
        EnumC20248 enumC20249 = this.f14998;
        if (enumC20249 == null) {
            this.f14998 = EnumC20248.IN_FILE;
            this.f15000 = interfaceC18278M50117;
            this.f14996 = interfaceC18278M50117;
        } else {
            if (enumC20249 != EnumC20248.IN_FILE || C11003.equals(this.f15000, interfaceC18278M50117)) {
                return;
            }
            this.f14998 = EnumC20248.IN_FILES;
            this.f14996 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13839() {
        EnumC20248 enumC20248 = this.f14998;
        if (enumC20248 != null) {
            InterfaceC18278 interfaceC18278 = this.f14996;
            EnumC16280 enumC16280 = this.f15004;
            String str = this.f14999;
            if (interfaceC18278 == null) {
                if (enumC16280 != null) {
                    m13838(this.f15000, enumC20248.m46496(str), enumC16280);
                } else {
                    m13838(this.f15000, enumC20248.m46496(str), new Object[0]);
                }
            } else if (enumC16280 != null) {
                m13838(this.f15000, enumC20248.m46496(str), this.f14996, enumC16280);
            } else {
                m13838(this.f15000, enumC20248.m46496(str), this.f14996);
            }
            if (this.f15003) {
                return;
            }
            m13838(this.f15000, str.concat(".recompile"), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13838(InterfaceC18278 interfaceC18278, String str, Object... objArr) {
        this.f15001.m7278(interfaceC18278, new C13691("compiler", str, objArr));
    }
}
