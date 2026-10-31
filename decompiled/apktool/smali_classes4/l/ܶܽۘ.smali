.class public final Ll/ܶܽۘ;
.super Ljava/lang/Object;
.source "HAFC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۟:Ll/֫᩻֨;


# instance fields
.field public ۗ:Ljava/util/HashMap;

.field public ۙ:Ll/ܺۧۘ;

.field public ۛ:J

.field public ۤ:Ll/᩸ܽۘ;

.field public ۨ:Ll/᩶ۧۘ;

.field public final ۫:Ll/ۘܽۘ;

.field public ۬:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public ܰ:Ll/ۗ֫ۘ;

.field public ᩶:Ll/᩻ۧۘ;

.field public ᩸:Ll/ܿܽۘ;

.field public final ᩹:Ll/ۙ֫ۘ;

.field public ᩺:Ll/᩹ܽۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 68
    const-class v0, Ll/ܶܽۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܶܽۘ;->۟:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/᩻ۧۘ;Ll/ۙ֫ۘ;Ll/ۗ֫ۘ;Ll/ܿܽۘ;Ll/ۘܽۘ;Ll/᩶ۧۘ;Ll/ܺۧۘ;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ll/᩹ܽۘ;

    invoke-direct {v0}, Ll/᩹ܽۘ;-><init>()V

    iput-object v0, p0, Ll/ܶܽۘ;->᩺:Ll/᩹ܽۘ;

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶܽۘ;->ۗ:Ljava/util/HashMap;

    .line 79
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ܶܽۘ;->۬:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 84
    iput-object p1, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    .line 85
    iput-object p2, p0, Ll/ܶܽۘ;->᩹:Ll/ۙ֫ۘ;

    .line 86
    iput-object p3, p0, Ll/ܶܽۘ;->ܰ:Ll/ۗ֫ۘ;

    .line 87
    iput-object p4, p0, Ll/ܶܽۘ;->᩸:Ll/ܿܽۘ;

    .line 88
    iput-object p5, p0, Ll/ܶܽۘ;->۫:Ll/ۘܽۘ;

    .line 89
    iput-object p6, p0, Ll/ܶܽۘ;->ۨ:Ll/᩶ۧۘ;

    .line 90
    new-instance p1, Ll/᩸ܽۘ;

    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Ll/ܶܽۘ;->ۤ:Ll/᩸ܽۘ;

    .line 91
    iput-object p7, p0, Ll/ܶܽۘ;->ۙ:Ll/ܺۧۘ;

    if-eqz p4, :cond_0

    .line 93
    invoke-virtual {p4, p0}, Ll/ܿܽۘ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/ۜܽۘ;)V
    .locals 5
    .annotation runtime Lnet/engio/mbassy/listener/Handler;
    .end annotation

    .line 236
    invoke-virtual {p1}, Ll/ܳܽۘ;->֫()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ܶܽۘ;->ۛ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 237
    invoke-virtual {p1}, Ll/ۜܽۘ;->ۧ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ll/ܶܽۘ;->۟:Ll/֫᩻֨;

    const-string v2, "Notified of TreeDisconnected <<{}>>"

    invoke-interface {v1, v0, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Ll/ܶܽۘ;->᩺:Ll/᩹ܽۘ;

    invoke-virtual {p1}, Ll/ۜܽۘ;->ۧ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩹ܽۘ;->֫(J)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۜ()Ll/֫᩻֨;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶܽۘ;->۟:Ll/֫᩻֨;

    return-object v0
.end method

.method private ۧ(Ll/ܽۧۘ;)Ll/ܶܽۘ;
    .locals 7

    .line 294
    :try_start_0
    iget-object v0, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    .line 225
    invoke-virtual {v0}, Ll/᩻ۧۘ;->ܳ()Ll/᩹֫ۘ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩹֫ۘ;->֫(Ljava/lang/String;)Ll/᩻ۧۘ;

    move-result-object v0

    .line 419
    iget-object v1, p0, Ll/ܶܽۘ;->ܰ:Ll/ۗ֫ۘ;

    .line 226
    invoke-virtual {v0, v1}, Ll/᩻ۧۘ;->֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object v6, v0

    .line 228
    new-instance v0, Ll/֨ۨۖ;

    sget-object v1, Ll/۟۫ۖ;->ۡۧ:Ll/۟۫ۖ;

    invoke-virtual {v1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    sget-object v4, Ll/᩺ۛۖ;->ܰ:Ll/᩺ۛۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "Could not connect to DFS root "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֨ۨۖ;-><init>(JLl/᩺ۛۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 290
    invoke-virtual {p0}, Ll/ܶܽۘ;->᩻()V

    return-void
.end method

.method public final ֫(Ll/᩻ۨۖ;Z)Ljavax/crypto/SecretKey;
    .locals 4

    .line 346
    iget-object v0, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    invoke-virtual {v0}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    iget-object v1, p0, Ll/ܶܽۘ;->ۤ:Ll/᩸ܽۘ;

    if-eqz v0, :cond_2

    .line 347
    invoke-virtual {p1}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v0

    sget-object v2, Ll/᩺ۛۖ;->ᩳ֫:Ll/᩺ۛۖ;

    if-ne v0, v2, :cond_1

    if-eqz p2, :cond_0

    .line 349
    invoke-virtual {v1}, Ll/᩸ܽۘ;->ܿ()Ljavax/crypto/SecretKey;

    move-result-object p1

    return-object p1

    .line 351
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide p1

    sget-object v0, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    .line 352
    invoke-virtual {v1}, Ll/᩸ܽۘ;->ܿ()Ljavax/crypto/SecretKey;

    move-result-object p1

    return-object p1

    .line 355
    :cond_1
    invoke-virtual {v1}, Ll/᩸ܽۘ;->ܿ()Ljavax/crypto/SecretKey;

    move-result-object p1

    return-object p1

    .line 358
    :cond_2
    invoke-virtual {v1}, Ll/᩸ܽۘ;->ᩳ()Ljavax/crypto/spec/SecretKeySpec;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۖᩳۘ;
    .locals 17

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    const-string v1, "\\"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 119
    iget-object v13, v12, Ll/ܶܽۘ;->᩺:Ll/᩹ܽۘ;

    invoke-virtual {v13, v0}, Ll/᩹ܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object v1

    .line 120
    sget-object v2, Ll/ܶܽۘ;->۟:Ll/֫᩻֨;

    if-eqz v1, :cond_0

    const-string v3, "Returning cached Share {} for {}"

    .line 121
    invoke-interface {v2, v3, v1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 129
    :cond_0
    iget-object v14, v12, Ll/ܶܽۘ;->۫:Ll/ۘܽۘ;

    const-string v1, "Could not connect to "

    iget-object v3, v12, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    invoke-virtual {v3}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object v4

    .line 130
    new-instance v15, Ll/ܽۧۘ;

    const/4 v5, 0x0

    .line 31
    invoke-direct {v15, v4, v0, v5}, Ll/ܽۧۘ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-wide v4, v12, Ll/ܶܽۘ;->ۛ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v4, "Connecting to {} on session {}"

    invoke-interface {v2, v4, v15, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    :try_start_0
    new-instance v0, Ll/ۡ᩺ۖ;

    invoke-virtual {v3}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v4

    iget-wide v5, v12, Ll/ܶܽۘ;->ۛ:J

    invoke-direct {v0, v4, v15, v5, v6}, Ll/ۡ᩺ۖ;-><init>(Ll/᩹ۛۖ;Ll/ܽۧۘ;J)V

    .line 134
    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v4

    check-cast v4, Ll/᩻ۨۖ;

    const/16 v5, 0x100

    invoke-virtual {v4, v5}, Ll/᩻ۨۖ;->ۧ(I)V

    const/4 v4, 0x0

    .line 305
    invoke-virtual {v12, v0, v4}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object v0

    .line 136
    iget-object v4, v12, Ll/ܶܽۘ;->᩹:Ll/ۙ֫ۘ;

    invoke-virtual {v4}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {v4, v5, v0}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ᩺ۖ;
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_1

    .line 138
    :try_start_1
    new-instance v4, Ll/۠ܽۘ;

    invoke-direct {v4, v12, v15}, Ll/۠ܽۘ;-><init>(Ll/ܶܽۘ;Ll/ܽۧۘ;)V

    invoke-interface {v14, v12, v0, v15, v4}, Ll/ۘܽۘ;->֫(Ll/ܶܽۘ;Ll/ܽۨۖ;Ll/ܽۧۘ;Ll/ۖܽۘ;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖᩳۘ;
    :try_end_1
    .catch Ll/ܺܽۘ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/ۖ۟ۖ; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v4, :cond_1

    return-object v4

    .line 160
    :catch_0
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v4

    check-cast v4, Ll/᩻ۨۖ;

    invoke-virtual {v4}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/۟۫ۖ;->֫(J)Z

    move-result v4

    if-nez v4, :cond_6

    .line 165
    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ۜ()Ljava/util/Set;

    move-result-object v1

    sget-object v2, Ll/᩷ۨۖ;->᩶:Ll/᩷ۨۖ;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 169
    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ܺ()J

    move-result-wide v4

    .line 170
    new-instance v11, Ll/᩵ᩳۘ;

    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ۜ()Ljava/util/Set;

    move-result-object v1

    iget-object v7, v12, Ll/ܶܽۘ;->᩹:Ll/ۙ֫ۘ;

    invoke-virtual {v3}, Ll/᩻ۧۘ;->᩻()Ll/ۜۧۘ;

    move-result-object v8

    iget-object v9, v12, Ll/ܶܽۘ;->᩸:Ll/ܿܽۘ;

    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->᩷()Ljava/util/EnumSet;

    move-result-object v10

    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ۢ()Ljava/util/EnumSet;

    move-result-object v16

    move-object v6, v1

    check-cast v6, Ljava/util/EnumSet;

    move-object v1, v11

    move-wide v2, v4

    move-object v4, v15

    move-object/from16 v5, p0

    move-object v12, v11

    move-object/from16 v11, v16

    invoke-direct/range {v1 .. v11}, Ll/᩵ᩳۘ;-><init>(JLl/ܽۧۘ;Ll/ܶܽۘ;Ljava/util/EnumSet;Ll/ۙ֫ۘ;Ll/ۜۧۘ;Ll/ܿܽۘ;Ljava/util/EnumSet;Ljava/util/EnumSet;)V

    .line 173
    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 174
    new-instance v0, Ll/ܰܽۘ;

    invoke-direct {v0, v15, v12, v14}, Ll/ܰܽۘ;-><init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;Ll/ۘܽۘ;)V

    goto :goto_0

    .line 175
    :cond_2
    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 176
    new-instance v0, Ll/ᩳᩳۘ;

    invoke-direct {v0, v15, v12}, Ll/ᩳᩳۘ;-><init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;)V

    goto :goto_0

    .line 177
    :cond_3
    invoke-virtual {v0}, Ll/ܺ᩺ۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 178
    new-instance v0, Ll/ܿᩳۘ;

    invoke-direct {v0, v15, v12}, Ll/ܿᩳۘ;-><init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;)V

    .line 183
    :goto_0
    invoke-virtual {v13, v0}, Ll/᩹ܽۘ;->֫(Ll/ۖᩳۘ;)V

    return-object v0

    .line 180
    :cond_4
    new-instance v0, Ll/ۧۧۘ;

    const-string v1, "Unknown ShareType returned in the TREE_CONNECT Response"

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 180
    throw v0

    .line 166
    :cond_5
    new-instance v0, Ll/ۧۧۘ;

    const-string v1, "ASYMMETRIC capability unsupported"

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 166
    throw v0

    .line 161
    :cond_6
    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 162
    new-instance v2, Ll/֨ۨۖ;

    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catch Ll/ۖ۟ۖ; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    .line 186
    new-instance v1, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 186
    throw v1

    .line 117
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Share name ("

    const-string v3, ") cannot contain \'\\\' characters."

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;
    .locals 8

    .line 312
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ll/ܶܽۘ;->֫(Ll/᩻ۨۖ;Z)Ljavax/crypto/SecretKey;

    move-result-object v0

    .line 313
    iget-object v2, p0, Ll/ܶܽۘ;->ۤ:Ll/᩸ܽۘ;

    invoke-virtual {v2}, Ll/᩸ܽۘ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 314
    :cond_0
    new-instance p1, Ll/ۖ۟ۖ;

    const-string p2, "Message signing is required, but no signing key is negotiated"

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 314
    throw p1

    .line 384
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->ܺ()J

    move-result-wide v3

    .line 410
    iget-object v5, p0, Ll/ܶܽۘ;->᩺:Ll/᩹ܽۘ;

    invoke-virtual {v5, v3, v4}, Ll/᩹ܽۘ;->ۧ(J)Ll/ۖᩳۘ;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 411
    invoke-virtual {v3}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩵ᩳۘ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 385
    :goto_1
    iget-object v5, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    invoke-virtual {v5}, Ll/᩻ۧۘ;->᩻()Ll/ۜۧۘ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۜۧۘ;->֫()Z

    move-result v6

    .line 395
    invoke-virtual {v2}, Ll/᩸ܽۘ;->ܳ()Z

    move-result v7

    if-nez v7, :cond_3

    if-nez v3, :cond_3

    if-eqz p2, :cond_4

    .line 396
    :cond_3
    invoke-virtual {v2}, Ll/᩸ܽۘ;->ۧ()Ljavax/crypto/SecretKey;

    move-result-object v7

    if-eqz v7, :cond_9

    .line 400
    :cond_4
    invoke-virtual {v2}, Ll/᩸ܽۘ;->ܳ()Z

    move-result v7

    if-nez v7, :cond_6

    if-nez v3, :cond_6

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 p2, 0x1

    .line 401
    :goto_3
    invoke-virtual {v2}, Ll/᩸ܽۘ;->ۧ()Ljavax/crypto/SecretKey;

    move-result-object v3

    if-eqz v3, :cond_7

    if-eqz v6, :cond_7

    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    or-int/2addr p2, v3

    if-eqz p2, :cond_8

    .line 319
    iget-object p2, p0, Ll/ܶܽۘ;->ۙ:Ll/ܺۧۘ;

    invoke-virtual {v2}, Ll/᩸ܽۘ;->ۧ()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ll/ܺۧۘ;->֫(Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)Ll/ܽۨۖ;

    move-result-object p1

    invoke-virtual {v5, p1, v1}, Ll/᩻ۧۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object p1

    return-object p1

    .line 322
    :cond_8
    iget-object p2, p0, Ll/ܶܽۘ;->ۨ:Ll/᩶ۧۘ;

    invoke-interface {p2, p1, v0}, Ll/᩶ۧۘ;->֫(Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)Ll/ܽۨۖ;

    move-result-object p1

    invoke-virtual {v5, p1, v4}, Ll/᩻ۧۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object p1

    return-object p1

    .line 397
    :cond_9
    new-instance p1, Ll/ۖ۟ۖ;

    const-string p2, "Message encryption is required, but no encryption key is negotiated"

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 397
    throw p1
.end method

.method public final ֫(Ll/ܽۧۘ;)Ll/ܶܽۘ;
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ܶܽۘ;->ۗ:Ljava/util/HashMap;

    iget-object v1, p0, Ll/ܶܽۘ;->۬:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 193
    :try_start_0
    invoke-virtual {p1}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܽۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    .line 198
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object v2

    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 202
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 205
    :try_start_1
    invoke-virtual {p1}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܽۘ;

    if-nez v2, :cond_1

    .line 208
    invoke-direct {p0, p1}, Ll/ܶܽۘ;->ۧ(Ll/ܽۧۘ;)Ll/ܶܽۘ;

    move-result-object v2

    .line 209
    invoke-virtual {p1}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 219
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object v2

    :catchall_0
    move-exception p1

    .line 213
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 214
    throw p1

    :catchall_1
    move-exception p1

    .line 198
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 199
    throw p1
.end method

.method public final ֫()Ll/᩻ۧۘ;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    return-object v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 102
    iput-wide p1, p0, Ll/ܶܽۘ;->ۛ:J

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 277
    iget-object v0, p0, Ll/ܶܽۘ;->ۤ:Ll/᩸ܽۘ;

    invoke-virtual {v0}, Ll/᩸ܽۘ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/᩸ܽۘ;
    .locals 1

    .line 415
    iget-object v0, p0, Ll/ܶܽۘ;->ۤ:Ll/᩸ܽۘ;

    return-object v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 98
    iget-wide v0, p0, Ll/ܶܽۘ;->ۛ:J

    return-wide v0
.end method

.method public final ᩻()V
    .locals 10

    .line 244
    iget-object v0, p0, Ll/ܶܽۘ;->᩸:Ll/ܿܽۘ;

    iget-object v1, p0, Ll/ܶܽۘ;->᩶:Ll/᩻ۧۘ;

    iget-object v2, p0, Ll/ܶܽۘ;->۬:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    sget-object v3, Ll/ܶܽۘ;->۟:Ll/֫᩻֨;

    :try_start_0
    const-string v4, "Logging off session {} from host {}"

    iget-wide v5, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 245
    iget-object v4, p0, Ll/ܶܽۘ;->᩺:Ll/᩹ܽۘ;

    invoke-virtual {v4}, Ll/᩹ܽۘ;->֫()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖᩳۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 247
    :try_start_1
    invoke-virtual {v5}, Ll/ۖᩳۘ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v6

    :try_start_2
    const-string v7, "Caught exception while closing TreeConnect with id: {}"

    .line 249
    invoke-virtual {v5}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v7, v5, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 255
    :try_start_3
    iget-object v4, p0, Ll/ܶܽۘ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶܽۘ;

    const-string v6, "Logging off nested session {} for session {}"

    .line 98
    iget-wide v7, v5, Ll/ܶܽۘ;->ۛ:J

    .line 256
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-wide v8, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v3, v6, v7, v8}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 258
    :try_start_4
    invoke-virtual {v5}, Ll/ܶܽۘ;->᩻()V
    :try_end_4
    .catch Ll/ۖ۟ۖ; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_5
    const-string v6, "Caught exception while logging off nested session {}"

    .line 98
    iget-wide v7, v5, Ll/ܶܽۘ;->ۛ:J

    .line 260
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v5, v6}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 264
    :cond_1
    :try_start_6
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 266
    new-instance v2, Ll/ۛۨۖ;

    invoke-virtual {v1}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v1

    iget-wide v3, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-direct {v2, v1, v3, v4}, Ll/ۛۨۖ;-><init>(Ll/᩹ۛۖ;J)V

    const/4 v1, 0x0

    .line 305
    invoke-virtual {p0, v2, v1}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object v1

    .line 267
    iget-object v2, p0, Ll/ܶܽۘ;->᩹:Ll/ۙ֫ۘ;

    invoke-virtual {v2}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v4, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {v2, v3, v1}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۨۖ;

    .line 268
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۟۫ۖ;->ܽ(J)Z

    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v2, :cond_2

    .line 272
    new-instance v1, Ll/᩻ܽۘ;

    iget-wide v2, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-direct {v1, v2, v3}, Ll/᩻ܽۘ;-><init>(J)V

    invoke-virtual {v0, v1}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    return-void

    .line 269
    :cond_2
    :try_start_7
    new-instance v2, Ll/֨ۨۖ;

    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not logoff session <<"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ">>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v1

    .line 264
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 265
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v1

    .line 272
    new-instance v2, Ll/᩻ܽۘ;

    iget-wide v3, p0, Ll/ܶܽۘ;->ۛ:J

    invoke-direct {v2, v3, v4}, Ll/᩻ܽۘ;-><init>(J)V

    invoke-virtual {v0, v2}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    .line 273
    throw v1
.end method
