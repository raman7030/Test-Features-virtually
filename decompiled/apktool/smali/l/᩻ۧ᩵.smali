.class public final Ll/᩻ۧ᩵;
.super Ll/ۡ᩺ᩴ;
.source "N673"


# instance fields
.field public final synthetic h:Ljava/util/function/BinaryOperator;

.field public final synthetic i:Ljava/util/function/BiConsumer;

.field public final synthetic j:Ljava/util/function/Supplier;

.field public final synthetic k:Ll/ۨۨᩴ;


# direct methods
.method public constructor <init>(Ll/ۡ֫᩵;Ljava/util/function/BinaryOperator;Ljava/util/function/BiConsumer;Ljava/util/function/Supplier;Ll/ۨۨᩴ;)V
    .locals 0

    .line 899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    iput-object p2, p0, Ll/᩻ۧ᩵;->h:Ljava/util/function/BinaryOperator;

    iput-object p3, p0, Ll/᩻ۧ᩵;->i:Ljava/util/function/BiConsumer;

    iput-object p4, p0, Ll/᩻ۧ᩵;->j:Ljava/util/function/Supplier;

    iput-object p5, p0, Ll/᩻ۧ᩵;->k:Ll/ۨۨᩴ;

    return-void
.end method


# virtual methods
.method public final e0()Ll/ᩳܿ᩵;
    .locals 4

    .line 180
    new-instance v0, Ll/ۚۧ᩵;

    iget-object v1, p0, Ll/᩻ۧ᩵;->i:Ljava/util/function/BiConsumer;

    iget-object v2, p0, Ll/᩻ۧ᩵;->h:Ljava/util/function/BinaryOperator;

    iget-object v3, p0, Ll/᩻ۧ᩵;->j:Ljava/util/function/Supplier;

    invoke-direct {v0, v3, v1, v2}, Ll/ۚۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;)V

    return-object v0
.end method

.method public final j()I
    .locals 2

    .line 185
    iget-object v0, p0, Ll/᩻ۧ᩵;->k:Ll/ۨۨᩴ;

    invoke-interface {v0}, Ll/ۨۨᩴ;->characteristics()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Ll/ۛۨᩴ;->UNORDERED:Ll/ۛۨᩴ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    sget v0, Ll/۟۟ᩴ;->r:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
