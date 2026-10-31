package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2335 implements InterfaceC15739 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ClipData f7490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle f7491;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7492;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f7493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri f7494;

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentInfo mo7597() {
        return null;
    }

    public C2335(C9391 c9391) {
        ClipData clipData = c9391.f28515;
        clipData.getClass();
        this.f7490 = clipData;
        int i = c9391.f28518;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f7493 = i;
        int i2 = c9391.f28517;
        if ((i2 & 1) != i2) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        this.f7492 = i2;
        this.f7494 = c9391.f28519;
        this.f7491 = c9391.f28516;
    }

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ClipData mo7598() {
        return this.f7490;
    }

    @Override // l.InterfaceC15739
    public final int getSource() {
        return this.f7493;
    }

    @Override // l.InterfaceC15739
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo7599() {
        return this.f7492;
    }

    public final String toString() {
        String strValueOf;
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.f7490.getDescription());
        sb.append(", source=");
        int i = this.f7493;
        if (i == 0) {
            strValueOf = "SOURCE_APP";
        } else if (i == 1) {
            strValueOf = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            strValueOf = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            strValueOf = "SOURCE_DRAG_AND_DROP";
        } else if (i != 4) {
            strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        } else {
            strValueOf = "SOURCE_AUTOFILL";
        }
        sb.append(strValueOf);
        sb.append(", flags=");
        int i2 = this.f7492;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.f7494;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        sb.append(str);
        return C9045.m23341(sb, this.f7491 != null ? ", hasExtras" : "", l.d);
    }
}
