package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7SN */
/* JADX INFO: loaded from: classes.dex */
public final class C24675 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f78054;

    /* JADX INFO: renamed from: ۜ */
    public final long f78055;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f78056;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f78057;

    /* JADX INFO: renamed from: ۧ */
    public final String f78058;

    /* JADX INFO: renamed from: ܳ */
    public final long f78059;

    /* JADX INFO: renamed from: ܺ */
    public final EnumC11265 f78060;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC10594 f78061;

    /* JADX INFO: renamed from: ܿ */
    public final long f78062;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f78063;

    /* JADX INFO: renamed from: ᩷ */
    public final String f78064;

    /* JADX INFO: renamed from: ᩻ */
    public final long f78065;

    public C24675(String str, EnumC10594 enumC10594, boolean z, boolean z2, long j, long j2, long j3, long j4, EnumC11265 enumC11265, String str2, boolean z3, boolean z4) {
        this.f78064 = str;
        this.f78061 = enumC10594;
        this.f78056 = z;
        this.f78054 = z2;
        this.f78065 = j;
        this.f78062 = j2;
        this.f78055 = j3;
        this.f78059 = j4;
        this.f78060 = enumC11265;
        this.f78058 = str2;
        this.f78063 = z3;
        this.f78057 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24675)) {
            return false;
        }
        C24675 c24675 = (C24675) obj;
        return this.f78056 == c24675.f78056 && this.f78054 == c24675.f78054 && this.f78063 == c24675.f78063 && this.f78057 == c24675.f78057 && this.f78065 == c24675.f78065 && this.f78062 == c24675.f78062 && this.f78055 == c24675.f78055 && this.f78059 == c24675.f78059 && C12826.equals(this.f78064, c24675.f78064) && C12826.equals(this.f78061, c24675.f78061) && C12826.equals(this.f78060, c24675.f78060) && C12826.equals(this.f78058, c24675.f78058);
    }

    public final int hashCode() {
        int i = (((((this.f78056 ? 1231 : 1237) * 31) + (this.f78054 ? 1231 : 1237)) * 31) + (this.f78063 ? 1231 : 1237)) * 31;
        int i2 = this.f78057 ? 1231 : 1237;
        long j = this.f78065;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f78062;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f78055;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f78059;
        return C12826.hashCode(this.f78058) + ((C12826.hashCode(this.f78060) + ((C12826.hashCode(this.f78061) + C21720.m49003((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f78064)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f78064, this.f78061, Boolean.valueOf(this.f78056), Boolean.valueOf(this.f78054), Long.valueOf(this.f78065), Long.valueOf(this.f78062), Long.valueOf(this.f78055), Long.valueOf(this.f78059), this.f78060, this.f78058, Boolean.valueOf(this.f78063), Boolean.valueOf(this.f78057)};
        String[] strArrSplit = "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".length() == 0 ? new String[0] : "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".split(C0249l.f1196b);
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

    /* JADX INFO: renamed from: ֡ */
    public final boolean m54315() {
        return this.f78057;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54316() {
        return this.f78054;
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m54318() {
        return this.f78059;
    }

    /* JADX INFO: renamed from: ۘ */
    public final long m54319() {
        return this.f78065;
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m54320() {
        return this.f78062;
    }

    /* JADX INFO: renamed from: ܳ */
    public final EnumC10594 m54321() {
        return this.f78061;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m54322() {
        return this.f78056;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m54324() {
        return this.f78058;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final long m54325() {
        return this.f78055;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m54326() {
        return this.f78064;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC11265 m54327() {
        return this.f78060;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m54328() {
        return this.f78063;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m54313(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        C14677 c14677 = new C14677(bArr);
        try {
            int i2 = c14677.readByte() & 255;
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
                String strM33593 = c14677.m33593();
                String strM33594 = c14677.m33593();
                byte b = c14677.readByte();
                int i5 = b & 255;
                boolean z = (b & 1) != 0;
                boolean z2 = (b & 2) != 0;
                boolean z3 = (b & 4) != 0;
                boolean z4 = (b & 8) != 0;
                boolean z5 = (b & 16) != 0;
                EnumC10594 enumC10594M24383 = EnumC10594.m24383((i5 >> 5) & 7);
                long j = z ? c14677.readLong() : -1L;
                long j2 = z ? c14677.readLong() : -1L;
                if (j >= 0 && j == j2 && j2 != C14849.FOREVER_NS) {
                    j2++;
                }
                arrayList.add(new C24675(strM33593, enumC10594M24383, z2, z3, j, j2, -1L, -1L, null, strM33594, z4, z5));
                i4++;
            }
            if (c14677.available() != 0) {
                try {
                    if (c14677.available() >= 6 && c14677.readInt() == 1179866194) {
                        int i6 = c14677.readByte() & 255;
                        int i7 = c14677.readByte() & 255;
                        if ((i6 == 1 || i6 == 2) && i7 == arrayList.size()) {
                            if (c14677.available() == ((long) i7) * (i6 == 1 ? 16L : 17L)) {
                                long[] jArr = new long[i7];
                                long[] jArr2 = new long[i7];
                                EnumC11265[] enumC11265Arr = new EnumC11265[i7];
                                while (i < i7) {
                                    jArr[i] = c14677.readLong();
                                    jArr2[i] = c14677.readLong();
                                    if (i6 >= 2) {
                                        enumC11265Arr[i] = EnumC11265.m26191(c14677.readByte() & 255);
                                    }
                                    long j3 = jArr[i];
                                    long j4 = jArr2[i];
                                    i = (j3 >= -1 && j4 >= -1 && (j3 == -1 || j4 == -1 || j3 < j4)) ? i + 1 : 0;
                                }
                                ArrayList arrayList2 = new ArrayList(i7);
                                while (i3 < i7) {
                                    C24675 c24675 = (C24675) arrayList.get(i3);
                                    long[] jArr3 = jArr2;
                                    EnumC11265[] enumC11265Arr2 = enumC11265Arr;
                                    int i8 = i7;
                                    arrayList2.add(new C24675(c24675.f78064, c24675.f78061, c24675.f78056, c24675.f78054, c24675.f78065, c24675.f78062, jArr[i3], jArr2[i3], enumC11265Arr[i3], c24675.f78058, c24675.f78063, c24675.f78057));
                                    i3++;
                                    jArr2 = jArr3;
                                    enumC11265Arr = enumC11265Arr2;
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m54312(List list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Too many file search records");
        }
        C11996 c11996 = new C11996();
        c11996.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24675 c24675 = (C24675) it.next();
            long j = c24675.f78062;
            c11996.m27459(c24675.f78064);
            c11996.m27459(c24675.f78058);
            int iM24387 = c24675.f78061.m24387() << 5;
            long j2 = c24675.f78065;
            if (j2 != -1 || j != -1) {
                iM24387 |= 1;
            }
            if (c24675.f78056) {
                iM24387 |= 2;
            }
            if (c24675.f78054) {
                iM24387 |= 4;
            }
            if (c24675.f78063) {
                iM24387 |= 8;
            }
            if (c24675.f78057) {
                iM24387 |= 16;
            }
            c11996.writeByte(iM24387);
            if (j2 != -1 || j != -1) {
                c11996.m27451(j2);
                c11996.m27451(j);
            }
        }
        c11996.writeInt(1179866194);
        c11996.writeByte(2);
        c11996.writeByte(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C24675 c24676 = (C24675) it2.next();
            c11996.m27451(c24676.f78055);
            c11996.m27451(c24676.f78059);
            EnumC11265 enumC11265 = c24676.f78060;
            c11996.writeByte(enumC11265 == null ? 0 : enumC11265.m26195());
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54317(C24675 c24675) {
        boolean zM54314;
        String str = c24675.f78064;
        String str2 = this.f78064;
        if (!str2.equals(str)) {
            return false;
        }
        if ((!str2.isEmpty() && this.f78061 != c24675.f78061) || this.f78056 != c24675.f78056 || (zM54314 = m54314()) != c24675.m54314()) {
            return false;
        }
        if (!zM54314) {
            return true;
        }
        if (this.f78065 != c24675.f78065 || this.f78062 != c24675.f78062) {
            return false;
        }
        EnumC11265 enumC11265 = c24675.f78060;
        EnumC11265 enumC11266 = this.f78060;
        if (enumC11266 != enumC11265) {
            return false;
        }
        if (enumC11266 == null && (this.f78055 != c24675.f78055 || this.f78059 != c24675.f78059)) {
            return false;
        }
        String str3 = c24675.f78058;
        String str4 = this.f78058;
        if (!str4.equals(str3)) {
            return false;
        }
        if (str4.isEmpty()) {
            return true;
        }
        return this.f78063 == c24675.f78063 && this.f78057 == c24675.f78057;
    }

    /* JADX INFO: renamed from: ᩹ */
    private boolean m54314() {
        if (this.f78054) {
            return (this.f78065 == -1 && this.f78062 == -1 && this.f78060 == null && this.f78055 == -1 && this.f78059 == -1 && this.f78058.isEmpty()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final SpannableStringBuilder m54323() {
        String str = this.f78064;
        String strReplace = str.replace('\n', ' ');
        if (strReplace.isEmpty()) {
            strReplace = C7050.m16224(R.string.MT_Protector);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        int length = spannableStringBuilder.length();
        if (!str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) C7050.m16224(this.f78061.m24385())).append((CharSequence) "]");
        }
        if (this.f78054) {
            long j = this.f78062;
            long j2 = this.f78065;
            if (j2 != -1 || j != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C7050.m16224(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) EnumC21994.m49559(j2, j));
            }
            long j3 = this.f78059;
            long j4 = this.f78055;
            EnumC11265 enumC11265 = this.f78060;
            if (enumC11265 != null || j4 != -1 || j3 != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C7050.m16224(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) (enumC11265 == null ? EnumC11265.m26190(j4, j3) : enumC11265.m26193()));
            }
            String str2 = this.f78058;
            if (!str2.isEmpty()) {
                spannableStringBuilder.append('\n').append((CharSequence) C7050.m16224(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) C8597.m20011(50, str2).replace('\n', ' '));
            }
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
