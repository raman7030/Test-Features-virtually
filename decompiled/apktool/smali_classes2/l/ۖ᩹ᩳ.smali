.class public final Ll/ۖ᩹ᩳ;
.super Ljava/lang/Object;
.source "Q6UO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۙ:J

.field public ᩶:Ll/ۨ᩹ᩳ;

.field public ᩸:Z

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    .line 30
    new-instance v0, Ll/ۨ᩹ᩳ;

    const/4 v1, 0x0

    const/16 v2, 0x800

    const/16 v3, 0x10

    .line 19
    invoke-direct {v0, v1, v2, v3, v1}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    .line 31
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, p1, v2}, Ll/ۨ᩹ᩳ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩹ᩳ;J)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    .line 37
    iget-object v0, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 38
    :cond_0
    iput-object p1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    .line 39
    iput-wide p2, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    return-void
.end method

.method private ᩳ()V
    .locals 2

    .line 43
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/֫᩹ᩳ;

    const-string v1, "Text document is closed"

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    throw v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 150
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩹ᩳ;->᩸:Z

    if-nez v1, :cond_1

    .line 152
    iget-object v1, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 153
    :try_start_1
    iget-object v2, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    const/4 v3, 0x0

    .line 154
    iput-object v3, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    .line 155
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    .line 156
    :try_start_2
    iget-object v1, v2, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 157
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 155
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    .line 150
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot close during text transaction"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    .line 155
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public final length()I
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 48
    :try_start_0
    invoke-direct {p0}, Ll/ۖ᩹ᩳ;->ᩳ()V

    .line 49
    iget-object v1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(I)Ll/ۨ᩹ᩳ;
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 62
    :try_start_0
    invoke-direct {p0}, Ll/ۖ᩹ᩳ;->ᩳ()V

    .line 63
    iget-object v1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    if-ltz p1, :cond_1

    .line 64
    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    if-ge p1, v2, :cond_1

    .line 65
    iget-object p1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 66
    :cond_0
    monitor-exit v0

    return-object v1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid character index"

    invoke-direct {p1, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()Ll/۫᩹ᩳ;
    .locals 5

    .line 88
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 89
    :try_start_0
    invoke-direct {p0}, Ll/ۖ᩹ᩳ;->ᩳ()V

    .line 90
    new-instance v1, Ll/۫᩹ᩳ;

    iget-object v2, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    iget-wide v3, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    invoke-direct {v1, v2, v3, v4}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 91
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/util/function/Consumer;Ll/۫ۗᩳ;)V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 120
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩹ᩳ;->᩸:Z

    if-nez v1, :cond_2

    .line 122
    iget-object v1, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 123
    :try_start_1
    invoke-direct {p0}, Ll/ۖ᩹ᩳ;->ᩳ()V

    .line 124
    iget-wide v2, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    .line 125
    new-instance v2, Ll/ܺ᩹ᩳ;

    iget-object v3, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    invoke-direct {v2, v3, p2}, Ll/ܺ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;Ll/ۡ᩹ᩳ;)V

    .line 126
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 p2, 0x1

    .line 127
    :try_start_2
    iput-boolean p2, p0, Ll/ۖ᩹ᩳ;->᩸:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const/4 p2, 0x0

    .line 129
    :try_start_3
    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 130
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->֫(Ll/ܺ᩹ᩳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 131
    iget-object p1, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    move-object v1, p1

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    :try_start_4
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->ۧ(Ll/ܺ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    .line 133
    iget-wide v3, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    .line 134
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 137
    :cond_0
    :goto_0
    :try_start_6
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->ܽ(Ll/ܺ᩹ᩳ;)V

    .line 138
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->ᩳ(Ll/ܺ᩹ᩳ;)V

    .line 139
    iput-boolean p2, p0, Ll/ۖ᩹ᩳ;->᩸:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 141
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    .line 137
    :try_start_7
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->ܽ(Ll/ܺ᩹ᩳ;)V

    .line 138
    invoke-static {v2}, Ll/ܺ᩹ᩳ;->ᩳ(Ll/ܺ᩹ᩳ;)V

    .line 139
    iput-boolean p2, p0, Ll/ۖ᩹ᩳ;->᩸:Z

    .line 140
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 124
    :cond_1
    :try_start_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Text version exhausted"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    .line 126
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw p1

    .line 120
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Nested text transaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_3
    move-exception p1

    .line 126
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    throw p1
.end method

.method public final ֫(Ll/۫᩹ᩳ;)Z
    .locals 2

    .line 97
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 98
    :try_start_0
    iget-object v1, p0, Ll/ۖ᩹ᩳ;->᩶:Ll/ۨ᩹ᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object p1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 99
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()J
    .locals 3

    .line 80
    iget-object v0, p0, Ll/ۖ᩹ᩳ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 81
    :try_start_0
    invoke-direct {p0}, Ll/ۖ᩹ᩳ;->ᩳ()V

    .line 82
    iget-wide v1, p0, Ll/ۖ᩹ᩳ;->ۙ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
