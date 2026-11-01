package p067l;

import com.amazonaws.services.p061s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.۠ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T82Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C9872 extends AbstractC18707 {

    /* JADX INFO: renamed from: ۧ֫ */
    public final S3ObjectSummary f27376;

    public C9872(String str, String str2, long j, long j2, S3ObjectSummary s3ObjectSummary) {
        super(str, str2, null, j, j2, s3ObjectSummary != null);
        this.f27376 = s3ObjectSummary;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9872 m23148(String str) {
        int length = str.endsWith("/") ? str.length() - 1 : str.length();
        int iLastIndexOf = str.lastIndexOf(47, length - 1) + 1;
        return new C9872(str.substring(iLastIndexOf, length), "/" + str.substring(0, iLastIndexOf), -1L, -1L, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9872 m23147(S3ObjectSummary s3ObjectSummary) {
        String strM1824 = s3ObjectSummary.m1824();
        int iLastIndexOf = strM1824.lastIndexOf(47) + 1;
        return new C9872(strM1824.substring(iLastIndexOf), "/" + strM1824.substring(0, iLastIndexOf), s3ObjectSummary.m1831(), s3ObjectSummary.m1829().getTime(), s3ObjectSummary);
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence mo23149() {
        if (this.f27376 != null) {
            return null;
        }
        return "-";
    }
}
