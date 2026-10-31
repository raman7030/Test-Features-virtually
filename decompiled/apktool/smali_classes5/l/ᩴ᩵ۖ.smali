.class public final Ll/ᩴ᩵ۖ;
.super Ll/֡᩵ۖ;
.source "J9PI"


# static fields
.field public static final ܽ:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۖ;->ܽ:Ljava/lang/Class;

    return-void
.end method

.method public static ֫(IJLjava/lang/Object;)Ljava/util/List;
    .locals 3

    .line 119
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 74
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 75
    instance-of v1, v0, Ll/ۘ᩵ۖ;

    if-eqz v1, :cond_0

    .line 76
    new-instance v0, Ll/ۖ᩵ۖ;

    invoke-direct {v0, p0}, Ll/ۖ᩵ۖ;-><init>(I)V

    goto :goto_0

    .line 77
    :cond_0
    instance-of v1, v0, Ll/ۤ֡ۖ;

    if-eqz v1, :cond_1

    instance-of v1, v0, Ll/᩺ᩴۖ;

    if-eqz v1, :cond_1

    .line 78
    check-cast v0, Ll/᩺ᩴۖ;

    invoke-interface {v0, p0}, Ll/᩺ᩴۖ;->᩷(I)Ll/᩺ᩴۖ;

    move-result-object v0

    goto :goto_0

    .line 80
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    :goto_0
    invoke-static {p1, p2, p3, v0}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 83
    :cond_2
    sget-object v1, Ll/ᩴ᩵ۖ;->ܽ:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 87
    invoke-static {p1, p2, p3, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 88
    :cond_3
    instance-of v1, v0, Ll/᩵֨ۖ;

    if-eqz v1, :cond_4

    .line 89
    new-instance v1, Ll/ۖ᩵ۖ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p0

    invoke-direct {v1, v2}, Ll/ۖ᩵ۖ;-><init>(I)V

    .line 90
    check-cast v0, Ll/᩵֨ۖ;

    invoke-virtual {v1, v0}, Ll/ۖ᩵ۖ;->addAll(Ljava/util/Collection;)Z

    .line 92
    invoke-static {p1, p2, p3, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 93
    :cond_4
    instance-of v1, v0, Ll/ۤ֡ۖ;

    if-eqz v1, :cond_5

    instance-of v1, v0, Ll/᩺ᩴۖ;

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Ll/᩺ᩴۖ;

    .line 95
    invoke-interface {v1}, Ll/᩺ᩴۖ;->ۤ֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 96
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p0

    invoke-interface {v1, v0}, Ll/᩺ᩴۖ;->᩷(I)Ll/᩺ᩴۖ;

    move-result-object p0

    .line 97
    invoke-static {p1, p2, p3, p0}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_5
    return-object v0
.end method


# virtual methods
.method public final ֫(JLjava/lang/Object;)V
    .locals 3

    .line 53
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 55
    instance-of v1, v0, Ll/ۘ᩵ۖ;

    if-eqz v1, :cond_0

    .line 56
    check-cast v0, Ll/ۘ᩵ۖ;

    invoke-interface {v0}, Ll/ۘ᩵ۖ;->۟ۧ()Ll/ۘ᩵ۖ;

    move-result-object v0

    goto :goto_1

    .line 57
    :cond_0
    sget-object v1, Ll/ᩴ᩵ۖ;->ܽ:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 60
    :cond_1
    instance-of v1, v0, Ll/ۤ֡ۖ;

    if-eqz v1, :cond_3

    instance-of v1, v0, Ll/᩺ᩴۖ;

    if-eqz v1, :cond_3

    .line 61
    check-cast v0, Ll/᩺ᩴۖ;

    invoke-interface {v0}, Ll/᩺ᩴۖ;->ۤ֫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 62
    invoke-interface {v0}, Ll/᩺ᩴۖ;->᩶()V

    :cond_2
    :goto_0
    return-void

    .line 66
    :cond_3
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 68
    :goto_1
    invoke-static {p1, p2, p3, v0}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 119
    invoke-static {p1, p2, p4}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    .line 105
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, p1, p2, p3}, Ll/ᩴ᩵ۖ;->֫(IJLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 107
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 108
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_0

    if-lez v2, :cond_0

    .line 110
    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-lez v1, :cond_1

    move-object p4, v0

    .line 114
    :cond_1
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(JLjava/lang/Object;)Ljava/util/List;
    .locals 1

    const/16 v0, 0xa

    .line 48
    invoke-static {v0, p1, p2, p3}, Ll/ᩴ᩵ۖ;->֫(IJLjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
