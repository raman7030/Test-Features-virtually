package p067l;

import android.content.Context;
import android.util.AttributeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B97X */
/* JADX INFO: loaded from: classes5.dex */
public class C19154 extends C0990 {
    @Override // p067l.C0990, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
    }

    public C19154(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19154(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = -871951599;
        int i3 = C0930.f81879;
        int i4 = C1036.f81953;
        int iM55979 = (C0946.m55979("ᩴ᩶") ^ i3) * (-89);
        int i5 = ((iM55979 ^ i4) * 24769) ^ (-445393713);
        int i6 = -580769727;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i4) * 3939) >> 31));
            switch (i2) {
                case -1636471461:
                case 1652795629:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i4 - C0873.m55680("᩺۫")) * (-11);
                        i5 = ((iM55979 ^ i3) * 26731) ^ (-1503042566);
                        i6 = -815623639;
                    } else {
                        iM55979 = (i4 - C0873.m55680("۟֡")) * 45;
                        i5 = ((iM55979 ^ i3) * 21001) ^ (-1130740935);
                        i6 = -409092370;
                    }
                    break;
                case -833062108:
                case 502325847:
                    C1046.m56302();
                    C1036.m56257();
                    iM55979 = (C0873.m55680("ܶ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM55979 ^ i4) * 19321) ^ (-1505613047);
                    i6 = 380613802;
                    break;
                case -620593251:
                case -419466255:
                    C0912.m55833();
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ᩳ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * 24033) ^ 1652985953;
                        i6 = 1898751695;
                    } else {
                        iM55979 = C0946.m55979("ܿۤ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-16715)) ^ 416413789;
                        i6 = 2108532498;
                    }
                    break;
                case -617671173:
                case 1603438940:
                    if (!C1048.f81963) {
                        iM55979 = (C0946.m55979("᩹᩻") + i4) * (-127);
                        i5 = ((iM55979 ^ i3) * 18403) ^ 194507216;
                        i6 = 1851472864;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i4) * 19321) ^ (-1505613047);
                        i6 = 380613802;
                    }
                    break;
                case -91683682:
                case 985400140:
                    C1046.m56302();
                    C1404.m56468();
                    throw new RuntimeException();
                case 1918565849:
                case 2024649769:
                    return;
                default:
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0946.m55979("ᩳ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * 24033) ^ 1652985953;
                        i6 = 1898751695;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩻") + i4) * (-127);
                        i5 = ((iM55979 ^ i3) * 18403) ^ 194507216;
                        i6 = 1851472864;
                    }
                    break;
            }
        }
    }
}
