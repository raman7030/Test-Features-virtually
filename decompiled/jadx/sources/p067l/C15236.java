package p067l;

import com.amazonaws.services.p061s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.ܰۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C15236 {

    /* JADX INFO: renamed from: ֫ */
    public final String f43483;

    /* JADX INFO: renamed from: ۧ */
    public final String f43484;

    /* JADX INFO: renamed from: ܽ */
    public final S3ObjectSummary f43485;

    public C15236(String str) {
        this.f43483 = str;
        this.f43485 = null;
        if (str.endsWith("/")) {
            this.f43484 = C17073.m38720(1, str.lastIndexOf(47, str.length() - 2) + 1, str);
        } else {
            this.f43484 = str.substring(str.lastIndexOf(47) + 1);
        }
    }

    public C15236(S3ObjectSummary s3ObjectSummary) {
        this.f43483 = null;
        this.f43485 = s3ObjectSummary;
        String strM1824 = s3ObjectSummary.m1824();
        this.f43484 = strM1824.substring(strM1824.lastIndexOf(47) + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9872 m34683() {
        String str = this.f43483;
        if (str == null) {
            return C9872.m23147(this.f43485);
        }
        return C9872.m23148(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m34685() {
        return this.f43483 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m34684() {
        return this.f43484;
    }
}
