.class public final Ll/۬᩶ܿ;
.super Ljava/lang/Object;
.source "K17F"

# interfaces
.implements Ll/ۙ᩸ܿ;


# static fields
.field public static final ᩶:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ᩸:Landroid/net/LocalSocket;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    div-long/2addr v1, v3

    long-to-int v2, v1

    const v1, 0xffffff

    and-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Ll/۬᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Landroid/net/LocalSocket;)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/۬᩶ܿ;->᩸:Landroid/net/LocalSocket;

    .line 29
    :try_start_0
    invoke-virtual {p1}, Landroid/net/LocalSocket;->getSendBufferSize()I

    move-result v0

    const/16 v1, 0x400

    const/high16 v2, 0x40000

    if-lt v0, v1, :cond_0

    if-le v0, v2, :cond_1

    .line 31
    :cond_0
    invoke-virtual {p1, v2}, Landroid/net/LocalSocket;->setSendBufferSize(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/net/LocalSocket;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    const/4 v0, -0x1

    if-nez p1, :cond_2

    goto :goto_1

    .line 77
    :cond_2
    :try_start_1
    const-class v1, Ljava/io/FileDescriptor;

    const-string v2, "descriptor"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 36
    :catch_1
    :goto_1
    iput v0, p0, Ll/۬᩶ܿ;->᩹:I

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 2

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ll/۬᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/۬᩶ܿ;->᩸:Landroid/net/LocalSocket;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V

    return-void
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۬᩶ܿ;->᩸:Landroid/net/LocalSocket;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/۬᩶ܿ;->᩸:Landroid/net/LocalSocket;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getSendBufferSize()I
    .locals 2

    .line 51
    iget-object v0, p0, Ll/۬᩶ܿ;->᩸:Landroid/net/LocalSocket;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getSendBufferSize()I

    move-result v0

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 61
    iget v0, p0, Ll/۬᩶ܿ;->᩹:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۨۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ֫()I
    .locals 1

    .line 66
    iget v0, p0, Ll/۬᩶ܿ;->᩹:I

    return v0
.end method
