.class public final Ll/۠ܰܿ;
.super Ljava/lang/Object;
.source "Z71T"


# static fields
.field public static final ܳ:Ll/᩶۫᩷;

.field public static final ᩻:Ll/֫ۧܳ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܶ᩵ܿ;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Ll/֫ۧܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ܰܿ;->ܳ:Ll/᩶۫᩷;

    .line 22
    new-instance v0, Ll/֫ۧܳ;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Ll/֫ۧܳ;-><init>(JJ)V

    sput-object v0, Ll/۠ܰܿ;->᩻:Ll/֫ۧܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֨ܰܿ;Ll/֫ۧܳ;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/۠ܰܿ;->֫:Ljava/lang/String;

    .line 35
    iget-object p1, p2, Ll/֨ܰܿ;->ۧ:Ljava/lang/String;

    iput-object p1, p0, Ll/۠ܰܿ;->ܽ:Ljava/lang/String;

    .line 36
    iget-object p1, p2, Ll/֨ܰܿ;->֫:Ll/ܶ᩵ܿ;

    iput-object p1, p0, Ll/۠ܰܿ;->ۧ:Ll/ܶ᩵ܿ;

    .line 37
    iput-object p3, p0, Ll/۠ܰܿ;->ᩳ:Ll/֫ۧܳ;

    .line 39
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result p1

    iput-boolean p1, p0, Ll/۠ܰܿ;->ܿ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/֨ܰܿ;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v0

    :goto_0
    const-string v4, "Too many symbolic links in hex target"

    const/16 v5, 0x40

    if-gt v2, v5, :cond_11

    new-array v6, v1, [Ljava/lang/String;

    .line 21
    invoke-static {p0, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 245
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_1

    .line 246
    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    .line 247
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Symbolic link cycle in hex target"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_1
    if-eqz p1, :cond_5

    .line 359
    instance-of v7, p0, Ll/ۧ᩹ܿ;

    if-eqz v7, :cond_4

    move-object v7, p0

    check-cast v7, Ll/ۧ᩹ܿ;

    .line 360
    invoke-virtual {v7}, Ll/ۧ᩹ܿ;->ۨۧ()Ll/ܿ᩹ܿ;

    move-result-object v7

    .line 361
    invoke-virtual {v7}, Ll/ܿ᩹ܿ;->ܿ()C

    move-result v8

    const/16 v9, 0x6c

    if-eq v8, v9, :cond_2

    move-object v7, v0

    goto :goto_2

    .line 364
    :cond_2
    invoke-virtual {v7}, Ll/ܿ᩹ܿ;->ۧ()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 366
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Hex target link metadata is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 370
    :cond_4
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 250
    :cond_5
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v7

    :goto_2
    if-nez v7, :cond_6

    .line 252
    new-instance p1, Ll/֨ܰܿ;

    invoke-direct {p1, p0, v6}, Ll/֨ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-object p1

    :cond_6
    if-nez v3, :cond_7

    .line 256
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 257
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_7
    if-eq v2, v5, :cond_10

    const-string v4, "/"

    .line 273
    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object p0, v7

    goto :goto_5

    .line 276
    :cond_8
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    :goto_3
    if-eqz v4, :cond_e

    .line 278
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "."

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, ".."

    .line 281
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 282
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object p0

    goto :goto_5

    :cond_a
    const-string v5, "./"

    .line 284
    invoke-virtual {v7, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    const/4 v5, 0x2

    .line 285
    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_b
    const-string v5, "../"

    .line 286
    invoke-virtual {v7, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, 0x3

    .line 287
    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 288
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    goto :goto_3

    .line 290
    :cond_c
    invoke-virtual {v4, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    goto :goto_5

    .line 279
    :cond_d
    :goto_4
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    goto :goto_5

    .line 293
    :cond_e
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    :goto_5
    if-eqz p0, :cond_f

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 264
    :cond_f
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0

    .line 260
    :cond_10
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 268
    :cond_11
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/֫ۧܳ;)Ll/֫ۧܳ;
    .locals 10

    .line 315
    instance-of v0, p0, Ll/ۧ᩹ܿ;

    const-string v1, "Hex target metadata is unavailable"

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۧ᩹ܿ;

    .line 333
    invoke-virtual {p0}, Ll/ۧ᩹ܿ;->ۨۧ()Ll/ܿ᩹ܿ;

    move-result-object p0

    .line 334
    invoke-virtual {p0}, Ll/ܿ᩹ܿ;->ܿ()C

    move-result p1

    const/16 v0, 0x2d

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ll/ܿ᩹ܿ;->᩷()J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-ltz p1, :cond_0

    .line 337
    new-instance p1, Ll/֫ۧܳ;

    invoke-virtual {p0}, Ll/ܿ᩹ܿ;->᩷()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/ܿ᩹ܿ;->ۢ()J

    move-result-wide v2

    invoke-direct {p1, v0, v1, v2, v3}, Ll/֫ۧܳ;-><init>(JJ)V

    return-object p1

    .line 335
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 318
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 321
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    .line 322
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v6

    cmp-long p0, v4, v2

    if-ltz p0, :cond_4

    if-nez p0, :cond_2

    .line 324
    invoke-virtual {p1}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v8

    cmp-long p0, v8, v2

    if-nez p0, :cond_4

    :cond_2
    cmp-long p0, v6, v2

    if-nez p0, :cond_3

    .line 325
    invoke-virtual {p1}, Ll/֫ۧܳ;->֫()J

    move-result-wide p0

    cmp-long v0, p0, v2

    if-nez v0, :cond_4

    .line 328
    :cond_3
    new-instance p0, Ll/֫ۧܳ;

    invoke-direct {p0, v4, v5, v6, v7}, Ll/֫ۧܳ;-><init>(JJ)V

    return-object p0

    .line 326
    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 319
    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;
    .locals 8

    const/4 v0, 0x0

    .line 235
    invoke-static {p0, v0}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Z)Ll/֨ܰܿ;

    move-result-object v1

    iget-object v2, v1, Ll/֨ܰܿ;->ۧ:Ljava/lang/String;

    .line 203
    iget-object v3, v1, Ll/֨ܰܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 205
    new-instance p1, Ll/۠ܰܿ;

    sget-object p2, Ll/۠ܰܿ;->᩻:Ll/֫ۧܳ;

    invoke-direct {p1, p0, v1, p2}, Ll/۠ܰܿ;-><init>(Ljava/lang/String;Ll/֨ܰܿ;Ll/֫ۧܳ;)V

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    .line 208
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 209
    :cond_1
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0

    .line 298
    :cond_2
    :goto_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 301
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-ltz p1, :cond_6

    .line 305
    new-instance p1, Ll/֫ۧܳ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v6

    invoke-direct {p1, v4, v5, v6, v7}, Ll/֫ۧܳ;-><init>(JJ)V

    if-eqz p2, :cond_4

    .line 212
    invoke-virtual {p2, p1}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 213
    :cond_3
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0

    .line 235
    :cond_4
    :goto_1
    invoke-static {p0, v0}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Z)Ll/֨ܰܿ;

    move-result-object p2

    .line 217
    iget-object v0, p2, Ll/֨ܰܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p2, Ll/֨ܰܿ;->֫:Ll/ܶ᩵ܿ;

    .line 347
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 348
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    invoke-virtual {p1}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_5

    .line 349
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/֫ۧܳ;->֫()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    .line 220
    new-instance v0, Ll/۠ܰܿ;

    invoke-direct {v0, p0, p2, p1}, Ll/۠ܰܿ;-><init>(Ljava/lang/String;Ll/֨ܰܿ;Ll/֫ۧܳ;)V

    return-object v0

    .line 218
    :cond_5
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0

    .line 303
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Hex target length is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 299
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string p1, "File can not be read"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/۠ܰܿ;
    .locals 4

    .line 226
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    .line 227
    new-instance v1, Ll/۠ܰܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll/֨ܰܿ;

    invoke-direct {v3, p0, v0}, Ll/֨ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    sget-object p0, Ll/۠ܰܿ;->᩻:Ll/֫ۧܳ;

    invoke-direct {v1, v2, v3, p0}, Ll/۠ܰܿ;-><init>(Ljava/lang/String;Ll/֨ܰܿ;Ll/֫ۧܳ;)V

    return-object v1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;
    .locals 1

    const-string v0, "openedFile"

    .line 60
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-static {p0}, Ll/۠ܰܿ;->֫(Ll/ܶ᩵ܿ;)Ll/۠ܰܿ;

    move-result-object p0

    return-object p0

    .line 65
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1, p2}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Ll/۠ܰܿ;
    .locals 1

    const-string v0, "openedFile"

    .line 49
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    invoke-static {p0}, Ll/۠ܰܿ;->֫(Ll/ܶ᩵ܿ;)Ll/۠ܰܿ;

    move-result-object p0

    return-object p0

    .line 54
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;
    .locals 3

    const-string v0, "openedFile"

    .line 93
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    invoke-static {p0}, Ll/۠ܰܿ;->֫(Ll/ܶ᩵ܿ;)Ll/۠ܰܿ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    .line 21
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    new-instance v1, Ll/۠ܰܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ll/֨ܰܿ;

    invoke-direct {v2, v0, p1}, Ll/֨ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-direct {v1, p0, v2, p2}, Ll/۠ܰܿ;-><init>(Ljava/lang/String;Ll/֨ܰܿ;Ll/֫ۧܳ;)V

    return-object v1

    :catch_0
    move-exception p0

    .line 105
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unable to restore deferred hex target"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۠ܰܿ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/۠ܰܿ;->ۧ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܳ()V
    .locals 5

    const-string v0, "Unable to validate hex target"

    .line 148
    iget-object v1, p0, Ll/۠ܰܿ;->ᩳ:Ll/֫ۧܳ;

    .line 342
    iget-boolean v2, p0, Ll/۠ܰܿ;->ܿ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 154
    :cond_0
    :try_start_0
    iget-object v2, p0, Ll/۠ܰܿ;->֫:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Z)Ll/֨ܰܿ;

    move-result-object v2

    .line 156
    iget-object v3, p0, Ll/۠ܰܿ;->ܽ:Ljava/lang/String;

    iget-object v4, v2, Ll/֨ܰܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 159
    iget-object v2, v2, Ll/֨ܰܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-static {v2, v1}, Ll/۠ܰܿ;->֫(Ll/ܶ᩵ܿ;Ll/֫ۧܳ;)Ll/֫ۧܳ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۚᩳܳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    invoke-virtual {v1, v0}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 168
    :cond_1
    new-instance v0, Ll/ۚᩳܳ;

    invoke-direct {v0}, Ll/ۚᩳܳ;-><init>()V

    throw v0

    .line 157
    :cond_2
    :try_start_1
    new-instance v1, Ll/ۚᩳܳ;

    invoke-direct {v1}, Ll/ۚᩳܳ;-><init>()V

    throw v1
    :try_end_1
    .catch Ll/ۚᩳܳ; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v1

    .line 165
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    .line 163
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    move-exception v0

    .line 161
    throw v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/۠ܰܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ll/۠ܰܿ;
    .locals 3

    .line 342
    iget-boolean v0, p0, Ll/۠ܰܿ;->ܿ:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 195
    :cond_0
    iget-object v0, p0, Ll/۠ܰܿ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۠ܰܿ;->֫:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Ll/۠ܰܿ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/֫ۧܳ;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/۠ܰܿ;->ᩳ:Ll/֫ۧܳ;

    return-object v0
.end method
