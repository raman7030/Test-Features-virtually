.class public abstract Ll/᩶۟ܺ;
.super Ljava/lang/Object;
.source "X7ON"


# static fields
.field public static final ܽ:Ll/ܰۤܺ;

.field public static final ᩳ:Ll/᩵ۗܺ;


# instance fields
.field public ֫:Ll/ܳ۬ܺ;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0, v0}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v0

    sput-object v0, Ll/᩶۟ܺ;->ܽ:Ll/ܰۤܺ;

    .line 33
    invoke-static {}, Ll/᩵ۗܺ;->֫()Ll/᩵ۗܺ;

    move-result-object v0

    sput-object v0, Ll/᩶۟ܺ;->ᩳ:Ll/᩵ۗܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/ᩴۧۖ;)Ljava/util/HashMap;
    .locals 8

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    iget-object v1, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_2

    .line 100
    invoke-virtual {p0, v2}, Ll/᩶۟ܺ;->ۧ(I)Ll/ܰۤܺ;

    move-result-object v3

    sget-object v4, Ll/᩶۟ܺ;->ᩳ:Ll/᩵ۗܺ;

    invoke-virtual {v3, v4}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_1
    invoke-virtual {v3}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 103
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۤܺ;

    invoke-virtual {v6}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    add-int/lit8 v7, v2, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 105
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    add-int/lit8 v7, v2, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InputOutput{lines="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ranges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ll/ܳ۬ܺ;)V
    .locals 6

    .line 76
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۟ܺ;

    .line 77
    invoke-interface {v1}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 33
    sget v3, Ll/۬۟ܺ;->֫:I

    .line 112
    new-instance v3, Ll/ۗ۟ܺ;

    invoke-direct {v3, v2}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-static {v3}, Ll/ۙ۫ܺ;->ܽ(Ljava/util/Iterator;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    add-int/2addr v2, v0

    .line 80
    invoke-interface {v1}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v1

    if-ltz v1, :cond_2

    :goto_1
    if-gt v0, v2, :cond_2

    .line 67
    :goto_2
    iget-object v3, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gt v4, v0, :cond_0

    .line 68
    sget-object v4, Ll/᩶۟ܺ;->ܽ:Ll/ܰۤܺ;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 70
    :cond_0
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    .line 71
    invoke-virtual {v4}, Ll/ܰۤܺ;->֫()Z

    move-result v5

    if-eqz v5, :cond_1

    move v4, v1

    goto :goto_3

    :cond_1
    invoke-virtual {v4}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    add-int/lit8 v5, v1, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ۧ(I)Ll/ܰۤܺ;
    .locals 2

    if-ltz p1, :cond_0

    .line 119
    iget-object v0, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;

    return-object p1

    :cond_0
    sget-object p1, Ll/᩶۟ܺ;->ܽ:Ll/ܰۤܺ;

    return-object p1
.end method

.method public final ۧ(Ll/ܳ۬ܺ;)V
    .locals 0

    .line 39
    iput-object p1, p0, Ll/᩶۟ܺ;->֫:Ll/ܳ۬ܺ;

    return-void
.end method
