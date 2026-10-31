.class public Lorg/bouncycastle/math/Primes$STOutput;
.super Ljava/lang/Object;


# instance fields
.field public prime:Ljava/math/BigInteger;

.field public primeGenCounter:I

.field public primeSeed:[B


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;[BI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/math/Primes$STOutput;->prime:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/math/Primes$STOutput;->primeSeed:[B

    iput p3, p0, Lorg/bouncycastle/math/Primes$STOutput;->primeGenCounter:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/math/BigInteger;[BILorg/bouncycastle/math/Primes$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/math/Primes$STOutput;-><init>(Ljava/math/BigInteger;[BI)V

    return-void
.end method


# virtual methods
.method public getPrime()Ljava/math/BigInteger;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/math/Primes$STOutput;->prime:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getPrimeGenCounter()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/math/Primes$STOutput;->primeGenCounter:I

    return v0
.end method

.method public getPrimeSeed()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/math/Primes$STOutput;->primeSeed:[B

    return-object v0
.end method
