package p067l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import bin.p000mt.plus.R;
import bin.p000mt.term.Exec;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19071 extends AbstractC5050 {

    /* JADX INFO: renamed from: ֡ */
    public String f56894;

    /* JADX INFO: renamed from: ۖ */
    public final C13567 f56895;

    /* JADX INFO: renamed from: ۘ */
    public float f56896;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f56897;

    /* JADX INFO: renamed from: ۜ */
    @SuppressLint({"HandlerLeak"})
    public final Handler f56898;

    /* JADX INFO: renamed from: ۡ */
    public int f56899;

    /* JADX INFO: renamed from: ۢ */
    public final String f56900;

    /* JADX INFO: renamed from: ۧ */
    public final C7350 f56901;

    /* JADX INFO: renamed from: ܳ */
    public C19131 f56902;

    /* JADX INFO: renamed from: ܺ */
    public int f56903;

    /* JADX INFO: renamed from: ܽ */
    public final String[] f56904;

    /* JADX INFO: renamed from: ܿ */
    public final String f56905;

    /* JADX INFO: renamed from: ᩳ */
    public final C20413 f56906;

    /* JADX INFO: renamed from: ᩴ */
    public final byte[] f56907;

    /* JADX INFO: renamed from: ᩵ */
    public final CountDownLatch f56908;

    /* JADX INFO: renamed from: ᩷ */
    public final C13567 f56909;

    /* JADX INFO: renamed from: ᩻ */
    public final String[] f56910;

    /* JADX INFO: renamed from: ܺ */
    public final synchronized boolean m43344() {
        return this.f56899 != -1;
    }

    public C19071(String str, String str2, String[] strArr, String[] strArr2, boolean z, C20413 c20413) {
        super(0);
        this.f56909 = new C13567();
        this.f56895 = new C13567();
        this.f56907 = new byte[5];
        this.f56908 = new CountDownLatch(1);
        this.f56901 = new C7350();
        this.f56898 = new HandlerC15777(this, Looper.getMainLooper());
        this.f56906 = c20413;
        this.f56900 = str;
        this.f56905 = str2;
        this.f56904 = strArr;
        this.f56910 = strArr2;
        this.f56897 = z;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC18400 m43345() {
        return this.f56906;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C7350 m43339() {
        return this.f56901;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43342(int i) {
        if (this.f56897) {
            this.f56894 = C7050.m16203(R.string.MT_Protector, Integer.valueOf(i));
        } else {
            this.f56894 = C7050.m16203(R.string.MT_Protector, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m43338() {
        return this.f56897;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m43341() {
        return this.f56900;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43336(int i, float f, int i2) {
        Field declaredField;
        this.f56896 = f;
        if (this.f56902 != null) {
            Exec.setPtyWindowSize(this.f56903, i2, i);
            this.f56902.m43496(i, i2);
            return;
        }
        this.f56902 = new C19131(this, i, i2);
        int[] iArr = new int[1];
        int iCreateSubprocess = Exec.createSubprocess(this.f56900, this.f56905, this.f56904, this.f56910, iArr);
        this.f56903 = iCreateSubprocess;
        this.f56899 = iArr[0];
        Exec.setPtyWindowSize(iCreateSubprocess, i2, i);
        this.f56901.mo4062(Boolean.valueOf(m43344()));
        int i3 = this.f56903;
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            try {
                declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            declaredField = FileDescriptor.class.getDeclaredField("fd");
        }
        declaredField.setAccessible(true);
        declaredField.set(fileDescriptor, Integer.valueOf(i3));
        new C9743(this, fileDescriptor).start();
        new C4319(this, fileDescriptor).start();
        new C13037(this).start();
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final void mo10773(int i, byte[] bArr) {
        if (this.f56899 > 0) {
            this.f56895.m30888(i, bArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43337(int i, boolean z) {
        int i2;
        int i3;
        if (i > 1114111 || (i >= 55296 && i <= 57343)) {
            throw new IllegalArgumentException(C20778.m46922(i, "Invalid code point: "));
        }
        int i4 = 0;
        byte[] bArr = this.f56907;
        if (z) {
            bArr[0] = 27;
            i4 = 1;
        }
        if (i <= 127) {
            i3 = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            if (i <= 2047) {
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 6) | 192);
                i2 = i4 + 2;
                bArr[i5] = (byte) ((i & 63) | 128);
            } else if (i <= 65535) {
                bArr[i4] = (byte) ((i >> 12) | BERTags.FLAGS);
                bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((i & 63) | 128);
            } else {
                bArr[i4] = (byte) ((i >> 18) | 240);
                bArr[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                int i6 = i4 + 3;
                bArr[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                i2 = i4 + 4;
                bArr[i6] = (byte) ((i & 63) | 128);
            }
            i3 = i2;
        }
        mo10773(i3, bArr);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C19131 m43346() {
        return this.f56902;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m43333(C19071 c19071) {
        c19071.f56906.m46092();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m43343() {
        if (m43344()) {
            Exec.killAll(this.f56899);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m43327(C19071 c19071) {
        try {
            c19071.f56908.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        synchronized (c19071) {
            c19071.f56899 = -1;
            c19071.f56901.mo4062(Boolean.FALSE);
        }
        c19071.f56895.m30887();
        c19071.f56909.m30887();
        Exec.close(c19071.f56903);
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ܿ */
    public final void mo10781() {
        this.f56906.getClass();
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final void mo10774(String str) {
        this.f56906.m46089(str);
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ܽ */
    public final void mo10780() {
        this.f56906.m46088();
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10782() {
        this.f56906.m46091();
    }

    /* JADX INFO: renamed from: ۡ */
    public final float m43340() {
        return this.f56896;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43335(float f) {
        this.f56896 = f;
    }
}
