package p067l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9J1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23366 {
    UNKNOWN(0),
    SMB_2_0_2(514),
    SMB_2_1(528),
    SMB_2XX(767),
    SMB_3_0(768),
    SMB_3_0_2(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB_3_1_1(785);


    /* JADX INFO: renamed from: ᩸ */
    public int f74476;

    EnumC23366(int i) {
        this.f74476 = i;
    }

    public int getValue() {
        return this.f74476;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m52019() {
        return this == SMB_3_0 || this == SMB_3_0_2 || this == SMB_3_1_1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52017(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((EnumC23366) it.next()).m52019()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23366 m52016(int i) {
        for (EnumC23366 enumC23366 : values()) {
            if (enumC23366.getValue() == i) {
                return enumC23366;
            }
        }
        throw new IllegalStateException(C20778.m46922(i, "Unknown SMB2 Dialect: "));
    }
}
