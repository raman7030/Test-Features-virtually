package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11823 {

    /* JADX INFO: renamed from: ֫ */
    public final int f32990;

    /* JADX INFO: renamed from: ۧ */
    public final Object[] f32991;

    /* JADX INFO: renamed from: ܽ */
    public int f32992;

    public C11823(C9376 c9376) {
        int iM35116 = c9376.m35116();
        int iM35123 = c9376.m35123();
        this.f32992 = 0;
        this.f32991 = new Object[iM35116];
        this.f32990 = iM35123;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m27089() {
        synchronized (this.f32991) {
            if (this.f32992 > 0) {
                int i = 0;
                while (true) {
                    Object[] objArr = this.f32991;
                    if (i >= objArr.length) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (obj != null) {
                        byte[] bArr = (byte[]) obj;
                        objArr[i] = null;
                        this.f32992--;
                        return bArr;
                    }
                    i++;
                }
            }
            return new byte[this.f32990];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27088(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = 0;
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.f32991) {
            if (this.f32992 < this.f32991.length) {
                while (true) {
                    Object[] objArr = this.f32991;
                    if (i >= objArr.length) {
                        break;
                    }
                    if (objArr[i] == null) {
                        objArr[i] = bArr;
                        this.f32992++;
                        return;
                    }
                    i++;
                }
            }
        }
    }
}
