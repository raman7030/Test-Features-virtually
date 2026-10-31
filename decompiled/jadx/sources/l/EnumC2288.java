package l;

/* JADX INFO: renamed from: l.ۖۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K99P */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2288 {
    ALWAYS_KEEP,
    ALWAYS_REMOVE,
    QUERY_PREFER_KEEP,
    QUERY_PREFER_REMOVE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC2288 m7536() {
        String string = ApplicationC20075.f65010.getString("keep_in_editor_options", "1");
        string.getClass();
        char c = 2;
        byte b = -1;
        switch (string.hashCode()) {
            case 48:
                if (string.equals("0")) {
                    b = 0;
                }
                break;
            case 50:
                if (string.equals("2")) {
                    b = 1;
                }
                break;
            case 51:
                if (string.equals("3")) {
                    b = 2;
                }
                break;
        }
        switch (b) {
            case 0:
                c = 0;
                break;
            case 1:
                break;
            case 2:
                c = 3;
                break;
            default:
                c = 1;
                break;
        }
        return values()[c];
    }
}
