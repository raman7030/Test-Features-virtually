.class public final Ll/֡ܽ᩵;
.super Ll/ۡ᩺ᩴ;
.source "N673"


# instance fields
.field public final synthetic h:Ljava/util/function/IntBinaryOperator;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Ll/ۡ֫᩵;Ljava/util/function/IntBinaryOperator;I)V
    .locals 0

    .line 899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    iput-object p2, p0, Ll/֡ܽ᩵;->h:Ljava/util/function/IntBinaryOperator;

    iput p3, p0, Ll/֡ܽ᩵;->i:I

    return-void
.end method


# virtual methods
.method public final e0()Ll/ᩳܿ᩵;
    .locals 3

    .line 313
    new-instance v0, Ll/ܳܽ᩵;

    iget v1, p0, Ll/֡ܽ᩵;->i:I

    iget-object v2, p0, Ll/֡ܽ᩵;->h:Ljava/util/function/IntBinaryOperator;

    invoke-direct {v0, v1, v2}, Ll/ܳܽ᩵;-><init>(ILjava/util/function/IntBinaryOperator;)V

    return-object v0
.end method
