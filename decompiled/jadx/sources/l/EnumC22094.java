package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9J1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22094 {
    UNKNOWN(0),
    SMB_2_0_2(514),
    SMB_2_1(528),
    SMB_2XX(767),
    SMB_3_0(768),
    SMB_3_0_2(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB_3_1_1(785);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f71756;

    EnumC22094(int i) {
        this.f71756 = i;
    }

    public int getValue() {
        return this.f71756;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m49681() {
        return this == SMB_3_0 || this == SMB_3_0_2 || this == SMB_3_1_1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49679(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((EnumC22094) it.next()).m49681()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22094 m49678(int i) {
        for (EnumC22094 enumC22094 : values()) {
            if (enumC22094.getValue() == i) {
                return enumC22094;
            }
        }
        throw new IllegalStateException(C19370.m44628(i, "Unknown SMB2 Dialect: "));
    }
}
