.class public final Ll/ۗ֫ܽ;
.super Ll/ܽ᩶᩵;
.source "M45G"

# interfaces
.implements Ll/֫᩹᩵;


# instance fields
.field public final synthetic ᩹:Ll/۬֫ܽ;


# direct methods
.method public constructor <init>(Ll/۬֫ܽ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۗ֫ܽ;->᩹:Ll/۬֫ܽ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/ܽ᩶᩵;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 5

    .line 33
    iget-object v0, p0, Ll/ۗ֫ܽ;->᩹:Ll/۬֫ܽ;

    invoke-virtual {v0}, Ll/۬֫ܽ;->֫()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    .line 34
    invoke-virtual {v0}, Ll/۬֫ܽ;->ۧ()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 35
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    .line 36
    invoke-virtual {v0}, Ll/۬֫ܽ;->ܿ()I

    move-result v0

    int-to-long v2, v0

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
