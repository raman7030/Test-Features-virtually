package p067l;

import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: l.۠ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G5X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10307 {

    /* JADX INFO: renamed from: ֡ */
    public final float f28510;

    /* JADX INFO: renamed from: ֨ */
    public int f28511;

    /* JADX INFO: renamed from: ֫ */
    public final int f28512;

    /* JADX INFO: renamed from: ֫֫ */
    public final int f28513;

    /* JADX INFO: renamed from: ۖ */
    public final int f28514;

    /* JADX INFO: renamed from: ۗ */
    public final int f28515;

    /* JADX INFO: renamed from: ۘ */
    public final C21037 f28516;

    /* JADX INFO: renamed from: ۙ */
    public final String f28517;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f28518;

    /* JADX INFO: renamed from: ۛ */
    public final int f28519;

    /* JADX INFO: renamed from: ۜ */
    public final String f28520;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f28521;

    /* JADX INFO: renamed from: ۟ */
    public final int f28522;

    /* JADX INFO: renamed from: ۠ */
    public final int f28523;

    /* JADX INFO: renamed from: ۡ */
    public final Object f28524;

    /* JADX INFO: renamed from: ۢ */
    public final int f28525;

    /* JADX INFO: renamed from: ۤ */
    public final C25079 f28526;

    /* JADX INFO: renamed from: ۧ */
    public final int f28527;

    /* JADX INFO: renamed from: ۧ֫ */
    public final String f28528;

    /* JADX INFO: renamed from: ۨ */
    public final int f28529;

    /* JADX INFO: renamed from: ۫ */
    public final int f28530;

    /* JADX INFO: renamed from: ۬ */
    public final int f28531;

    /* JADX INFO: renamed from: ܰ */
    public final byte[] f28532;

    /* JADX INFO: renamed from: ܳ */
    public final String f28533;

    /* JADX INFO: renamed from: ܳ֫ */
    public final long f28534;

    /* JADX INFO: renamed from: ܶ */
    public final String f28535;

    /* JADX INFO: renamed from: ܺ */
    public final int f28536;

    /* JADX INFO: renamed from: ܽ */
    public final int f28537;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f28538;

    /* JADX INFO: renamed from: ܿ */
    public final int f28539;

    /* JADX INFO: renamed from: ܿ֫ */
    public final int f28540;

    /* JADX INFO: renamed from: ᩳ */
    public final int f28541;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f28542;

    /* JADX INFO: renamed from: ᩴ */
    public final int f28543;

    /* JADX INFO: renamed from: ᩵ */
    public final int f28544;

    /* JADX INFO: renamed from: ᩶ */
    public final List f28545;

    /* JADX INFO: renamed from: ᩷ */
    public final int f28546;

    /* JADX INFO: renamed from: ᩷֫ */
    public final int f28547;

    /* JADX INFO: renamed from: ᩸ */
    public final List f28548;

    /* JADX INFO: renamed from: ᩹ */
    public final String f28549;

    /* JADX INFO: renamed from: ᩺ */
    public final float f28550;

    /* JADX INFO: renamed from: ᩻ */
    public final C22378 f28551;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int f28552;

    static {
        new C3601().m6672();
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
        C5792.m13032(4);
        C7470.m17250(5, 6, 7, 8, 9);
        C7470.m17250(10, 11, 12, 13, 14);
        C7470.m17250(15, 16, 17, 18, 19);
        C7470.m17250(20, 21, 22, 23, 24);
        C7470.m17250(25, 26, 27, 28, 29);
        C7470.m17250(30, 31, 32, 33, 34);
        C5792.m13032(35);
        C5792.m13032(36);
    }

    public C10307(C3601 c3601) {
        boolean z;
        String str;
        this.f28535 = c3601.f7360;
        String strM13024 = C5792.m13024(c3601.f7396);
        this.f28517 = strM13024;
        if (c3601.f7395.isEmpty() && c3601.f7383 != null) {
            this.f28545 = AbstractC16192.m36873of((Object) new C23048(strM13024, c3601.f7383));
            this.f28549 = c3601.f7383;
        } else if (c3601.f7395.isEmpty() || c3601.f7383 != null) {
            if (!c3601.f7395.isEmpty() || c3601.f7383 != null) {
                int i = 0;
                while (true) {
                    if (i >= c3601.f7395.size()) {
                        z = false;
                        break;
                    } else {
                        if (((C23048) c3601.f7395.get(i)).f72434.equals(c3601.f7383)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            C23877.m52960(z);
            this.f28545 = c3601.f7395;
            this.f28549 = c3601.f7383;
        } else {
            this.f28545 = c3601.f7395;
            List list = c3601.f7395;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    C23048 c23048 = (C23048) it.next();
                    if (TextUtils.equals(c23048.f72433, strM13024)) {
                        str = c23048.f72434;
                        break;
                    }
                } else {
                    str = ((C23048) list.get(0)).f72434;
                    break;
                }
            }
            this.f28549 = str;
        }
        this.f28542 = c3601.f7376;
        C23877.m52959("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c3601.f7375 == 0 || (c3601.f7397 & 32768) != 0);
        this.f28522 = c3601.f7397;
        this.f28527 = c3601.f7375;
        int i2 = c3601.f7385;
        this.f28537 = i2;
        int i3 = c3601.f7374;
        this.f28529 = i3;
        this.f28541 = i3 != -1 ? i3 : i2;
        this.f28533 = c3601.f7387;
        this.f28526 = c3601.f7379;
        this.f28524 = c3601.f7373;
        this.f28520 = c3601.f7398;
        this.f28528 = c3601.f7370;
        this.f28515 = c3601.f7393;
        this.f28531 = c3601.f7366;
        this.f28548 = c3601.f7371 == null ? Collections.EMPTY_LIST : c3601.f7371;
        C21037 c21037 = c3601.f7363;
        this.f28516 = c21037;
        this.f28534 = c3601.f7390;
        this.f28518 = c3601.f7359;
        this.f28547 = c3601.f7399;
        this.f28523 = c3601.f7367;
        this.f28514 = c3601.f7384;
        this.f28536 = c3601.f7372;
        this.f28510 = c3601.f7392;
        this.f28513 = c3601.f7380 == -1 ? 0 : c3601.f7380;
        this.f28550 = c3601.f7368 == -1.0f ? 1.0f : c3601.f7368;
        this.f28532 = c3601.f7377;
        this.f28540 = c3601.f7386;
        this.f28551 = c3601.f7381;
        this.f28530 = c3601.f7364;
        this.f28539 = c3601.f7389;
        this.f28538 = c3601.f7362;
        this.f28519 = c3601.f7378;
        this.f28543 = c3601.f7365 == -1 ? 0 : c3601.f7365;
        this.f28544 = c3601.f7391 != -1 ? c3601.f7391 : 0;
        this.f28512 = c3601.f7361;
        this.f28525 = c3601.f7394;
        this.f28552 = c3601.f7388;
        this.f28521 = c3601.f7382;
        if (c3601.f7369 == 0 && c21037 != null) {
            this.f28546 = 1;
        } else {
            this.f28546 = c3601.f7369;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3601 m23918() {
        return new C3601(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10307 m23919(int i) {
        C3601 c3601 = new C3601(this);
        c3601.m6702(i);
        return new C10307(c3601);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10307 m23921(C10307 c10307) {
        String str;
        if (this == c10307) {
            return this;
        }
        int iM26822 = C11669.m26822(this.f28528);
        String str2 = c10307.f28535;
        C25079 c25079M55051 = c10307.f28526;
        List list = c10307.f28545;
        int i = c10307.f28552;
        int i2 = c10307.f28521;
        String str3 = c10307.f28549;
        if (str3 == null) {
            str3 = this.f28549;
        }
        if (list.isEmpty()) {
            list = this.f28545;
        }
        if ((iM26822 != 3 && iM26822 != 1) || (str = c10307.f28517) == null) {
            str = this.f28517;
        }
        int i3 = this.f28537;
        if (i3 == -1) {
            i3 = c10307.f28537;
        }
        int i4 = this.f28529;
        if (i4 == -1) {
            i4 = c10307.f28529;
        }
        String str4 = this.f28533;
        if (str4 == null) {
            String strM13017 = C5792.m13017(iM26822, c10307.f28533);
            if (C5792.m13028(strM13017).length == 1) {
                str4 = strM13017;
            }
        }
        C25079 c25079 = this.f28526;
        if (c25079 != null) {
            c25079M55051 = c25079.m55051(c25079M55051);
        }
        float f = this.f28510;
        if (f == -1.0f && iM26822 == 2) {
            f = c10307.f28510;
        }
        int i5 = this.f28542 | c10307.f28542;
        int i6 = this.f28522 | c10307.f28522;
        C21037 c21037M47448 = C21037.m47448(c10307.f28516, this.f28516);
        C3601 c3601 = new C3601(this);
        c3601.m6701(str2);
        c3601.m6705(str3);
        c3601.m6695(list);
        c3601.m6703(str);
        c3601.m6698(i5);
        c3601.m6686(i6);
        c3601.m6700(i3);
        c3601.m6670(i4);
        c3601.m6677(str4);
        c3601.m6681(c25079M55051);
        c3601.m6679(c21037M47448);
        c3601.m6673(f);
        c3601.m6711(i);
        c3601.m6708(i2);
        return new C10307(c3601);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f28535);
        sb.append(", ");
        sb.append(this.f28549);
        sb.append(", ");
        sb.append(this.f28520);
        sb.append(", ");
        sb.append(this.f28528);
        sb.append(", ");
        sb.append(this.f28533);
        sb.append(", ");
        sb.append(this.f28541);
        sb.append(", ");
        sb.append(this.f28517);
        sb.append(", [");
        sb.append(this.f28547);
        sb.append(", ");
        sb.append(this.f28523);
        sb.append(", ");
        sb.append(this.f28510);
        sb.append(", ");
        sb.append(this.f28551);
        sb.append("], [");
        sb.append(this.f28539);
        sb.append(", ");
        return C5410.m11876(this.f28538, "])", sb);
    }

    public final int hashCode() {
        if (this.f28511 == 0) {
            String str = this.f28535;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f28549;
            int iHashCode2 = (this.f28545.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f28517;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f28542) * 31) + this.f28522) * 31) + this.f28527) * 31) + this.f28537) * 31) + this.f28529) * 31;
            String str4 = this.f28533;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C25079 c25079 = this.f28526;
            int iHashCode5 = (iHashCode4 + (c25079 == null ? 0 : c25079.hashCode())) * 31;
            Object obj = this.f28524;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f28520;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f28528;
            this.f28511 = ((((((((((((((((((((((Float.floatToIntBits(this.f28550) + ((((Float.floatToIntBits(this.f28510) + ((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f28515) * 31) + ((int) this.f28534)) * 31) + this.f28547) * 31) + this.f28523) * 31) + this.f28514) * 31) + this.f28536) * 31)) * 31) + this.f28513) * 31)) * 31) + this.f28540) * 31) + this.f28530) * 31) + this.f28539) * 31) + this.f28538) * 31) + this.f28519) * 31) + this.f28543) * 31) + this.f28544) * 31) + this.f28512) * 31) + this.f28552) * 31) + this.f28521) * 31) + this.f28546;
        }
        return this.f28511;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C10307.class == obj.getClass()) {
            C10307 c10307 = (C10307) obj;
            int i2 = this.f28511;
            if ((i2 == 0 || (i = c10307.f28511) == 0 || i2 == i) && this.f28542 == c10307.f28542 && this.f28522 == c10307.f28522 && this.f28527 == c10307.f28527 && this.f28537 == c10307.f28537 && this.f28529 == c10307.f28529 && this.f28515 == c10307.f28515 && this.f28534 == c10307.f28534 && this.f28547 == c10307.f28547 && this.f28523 == c10307.f28523 && this.f28514 == c10307.f28514 && this.f28536 == c10307.f28536 && this.f28513 == c10307.f28513 && this.f28540 == c10307.f28540 && this.f28530 == c10307.f28530 && this.f28539 == c10307.f28539 && this.f28538 == c10307.f28538 && this.f28519 == c10307.f28519 && this.f28543 == c10307.f28543 && this.f28544 == c10307.f28544 && this.f28512 == c10307.f28512 && this.f28552 == c10307.f28552 && this.f28521 == c10307.f28521 && this.f28546 == c10307.f28546 && Float.compare(this.f28510, c10307.f28510) == 0 && Float.compare(this.f28550, c10307.f28550) == 0 && C12826.equals(this.f28535, c10307.f28535) && C12826.equals(this.f28549, c10307.f28549) && this.f28545.equals(c10307.f28545) && C12826.equals(this.f28533, c10307.f28533) && C12826.equals(this.f28520, c10307.f28520) && C12826.equals(this.f28528, c10307.f28528) && C12826.equals(this.f28517, c10307.f28517) && Arrays.equals(this.f28532, c10307.f28532) && C12826.equals(this.f28526, c10307.f28526) && C12826.equals(this.f28551, c10307.f28551) && C12826.equals(this.f28516, c10307.f28516) && m23920(c10307) && C12826.equals(this.f28524, c10307.f28524)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23920(C10307 c10307) {
        List list = this.f28548;
        if (list.size() != c10307.f28548.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c10307.f28548.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m23917(C10307 c10307) {
        String str;
        if (c10307 == null) {
            return "null";
        }
        Object obj = c10307.f28524;
        int i = c10307.f28542;
        List list = c10307.f28545;
        String str2 = c10307.f28517;
        int i2 = c10307.f28538;
        int i3 = c10307.f28539;
        int i4 = c10307.f28530;
        float f = c10307.f28510;
        C22378 c22378 = c10307.f28551;
        float f2 = c10307.f28550;
        int i5 = c10307.f28536;
        int i6 = c10307.f28514;
        int i7 = c10307.f28523;
        int i8 = c10307.f28547;
        C21037 c21037 = c10307.f28516;
        String str3 = c10307.f28533;
        int i9 = c10307.f28541;
        String str4 = c10307.f28520;
        int i10 = c10307.f28522;
        C8876 c8876M20479 = C8876.m20479();
        StringBuilder sbM17248 = C7470.m17248("id=");
        sbM17248.append(c10307.f28535);
        sbM17248.append(", mimeType=");
        sbM17248.append(c10307.f28528);
        if (str4 != null) {
            sbM17248.append(", container=");
            sbM17248.append(str4);
        }
        if (i9 != -1) {
            sbM17248.append(", bitrate=");
            sbM17248.append(i9);
        }
        if (str3 != null) {
            sbM17248.append(", codecs=");
            sbM17248.append(str3);
        }
        if (c21037 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < c21037.f66012) {
                UUID uuid = c21037.m47449(i11).f62957;
                if (uuid.equals(C25059.f79953)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C25059.f79952)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C25059.f79954)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C25059.f79955)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(C25059.f79956)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    i11++;
                    c21037 = c21037;
                }
                i11++;
                c21037 = c21037;
            }
            sbM17248.append(", drm=[");
            c8876M20479.m20483(sbM17248, linkedHashSet.iterator());
            sbM17248.append(']');
        }
        if (i8 != -1 && i7 != -1) {
            sbM17248.append(", res=");
            sbM17248.append(i8);
            sbM17248.append("x");
            sbM17248.append(i7);
        }
        if (i6 != -1 && i5 != -1) {
            sbM17248.append(", decRes=");
            sbM17248.append(i6);
            sbM17248.append("x");
            sbM17248.append(i5);
        }
        double d = f2;
        int i12 = C20495.f63287;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM17248.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str5 = C5792.f14228;
            sbM17248.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c22378 != null && ((c22378.f70604 != -1 && c22378.f70598 != -1) || c22378.m50230())) {
            sbM17248.append(", color=");
            sbM17248.append(c22378.m50231());
        }
        if (f != -1.0f) {
            sbM17248.append(", fps=");
            sbM17248.append(f);
        }
        if (i4 != -1) {
            sbM17248.append(", maxSubLayers=");
            sbM17248.append(i4);
        }
        if (i3 != -1) {
            sbM17248.append(", channels=");
            sbM17248.append(i3);
        }
        if (i2 != -1) {
            sbM17248.append(", sample_rate=");
            sbM17248.append(i2);
        }
        if (str2 != null) {
            sbM17248.append(", language=");
            sbM17248.append(str2);
        }
        int i13 = 4;
        if (!list.isEmpty()) {
            sbM17248.append(", labels=[");
            c8876M20479.m20483(sbM17248, C9468.m21989(list, new C5410(i13)).iterator());
            sbM17248.append("]");
        }
        if (i != 0) {
            sbM17248.append(", selectionFlags=[");
            String str6 = C5792.f14228;
            ArrayList arrayList = new ArrayList();
            if ((i & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i & 1) != 0) {
                arrayList.add("default");
            }
            if ((i & 2) != 0) {
                arrayList.add("forced");
            }
            c8876M20479.m20483(sbM17248, arrayList.iterator());
            sbM17248.append("]");
        }
        if (i10 != 0) {
            sbM17248.append(", roleFlags=[");
            c8876M20479.m20483(sbM17248, C5792.m13027(i10).iterator());
            sbM17248.append("]");
        }
        if (obj != null) {
            sbM17248.append(", customData=");
            sbM17248.append(obj);
        }
        if ((i10 & 32768) != 0) {
            sbM17248.append(", auxiliaryTrackType=");
            int i14 = c10307.f28527;
            String str7 = C5792.f14228;
            if (i14 == 0) {
                str = "undefined";
            } else if (i14 == 1) {
                str = "original";
            } else if (i14 == 2) {
                str = "depth-linear";
            } else if (i14 == 3) {
                str = "depth-inverse";
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM17248.append(str);
        }
        return sbM17248.toString();
    }
}
