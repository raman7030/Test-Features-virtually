.class public final Ll/֫ܰۜ;
.super Ll/᩺ۨۜ;
.source "K6MS"


# instance fields
.field public final synthetic ֫:Ljava/lang/ref/WeakReference;

.field public final synthetic ۧ:Ll/ᩳۜܳ;

.field public final synthetic ܳ:Ll/ܰܺܳ;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩳ:Ljava/lang/String;

.field public volatile ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 123
    iput-object p1, p0, Ll/֫ܰۜ;->ܳ:Ll/ܰܺܳ;

    iput-object p2, p0, Ll/֫ܰۜ;->ۧ:Ll/ᩳۜܳ;

    iput-object p3, p0, Ll/֫ܰۜ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/֫ܰۜ;->ᩳ:Ljava/lang/String;

    iput-object p5, p0, Ll/֫ܰۜ;->ܿ:Ljava/lang/String;

    iput-object p6, p0, Ll/֫ܰۜ;->֫:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ll/᩺ۨۜ;-><init>()V

    .line 124
    instance-of p1, p1, Ll/ۗۢ᩻;

    if-eqz p1, :cond_0

    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p5, p1, p3

    if-gtz p5, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/֫ܰۜ;->᩻:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;ZLl/ܿۖ᩷;)V
    .locals 6

    .line 150
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 151
    iget-object v0, p0, Ll/֫ܰۜ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 152
    iget-object v2, p0, Ll/֫ܰۜ;->ܳ:Ll/ܰܺܳ;

    if-eqz p2, :cond_1

    instance-of v3, v2, Ll/᩵ۙ᩻;

    if-nez v3, :cond_0

    instance-of v3, v2, Ll/ۖۛܳ;

    if-eqz v3, :cond_1

    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    if-eqz v0, :cond_2

    .line 153
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 154
    :cond_2
    new-instance p1, Ll/۫ۨۜ;

    invoke-direct {p1}, Ll/۫ۨۜ;-><init>()V

    throw p1

    .line 155
    :cond_3
    :goto_1
    new-instance v4, Ll/۟᩺ۜ;

    invoke-direct {v4, p3, v3, v0}, Ll/۟᩺ۜ;-><init>(Ll/ܿۖ᩷;ZLl/ۗܺ᩷;)V

    .line 157
    new-instance p3, Ll/ܽܰۜ;

    invoke-direct {p3, v2}, Ll/ܽܰۜ;-><init>(Ll/ܰܺܳ;)V

    iget-object v2, p3, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    .line 158
    :try_start_0
    invoke-static {v4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 159
    iget-object v3, p0, Ll/֫ܰۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v3

    .line 160
    instance-of v5, v2, Ll/᩵ۙ᩻;

    if-eqz v5, :cond_9

    check-cast v2, Ll/᩵ۙ᩻;

    if-eqz p2, :cond_4

    .line 162
    invoke-virtual {v2, v0, v3, v4}, Ll/᩵ۙ᩻;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ܿۖ᩷;)Ljava/io/FilterInputStream;

    move-result-object p2

    goto :goto_2

    .line 163
    :cond_4
    check-cast v3, Ll/۫᩶᩻;

    invoke-virtual {v3}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object p2

    .line 164
    invoke-virtual {v2}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v2}, Ll/᩵ۙ᩻;->ܶ()[B

    move-result-object v3

    invoke-virtual {v2}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    .line 163
    invoke-static {p2, v0, v3, v2, v5}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;[BLjava/lang/String;Ll/֡ۛۡ;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 165
    :goto_2
    :try_start_1
    invoke-static {v4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    if-eqz p2, :cond_7

    const v0, 0x8000

    new-array v0, v0, [B

    .line 169
    :cond_5
    :goto_3
    invoke-static {v4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 170
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    .line 171
    invoke-static {v4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gez v2, :cond_6

    .line 175
    :try_start_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :cond_6
    if-lez v2, :cond_5

    .line 173
    :try_start_3
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_3

    .line 166
    :cond_7
    new-instance p1, Ll/۫ۨۜ;

    invoke-direct {p1}, Ll/۫ۨۜ;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_8

    .line 162
    :try_start_4
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p2

    :try_start_5
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_4
    throw p1

    .line 178
    :cond_9
    new-instance v1, Ll/ۧܰۜ;

    invoke-direct {v1, p1, v4}, Ll/ۧܰۜ;-><init>(Ljava/io/OutputStream;Ll/۟᩺ۜ;)V

    .line 179
    instance-of p1, v2, Ll/ۖۛܳ;

    if-eqz p1, :cond_a

    check-cast v2, Ll/ۖۛܳ;

    .line 180
    invoke-virtual {v2, v0, v3, v1, p2}, Ll/ۖۛܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;Z)V

    goto :goto_5

    .line 181
    :cond_a
    invoke-virtual {v2, v0, v3, v1}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;)V

    .line 182
    :goto_5
    invoke-static {v4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 183
    iget-boolean p1, v1, Ll/ۧܰۜ;->᩶:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-nez p1, :cond_b

    .line 185
    :goto_6
    invoke-virtual {p3}, Ll/ܽܰۜ;->close()V

    return-void

    .line 183
    :cond_b
    :try_start_6
    new-instance p1, Ll/۫ۨۜ;

    invoke-direct {p1}, Ll/۫ۨۜ;-><init>()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 157
    :try_start_7
    invoke-virtual {p3}, Ll/ܽܰۜ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 126
    iget-object v0, p0, Ll/֫ܰۜ;->ۧ:Ll/ᩳۜܳ;

    invoke-static {v0}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۖ()Z
    .locals 1

    .line 130
    iget-boolean v0, p0, Ll/֫ܰۜ;->᩻:Z

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/֫ܰۜ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/io/InputStream;
    .locals 2

    .line 134
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Visitor image source must be prepared before decoding"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩵()Ll/ۨۨۜ;
    .locals 10

    .line 139
    new-instance v0, Ll/ܽܰۜ;

    iget-object v1, p0, Ll/֫ܰۜ;->ܳ:Ll/ܰܺܳ;

    invoke-direct {v0, v1}, Ll/ܽܰۜ;-><init>(Ll/ܰܺܳ;)V

    .line 140
    :try_start_0
    iget-object v1, v0, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    iget-object v2, p0, Ll/֫ܰۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v1

    .line 141
    iget-object v2, p0, Ll/֫ܰۜ;->ܳ:Ll/ܰܺܳ;

    instance-of v2, v2, Ll/ۗۢ᩻;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ll/ܺۘܳ;

    invoke-virtual {v2}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Ll/֫ܰۜ;->᩻:Z

    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/֫ܰۜ;->ܽ:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    iget-object v3, v0, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    invoke-static {v2, v3}, Ll/ᩳܰۜ;->֫(Ljava/lang/StringBuilder;Ll/ܰܺܳ;)V

    .line 144
    new-instance v3, Ll/ۨۨۜ;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    check-cast v1, Ll/ܺۘܳ;

    invoke-virtual {v1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-virtual {v1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v8

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Ll/ۨۨۜ;-><init>(Ljava/lang/String;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-virtual {v0}, Ll/ܽܰۜ;->close()V

    return-object v3

    :catchall_0
    move-exception v1

    .line 139
    :try_start_1
    invoke-virtual {v0}, Ll/ܽܰۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/֫ܰۜ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
