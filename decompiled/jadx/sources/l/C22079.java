package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAQ7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22079 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f71728;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f71729 = Collections.EMPTY_LIST;

    public C22079() {
        this.f71728 = C9255.m23780() && !C9886.m24978();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49672() {
        if (this.f71728) {
            this.f71729 = C17721.m41501();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49673(AbstractC15440 abstractC15440, EnumC16309 enumC16309) {
        C1493 c1493M5162 = C1493.m5162(abstractC15440, enumC16309);
        if (c1493M5162 == null) {
            return;
        }
        m49675(c1493M5162);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49674(AbstractC15440 abstractC15440, EnumC16309 enumC16309, AbstractC15440 abstractC15441, EnumC16309 enumC163010) {
        C1493 c1493M5162 = C1493.m5162(abstractC15440, enumC16309);
        C1493 c1493M5163 = C1493.m5162(abstractC15441, enumC163010);
        if (c1493M5162 == null && c1493M5163 == null) {
            return;
        }
        m49675(c1493M5162, c1493M5163);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m49675(C1493... c1493Arr) {
        C10666 c10666M49671;
        String strM24406;
        C10666 c10666M49672;
        if (this.f71728) {
            HashSet<C10666> hashSet = new HashSet(c1493Arr.length);
            HashSet<C10666> hashSet2 = new HashSet(c1493Arr.length);
            for (C1493 c1493 : c1493Arr) {
                if (c1493 != null) {
                    String strM46728 = c1493.f5334;
                    EnumC16309 enumC16309 = c1493.f5335;
                    if (enumC16309.f50180) {
                        ArrayList arrayList = C17721.f54213;
                        try {
                            strM46728 = C20402.m46728(strM46728);
                        } catch (IOException unused) {
                        }
                    }
                    String strM50489 = C22518.m50489(strM46728);
                    if (C17721.m41506(C16999.m39866(strM50489, new String[0])) && (c10666M49671 = m49671(strM50489)) != null && !c10666M49671.f32081) {
                        hashSet.add(c10666M49671);
                        if (enumC16309.f50181 && (strM24406 = C9523.m24406(strM50489)) != null && (c10666M49672 = m49671(strM24406)) != null && !c10666M49672.f32081 && !c10666M49672.equals(c10666M49671)) {
                            hashSet2.add(c10666M49672);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            for (C10666 c10666 : hashSet) {
                C9255.m23761(c10666);
                c10666.f32081 = true;
            }
            for (C10666 c10667 : hashSet2) {
                C9255.m23761(c10667);
                c10667.f32081 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10666 m49671(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C10666 c10666 : this.f71729) {
            if (lowerCase.startsWith(c10666.f32079)) {
                return c10666;
            }
        }
        return null;
    }
}
