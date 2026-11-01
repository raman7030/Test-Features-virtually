package p067l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9X6 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22788 {
    SMB1,
    SMB202(514),
    SMB210(528),
    SMB300(768),
    SMB302(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB311(785);


    /* JADX INFO: renamed from: ᩸ */
    public final int f71822;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f71823;

    EnumC22788() {
        this.f71823 = false;
        this.f71822 = -1;
    }

    EnumC22788(int i) {
        this.f71823 = true;
        this.f71822 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50997() {
        return this.f71823;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50995() {
        if (!this.f71823) {
            throw new UnsupportedOperationException();
        }
        return this.f71822;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m50996(EnumC22788 enumC22788) {
        return ordinal() >= enumC22788.ordinal();
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m50998(EnumC22788 enumC22788) {
        return ordinal() <= enumC22788.ordinal();
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC22788 m50992(EnumC22788 enumC22788, EnumC22788 enumC22789) {
        return enumC22788.m50998(enumC22789) ? enumC22788 : enumC22789;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22788 m50991(EnumC22788 enumC22788, EnumC22788 enumC22789) {
        return enumC22788.m50996(enumC22789) ? enumC22788 : enumC22789;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Set m50993(EnumC22788 enumC22788, EnumC22788 enumC22789) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC22788.class);
        for (EnumC22788 enumC227810 : values()) {
            if ((enumC22788 == null || enumC227810.m50996(enumC22788)) && (enumC22789 == null || enumC227810.m50998(enumC22789))) {
                enumSetNoneOf.add(enumC227810);
            }
        }
        return enumSetNoneOf;
    }
}
