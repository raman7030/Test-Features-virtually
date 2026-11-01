package p067l;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۘ۫ */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1037 {

    /* JADX INFO: renamed from: ۧ */
    public static final C1037 f15353 = m13895(new Locale[0]);

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1807 f15354;

    public C1037(InterfaceC1807 interfaceC1807) {
        this.f15354 = interfaceC1807;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1037 m13893(LocaleList localeList) {
        return new C1037(new C0862(localeList));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m13901() {
        return this.f15354.mo4288();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1037 m13895(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m13893(C0967.m10062(localeArr));
        }
        return new C1037(new C1772(localeArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final Locale m13897(int i) {
        return this.f15354.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13898() {
        return this.f15354.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m13899() {
        return this.f15354.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m13900() {
        return this.f15354.mo4287();
    }

    /* JADX INFO: renamed from: ܿ */
    public static C1037 m13896() {
        return f15353;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1037 m13894(String str) {
        if (str == null || str.isEmpty()) {
            return f15353;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C1632.m39872(strArrSplit[i]);
        }
        return m13895(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1037) {
            return this.f15354.equals(((C1037) obj).f15354);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15354.hashCode();
    }

    public final String toString() {
        return this.f15354.toString();
    }
}
