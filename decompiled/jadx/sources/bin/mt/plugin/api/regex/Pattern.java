package bin.mt.plugin.api.regex;

/* JADX INFO: loaded from: classes.dex */
public interface Pattern {
    public static final int CANON_EQ = 128;
    public static final int CASE_INSENSITIVE = 2;
    public static final int COMMENTS = 4;
    public static final int DOTALL = 32;
    public static final int LITERAL = 16;
    public static final int MATCH_WHOLE_WORD = 512;
    public static final int MULTILINE = 8;
    public static final int UNICODE_CASE = 64;
    public static final int UNICODE_CHARACTER_CLASS = 256;
    public static final int UNIX_LINES = 1;

    int flags();

    Matcher matcher(CharSequence charSequence);

    String pattern();
}
