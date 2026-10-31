package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܺܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1WM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16084 implements InterfaceC0562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC0562 f49570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f49571;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0562[] f49572;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f49573;

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2313(long j, C23411 c23411) {
        C4091.m12293(this, c23411, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2315(MessageDigest messageDigest, long j) {
        C4091.m12292(this, messageDigest, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC0562 mo2317() {
        return C4091.m12290(this);
    }

    public C16084(InterfaceC0562... interfaceC0562Arr) {
        if (interfaceC0562Arr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f49572 = interfaceC0562Arr;
        this.f49569 = 0;
        this.f49570 = interfaceC0562Arr[0];
        this.f49571 = 0L;
        this.f49573 = 0L;
        for (InterfaceC0562 interfaceC0562 : interfaceC0562Arr) {
            this.f49573 = interfaceC0562.size() + this.f49573;
        }
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ۧ */
    public final long mo2316() {
        return size() - mo2312();
    }

    @Override // l.InterfaceC0562
    public final long size() {
        return this.f49573;
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final long mo2312() {
        return this.f49571;
    }

    @Override // l.InterfaceC0562
    public final void reset() {
        this.f49569 = 0;
        InterfaceC0562[] interfaceC0562Arr = this.f49572;
        this.f49570 = interfaceC0562Arr[0];
        this.f49571 = 0L;
        for (InterfaceC0562 interfaceC0562 : interfaceC0562Arr) {
            interfaceC0562.reset();
        }
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final void mo2314(OutputStream outputStream, long j) throws EOFException {
        if (j > mo2316()) {
            throw new EOFException();
        }
        while (j > 0) {
            long jMin = Math.min(j, this.f49570.mo2316());
            this.f49570.mo2314(outputStream, jMin);
            j -= jMin;
            this.f49571 += jMin;
            if (this.f49570.mo2316() == 0) {
                int i = this.f49569;
                InterfaceC0562[] interfaceC0562Arr = this.f49572;
                if (i < interfaceC0562Arr.length - 1) {
                    int i2 = i + 1;
                    this.f49569 = i2;
                    this.f49570 = interfaceC0562Arr[i2];
                }
            }
        }
    }
}
