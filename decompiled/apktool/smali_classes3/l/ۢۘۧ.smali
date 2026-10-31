.class public final Ll/ۢۘۧ;
.super Ljava/lang/Object;
.source "E8PN"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final synthetic ֫:Ll/ۡۘۧ;


# direct methods
.method public constructor <init>(Ll/ۡۘۧ;)V
    .locals 0

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۘۧ;->֫:Ll/ۡۘۧ;

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 11

    .line 261
    iget-object v0, p0, Ll/ۢۘۧ;->֫:Ll/ۡۘۧ;

    invoke-static {v0}, Ll/ۡۘۧ;->ܽ(Ll/ۡۘۧ;)Ll/ܶۘۧ;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ll/ܶۘۧ;->ۧ(J)J

    move-result-wide v1

    .line 262
    invoke-static {v0}, Ll/ۡۘۧ;->ۧ(Ll/ۡۘۧ;)J

    move-result-wide v3

    .line 266
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v0}, Ll/ۡۘۧ;->֫(Ll/ۡۘۧ;)J

    move-result-wide v5

    invoke-static {v0}, Ll/ۡۘۧ;->ۧ(Ll/ۡۘۧ;)J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 267
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v0}, Ll/ۡۘۧ;->ᩳ(Ll/ۡۘۧ;)J

    move-result-wide v5

    .line 268
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 269
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    add-long/2addr v1, v3

    const-wide/16 v3, 0x7530

    sub-long v5, v1, v3

    .line 271
    invoke-static {v0}, Ll/ۡۘۧ;->ۧ(Ll/ۡۘۧ;)J

    move-result-wide v7

    invoke-static {v0}, Ll/ۡۘۧ;->֫(Ll/ۡۘۧ;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v9, v0, v2

    .line 272
    invoke-static/range {v5 .. v10}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v0

    .line 273
    new-instance v2, Ll/ۜۢۧ;

    new-instance v3, Ll/ۡۢۧ;

    invoke-direct {v3, p1, p2, v0, v1}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v2, v3, v3}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v2
.end method

.method public final ۜ()J
    .locals 4

    .line 278
    iget-object v0, p0, Ll/ۢۘۧ;->֫:Ll/ۡۘۧ;

    invoke-static {v0}, Ll/ۡۘۧ;->ܽ(Ll/ۡۘۧ;)Ll/ܶۘۧ;

    move-result-object v1

    invoke-static {v0}, Ll/ۡۘۧ;->ᩳ(Ll/ۡۘۧ;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܶۘۧ;->֫(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
