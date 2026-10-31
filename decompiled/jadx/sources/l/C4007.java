package l;

import java.util.Date;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۘܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAXC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f12713;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f12714;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f12715;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f12716;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Integer f12717;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12718;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f12719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f12720;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12722;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f12723;

    public C4007(int i, String str, String str2, String str3, boolean z, boolean z2, long j, long j2, long j3, Integer num, String str4) {
        this.f12719 = i;
        this.f12723 = str;
        this.f12722 = str2;
        this.f12714 = str3;
        this.f12721 = z;
        this.f12720 = z2;
        this.f12716 = j;
        this.f12713 = j2;
        this.f12715 = j3;
        this.f12717 = num;
        this.f12718 = str4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12080() {
        return this.f12719;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m12082() {
        return this.f12723;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m12085() {
        return this.f12722;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12079() {
        return this.f12714;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m12076() {
        return this.f12721;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m12075() {
        return this.f12720;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m12074() {
        return this.f12716;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12078(long j) {
        this.f12716 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m12072() {
        return this.f12713;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12073(long j) {
        this.f12713 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12081(long j) {
        this.f12715 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m12084() {
        return this.f12715;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Integer m12077() {
        return this.f12717;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m12083() {
        return this.f12718;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4007 m12071(IInArchive iInArchive, int i) {
        String fileName;
        long time;
        long j;
        long j2;
        boolean z;
        ArchiveFormat archiveFormat = iInArchive.getArchiveFormat();
        if (archiveFormat != null && archiveFormat.supportMultipleFiles()) {
            Object property = iInArchive.getProperty(i, PropID.IS_FOLDER);
            C11233.m27800(property, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) property).booleanValue();
            String stringProperty = iInArchive.getStringProperty(i, PropID.PATH);
            C11233.m27803(stringProperty, "getStringProperty(...)");
            String strReplace = stringProperty.replace('\\', '/');
            C11233.m27803(strReplace, "replace(...)");
            if (zBooleanValue && !C3016.m9240(strReplace, "/", false)) {
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
            C11233.m27803(fileName, "getFileName(...)");
            int iM9241 = C3016.m9241(fileName);
            if (iM9241 != -1) {
                fileName = fileName.substring(0, iM9241);
                C11233.m27803(fileName, "substring(...)");
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
        C3545 c3545 = new C3545(fileName);
        String strM10810 = c3545.m10810();
        int i2 = C12645.f38088;
        String parent = c3545.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        Boolean bool = (Boolean) iInArchive.getProperty(i, PropID.ENCRYPTED);
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) iInArchive.getProperty(i, PropID.CRC);
        String stringProperty2 = iInArchive.getStringProperty(i, PropID.SYM_LINK);
        if (stringProperty2 != null && stringProperty2.length() == 0) {
            stringProperty2 = null;
        }
        C11233.m27799((Object) strM10810);
        C11233.m27799((Object) strConcat);
        return new C4007(i, fileName, strM10810, strConcat, z, zBooleanValue2, j2, j, time, num, stringProperty2);
    }
}
