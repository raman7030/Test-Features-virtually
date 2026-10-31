package l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import bin.mt.plus.R;
import bin.mt.term.Exec;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17574 extends AbstractC2821 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f53704;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11783 f53705;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f53706;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f53707;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public final Handler f53708;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f53709;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f53710;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5242 f53711;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17637 f53712;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53713;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f53714;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f53715;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18986 f53716;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f53717;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f53718;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11783 f53719;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String[] f53720;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41098() {
        return this.f53709 != -1;
    }

    public C17574(String str, String str2, String[] strArr, String[] strArr2, boolean z, C18986 c18986) {
        super(0);
        this.f53719 = new C11783();
        this.f53705 = new C11783();
        this.f53717 = new byte[5];
        this.f53718 = new CountDownLatch(1);
        this.f53711 = new C5242();
        this.f53708 = new HandlerC14108(this, Looper.getMainLooper());
        this.f53716 = c18986;
        this.f53710 = str;
        this.f53715 = str2;
        this.f53714 = strArr;
        this.f53720 = strArr2;
        this.f53707 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC16868 m41099() {
        return this.f53716;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5242 m41093() {
        return this.f53711;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41096(int i) {
        if (this.f53707) {
            this.f53704 = C4925.m14306(R.string.MT_Protector, Integer.valueOf(i));
        } else {
            this.f53704 = C4925.m14306(R.string.MT_Protector, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m41092() {
        return this.f53707;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m41095() {
        return this.f53710;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41090(int i, float f, int i2) {
        Field declaredField;
        this.f53706 = f;
        if (this.f53712 != null) {
            Exec.setPtyWindowSize(this.f53713, i2, i);
            this.f53712.m41250(i, i2);
            return;
        }
        this.f53712 = new C17637(this, i, i2);
        int[] iArr = new int[1];
        int iCreateSubprocess = Exec.createSubprocess(this.f53710, this.f53715, this.f53714, this.f53720, iArr);
        this.f53713 = iCreateSubprocess;
        this.f53709 = iArr[0];
        Exec.setPtyWindowSize(iCreateSubprocess, i2, i);
        this.f53711.mo1664(Boolean.valueOf(m41098()));
        int i3 = this.f53713;
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
        new C7759(this, fileDescriptor).start();
        new C2052(this, fileDescriptor).start();
        new C11225(this).start();
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final void mo8712(int i, byte[] bArr) {
        if (this.f53709 > 0) {
            this.f53705.m28840(i, bArr);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41091(int i, boolean z) {
        int i2;
        int i3;
        if (i > 1114111 || (i >= 55296 && i <= 57343)) {
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid code point: "));
        }
        int i4 = 0;
        byte[] bArr = this.f53717;
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
        mo8712(i3, bArr);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17637 m41100() {
        return this.f53712;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41087(C17574 c17574) {
        c17574.f53716.m43824();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41097() {
        if (m41098()) {
            Exec.killAll(this.f53709);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m41081(C17574 c17574) {
        try {
            c17574.f53718.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        synchronized (c17574) {
            c17574.f53709 = -1;
            c17574.f53711.mo1664(Boolean.FALSE);
        }
        c17574.f53705.m28839();
        c17574.f53719.m28839();
        Exec.close(c17574.f53713);
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ܿ */
    public final void mo8720() {
        this.f53716.getClass();
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final void mo8713(String str) {
        this.f53716.m43821(str);
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ܽ */
    public final void mo8719() {
        this.f53716.m43820();
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8721() {
        this.f53716.m43823();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float m41094() {
        return this.f53706;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41089(float f) {
        this.f53706 = f;
    }
}
