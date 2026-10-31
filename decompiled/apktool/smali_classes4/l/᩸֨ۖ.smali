.class public final Ll/᩸֨ۖ;
.super Ljava/lang/Object;
.source "59PE"


# static fields
.field public static final ֫:J

.field public static final ۜ:Lsun/misc/Unsafe;

.field public static final ۧ:J

.field public static final ܳ:Ll/ܶ֨ۖ;

.field public static final ܽ:Z

.field public static final ܿ:Z

.field public static final ᩳ:Z

.field public static final ᩻:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 21
    invoke-static {}, Ll/᩸֨ۖ;->ܽ()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Ll/᩸֨ۖ;->ۜ:Lsun/misc/Unsafe;

    .line 22
    invoke-static {}, Ll/֡ۜۖ;->֫()Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Ll/᩸֨ۖ;->᩻:Ljava/lang/Class;

    .line 23
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Ll/᩸֨ۖ;->ᩳ(Ljava/lang/Class;)Z

    move-result v1

    .line 24
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Ll/᩸֨ۖ;->ᩳ(Ljava/lang/Class;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 299
    :cond_0
    invoke-static {}, Ll/֡ۜۖ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_1

    .line 301
    new-instance v3, Ll/֨֨ۖ;

    .line 730
    invoke-direct {v3, v0}, Ll/ܶ֨ۖ;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_3

    .line 303
    new-instance v3, Ll/ۚ֨ۖ;

    .line 855
    invoke-direct {v3, v0}, Ll/ܶ֨ۖ;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    .line 309
    :cond_2
    new-instance v3, Ll/۠֨ۖ;

    .line 590
    invoke-direct {v3, v0}, Ll/ܶ֨ۖ;-><init>(Lsun/misc/Unsafe;)V

    .line 25
    :cond_3
    :goto_0
    sput-object v3, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    const/4 v0, 0x0

    if-nez v3, :cond_4

    const/4 v1, 0x0

    goto :goto_1

    .line 323
    :cond_4
    invoke-virtual {v3}, Ll/ܶ֨ۖ;->ۧ()Z

    move-result v1

    .line 27
    :goto_1
    sput-boolean v1, Ll/᩸֨ۖ;->ᩳ:Z

    if-nez v3, :cond_5

    const/4 v1, 0x0

    goto :goto_2

    .line 316
    :cond_5
    invoke-virtual {v3}, Ll/ܶ֨ۖ;->֫()Z

    move-result v1

    .line 28
    :goto_2
    sput-boolean v1, Ll/᩸֨ۖ;->ܽ:Z

    .line 30
    const-class v1, [B

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, Ll/᩸֨ۖ;->ۧ:J

    .line 34
    const-class v1, [Z

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 35
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 37
    const-class v1, [I

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 38
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 40
    const-class v1, [J

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 41
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 43
    const-class v1, [F

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 44
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 46
    const-class v1, [D

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 47
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 49
    const-class v1, [Ljava/lang/Object;

    invoke-static {v1}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Class;)I

    .line 50
    invoke-static {v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Class;)V

    .line 52
    invoke-static {}, Ll/᩸֨ۖ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_7

    if-nez v3, :cond_6

    goto :goto_3

    .line 439
    :cond_6
    invoke-virtual {v3, v1}, Ll/ܶ֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    goto :goto_4

    :cond_7
    :goto_3
    const-wide/16 v1, -0x1

    .line 52
    :goto_4
    sput-wide v1, Ll/᩸֨ۖ;->֫:J

    .line 59
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v1, v2, :cond_8

    const/4 v0, 0x1

    :cond_8
    sput-boolean v0, Ll/᩸֨ۖ;->ܿ:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(J)B
    .locals 1

    .line 231
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1}, Ll/ܶ֨ۖ;->֫(J)B

    move-result p0

    return p0
.end method

.method public static ֫(JLjava/lang/Object;)B
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p0

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p2}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p2

    not-long p0, p0

    const-wide/16 v0, 0x3

    and-long/2addr p0, v0

    const/4 v0, 0x3

    shl-long/2addr p0, v0

    long-to-int p1, p0

    ushr-int p0, p2, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static ֫(J[B)B
    .locals 2

    .line 153
    sget-wide v0, Ll/᩸֨ۖ;->ۧ:J

    add-long/2addr v0, p0

    sget-object p0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {p0, v0, v1, p2}, Ll/ܶ֨ۖ;->ۧ(JLjava/lang/Object;)B

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/nio/ByteBuffer;)J
    .locals 3

    .line 256
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    sget-wide v1, Ll/᩸֨ۖ;->֫:J

    invoke-virtual {v0, v1, v2, p0}, Ll/ܶ֨ۖ;->ܳ(JLjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 78
    :try_start_0
    sget-object v0, Ll/᩸֨ۖ;->ۜ:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 80
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    .line 260
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0}, Ll/ܶ֨ۖ;->֫(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫()Ljava/lang/reflect/Field;
    .locals 1

    .line 20
    invoke-static {}, Ll/᩸֨ۖ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(IJLjava/lang/Object;)V
    .locals 1

    .line 109
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ܶ֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method public static ֫(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 149
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ܶ֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(J[BJJ)V
    .locals 8

    .line 223
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    move-wide v1, p0

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v0 .. v7}, Ll/ܶ֨ۖ;->֫(J[BJJ)V

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Object;JB)V
    .locals 0

    .line 20
    invoke-static {p0, p1, p2, p3}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;JD)V
    .locals 6

    .line 141
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JD)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;JF)V
    .locals 1

    .line 133
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JF)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;JJ)V
    .locals 6

    .line 117
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;JZ)V
    .locals 0

    int-to-byte p3, p3

    .line 1000
    invoke-static {p0, p1, p2, p3}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static ֫(Ljava/lang/Throwable;)V
    .locals 4

    .line 1008
    const-class v0, Ll/᩸֨ۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "platform method missing - proto runtime falling back to safer methods: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1009
    invoke-virtual {v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫([BJB)V
    .locals 2

    .line 157
    sget-wide v0, Ll/᩸֨ۖ;->ۧ:J

    add-long/2addr v0, p1

    sget-object p1, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {p1, p0, v0, v1, p3}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static ۜ(JLjava/lang/Object;)I
    .locals 1

    .line 105
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static ۢ(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 145
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->᩻(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(JLjava/lang/Object;)B
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p0

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p2}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p2

    const-wide/16 v0, 0x3

    and-long/2addr p0, v0

    const/4 v0, 0x3

    shl-long/2addr p0, v0

    long-to-int p1, p0

    ushr-int p0, p2, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static ۧ(Ljava/lang/Class;)I
    .locals 1

    .line 89
    sget-boolean v0, Ll/᩸֨ۖ;->ܽ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/reflect/Field;)J
    .locals 2

    .line 85
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0}, Ll/ܶ֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۧ()Ljava/lang/reflect/Field;
    .locals 4

    .line 348
    invoke-static {}, Ll/֡ۜۖ;->ۧ()Z

    move-result v0

    const-class v1, Ljava/nio/Buffer;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string v0, "effectiveDirectAddress"

    .line 448
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "address"

    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_1

    .line 357
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v3, :cond_1

    move-object v2, v0

    :cond_1
    return-object v2
.end method

.method public static synthetic ۧ(Ljava/lang/Object;JB)V
    .locals 0

    .line 20
    invoke-static {p0, p1, p2, p3}, Ll/᩸֨ۖ;->ᩳ(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static ۧ(Ljava/lang/Object;JZ)V
    .locals 0

    int-to-byte p3, p3

    .line 1004
    invoke-static {p0, p1, p2, p3}, Ll/᩸֨ۖ;->ᩳ(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static ܳ(JLjava/lang/Object;)D
    .locals 1

    .line 137
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->ܽ(JLjava/lang/Object;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static ܽ()Lsun/misc/Unsafe;
    .locals 1

    .line 269
    :try_start_0
    new-instance v0, Ll/֡֨ۖ;

    .line 271
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 270
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ܽ(Ljava/lang/Class;)V
    .locals 1

    .line 93
    sget-boolean v0, Ll/᩸֨ۖ;->ܽ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0}, Ll/ܶ֨ۖ;->ۧ(Ljava/lang/Class;)I

    :cond_0
    return-void
.end method

.method public static ܽ(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p0}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result v2

    long-to-int p2, p1

    not-int p1, p2

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    .line 981
    invoke-static {p1, v0, v1, p0}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method public static ܽ(Ljava/lang/Object;JZ)V
    .locals 1

    .line 125
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static ܽ(JLjava/lang/Object;)Z
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p0

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p2}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p2

    not-long p0, p0

    const-wide/16 v0, 0x3

    and-long/2addr p0, v0

    const/4 v0, 0x3

    shl-long/2addr p0, v0

    long-to-int p1, p0

    ushr-int p0, p2, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܿ()Z
    .locals 1

    .line 68
    sget-boolean v0, Ll/᩸֨ۖ;->ᩳ:Z

    return v0
.end method

.method public static ܿ(JLjava/lang/Object;)Z
    .locals 1

    .line 121
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->֫(JLjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ᩳ(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p0}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result v2

    long-to-int p2, p1

    and-int/lit8 p1, p2, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    .line 988
    invoke-static {p1, v0, v1, p0}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method public static ᩳ()Z
    .locals 1

    .line 64
    sget-boolean v0, Ll/᩸֨ۖ;->ܽ:Z

    return v0
.end method

.method public static ᩳ(JLjava/lang/Object;)Z
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p0

    .line 105
    sget-object v2, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v2, v0, v1, p2}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p2

    const-wide/16 v0, 0x3

    and-long/2addr p0, v0

    const/4 v0, 0x3

    shl-long/2addr p0, v0

    long-to-int p1, p0

    ushr-int p0, p2, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Ljava/lang/Class;)Z
    .locals 10

    .line 327
    const-class v0, [B

    invoke-static {}, Ll/֡ۜۖ;->ۧ()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 331
    :cond_0
    :try_start_0
    sget-object v1, Ll/᩸֨ۖ;->᩻:Ljava/lang/Class;

    const-string v3, "peekLong"

    .line 332
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    aput-object p0, v6, v2

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeLong"

    const/4 v6, 0x3

    new-array v8, v6, [Ljava/lang/Class;

    aput-object p0, v8, v2

    .line 333
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v4, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeInt"

    .line 334
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-array v9, v6, [Ljava/lang/Class;

    aput-object p0, v9, v2

    aput-object v8, v9, v7

    aput-object v4, v9, v5

    invoke-virtual {v1, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekInt"

    new-array v9, v5, [Ljava/lang/Class;

    aput-object p0, v9, v2

    aput-object v4, v9, v7

    .line 335
    invoke-virtual {v1, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByte"

    new-array v4, v5, [Ljava/lang/Class;

    aput-object p0, v4, v2

    .line 336
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v9, v4, v7

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByte"

    new-array v4, v7, [Ljava/lang/Class;

    aput-object p0, v4, v2

    .line 337
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByteArray"

    const/4 v4, 0x4

    new-array v9, v4, [Ljava/lang/Class;

    aput-object p0, v9, v2

    aput-object v0, v9, v7

    aput-object v8, v9, v5

    aput-object v8, v9, v6

    .line 338
    invoke-virtual {v1, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByteArray"

    new-array v4, v4, [Ljava/lang/Class;

    aput-object p0, v4, v2

    aput-object v0, v4, v7

    aput-object v8, v4, v5

    aput-object v8, v4, v6

    .line 339
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    :catchall_0
    return v2
.end method

.method public static ᩷(JLjava/lang/Object;)J
    .locals 1

    .line 113
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->ܳ(JLjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ᩻(JLjava/lang/Object;)F
    .locals 1

    .line 129
    sget-object v0, Ll/᩸֨ۖ;->ܳ:Ll/ܶ֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܶ֨ۖ;->ᩳ(JLjava/lang/Object;)F

    move-result p0

    return p0
.end method
