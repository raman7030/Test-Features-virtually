.class public final Ll/ܳۗۡ;
.super Ll/ۨۗۡ;
.source "51V0"


# instance fields
.field public final synthetic ۙ:Ll/ۢۗۡ;


# direct methods
.method public constructor <init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩷֫ۚ;)V
    .locals 0

    .line 322
    iput-object p1, p0, Ll/ܳۗۡ;->ۙ:Ll/ۢۗۡ;

    .line 323
    invoke-direct {p0, p2, p3}, Ll/ۨۗۡ;-><init>(Ll/ܽܳۚ;Ll/᩷֫ۚ;)V

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 8

    .line 329
    new-instance v0, Ljava/util/ArrayList;

    invoke-super {p0}, Ll/ۨۗۡ;->getElements()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 330
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 331
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ֫ۚ;

    .line 332
    invoke-interface {v3}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "name"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v4

    invoke-interface {v4}, Ll/ۤܽۚ;->ۖ()I

    move-result v4

    const/16 v5, 0x17

    if-ne v4, v5, :cond_2

    .line 333
    invoke-interface {v3}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v3

    .line 334
    iget-object v4, p0, Ll/ܳۗۡ;->ۙ:Ll/ۢۗۡ;

    invoke-static {v4}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 335
    invoke-static {v4}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x24

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    .line 336
    invoke-static {v4}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 337
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    const/16 v5, 0x2f

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v7, -0x1

    if-ne v5, v7, :cond_1

    .line 338
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x30

    if-gt v5, v3, :cond_0

    const/16 v5, 0x39

    if-gt v3, v5, :cond_0

    .line 340
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 342
    :cond_0
    new-instance v3, Ll/ۧۗۡ;

    invoke-direct {v3, v4}, Ll/ۧۗۡ;-><init>(Ljava/lang/String;)V

    .line 346
    :cond_1
    new-instance v4, Ll/ܿۗۡ;

    invoke-direct {v4, v3}, Ll/ܿۗۡ;-><init>(Ll/ۤܽۚ;)V

    invoke-virtual {v0, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 361
    :cond_3
    invoke-static {v0}, Ll/ۢۗۡ;->֫(Ljava/util/ArrayList;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
