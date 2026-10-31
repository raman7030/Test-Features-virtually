package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9727 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9021 f29476;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24716(C1965 c1965) {
        int i = c1965.f6586;
        int i2 = c1965.f6591;
        C9021 c9021 = this.f29476;
        ArrayList arrayList = c9021.f27386;
        if (c9021.f27384 == null) {
            CharSequence charSequence = c1965.f6587;
            c9021.f27384 = charSequence instanceof String ? c1965 : new C1965(c1965.f6585, i2, i, charSequence.toString());
        }
        c9021.f27385++;
        if (arrayList.size() >= 2) {
            c9021.f27387 = true;
            return;
        }
        CharSequence charSequence2 = c1965.f6587;
        int iCodePointCount = i - i2 > 240 ? UMErrorCode.E_UM_BE_EMPTY_URL_PATH : Character.codePointCount(charSequence2, i2, i);
        int iM21642 = iCodePointCount > 120 ? C8163.m21642(i2, 0, charSequence2) : C8163.m21642(i2, -((120 - iCodePointCount) / 2), charSequence2);
        String strM21636 = C8163.m21636(iM21642, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, charSequence2);
        arrayList.add(new C0950(strM21636, iM21642, c1965.f6591, c1965.f6586, iM21642 > 0 || strM21636.length() + iM21642 < charSequence2.length()));
    }
}
