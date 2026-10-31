package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7SN */
/* JADX INFO: loaded from: classes.dex */
public final class C23471 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75307;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f75308;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f75309;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f75310;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f75311;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f75312;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC9361 f75313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC8655 f75314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f75315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f75316;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f75317;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f75318;

    public C23471(String str, EnumC8655 enumC8655, boolean z, boolean z2, long j, long j2, long j3, long j4, EnumC9361 enumC9361, String str2, boolean z3, boolean z4) {
        this.f75317 = str;
        this.f75314 = enumC8655;
        this.f75309 = z;
        this.f75307 = z2;
        this.f75318 = j;
        this.f75315 = j2;
        this.f75308 = j3;
        this.f75312 = j4;
        this.f75313 = enumC9361;
        this.f75311 = str2;
        this.f75316 = z3;
        this.f75310 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23471)) {
            return false;
        }
        C23471 c23471 = (C23471) obj;
        return this.f75309 == c23471.f75309 && this.f75307 == c23471.f75307 && this.f75316 == c23471.f75316 && this.f75310 == c23471.f75310 && this.f75318 == c23471.f75318 && this.f75315 == c23471.f75315 && this.f75308 == c23471.f75308 && this.f75312 == c23471.f75312 && C11003.equals(this.f75317, c23471.f75317) && C11003.equals(this.f75314, c23471.f75314) && C11003.equals(this.f75313, c23471.f75313) && C11003.equals(this.f75311, c23471.f75311);
    }

    public final int hashCode() {
        int i = (((((this.f75309 ? 1231 : 1237) * 31) + (this.f75307 ? 1231 : 1237)) * 31) + (this.f75316 ? 1231 : 1237)) * 31;
        int i2 = this.f75310 ? 1231 : 1237;
        long j = this.f75318;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f75315;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f75308;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f75312;
        return C11003.hashCode(this.f75311) + ((C11003.hashCode(this.f75313) + ((C11003.hashCode(this.f75314) + C20361.m46680((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f75317)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75317, this.f75314, Boolean.valueOf(this.f75309), Boolean.valueOf(this.f75307), Long.valueOf(this.f75318), Long.valueOf(this.f75315), Long.valueOf(this.f75308), Long.valueOf(this.f75312), this.f75313, this.f75311, Boolean.valueOf(this.f75316), Boolean.valueOf(this.f75310)};
        String[] strArrSplit = "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".length() == 0 ? new String[0] : "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".split(l.b);
        StringBuilder sb = new StringBuilder("FileSearchInputRecord[");
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

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m51913() {
        return this.f75310;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51914() {
        return this.f75307;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m51916() {
        return this.f75312;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m51917() {
        return this.f75318;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m51918() {
        return this.f75315;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC8655 m51919() {
        return this.f75314;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m51920() {
        return this.f75309;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m51922() {
        return this.f75311;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m51923() {
        return this.f75308;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m51924() {
        return this.f75317;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC9361 m51925() {
        return this.f75313;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51926() {
        return this.f75316;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m51911(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        C12951 c12951 = new C12951(bArr);
        try {
            int i2 = c12951.readByte() & 255;
            if (i2 > 100) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    break;
                }
                String strM31506 = c12951.m31506();
                String strM31507 = c12951.m31506();
                byte b = c12951.readByte();
                int i5 = b & 255;
                boolean z = (b & 1) != 0;
                boolean z2 = (b & 2) != 0;
                boolean z3 = (b & 4) != 0;
                boolean z4 = (b & 8) != 0;
                boolean z5 = (b & 16) != 0;
                EnumC8655 enumC8655M22414 = EnumC8655.m22414((i5 >> 5) & 7);
                long j = z ? c12951.readLong() : -1L;
                long j2 = z ? c12951.readLong() : -1L;
                if (j >= 0 && j == j2 && j2 != C13132.FOREVER_NS) {
                    j2++;
                }
                arrayList.add(new C23471(strM31506, enumC8655M22414, z2, z3, j, j2, -1L, -1L, null, strM31507, z4, z5));
                i4++;
            }
            if (c12951.available() != 0) {
                try {
                    if (c12951.available() >= 6 && c12951.readInt() == 1179866194) {
                        int i6 = c12951.readByte() & 255;
                        int i7 = c12951.readByte() & 255;
                        if ((i6 == 1 || i6 == 2) && i7 == arrayList.size()) {
                            if (c12951.available() == ((long) i7) * (i6 == 1 ? 16L : 17L)) {
                                long[] jArr = new long[i7];
                                long[] jArr2 = new long[i7];
                                EnumC9361[] enumC9361Arr = new EnumC9361[i7];
                                while (i < i7) {
                                    jArr[i] = c12951.readLong();
                                    jArr2[i] = c12951.readLong();
                                    if (i6 >= 2) {
                                        enumC9361Arr[i] = EnumC9361.m24181(c12951.readByte() & 255);
                                    }
                                    long j3 = jArr[i];
                                    long j4 = jArr2[i];
                                    i = (j3 >= -1 && j4 >= -1 && (j3 == -1 || j4 == -1 || j3 < j4)) ? i + 1 : 0;
                                }
                                ArrayList arrayList2 = new ArrayList(i7);
                                while (i3 < i7) {
                                    C23471 c23471 = (C23471) arrayList.get(i3);
                                    long[] jArr3 = jArr2;
                                    EnumC9361[] enumC9361Arr2 = enumC9361Arr;
                                    int i8 = i7;
                                    arrayList2.add(new C23471(c23471.f75317, c23471.f75314, c23471.f75309, c23471.f75307, c23471.f75318, c23471.f75315, jArr[i3], jArr2[i3], enumC9361Arr[i3], c23471.f75311, c23471.f75316, c23471.f75310));
                                    i3++;
                                    jArr2 = jArr3;
                                    enumC9361Arr = enumC9361Arr2;
                                    i7 = i8;
                                }
                                return arrayList2;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m51910(List list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Too many file search records");
        }
        C10130 c10130 = new C10130();
        c10130.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23471 c23471 = (C23471) it.next();
            long j = c23471.f75315;
            c10130.m25439(c23471.f75317);
            c10130.m25439(c23471.f75311);
            int iM22418 = c23471.f75314.m22418() << 5;
            long j2 = c23471.f75318;
            if (j2 != -1 || j != -1) {
                iM22418 |= 1;
            }
            if (c23471.f75309) {
                iM22418 |= 2;
            }
            if (c23471.f75307) {
                iM22418 |= 4;
            }
            if (c23471.f75316) {
                iM22418 |= 8;
            }
            if (c23471.f75310) {
                iM22418 |= 16;
            }
            c10130.writeByte(iM22418);
            if (j2 != -1 || j != -1) {
                c10130.m25431(j2);
                c10130.m25431(j);
            }
        }
        c10130.writeInt(1179866194);
        c10130.writeByte(2);
        c10130.writeByte(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C23471 c23472 = (C23471) it2.next();
            c10130.m25431(c23472.f75308);
            c10130.m25431(c23472.f75312);
            EnumC9361 enumC9361 = c23472.f75313;
            c10130.writeByte(enumC9361 == null ? 0 : enumC9361.m24185());
        }
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51915(C23471 c23471) {
        boolean zM51912;
        String str = c23471.f75317;
        String str2 = this.f75317;
        if (!str2.equals(str)) {
            return false;
        }
        if ((!str2.isEmpty() && this.f75314 != c23471.f75314) || this.f75309 != c23471.f75309 || (zM51912 = m51912()) != c23471.m51912()) {
            return false;
        }
        if (!zM51912) {
            return true;
        }
        if (this.f75318 != c23471.f75318 || this.f75315 != c23471.f75315) {
            return false;
        }
        EnumC9361 enumC9361 = c23471.f75313;
        EnumC9361 enumC9362 = this.f75313;
        if (enumC9362 != enumC9361) {
            return false;
        }
        if (enumC9362 == null && (this.f75308 != c23471.f75308 || this.f75312 != c23471.f75312)) {
            return false;
        }
        String str3 = c23471.f75311;
        String str4 = this.f75311;
        if (!str4.equals(str3)) {
            return false;
        }
        if (str4.isEmpty()) {
            return true;
        }
        return this.f75316 == c23471.f75316 && this.f75310 == c23471.f75310;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m51912() {
        if (this.f75307) {
            return (this.f75318 == -1 && this.f75315 == -1 && this.f75313 == null && this.f75308 == -1 && this.f75312 == -1 && this.f75311.isEmpty()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m51921() {
        String str = this.f75317;
        String strReplace = str.replace('\n', ' ');
        if (strReplace.isEmpty()) {
            strReplace = C4925.m14327(R.string.MT_Protector);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        int length = spannableStringBuilder.length();
        if (!str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) C4925.m14327(this.f75314.m22416())).append((CharSequence) "]");
        }
        if (this.f75307) {
            long j = this.f75315;
            long j2 = this.f75318;
            if (j2 != -1 || j != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) EnumC20650.m47232(j2, j));
            }
            long j3 = this.f75312;
            long j4 = this.f75308;
            EnumC9361 enumC9361 = this.f75313;
            if (enumC9361 != null || j4 != -1 || j3 != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) (enumC9361 == null ? EnumC9361.m24180(j4, j3) : enumC9361.m24183()));
            }
            String str2 = this.f75311;
            if (!str2.isEmpty()) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) C6554.m18061(50, str2).replace('\n', ' '));
            }
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
