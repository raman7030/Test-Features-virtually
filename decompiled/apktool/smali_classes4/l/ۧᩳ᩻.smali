.class public Ll/ۧᩳ᩻;
.super Ll/᩹ܶۢ;
.source "J951"


# static fields
.field public static final synthetic ᩵֫:I


# instance fields
.field public ۘ֫:Ljava/lang/String;

.field public ᩴ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 153
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۧᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 236
    iget-object p1, p0, Ll/ۧᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 301
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result p3

    if-nez p3, :cond_0

    .line 238
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 240
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 241
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    .line 164
    iget-object v0, p0, Ll/ۧᩳ᩻;->ۘ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    :cond_0
    const v1, 0x7f120a8b

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 165
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2d

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 159
    sget-object v0, Ll/᩻ܶۢ;->ܳ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫([Ljava/lang/String;)[Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 178
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    .line 180
    invoke-virtual/range {p0 .. p0}, Ll/᩹ܶۢ;->۫֫()V

    :cond_1
    const-string v2, "password"

    .line 182
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "removeSource"

    .line 183
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v5

    .line 184
    sget v6, Ll/᩵ܰۡ;->۫:I

    .line 75
    :try_start_0
    sget-boolean v6, Ll/ۖܰۡ;->֫:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    array-length v6, v0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    :goto_1
    const/16 v10, 0x14

    if-ge v9, v6, :cond_2

    aget-object v11, v0, v9

    .line 188
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v11

    int-to-long v13, v10

    sub-long/2addr v11, v13

    add-long/2addr v7, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 190
    :cond_2
    new-instance v6, Ll/᩵ۛۡ;

    invoke-direct {v6, v7, v8}, Ll/᩵ۛۡ;-><init>(J)V

    const/4 v7, 0x2

    if-nez v4, :cond_3

    .line 192
    new-instance v8, Ll/ۖ᩵ܿ;

    invoke-direct {v8, v7, v1}, Ll/ۖ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v8}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 194
    :cond_3
    array-length v7, v0

    :goto_2
    if-ge v3, v7, :cond_a

    aget-object v8, v0, v3

    .line 195
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v1, Ll/ۧᩳ᩻;->ۘ֫:Ljava/lang/String;

    .line 196
    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    const-string v11, ".encrypt"

    .line 197
    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_4
    const-string v11, ".decrypt"

    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_3
    invoke-virtual {v8, v9}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 198
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v11

    if-eqz v11, :cond_5

    const-string v11, ".tmp"

    .line 899
    invoke-virtual {v9, v11}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    goto :goto_4

    :cond_5
    move-object v11, v9

    .line 199
    :goto_4
    new-instance v12, Ll/᩵ۛۡ;

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v13

    move v15, v5

    move-object/from16 v16, v6

    int-to-long v5, v10

    sub-long/2addr v13, v5

    invoke-direct {v12, v13, v14}, Ll/᩵ۛۡ;-><init>(J)V

    if-eqz v4, :cond_6

    .line 201
    new-instance v5, Ll/ۖ᩵ܿ;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v1}, Ll/ۖ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v12, v5}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    goto :goto_5

    :cond_6
    const/4 v5, 0x2

    .line 203
    new-instance v6, Ll/᩻ۨ᩷;

    invoke-direct {v6, v5, v1}, Ll/᩻ۨ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v12, v6}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 205
    :goto_5
    new-instance v5, Ll/᩵ܰۡ;

    new-instance v6, Ll/۟ܽ᩻;

    invoke-direct {v6, v8}, Ll/۟ܽ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-direct {v5, v8, v2, v6}, Ll/᩵ܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ۛܶܺ;)V

    .line 206
    :try_start_1
    invoke-virtual {v5}, Ll/᩵ܰۡ;->֫()J

    move-result-wide v13

    new-instance v6, Ll/֫ᩳ᩻;

    move-object/from16 v10, v16

    invoke-direct {v6, v1, v12, v10}, Ll/֫ᩳ᩻;-><init>(Ll/ۧᩳ᩻;Ll/᩵ۛۡ;Ll/᩵ۛۡ;)V

    invoke-virtual {v11, v5, v13, v14, v6}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    invoke-virtual {v5}, Ll/᩵ܰۡ;->close()V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 220
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_7

    :cond_7
    if-eq v11, v9, :cond_8

    const/4 v5, 0x0

    .line 991
    invoke-virtual {v11, v9, v5}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 226
    :cond_8
    iget-object v5, v1, Ll/ۧᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v15, :cond_9

    .line 228
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۫()Z

    :cond_9
    add-int/lit8 v3, v3, 0x1

    move-object v6, v10

    move v5, v15

    const/16 v10, 0x14

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 205
    :try_start_2
    invoke-virtual {v5}, Ll/᩵ܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    .line 231
    :cond_a
    :goto_7
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 77
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 247
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120232

    .line 170
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 171
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
