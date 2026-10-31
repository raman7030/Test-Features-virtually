.class public Ll/᩵ᩳ᩻;
.super Ll/ۛܶۢ;
.source "195D"


# instance fields
.field public ۖ֫:Ll/ܶ᩵ܿ;

.field public ܺ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 127
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 201
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 203
    iget-object p1, p0, Ll/᩵ᩳ᩻;->ܺ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 204
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "file"

    .line 138
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a8d

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 138
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

    .line 133
    sget-object v0, Ll/᩻ܶۢ;->ۡ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 11

    const-string v0, "file"

    .line 150
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ᩳ᩻;->ܺ֫:Ll/ܶ᩵ܿ;

    .line 151
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ᩳ᩻;->ܺ֫:Ll/ܶ᩵ܿ;

    const-string v1, ".tmp"

    .line 899
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳ᩻;->ܺ֫:Ll/ܶ᩵ܿ;

    :goto_0
    iput-object v0, p0, Ll/᩵ᩳ᩻;->ۖ֫:Ll/ܶ᩵ܿ;

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 152
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫([Ljava/lang/String;)[Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "removeSources"

    .line 153
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    .line 156
    array-length v2, v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_1

    aget-object v7, v0, v6

    .line 157
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v7

    add-long/2addr v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 159
    :cond_1
    new-instance v2, Ll/᩵ۛۡ;

    invoke-direct {v2, v4, v5}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v4, Ll/ۚᩴᩳ;

    invoke-direct {v4, p0}, Ll/ۚᩴᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 160
    iget-object v4, p0, Ll/᩵ᩳ᩻;->ۖ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v4

    const/16 v5, 0x400

    :try_start_0
    new-array v5, v5, [B

    .line 162
    array-length v6, v0

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_5

    aget-object v8, v0, v7

    .line 163
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 164
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 166
    :cond_2
    :try_start_1
    invoke-virtual {v8, v5}, Ljava/io/InputStream;->read([B)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_3

    .line 167
    invoke-virtual {v2, v9}, Ll/᩵ۛۡ;->֫(I)Z

    .line 168
    invoke-virtual {v4, v5, v3, v9}, Ljava/io/OutputStream;->write([BII)V

    .line 169
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v9, :cond_2

    .line 174
    :cond_3
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    if-eqz v8, :cond_4

    .line 164
    :try_start_3
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 176
    :cond_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 177
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 178
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_6
    if-eqz v1, :cond_a

    .line 181
    array-length v1, v0

    const/4 v2, 0x1

    if-le v1, v2, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_8

    const v1, 0x7f12087d

    .line 183
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 184
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 186
    :cond_8
    array-length v1, v0

    :goto_5
    if-ge v3, v1, :cond_a

    aget-object v4, v0, v3

    if-eqz v2, :cond_9

    .line 188
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 190
    :cond_9
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۫()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 193
    :cond_a
    iget-object v0, p0, Ll/᩵ᩳ᩻;->ܺ֫:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩵ᩳ᩻;->ۖ֫:Ll/ܶ᩵ܿ;

    if-eq v0, v1, :cond_b

    const/4 v2, 0x0

    .line 991
    invoke-virtual {v1, v0, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 196
    :cond_b
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catchall_2
    move-exception v0

    .line 160
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 210
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/᩵ᩳ᩻;->ۖ֫:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_0

    .line 211
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    .line 213
    :cond_0
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120616

    .line 143
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 144
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
