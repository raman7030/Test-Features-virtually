package bin.p000mt.plugin.api.regex;

/* JADX INFO: loaded from: classes.dex */
public interface Matcher {
    Matcher appendReplacement(StringBuilder sb, String str);

    StringBuilder appendTail(StringBuilder sb);

    int end();

    int end(int i);

    String expandReplacement(String str);

    void expandReplacementInto(StringBuilder sb, String str);

    boolean find();

    boolean find(int i);

    CharSequence getText();

    int getTimeoutMillis();

    String group();

    String group(int i);

    int groupCount();

    boolean hasAnchoringBounds();

    boolean hasTransparentBounds();

    boolean hitEnd();

    boolean lookingAt();

    boolean lookingAt(int i);

    boolean matches();

    Pattern pattern();

    Matcher region(int i, int i2);

    int regionEnd();

    int regionStart();

    String replaceAll(String str);

    String replaceFirst(String str);

    boolean requireEnd();

    Matcher reset();

    Matcher reset(CharSequence charSequence);

    Matcher setTimeoutMillis(int i);

    int start();

    int start(int i);

    MatcherSnapshot toSnapshot();

    Matcher useAnchoringBounds(boolean z);

    Matcher useTransparentBounds(boolean z);
}
