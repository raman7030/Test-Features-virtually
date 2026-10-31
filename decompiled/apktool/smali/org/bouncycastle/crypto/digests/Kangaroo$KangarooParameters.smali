.class public Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/CipherParameters;


# instance fields
.field public thePersonal:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$002(Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooParameters;[B)[B
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooParameters;->thePersonal:[B

    return-object p1
.end method


# virtual methods
.method public getPersonalisation()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/Kangaroo$KangarooParameters;->thePersonal:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v0

    return-object v0
.end method
