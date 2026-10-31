.class public final Ll/᩵ۢ۠;
.super Ljava/lang/Object;
.source "27L2"


# instance fields
.field public final ֫:Ll/۠ۢ۠;

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ll/ۖܶ۠;

.field public final ᩳ:[Ll/۠ۢ۠;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;Ll/۠ۢ۠;[Ll/۠ۢ۠;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p2, p0, Ll/᩵ۢ۠;->֫:Ll/۠ۢ۠;

    .line 175
    invoke-interface {p2, p1}, Ll/᩸ۢ۠;->֫(Ll/ۛ᩸֨;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ۢ۠;->ۧ:Ljava/lang/Object;

    .line 176
    iput-object p3, p0, Ll/᩵ۢ۠;->ᩳ:[Ll/۠ۢ۠;

    .line 177
    invoke-static {p3}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance p3, Ll/ᩴۢ۠;

    invoke-direct {p3, p1}, Ll/ᩴۢ۠;-><init>(Ll/ۛ᩸֨;)V

    .line 178
    invoke-interface {p2, p3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 179
    invoke-static {}, Ll/ۖܶ۠;->ܿ()Ll/ۨۨᩴ;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܶ۠;

    iput-object p1, p0, Ll/᩵ۢ۠;->ܽ:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 192
    instance-of v0, p1, Ll/᩵ۢ۠;

    if-eqz v0, :cond_0

    .line 190
    check-cast p1, Ll/᩵ۢ۠;

    iget-object v0, p0, Ll/᩵ۢ۠;->ۧ:Ljava/lang/Object;

    iget-object v1, p1, Ll/᩵ۢ۠;->ۧ:Ljava/lang/Object;

    .line 191
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۢ۠;->ܽ:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/᩵ۢ۠;->ܽ:Ll/ۖܶ۠;

    .line 192
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 184
    iget-object v0, p0, Ll/᩵ۢ۠;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/᩵ۢ۠;->ܽ:Ll/ۖܶ۠;

    .line 185
    invoke-virtual {v1}, Ll/ۖܶ۠;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
