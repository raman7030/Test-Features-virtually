package l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C7331 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File[] f22520;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10678 f22521;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13680 f22522;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f22523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File[] f22524;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f22525;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f22526;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f22527;

    public C7331(C10678 c10678, String str) {
        this.f22521 = c10678;
        this.f22526 = str;
        int i = c10678.f32145;
        File file = c10678.f32128;
        this.f22525 = new long[i];
        this.f22520 = new File[i];
        this.f22524 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f22520[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f22524[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1505 m19688() {
        C10678 c10678 = this.f22521;
        int i = c10678.f32145;
        if (!Thread.holdsLock(c10678)) {
            throw new AssertionError();
        }
        InterfaceC1274[] interfaceC1274Arr = new InterfaceC1274[i];
        for (int i2 = 0; i2 < c10678.f32145; i2++) {
            try {
                interfaceC1274Arr[i2] = c10678.f32135.mo39430(this.f22520[i2]);
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < i; i3++) {
                    InterfaceC1274 interfaceC1274 = interfaceC1274Arr[i3];
                    if (interfaceC1274 == null) {
                        break;
                    }
                    C20032.m46179(interfaceC1274);
                }
                try {
                    c10678.m26798(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C1505(c10678, this.f22526, this.f22527, interfaceC1274Arr);
    }
}
