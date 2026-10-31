.class public final Ll/ܺۖ֡;
.super Ll/ܽۖ֡;
.source "B5PU"


# direct methods
.method public constructor <init>(Ll/ۗܺ֡;)V
    .locals 1

    const-string v0, "(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?"

    .line 262
    invoke-direct {p0, v0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    return-void
.end method

.method public static ܿ(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 282
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ۗܺ֡;
    .locals 4

    .line 273
    new-instance v0, Ll/ۗܺ֡;

    const-string v1, "yy/MM/dd HH:mm:ss"

    const/4 v2, 0x0

    const-string v3, "OS/400"

    invoke-direct {v0, v3, v1, v2}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 10

    .line 288
    new-instance v0, Ll/ۤܺ֡;

    invoke-direct {v0}, Ll/ۤܺ֡;-><init>()V

    .line 289
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    .line 292
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    .line 293
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 294
    invoke-virtual {p0, v2}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    .line 296
    invoke-virtual {p0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v4, ""

    goto :goto_1

    .line 297
    :cond_1
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    const/4 v5, 0x5

    .line 299
    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    .line 300
    invoke-virtual {p0, v6}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v6

    .line 305
    :try_start_0
    invoke-virtual {p0, v4}, Ll/ܽۖ֡;->ܽ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v7

    invoke-virtual {v0, v7}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    :goto_2
    const-string v7, "*STMF"

    .line 310
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    const/16 v8, 0x2f

    const/4 v9, 0x0

    if-eqz v7, :cond_3

    .line 312
    invoke-static {v2}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-static {v6}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_6

    :cond_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    const-string v7, "*DIR"

    .line 315
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 317
    invoke-static {v2}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-static {v6}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_6

    :cond_4
    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const-string v7, "*FILE"

    .line 320
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    if-eqz v6, :cond_d

    .line 328
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ".SAVF"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_6

    :cond_6
    const-string v7, "*MEM"

    .line 333
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 337
    invoke-static {v6}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_6

    .line 340
    :cond_7
    invoke-static {v2}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {v4}, Ll/ܺۖ֡;->ܿ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_6

    .line 349
    :cond_8
    sget-char v3, Ljava/io/File;->separatorChar:C

    invoke-virtual {v6, v8, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    :cond_9
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v4, 0x1

    .line 354
    :goto_4
    invoke-virtual {v0, v3}, Ll/ۤܺ֡;->֫(I)V

    .line 356
    invoke-virtual {v0, v1}, Ll/ۤܺ֡;->ܿ(Ljava/lang/String;)V

    .line 359
    :try_start_1
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤܺ֡;->֫(J)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    nop

    :goto_5
    const-string v1, "/"

    .line 364
    invoke-virtual {v6, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 0
    invoke-static {p1, v9, v6}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_b
    if-eqz v4, :cond_c

    .line 368
    invoke-virtual {v6, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-le v1, v2, :cond_c

    add-int/2addr v1, p1

    .line 370
    invoke-virtual {v6, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 374
    :cond_c
    invoke-virtual {v0, v6}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    return-object v0

    :cond_d
    :goto_6
    const/4 p1, 0x0

    return-object p1
.end method
