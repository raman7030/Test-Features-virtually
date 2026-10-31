.class public final Ll/ۡᩴ۠;
.super Ljava/lang/Object;
.source "640U"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/ܺᩴ۠;

.field public ᩶:Ll/ܺᩴ۠;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܺᩴ۠;Ll/ܺᩴ۠;)V
    .locals 0

    .line 811
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩴ۠;->ۙ:Ll/ܺᩴ۠;

    .line 812
    iput-object p2, p0, Ll/ۡᩴ۠;->᩶:Ll/ܺᩴ۠;

    .line 813
    iget-object p1, p2, Ll/ܺᩴ۠;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۡᩴ۠;->᩸:Ljava/util/Iterator;

    const/4 p1, 0x0

    .line 814
    iput-boolean p1, p0, Ll/ۡᩴ۠;->᩹:Z

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 838
    iget-boolean v0, p0, Ll/ۡᩴ۠;->᩹:Z

    iget-object v1, p0, Ll/ۡᩴ۠;->᩶:Ll/ܺᩴ۠;

    if-eqz v0, :cond_0

    .line 839
    iget-object v0, v1, Ll/ܺᩴ۠;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    .line 841
    :cond_0
    iget-object v0, p0, Ll/ۡᩴ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v1, Ll/ܺᩴ۠;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 806
    invoke-virtual {p0}, Ll/ۡᩴ۠;->next()Ll/᩵ᩴ۠;

    move-result-object v0

    return-object v0
.end method

.method public final next()Ll/᩵ᩴ۠;
    .locals 11

    .line 818
    iget-boolean v0, p0, Ll/ۡᩴ۠;->᩹:Z

    if-nez v0, :cond_1

    .line 819
    iget-object v0, p0, Ll/ۡᩴ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 820
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ᩴ۠;

    return-object v0

    :cond_0
    const/4 v0, 0x1

    .line 822
    iput-boolean v0, p0, Ll/ۡᩴ۠;->᩹:Z

    .line 825
    :cond_1
    iget-object v0, p0, Ll/ۡᩴ۠;->᩶:Ll/ܺᩴ۠;

    iget-object v1, v0, Ll/ܺᩴ۠;->᩹:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 826
    new-instance v1, Ll/᩵ᩴ۠;

    iget-object v2, v0, Ll/ܺᩴ۠;->᩹:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/᩸᩸۠;

    iget-object v2, p0, Ll/ۡᩴ۠;->ۙ:Ll/ܺᩴ۠;

    iget-object v4, v2, Ll/ܺᩴ۠;->᩶:Ll/֨ᩴ۠;

    iget-object v8, v2, Ll/ܺᩴ۠;->᩶:Ll/֨ᩴ۠;

    iget-object v5, v4, Ll/֨ᩴ۠;->֫֫:Ll/᩹ܶ۠;

    iget-object v6, v4, Ll/֨ᩴ۠;->ۖ֫:Ll/ܽ֡֨;

    invoke-static {v4}, Ll/֨ᩴ۠;->ᩳ(Ll/֨ᩴ۠;)Ll/֫ᩴ֨;

    move-result-object v7

    sget-object v2, Ll/ۧ֡֨;->᩷֫:Ll/ۧ֡֨;

    iget-object v4, v8, Ll/֨ᩴ۠;->ۖ֫:Ll/ܽ֡֨;

    .line 828
    invoke-virtual {v2, v4}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v9

    invoke-static {v8}, Ll/֨ᩴ۠;->ۡ(Ll/֨ᩴ۠;)Z

    move-result v10

    move-object v2, v1

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move v7, v9

    move v9, v10

    invoke-direct/range {v2 .. v9}, Ll/᩵ᩴ۠;-><init>(Ll/᩸᩸۠;Ll/᩹ܶ۠;Ll/ܽ֡֨;Ll/֫ᩴ֨;ZLl/ܶ᩸۠;Z)V

    .line 831
    iget-object v0, v0, Ll/ܺᩴ۠;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1

    .line 834
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 845
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
