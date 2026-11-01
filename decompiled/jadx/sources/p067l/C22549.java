package p067l;

import android.os.Build;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final class C22549 extends AbstractC15010 implements Serializable {

    /* JADX INFO: renamed from: ۗ */
    public final String f71125;

    /* JADX INFO: renamed from: ۙ */
    public final long f71126;

    /* JADX INFO: renamed from: ۫ */
    public final long f71127;

    /* JADX INFO: renamed from: ۬ */
    public final String f71128;

    /* JADX INFO: renamed from: ᩶ */
    public final long f71129;

    /* JADX INFO: renamed from: ᩸ */
    public final String f71130;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f71131;

    public C22549(String str, long j, long j2, long j3, boolean z, String str2, String str3) {
        this.f71128 = str;
        this.f71126 = j;
        this.f71129 = j2;
        this.f71127 = j3;
        this.f71131 = z;
        this.f71125 = str2;
        this.f71130 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22549)) {
            return false;
        }
        C22549 c22549 = (C22549) obj;
        return this.f71131 == c22549.f71131 && this.f71126 == c22549.f71126 && this.f71129 == c22549.f71129 && this.f71127 == c22549.f71127 && C12826.equals(this.f71128, c22549.f71128) && C12826.equals(this.f71125, c22549.f71125) && C12826.equals(this.f71130, c22549.f71130);
    }

    public final int hashCode() {
        int i = this.f71131 ? 1231 : 1237;
        long j = this.f71126;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f71129;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f71127;
        return C12826.hashCode(this.f71130) + C21720.m49003(C21720.m49003((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f71128), 31, this.f71125);
    }

    public final long size() {
        return this.f71127;
    }

    public final String toString() {
        Object[] objArr = {this.f71128, Long.valueOf(this.f71126), Long.valueOf(this.f71129), Long.valueOf(this.f71127), Boolean.valueOf(this.f71131), this.f71125, this.f71130};
        String[] strArrSplit = "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".length() == 0 ? new String[0] : "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22549.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50525() {
        return this.f71130;
    }

    /* JADX INFO: renamed from: ۚ */
    public final long m50528() {
        return this.f71129;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m50529() {
        return this.f71128;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m50531() {
        return this.f71126;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m50533() {
        return this.f71131;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m50534() {
        return this.f71125;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22549 m50530(long j) {
        return new C22549(this.f71128, this.f71126, this.f71129, j, this.f71131, this.f71125, this.f71130);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 m50532() {
        return C23219.m51756().m38684(this.f71128 + "/" + this.f71130);
    }

    public final boolean delete() {
        StringBuilder sb = new StringBuilder("$RECYCLE.BIN$/");
        String str = this.f71128;
        sb.append(str);
        AbstractC17043 abstractC17043M42109 = C18524.m42109(sb.toString(), new String[0]);
        C23219.f72964.getClass();
        abstractC17043M42109.mo25503();
        if (m50532().mo25094()) {
            return false;
        }
        C23219.m51756().m38684(".i/" + str).mo25503();
        ((ConcurrentMapC12768) C23219.f72961).remove(str);
        C23219.f72964.getClass();
        abstractC17043M42109.mo25503();
        return true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m50527() {
        String str = this.f71128;
        String strM51757 = C23219.m51757();
        String str2 = this.f71125;
        if (C18524.m42115(str2, strM51757)) {
            return false;
        }
        C11996 c11996M45308 = C19965.m45308(541279570);
        c11996M45308.m27451(this.f71126);
        c11996M45308.m27451(this.f71129);
        c11996M45308.m27451(this.f71127);
        c11996M45308.m27459(str2);
        try {
            C23219.m51756().m38684(".i/" + str).m38654(c11996M45308);
            ((ConcurrentMapC12768) C23219.f72961).put(str, this);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC17043 m50526() throws IOException {
        C13102 c13102;
        AbstractC17043 abstractC17043M50532 = m50532();
        AbstractC17043 abstractC17043 = C17853.f53287;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(this.f71125);
        if (Build.VERSION.SDK_INT >= 30 && (abstractC17043M38684 instanceof C14717) && C23770.m52834().mo4997() && abstractC17043M50532.mo25505().startsWith(abstractC17043.mo25505())) {
            C13102 c13102M33654 = abstractC17043M38684.mo33651().m33654();
            C12826.requireNonNull(c13102M33654);
            c13102 = c13102M33654;
            abstractC17043M50532 = new C13102(new File("/data/media/" + abstractC17043.getName() + abstractC17043M50532.mo25505().substring(abstractC17043.mo25505().length())), false);
        } else {
            c13102 = abstractC17043M38684;
        }
        AbstractC17043 abstractC17043M38650 = c13102.m38650(true);
        if (!abstractC17043M38684.getName().equals(abstractC17043M38650.getName())) {
            abstractC17043M38684 = abstractC17043M38684.m38682(abstractC17043M38650.getName());
        }
        abstractC17043M38650.mo37342();
        abstractC17043M50532.m38656(abstractC17043M38650, (Runnable) null);
        delete();
        abstractC17043M38650.mo20486(this.f71129);
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22549 m50522(AbstractC17043 abstractC17043) {
        String name = abstractC17043.getName();
        C22549 c22549 = (C22549) ((ConcurrentMapC12768) C23219.f72961).get(name);
        if (c22549 != null) {
            if (c22549.m50532().mo25094()) {
                return c22549;
            }
            abstractC17043.mo25503();
            ((ConcurrentMapC12768) C23219.f72961).remove(name);
            return null;
        }
        try {
            C14677 c14677M38686 = abstractC17043.m38686();
            C23395.m52060((InterfaceC21384) c14677M38686, 541279570);
            long j = c14677M38686.readLong();
            long j2 = c14677M38686.readLong();
            long j3 = c14677M38686.readLong();
            String strM33593 = c14677M38686.m33593();
            String strM50520 = m50520(strM33593);
            AbstractC17043 abstractC17043M38684 = C23219.m51756().m38684(name + "/" + strM50520);
            if (!abstractC17043M38684.mo25094()) {
                abstractC17043.mo25503();
                return null;
            }
            C22549 c225410 = new C22549(name, j, j2, j3, abstractC17043M38684.mo25087(), strM33593, strM50520);
            ((ConcurrentMapC12768) C23219.f72961).put(name, c225410);
            return c225410;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:0: B:9:0x0023->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C22549 m50523(C17182 c17182, InterfaceC18588 interfaceC18588) {
        long j;
        String str;
        String upperCase;
        File file = c17182.f51152;
        String strM42102 = C18524.m42102(c17182.mo25505());
        if (strM42102 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLastModified = file.lastModified();
        long jM38648 = c17182.m38648(interfaceC18588);
        if (interfaceC18588.mo3924()) {
            return null;
        }
        while (true) {
            long jNextLong = C23219.f72963.nextLong();
            if (jNextLong == 0) {
                str = "0";
            } else {
                if (jNextLong > 0) {
                    str = Long.toString(jNextLong, 36);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (jNextLong >>> 1) / ((long) 18);
                    long j3 = 36;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (jNextLong - (j2 * j3)), 36);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 36);
                        j2 /= j3;
                        jM38648 = jM38648;
                    }
                    j = jM38648;
                    str = new String(cArr, i, 64 - i);
                }
                upperCase = str.toUpperCase();
                if (!((ConcurrentMapC12768) C23219.f72961).containsKey(upperCase)) {
                    return new C22549(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM42102, m50520(strM42102));
                }
                jM38648 = j;
            }
            j = jM38648;
            upperCase = str.toUpperCase();
            if (!((ConcurrentMapC12768) C23219.f72961).containsKey(upperCase)) {
                return new C22549(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM42102, m50520(strM42102));
            }
            jM38648 = j;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50520(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
