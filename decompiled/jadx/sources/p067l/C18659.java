package p067l;

import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.ܿۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18659 implements InterfaceC2565 {

    /* JADX INFO: renamed from: ֫ */
    public int f55715;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19330 f55716;

    /* JADX INFO: renamed from: ܳ */
    public boolean f55717;

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f55718 = new C19203(32);

    /* JADX INFO: renamed from: ܿ */
    public int f55719;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55720;

    public C18659(InterfaceC19330 interfaceC19330) {
        this.f55716 = interfaceC19330;
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3865(C11157 c11157, InterfaceC23116 interfaceC23116, C20672 c20672) {
        this.f55716.mo24431(c11157, interfaceC23116, c20672);
        this.f55717 = true;
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3863() {
        this.f55717 = true;
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3864(int i, C19203 c19203) {
        int iM43731;
        boolean z = (i & 1) != 0;
        if (z) {
            iM43731 = c19203.m43731() + c19203.m43702();
        } else {
            iM43731 = -1;
        }
        if (this.f55717) {
            if (!z) {
                return;
            }
            this.f55717 = false;
            c19203.m43730(iM43731);
            this.f55715 = 0;
        }
        while (c19203.m43703() > 0) {
            int i2 = this.f55715;
            C19203 c19204 = this.f55718;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM43702 = c19203.m43702();
                    c19203.m43730(c19203.m43731() - 1);
                    if (iM43702 == 255) {
                        this.f55717 = true;
                        return;
                    }
                }
                int iMin = Math.min(c19203.m43703(), 3 - this.f55715);
                c19203.m43707(this.f55715, iMin, c19204.m43728());
                int i3 = this.f55715 + iMin;
                this.f55715 = i3;
                if (i3 == 3) {
                    c19204.m43730(0);
                    c19204.m43732(3);
                    c19204.m43724(1);
                    int iM43703 = c19204.m43702();
                    int iM43704 = c19204.m43702();
                    this.f55720 = (iM43703 & 128) != 0;
                    this.f55719 = (((iM43703 & 15) << 8) | iM43704) + 3;
                    int iM43718 = c19204.m43718();
                    int i4 = this.f55719;
                    if (iM43718 < i4) {
                        c19204.m43706(Math.min(C0719o.a.f2896b, Math.max(i4, c19204.m43718() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c19203.m43703(), this.f55719 - this.f55715);
                c19203.m43707(this.f55715, iMin2, c19204.m43728());
                int i5 = this.f55715 + iMin2;
                this.f55715 = i5;
                int i6 = this.f55719;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f55720) {
                        if (C5792.m12981(0, c19204.m43728(), this.f55719, -1) != 0) {
                            this.f55717 = true;
                            return;
                        }
                        c19204.m43732(this.f55719 - 4);
                    } else {
                        c19204.m43732(i6);
                    }
                    c19204.m43730(0);
                    this.f55716.mo24432(c19204);
                    this.f55715 = 0;
                }
            }
        }
    }
}
