package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۚۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5105 extends AbstractC14982 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f16010;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f16009 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f16008 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m14652(C17714 c17714) {
        return m14651(c17714, f16009);
    }

    @Override // l.AbstractC14982
    /* JADX INFO: renamed from: ֫ */
    public final void mo7525(boolean z) {
        super.mo7525(z);
        if (z) {
            this.f16010 = false;
        }
    }

    @Override // l.AbstractC14982
    /* JADX INFO: renamed from: ֫ */
    public final long mo7524(C17714 c17714) {
        return m35476(C3939.m11992(c17714.m41482()));
    }

    @Override // l.AbstractC14982
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7526(C17714 c17714, long j, C0871 c0871) {
        if (m14651(c17714, f16009)) {
            byte[] bArrCopyOf = Arrays.copyOf(c17714.m41482(), c17714.m41483());
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM11988 = C3939.m11988(bArrCopyOf);
            if (c0871.f3427 == null) {
                C1297 c1297 = new C1297();
                c1297.m4462("audio/ogg");
                c1297.m4465("audio/opus");
                c1297.m4472(i);
                c1297.m4456(48000);
                c1297.m4446((List) arrayListM11988);
                c0871.f3427 = c1297.m4440();
                return true;
            }
        } else if (m14651(c17714, f16008)) {
            C22632.m50632(c0871.f3427);
            if (!this.f16010) {
                this.f16010 = true;
                c17714.m41478(8);
                C23896 c23896M48667 = C21499.m48667(AbstractC14545.m34733(C21499.m48666(c17714, false, false).f3786));
                if (c23896M48667 != null) {
                    C1297 c1297M21948 = c0871.f3427.m21948();
                    c1297M21948.m4449(c23896M48667.m52642(c0871.f3427.f25612));
                    c0871.f3427 = c1297M21948.m4440();
                    return true;
                }
            }
        } else {
            C22632.m50632(c0871.f3427);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14651(C17714 c17714, byte[] bArr) {
        if (c17714.m41457() < bArr.length) {
            return false;
        }
        int iM41485 = c17714.m41485();
        byte[] bArr2 = new byte[bArr.length];
        c17714.m41461(0, bArr.length, bArr2);
        c17714.m41484(iM41485);
        return Arrays.equals(bArr2, bArr);
    }
}
