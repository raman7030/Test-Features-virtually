package java.nio.file;

import java.io.IOException;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class FileSystemException extends IOException {

    /* JADX INFO: renamed from: a */
    private final String f3685a;

    /* JADX INFO: renamed from: b */
    private final String f3686b;

    public FileSystemException(String str) {
        super((String) null);
        this.f3685a = str;
        this.f3686b = null;
    }

    public FileSystemException(String str, String str2, String str3) {
        super(str3);
        this.f3685a = str;
        this.f3686b = str2;
    }

    public String getFile() {
        return this.f3685a;
    }

    public String getOtherFile() {
        return this.f3686b;
    }

    public String getReason() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f3685a == null && this.f3686b == null) {
            return getReason();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3685a != null) {
            sb.append(this.f3685a);
        }
        if (this.f3686b != null) {
            sb.append(" -> ");
            sb.append(this.f3686b);
        }
        if (getReason() != null) {
            sb.append(": ");
            sb.append(getReason());
        }
        return sb.toString();
    }
}
