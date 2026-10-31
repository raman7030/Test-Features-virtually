.class public final Lorg/bouncycastle/crypto/util/DERMacData;
.super Ljava/lang/Object;


# instance fields
.field public final macData:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/util/DERMacData;->macData:[B

    return-void
.end method

.method public synthetic constructor <init>([BLorg/bouncycastle/crypto/util/DERMacData$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/util/DERMacData;-><init>([B)V

    return-void
.end method


# virtual methods
.method public getMacData()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/DERMacData;->macData:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v0

    return-object v0
.end method
