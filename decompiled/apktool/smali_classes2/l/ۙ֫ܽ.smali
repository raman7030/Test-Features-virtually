.class public final Ll/ۙ֫ܽ;
.super Ljava/lang/Object;
.source "M45G"


# direct methods
.method public static ֫(Ljava/lang/String;)Ll/۬֫ܽ;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    .line 93
    invoke-static {p0}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"

    .line 96
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v1, 0x1

    .line 100
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v1, v0

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v1, 0x2

    .line 101
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, v0

    goto :goto_1

    :cond_4
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v1, 0x3

    .line 102
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move-object v1, v0

    goto :goto_2

    :cond_6
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v0, 0x4

    .line 103
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_8
    const-string p0, ""

    :goto_3
    move-object v3, p0

    .line 104
    new-instance p0, Ll/۬֫ܽ;

    const-string v0, "description"

    invoke-static {v3, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Ll/۬֫ܽ;-><init>(Ljava/lang/String;IIII)V

    return-object p0

    :cond_9
    :goto_4
    return-object v0
.end method
