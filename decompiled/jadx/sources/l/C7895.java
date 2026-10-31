package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.۠ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T82Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C7895 extends AbstractC17191 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f24460;

    public C7895(String str, String str2, long j, long j2, S3ObjectSummary s3ObjectSummary) {
        super(str, str2, null, j, j2, s3ObjectSummary != null);
        this.f24460 = s3ObjectSummary;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7895 m21182(String str) {
        int length = str.endsWith("/") ? str.length() - 1 : str.length();
        int iLastIndexOf = str.lastIndexOf(47, length - 1) + 1;
        return new C7895(str.substring(iLastIndexOf, length), "/" + str.substring(0, iLastIndexOf), -1L, -1L, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7895 m21181(S3ObjectSummary s3ObjectSummary) {
        String strM659 = s3ObjectSummary.m659();
        int iLastIndexOf = strM659.lastIndexOf(47) + 1;
        return new C7895(strM659.substring(iLastIndexOf), "/" + strM659.substring(0, iLastIndexOf), s3ObjectSummary.m666(), s3ObjectSummary.m664().getTime(), s3ObjectSummary);
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence mo21183() {
        if (this.f24460 != null) {
            return null;
        }
        return "-";
    }
}
