.class public final Ll/ۖۗۜ;
.super Ljava/lang/Object;
.source "075F"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public volatile ֫:Z

.field public ۧ:Ll/᩸۠֫;

.field public ܽ:Ll/᩸۠ۜ;

.field public final synthetic ܿ:Ll/ۘۗۜ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۘۗۜ;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    .line 72
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۖۗۜ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ll/ۖۗۜ;Ll/᩸۠ۜ;)V
    .locals 0

    .line 95
    iput-object p1, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    .line 96
    iget-boolean p0, p0, Ll/ۖۗۜ;->֫:Z

    if-eqz p0, :cond_0

    .line 97
    invoke-virtual {p1}, Ll/᩸۠ۜ;->close()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x1

    .line 147
    iput-boolean v0, p0, Ll/ۖۗۜ;->֫:Z

    .line 148
    iget-object v0, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    const/4 v1, 0x0

    .line 149
    iput-object v1, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_1

    .line 152
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 155
    iget-object v2, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    .line 156
    iput-object v1, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    if-eqz v2, :cond_0

    .line 158
    invoke-virtual {v2}, Ll/᩸۠ۜ;->close()V

    .line 160
    :cond_0
    throw v0

    .line 155
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    .line 156
    iput-object v1, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    if-eqz v0, :cond_2

    .line 158
    invoke-virtual {v0}, Ll/᩸۠ۜ;->close()V

    :cond_2
    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 130
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    return p1

    .line 128
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 7

    .line 86
    iget-object v0, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/ۖۗۜ;->֫:Z

    if-nez v0, :cond_4

    .line 89
    iget-object v0, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    invoke-static {v0}, Ll/ۘۗۜ;->֫(Ll/ۘۗۜ;)Ll/᩻۬ۜ;

    move-result-object v0

    iget-object v1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-object v2, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    invoke-static {v2}, Ll/ۘۗۜ;->ۧ(Ll/ۘۗۜ;)Ll/ܶ۠֫;

    move-result-object v2

    new-instance v3, Ll/ܺۗۜ;

    invoke-direct {v3, p0}, Ll/ܺۗۜ;-><init>(Ll/ۖۗۜ;)V

    .line 90
    invoke-static {v0, v1, v2, v3}, Ll/ۗ۠ۜ;->֫(Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/ܺۗۜ;)Ll/᩸۠ۜ;

    move-result-object v0

    .line 100
    iput-object v0, p0, Ll/ۖۗۜ;->ܽ:Ll/᩸۠ۜ;

    .line 101
    iget-boolean v1, p0, Ll/ۖۗۜ;->֫:Z

    const-string v2, "HTTP media open was canceled"

    if-nez v1, :cond_3

    .line 105
    invoke-virtual {v0}, Ll/᩸۠ۜ;->֫()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 107
    iget-object v1, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    invoke-static {v1}, Ll/ۘۗۜ;->ۧ(Ll/ۘۗۜ;)Ll/ܶ۠֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v1

    goto :goto_0

    .line 111
    :cond_0
    new-instance v3, Ll/ۢۗۜ;

    iget-object v4, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    invoke-static {v4}, Ll/ۘۗۜ;->֫(Ll/ۘۗۜ;)Ll/᩻۬ۜ;

    move-result-object v4

    iget-object v5, p0, Ll/ۖۗۜ;->ܿ:Ll/ۘۗۜ;

    invoke-static {v5}, Ll/ۘۗۜ;->ۧ(Ll/ۘۗۜ;)Ll/ܶ۠֫;

    move-result-object v5

    new-instance v6, Ll/ۜ᩸ܽ;

    invoke-direct {v6, v1}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v3, v4, v5, v6}, Ll/ۢۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/᩻ۗۜ;)V

    .line 71
    new-instance v1, Ll/᩷ۗۜ;

    invoke-direct {v1, v3}, Ll/᩷ۗۜ;-><init>(Ll/ۢۗۜ;)V

    .line 112
    :goto_0
    iput-object v1, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    .line 113
    iget-boolean v3, p0, Ll/ۖۗۜ;->֫:Z

    if-nez v3, :cond_2

    .line 119
    iget-object v0, p0, Ll/ۖۗۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܶ֫;

    .line 120
    invoke-interface {v1, v2}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_1

    .line 122
    :cond_1
    invoke-interface {v1, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    :cond_2
    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    .line 115
    invoke-interface {v1}, Ll/᩸۠֫;->close()V

    .line 116
    invoke-virtual {v0}, Ll/᩸۠ۜ;->close()V

    .line 117
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_3
    invoke-virtual {v0}, Ll/᩸۠ۜ;->close()V

    .line 103
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 87
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data source is already open"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۖۗۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 80
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۖۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
