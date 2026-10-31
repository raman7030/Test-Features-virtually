package l;

import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۧ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10860 extends AbstractC2393 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C13864 f32617;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32618;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C13864 f32620 = C13864.m33217("multipart/mixed");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f32621;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11816 f32622;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f32623 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13864 f32624;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f32625;

    public C10860(C11816 c11816, C13864 c13864, ArrayList arrayList) {
        this.f32622 = c11816;
        this.f32624 = C13864.m33217(c13864 + "; boundary=" + c11816.mo2335());
        this.f32625 = C20032.m46175((List) arrayList);
    }

    static {
        C13864.m33217("multipart/alternative");
        C13864.m33217("multipart/digest");
        C13864.m33217("multipart/parallel");
        f32617 = C13864.m33217("multipart/form-data");
        f32619 = new byte[]{58, UTF8.S_CS3};
        f32618 = new byte[]{cb.k, 10};
        f32621 = new byte[]{45, 45};
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ܽ */
    public final C13864 mo1980() {
        return this.f32624;
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final long mo1976() {
        long j = this.f32623;
        if (j != -1) {
            return j;
        }
        long jM27154 = m27154((InterfaceC10405) null, true);
        this.f32623 = jM27154;
        return jM27154;
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final void mo1977(InterfaceC10405 interfaceC10405) {
        m27154(interfaceC10405, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m27154(InterfaceC10405 interfaceC10405, boolean z) {
        C12521 c12521;
        InterfaceC10405 c12522;
        if (z) {
            c12522 = new C12521();
            c12521 = c12522;
        } else {
            c12521 = 0;
            c12522 = interfaceC10405;
        }
        List list = this.f32625;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C11816 c11816 = this.f32622;
            byte[] bArr = f32621;
            byte[] bArr2 = f32618;
            if (i < size) {
                C1687 c1687 = (C1687) list.get(i);
                C10338 c10338 = c1687.f5854;
                AbstractC2393 abstractC2393 = c1687.f5853;
                c12522.write(bArr);
                c12522.mo26246(c11816);
                c12522.write(bArr2);
                int iM26139 = c10338.m26139();
                for (int i2 = 0; i2 < iM26139; i2++) {
                    c12522.mo26251(c10338.m26136(i2)).write(f32619).mo26251(c10338.m26140(i2)).write(bArr2);
                }
                C15797 c15797 = (C15797) abstractC2393;
                int i3 = c15797.f48725;
                C13864 c13864 = c15797.f48727;
                if (c13864 != null) {
                    c12522.mo26251("Content-Type: ").mo26251(c13864.toString()).write(bArr2);
                }
                long j2 = i3;
                if (j2 != -1) {
                    c12522.mo26251("Content-Length: ").mo26249(j2).write(bArr2);
                } else if (z) {
                    c12521.m30706();
                    return -1L;
                }
                c12522.write(bArr2);
                if (z) {
                    j += j2;
                } else {
                    c12522.mo26252(0, i3, c15797.f48726);
                }
                c12522.write(bArr2);
                i++;
            } else {
                c12522.write(bArr);
                c12522.mo26246(c11816);
                c12522.write(bArr);
                c12522.write(bArr2);
                if (!z) {
                    return j;
                }
                long size2 = c12521.size() + j;
                c12521.m30706();
                return size2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27155(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }
}
