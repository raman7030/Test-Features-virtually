.class public final Ll/ۜ֡᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/ܿۡۡ;


# instance fields
.field public final synthetic ֫:Ll/᩵֡᩷;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;)V
    .locals 0

    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۜ֡᩷;->֫:Ll/᩵֡᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 6

    const-string v0, "filterText"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    iget-object v0, p0, Ll/ۜ֡᩷;->֫:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ۡ(Ll/᩵֡᩷;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 294
    invoke-static {v0, p1}, Ll/᩵֡᩷;->ۧ(Ll/᩵֡᩷;Ljava/lang/String;)V

    .line 295
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 296
    invoke-static {v0}, Ll/᩵֡᩷;->ۘ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 298
    :cond_0
    invoke-static {v0}, Ll/᩵֡᩷;->ۘ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v1

    .line 777
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll/ᩳۜܳ;

    .line 299
    invoke-interface {v4}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getName(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-static {v4, p1, v5}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 873
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v2

    .line 295
    :goto_1
    invoke-static {v0, p1}, Ll/᩵֡᩷;->ۧ(Ll/᩵֡᩷;Ljava/util/List;)V

    .line 305
    invoke-static {v0}, Ll/᩵֡᩷;->᩸(Ll/᩵֡᩷;)Ll/ᩳ֡᩷;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ᩳ֡᩷;->֫(Z)V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܳۡۡ;)V
    .locals 1

    const-string v0, "status"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    invoke-virtual {p1}, Ll/ܳۡۡ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۜ֡᩷;->֫:Ll/᩵֡᩷;

    invoke-static {p1}, Ll/᩵֡᩷;->ۡ(Ll/᩵֡᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, ""

    .line 311
    invoke-static {p1, v0}, Ll/᩵֡᩷;->ۧ(Ll/᩵֡᩷;Ljava/lang/String;)V

    .line 312
    invoke-static {p1}, Ll/᩵֡᩷;->ۘ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩵֡᩷;->ۧ(Ll/᩵֡᩷;Ljava/util/List;)V

    .line 313
    invoke-static {p1}, Ll/᩵֡᩷;->᩸(Ll/᩵֡᩷;)Ll/ᩳ֡᩷;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ᩳ֡᩷;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
