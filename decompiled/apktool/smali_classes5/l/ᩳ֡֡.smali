.class public final Ll/ᩳ֡֡;
.super Ll/ۡ֨֡;
.source "Y8XU"


# instance fields
.field public final ֫:Ll/ᩴۚ֡;

.field public ۧ:Z

.field public ܽ:I


# direct methods
.method public constructor <init>(Ll/ᩴۚ֡;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ᩳ֡֡;->֫:Ll/ᩴۚ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 2

    .line 49
    invoke-interface {p1}, Ll/᩵֨֡;->֫()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 50
    iput-boolean v1, p0, Ll/ᩳ֡֡;->ۧ:Z

    const/4 v0, 0x0

    .line 51
    iput v0, p0, Ll/ᩳ֡֡;->ܽ:I

    goto :goto_0

    .line 52
    :cond_0
    iget-boolean v0, p0, Ll/ᩳ֡֡;->ۧ:Z

    if-eqz v0, :cond_1

    .line 53
    iget v0, p0, Ll/ᩳ֡֡;->ܽ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ᩳ֡֡;->ܽ:I

    .line 58
    :cond_1
    :goto_0
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨ֡֡;)Z
    .locals 2

    .line 26
    instance-of p1, p1, Ll/᩵ۚ֡;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 32
    iget-boolean p1, p0, Ll/ᩳ֡֡;->ۧ:Z

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget p1, p0, Ll/ᩳ֡֡;->ܽ:I

    if-ne p1, v1, :cond_0

    .line 33
    iget-object p1, p0, Ll/ᩳ֡֡;->֫:Ll/ᩴۚ֡;

    invoke-virtual {p1, v0}, Ll/ᩴۚ֡;->֫(Z)V

    .line 34
    iput-boolean v0, p0, Ll/ᩳ֡֡;->ۧ:Z

    :cond_0
    return v1

    :cond_1
    return v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ᩳ֡֡;->֫:Ll/ᩴۚ֡;

    return-object v0
.end method
