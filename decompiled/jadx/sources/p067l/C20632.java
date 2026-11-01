package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩵ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20632 {

    /* JADX INFO: renamed from: ֫ */
    public int f63742;

    /* JADX INFO: renamed from: ۧ */
    public long f63743;

    /* JADX INFO: renamed from: ܽ */
    public int f63745;

    /* JADX INFO: renamed from: ܿ */
    public int f63746;

    /* JADX INFO: renamed from: ᩻ */
    public int f63748;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f63747 = new int[255];

    /* JADX INFO: renamed from: ܳ */
    public final C19203 f63744 = new C19203(255);

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46630(InterfaceC10375 interfaceC10375, boolean z) throws C10998, EOFException {
        boolean zMo24038;
        boolean zMo24039;
        this.f63748 = 0;
        this.f63743 = 0L;
        this.f63746 = 0;
        this.f63745 = 0;
        this.f63742 = 0;
        C19203 c19203 = this.f63744;
        c19203.m43727(27);
        try {
            zMo24038 = interfaceC10375.mo24038(z, 0, 27, c19203.m43728());
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo24038 = false;
        }
        if (zMo24038 && c19203.m43725() == 1332176723) {
            if (c19203.m43702() == 0) {
                this.f63748 = c19203.m43702();
                this.f63743 = c19203.m43717();
                c19203.m43726();
                c19203.m43726();
                c19203.m43726();
                int iM43702 = c19203.m43702();
                this.f63746 = iM43702;
                this.f63745 = iM43702 + 27;
                c19203.m43727(iM43702);
                try {
                    zMo24039 = interfaceC10375.mo24038(z, 0, this.f63746, c19203.m43728());
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo24039 = false;
                }
                if (zMo24039) {
                    for (int i = 0; i < this.f63746; i++) {
                        int iM43703 = c19203.m43702();
                        this.f63747[i] = iM43703;
                        this.f63742 += iM43703;
                    }
                    return true;
                }
            } else if (!z) {
                throw C10998.m25388("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46629(InterfaceC10375 interfaceC10375, long j) {
        boolean zMo24038;
        C23877.m52957(interfaceC10375.getPosition() == interfaceC10375.mo24039());
        C19203 c19203 = this.f63744;
        c19203.m43727(4);
        while (true) {
            if (j != -1 && interfaceC10375.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo24038 = interfaceC10375.mo24038(true, 0, 4, c19203.m43728());
            } catch (EOFException unused) {
                zMo24038 = false;
            }
            if (!zMo24038) {
                break;
            }
            c19203.m43730(0);
            if (c19203.m43725() == 1332176723) {
                interfaceC10375.mo24036();
                return true;
            }
            interfaceC10375.mo24040(1);
        }
        do {
            if (j != -1 && interfaceC10375.getPosition() >= j) {
                break;
            }
        } while (interfaceC10375.mo24034(1) != -1);
        return false;
    }
}
