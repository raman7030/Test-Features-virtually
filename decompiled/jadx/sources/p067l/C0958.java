package p067l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0958 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ֫ */
    public final ClipData f10281;

    /* JADX INFO: renamed from: ۧ */
    public final Bundle f10282;

    /* JADX INFO: renamed from: ܽ */
    public final int f10283;

    /* JADX INFO: renamed from: ܿ */
    public final int f10284;

    /* JADX INFO: renamed from: ᩳ */
    public final Uri f10285;

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ֫ */
    public final ContentInfo mo9668() {
        return null;
    }

    public C0958(C1308 c1308) {
        ClipData clipData = c1308.f31464;
        clipData.getClass();
        this.f10281 = clipData;
        int i = c1308.f31467;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f10284 = i;
        int i2 = c1308.f31466;
        if ((i2 & 1) != i2) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        this.f10283 = i2;
        this.f10285 = c1308.f31468;
        this.f10282 = c1308.f31465;
    }

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ۧ */
    public final ClipData mo9669() {
        return this.f10281;
    }

    @Override // p067l.InterfaceC1623
    public final int getSource() {
        return this.f10284;
    }

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ᩻ */
    public final int mo9670() {
        return this.f10283;
    }

    public final String toString() {
        String strValueOf;
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.f10281.getDescription());
        sb.append(", source=");
        int i = this.f10284;
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
        int i2 = this.f10283;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.f10285;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        sb.append(str);
        return C10965.m25286(sb, this.f10282 != null ? ", hasExtras" : "", C0249l.f1198d);
    }
}
