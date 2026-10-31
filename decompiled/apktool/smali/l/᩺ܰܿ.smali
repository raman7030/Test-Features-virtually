.class public final Ll/᩺ܰܿ;
.super Ljava/lang/Object;
.source "F70U"


# static fields
.field public static final ۜ:Ljava/util/HashMap;

.field public static final ᩷:Ljava/lang/String;


# instance fields
.field public final ֫:Ll/ܺ֡ܿ;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ll/ܶ᩵ܿ;

.field public final ܽ:Ll/ܶ᩵ܿ;

.field public final ܿ:Ll/ܶ᩵ܿ;

.field public final ᩳ:Ll/ܶ᩵ܿ;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩺ܰܿ;->᩷:Ljava/lang/String;

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    .line 61
    iput-object p2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    .line 62
    iput-object p1, p0, Ll/᩺ܰܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string p2, "checkpoint"

    .line 63
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    const-string p2, "state.tmp"

    .line 64
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/᩺ܰܿ;->ܳ:Ll/ܶ᩵ܿ;

    const-string p2, "base"

    .line 66
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/᩺ܰܿ;->֫:Ll/ܺ֡ܿ;

    const-string p2, "owner"

    .line 67
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ܰܿ;->ᩳ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ܰܿ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/ܺ᩺ܿ;)Ll/᩺ܰܿ;
    .locals 4

    const-string v1, "Hex session does not exist: "

    .line 760
    invoke-static {p0}, Ll/᩺ܰܿ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 118
    invoke-static {p1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩺ܰܿ;->֫(Ljava/lang/String;Ll/ܿۖ᩷;)V

    .line 119
    const-class p1, Ll/᩺ܰܿ;

    move-object v0, p1

    monitor-enter v0

    .line 120
    :try_start_0
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 121
    invoke-static {p1}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 122
    invoke-virtual {p1, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_3

    .line 126
    new-instance v1, Ll/᩺ܰܿ;

    invoke-direct {v1, p1, p0}, Ll/᩺ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 127
    sget-object p0, Ll/᩺ܰܿ;->᩷:Ljava/lang/String;

    .line 809
    iget-object p1, v1, Ll/᩺ܰܿ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto :goto_0

    .line 813
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    :catch_0
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 128
    invoke-direct {v1}, Ll/᩺ܰܿ;->ۡ()V

    .line 802
    :cond_2
    invoke-direct {v1}, Ll/᩺ܰܿ;->ᩴ()V

    .line 803
    iget-object p0, v1, Ll/᩺ܰܿ;->ᩳ:Ll/ܶ᩵ܿ;

    const-string p1, "Hex session owner file is unsafe"

    invoke-static {p0, p1}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 804
    sget-object p1, Ll/᩺ܰܿ;->᩷:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    .line 131
    monitor-exit v0

    return-object v1

    .line 124
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p0

    .line 132
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 761
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid hex session token"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;)V
    .locals 5

    .line 2
    const-class v0, Ll/᩺ܰܿ;

    .line 3
    monitor-enter v0

    .line 173
    :try_start_0
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 174
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 177
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 178
    monitor-exit v0

    return-void

    .line 180
    :cond_0
    :try_start_1
    invoke-static {v1}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 181
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 182
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ܰܿ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 185
    :cond_2
    new-instance v3, Ll/᩺ܰܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Ll/᩺ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 187
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v3}, Ll/᩺ܰܿ;->ۜ()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_3

    goto :goto_0

    .line 191
    :cond_3
    :try_start_2
    invoke-virtual {v3}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 197
    :cond_4
    monitor-exit v0

    return-void

    .line 175
    :cond_5
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    const-string v1, "Hex session root directory is unsafe"

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 197
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 454
    instance-of v0, p1, Ll/᩻ܽܳ;

    if-nez v0, :cond_1

    invoke-static {p0}, Ll/᩺ܰܿ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 458
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/᩺ܰܿ;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 460
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܿۖ᩷;)V
    .locals 3

    .line 163
    :goto_0
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_4

    .line 142
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 143
    :try_start_0
    sget-object v1, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܰܿ;

    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 163
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_1

    .line 164
    :cond_0
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0

    .line 149
    :cond_1
    invoke-virtual {v1, p1}, Ll/ۛܰܿ;->֫(Ll/ܿۖ᩷;)Ll/ۤܰܿ;

    move-result-object v0

    .line 150
    sget-object v2, Ll/ۤܰܿ;->۬:Ll/ۤܰܿ;

    if-ne v0, v2, :cond_2

    goto :goto_0

    .line 153
    :cond_2
    sget-object p0, Ll/ۤܰܿ;->᩹:Ll/ۤܰܿ;

    if-ne v0, p0, :cond_3

    :goto_1
    return-void

    .line 156
    :cond_3
    invoke-virtual {v1}, Ll/ۛܰܿ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catchall_0
    move-exception p0

    .line 144
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 164
    :cond_4
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 1

    .line 857
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    return-void

    .line 858
    :cond_1
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 0

    .line 163
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 164
    :cond_0
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0
.end method

