package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۚۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7220 extends AbstractC16607 {

    /* JADX INFO: renamed from: ۘ */
    public boolean f18844;

    /* JADX INFO: renamed from: ᩵ */
    public static final byte[] f18843 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: ᩴ */
    public static final byte[] f18842 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: ۧ */
    public static boolean m16560(C19203 c19203) {
        return m16559(c19203, f18843);
    }

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final void mo9593(boolean z) {
        super.mo9593(z);
        if (z) {
            this.f18844 = false;
        }
    }

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final long mo9592(C19203 c19203) {
        return m37632(C6112.m13912(c19203.m43728()));
    }

    @Override // p067l.AbstractC16607
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9594(C19203 c19203, long j, C3196 c3196) {
        if (m16559(c19203, f18843)) {
            byte[] bArrCopyOf = Arrays.copyOf(c19203.m43728(), c19203.m43729());
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM13908 = C6112.m13908(bArrCopyOf);
            if (c3196.f6200 == null) {
                C3601 c3601 = new C3601();
                c3601.m6694("audio/ogg");
                c3601.m6697("audio/opus");
                c3601.m6704(i);
                c3601.m6688(48000);
                c3601.m6678((List) arrayListM13908);
                c3196.f6200 = c3601.m6672();
                return true;
            }
        } else if (m16559(c19203, f18842)) {
            C23877.m52958(c3196.f6200);
            if (!this.f18844) {
                this.f18844 = true;
                c19203.m43724(8);
                C25079 c25079M51004 = C22801.m51004(AbstractC16192.m36882(C22801.m51003(c19203, false, false).f6558));
                if (c25079M51004 != null) {
                    C3601 c3601M23918 = c3196.f6200.m23918();
                    c3601M23918.m6681(c25079M51004.m55051(c3196.f6200.f28526));
                    c3196.f6200 = c3601M23918.m6672();
                    return true;
                }
            }
        } else {
            C23877.m52958(c3196.f6200);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16559(C19203 c19203, byte[] bArr) {
        if (c19203.m43703() < bArr.length) {
            return false;
        }
        int iM43731 = c19203.m43731();
        byte[] bArr2 = new byte[bArr.length];
        c19203.m43707(0, bArr.length, bArr2);
        c19203.m43730(iM43731);
        return Arrays.equals(bArr2, bArr);
    }
}
