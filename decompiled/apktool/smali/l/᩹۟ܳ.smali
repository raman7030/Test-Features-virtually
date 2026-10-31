.class public final Ll/᩹۟ܳ;
.super Ljava/lang/Object;
.source "M73F"


# static fields
.field public static final ᩳ:Ll/᩶۫᩷;


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public final ۧ:Z

.field public final ܽ:Ll/ܶ᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹۟ܳ;->ᩳ:Ll/᩶۫᩷;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Z)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/᩹۟ܳ;->֫:Ll/ܶ᩵ܿ;

    .line 38
    iput-object p2, p0, Ll/᩹۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    .line 39
    iput-boolean p3, p0, Ll/᩹۟ܳ;->ۧ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 0
    invoke-static {p2, p3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 156
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Unexpected compression volume name: "

    if-eqz v0, :cond_5

    .line 159
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 160
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, p1, :cond_4

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 171
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge p1, v2, :cond_2

    .line 172
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x30

    if-lt v2, v4, :cond_3

    const/16 v5, 0x39

    if-le v2, v5, :cond_0

    goto :goto_2

    :cond_0
    if-eq v2, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    or-int/2addr v0, v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    xor-int/2addr v3, v0

    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 163
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 161
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 157
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/᩸۟ܳ;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 129
    iget-object v0, p0, Ll/᩹۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 132
    sget-object v1, Ll/᩸۟ܳ;->᩹:Ll/᩸۟ܳ;

    iget-object v2, p0, Ll/᩹۟ܳ;->֫:Ll/ܶ᩵ܿ;

    if-ne p2, v1, :cond_1

    .line 133
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object v2

    .line 134
    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected non-split compression output: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 134
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 138
    :cond_1
    sget-object v1, Ll/᩸۟ܳ;->ۙ:Ll/᩸۟ܳ;

    if-ne p2, v1, :cond_3

    .line 139
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v2

    .line 142
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۖۢ֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 143
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".z"

    const/4 v1, 0x2

    invoke-static {p1, v1, p2, v0}, Ll/᩹۟ܳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 144
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۖۢ֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 145
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1

    .line 147
    :cond_3
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "."

    const/4 v1, 0x3

    invoke-static {p1, v1, p2, v0}, Ll/᩹۟ܳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 148
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1

    .line 130
    :cond_4
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Compression output is outside the working directory: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 130
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Z)Ll/᩹۟ܳ;
    .locals 2

    if-eqz p1, :cond_0

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".compress"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 58
    :goto_0
    new-instance v1, Ll/᩹۟ܳ;

    .line 59
    invoke-direct {v1, p0, v0, p1}, Ll/᩹۟ܳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Z)V

    return-object v1
.end method

