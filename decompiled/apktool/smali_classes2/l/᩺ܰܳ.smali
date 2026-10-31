.class public Ll/᩺ܰܳ;
.super Ll/ۛܶۢ;
.source "21XP"


# static fields
.field public static final synthetic ۘ֫:I


# instance fields
.field public ۖ֫:Ll/ܶ᩵ܿ;

.field public ܺ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 106
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    return-void
.end method

.method private ֫(Ljava/util/List;)V
    .locals 3

    .line 177
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const v0, 0x7f12087d

    .line 179
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 180
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 182
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    if-eqz v2, :cond_2

    .line 184
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 186
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 192
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 193
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 194
    iget-object p1, p0, Ll/᩺ܰܳ;->ܺ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 195
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 1

    const v0, 0x7f1205cd

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 112
    sget-object v0, Ll/᩻ܶۢ;->ۖ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 11

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܽۧۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܽۧۢ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/16 v1, 0xf

    invoke-static {v1}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v1

    .line 243
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 18
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v3

    .line 19
    :try_start_0
    invoke-static {v3}, Ll/ۤ᩻ۚ;->֫(Ljava/io/InputStream;)I

    move-result v4

    invoke-static {v4}, Ll/۠ۗ֡;->ᩳ(I)Ll/۠ۗ֡;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 245
    iget v3, v1, Ll/۠ۗ֡;->֫:I

    iget v5, v4, Ll/۠ۗ֡;->֫:I

    if-ge v3, v5, :cond_0

    move-object v1, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    .line 131
    :cond_1
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "delete_dex_files_after_merged"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 132
    new-instance v3, Ll/᩵ۡۚ;

    invoke-direct {v3, v1}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 133
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 134
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 135
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f1207a8

    .line 655
    invoke-static {v7, v6}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 135
    invoke-virtual {p0, v6}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 137
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v5

    .line 138
    :try_start_2
    invoke-static {v5}, Ll/۬ۛ֡;->֫(Ljava/io/InputStream;)Ll/۬ۛ֡;

    move-result-object v6

    .line 139
    invoke-virtual {v6}, Ll/۬ۛ֡;->ܳ()I

    move-result v7

    .line 141
    invoke-virtual {v6}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ll/ᩴ۟֡;

    invoke-virtual {v6}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ۛ֡;

    .line 142
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 143
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 155
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 145
    :cond_2
    :try_start_3
    div-int v10, v8, v7

    invoke-virtual {p0, v10}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 146
    invoke-virtual {v3, v9}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    add-int/lit8 v8, v8, 0x64

    .line 327
    iget-object v9, v3, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v9}, Ll/ۗۢۚ;->getItemCount()I

    move-result v9

    const/high16 v10, 0x10000

    if-gt v9, v10, :cond_5

    .line 340
    iget-object v9, v3, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v9}, Ll/ۘۢۚ;->getItemCount()I

    move-result v9

    if-gt v9, v10, :cond_4

    .line 353
    iget-object v9, v3, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v9}, Ll/ܳۡۚ;->getItemCount()I

    move-result v9

    if-gt v9, v10, :cond_3

    goto :goto_3

    .line 153
    :cond_3
    new-instance v0, Ll/֫ۛۡ;

    const-string v1, "Merge failed, too many type references in Dex, you can try to merge fewer dex files."

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 153
    throw v0

    .line 151
    :cond_4
    new-instance v0, Ll/֫ۛۡ;

    const v1, 0x7f120287

    invoke-direct {v0, v1}, Ll/֫ۛۡ;-><init>(I)V

    throw v0

    .line 149
    :cond_5
    new-instance v0, Ll/֫ۛۡ;

    const v1, 0x7f120288

    invoke-direct {v0, v1}, Ll/֫ۛۡ;-><init>(I)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    :cond_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    if-eqz v5, :cond_7

    .line 137
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    throw v0

    :cond_8
    const v1, 0x7f120b85

    .line 157
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ܿ(I)V

    const-string v1, "outputPath"

    .line 158
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/String;

    invoke-static {v1, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ܰܳ;->ܺ֫:Ll/ܶ᩵ܿ;

    if-eqz v2, :cond_9

    .line 159
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 160
    iget-object v1, p0, Ll/᩺ܰܳ;->ܺ֫:Ll/ܶ᩵ܿ;

    const-string v2, ".tmp"

    .line 899
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 160
    iput-object v1, p0, Ll/᩺ܰܳ;->ۖ֫:Ll/ܶ᩵ܿ;

    .line 161
    invoke-virtual {v3, v1}, Ll/᩸ۜۚ;->֫(Ll/ܶ᩵ܿ;)V

    .line 162
    invoke-direct {p0, v0}, Ll/᩺ܰܳ;->֫(Ljava/util/List;)V

    .line 163
    iget-object v0, p0, Ll/᩺ܰܳ;->ۖ֫:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩺ܰܳ;->ܺ֫:Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    .line 991
    invoke-virtual {v0, v1, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    goto :goto_5

    .line 165
    :cond_9
    iget-object v1, p0, Ll/᩺ܰܳ;->ܺ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3, v1}, Ll/᩸ۜۚ;->֫(Ll/ܶ᩵ܿ;)V

    if-eqz v2, :cond_a

    .line 167
    invoke-direct {p0, v0}, Ll/᩺ܰܳ;->֫(Ljava/util/List;)V

    .line 170
    :cond_a
    :goto_5
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 201
    iget-object p1, p0, Ll/᩺ܰܳ;->ۖ֫:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 204
    :cond_0
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f1205cd

    .line 122
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f120528

    .line 123
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
