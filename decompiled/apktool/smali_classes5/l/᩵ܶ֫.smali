.class public final Ll/᩵ܶ֫;
.super Ljava/lang/Object;
.source "474M"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:J

.field public final ۧ:Ll/۠۠֫;

.field public ܽ:Z

.field public final ᩳ:Ll/᩸۠֫;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/۠۠֫;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    iput-object p2, p0, Ll/᩵ܶ֫;->ۧ:Ll/۠۠֫;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 97
    iget-object v0, p0, Ll/᩵ܶ֫;->ۧ:Ll/۠۠֫;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v2}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    iget-boolean v2, p0, Ll/᩵ܶ֫;->ܽ:Z

    if-eqz v2, :cond_0

    .line 100
    iput-boolean v1, p0, Ll/᩵ܶ֫;->ܽ:Z

    .line 101
    invoke-interface {v0}, Ll/۠۠֫;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v2

    .line 99
    iget-boolean v3, p0, Ll/᩵ܶ֫;->ܽ:Z

    if-eqz v3, :cond_1

    .line 100
    iput-boolean v1, p0, Ll/᩵ܶ֫;->ܽ:Z

    .line 101
    invoke-interface {v0}, Ll/۠۠֫;->close()V

    .line 103
    :cond_1
    throw v2
.end method

.method public final read([BII)I
    .locals 5

    .line 69
    iget-wide v0, p0, Ll/᩵ܶ֫;->֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p1, -0x1

    return p1

    .line 72
    :cond_0
    iget-object v0, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p3

    if-lez p3, :cond_1

    .line 75
    iget-object v0, p0, Ll/᩵ܶ֫;->ۧ:Ll/۠۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/۠۠֫;->write([BII)V

    .line 76
    iget-wide p1, p0, Ll/᩵ܶ֫;->֫:J

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    int-to-long v0, p3

    sub-long/2addr p1, v0

    .line 77
    iput-wide p1, p0, Ll/᩵ܶ֫;->֫:J

    :cond_1
    return p3
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 9

    .line 54
    iget-object v0, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ܶ֫;->֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    .line 58
    :cond_0
    iget-wide v4, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    cmp-long v4, v0, v6

    if-eqz v4, :cond_1

    .line 60
    invoke-virtual {p1, v2, v3, v0, v1}, Ll/ۗ۠֫;->֫(JJ)Ll/ۗ۠֫;

    move-result-object p1

    :cond_1
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Ll/᩵ܶ֫;->ܽ:Z

    .line 63
    iget-object v0, p0, Ll/᩵ܶ֫;->ۧ:Ll/۠۠֫;

    invoke-interface {v0, p1}, Ll/۠۠֫;->֫(Ll/ۗ۠֫;)V

    .line 64
    iget-wide v0, p0, Ll/᩵ܶ֫;->֫:J

    return-wide v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    iget-object v0, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩵ܶ֫;->ᩳ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
