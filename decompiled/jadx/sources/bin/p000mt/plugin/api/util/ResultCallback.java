package bin.p000mt.plugin.api.util;

/* JADX INFO: loaded from: classes.dex */
public interface ResultCallback {
    public static final String ERROR_OPERATION_CANCELED = "Operation cancelled";
    public static final String ERROR_UNSUPPORTED_OPERATION = "Unsupported operation";

    void onFailure(String str);

    void onSuccess();
}
