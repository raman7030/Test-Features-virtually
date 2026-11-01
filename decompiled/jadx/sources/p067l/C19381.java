package p067l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ᩳ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UZ */
/* JADX INFO: loaded from: classes5.dex */
public class C19381 extends C10387 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f57866;

    public C19381(IllegalStateException illegalStateException, C18710 c18710) {
        int iM12984;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c18710 == null ? null : c18710.f55902);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        if (Build.VERSION.SDK_INT < 23) {
            iM12984 = C5792.m12984(diagnosticInfo);
        } else {
            iM12984 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
        }
        this.f57866 = iM12984;
    }
}
