package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۜۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9GY */
/* JADX INFO: loaded from: classes2.dex */
public final class C8752 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC2735 f23714;

    /* JADX INFO: renamed from: ۜ */
    public C22164 f23715;

    /* JADX INFO: renamed from: ۡ */
    public C2872 f23716;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f23717;

    /* JADX INFO: renamed from: ۧ */
    public EnumSet f23718;

    /* JADX INFO: renamed from: ܳ */
    public Set f23719;

    /* JADX INFO: renamed from: ܽ */
    public final UUID f23720;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC7430 f23723;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f23724 = new byte[0];

    /* JADX INFO: renamed from: ܿ */
    public int f23721 = 1;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f23722 = false;

    public C8752(UUID uuid, String str, int i, C6485 c6485) {
        this.f23720 = uuid;
        this.f23718 = EnumSet.copyOf((Collection) c6485.m14886());
        this.f23716 = new C2872(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20227(C2716 c2716) {
        C24193 c24193M4217 = c2716.m4217();
        this.f23716 = c2716.m4216();
        this.f23715 = new C22164(c24193M4217.m53497(), c24193M4217.m53492(), c24193M4217.m53493(), c24193M4217.m53494(), this.f23716.m4616().contains(EnumC7943.SMB2_GLOBAL_CAP_LARGE_MTU));
        this.f23714 = c2716.m4214();
        this.f23719 = c2716.m4215();
        this.f23723 = c2716.m4219();
        this.f23717 = c2716.m4218() != null ? c2716.m4218() : new byte[0];
        System.currentTimeMillis();
        c24193M4217.m53496().m53526();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final UUID m20237() {
        return this.f23720;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m20231() {
        return (this.f23716.m4620() & 2) > 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C22164 m20233() {
        return this.f23715;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m20236() {
        byte[] bArr = this.f23724;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumSet m20235() {
        return this.f23718;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC2735 m20232() {
        return this.f23714;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m20230() {
        if (this.f23715.m49973() == EnumC23366.SMB_3_1_1) {
            return this.f23714 != null;
        }
        EnumC7943 enumC7943 = EnumC7943.SMB2_GLOBAL_CAP_ENCRYPTION;
        return this.f23718.contains(enumC7943) && this.f23716.m4616().contains(enumC7943);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20228() {
        return this.f23722 && this.f23715.m49973().m52019() && m20230();
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m20234() {
        return this.f23716.m4616().contains(EnumC7943.SMB2_GLOBAL_CAP_LARGE_MTU);
    }

    public final String toString() {
        return "ConnectionContext{\n  serverGuid=" + this.f23716.m4622() + ",\n  serverName='" + this.f23716.m4621() + "',\n  negotiatedProtocol=" + this.f23715 + ",\n  clientGuid=" + this.f23720 + ",\n  clientCapabilities=" + this.f23718 + ",\n  serverCapabilities=" + this.f23716.m4616() + ",\n  clientSecurityMode=" + this.f23721 + ",\n  serverSecurityMode=" + this.f23716.m4620() + ",\n  server='" + this.f23716 + "'\n}";
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C2872 m20238() {
        return this.f23716;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC7430 m20239() {
        return this.f23723;
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m20229() {
        return this.f23717;
    }
}
