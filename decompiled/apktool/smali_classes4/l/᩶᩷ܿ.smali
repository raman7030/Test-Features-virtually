.class public final Ll/᩶᩷ܿ;
.super Ljava/lang/Object;
.source "N97D"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶᩷ܿ;->֫:Ljava/util/ArrayList;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩶᩷ܿ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸᩷ܿ;)I
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩶᩷ܿ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ֫(I)Ll/᩸᩷ܿ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩶᩷ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸᩷ܿ;

    return-object p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 27
    iget-object v0, p0, Ll/᩶᩷ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩷ܿ;

    .line 29
    invoke-virtual {v1, p1}, Ll/᩸᩷ܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 4

    .line 38
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    .line 40
    iget-object v1, p0, Ll/᩶᩷ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 43
    invoke-static {p1}, Ll/᩸᩷ܿ;->֫(Ll/۬ۜܽ;)Ll/᩸᩷ܿ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/᩸᩷ܿ;)V
    .locals 2

    .line 16
    iget-object v0, p0, Ll/᩶᩷ܿ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v0, p0, Ll/᩶᩷ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
