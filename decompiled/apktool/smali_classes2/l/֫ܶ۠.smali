.class public final Ll/֫ܶ۠;
.super Ljava/lang/Object;
.source "544J"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ll/ܽܶ۠;)V
    .locals 3

    .line 457
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 458
    invoke-static {p1}, Ll/ܽܶ۠;->ᩳ(Ll/ܽܶ۠;)Ll/ۗ۠۠;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ܽܶ۠;->ᩳ(Ll/ܽܶ۠;)Ll/ۗ۠۠;

    move-result-object v0

    invoke-interface {v0}, Ll/ۗ۠۠;->֨()I

    move-result v0

    :goto_0
    if-eq v0, v1, :cond_2

    .line 459
    invoke-static {p1}, Ll/ܽܶ۠;->ܿ(Ll/ܽܶ۠;)Ll/ܳ۠۠;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 462
    :cond_1
    invoke-static {p1}, Ll/ܽܶ۠;->ܿ(Ll/ܽܶ۠;)Ll/ܳ۠۠;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܳ۠۠;->ۧ(I)I

    move-result v1

    iput v1, p0, Ll/֫ܶ۠;->ۧ:I

    .line 463
    invoke-static {p1}, Ll/ܽܶ۠;->ܿ(Ll/ܽܶ۠;)Ll/ܳ۠۠;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/ܳ۠۠;->֫(IZ)I

    move-result p1

    iput p1, p0, Ll/֫ܶ۠;->֫:I

    return-void

    .line 460
    :cond_2
    :goto_1
    iput v1, p0, Ll/֫ܶ۠;->֫:I

    iput v1, p0, Ll/֫ܶ۠;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 472
    iget v0, p0, Ll/֫ܶ۠;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 468
    iget v0, p0, Ll/֫ܶ۠;->ۧ:I

    return v0
.end method
