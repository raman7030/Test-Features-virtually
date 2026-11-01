package p067l;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OG */
/* JADX INFO: loaded from: classes4.dex */
public final class C22801 {
    /* JADX INFO: renamed from: ֫ */
    public static C3354 m51003(C19203 c19203, boolean z, boolean z2) throws C10998 {
        if (z) {
            m51005(3, c19203, false);
        }
        c19203.m43705((int) c19203.m43726(), StandardCharsets.UTF_8);
        long jM43726 = c19203.m43726();
        String[] strArr = new String[(int) jM43726];
        for (int i = 0; i < jM43726; i++) {
            strArr[i] = c19203.m43705((int) c19203.m43726(), StandardCharsets.UTF_8);
        }
        if (z2 && (c19203.m43702() & 1) == 0) {
            throw C10998.m25387("framing bit expected to be set", (Throwable) null);
        }
        return new C3354(strArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25079 m51004(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = C5792.f14228;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                C21334.m48351("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C5346.m11598(new C19203(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    C21334.m48350("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C14928(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C25079(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51005(int i, C19203 c19203, boolean z) throws C10998 {
        if (c19203.m43703() < 7) {
            if (z) {
                return false;
            }
            throw C10998.m25387("too short header: " + c19203.m43703(), (Throwable) null);
        }
        if (c19203.m43702() != i) {
            if (z) {
                return false;
            }
            throw C10998.m25387("expected header type " + Integer.toHexString(i), (Throwable) null);
        }
        if (c19203.m43702() == 118 && c19203.m43702() == 111 && c19203.m43702() == 114 && c19203.m43702() == 98 && c19203.m43702() == 105 && c19203.m43702() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C10998.m25387("expected characters 'vorbis'", (Throwable) null);
    }
}