.method private ֫(Ljava/util/ArrayList;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 201
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ۟ܳ;

    .line 202
    iget-boolean v4, v3, Ll/ܶ۟ܳ;->ܿ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, v3, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    if-nez v4, :cond_0

    goto :goto_0

    .line 238
    :cond_0
    :try_start_1
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v4

    if-nez v4, :cond_1

    .line 0
    instance-of v4, v5, Ll/۬ܶܿ;

    if-nez v4, :cond_1

    instance-of v4, v5, Ll/۬۠ܿ;

    if-eqz v4, :cond_2

    .line 206
    :cond_1
    new-instance v4, Ll/ܿ᩵ܿ;

    invoke-direct {v4}, Ll/ܿ᩵ܿ;-><init>()V

    iput-object v4, v3, Ll/ܶ۟ܳ;->ۧ:Ll/ܿ᩵ܿ;

    .line 207
    invoke-virtual {v4, v5}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    :cond_2
    const-string v4, ".compress_rollback"

    .line 209
    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 210
    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 214
    iput-object v4, v3, Ll/ܶ۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    goto :goto_0

    .line 211
    :cond_3
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to move compression target to rollback file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 216
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ۟ܳ;

    .line 217
    iput-boolean v1, v3, Ll/ܶ۟ܳ;->֫:Z

    iget-object v4, v3, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    .line 218
    iget-object v5, v3, Ll/ܶ۟ܳ;->ܳ:Ll/ܶ᩵ܿ;

    .line 991
    invoke-virtual {v5, v4, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 219
    iget-object v3, v3, Ll/ܶ۟ܳ;->ۧ:Ll/ܿ᩵ܿ;

    if-eqz v3, :cond_5

    .line 220
    invoke-virtual {v3, v4}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 227
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ۟ܳ;

    .line 228
    iget-object v1, v0, Ll/ܶ۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 229
    iget-object v0, v0, Ll/ܶ۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_2

    :cond_8
    return-void

    :catch_0
    move-exception v2

    .line 245
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    :goto_3
    if-ltz v3, :cond_d

    .line 246
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۟ܳ;

    .line 247
    iget-object v4, v1, Ll/ܶ۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    iget-object v5, v1, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    if-eqz v4, :cond_b

    .line 248
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_9

    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Compression rollback file is missing: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v5, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 306
    new-instance v4, Ljava/io/IOException;

    invoke-direct {v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 252
    :cond_9
    iget-boolean v4, v1, Ll/ܶ۟ܳ;->֫:Z

    if-eqz v4, :cond_a

    .line 253
    invoke-static {v1, v2}, Ll/᩹۟ܳ;->֫(Ll/ܶ۟ܳ;Ljava/io/IOException;)V

    .line 256
    :cond_a
    :try_start_2
    iget-object v1, v1, Ll/ܶ۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    const/4 v4, 0x0

    invoke-virtual {v1, v5, v4, v4, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception v1

    .line 258
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 260
    :cond_b
    iget-boolean v4, v1, Ll/ܶ۟ܳ;->ܿ:Z

    if-nez v4, :cond_c

    iget-boolean v4, v1, Ll/ܶ۟ܳ;->֫:Z

    if-eqz v4, :cond_c

    .line 261
    invoke-static {v1, v2}, Ll/᩹۟ܳ;->֫(Ll/ܶ۟ܳ;Ljava/io/IOException;)V

    :cond_c
    :goto_4
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 225
    :cond_d
    throw v2
.end method

.method private ֫(Ljava/util/List;Ll/᩸۟ܳ;Ljava/io/IOException;)V
    .locals 3

    .line 280
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 295
    :try_start_0
    invoke-direct {p0, v0, p2}, Ll/᩹۟ܳ;->֫(Ll/ܶ᩵ܿ;Ll/᩸۟ܳ;)Ll/ܶ᩵ܿ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 284
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p3, :cond_0

    .line 285
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to delete temporary compression output: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 306
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ܶ۟ܳ;Ljava/io/IOException;)V
    .locals 2

    .line 270
    iget-object p0, p0, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to delete published compression output: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 306
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private ۧ(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/ArrayList;
    .locals 8

    .line 96
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 99
    sget-object v0, Ll/᩸۟ܳ;->᩹:Ll/᩸۟ܳ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩹۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    const/4 v3, 0x0

    if-ne p2, v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected non-split compression output"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 106
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 107
    invoke-direct {p0, v5, p2}, Ll/᩹۟ܳ;->֫(Ll/ܶ᩵ܿ;Ll/᩸۟ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 108
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 111
    new-instance v7, Ll/ܶ۟ܳ;

    invoke-direct {v7, v5, v6}, Ll/ܶ۟ܳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    invoke-virtual {v5, v2}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    .line 113
    sget-object v6, Ll/᩸۟ܳ;->᩶:Ll/᩸۟ܳ;

    if-ne p2, v6, :cond_2

    .line 114
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".001"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    or-int/2addr v4, v5

    goto :goto_1

    .line 109
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Duplicate compression output target: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v6, p2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 109
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_4
    sget-object p1, Ll/᩸۟ܳ;->ۙ:Ll/᩸۟ܳ;

    if-ne p2, p1, :cond_6

    if-eqz v3, :cond_5

    goto :goto_3

    .line 117
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "ZIP split output is missing the final volume"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 119
    :cond_6
    :goto_3
    sget-object p1, Ll/᩸۟ܳ;->᩶:Ll/᩸۟ܳ;

    if-ne p2, p1, :cond_8

    if-eqz v4, :cond_7

    goto :goto_4

    .line 120
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "7z split output is missing the first volume"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_4
    return-object v0

    .line 97
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Compression output list is empty"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ljava/util/ArrayList;)V
    .locals 4

    .line 185
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ۟ܳ;

    .line 186
    iget-object v1, v0, Ll/ܶ۟ܳ;->ܳ:Ll/ܶ᩵ܿ;

    iget-object v2, v0, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 189
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܶ۟ܳ;->ܿ:Z

    if-eqz v1, :cond_0

    .line 190
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 191
    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Compression output target is a directory: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 187
    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Compression output file is missing: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/List;
    .locals 3

    .line 73
    iget-boolean v0, p0, Ll/᩹۟ܳ;->ۧ:Z

    if-nez v0, :cond_0

    return-object p1

    .line 77
    :cond_0
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/᩹۟ܳ;->ۧ(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/ArrayList;

    move-result-object v0

    .line 78
    invoke-static {v0}, Ll/᩹۟ܳ;->ۧ(Ljava/util/ArrayList;)V

    .line 79
    invoke-direct {p0, v0}, Ll/᩹۟ܳ;->֫(Ljava/util/ArrayList;)V

    const/4 v1, 0x0

    .line 80
    invoke-direct {p0, p1, p2, v1}, Ll/᩹۟ܳ;->֫(Ljava/util/List;Ll/᩸۟ܳ;Ljava/io/IOException;)V

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۟ܳ;

    .line 83
    iget-object v2, v2, Ll/ܶ۟ܳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return-object v1

    :catch_0
    move-exception v0

    .line 87
    invoke-direct {p0, p1, p2, v0}, Ll/᩹۟ܳ;->֫(Ljava/util/List;Ll/᩸۟ܳ;Ljava/io/IOException;)V

    .line 88
    throw v0
.end method

.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/᩹۟ܳ;->ܽ:Ll/ܶ᩵ܿ;

    return-object v0
.end method
