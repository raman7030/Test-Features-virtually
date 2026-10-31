.class public abstract Ll/ۧ֫ۘ;
.super Ljava/lang/Object;
.source "U9KI"

# interfaces
.implements Ll/֡۟ۖ;


# instance fields
.field public final ֫:Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ۧ֫ۘ;->֫:Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;

    return-void
.end method


# virtual methods
.method public final ֫(I[B)I
    .locals 2

    const/4 v0, 0x0

    .line 75
    iget-object v1, p0, Ll/ۧ֫ۘ;->֫:Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;

    invoke-interface {v1, p2, v0, p1}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۘ֫ۘ;)V
    .locals 3

    .line 46
    new-instance v0, Lorg/bouncycastle/crypto/params/KDFCounterParameters;

    invoke-virtual {p1}, Ll/ۘ֫ۘ;->ܽ()[B

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘ֫ۘ;->ۧ()[B

    move-result-object v2

    invoke-virtual {p1}, Ll/ۘ֫ۘ;->֫()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lorg/bouncycastle/crypto/params/KDFCounterParameters;-><init>([B[BI)V

    .line 70
    iget-object p1, p0, Ll/ۧ֫ۘ;->֫:Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;

    invoke-interface {p1, v0}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    return-void
.end method
