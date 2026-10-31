.class public final Ll/᩷ۚۜ;
.super Ljava/lang/Object;
.source "L73O"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:J

.field public ۧ:Ll/᩸۠֫;

.field public ܳ:J

.field public ܽ:Ll/ۗ۠֫;

.field public final ܿ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:Ll/ۢۚۜ;


# direct methods
.method public constructor <init>(Ll/ۢۚۜ;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۚۜ;->ᩳ:Ll/ۢۚۜ;

    .line 43
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩷ۚۜ;->ܿ:Ljava/util/ArrayList;

    const-wide/16 v0, -0x1

    .line 47
    iput-wide v0, p0, Ll/᩷ۚۜ;->ܳ:J

    return-void
.end method

.method private ܳ()J
    .locals 9

    .line 116
    iget-object v0, p0, Ll/᩷ۚۜ;->ܽ:Ll/ۗ۠֫;

    if-eqz v0, :cond_3

    .line 120
    iget-object v1, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v1, :cond_0

    .line 123
    :try_start_0
    invoke-interface {v1}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :catch_0
    :cond_0
    iget-object v1, p0, Ll/᩷ۚۜ;->ᩳ:Ll/ۢۚۜ;

    invoke-static {v1}, Ll/ۢۚۜ;->ۧ(Ll/ۢۚۜ;)Ll/ܶ۠֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v1

    .line 129
    iput-object v1, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    const-wide/16 v2, -0x1

    .line 130
    iput-wide v2, p0, Ll/᩷ۚۜ;->ܳ:J

    .line 131
    iget-object v4, p0, Ll/᩷ۚۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܶ֫;

    .line 132
    invoke-interface {v1, v5}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_0

    .line 134
    :cond_1
    iget-wide v4, p0, Ll/᩷ۚۜ;->֫:J

    .line 520
    iget-wide v6, v0, Ll/ۗ۠֫;->ܳ:J

    cmp-long v8, v6, v2

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    sub-long v2, v6, v4

    :goto_1
    invoke-virtual {v0, v4, v5, v2, v3}, Ll/ۗ۠֫;->֫(JJ)Ll/ۗ۠֫;

    move-result-object v0

    .line 134
    invoke-interface {v1, v0}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 118
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "HLS media data spec is missing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 153
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    const-wide/16 v1, -0x1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    .line 156
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 159
    iput-object v5, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    .line 160
    iput-object v5, p0, Ll/᩷ۚۜ;->ܽ:Ll/ۗ۠֫;

    .line 161
    iput-wide v3, p0, Ll/᩷ۚۜ;->֫:J

    .line 162
    iput-wide v1, p0, Ll/᩷ۚۜ;->ܳ:J

    .line 163
    throw v0

    .line 159
    :cond_0
    :goto_0
    iput-object v5, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    .line 160
    iput-object v5, p0, Ll/᩷ۚۜ;->ܽ:Ll/ۗ۠֫;

    .line 161
    iput-wide v3, p0, Ll/᩷ۚۜ;->֫:J

    .line 162
    iput-wide v1, p0, Ll/᩷ۚۜ;->ܳ:J

    return-void
.end method

.method public final read([BII)I
    .locals 6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 92
    :cond_0
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_4

    .line 96
    iget-wide v1, p0, Ll/᩷ۚۜ;->ܳ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_2

    iget-object v1, p0, Ll/᩷ۚۜ;->ᩳ:Ll/ۢۚۜ;

    invoke-static {v1}, Ll/ۢۚۜ;->ܽ(Ll/ۢۚۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    iget-wide v2, p0, Ll/᩷ۚۜ;->ܳ:J

    .line 97
    invoke-virtual {v1, v2, v3}, Ll/ܶ֨ۜ;->ۧ(J)Z

    move-result v1

    if-nez v1, :cond_2

    .line 98
    iget-object v0, p0, Ll/᩷ۚۜ;->ܽ:Ll/ۗ۠֫;

    if-eqz v0, :cond_1

    .line 99
    iget-wide v0, v0, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v2, p0, Ll/᩷ۚۜ;->֫:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_1

    const/4 p1, -0x1

    return p1

    .line 104
    :cond_1
    invoke-direct {p0}, Ll/᩷ۚۜ;->ܳ()J

    .line 105
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    .line 107
    :cond_2
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    if-lez p1, :cond_3

    .line 109
    iget-wide p2, p0, Ll/᩷ۚۜ;->֫:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷ۚۜ;->֫:J

    :cond_3
    return p1

    .line 94
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 7

    .line 62
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_3

    .line 65
    iget-object v0, p0, Ll/᩷ۚۜ;->ᩳ:Ll/ۢۚۜ;

    invoke-static {v0}, Ll/ۢۚۜ;->ܽ(Ll/ۢۚۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ֨ۜ;->ܳ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 66
    invoke-static {v0}, Ll/ۢۚۜ;->֫(Ll/ۢۚۜ;)Ll/ܶ۠֫;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/ۢۚۜ;->ۧ(Ll/ۢۚۜ;)Ll/ܶ۠֫;

    move-result-object v6

    .line 67
    :goto_0
    invoke-interface {v6}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v6

    .line 68
    iput-object v6, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    .line 69
    iput-object p1, p0, Ll/᩷ۚۜ;->ܽ:Ll/ۗ۠֫;

    .line 70
    iput-wide v3, p0, Ll/᩷ۚۜ;->֫:J

    .line 71
    iput-wide v1, p0, Ll/᩷ۚۜ;->ܳ:J

    .line 72
    iget-object v3, p0, Ll/᩷ۚۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܶ֫;

    .line 73
    invoke-interface {v6, v4}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_1

    .line 76
    :cond_1
    invoke-interface {v6, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v3

    if-ltz v5, :cond_2

    .line 77
    invoke-static {v0}, Ll/ۢۚۜ;->ܽ(Ll/ۢۚۜ;)Ll/ܶ֨ۜ;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ll/ܶ֨ۜ;->ۧ(J)Z

    move-result p1

    if-nez p1, :cond_2

    .line 78
    invoke-direct {p0}, Ll/᩷ۚۜ;->ܳ()J

    move-result-wide v0

    return-wide v0

    :cond_2
    return-wide v3

    .line 63
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data source is already open"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    .line 148
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 51
    iget-object v0, p0, Ll/᩷ۚۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 52
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 55
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/᩷ۚۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
