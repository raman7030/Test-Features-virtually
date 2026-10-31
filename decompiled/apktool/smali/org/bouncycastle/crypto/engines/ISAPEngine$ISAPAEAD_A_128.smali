.class public Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A_128;
.super Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/ISAPEngine;)V
    .locals 2

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A_128;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;-><init>(Lorg/bouncycastle/crypto/engines/ISAPEngine;)V

    const-wide v0, 0x18040010c0c0c0cL

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV1_64:J

    const-wide v0, 0x28040010c0c0c0cL

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV2_64:J

    const-wide v0, 0x38040010c0c0c0cL    # 8.14194196761063E-292

    iput-wide v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV3_64:J

    return-void
.end method


# virtual methods
.method public PX1(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V
    .locals 1

    const/16 v0, 0xc

    .line 0
    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method

.method public PX2(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V
    .locals 1

    const/16 v0, 0xc

    .line 0
    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method
