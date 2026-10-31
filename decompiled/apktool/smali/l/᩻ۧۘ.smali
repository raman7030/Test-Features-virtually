.class public final Ll/᩻ۧۘ;
.super Ll/ܰ֫ۘ;
.source "84DG"

# interfaces
.implements Ljava/io/Closeable;
.implements Ll/ۡ۟ۖ;


# static fields
.field public static final ܿ֫:Ll/֫᩻֨;

.field public static final ᩳ֫:Ll/ܳۧۘ;


# instance fields
.field public ֫֫:Ll/᩹ۧۘ;

.field public ۗ:Ll/ۜۧۘ;

.field public ۙ:Ll/ۙ֫ۘ;

.field public ۛ:Ll/֫ܽۘ;

.field public final ۟:Ll/ۚܽۘ;

.field public ۤ:Ll/ۢۧۘ;

.field public ۧ֫:Ll/᩶ۧۘ;

.field public ۨ:Ll/ۘܽۘ;

.field public final ۫:Ljava/util/concurrent/locks/ReentrantLock;

.field public ۬:Ll/ܺۧۘ;

.field public ܰ:Ll/᩸ۧۘ;

.field public ܽ֫:Ll/֨ᩳۘ;

.field public final ᩶:Ll/᩹֫ۘ;

.field public final ᩹:Ll/ܿܽۘ;

