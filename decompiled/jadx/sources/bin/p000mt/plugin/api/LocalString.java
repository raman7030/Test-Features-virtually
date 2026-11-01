package bin.p000mt.plugin.api;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface LocalString {
    String get(String str);

    String get(String str, String str2);

    String get(String str, Object... objArr);

    String getName();

    String getOrDefault(String str, String str2);

    String getOrDefault(String str, String str2, String str3);

    Set keySet();
}
