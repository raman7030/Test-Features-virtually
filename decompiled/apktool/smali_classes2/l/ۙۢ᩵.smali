.class public final Ll/ۙۢ᩵;
.super Ljava/lang/Object;
.source "39WK"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$"

    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙۢ᩵;->ۧ:Ljava/util/regex/Pattern;

    const-string v0, "^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$"

    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙۢ᩵;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;
    .locals 2

    .line 72
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->start(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 73
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->start(I)I

    move-result v0

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->end(I)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 9

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "in-addr.arpa"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "ip6.arpa"

    const/4 v5, 0x5

    const-string v6, ""

    if-nez v2, :cond_4

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "_"

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x2e

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 45
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_4

    .line 49
    :cond_1
    sget-object v1, Ll/ۙۢ᩵;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v7, 0x2

    if-eqz v2, :cond_2

    .line 51
    invoke-static {p0, v1, v7}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-static {p0, v1, v4}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v6

    .line 53
    invoke-static {p0, v1, v3}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-static {p0, v1, v5}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    .line 55
    invoke-static {p0, v1, v4}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v1, p0

    move-object p0, v0

    move-object v0, v2

    goto :goto_1

    .line 57
    :cond_2
    sget-object v1, Ll/ۙۢ᩵;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 59
    invoke-static {p0, v1, v7}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-static {p0, v1, v4}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v2

    .line 61
    invoke-static {p0, v1, v3}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-static {p0, v1, v5}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :goto_1
    move-object v8, v6

    move-object v6, v1

    move-object v1, v8

    goto :goto_5

    :cond_3
    move-object p0, v6

    move-object v1, p0

    move-object v3, v1

    goto :goto_5

    .line 39
    :cond_4
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    goto :goto_3

    :cond_5
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 40
    :goto_3
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :goto_4
    move-object v0, v6

    move-object v3, v0

    move-object v6, p0

    move-object p0, v1

    move-object v1, v3

    .line 67
    :goto_5
    invoke-static {v0}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 239
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 240
    sget-object v5, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    invoke-virtual {v4, v5, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    sget-object p0, Ll/۫ۜ᩵;->᩹:Ll/۫ۜ᩵;

    invoke-virtual {v4, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    sget-object p0, Ll/۫ۜ᩵;->ۗ:Ll/۫ۜ᩵;

    invoke-virtual {v4, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    sget-object p0, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    invoke-virtual {v4, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-object p0, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    invoke-virtual {v4, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method
