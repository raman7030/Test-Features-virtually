package bin.p000mt.plugin.api.editor;

import android.text.GetChars;
import bin.p000mt.plugin.api.regex.Matcher;
import bin.p000mt.plugin.api.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public interface BufferedText extends CharSequence, GetChars {
    int count(int i, int i2, char c);

    int findLineEnd(int i);

    int findLineStart(int i);

    int indexOf(char c);

    int indexOf(char c, int i);

    int indexOf(char c, int i, int i2);

    int indexOf(String str);

    int indexOf(String str, int i);

    int indexOf(String str, int i, int i2);

    int lastIndexOf(char c);

    int lastIndexOf(char c, int i);

    int lastIndexOf(char c, int i, int i2);

    int lastIndexOf(String str);

    int lastIndexOf(String str, int i);

    int lastIndexOf(String str, int i, int i2);

    Matcher matcher(Pattern pattern);

    Matcher matcher(String str);

    void reset();

    @Override // java.lang.CharSequence
    @Deprecated
    String toString();
}
