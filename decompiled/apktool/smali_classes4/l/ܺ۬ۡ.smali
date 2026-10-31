.class public final Ll/ܺ۬ۡ;
.super Ljava/lang/Object;
.source "T1UY"

# interfaces
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ֫:Ll/ۖ۬ۡ;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IILl/ۖ۬ۡ;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Ll/ܺ۬ۡ;->ܽ:I

    .line 30
    iput p2, p0, Ll/ܺ۬ۡ;->ᩳ:I

    and-int/lit8 p1, p1, 0x7

    .line 31
    iput p1, p0, Ll/ܺ۬ۡ;->ۧ:I

    .line 32
    iput-object p3, p0, Ll/ܺ۬ۡ;->֫:Ll/ۖ۬ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 3

    .line 42
    invoke-virtual {p2}, Ll/ۙۗۡ;->ۧ()I

    move-result v0

    .line 60
    iget v1, p0, Ll/ܺ۬ۡ;->ܽ:I

    not-int v2, v0

    and-int/2addr v1, v2

    if-nez v1, :cond_1

    iget v1, p0, Ll/ܺ۬ۡ;->ᩳ:I

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    iget v1, p0, Ll/ܺ۬ۡ;->ۧ:I

    if-eqz v1, :cond_0

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 43
    :cond_0
    iget-object v0, p0, Ll/ܺ۬ۡ;->֫:Ll/ۖ۬ۡ;

    invoke-interface {v0, p1, p2}, Ll/ۖ۬ۡ;->֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 3

    .line 36
    invoke-virtual {p2}, Ll/ۙۗۡ;->ۧ()I

    move-result v0

    .line 60
    iget v1, p0, Ll/ܺ۬ۡ;->ܽ:I

    not-int v2, v0

    and-int/2addr v1, v2

    if-nez v1, :cond_1

    iget v1, p0, Ll/ܺ۬ۡ;->ᩳ:I

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    iget v1, p0, Ll/ܺ۬ۡ;->ۧ:I

    if-eqz v1, :cond_0

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    iget-object v0, p0, Ll/ܺ۬ۡ;->֫:Ll/ۖ۬ۡ;

    invoke-interface {v0, p1, p2}, Ll/ۖ۬ۡ;->֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V

    :cond_1
    return-void
.end method
