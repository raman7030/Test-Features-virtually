.class public final Ll/ܽ᩻֨;
.super Ljava/lang/Object;
.source "BA0O"

# interfaces
.implements Ll/֫᩻֨;


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/util/Queue;

.field public ᩹:Ll/ۢ᩻֨;


# direct methods
.method public constructor <init>(Ll/ۢ᩻֨;Ljava/util/Queue;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ܽ᩻֨;->᩹:Ll/ۢ᩻֨;

    .line 31
    invoke-virtual {p1}, Ll/ۢ᩻֨;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩻֨;->᩶:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Ll/ܽ᩻֨;->᩸:Ljava/util/Queue;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 289
    instance-of v0, p2, Ljava/lang/Throwable;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    .line 290
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    aput-object p2, v0, v2

    .line 292
    invoke-direct {p0, v0}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method private ܽ([Ljava/lang/Object;)V
    .locals 2

    .line 309
    new-instance v0, Ll/ܳ᩻֨;

    invoke-direct {v0}, Ll/ܳ᩻֨;-><init>()V

    .line 310
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 312
    iget-object v1, p0, Ll/ܽ᩻֨;->᩹:Ll/ۢ᩻֨;

    .line 47
    iput-object v1, v0, Ll/ܳ᩻֨;->ۧ:Ll/ۢ᩻֨;

    .line 316
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 63
    iput-object p1, v0, Ll/ܳ᩻֨;->֫:[Ljava/lang/Object;

    .line 321
    iget-object p1, p0, Ll/ܽ᩻֨;->᩸:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ᩳ([Ljava/lang/Object;)V
    .locals 3

    .line 401
    array-length v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 405
    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-object v0, p1, v0

    .line 406
    instance-of v2, v0, Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    .line 407
    move-object v1, v0

    check-cast v1, Ljava/lang/Throwable;

    :cond_1
    :goto_0
    if-eqz v1, :cond_4

    .line 422
    array-length v0, p1

    if-eqz v0, :cond_3

    .line 426
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 428
    new-array v1, v0, [Ljava/lang/Object;

    if-lez v0, :cond_2

    const/4 v2, 0x0

    .line 431
    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 300
    :cond_2
    invoke-direct {p0, v1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void

    .line 423
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "non-sensical empty or null argument array"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 302
    :cond_4
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ܽ᩻֨;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 241
    sget-object p2, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 285
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 237
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 108
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 100
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2, p3}, Ll/ܽ᩻֨;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 205
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 201
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ᩳ([Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ֫([Ljava/lang/Object;)V
    .locals 1

    .line 152
    sget-object v0, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ᩳ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 144
    sget-object p2, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 285
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 92
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 156
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 52
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2, p3}, Ll/ܽ᩻֨;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 253
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 104
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ᩳ([Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ۧ([Ljava/lang/Object;)V
    .locals 1

    .line 56
    sget-object v0, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ᩳ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 48
    sget-object p2, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 285
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 140
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 60
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 197
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2, p3}, Ll/ܽ᩻֨;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 96
    sget-object p2, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 285
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 44
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 245
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2, p3}, Ll/ܽ᩻֨;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 193
    sget-object p2, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    .line 285
    invoke-direct {p0, p2}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 189
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    const/4 p1, 0x0

    .line 281
    invoke-direct {p0, p1}, Ll/ܽ᩻֨;->ܽ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 148
    sget-object p1, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    invoke-direct {p0, p2, p3}, Ll/ܽ᩻֨;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
