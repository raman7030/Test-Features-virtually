package p067l;

import bin.p000mt.plus.R;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۢۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73K */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11265 {
    ANY(0, -1, 0, R.string.MT_Protector),
    TODAY(1, 0, 0, R.string.MT_Protector),
    YESTERDAY(2, 0, -1, R.string.MT_Protector),
    THIS_WEEK(3, 1, 0, R.string.MT_Protector),
    LAST_WEEK(4, 1, -1, R.string.MT_Protector),
    THIS_MONTH(5, 2, 0, R.string.MT_Protector),
    LAST_MONTH(6, 2, -1, R.string.MT_Protector),
    THIS_YEAR(7, 3, 0, R.string.MT_Protector);


    /* JADX INFO: renamed from: ۛ */
    public static final String f31372 = " ";

    /* JADX INFO: renamed from: ۙ */
    public final int f31380;

    /* JADX INFO: renamed from: ᩶ */
    public final int f31381;

    /* JADX INFO: renamed from: ᩸ */
    public final int f31382;

    /* JADX INFO: renamed from: ᩹ */
    public final int f31383;

    EnumC11265(int i, int i2, int i3, int i4) {
        this.f31380 = i;
        this.f31381 = i2;
        this.f31383 = i3;
        this.f31382 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public long[] m26194(long j) {
        int i = 2;
        if (this.f31381 == -1) {
            return new long[]{-1, -1};
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = this.f31383;
        if (i2 != 0) {
            int i3 = this.f31381;
            if (i3 == 0) {
                i = 5;
            } else if (i3 == 1) {
                i = 3;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException();
                }
                i = 1;
            }
            calendar.add(i, i2);
        }
        return C7300.m16859(this.f31381, calendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: ֫ */
    public String m26193() {
        return C7050.m16224(this.f31382);
    }

    /* JADX INFO: renamed from: ۧ */
    public int m26195() {
        return this.f31380;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC11265 m26191(int i) {
        for (EnumC11265 enumC11265 : values()) {
            if (enumC11265 != ANY && enumC11265.f31380 == i) {
                return enumC11265;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26190(long j, long j2) {
        if (j == -1 && j2 == -1) {
            return ANY.m26193();
        }
        if (j == -1) {
            return "< " + C18794.m42823(j2);
        }
        if (j2 == -1) {
            return "≥ " + C18794.m42823(j);
        }
        return C18794.m42823(j) + " - " + C18794.m42823(j2);
    }
}
