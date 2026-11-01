package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11613 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10942 f32426;

    /* JADX INFO: renamed from: ֫ */
    public final void m26730(C4236 c4236) {
        int i = c4236.f9365;
        int i2 = c4236.f9370;
        C10942 c10942 = this.f32426;
        ArrayList arrayList = c10942.f30322;
        if (c10942.f30320 == null) {
            CharSequence charSequence = c4236.f9366;
            c10942.f30320 = charSequence instanceof String ? c4236 : new C4236(c4236.f9364, i2, i, charSequence.toString());
        }
        c10942.f30321++;
        if (arrayList.size() >= 2) {
            c10942.f30323 = true;
            return;
        }
        CharSequence charSequence2 = c4236.f9366;
        int iCodePointCount = i - i2 > 240 ? UMErrorCode.E_UM_BE_EMPTY_URL_PATH : Character.codePointCount(charSequence2, i2, i);
        int iM23611 = iCodePointCount > 120 ? C10127.m23611(i2, 0, charSequence2) : C10127.m23611(i2, -((120 - iCodePointCount) / 2), charSequence2);
        String strM23605 = C10127.m23605(iM23611, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, charSequence2);
        arrayList.add(new C3271(strM23605, iM23611, c4236.f9370, c4236.f9365, iM23611 > 0 || strM23605.length() + iM23611 < charSequence2.length()));
    }
}
