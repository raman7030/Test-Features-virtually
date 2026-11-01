package p067l;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.᩸᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes.dex */
public final class C23076 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ֫ */
    public final C17039 f72497;

    /* JADX INFO: renamed from: ܽ */
    public Inflater f72499;

    /* JADX INFO: renamed from: ᩳ */
    public final C19203 f72500 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f72498 = new C19203();

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    public C23076(List list) {
        C17039 c17039 = new C17039();
        this.f72497 = c17039;
        c17039.m38641(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        C21196 c21196M38639;
        C19203 c19203 = this.f72500;
        c19203.m43708(i2 + i, bArr);
        c19203.m43730(i);
        if (this.f72499 == null) {
            this.f72499 = new Inflater();
        }
        Inflater inflater = this.f72499;
        String str = C5792.f14228;
        if (c19203.m43703() > 0 && c19203.m43723() == 120) {
            C19203 c19204 = this.f72498;
            if (C5792.m13008(c19203, c19204, inflater)) {
                c19203.m43708(c19204.m43729(), c19204.m43728());
            }
        }
        C17039 c17039 = this.f72497;
        c17039.m38640();
        int iM43703 = c19203.m43703();
        if (iM43703 < 2 || c19203.m43710() != iM43703) {
            c21196M38639 = null;
        } else {
            c17039.m38642(c19203);
            c21196M38639 = c17039.m38639(c19203);
        }
        interfaceC24686.accept(new C14596(-9223372036854775807L, 5000000L, c21196M38639 != null ? AbstractC16192.m36873of((Object) c21196M38639) : AbstractC16192.m36872of()));
    }
}
