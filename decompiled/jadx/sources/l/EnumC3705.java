package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ۘۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ND */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3705 {
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
    VALUE_BOOLEAN(bo.j);


    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C23419 f11694 = new C23419(16);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte f11701;

    static {
        for (EnumC3705 enumC3705 : values()) {
            f11694.m51888(enumC3705.f11701, enumC3705);
        }
    }

    EnumC3705(byte b) {
        this.f11701 = b;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3705 m11291(byte b) {
        return (EnumC3705) f11694.m51887(b);
    }
}
