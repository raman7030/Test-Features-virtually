.class public final Ll/᩸ۧۧ;
.super Ll/ܺܿۧ;
.source "J8Q3"


# instance fields
.field public final ۧ:Ll/۬᩵֫;


# direct methods
.method public constructor <init>(Ll/ۢܿۧ;Ll/۬᩵֫;)V
    .locals 0

    .line 319
    invoke-direct {p0, p1}, Ll/ܺܿۧ;-><init>(Ll/ۢܿۧ;)V

    .line 320
    iput-object p2, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 345
    invoke-super {p0, p1}, Ll/ܺܿۧ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Ll/᩸ۧۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 348
    :cond_0
    check-cast p1, Ll/᩸ۧۧ;

    .line 349
    iget-object v0, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    iget-object p1, p1, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    invoke-virtual {v0, p1}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 354
    invoke-super {p0}, Ll/ܺܿۧ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    invoke-virtual {v1}, Ll/۬᩵֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(I)Ll/۠ᩴ֫;
    .locals 1

    .line 330
    invoke-virtual {p0}, Ll/ܺܿۧ;->ۡ()Ll/ۢܿۧ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ᩴܿۧ;->ۧ(I)I

    move-result p1

    iget-object v0, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    invoke-virtual {v0, p1}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ()Ll/۠ᩴ֫;
    .locals 2

    .line 340
    invoke-virtual {p0}, Ll/ܺܿۧ;->ۡ()Ll/ۢܿۧ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۢܿۧ;->᩻()I

    move-result v0

    iget-object v1, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    invoke-virtual {v1, v0}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/۬᩵֫;
    .locals 1

    .line 325
    iget-object v0, p0, Ll/᩸ۧۧ;->ۧ:Ll/۬᩵֫;

    return-object v0
.end method
