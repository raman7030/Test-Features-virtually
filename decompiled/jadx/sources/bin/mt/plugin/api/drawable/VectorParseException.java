package bin.mt.plugin.api.drawable;

/* JADX INFO: loaded from: classes.dex */
public class VectorParseException extends RuntimeException {
    public VectorParseException(String str) {
        super(str);
    }

    public VectorParseException(Throwable th) {
        super(th.getMessage(), th);
    }
}
