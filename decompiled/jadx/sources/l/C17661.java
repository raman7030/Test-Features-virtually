package l;

import android.content.Context;
import android.util.AttributeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B97X */
/* JADX INFO: loaded from: classes5.dex */
public class C17661 extends C2978 {
    @Override // l.C2978, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
    }

    public C17661(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17661(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = -871951599;
        int i3 = C1773.f6144;
        int i4 = C3911.f12484;
        int iM6981 = (C2105.m6981("ᩴ᩶") ^ i3) * (-89);
        int i5 = ((iM6981 ^ i4) * 24769) ^ (-445393713);
        int i6 = -580769727;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i4) * 3939) >> 31));
            switch (i2) {
                case -1636471461:
                case 1652795629:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩺۫")) * (-11);
                        i5 = ((iM6981 ^ i3) * 26731) ^ (-1503042566);
                        i6 = -815623639;
                    } else {
                        iM6981 = (i4 - C0630.m2566("۟֡")) * 45;
                        i5 = ((iM6981 ^ i3) * 21001) ^ (-1130740935);
                        i6 = -409092370;
                    }
                    break;
                case -833062108:
                case 502325847:
                    C4117.m12364();
                    C3911.m11924();
                    iM6981 = (C0630.m2566("ܶ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM6981 ^ i4) * 19321) ^ (-1505613047);
                    i6 = 380613802;
                    break;
                case -620593251:
                case -419466255:
                    C1420.m4913();
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ᩳ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * 24033) ^ 1652985953;
                        i6 = 1898751695;
                    } else {
                        iM6981 = C2105.m6981("ܿۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-16715)) ^ 416413789;
                        i6 = 2108532498;
                    }
                    break;
                case -617671173:
                case 1603438940:
                    if (!C4159.f13567) {
                        iM6981 = (C2105.m6981("᩹᩻") + i4) * (-127);
                        i5 = ((iM6981 ^ i3) * 18403) ^ 194507216;
                        i6 = 1851472864;
                    } else {
                        iM6981 = (C0630.m2566("ܶ᩶") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i4) * 19321) ^ (-1505613047);
                        i6 = 380613802;
                    }
                    break;
                case -91683682:
                case 985400140:
                    C4117.m12364();
                    C11340.m28031();
                    throw new RuntimeException();
                case 1918565849:
                case 2024649769:
                    return;
                default:
                    if (C4263.m12819() >= 0) {
                        iM6981 = C2105.m6981("ᩳ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * 24033) ^ 1652985953;
                        i6 = 1898751695;
                    } else {
                        iM6981 = (C2105.m6981("᩹᩻") + i4) * (-127);
                        i5 = ((iM6981 ^ i3) * 18403) ^ 194507216;
                        i6 = 1851472864;
                    }
                    break;
            }
        }
    }
}
