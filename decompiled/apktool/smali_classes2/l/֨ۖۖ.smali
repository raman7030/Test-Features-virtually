.class public abstract Ll/֨ۖۖ;
.super Ljava/lang/Object;
.source "99PI"


# instance fields
.field public volatile ᩸:Ll/ۛۢۖ;

.field public ᩹:Ll/֨ۖۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2777
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 2775
    invoke-direct {p0}, Ll/֨ۖۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getName()Ljava/lang/String;
.end method

.method public final ֫()Ll/ۛۢۖ;
    .locals 2

    .line 2849
    iget-object v0, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    .line 2850
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩷ۖ;->ۜ֫:Ll/ۗ᩷ۖ;

    if-eq v0, v1, :cond_0

    .line 2851
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩷ۖ;->ۢ֫:Ll/ۗ᩷ۖ;

    if-ne v0, v1, :cond_1

    .line 2852
    :cond_0
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۖۖ;->᩸()V

    .line 2854
    :cond_1
    iget-object v0, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    return-object v0
.end method

.method public final ֫(Ll/ۛۢۖ;)V
    .locals 7

    .line 2788
    iget-object v0, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    if-eqz v0, :cond_0

    .line 2789
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2790
    invoke-virtual {p0}, Ll/֨ۖۖ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2791
    iget-object p1, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    iget-object p1, p1, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    iput-object p1, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    .line 2792
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۡ()V

    return-void

    .line 2799
    :cond_0
    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 2800
    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v4

    sget-object v5, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    .line 1853
    invoke-virtual {v5}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v6

    invoke-virtual {v6}, Ll/֡ۖۖ;->getNumber()I

    move-result v6

    if-ne v4, v6, :cond_1

    .line 2801
    invoke-virtual {v5}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v4

    if-eq v3, v4, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    .line 2807
    :cond_2
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2809
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    sget-object v3, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    .line 1853
    invoke-virtual {v3}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v3

    .line 2810
    invoke-virtual {v0, v3}, Ll/ۢ֨ۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-nez v2, :cond_4

    if-eqz v1, :cond_5

    .line 2812
    :cond_4
    invoke-static {}, Ll/֫ۘۖ;->ۧ()Ll/֫ۘۖ;

    move-result-object v0

    .line 2813
    sget-object v1, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    invoke-virtual {v0, v1}, Ll/֫ۘۖ;->֫(Ll/ܺᩴۖ;)V

    .line 2814
    invoke-virtual {p1}, Ll/ۘۜۖ;->toByteString()Ll/ۛۜۖ;

    move-result-object p1

    .line 2816
    :try_start_0
    invoke-static {p1, v0}, Ll/ۛۢۖ;->֫(Ll/ۛۜۖ;Ll/֫ۘۖ;)Ll/ۛۢۖ;

    move-result-object p1
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 2824
    :cond_5
    iget-object v0, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    if-nez v0, :cond_6

    .line 2825
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    .line 2826
    invoke-static {v0}, Ll/᩹ۖۖ;->֫(Ll/ۗ᩷ۖ;)Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->toBuilder()Ll/֡ۢۖ;

    move-result-object v0

    goto :goto_1

    .line 2828
    :cond_6
    iget-object v0, v0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    invoke-virtual {v0}, Ll/ۛۢۖ;->toBuilder()Ll/֡ۢۖ;

    move-result-object v0

    .line 2830
    :goto_1
    invoke-virtual {p0}, Ll/֨ۖۖ;->᩷()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    .line 2831
    invoke-virtual {v0, p1}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    .line 2832
    invoke-virtual {v0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object p1

    invoke-static {p1}, Ll/᩹ۖۖ;->֫(Ll/ۛۢۖ;)Ll/ۛۢۖ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    .line 2833
    invoke-virtual {p0}, Ll/֨ۖۖ;->ۡ()V

    return-void

    :catch_0
    move-exception p1

    .line 2818
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Failed to parse features with Java feature extension registry."

    invoke-direct {v0, p0, v1, p1}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public ۡ()V
    .locals 0

    return-void
.end method

.method public abstract ۢ()Ll/᩻֡ۖ;
.end method

.method public abstract ۧ()Ll/ۚۖۖ;
.end method

.method public abstract ܿ()Ljava/lang/String;
.end method

.method public ᩷()Ll/ۛۢۖ;
    .locals 1

    .line 2837
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public ᩻()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
