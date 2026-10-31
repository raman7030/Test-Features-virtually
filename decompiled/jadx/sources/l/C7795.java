package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f24088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14144[] f24090 = new C14144[16];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f24091;

    public C7795(C1654 c1654) {
        this.f24091 = c1654;
        int i = 0;
        while (true) {
            C14144[] c14144Arr = this.f24090;
            if (i < c14144Arr.length) {
                c14144Arr[i] = new C14144();
                i++;
            } else {
                this.f24088 = 0;
                this.f24089 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14144 m20823(int i) throws C16532, C23317 {
        this.f24088--;
        int i2 = this.f24089;
        int i3 = i2 + 1;
        this.f24089 = i3;
        C14144[] c14144Arr = this.f24090;
        if (i3 == c14144Arr.length) {
            this.f24089 = 0;
        }
        C14144 c14144 = c14144Arr[i2];
        if (c14144.f42689 == i) {
            c14144.f42689 = 0;
            return c14144;
        }
        long j = C13132.FOREVER_NS;
        for (C14144 c14145 : c14144Arr) {
            if (c14145.f42689 != 0) {
                long j2 = c14145.f42691;
                if (j > j2) {
                    j = j2;
                }
            }
        }
        for (C14144 c14146 : c14144Arr) {
            if (c14146.f42689 == i) {
                c14146.f42689 = 0;
                C23317 c23317 = new C23317();
                c23317.f74943 = j;
                throw c23317;
            }
        }
        throw new C16532(4, C19370.m44628(i, "RequestQueue: unknown request id "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20824(C16261 c16261, C6384 c6384) throws IOException {
        int i = this.f24088;
        for (int i2 = 0; i2 < i; i2++) {
            C1654 c1654 = this.f24091;
            c1654.m5565(c16261, c6384);
            int i3 = c6384.f19747;
            int i4 = 0;
            while (true) {
                C14144[] c14144Arr = this.f24090;
                if (i4 >= c14144Arr.length) {
                    break;
                }
                C14144 c14144 = c14144Arr[i4];
                if (c14144.f42689 == c6384.f19748) {
                    c14144.f42689 = 0;
                    break;
                }
                i4++;
            }
            C1654.m5557(c1654, i3);
        }
        this.f24088 = 0;
        this.f24089 = 0;
    }
}
