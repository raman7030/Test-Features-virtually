.class public final Ll/ۙ۟᩵;
.super Ljava/lang/Object;
.source "A4CU"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final synthetic ۙ:Ll/ۛܽ֡;

.field public final synthetic ᩶:Ll/۬۟᩵;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۤܽ֡;


# direct methods
.method public constructor <init>(Ll/ۛܽ֡;Ll/۬۟᩵;Ll/ۤܽ֡;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۟᩵;->ۙ:Ll/ۛܽ֡;

    iput-object p2, p0, Ll/ۙ۟᩵;->᩶:Ll/۬۟᩵;

    iput-object p3, p0, Ll/ۙ۟᩵;->᩹:Ll/ۤܽ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 201
    iget-boolean v0, p0, Ll/ۙ۟᩵;->᩸:Z

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/16 v0, 0x64

    .line 194
    :try_start_0
    invoke-static {p0, v0}, Ll/᩶۟᩵;->֫(Ll/֨ᩳ֡;I)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 203
    iput-boolean v0, p0, Ll/ۙ۟᩵;->᩸:Z

    .line 204
    iget-object v0, p0, Ll/ۙ۟᩵;->᩶:Ll/۬۟᩵;

    invoke-interface {v0}, Ll/۬۟᩵;->֫()V

    .line 206
    :cond_0
    iget-object v0, p0, Ll/ۙ۟᩵;->ۙ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 197
    iget-object v0, p0, Ll/ۙ۟᩵;->ۙ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 8

    const/4 p2, 0x1

    .line 174
    :try_start_0
    iget-object p3, p0, Ll/ۙ۟᩵;->ۙ:Ll/ۛܽ֡;

    const-wide/16 v0, 0x2000

    invoke-interface {p3, p1, v0, v1}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, -0x1

    .line 183
    iget-object p3, p0, Ll/ۙ۟᩵;->᩹:Ll/ۤܽ֡;

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 184
    iget-boolean p1, p0, Ll/ۙ۟᩵;->᩸:Z

    if-nez p1, :cond_0

    .line 185
    iput-boolean p2, p0, Ll/ۙ۟᩵;->᩸:Z

    .line 186
    invoke-interface {p3}, Ll/ۚᩳ֡;->close()V

    :cond_0
    return-wide v2

    .line 191
    :cond_1
    invoke-interface {p3}, Ll/ۤܽ֡;->᩷()Ll/۫ܽ֡;

    move-result-object v3

    invoke-virtual {p1}, Ll/۫ܽ֡;->size()J

    move-result-wide v4

    sub-long/2addr v4, v0

    move-object v2, p1

    move-wide v6, v0

    invoke-virtual/range {v2 .. v7}, Ll/۫ܽ֡;->֫(Ll/۫ܽ֡;JJ)V

    .line 192
    invoke-interface {p3}, Ll/ۤܽ֡;->ۨ()Ll/ۤܽ֡;

    return-wide v0

    :catch_0
    move-exception p1

    .line 176
    iget-boolean p3, p0, Ll/ۙ۟᩵;->᩸:Z

    if-nez p3, :cond_2

    .line 177
    iput-boolean p2, p0, Ll/ۙ۟᩵;->᩸:Z

    .line 178
    iget-object p2, p0, Ll/ۙ۟᩵;->᩶:Ll/۬۟᩵;

    invoke-interface {p2}, Ll/۬۟᩵;->֫()V

    .line 180
    :cond_2
    throw p1
.end method
