package p067l;

import java.util.Date;
import net.p069sf.sevenzipjbinding.ArchiveFormat;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۘܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAXC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6177 {

    /* JADX INFO: renamed from: ֫ */
    public long f15529;

    /* JADX INFO: renamed from: ۜ */
    public final String f15530;

    /* JADX INFO: renamed from: ۡ */
    public long f15531;

    /* JADX INFO: renamed from: ۢ */
    public long f15532;

    /* JADX INFO: renamed from: ۧ */
    public final Integer f15533;

    /* JADX INFO: renamed from: ܳ */
    public final String f15534;

    /* JADX INFO: renamed from: ܽ */
    public final int f15535;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f15536;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f15537;

    /* JADX INFO: renamed from: ᩷ */
    public final String f15538;

    /* JADX INFO: renamed from: ᩻ */
    public final String f15539;

    public C6177(int i, String str, String str2, String str3, boolean z, boolean z2, long j, long j2, long j3, Integer num, String str4) {
        this.f15535 = i;
        this.f15539 = str;
        this.f15538 = str2;
        this.f15530 = str3;
        this.f15537 = z;
        this.f15536 = z2;
        this.f15532 = j;
        this.f15529 = j2;
        this.f15531 = j3;
        this.f15533 = num;
        this.f15534 = str4;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14000() {
        return this.f15535;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m14002() {
        return this.f15539;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m14005() {
        return this.f15538;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m13999() {
        return this.f15530;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m13996() {
        return this.f15537;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m13995() {
        return this.f15536;
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m13994() {
        return this.f15532;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13998(long j) {
        this.f15532 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m13992() {
        return this.f15529;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13993(long j) {
        this.f15529 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14001(long j) {
        this.f15531 = j;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m14004() {
        return this.f15531;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Integer m13997() {
        return this.f15533;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m14003() {
        return this.f15534;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C6177 m13991(IInArchive iInArchive, int i) {
        String fileName;
        long time;
        long j;
        long j2;
        boolean z;
        ArchiveFormat archiveFormat = iInArchive.getArchiveFormat();
        if (archiveFormat != null && archiveFormat.supportMultipleFiles()) {
            Object property = iInArchive.getProperty(i, PropID.IS_FOLDER);
            C13045.m29862(property, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) property).booleanValue();
            String stringProperty = iInArchive.getStringProperty(i, PropID.PATH);
            C13045.m29865(stringProperty, "getStringProperty(...)");
            String strReplace = stringProperty.replace('\\', '/');
            C13045.m29865(strReplace, "replace(...)");
            if (zBooleanValue && !C5235.m11298(strReplace, "/", false)) {
                strReplace = strReplace.concat("/");
            }
            Long l2 = (Long) iInArchive.getProperty(i, PropID.SIZE);
            long jLongValue = l2 != null ? l2.longValue() : -1L;
            Long l3 = (Long) iInArchive.getProperty(i, PropID.PACKED_SIZE);
            long jLongValue2 = l3 != null ? l3.longValue() : -1L;
            Date date = (Date) iInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME);
            z = zBooleanValue;
            fileName = strReplace;
            j2 = jLongValue;
            j = jLongValue2;
            time = date != null ? date.getTime() : -1L;
        } else {
            fileName = iInArchive.getFileName();
            C13045.m29865(fileName, "getFileName(...)");
            int iM11299 = C5235.m11299(fileName);
            if (iM11299 != -1) {
                fileName = fileName.substring(0, iM11299);
                C13045.m29865(fileName, "substring(...)");
            }
            Long l4 = (Long) iInArchive.getProperty(i, PropID.SIZE);
            long jLongValue3 = l4 != null ? l4.longValue() : -1L;
            Long l5 = (Long) iInArchive.getProperty(i, PropID.PACKED_SIZE);
            long jLongValue4 = l5 != null ? l5.longValue() : iInArchive.getFileSize();
            Date date2 = (Date) iInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME);
            time = date2 != null ? date2.getTime() : iInArchive.getFileTime();
            j = jLongValue4;
            j2 = jLongValue3;
            z = false;
        }
        C5738 c5738 = new C5738(fileName);
        String strM12791 = c5738.m12791();
        int i2 = C14387.f41116;
        String parent = c5738.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        Boolean bool = (Boolean) iInArchive.getProperty(i, PropID.ENCRYPTED);
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) iInArchive.getProperty(i, PropID.CRC);
        String stringProperty2 = iInArchive.getStringProperty(i, PropID.SYM_LINK);
        if (stringProperty2 != null && stringProperty2.length() == 0) {
            stringProperty2 = null;
        }
        C13045.m29861((Object) strM12791);
        C13045.m29861((Object) strConcat);
        return new C6177(i, fileName, strM12791, strConcat, z, zBooleanValue2, j2, j, time, num, stringProperty2);
    }
}
