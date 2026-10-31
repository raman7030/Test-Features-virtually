.class public Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;


# instance fields
.field public final stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    return-void
.end method


# virtual methods
.method public getBytes()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;->getBuf()[B

    move-result-object v0

    return-object v0
.end method

.method public getLen()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    return v0
.end method

.method public processByte(B[BI)I
    .locals 0

    .line 0
    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkData(Z)Z

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureInitialized()V

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p2

    iput p2, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return p3
.end method

.method public processBytes([BII[BI)I
    .locals 0

    .line 0
    iget-object p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    const/4 p5, 0x0

    invoke-virtual {p4, p5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkData(Z)Z

    iget-object p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    invoke-virtual {p4}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->ensureInitialized()V

    iget-object p4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {p4, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p2

    iput p2, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return p5
.end method

.method public reset()V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ErasableOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-void
.end method
