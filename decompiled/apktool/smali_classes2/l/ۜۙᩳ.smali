.class public final Ll/ۜۙᩳ;
.super Ljava/lang/Object;
.source "K6TZ"


# instance fields
.field public final ֫:Ll/ۚۗᩳ;

.field public final ۧ:Ll/ۡ۬ᩳ;

.field public final ܽ:Ll/ۖۙᩳ;


# direct methods
.method public constructor <init>(Ll/ۖۙᩳ;Ll/ۡ۬ᩳ;Z)V
    .locals 1

    .line 16
    iget-object v0, p2, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۜۙᩳ;->ܽ:Ll/ۖۙᩳ;

    .line 18
    iput-object p2, p0, Ll/ۜۙᩳ;->ۧ:Ll/ۡ۬ᩳ;

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 31
    invoke-virtual {v0, p1}, Ll/ܺۙᩳ;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Ll/᩺᩶ᩳ;

    if-nez p3, :cond_2

    .line 21
    invoke-virtual {p1}, Ll/᩺᩶ᩳ;->֫()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    iget p2, p1, Ll/᩺᩶ᩳ;->ۜ:I

    iget-object p1, p1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {p1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result p1

    add-int/2addr p1, p2

    .line 9
    new-instance p2, Ll/ۚۗᩳ;

    invoke-direct {p2, p1, p1}, Ll/ۚۗᩳ;-><init>(II)V

    goto :goto_2

    .line 21
    :cond_2
    :goto_1
    iget-object p2, p1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    :goto_2
    iput-object p2, p0, Ll/ۜۙᩳ;->֫:Ll/ۚۗᩳ;

    return-void
.end method

.method public static ֫(Ll/ۖۙᩳ;Z)Ll/ۜۙᩳ;
    .locals 3

    const/4 v0, 0x0

    .line 25
    iget-object v1, p0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    if-eqz p1, :cond_1

    .line 21
    iget-object v1, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 23
    invoke-virtual {v1}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ۬ᩳ;

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v1}, Ll/ۢ۬ᩳ;->ۧ()Ll/ۡ۬ᩳ;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    return-object v0

    .line 26
    :cond_2
    new-instance v0, Ll/ۜۙᩳ;

    invoke-direct {v0, p0, v1, p1}, Ll/ۜۙᩳ;-><init>(Ll/ۖۙᩳ;Ll/ۡ۬ᩳ;Z)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 33
    iget-object v0, p0, Ll/ۜۙᩳ;->ۧ:Ll/ۡ۬ᩳ;

    iget-object v0, v0, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v0}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    move-object v3, v0

    check-cast v3, Ll/᩷ۙᩳ;

    invoke-virtual {v3}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺᩶ᩳ;

    .line 34
    invoke-virtual {v3}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x40

    if-lt v2, v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final ۧ()Z
    .locals 2

    .line 29
    iget-object v0, p0, Ll/ۜۙᩳ;->ܽ:Ll/ۖۙᩳ;

    iget-object v0, v0, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-object v1, p0, Ll/ۜۙᩳ;->֫:Ll/ۚۗᩳ;

    invoke-virtual {v1, v0}, Ll/ۚۗᩳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
