package bin.mt.plugin.api.regex;

/* JADX INFO: loaded from: classes.dex */
public interface MatcherSnapshot {
    void clearComputedReplacement();

    int end();

    int end(int i);

    String expandReplacement(String str);

    void expandReplacementInto(StringBuilder sb, String str);

    String getComputedReplacement();

    CharSequence getText();

    String group();

    String group(int i);

    int groupCount();

    void prepareReplacement(String str);

    int start();

    int start(int i);
}
