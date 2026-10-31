.class public final Ll/ܽܽۖ;
.super Ljava/lang/Object;
.source "07OA"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ll/ۡܽۖ;

.field public static final ᩳ:Ll/ۡܽۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 165
    new-instance v0, Ll/ۡܽۖ;

    sget-object v1, Ll/ۢܽۖ;->ۗ:Ll/ۢܽۖ;

    const-string v2, "<br>"

    invoke-direct {v0, v1, v2}, Ll/ۡܽۖ;-><init>(Ll/ۢܽۖ;Ljava/lang/String;)V

    sput-object v0, Ll/ܽܽۖ;->ܽ:Ll/ۡܽۖ;

    .line 166
    new-instance v0, Ll/ۡܽۖ;

    sget-object v1, Ll/ۢܽۖ;->ۢ֫:Ll/ۢܽۖ;

    const-string v2, "<p>"

    invoke-direct {v0, v1, v2}, Ll/ۡܽۖ;-><init>(Ll/ۢܽۖ;Ljava/lang/String;)V

    sput-object v0, Ll/ܽܽۖ;->ᩳ:Ll/ۡܽۖ;

    const-string v0, "^<\\w+\\s*/?\\s*>"

    const/4 v1, 0x2

    .line 167
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܽܽۖ;->ۧ:Ljava/util/regex/Pattern;

    const-string v0, " */[*][*]\n *[*] (.*)\n *[*]/"

    .line 169
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܽܽۖ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 49
    :try_start_0
    invoke-static {p1}, Ll/ܿܽۖ;->ۧ(Ljava/lang/String;)Ll/ܳ۬ܺ;

    move-result-object p1
    :try_end_0
    .catch Ll/ᩳܽۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    new-instance v0, Ll/ۜܽۖ;

    invoke-direct {v0, p0}, Ll/ۜܽۖ;-><init>(I)V

    const/4 v1, 0x0

    .line 375
    invoke-virtual {p1, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object p1

    .line 59
    :goto_0
    :pswitch_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡܽۖ;

    .line 60
    sget-object v2, Ll/ۧܽۖ;->֫:[I

    invoke-virtual {v1}, Ll/ۡܽۖ;->֫()Ll/ۢܽۖ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    sget-object v3, Ll/ܽܽۖ;->ۧ:Ljava/util/regex/Pattern;

    packed-switch v2, :pswitch_data_0

    .line 142
    new-instance p0, Ljava/lang/AssertionError;

    invoke-virtual {v1}, Ll/ۡܽۖ;->֫()Ll/ۢܽۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    .line 135
    :pswitch_1
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۖ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 132
    :pswitch_2
    invoke-virtual {v0}, Ll/ۜܽۖ;->ᩳ()V

    goto :goto_0

    .line 129
    :pswitch_3
    invoke-virtual {v0}, Ll/ۜܽۖ;->֫()V

    goto :goto_0

    .line 162
    :pswitch_4
    invoke-virtual {v1}, Ll/ۡܽۖ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Ll/ܽܽۖ;->ܽ:Ll/ۡܽۖ;

    .line 126
    :cond_0
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ܽ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 123
    :pswitch_5
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->᩷(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 120
    :pswitch_6
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۘ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 117
    :pswitch_7
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->֫(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 114
    :pswitch_8
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->۠(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 111
    :pswitch_9
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ܶ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 108
    :pswitch_a
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ᩳ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 105
    :pswitch_b
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ܿ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 102
    :pswitch_c
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->᩵(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 99
    :pswitch_d
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->֡(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 96
    :pswitch_e
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۧ(Ll/ۡܽۖ;)V

    goto :goto_0

    .line 162
    :pswitch_f
    invoke-virtual {v1}, Ll/ۡܽۖ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Ll/ܽܽۖ;->ᩳ:Ll/ۡܽۖ;

    .line 92
    :cond_1
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ᩴ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 89
    :pswitch_10
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->᩻(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 86
    :pswitch_11
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۜ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 83
    :pswitch_12
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۡ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 80
    :pswitch_13
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۢ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 77
    :pswitch_14
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ܺ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 74
    :pswitch_15
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->֨(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 71
    :pswitch_16
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ۚ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 68
    :pswitch_17
    invoke-virtual {v0, v1}, Ll/ۜܽۖ;->ܳ(Ll/ۡܽۖ;)V

    goto/16 :goto_0

    .line 65
    :pswitch_18
    invoke-virtual {v0}, Ll/ۜܽۖ;->ܽ()V

    .line 66
    invoke-virtual {v0}, Ll/ۜܽۖ;->toString()Ljava/lang/String;

    move-result-object p1

    .line 176
    sget-object v0, Ll/ܽܽۖ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    .line 178
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p0, "/** */"

    return-object p0

    :cond_2
    rsub-int/lit8 p0, p0, 0x5d

    .line 190
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, p0, :cond_3

    goto :goto_1

    :cond_3
    const-string p0, "@"

    .line 195
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "@hide"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    const-string p0, "/** "

    const-string p1, " */"

    .line 0
    invoke-static {p0, v0, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    return-object p1

    .line 62
    :pswitch_19
    invoke-virtual {v0}, Ll/ۜܽۖ;->ۧ()V

    goto/16 :goto_0

    .line 145
    :cond_6
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :catch_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
