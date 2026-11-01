package p067l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18473 implements InterfaceC20790 {

    /* JADX INFO: renamed from: ܳ */
    public static final C10307 f55197;

    /* JADX INFO: renamed from: ᩻ */
    public static final C10307 f55198;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f55199;

    /* JADX INFO: renamed from: ۧ */
    public int f55200;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20790 f55201;

    /* JADX INFO: renamed from: ܿ */
    public C10307 f55202;

    /* JADX INFO: renamed from: ᩳ */
    public final C10307 f55203;

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo10501(long j) {
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final int mo10498(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return mo10505(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10500(int i, C19203 c19203) {
        mo10504(c19203, i, 0);
    }

    static {
        C3601 c3601 = new C3601();
        c3601.m6697("application/id3");
        f55198 = c3601.m6672();
        C3601 c3602 = new C3601();
        c3602.m6697("application/x-emsg");
        f55197 = c3602.m6672();
    }

    public C18473(InterfaceC20790 interfaceC20790, int i) {
        this.f55201 = interfaceC20790;
        if (i == 1) {
            this.f55203 = f55198;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C20778.m46922(i, "Unknown metadataType: "));
            }
            this.f55203 = f55197;
        }
        this.f55199 = new byte[0];
        this.f55200 = 0;
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10503(C10307 c10307) {
        this.f55202 = c10307;
        this.f55201.mo10503(this.f55203);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ۧ */
    public final int mo10505(InterfaceC11649 interfaceC11649, int i, boolean z) throws EOFException {
        int i2 = this.f55200 + i;
        byte[] bArr = this.f55199;
        if (bArr.length < i2) {
            this.f55199 = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC11649.read(this.f55199, this.f55200, i);
        if (i3 != -1) {
            this.f55200 += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10504(C19203 c19203, int i, int i2) {
        int i3 = this.f55200 + i;
        byte[] bArr = this.f55199;
        if (bArr.length < i3) {
            this.f55199 = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c19203.m43707(this.f55200, i, this.f55199);
        this.f55200 += i;
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10502(long j, int i, int i2, int i3, C20119 c20119) {
        this.f55202.getClass();
        int i4 = this.f55200 - i3;
        C19203 c19203 = new C19203(Arrays.copyOfRange(this.f55199, i4 - i2, i4));
        byte[] bArr = this.f55199;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f55200 = i3;
        String str = this.f55202.f28528;
        C10307 c10307 = this.f55203;
        String str2 = c10307.f28528;
        String str3 = c10307.f28528;
        if (!C12826.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f55202.f28528)) {
                C21440 c21440M15238 = C6687.m15238(c19203);
                C10307 c10307Mo3421 = c21440M15238.mo3421();
                if (c10307Mo3421 == null || !C12826.equals(str3, c10307Mo3421.f28528)) {
                    C21334.m48351("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c21440M15238.mo3421());
                    return;
                }
                byte[] bArrMo3423 = c21440M15238.mo3423();
                bArrMo3423.getClass();
                c19203 = new C19203(bArrMo3423);
            } else {
                C21334.m48351("Ignoring sample for unsupported format: " + this.f55202.f28528);
                return;
            }
        }
        int iM43703 = c19203.m43703();
        InterfaceC20790 interfaceC20790 = this.f55201;
        interfaceC20790.mo10500(iM43703, c19203);
        interfaceC20790.mo10502(j, i, iM43703, 0, c20119);
    }
}
