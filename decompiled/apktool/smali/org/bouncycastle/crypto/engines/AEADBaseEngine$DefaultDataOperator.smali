.class public Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V

    return-void
.end method


# virtual methods
.method public getLen()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return v0
.end method

.method public processByte(B[BI)I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget-object v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processor:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;->processByte(B[BI)I

    move-result p1

    return p1
.end method

.method public processBytes([BII[BI)I
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DefaultDataOperator;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processEncDecBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method
