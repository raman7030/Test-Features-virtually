.class public final Ll/۠ۢۘ;
.super Ljava/lang/Object;
.source "C9KT"


# static fields
.field public static ܽ:Ll/᩹ۢۘ;


# instance fields
.field public ֫:[B

.field public ۧ:Ll/ܺ᩻ۘ;


# direct methods
.method public constructor <init>(Ll/ܺ᩻ۘ;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 38
    iput-object v0, p0, Ll/۠ۢۘ;->֫:[B

    .line 41
    iput-object p1, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    return-void
.end method

.method public static ֫(Ll/᩹ۢۘ;)V
    .locals 0

    .line 34
    sput-object p0, Ll/۠ۢۘ;->ܽ:Ll/᩹ۢۘ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 45
    iget-object v0, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    const/4 v1, 0x5

    iput v1, v0, Ll/ܺ᩻ۘ;->ۧ:I

    return-void
.end method

.method public final ֫(IZ)V
    .locals 5

    .line 49
    iget-object v0, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget v1, v0, Ll/ܺ᩻ۘ;->ۧ:I

    if-nez p2, :cond_0

    add-int/lit8 v1, v1, -0x4

    :cond_0
    neg-int v2, v1

    add-int/lit8 v3, p1, -0x1

    and-int/2addr v2, v3

    if-ge v2, p1, :cond_1

    add-int/2addr v2, p1

    :cond_1
    add-int/2addr v1, v2

    if-eqz p2, :cond_2

    add-int/lit8 v1, v1, -0x4

    .line 61
    :cond_2
    iget-object p1, p0, Ll/۠ۢۘ;->֫:[B

    ushr-int/lit8 p2, v1, 0x18

    int-to-byte p2, p2

    const/4 v3, 0x0

    aput-byte p2, p1, v3

    ushr-int/lit8 p2, v1, 0x10

    int-to-byte p2, p2

    const/4 v4, 0x1

    .line 62
    aput-byte p2, p1, v4

    ushr-int/lit8 p2, v1, 0x8

    int-to-byte p2, p2

    const/4 v4, 0x2

    .line 63
    aput-byte p2, p1, v4

    const/4 p2, 0x3

    int-to-byte v1, v1

    .line 64
    aput-byte v1, p1, p2

    .line 65
    iget-object p2, v0, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v0, 0x4

    invoke-static {p1, v3, p2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    iget-object p1, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B

    int-to-byte p2, v2

    aput-byte p2, p1, v0

    .line 67
    sget-object p1, Ll/۠ۢۘ;->ܽ:Ll/᩹ۢۘ;

    move-object v0, p1

    monitor-enter v0

    .line 68
    :try_start_0
    sget-object p1, Ll/۠ۢۘ;->ܽ:Ll/᩹ۢۘ;

    iget-object p2, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget-object v1, p2, Ll/ܺ᩻ۘ;->֫:[B

    iget p2, p2, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, p2, v2, v1}, Ll/᩹ۢۘ;->֫(II[B)V

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    iget-object p1, p0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    invoke-virtual {p1, v2}, Ll/ܺ᩻ۘ;->ܽ(I)V

    return-void

    :catchall_0
    move-exception p1

    .line 69
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
