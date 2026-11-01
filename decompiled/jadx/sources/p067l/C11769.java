package p067l;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۢ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11769 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public final String f32895;

    /* JADX INFO: renamed from: ۜ */
    public final C11157 f32896;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC23116 f32897;

    /* JADX INFO: renamed from: ܳ */
    public int f32898;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f32899;

    /* JADX INFO: renamed from: ܿ */
    public final C19203 f32900 = new C19203();

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f32901 = new byte[1024];

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC8974 f32902;

    /* JADX INFO: renamed from: ᩷ */
    public static final Pattern f32894 = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: ۢ */
    public static final Pattern f32893 = Pattern.compile("MPEGTS:(-?\\d+)");

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    public C11769(String str, C11157 c11157, InterfaceC8974 interfaceC8974, boolean z) {
        this.f32895 = str;
        this.f32896 = c11157;
        this.f32902 = interfaceC8974;
        this.f32899 = z;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        C17750 c17750 = (C17750) interfaceC10375;
        c17750.mo24038(false, 0, 6, this.f32901);
        byte[] bArr = this.f32901;
        C19203 c19203 = this.f32900;
        c19203.m43708(6, bArr);
        if (C9664.m22540(c19203)) {
            return true;
        }
        c17750.mo24038(false, 6, 3, this.f32901);
        c19203.m43708(9, this.f32901);
        return C9664.m22540(c19203);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        if (this.f32899) {
            interfaceC23116 = new C10986(interfaceC23116, this.f32902);
        }
        this.f32897 = interfaceC23116;
        interfaceC23116.mo5733(new C22131(-9223372036854775807L));
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        this.f32897.getClass();
        int length = (int) interfaceC10375.getLength();
        int i = this.f32898;
        byte[] bArr = this.f32901;
        if (i == bArr.length) {
            this.f32901 = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f32901;
        int i2 = this.f32898;
        int i3 = interfaceC10375.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f32898 + i3;
            this.f32898 = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        C19203 c19203 = new C19203(this.f32901);
        C9664.m22541(c19203);
        long jM12993 = 0;
        long jM22539 = 0;
        for (String strM43720 = c19203.m43720(StandardCharsets.UTF_8); !TextUtils.isEmpty(strM43720); strM43720 = c19203.m43720(StandardCharsets.UTF_8)) {
            if (strM43720.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f32894.matcher(strM43720);
                if (!matcher.find()) {
                    throw C10998.m25387("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM43720), (Throwable) null);
                }
                Matcher matcher2 = f32893.matcher(strM43720);
                if (!matcher2.find()) {
                    throw C10998.m25387("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM43720), (Throwable) null);
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                jM22539 = C9664.m22539(strGroup);
                String strGroup2 = matcher2.group(1);
                strGroup2.getClass();
                long j = Long.parseLong(strGroup2);
                String str = C5792.f14228;
                jM12993 = C5792.m12993(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
        }
        Matcher matcherM22538 = C9664.m22538(c19203);
        if (matcherM22538 == null) {
            m27003(0L);
            return -1;
        }
        String strGroup3 = matcherM22538.group(1);
        strGroup3.getClass();
        long jM225310 = C9664.m22539(strGroup3);
        String str2 = C5792.f14228;
        long jM25735 = this.f32896.m25735(C5792.m12993((jM12993 + jM225310) - jM22539, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
        InterfaceC20790 interfaceC20790M27003 = m27003(jM25735 - jM225310);
        byte[] bArr3 = this.f32901;
        int i5 = this.f32898;
        C19203 c19204 = this.f32900;
        c19204.m43708(i5, bArr3);
        interfaceC20790M27003.mo10500(this.f32898, c19204);
        interfaceC20790M27003.mo10502(jM25735, 1, this.f32898, 0, null);
        return -1;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC20790 m27003(long j) {
        InterfaceC20790 interfaceC20790Mo5732 = this.f32897.mo5732(0, 3);
        C3601 c3601 = new C3601();
        c3601.m6697("text/vtt");
        c3601.m6703(this.f32895);
        c3601.m6675(j);
        interfaceC20790Mo5732.mo10503(c3601.m6672());
        this.f32897.mo5734();
        return interfaceC20790Mo5732;
    }
}
