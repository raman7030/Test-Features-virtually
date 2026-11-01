package p067l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C9336 {

    /* JADX INFO: renamed from: ֫ */
    public final File[] f25433;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C12516 f25434;

    /* JADX INFO: renamed from: ۧ */
    public C15370 f25435;

    /* JADX INFO: renamed from: ܳ */
    public boolean f25436;

    /* JADX INFO: renamed from: ܽ */
    public final File[] f25437;

    /* JADX INFO: renamed from: ܿ */
    public final long[] f25438;

    /* JADX INFO: renamed from: ᩳ */
    public final String f25439;

    /* JADX INFO: renamed from: ᩻ */
    public long f25440;

    public C9336(C12516 c12516, String str) {
        this.f25434 = c12516;
        this.f25439 = str;
        int i = c12516.f35116;
        File file = c12516.f35099;
        this.f25438 = new long[i];
        this.f25433 = new File[i];
        this.f25437 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f25433[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f25437[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3798 m21661() {
        C12516 c12516 = this.f25434;
        int i = c12516.f35116;
        if (!Thread.holdsLock(c12516)) {
            throw new AssertionError();
        }
        InterfaceC3579[] interfaceC3579Arr = new InterfaceC3579[i];
        for (int i2 = 0; i2 < c12516.f35116; i2++) {
            try {
                interfaceC3579Arr[i2] = c12516.f35106.mo41666(this.f25433[i2]);
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < i; i3++) {
                    InterfaceC3579 interfaceC3579 = interfaceC3579Arr[i3];
                    if (interfaceC3579 == null) {
                        break;
                    }
                    C21407.m48495(interfaceC3579);
                }
                try {
                    c12516.m28837(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C3798(c12516, this.f25439, this.f25440, interfaceC3579Arr);
    }
}
