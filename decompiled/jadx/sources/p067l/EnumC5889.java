package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;

/* JADX INFO: renamed from: l.ۘۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ND */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5889 {
    VALUE_BYTE((byte) 0),
    VALUE_SHORT((byte) 2),
    VALUE_CHAR((byte) 3),
    VALUE_INT((byte) 4),
    VALUE_LONG((byte) 6),
    VALUE_FLOAT((byte) 16),
    VALUE_DOUBLE((byte) 17),
    VALUE_STRING((byte) 23),
    VALUE_TYPE((byte) 24),
    VALUE_FIELD((byte) 25),
    VALUE_METHOD((byte) 26),
    VALUE_ENUM((byte) 27),
    VALUE_ARRAY(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB),
    VALUE_ANNOTATION((byte) 29),
    VALUE_NULL((byte) 30),
    VALUE_BOOLEAN(C0684bo.f2505j);


    /* JADX INFO: renamed from: ܳ֫ */
    public static final C24625 f14495 = new C24625(16);

    /* JADX INFO: renamed from: ᩸ */
    public final byte f14502;

    static {
        for (EnumC5889 enumC5889 : values()) {
            f14495.m54286(enumC5889.f14502, enumC5889);
        }
    }

    EnumC5889(byte b) {
        this.f14502 = b;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5889 m13238(byte b) {
        return (EnumC5889) f14495.m54285(b);
    }
}