.field public ᩺:Ll/᩹ۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 78
    const-class v0, Ll/᩻ۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    .line 79
    new-instance v0, Ll/ܳۧۘ;

    new-instance v1, Ll/᩵ۨۖ;

    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v2, Ll/ۖۨۖ;

    .line 23
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v3, Ll/ܿۨۖ;

    .line 21
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v4, Ll/ᩴۛۖ;

    .line 23
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x4

    new-array v5, v5, [Ll/ۢ۟ۖ;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    aput-object v3, v5, v1

    const/4 v1, 0x3

    aput-object v4, v5, v1

    .line 79
    invoke-direct {v0, v5}, Ll/ܳۧۘ;-><init>([Ll/ۢ۟ۖ;)V

    sput-object v0, Ll/᩻ۧۘ;->ᩳ֫:Ll/ܳۧۘ;

    return-void
.end method

.method public constructor <init>(Ll/ۙ֫ۘ;Ll/᩹֫ۘ;Ll/ܿܽۘ;Ll/ۚܽۘ;)V
    .locals 6

    .line 106
    invoke-direct {p0}, Ll/ܰ֫ۘ;-><init>()V

    .line 83
    new-instance v0, Ll/᩹ۧۘ;

    invoke-direct {v0}, Ll/᩹ۧۘ;-><init>()V

    iput-object v0, p0, Ll/᩻ۧۘ;->֫֫:Ll/᩹ۧۘ;

    .line 84
    new-instance v1, Ll/᩹ۧۘ;

    invoke-direct {v1}, Ll/᩹ۧۘ;-><init>()V

    iput-object v1, p0, Ll/᩻ۧۘ;->᩺:Ll/᩹ۧۘ;

    .line 85
    new-instance v1, Ll/ۢۧۘ;

    invoke-direct {v1}, Ll/ۢۧۘ;-><init>()V

    iput-object v1, p0, Ll/᩻ۧۘ;->ۤ:Ll/ۢۧۘ;

    .line 87
    new-instance v2, Ll/۟ۛۖ;

    invoke-direct {v2}, Ll/۟ۛۖ;-><init>()V

    .line 104
    new-instance v3, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v3, p0, Ll/᩻ۧۘ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 107
    iput-object p1, p0, Ll/᩻ۧۘ;->ۙ:Ll/ۙ֫ۘ;

    .line 108
    iput-object p2, p0, Ll/᩻ۧۘ;->᩶:Ll/᩹֫ۘ;

    .line 109
    invoke-virtual {p1}, Ll/ۙ֫ۘ;->ۘ()Ll/֫۫;

    move-result-object p2

    new-instance v3, Ll/᩸ۘܺ;

    new-instance v4, Ll/ܰۢܽ;

    .line 22
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 109
    sget-object v5, Ll/᩻ۧۘ;->ᩳ֫:Ll/ܳۧۘ;

    invoke-direct {v3, v4, p0, v5}, Ll/᩸ۘܺ;-><init>(Ll/ܰۢܽ;Ll/᩻ۧۘ;Ll/ۢ۟ۖ;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance p2, Ll/֨ᩳۘ;

    invoke-virtual {p1}, Ll/ۙ֫ۘ;->᩷()Ljavax/net/SocketFactory;

    move-result-object v4

    invoke-virtual {p1}, Ll/ۙ֫ۘ;->ۜ()I

    move-result v5

    invoke-direct {p2, v4, v5, v3}, Ll/֨ᩳۘ;-><init>(Ljavax/net/SocketFactory;ILl/᩸ۘܺ;)V

    .line 109
    iput-object p2, p0, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    .line 110
    iput-object p3, p0, Ll/᩻ۧۘ;->᩹:Ll/ܿܽۘ;

    .line 111
    iput-object p4, p0, Ll/᩻ۧۘ;->۟:Ll/ۚܽۘ;

    .line 116
    invoke-virtual {p3, p0}, Ll/ܿܽۘ;->֫(Ljava/lang/AutoCloseable;)V

    .line 117
    new-instance p2, Ll/᩸ۧۘ;

    invoke-direct {p2}, Ll/᩸ۧۘ;-><init>()V

    iput-object p2, p0, Ll/᩻ۧۘ;->ܰ:Ll/᩸ۧۘ;

    .line 118
    invoke-virtual {p1}, Ll/ۙ֫ۘ;->ۚ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 119
    new-instance p2, Ll/ۘۧۘ;

    invoke-virtual {p1}, Ll/ۙ֫ۘ;->᩻()Ll/ۖ֫ۘ;

    move-result-object p3

    invoke-direct {p2, p3}, Ll/ۘۧۘ;-><init>(Ll/ۖ֫ۘ;)V

    iput-object p2, p0, Ll/᩻ۧۘ;->ۧ֫:Ll/᩶ۧۘ;

    goto :goto_0

    .line 121
    :cond_0
    sget-object p2, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    const-string p3, "Signing is disabled for this connection."

    invoke-interface {p2, p3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 122
    new-instance p2, Ll/ۖ᩵ۘ;

    .line 26
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object p2, p0, Ll/᩻ۧۘ;->ۧ֫:Ll/᩶ۧۘ;

    .line 124
    :goto_0
    new-instance p2, Ll/ܺۧۘ;

    invoke-virtual {p1}, Ll/ۙ֫ۘ;->᩻()Ll/ۖ֫ۘ;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܺۧۘ;-><init>(Ll/ۖ֫ۘ;)V

    iput-object p2, p0, Ll/᩻ۧۘ;->۬:Ll/ܺۧۘ;

    .line 128
    new-instance p1, Ll/֫ܽۘ;

    iget-object p2, p0, Ll/᩻ۧۘ;->۬:Ll/ܺۧۘ;

    invoke-direct {p1, v0, p2}, Ll/֫ܽۘ;-><init>(Ll/᩹ۧۘ;Ll/ܺۧۘ;)V

    new-instance p2, Ll/ۤۧۘ;

    .line 21
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance p3, Ll/ۨۧۘ;

    invoke-direct {p3, v1}, Ll/ۨۧۘ;-><init>(Ll/ۢۧۘ;)V

    new-instance p4, Ll/۟ۧۘ;

    iget-object v3, p0, Ll/᩻ۧۘ;->ۧ֫:Ll/᩶ۧۘ;

    invoke-direct {p4, v0, v3}, Ll/۟ۧۘ;-><init>(Ll/᩹ۧۘ;Ll/᩶ۧۘ;)V

    new-instance v0, Ll/ۛۧۘ;

    iget-object v3, p0, Ll/᩻ۧۘ;->ܰ:Ll/᩸ۧۘ;

    invoke-direct {v0, v3}, Ll/ۛۧۘ;-><init>(Ll/᩸ۧۘ;)V

    new-instance v3, Ll/۫ۧۘ;

    invoke-direct {v3, v1}, Ll/۫ۧۘ;-><init>(Ll/ۢۧۘ;)V

    new-instance v4, Ll/ܰۧۘ;

    invoke-direct {v4, v2, v1}, Ll/ܰۧۘ;-><init>(Ll/۟ۛۖ;Ll/ۢۧۘ;)V

    new-instance v1, Ll/۬ۧۘ;

    .line 21
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v2, Ll/ۗۧۘ;

    invoke-direct {v2}, Ll/ۗۧۘ;-><init>()V

    .line 135
    invoke-virtual {v1, v2}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 134
    invoke-virtual {v4, v1}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 133
    invoke-virtual {v3, v4}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 132
    invoke-virtual {v0, v3}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 131
    invoke-virtual {p4, v0}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 130
    invoke-virtual {p3, p4}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 129
    invoke-virtual {p2, p3}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    .line 128
    invoke-virtual {p1, p2}, Ll/ۙۧۘ;->֫(Ll/ۙۧۘ;)V

    iput-object p1, p0, Ll/᩻ۧۘ;->ۛ:Ll/֫ܽۘ;

    return-void
.end method

.method public static bridge synthetic ֡()Ll/֫᩻֨;
    .locals 1

    .line 0
    sget-object v0, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/᩻ۧۘ;)Ll/ܿܽۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->᩹:Ll/ܿܽۘ;

    return-object p0
.end method

.method private ֫(Ll/᩻ܽۘ;)V
    .locals 2
    .annotation runtime Lnet/engio/mbassy/listener/Handler;
    .end annotation

    .line 416
    invoke-virtual {p1}, Ll/ܳܽۘ;->֫()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۧۘ;->֫֫:Ll/᩹ۧۘ;

    invoke-virtual {v1, v0}, Ll/᩹ۧۘ;->ۧ(Ljava/lang/Long;)V

    .line 417
    invoke-virtual {p1}, Ll/ܳܽۘ;->֫()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sget-object v0, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    const-string v1, "Session << {} >> logged off"

    invoke-interface {v0, p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩻ۧۘ;)Ll/ۙ֫ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->ۙ:Ll/ۙ֫ۘ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/᩻ۧۘ;)Ll/᩹ۧۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->֫֫:Ll/᩹ۧۘ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩻ۧۘ;)Ll/ۜۧۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩻ۧۘ;)Ll/ۘܽۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->ۨ:Ll/ۘܽۘ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩻ۧۘ;)Ll/ܺۧۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->۬:Ll/ܺۧۘ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩻ۧۘ;)Ll/᩶ۧۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۧۘ;->ۧ֫:Ll/᩶ۧۘ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 167
    invoke-virtual {p0, v0}, Ll/᩻ۧۘ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;
    .locals 13

    .line 232
    iget-object v0, p0, Ll/᩻ۧۘ;->ܰ:Ll/᩸ۧۘ;

    .line 235
    invoke-virtual {p1}, Ll/ܽۨۖ;->ܳ()Ll/ܽۨۖ;

    move-result-object v1

    instance-of v1, v1, Ll/۠ۨۖ;

    if-nez v1, :cond_4

    .line 243
    iget-object v1, p0, Ll/᩻ۧۘ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 248
    :try_start_0
    invoke-virtual {v0}, Ll/᩸ۧۘ;->֫()I

    move-result v2

    .line 318
    invoke-virtual {p1}, Ll/ܽۨۖ;->ܿ()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    const/high16 v5, 0x10000

    .line 341
    div-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    add-int/2addr v3, v4

    .line 320
    sget-object v5, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    if-le v3, v4, :cond_0

    :try_start_1
    iget-object v6, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v6}, Ll/ۜۧۘ;->ܺ()Z

    move-result v6

    if-nez v6, :cond_0

    const-string v3, "Connection to {} does not support multi-credit requests."

    .line 321
    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-ge v3, v2, :cond_1

    goto :goto_1

    :cond_1
    if-le v3, v4, :cond_2

    if-le v2, v4, :cond_2

    add-int/lit8 v3, v2, -0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 141
    :goto_1
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v6

    check-cast v6, Ll/᩻ۨۖ;

    invoke-virtual {v6, v3}, Ll/᩻ۨۖ;->֫(I)V

    if-nez v2, :cond_3

    const-string v6, "There are no credits left to send {}, will block until there are more credits available."

    .line 253
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v7

    check-cast v7, Ll/᩻ۨۖ;

    invoke-virtual {v7}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v7

    .line 251
    invoke-interface {v5, v7, v6}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 258
    :cond_3
    :try_start_2
    invoke-virtual {v0, v3}, Ll/᩸ۧۘ;->ۧ(I)[J

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    :try_start_3
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v6

    check-cast v6, Ll/᩻ۨۖ;

    const/4 v7, 0x0

    aget-wide v8, v0, v7

    invoke-virtual {v6, v8, v9}, Ll/᩻ۨۖ;->ۧ(J)V

    .line 274
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    rsub-int v6, v2, 0x200

    sub-int/2addr v6, v3

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v0, v6}, Ll/᩻ۨۖ;->ۧ(I)V

    const-string v0, "Granted {} (out of {}) credits to {}"

    .line 276
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v7

    aput-object v2, v6, v4

    const/4 v2, 0x2

    aput-object p1, v6, v2

    invoke-interface {v5, v0, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 278
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 287
    new-instance v0, Ll/ᩴۧۘ;

    invoke-virtual {p1}, Ll/ܽۨۖ;->ܳ()Ll/ܽۨۖ;

    move-result-object v8

    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    move-object v7, v0

    move v12, p2

    invoke-direct/range {v7 .. v12}, Ll/ᩴۧۘ;-><init>(Ll/֨֫ۘ;JLjava/util/UUID;Z)V

    .line 289
    iget-object p2, p0, Ll/᩻ۧۘ;->ۤ:Ll/ۢۧۘ;

    invoke-virtual {p2, v0}, Ll/ۢۧۘ;->֫(Ll/ᩴۧۘ;)V

    .line 290
    new-instance p2, Ll/ܿۧۘ;

    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ۢ()J

    move-result-wide v1

    invoke-direct {p2, p0, v0, v1, v2}, Ll/ܿۧۘ;-><init>(Ll/᩻ۧۘ;Ll/ᩴۧۘ;J)V

    invoke-virtual {v0, p2}, Ll/ᩴۧۘ;->֫(Ll/֫۟ۖ;)Ll/ۧ۟ۖ;

    move-result-object p2

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 265
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    .line 278
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 279
    throw p1

    :cond_4
    const/4 p2, 0x0

    .line 296
    :goto_2
    iget-object v0, p0, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    invoke-virtual {v0, p1}, Ll/֨ᩳۘ;->֫(Ll/֨֫ۘ;)V

    return-object p2
.end method

.method public final ֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;
    .locals 3

    .line 209
    new-instance v0, Ll/ܶۧۘ;

    new-instance v1, Ll/ᩳۧۘ;

    invoke-direct {v1, p0}, Ll/ᩳۧۘ;-><init>(Ll/᩻ۧۘ;)V

    iget-object v2, p0, Ll/᩻ۧۘ;->ۙ:Ll/ۙ֫ۘ;

    invoke-direct {v0, p0, v2, v1}, Ll/ܶۧۘ;-><init>(Ll/᩻ۧۘ;Ll/ۙ֫ۘ;Ll/۠ۧۘ;)V

    .line 214
    invoke-virtual {v0, p1}, Ll/ܶۧۘ;->֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽۨۖ;)Ll/ܽۨۖ;
    .locals 3

    const/4 v0, 0x0

    .line 225
    invoke-virtual {p0, p1, v0}, Ll/᩻ۧۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object p1

    .line 312
    iget-object v0, p0, Ll/᩻ۧۘ;->ۙ:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v2, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {v0, v1, p1}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۨۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۖ۟ۖ;)V
    .locals 3

    .line 385
    iget-object v0, p0, Ll/᩻ۧۘ;->ۤ:Ll/ۢۧۘ;

    invoke-virtual {v0, p1}, Ll/ۢۧۘ;->֫(Ll/ۖ۟ۖ;)V

    const/4 p1, 0x0

    .line 167
    :try_start_0
    invoke-virtual {p0, p1}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 389
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "{} while closing connection on error, ignoring: {}"

    .line 390
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v2, v1, v0, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۚܰۖ;)V
    .locals 1

    .line 77
    check-cast p1, Ll/۠֫ۘ;

    .line 374
    iget-object v0, p0, Ll/᩻ۧۘ;->ۛ:Ll/֫ܽۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 9

    if-nez p1, :cond_0

    .line 183
    invoke-virtual {p0}, Ll/ܰ֫ۘ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Ll/᩻ۧۘ;->᩹:Ll/ܿܽۘ;

    const-string v1, "Closed connection to {}"

    iget-object v2, p0, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    sget-object v3, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    if-nez p1, :cond_1

    .line 188
    :try_start_0
    iget-object p1, p0, Ll/᩻ۧۘ;->֫֫:Ll/᩹ۧۘ;

    invoke-virtual {p1}, Ll/᩹ۧۘ;->֫()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܽۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    :try_start_1
    invoke-virtual {v4}, Ll/ܶܽۘ;->᩻()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_2
    const-string v6, "Exception while closing session {}"

    .line 192
    invoke-virtual {v4}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v6, v4, v5}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 197
    invoke-virtual {v2}, Ll/֨ᩳۘ;->֫()V

    .line 198
    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    new-instance v1, Ll/ۧܽۘ;

    iget-object v2, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v2}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v3}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡ܽۘ;->ۧ()I

    move-result v3

    invoke-direct {v1, v2, v3}, Ll/ۧܽۘ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    .line 200
    throw p1

    .line 197
    :cond_1
    invoke-virtual {v2}, Ll/֨ᩳۘ;->֫()V

    .line 198
    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    new-instance p1, Ll/ۧܽۘ;

    iget-object v1, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v1}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v2}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡ܽۘ;->ۧ()I

    move-result v2

    invoke-direct {p1, v1, v2}, Ll/ۧܽۘ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p1}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    return-void
