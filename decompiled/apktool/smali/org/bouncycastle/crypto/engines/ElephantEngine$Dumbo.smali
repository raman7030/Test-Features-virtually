.class public Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;
.super Lorg/bouncycastle/crypto/engines/ElephantEngine$Spongent;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/ElephantEngine;)V
    .locals 3

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    const/16 p1, 0x50

    const/16 v0, 0x75

    const/16 v1, 0xa0

    const/16 v2, 0x14

    invoke-direct {p0, v1, v2, p1, v0}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Spongent;-><init>(IIIB)V

    return-void
.end method


# virtual methods
.method public lfsr_step()V
    .locals 6

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->access$100(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    iget v2, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->access$200(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B

    move-result-object v1

    const/4 v3, 0x0

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    const/4 v4, 0x3

    shl-int/2addr v1, v4

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    invoke-static {v5}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->access$200(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B

    move-result-object v5

    aget-byte v3, v5, v3

    and-int/lit16 v3, v3, 0xff

    ushr-int/lit8 v3, v3, 0x5

    or-int/2addr v1, v3

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->access$200(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B

    move-result-object v3

    aget-byte v3, v3, v4

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v1, v3

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;->this$0:Lorg/bouncycastle/crypto/engines/ElephantEngine;

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->access$200(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B

    move-result-object v3

    const/16 v4, 0xd

    aget-byte v3, v3, v4

    and-int/lit16 v3, v3, 0xff

    ushr-int/lit8 v3, v3, 0x7

    xor-int/2addr v1, v3

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    return-void
.end method