.method private ۖ()V
    .locals 2

    .line 466
    iget-object v0, p0, Ll/᩺ܰܿ;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 469
    :cond_0
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 470
    invoke-static {v0}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method private ۘ()V
    .locals 2

    .line 393
    invoke-direct {p0}, Ll/᩺ܰܿ;->ᩴ()V

    .line 396
    :try_start_0
    iget-object v0, p0, Ll/᩺ܰܿ;->ܳ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 401
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-static {v1}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_1

    .line 406
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    if-nez v0, :cond_1

    return-void

    .line 410
    :cond_1
    throw v0
.end method

.method private ۡ()V
    .locals 5

    .line 824
    :try_start_0
    iget-object v0, p0, Ll/᩺ܰܿ;->ܿ:Ll/ܶ᩵ܿ;

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 824
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 825
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "state.tmp"

    .line 826
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 845
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x4

    const-string v4, "state-"

    .line 846
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ".tmp"

    .line 847
    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x6

    if-le v3, v4, :cond_0

    .line 849
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ܰܿ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_1

    const-string v3, ".hex-base.tmp"

    .line 828
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v2, :cond_1

    goto :goto_0

    .line 832
    :cond_1
    :try_start_1
    invoke-static {v1}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    :cond_2
    return-void
.end method

.method public static bridge synthetic ۢ()Ljava/util/HashMap;
    .locals 1

    .line 0
    sget-object v0, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ܰܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 3

    .line 760
    invoke-static {p0}, Ll/᩺ܰܿ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 431
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 432
    :try_start_0
    sget-object v1, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܰܿ;

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    .line 434
    invoke-static {v1, p0}, Ll/ۛܰܿ;->֫(Ll/ۛܰܿ;Z)V

    .line 435
    monitor-exit v0

    return-void

    .line 437
    :cond_0
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 438
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_1

    .line 439
    monitor-exit v0

    return-void

    .line 441
    :cond_1
    invoke-static {v1}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 442
    invoke-virtual {v1, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 443
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 446
    :cond_2
    new-instance v2, Ll/᩺ܰܿ;

    invoke-direct {v2, v1, p0}, Ll/᩺ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-direct {v2}, Ll/᩺ܰܿ;->ۖ()V

    .line 447
    monitor-exit v0

    return-void

    .line 444
    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 447
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 761
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid hex session token"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    const-string v0, "Hex pending state file is unsafe"

    .line 0
    invoke-static {p0, v0}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized ܺ()Ll/᩺ܰܿ;
    .locals 6

    .line 2
    const-class v0, Ll/᩺ܰܿ;

    .line 3
    monitor-enter v0

    .line 74
    :try_start_0
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_4

    .line 78
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 79
    invoke-static {v1}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-ge v2, v3, :cond_3

    .line 81
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    .line 86
    :cond_0
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 87
    new-instance v1, Ll/᩺ܰܿ;

    invoke-direct {v1, v4, v3}, Ll/᩺ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 802
    :try_start_1
    invoke-direct {v1}, Ll/᩺ܰܿ;->ᩴ()V

    .line 803
    iget-object v2, v1, Ll/᩺ܰܿ;->ᩳ:Ll/ܶ᩵ܿ;

    const-string v3, "Hex session owner file is unsafe"

    invoke-static {v2, v3}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 804
    sget-object v3, Ll/᩺ܰܿ;->᩷:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    monitor-exit v0

    return-object v1

    :catch_0
    move-exception v2

    .line 93
    :try_start_2
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v1

    .line 95
    :try_start_3
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    :goto_1
    throw v2

    .line 101
    :cond_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 102
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to create hex session directory"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 105
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to allocate hex session token"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 76
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Hex session root directory is unsafe"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 105
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 866
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 867
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 870
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    const/4 v1, 0x1

    .line 413
    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 871
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 872
    invoke-static {v2}, Ll/᩺ܰܿ;->ܽ(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 875
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۫()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    :goto_1
    return-void

    .line 876
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to delete hex session path: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 876
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/᩺ܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ܰܿ;->ۖ()V

    return-void
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    .line 767
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x24

    if-eq v1, v2, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    .line 770
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 771
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x8

    if-eq v1, v3, :cond_4

    const/16 v3, 0xd

    if-eq v1, v3, :cond_4

    const/16 v3, 0x12

    if-eq v1, v3, :cond_4

    const/16 v3, 0x17

    if-ne v1, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x30

    if-lt v2, v3, :cond_2

    const/16 v3, 0x39

    if-le v2, v3, :cond_5

    :cond_2
    const/16 v3, 0x61

    if-lt v2, v3, :cond_3

    const/16 v3, 0x66

    if-gt v2, v3, :cond_3

    goto :goto_2

    :cond_3
    return v0

    :cond_4
    :goto_1
    const/16 v3, 0x2d

    if-eq v2, v3, :cond_5

    return v0

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    const/4 p0, 0x1

    return p0

    :cond_7
    :goto_3
    return v0
.end method

.method public static ܿ(Ll/᩺ܰܿ;)V
    .locals 3

    .line 353
    iget-object v0, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 354
    :try_start_0
    iget-object v1, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    :try_start_1
    invoke-virtual {v2}, Ll/ۨܰܿ;->ܿ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 361
    :cond_0
    :try_start_2
    iget-object p0, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 362
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ᩳ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 751
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 752
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Hex session root directory is unavailable"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩺ܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ܰܿ;->ۘ()V

    return-void
.end method

.method private ᩴ()V
    .locals 3

    .line 794
    invoke-static {}, Ll/᩺ܰܿ;->᩵()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ܰܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 795
    iget-object v0, p0, Ll/᩺ܰܿ;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 796
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Hex session directory is unavailable: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩵()Ll/ܶ᩵ܿ;
    .locals 2

    .line 744
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "hex-sessions"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/ۛܰܿ;
    .locals 5

    .line 254
    invoke-direct {p0}, Ll/᩺ܰܿ;->ᩴ()V

    .line 255
    iget-object v0, p0, Ll/᩺ܰܿ;->ܿ:Ll/ܶ᩵ܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 255
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "Hex pending state file is unsafe"

    .line 257
    invoke-static {v0, v1}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 258
    new-instance v1, Ll/ۛܰܿ;

    invoke-direct {v1, p0, v0}, Ll/ۛܰܿ;-><init>(Ll/᩺ܰܿ;Ll/ܶ᩵ܿ;)V

    .line 259
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 260
    :try_start_0
    sget-object v2, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    iget-object v3, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܰܿ;

    if-eqz v3, :cond_1

    .line 261
    invoke-static {v3}, Ll/ۛܰܿ;->֫(Ll/ۛܰܿ;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Hex session deletion was requested"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 265
    :cond_1
    :goto_0
    iget-object v4, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    .line 267
    invoke-static {v3}, Ll/ۛܰܿ;->ۧ(Ll/ۛܰܿ;)V

    .line 269
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܶ᩺ܿ;)Ll/ۜۧܳ;
    .locals 3

    .line 296
    invoke-direct {p0}, Ll/᩺ܰܿ;->ᩴ()V

    .line 300
    iget-object v0, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    iget-object v0, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 305
    :try_start_0
    new-instance v1, Ll/۫ܰܿ;

    iget-object v2, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-direct {v1, v2, p1}, Ll/۫ܰܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩺ܿ;)V

    .line 307
    iget-object p1, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/۫ܰܿ;->֫(Ll/۫ܰܿ;)Ll/ۨܰܿ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 309
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 301
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hex session checkpoint is unavailable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()Z
    .locals 3

    .line 243
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 244
    :try_start_0
    sget-object v1, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܰܿ;

    if-eqz v1, :cond_0

    .line 246
    invoke-virtual {v1}, Ll/ۛܰܿ;->ܽ()Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩺ܰܿ;->᩻()Z

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 247
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 3

    .line 418
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 419
    :try_start_0
    sget-object v1, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܰܿ;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 421
    invoke-static {v1, v2}, Ll/ۛܰܿ;->֫(Ll/ۛܰܿ;Z)V

    .line 422
    monitor-exit v0

    return-void

    .line 424
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    invoke-direct {p0}, Ll/᩺ܰܿ;->ۖ()V

    return-void

    :catchall_0
    move-exception v1

    .line 424
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܳ()Z
    .locals 3

    .line 367
    iget-object v0, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 368
    :try_start_0
    iget-object v1, p0, Ll/᩺ܰܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨܰܿ;

    .line 369
    invoke-virtual {v2}, Ll/ۨܰܿ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 370
    monitor-exit v0

    return v1

    :cond_1
    const/4 v1, 0x0

    .line 373
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 374
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 3

    .line 381
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 382
    :try_start_0
    sget-object v1, Ll/᩺ܰܿ;->ۜ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛܰܿ;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 384
    invoke-static {v1, v2}, Ll/ۛܰܿ;->֫(Ll/ۛܰܿ;Z)V

    .line 385
    monitor-exit v0

    return-void

    .line 387
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 388
    invoke-direct {p0}, Ll/᩺ܰܿ;->ۘ()V

    return-void

    :catchall_0
    move-exception v1

    .line 387
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ll/ܺ֡ܿ;
    .locals 1

    .line 231
    iget-object v0, p0, Ll/᩺ܰܿ;->֫:Ll/ܺ֡ܿ;

    return-object v0
.end method

.method public final ᩷()Ljava/io/BufferedInputStream;
    .locals 3

    .line 327
    invoke-direct {p0}, Ll/᩺ܰܿ;->ᩴ()V

    .line 328
    iget-object v0, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 331
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v1

    .line 329
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Hex session checkpoint does not exist: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩺ܰܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 238
    iget-object v0, p0, Ll/᩺ܰܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
