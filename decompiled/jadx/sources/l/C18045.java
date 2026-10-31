package l;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18045 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f56237;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f56240;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56241;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C18045 f56239 = new C18045(AbstractC14545.of((Object) C16633.f51080));

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final AbstractC14545 f56238 = AbstractC14545.m34734();

    public /* synthetic */ C18045(int i, List list) {
        this(list);
    }

    static {
        C6785 c6785 = new C6785();
        c6785.mo18428(5, 6);
        c6785.mo18428(17, 6);
        c6785.mo18428(7, 6);
        c6785.mo18428(30, 10);
        c6785.mo18428(18, 6);
        c6785.mo18428(6, 8);
        c6785.mo18428(8, 8);
        c6785.mo18428(14, 8);
        f56237 = c6785.mo18430();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18045 m42101(Context context, C18231 c18231, C9579 c9579) {
        return m42100(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c18231, c9579);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18045 m42100(Context context, Intent intent, C18231 c18231, C9579 c9579) {
        AudioManager audioManagerM7181 = C2171.m7181(context);
        if (c9579 == null) {
            c9579 = Build.VERSION.SDK_INT >= 33 ? C10990.m27303(audioManagerM7181, c18231) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (C3603.m11050(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return C10990.m27302(audioManagerM7181, c18231);
        }
        if (i >= 23 && C7481.m20103(audioManagerM7181, c9579)) {
            return f56239;
        }
        C12429 c12429 = new C12429();
        c12429.mo6130((Object) 2);
        if (i >= 29 && (C3603.m11050(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            c12429.mo16260((Iterable) C1817.m6039(c18231));
            return new C18045(m42099(10, C13426.m32449(c12429.mo30595())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (z) {
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                c12429.mo16260((Iterable) f56238);
            }
        } else {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    c12429.mo16260((Iterable) f56238);
                }
            }
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                c12429.mo16260((Iterable) C13426.m32448(intArrayExtra));
            }
            return new C18045(m42099(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), C13426.m32449(c12429.mo30595())));
        }
        return new C18045(m42099(10, C13426.m32449(c12429.mo30595())));
    }

    public C18045(List list) {
        this.f56240 = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C16633 c16633 = (C16633) list.get(i);
            this.f56240.put(c16633.f51082, c16633);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f56240.size(); i2++) {
            iMax = Math.max(iMax, ((C16633) this.f56240.valueAt(i2)).f51083);
        }
        this.f56241 = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pair m42102(C18231 c18231, C8353 c8353) {
        String str = c8353.f25614;
        str.getClass();
        int iM24805 = C9786.m24805(str, c8353.f25619);
        if (!f56237.containsKey(Integer.valueOf(iM24805))) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.f56240;
        if (iM24805 == 18 && !C3603.m11027(sparseArray, 18)) {
            iM24805 = 6;
        } else if ((iM24805 == 8 && !C3603.m11027(sparseArray, 8)) || (iM24805 == 30 && !C3603.m11027(sparseArray, 30))) {
            iM24805 = 7;
        }
        if (!C3603.m11027(sparseArray, iM24805)) {
            return null;
        }
        C16633 c16633 = (C16633) sparseArray.get(iM24805);
        c16633.getClass();
        int iM39165 = c8353.f25625;
        if (iM39165 == -1 || iM24805 == 18) {
            int i2 = c8353.f25624;
            if (i2 == -1) {
                i2 = 48000;
            }
            iM39165 = c16633.m39165(i2, c18231);
        } else if (!c8353.f25614.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c16633.m39166(iM39165)) {
                return null;
            }
        } else if (iM39165 > 10) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 28) {
            i = iM39165;
        } else if (iM39165 == 7) {
            i = 8;
        } else if (iM39165 != 3 && iM39165 != 4 && iM39165 != 5) {
            i = iM39165;
        }
        if (i3 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iM11035 = C3603.m11035(i);
        if (iM11035 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM24805), Integer.valueOf(iM11035));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18045)) {
            return false;
        }
        C18045 c18045 = (C18045) obj;
        return C3603.m11028(this.f56240, c18045.f56240) && this.f56241 == c18045.f56241;
    }

    public final int hashCode() {
        return (C3603.m11007(this.f56240) * 31) + this.f56241;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f56241 + ", audioProfiles=" + this.f56240 + "]";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m42099(int i, int[] iArr) {
        int i2 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            c1846.m16264(new C16633(i3, i));
        }
        return c1846.m6131();
    }
}
