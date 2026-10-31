.class public final Ll/ᩴܶ֫;
.super Ljava/lang/Object;
.source "N8HI"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:J

.field public final ۧ:Ll/᩸۠֫;

.field public ܽ:Landroid/net/Uri;

.field public ᩳ:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ll/᩸۠֫;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    iput-object p1, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    .line 48
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Ll/ᩴܶ֫;->ܽ:Landroid/net/Uri;

    .line 49
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ᩴܶ֫;->ᩳ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->close()V

    return-void
.end method

.method public final read([BII)I
    .locals 2

    .line 103
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 105
    iget-wide p2, p0, Ll/ᩴܶ֫;->֫:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ᩴܶ֫;->֫:J

    :cond_0
    return p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 3

    .line 85
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    iget-object v1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iput-object v1, p0, Ll/ᩴܶ֫;->ܽ:Landroid/net/Uri;

    .line 86
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v1, p0, Ll/ᩴܶ֫;->ᩳ:Ljava/util/Map;

    .line 88
    :try_start_0
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 95
    iput-object p1, p0, Ll/ᩴܶ֫;->ܽ:Landroid/net/Uri;

    .line 118
    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object p1

    .line 97
    iput-object p1, p0, Ll/ᩴܶ֫;->ᩳ:Ljava/util/Map;

    return-wide v1

    :catchall_0
    move-exception p1

    .line 113
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 95
    iput-object v1, p0, Ll/ᩴܶ֫;->ܽ:Landroid/net/Uri;

    .line 118
    :cond_1
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    .line 97
    iput-object v0, p0, Ll/ᩴܶ֫;->ᩳ:Ljava/util/Map;

    .line 98
    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ۜ()Ljava/util/Map;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ᩴܶ֫;->ᩳ:Ljava/util/Map;

    return-object v0
.end method

.method public final ܳ()J
    .locals 2

    .line 59
    iget-wide v0, p0, Ll/ᩴܶ֫;->֫:J

    return-wide v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ᩴܶ֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 54
    iput-wide v0, p0, Ll/ᩴܶ֫;->֫:J

    return-void
.end method

.method public final ᩻()Landroid/net/Uri;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ᩴܶ֫;->ܽ:Landroid/net/Uri;

    return-object v0
.end method
