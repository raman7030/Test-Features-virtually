.class public final Ll/᩺۠֫;
.super Ll/᩶ۗܺ;
.source "C8NR"


# instance fields
.field public final ᩸:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 844
    iput-object p1, p0, Ll/᩺۠֫;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 854
    invoke-super {p0, p1}, Ll/᩶ۗܺ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 885
    invoke-virtual {p0, p1}, Ll/᩶ۗܺ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 870
    invoke-super {p0}, Ll/᩶ۗܺ;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۛ۠֫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ᩴܶܺ;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 890
    invoke-virtual {p0, p1}, Ll/᩶ۗܺ;->ۧ(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 860
    :cond_0
    invoke-super {p0, p1}, Ll/᩶ۗܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 895
    invoke-virtual {p0}, Ll/᩶ۗܺ;->᩻()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 2

    .line 880
    invoke-super {p0}, Ll/᩶ۗܺ;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-super {p0}, Ll/᩶ۗܺ;->size()I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-super {p0, v0}, Ll/᩶ۗܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 865
    invoke-super {p0}, Ll/᩶ۗܺ;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۨ۠֫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ᩴܶܺ;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 2

    .line 875
    invoke-super {p0}, Ll/᩶ۗܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-super {p0, v1}, Ll/᩶ۗܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 849
    iget-object v0, p0, Ll/᩺۠֫;->᩸:Ljava/util/Map;

    return-object v0
.end method

.method public final ܿ()Ljava/util/Map;
    .locals 1

    .line 849
    iget-object v0, p0, Ll/᩺۠֫;->᩸:Ljava/util/Map;

    return-object v0
.end method
