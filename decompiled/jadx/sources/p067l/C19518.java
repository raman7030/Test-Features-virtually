package p067l;

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
public final class C19518 {

    /* JADX INFO: renamed from: ܽ */
    public static final AbstractC11500 f59439;

    /* JADX INFO: renamed from: ֫ */
    public final SparseArray f59442;

    /* JADX INFO: renamed from: ۧ */
    public final int f59443;

    /* JADX INFO: renamed from: ᩳ */
    public static final C19518 f59441 = new C19518(AbstractC16192.m36873of((Object) C18176.f54260));

    /* JADX INFO: renamed from: ܿ */
    @SuppressLint({"InlinedApi"})
    public static final AbstractC16192 f59440 = AbstractC16192.m36883();

    public /* synthetic */ C19518(int i, List list) {
        this(list);
    }

    static {
        C8817 c8817 = new C8817();
        c8817.mo20376(5, 6);
        c8817.mo20376(17, 6);
        c8817.mo20376(7, 6);
        c8817.mo20376(30, 10);
        c8817.mo20376(18, 6);
        c8817.mo20376(6, 8);
        c8817.mo20376(8, 8);
        c8817.mo20376(14, 8);
        f59439 = c8817.mo20378();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19518 m44352(Context context, C19695 c19695, C11472 c11472) {
        return m44351(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c19695, c11472);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX INFO: renamed from: ֫ */
    public static C19518 m44351(Context context, Intent intent, C19695 c19695, C11472 c11472) {
        AudioManager audioManagerM9260 = C4431.m9260(context);
        if (c11472 == null) {
            c11472 = Build.VERSION.SDK_INT >= 33 ? C12813.m29365(audioManagerM9260, c19695) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (C5792.m13026(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return C12813.m29364(audioManagerM9260, c19695);
        }
        if (i >= 23 && C9478.m22079(audioManagerM9260, c11472)) {
            return f59441;
        }
        C14181 c14181 = new C14181();
        c14181.mo8328((Object) 2);
        if (i >= 29 && (C5792.m13026(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            c14181.mo18180((Iterable) C4095.m8237(c19695));
            return new C19518(m44350(10, C15129.m34551(c14181.mo32660())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (z) {
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                c14181.mo18180((Iterable) f59440);
            }
        } else {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    c14181.mo18180((Iterable) f59440);
                }
            }
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                c14181.mo18180((Iterable) C15129.m34550(intArrayExtra));
            }
            return new C19518(m44350(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), C15129.m34551(c14181.mo32660())));
        }
        return new C19518(m44350(10, C15129.m34551(c14181.mo32660())));
    }

    public C19518(List list) {
        this.f59442 = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C18176 c18176 = (C18176) list.get(i);
            this.f59442.put(c18176.f54262, c18176);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f59442.size(); i2++) {
            iMax = Math.max(iMax, ((C18176) this.f59442.valueAt(i2)).f54263);
        }
        this.f59443 = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX INFO: renamed from: ֫ */
    public final Pair m44353(C19695 c19695, C10307 c10307) {
        String str = c10307.f28528;
        str.getClass();
        int iM26820 = C11669.m26820(str, c10307.f28533);
        if (!f59439.containsKey(Integer.valueOf(iM26820))) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.f59442;
        if (iM26820 == 18 && !C5792.m13003(sparseArray, 18)) {
            iM26820 = 6;
        } else if ((iM26820 == 8 && !C5792.m13003(sparseArray, 8)) || (iM26820 == 30 && !C5792.m13003(sparseArray, 30))) {
            iM26820 = 7;
        }
        if (!C5792.m13003(sparseArray, iM26820)) {
            return null;
        }
        C18176 c18176 = (C18176) sparseArray.get(iM26820);
        c18176.getClass();
        int iM41393 = c10307.f28539;
        if (iM41393 == -1 || iM26820 == 18) {
            int i2 = c10307.f28538;
            if (i2 == -1) {
                i2 = 48000;
            }
            iM41393 = c18176.m41393(i2, c19695);
        } else if (!c10307.f28528.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c18176.m41394(iM41393)) {
                return null;
            }
        } else if (iM41393 > 10) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 28) {
            i = iM41393;
        } else if (iM41393 == 7) {
            i = 8;
        } else if (iM41393 != 3 && iM41393 != 4 && iM41393 != 5) {
            i = iM41393;
        }
        if (i3 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iM13011 = C5792.m13011(i);
        if (iM13011 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM26820), Integer.valueOf(iM13011));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19518)) {
            return false;
        }
        C19518 c19518 = (C19518) obj;
        return C5792.m13004(this.f59442, c19518.f59442) && this.f59443 == c19518.f59443;
    }

    public final int hashCode() {
        return (C5792.m12983(this.f59442) * 31) + this.f59443;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f59443 + ", audioProfiles=" + this.f59442 + "]";
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m44350(int i, int[] iArr) {
        int i2 = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            c4123.m18184(new C18176(i3, i));
        }
        return c4123.m8329();
    }
}
