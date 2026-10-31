.class public final Ll/۠۬ܺ;
.super Ll/ܳ۬ܺ;
.source "V5XH"


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/᩶۬ܺ;

.field public final synthetic ۫:Ll/ܰۤܺ;

.field public final synthetic ۬:I


# direct methods
.method public constructor <init>(Ll/᩶۬ܺ;IILl/ܰۤܺ;)V
    .locals 0

    .line 337
    iput p2, p0, Ll/۠۬ܺ;->ۗ:I

    iput p3, p0, Ll/۠۬ܺ;->۬:I

    iput-object p4, p0, Ll/۠۬ܺ;->۫:Ll/ܰۤܺ;

    iput-object p1, p0, Ll/۠۬ܺ;->ۙ:Ll/᩶۬ܺ;

    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 345
    iget v0, p0, Ll/۠۬ܺ;->ۗ:I

    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(II)V

    .line 346
    iget v1, p0, Ll/۠۬ܺ;->۬:I

    iget-object v2, p0, Ll/۠۬ܺ;->ۙ:Ll/᩶۬ܺ;

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 349
    :cond_0
    invoke-static {v2}, Ll/᩶۬ܺ;->֫(Ll/᩶۬ܺ;)Ll/ܳ۬ܺ;

    move-result-object v0

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;

    return-object p1

    .line 347
    :cond_1
    :goto_0
    invoke-static {v2}, Ll/᩶۬ܺ;->֫(Ll/᩶۬ܺ;)Ll/ܳ۬ܺ;

    move-result-object v0

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;

    iget-object v0, p0, Ll/۠۬ܺ;->۫:Ll/ܰۤܺ;

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 340
    iget v0, p0, Ll/۠۬ܺ;->ۗ:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 363
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
