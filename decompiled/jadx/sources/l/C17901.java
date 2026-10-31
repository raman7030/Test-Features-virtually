package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ᩳ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UZ */
/* JADX INFO: loaded from: classes5.dex */
public class C17901 extends C8437 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f54669;

    public C17901(IllegalStateException illegalStateException, C17195 c17195) {
        int iM11008;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c17195 == null ? null : c17195.f52721);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        if (Build.VERSION.SDK_INT < 23) {
            iM11008 = C3603.m11008(diagnosticInfo);
        } else {
            iM11008 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
        }
        this.f54669 = iM11008;
    }
}
