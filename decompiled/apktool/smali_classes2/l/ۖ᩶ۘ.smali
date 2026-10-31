.class public final Ll/ۖ᩶ۘ;
.super Ljava/lang/Object;
.source "48YG"

# interfaces
.implements Ll/ۡ᩶ۘ;


# instance fields
.field public ֫:Landroid/widget/TextView$BufferType;

.field public final ۧ:Landroid/content/Context;

.field public ܽ:Z

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۖ᩶ۘ;->ᩳ:Ljava/util/ArrayList;

    .line 26
    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    iput-object v0, p0, Ll/ۖ᩶ۘ;->֫:Landroid/widget/TextView$BufferType;

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Ll/ۖ᩶ۘ;->ܽ:Z

    .line 34
    iput-object p1, p0, Ll/ۖ᩶ۘ;->ۧ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final build()Ll/ܺ᩶ۘ;
    .locals 11

    .line 88
    iget-object v0, p0, Ll/ۖ᩶ۘ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 134
    new-instance v1, Ll/᩺᩶ۘ;

    invoke-direct {v1, v0}, Ll/᩺᩶ۘ;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v1}, Ll/᩺᩶ۘ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    .line 97
    new-instance v1, Ll/ܰۚ֡;

    invoke-direct {v1}, Ll/ܰۚ֡;-><init>()V

    .line 98
    iget-object v2, p0, Ll/ۖ᩶ۘ;->ۧ:Landroid/content/Context;

    invoke-static {v2}, Ll/۬ۙۘ;->֫(Landroid/content/Context;)Ll/ۗۙۘ;

    move-result-object v2

    .line 99
    new-instance v3, Ll/ۘ᩶ۘ;

    .line 97
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v4, Ll/ۤ᩶ۘ;

    invoke-direct {v4}, Ll/ۤ᩶ۘ;-><init>()V

    .line 101
    new-instance v5, Ll/ܶ᩶ۘ;

    invoke-direct {v5}, Ll/ܶ᩶ۘ;-><init>()V

    .line 103
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ᩶ۘ;

    .line 104
    invoke-interface {v7, v1}, Ll/ۚ᩶ۘ;->֫(Ll/ܰۚ֡;)V

    .line 105
    invoke-interface {v7, v2}, Ll/ۚ᩶ۘ;->֫(Ll/ۗۙۘ;)V

    .line 106
    invoke-interface {v7, v3}, Ll/ۚ᩶ۘ;->֫(Ll/ۘ᩶ۘ;)V

    .line 107
    invoke-interface {v7, v4}, Ll/ۚ᩶ۘ;->֫(Ll/᩶᩶ۘ;)V

    .line 108
    invoke-interface {v7, v5}, Ll/ۚ᩶ۘ;->֫(Ll/֨᩶ۘ;)V

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {v2}, Ll/ۗۙۘ;->֫()Ll/۬ۙۘ;

    move-result-object v2

    .line 113
    invoke-virtual {v5}, Ll/ܶ᩶ۘ;->֫()Ll/۠᩶ۘ;

    move-result-object v5

    .line 111
    invoke-virtual {v3, v2, v5}, Ll/ۘ᩶ۘ;->֫(Ll/۬ۙۘ;Ll/۠᩶ۘ;)Ll/ᩴ᩶ۘ;

    move-result-object v2

    .line 17
    new-instance v8, Ll/۬᩶ۘ;

    invoke-direct {v8, v4, v2}, Ll/۬᩶ۘ;-><init>(Ll/᩶᩶ۘ;Ll/ᩴ᩶ۘ;)V

    .line 121
    new-instance v2, Ll/᩵᩶ۘ;

    .line 124
    invoke-virtual {v1}, Ll/ܰۚ֡;->֫()Ll/֫֨֡;

    move-result-object v7

    .line 127
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    iget-boolean v10, p0, Ll/ۖ᩶ۘ;->ܽ:Z

    iget-object v6, p0, Ll/ۖ᩶ۘ;->֫:Landroid/widget/TextView$BufferType;

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Ll/᩵᩶ۘ;-><init>(Landroid/widget/TextView$BufferType;Ll/֫֨֡;Ll/۬᩶ۘ;Ljava/util/List;Z)V

    return-object v2

    .line 89
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No plugins were added to this builder. Use #usePlugin method to add them"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/List;)Ll/ۡ᩶ۘ;
    .locals 2

    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩶ۘ;

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    iget-object v1, p0, Ll/ۖ᩶ۘ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final ֫(Ll/᩸ۙۘ;)V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۖ᩶ۘ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
