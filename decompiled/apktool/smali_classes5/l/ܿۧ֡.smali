.class public final Ll/ܿۧ֡;
.super Ll/ܰܽ֡;
.source "U4FJ"


# instance fields
.field public final synthetic ۙ:Ll/ܳۧ֡;

.field public ᩶:Z

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܳۧ֡;Ll/֨ᩳ֡;)V
    .locals 0

    .line 199
    iput-object p1, p0, Ll/ܿۧ֡;->ۙ:Ll/ܳۧ֡;

    .line 200
    invoke-direct {p0, p2}, Ll/ܰܽ֡;-><init>(Ll/֨ᩳ֡;)V

    const/4 p1, 0x0

    .line 196
    iput-boolean p1, p0, Ll/ܿۧ֡;->᩶:Z

    const-wide/16 p1, 0x0

    .line 197
    iput-wide p1, p0, Ll/ܿۧ֡;->᩹:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 217
    invoke-super {p0}, Ll/ܰܽ֡;->close()V

    .line 222
    iget-boolean v0, p0, Ll/ܿۧ֡;->᩶:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 223
    iput-boolean v0, p0, Ll/ܿۧ֡;->᩶:Z

    .line 224
    iget-object v0, p0, Ll/ܿۧ֡;->ۙ:Ll/ܳۧ֡;

    iget-object v1, v0, Ll/ܳۧ֡;->ܿ:Ll/ܺ֫֡;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Ll/ܺ֫֡;->֫(ZLl/᩵֫֡;Ljava/io/IOException;)V

    return-void
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 2

    .line 205
    :try_start_0
    invoke-virtual {p0}, Ll/ܰܽ֡;->֫()Ll/֨ᩳ֡;

    move-result-object p2

    const-wide/16 v0, 0x2000

    invoke-interface {p2, p1, v0, v1}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    .line 207
    iget-wide v0, p0, Ll/ܿۧ֡;->᩹:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ܿۧ֡;->᩹:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    .line 222
    iget-boolean p2, p0, Ll/ܿۧ֡;->᩶:Z

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    .line 223
    iput-boolean p2, p0, Ll/ܿۧ֡;->᩶:Z

    .line 224
    iget-object p2, p0, Ll/ܿۧ֡;->ۙ:Ll/ܳۧ֡;

    iget-object p3, p2, Ll/ܳۧ֡;->ܿ:Ll/ܺ֫֡;

    const/4 v0, 0x0

    invoke-virtual {p3, v0, p2, p1}, Ll/ܺ֫֡;->֫(ZLl/᩵֫֡;Ljava/io/IOException;)V

    .line 212
    :goto_0
    throw p1
.end method
