package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16945 implements InterfaceC19383 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8353 f52016;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C8353 f52017;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f52018;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f52020;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8353 f52021;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8353 f52022;

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8454(long j) {
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return mo8458(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8453(int i, C17714 c17714) {
        mo8457(c17714, i, 0);
    }

    static {
        C1297 c1297 = new C1297();
        c1297.m4465("application/id3");
        f52017 = c1297.m4440();
        C1297 c1298 = new C1297();
        c1298.m4465("application/x-emsg");
        f52016 = c1298.m4440();
    }

    public C16945(InterfaceC19383 interfaceC19383, int i) {
        this.f52020 = interfaceC19383;
        if (i == 1) {
            this.f52022 = f52017;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C19370.m44628(i, "Unknown metadataType: "));
            }
            this.f52022 = f52016;
        }
        this.f52018 = new byte[0];
        this.f52019 = 0;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8456(C8353 c8353) {
        this.f52021 = c8353;
        this.f52020.mo8456(this.f52022);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۧ */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) throws EOFException {
        int i2 = this.f52019 + i;
        byte[] bArr = this.f52018;
        if (bArr.length < i2) {
            this.f52018 = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC9765.read(this.f52018, this.f52019, i);
        if (i3 != -1) {
            this.f52019 += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8457(C17714 c17714, int i, int i2) {
        int i3 = this.f52019 + i;
        byte[] bArr = this.f52018;
        if (bArr.length < i3) {
            this.f52018 = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c17714.m41461(this.f52019, i, this.f52018);
        this.f52019 += i;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8455(long j, int i, int i2, int i3, C18677 c18677) {
        this.f52021.getClass();
        int i4 = this.f52019 - i3;
        C17714 c17714 = new C17714(Arrays.copyOfRange(this.f52018, i4 - i2, i4));
        byte[] bArr = this.f52018;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f52019 = i3;
        String str = this.f52021.f25614;
        C8353 c8353 = this.f52022;
        String str2 = c8353.f25614;
        String str3 = c8353.f25614;
        if (!C11003.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f52021.f25614)) {
                C20067 c20067M13350 = C4544.m13350(c17714);
                C8353 c8353Mo1025 = c20067M13350.mo1025();
                if (c8353Mo1025 == null || !C11003.equals(str3, c8353Mo1025.f25614)) {
                    C19956.m46037("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c20067M13350.mo1025());
                    return;
                }
                byte[] bArrMo1027 = c20067M13350.mo1027();
                bArrMo1027.getClass();
                c17714 = new C17714(bArrMo1027);
            } else {
                C19956.m46037("Ignoring sample for unsupported format: " + this.f52021.f25614);
                return;
            }
        }
        int iM41457 = c17714.m41457();
        InterfaceC19383 interfaceC19383 = this.f52020;
        interfaceC19383.mo8453(iM41457, c17714);
        interfaceC19383.mo8455(j, i, iM41457, 0, c18677);
    }
}
