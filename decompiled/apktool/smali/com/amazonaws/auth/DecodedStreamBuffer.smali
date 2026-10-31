.class public Lcom/amazonaws/auth/DecodedStreamBuffer;
.super Ljava/lang/Object;
.source "DecodedStreamBuffer.java"


# static fields
.field public static final ܳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public ֫:[B

.field public ۧ:Z

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lcom/amazonaws/auth/DecodedStreamBuffer;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 29
    iput v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    .line 33
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->֫:[B

    .line 34
    iput p1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 3

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    .line 53
    iget v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܽ:I

    add-int v1, v0, p2

    iget v2, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ᩳ:I

    if-le v1, v2, :cond_1

    .line 54
    sget-object p1, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܳ:Lcom/amazonaws/logging/Log;

    invoke-interface {p1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Buffer size "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " has been exceeded and the input stream will not be repeatable. Freeing buffer memory"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ۧ:Z

    return-void

    .line 62
    :cond_1
    iget-object v1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->֫:[B

    invoke-static {p3, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    iget p1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܽ:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܽ:I

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 68
    iget v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܽ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()B
    .locals 2

    .line 72
    iget v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    iget-object v1, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->֫:[B

    aget-byte v0, v1, v0

    return v0
.end method

.method public final ܽ()V
    .locals 4

    .line 76
    iget-boolean v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 81
    iput v0, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ܿ:I

    return-void

    .line 77
    :cond_0
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The input stream is not repeatable since the buffer size "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/amazonaws/auth/DecodedStreamBuffer;->ᩳ:I

    const-string v3, " has been exceeded."

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 77
    throw v0
.end method
