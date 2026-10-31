package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final class C21234 extends AbstractC13301 implements Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f68442;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f68443;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f68444;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f68445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f68446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f68447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f68448;

    public C21234(String str, long j, long j2, long j3, boolean z, String str2, String str3) {
        this.f68445 = str;
        this.f68443 = j;
        this.f68446 = j2;
        this.f68444 = j3;
        this.f68448 = z;
        this.f68442 = str2;
        this.f68447 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21234)) {
            return false;
        }
        C21234 c21234 = (C21234) obj;
        return this.f68448 == c21234.f68448 && this.f68443 == c21234.f68443 && this.f68446 == c21234.f68446 && this.f68444 == c21234.f68444 && C11003.equals(this.f68445, c21234.f68445) && C11003.equals(this.f68442, c21234.f68442) && C11003.equals(this.f68447, c21234.f68447);
    }

    public final int hashCode() {
        int i = this.f68448 ? 1231 : 1237;
        long j = this.f68443;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f68446;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f68444;
        return C11003.hashCode(this.f68447) + C20361.m46680(C20361.m46680((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f68445), 31, this.f68442);
    }

    public final long size() {
        return this.f68444;
    }

    public final String toString() {
        Object[] objArr = {this.f68445, Long.valueOf(this.f68443), Long.valueOf(this.f68446), Long.valueOf(this.f68444), Boolean.valueOf(this.f68448), this.f68442, this.f68447};
        String[] strArrSplit = "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".length() == 0 ? new String[0] : "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21234.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48194() {
        return this.f68447;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m48197() {
        return this.f68446;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m48198() {
        return this.f68445;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m48200() {
        return this.f68443;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m48202() {
        return this.f68448;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m48203() {
        return this.f68442;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21234 m48199(long j) {
        return new C21234(this.f68445, this.f68443, this.f68446, j, this.f68448, this.f68442, this.f68447);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m48201() {
        return C21939.m49419().m36526(this.f68445 + "/" + this.f68447);
    }

    public final boolean delete() {
        StringBuilder sb = new StringBuilder("$RECYCLE.BIN$/");
        String str = this.f68445;
        sb.append(str);
        AbstractC15440 abstractC15440M39866 = C16999.m39866(sb.toString(), new String[0]);
        C21939.f70252.getClass();
        abstractC15440M39866.mo23552();
        if (m48201().mo23120()) {
            return false;
        }
        C21939.m49419().m36526(".i/" + str).mo23552();
        ((ConcurrentMapC10942) C21939.f70249).remove(str);
        C21939.f70252.getClass();
        abstractC15440M39866.mo23552();
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m48196() {
        String str = this.f68445;
        String strM49420 = C21939.m49420();
        String str2 = this.f68442;
        if (C16999.m39872(str2, strM49420)) {
            return false;
        }
        C10130 c10130M43030 = C18515.m43030(541279570);
        c10130M43030.m25431(this.f68443);
        c10130M43030.m25431(this.f68446);
        c10130M43030.m25431(this.f68444);
        c10130M43030.m25439(str2);
        try {
            C21939.m49419().m36526(".i/" + str).m36496(c10130M43030);
            ((ConcurrentMapC10942) C21939.f70249).put(str, this);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m48195() throws IOException {
        C11293 c11293;
        AbstractC15440 abstractC15440M48201 = m48201();
        AbstractC15440 abstractC15440 = C16293.f50120;
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(this.f68442);
        if (Build.VERSION.SDK_INT >= 30 && (abstractC15440M36526 instanceof C12993) && C22518.m50492().mo2657() && abstractC15440M48201.mo23554().startsWith(abstractC15440.mo23554())) {
            C11293 c11293M31569 = abstractC15440M36526.mo31566().m31569();
            C11003.requireNonNull(c11293M31569);
            c11293 = c11293M31569;
            abstractC15440M48201 = new C11293(new File("/data/media/" + abstractC15440.getName() + abstractC15440M48201.mo23554().substring(abstractC15440.mo23554().length())), false);
        } else {
            c11293 = abstractC15440M36526;
        }
        AbstractC15440 abstractC15440M36492 = c11293.m36492(true);
        if (!abstractC15440M36526.getName().equals(abstractC15440M36492.getName())) {
            abstractC15440M36526 = abstractC15440M36526.m36524(abstractC15440M36492.getName());
        }
        abstractC15440M36492.mo35195();
        abstractC15440M48201.m36498(abstractC15440M36492, (Runnable) null);
        delete();
        abstractC15440M36492.mo18537(this.f68446);
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21234 m48191(AbstractC15440 abstractC15440) {
        String name = abstractC15440.getName();
        C21234 c21234 = (C21234) ((ConcurrentMapC10942) C21939.f70249).get(name);
        if (c21234 != null) {
            if (c21234.m48201().mo23120()) {
                return c21234;
            }
            abstractC15440.mo23552();
            ((ConcurrentMapC10942) C21939.f70249).remove(name);
            return null;
        }
        try {
            C12951 c12951M36528 = abstractC15440.m36528();
            C22124.m49722((InterfaceC20008) c12951M36528, 541279570);
            long j = c12951M36528.readLong();
            long j2 = c12951M36528.readLong();
            long j3 = c12951M36528.readLong();
            String strM31506 = c12951M36528.m31506();
            String strM48189 = m48189(strM31506);
            AbstractC15440 abstractC15440M36526 = C21939.m49419().m36526(name + "/" + strM48189);
            if (!abstractC15440M36526.mo23120()) {
                abstractC15440.mo23552();
                return null;
            }
            C21234 c21235 = new C21234(name, j, j2, j3, abstractC15440M36526.mo23113(), strM31506, strM48189);
            ((ConcurrentMapC10942) C21939.f70249).put(name, c21235);
            return c21235;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:0: B:9:0x0023->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21234 m48192(C15587 c15587, InterfaceC17066 interfaceC17066) {
        long j;
        String str;
        String upperCase;
        File file = c15587.f48020;
        String strM39859 = C16999.m39859(c15587.mo23554());
        if (strM39859 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLastModified = file.lastModified();
        long jM36490 = c15587.m36490(interfaceC17066);
        if (interfaceC17066.mo1526()) {
            return null;
        }
        while (true) {
            long jNextLong = C21939.f70251.nextLong();
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
                        jM36490 = jM36490;
                    }
                    j = jM36490;
                    str = new String(cArr, i, 64 - i);
                }
                upperCase = str.toUpperCase();
                if (!((ConcurrentMapC10942) C21939.f70249).containsKey(upperCase)) {
                    return new C21234(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM39859, m48189(strM39859));
                }
                jM36490 = j;
            }
            j = jM36490;
            upperCase = str.toUpperCase();
            if (!((ConcurrentMapC10942) C21939.f70249).containsKey(upperCase)) {
                return new C21234(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM39859, m48189(strM39859));
            }
            jM36490 = j;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48189(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
