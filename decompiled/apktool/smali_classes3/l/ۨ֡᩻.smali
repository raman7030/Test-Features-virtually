.class public final Ll/ۨ֡᩻;
.super Ljava/lang/Object;
.source "E9TD"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ᩶:Ll/֡ۛۡ;

.field public final ᩸:Ll/֡᩸ܺ;

.field public final ᩹:Ll/۟֡᩻;


# direct methods
.method public constructor <init>(Ll/۟֡᩻;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    iput-object v0, p0, Ll/ۨ֡᩻;->᩶:Ll/֡ۛۡ;

    .line 27
    iput-object p1, p0, Ll/ۨ֡᩻;->᩹:Ll/۟֡᩻;

    .line 28
    invoke-static {}, Ll/ۖ᩸ܺ;->ᩳ()Ll/ۖ᩸ܺ;

    move-result-object p1

    new-instance v0, Ll/ۤ֡᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1, v0}, Ll/ۖ᩸ܺ;->֫(Ll/᩵᩶ܺ;)V

    const-wide/32 v0, 0x1400000

    .line 30
    invoke-virtual {p1, v0, v1}, Ll/ۖ᩸ܺ;->ۧ(J)V

    const/4 v0, 0x6

    .line 31
    invoke-virtual {p1, v0}, Ll/ۖ᩸ܺ;->֫(I)V

    .line 32
    invoke-virtual {p1}, Ll/ۖ᩸ܺ;->ۧ()V

    new-instance v0, Ll/ۛ֡᩻;

    invoke-direct {v0, p0}, Ll/ۛ֡᩻;-><init>(Ll/ۨ֡᩻;)V

    .line 41
    invoke-virtual {p1, v0}, Ll/ۖ᩸ܺ;->֫(Ll/ᩴ᩸ܺ;)Ll/֡᩸ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֡᩻;->᩸:Ll/֡᩸ܺ;

    return-void
.end method

.method public static ֫(Ll/ۨ֡᩻;)Ll/֨᩷᩻;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۨ֡᩻;->᩶:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨᩷᩻;

    if-nez v0, :cond_0

    .line 68
    iget-object p0, p0, Ll/ۨ֡᩻;->᩹:Ll/۟֡᩻;

    iget-object v0, p0, Ll/۟֡᩻;->ۤ:Ll/ۗۢ᩻;

    iget-object p0, p0, Ll/۟֡᩻;->۬:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ll/ۗۢ᩻;->ܳ(Ljava/lang/String;)Ll/֨᩷᩻;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/ۨ֡᩻;Ll/֨᩷᩻;)V
    .locals 0

    .line 75
    iget-object p0, p0, Ll/ۨ֡᩻;->᩶:Ll/֡ۛۡ;

    invoke-virtual {p0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 76
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۨ֡᩻;->᩸:Ll/֡᩸ܺ;

    invoke-interface {v0}, Ll/᩻᩸ܺ;->ܽ()V

    .line 126
    :goto_0
    iget-object v0, p0, Ll/ۨ֡᩻;->᩶:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨᩷᩻;

    if-eqz v0, :cond_0

    .line 127
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(J[BII)I
    .locals 4

    const-wide/32 v0, 0x19000

    .line 82
    div-long v2, p1, v0

    .line 83
    rem-long/2addr p1, v0

    long-to-int p2, p1

    .line 86
    :try_start_0
    iget-object p1, p0, Ll/ۨ֡᩻;->᩸:Ll/֡᩸ܺ;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/֡᩸ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    array-length v0, p1

    sub-int/2addr v0, p2

    invoke-static {v0, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    if-gtz p5, :cond_0

    const/4 p1, -0x1

    return p1

    .line 97
    :cond_0
    invoke-static {p1, p2, p3, p4, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return p5

    :catch_0
    move-exception p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 89
    instance-of p2, p1, Ljava/io/IOException;

    if-eqz p2, :cond_1

    .line 90
    check-cast p1, Ljava/io/IOException;

    throw p1

    .line 91
    :cond_1
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
