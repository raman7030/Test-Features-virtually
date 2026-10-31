.class public final Ll/ۜ֫᩵;
.super Ll/ۡ᩺ᩴ;
.source "N673"


# instance fields
.field public final synthetic h:Ljava/util/function/DoubleBinaryOperator;

.field public final synthetic i:D


# direct methods
.method public constructor <init>(Ll/ۡ֫᩵;Ljava/util/function/DoubleBinaryOperator;D)V
    .locals 0

    .line 899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 658
    iput-object p2, p0, Ll/ۜ֫᩵;->h:Ljava/util/function/DoubleBinaryOperator;

    iput-wide p3, p0, Ll/ۜ֫᩵;->i:D

    return-void
.end method


# virtual methods
.method public final e0()Ll/ᩳܿ᩵;
    .locals 4

    .line 661
    new-instance v0, Ll/ܶܰᩴ;

    iget-wide v1, p0, Ll/ۜ֫᩵;->i:D

    iget-object v3, p0, Ll/ۜ֫᩵;->h:Ljava/util/function/DoubleBinaryOperator;

    invoke-direct {v0, v1, v2, v3}, Ll/ܶܰᩴ;-><init>(DLjava/util/function/DoubleBinaryOperator;)V

    return-object v0
.end method
