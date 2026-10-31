.class public final Ll/᩻ۘ۠;
.super Ll/᩶ۖ۠;
.source "E7PU"


# static fields
.field public static final ۚ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֡:Ljava/lang/StringBuilder;

.field public ᩴ:Ljava/lang/String;

.field public ᩵:Ll/ۜۘ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?sm).*^\\s*@deprecated( |$).*"

    .line 96
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻ۘ۠;->ۚ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ll/֡ۘ۠;Ll/ۘۘ۠;[CI)V
    .locals 0

    .line 116
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩶ۖ۠;-><init>(Ll/֡ۘ۠;Ll/ۘۘ۠;[CI)V

    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;

    .line 113
    new-instance p1, Ll/ۜۘ۠;

    invoke-direct {p1}, Ll/ۜۘ۠;-><init>()V

    iput-object p1, p0, Ll/᩻ۘ۠;->᩵:Ll/ۜۘ۠;

    .line 117
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/᩻ۘ۠;->֡:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final getText()Ljava/lang/String;
    .locals 2

    .line 153
    iget-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶ۖ۠;->ܺ:Ll/֡ۘ۠;

    sget-object v1, Ll/֡ۘ۠;->᩶:Ll/֡ۘ۠;

    if-ne v0, v1, :cond_0

    .line 154
    invoke-virtual {p0}, Ll/᩻ۘ۠;->ܺ()V

    .line 156
    :cond_0
    iget-object v0, p0, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ()V
    .locals 13

    .line 175
    sget-object v0, Ll/᩻ۘ۠;->ۚ:Ljava/util/regex/Pattern;

    const/4 v1, 0x1

    :try_start_0
    const-string v2, "/*"

    .line 178
    invoke-virtual {p0, v2}, Ll/۫ۘ۠;->֫(Ljava/lang/String;)Z

    :goto_0
    const/16 v2, 0x2a

    .line 444
    invoke-virtual {p0, v2}, Ll/۫ۘ۠;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x2f

    .line 184
    invoke-virtual {p0, v3}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v5, ""

    if-eqz v4, :cond_1

    .line 185
    :try_start_1
    iput-object v5, p0, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 266
    iput-boolean v1, p0, Ll/᩶ۖ۠;->ۘ:Z

    .line 269
    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 270
    iput-boolean v1, p0, Ll/᩶ۖ۠;->ۖ:Z

    return-void

    :cond_1
    const/16 v4, 0xd

    const/16 v6, 0xa

    .line 190
    :try_start_2
    invoke-virtual {p0, v6, v4}, Ll/۫ۘ۠;->֫(CC)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 191
    invoke-virtual {p0, v4}, Ll/۫ۘ۠;->֫(C)Z

    .line 192
    invoke-virtual {p0, v6}, Ll/۫ۘ۠;->֫(C)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v8, p0

    goto/16 :goto_5

    :cond_2
    const/4 v7, 0x1

    move-object v8, p0

    .line 201
    :goto_1
    :try_start_3
    invoke-virtual {v8}, Ll/۫ۘ۠;->ܿ()Z

    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v10, v8, Ll/᩻ۘ۠;->֡:Ljava/lang/StringBuilder;

    if-eqz v9, :cond_b

    .line 202
    :try_start_4
    invoke-virtual {v8}, Ll/۫ۘ۠;->᩷()I

    move-result v9

    .line 204
    invoke-virtual {v8}, Ll/۫ۘ۠;->ۢ()V

    .line 207
    invoke-virtual {v8, v2}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 444
    :goto_2
    invoke-virtual {v8, v2}, Ll/۫ۘ۠;->֫(C)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 212
    :cond_3
    invoke-virtual {v8, v3}, Ll/۫ۘ۠;->֫(C)Z

    move-result v7

    if-eqz v7, :cond_5

    goto/16 :goto_6

    :cond_4
    if-nez v7, :cond_5

    .line 219
    invoke-virtual {v8, v9}, Ll/۫ۘ۠;->ۧ(I)V

    .line 225
    :cond_5
    :goto_3
    invoke-virtual {v8}, Ll/۫ۘ۠;->ܿ()Z

    move-result v7

    if-eqz v7, :cond_a

    const-string v7, "*/"

    .line 226
    invoke-virtual {v8, v7}, Ll/۫ۘ۠;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_6

    .line 230
    :cond_6
    invoke-virtual {v8, v6, v4}, Ll/۫ۘ۠;->֫(CC)Z

    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v9, v8, Ll/᩻ۘ۠;->᩵:Ll/ۜۘ۠;

    if-eqz v7, :cond_7

    .line 126
    :try_start_5
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    invoke-virtual {v8}, Ll/ۗۘ۠;->ۡ()I

    move-result v11

    invoke-virtual {v9, v7, v11}, Ll/ۜۘ۠;->֫(II)V

    .line 127
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    invoke-virtual {v8, v4}, Ll/۫ۘ۠;->֫(C)Z

    .line 236
    invoke-virtual {v8, v6}, Ll/۫ۘ۠;->֫(C)Z

    goto :goto_5

    :cond_7
    const/16 v7, 0xc

    .line 238
    invoke-virtual {v8, v7}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 239
    invoke-virtual {v8}, Ll/ۗۘ۠;->ۜ()C

    goto :goto_5

    .line 144
    :cond_8
    invoke-virtual {v8}, Ll/۫ۘ۠;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 145
    invoke-virtual {v8}, Ll/۫ۘ۠;->ۧ()I

    move-result v7

    .line 136
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    invoke-virtual {v8}, Ll/ۗۘ۠;->ۡ()I

    move-result v12

    invoke-virtual {v9, v11, v12}, Ll/ۜۘ۠;->֫(II)V

    .line 137
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 147
    :cond_9
    invoke-virtual {v8}, Ll/۫ۘ۠;->֫()C

    move-result v7

    .line 126
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    invoke-virtual {v8}, Ll/ۗۘ۠;->ۡ()I

    move-result v12

    invoke-virtual {v9, v11, v12}, Ll/ۜۘ۠;->֫(II)V

    .line 127
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 245
    :goto_4
    invoke-virtual {v8}, Ll/ۗۘ۠;->ۜ()C

    goto :goto_3

    :cond_a
    :goto_5
    const/4 v7, 0x0

    goto/16 :goto_1

    .line 252
    :cond_b
    :goto_6
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_d

    .line 254
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v3, v1

    :goto_7
    const/4 v4, -0x1

    if-le v3, v4, :cond_c

    .line 255
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    if-ne v4, v2, :cond_c

    add-int/lit8 v3, v3, -0x1

    goto :goto_7

    :cond_c
    add-int/2addr v3, v1

    .line 258
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 261
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v8, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;

    goto :goto_8

    .line 263
    :cond_d
    iput-object v5, v8, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 266
    :goto_8
    iput-boolean v1, v8, Ll/᩶ۖ۠;->ۘ:Z

    .line 269
    iget-object v2, v8, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;

    if-eqz v2, :cond_e

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 270
    iput-boolean v1, v8, Ll/᩶ۖ۠;->ۖ:Z

    :cond_e
    return-void

    :catchall_0
    move-exception v2

    goto :goto_9

    :catchall_1
    move-exception v2

    move-object v8, p0

    .line 266
    :goto_9
    iput-boolean v1, v8, Ll/᩶ۖ۠;->ۘ:Z

    .line 269
    iget-object v3, v8, Ll/᩻ۘ۠;->ᩴ:Ljava/lang/String;

    if-eqz v3, :cond_f

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 270
    iput-boolean v1, v8, Ll/᩶ۖ۠;->ۖ:Z

    .line 272
    :cond_f
    throw v2
.end method
