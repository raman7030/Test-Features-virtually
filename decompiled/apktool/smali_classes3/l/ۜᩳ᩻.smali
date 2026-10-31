.class public Ll/ۜᩳ᩻;
.super Ll/᩹ܶۢ;
.source "Y96B"


# instance fields
.field public ۘ֫:Ljava/lang/String;

.field public ᩴ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 120
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 198
    iget-object p1, p0, Ll/ۜᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

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

    .line 200
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 202
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 203
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    .line 131
    iget-object v0, p0, Ll/ۜᩳ᩻;->ۘ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    :cond_0
    const v1, 0x7f120a8c

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 132
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

    .line 126
    sget-object v0, Ll/᩻ܶۢ;->᩷:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 13

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫([Ljava/lang/String;)[Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 145
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 147
    invoke-virtual {p0}, Ll/᩹ܶۢ;->۫֫()V

    :cond_1
    const-string v4, "password"

    .line 149
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "removeSource"

    .line 150
    invoke-virtual {p0, v5}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v5

    .line 153
    array-length v6, v0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v6, :cond_2

    aget-object v10, v0, v9

    .line 154
    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    add-long/2addr v7, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 156
    :cond_2
    new-instance v6, Ll/᩵ۛۡ;

    invoke-direct {v6, v7, v8}, Ll/᩵ۛۡ;-><init>(J)V

    if-nez v1, :cond_3

    .line 158
    new-instance v7, Ll/ܽ۫᩷;

    const/4 v8, 0x4

    invoke-direct {v7, v8, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v7}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 160
    :cond_3
    array-length v7, v0

    :goto_2
    if-ge v2, v7, :cond_7

    aget-object v8, v0, v2

    .line 161
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Ll/ۜᩳ᩻;->ۘ֫:Ljava/lang/String;

    .line 162
    invoke-virtual {p0, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 163
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".encrypt"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 164
    new-instance v10, Ll/᩵ۛۡ;

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v11

    invoke-direct {v10, v11, v12}, Ll/᩵ۛۡ;-><init>(J)V

    if-eqz v1, :cond_4

    .line 166
    new-instance v11, Ll/ܽ۫᩷;

    const/4 v12, 0x4

    invoke-direct {v11, v12, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v10, v11}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    goto :goto_3

    .line 168
    :cond_4
    new-instance v11, Ll/᩶ۗᩳ;

    invoke-direct {v11, p0}, Ll/᩶ۗᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v11}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 170
    :goto_3
    new-instance v11, Ll/ۚܰۡ;

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v12

    invoke-direct {v11, v12, v4, v3, v3}, Ll/ۚܰۡ;-><init>(Ljava/io/OutputStream;Ljava/lang/String;IZ)V

    .line 171
    :try_start_0
    new-instance v12, Ll/᩻ᩳ᩻;

    invoke-direct {v12, p0, v10, v6}, Ll/᩻ᩳ᩻;-><init>(Ll/ۜᩳ᩻;Ll/᩵ۛۡ;Ll/᩵ۛۡ;)V

    invoke-virtual {v8, v11, v12}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    invoke-virtual {v11}, Ll/ۚܰۡ;->close()V

    .line 301
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 185
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_5

    .line 188
    :cond_5
    iget-object v10, p0, Ll/ۜᩳ᩻;->ᩴ֫:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_6

    .line 190
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۫()Z

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 170
    :try_start_1
    invoke-virtual {v11}, Ll/ۚܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0

    .line 193
    :cond_7
    :goto_5
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 209
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120301

    .line 137
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 138
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