.end method

.method public final ۖ()Ll/᩹ۧۘ;
    .locals 1

    .line 482
    iget-object v0, p0, Ll/᩻ۧۘ;->᩺:Ll/᩹ۧۘ;

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 395
    iget-object v0, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v0}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ll/᩷ۧۘ;
    .locals 1

    .line 350
    iget-object v0, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {v0}, Ll/ۜۧۘ;->ܳ()Ll/᩷ۧۘ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 3

    .line 399
    iget-object v0, p0, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    invoke-virtual {v0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 152
    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-direct {v1, p2, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ll/֨ᩳۘ;->֫(Ljava/net/InetSocketAddress;)V

    .line 153
    new-instance v0, Ll/ۜۧۘ;

    iget-object v1, p0, Ll/᩻ۧۘ;->ۙ:Ll/ۙ֫ۘ;

    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ۧ()Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v0, v2, p2, p1, v1}, Ll/ۜۧۘ;-><init>(Ljava/util/UUID;Ljava/lang/String;ILl/ۙ֫ۘ;)V

    iput-object v0, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    .line 154
    new-instance p1, Ll/ۚۧۘ;

    iget-object p2, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-direct {p1, p0, v1, p2}, Ll/ۚۧۘ;-><init>(Ll/᩻ۧۘ;Ll/ۙ֫ۘ;Ll/ۜۧۘ;)V

    invoke-virtual {p1}, Ll/ۚۧۘ;->֫()V

    .line 155
    iget-object p1, p0, Ll/᩻ۧۘ;->۬:Ll/ܺۧۘ;

    iget-object p2, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    invoke-virtual {p1, p2}, Ll/ܺۧۘ;->֫(Ll/ۜۧۘ;)V

    .line 157
    new-instance p1, Ll/᩵ܽۘ;

    invoke-direct {p1}, Ll/᩵ܽۘ;-><init>()V

    iput-object p1, p0, Ll/᩻ۧۘ;->ۨ:Ll/ۘܽۘ;

    const-string p1, "Successfully connected to: {}"

    .line 162
    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ll/᩻ۧۘ;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v0, p2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 150
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object p2

    const-string v0, "This connection is already connected to "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 150
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()Ll/᩹֫ۘ;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/᩻ۧۘ;->᩶:Ll/᩹֫ۘ;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 410
    iget-object v0, p0, Ll/᩻ۧۘ;->ܰ:Ll/᩸ۧۘ;

    invoke-virtual {v0}, Ll/᩸ۧۘ;->֫()I

    move-result v0

    return v0
.end method

.method public final ᩴ()Ll/᩹ۧۘ;
    .locals 1

    .line 478
    iget-object v0, p0, Ll/᩻ۧۘ;->֫֫:Ll/᩹ۧۘ;

    return-object v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 399
    iget-object v0, p0, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    invoke-virtual {v0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ۜۧۘ;
    .locals 1

    .line 403
    iget-object v0, p0, Ll/᩻ۧۘ;->ۗ:Ll/ۜۧۘ;

    return-object v0
.end method
