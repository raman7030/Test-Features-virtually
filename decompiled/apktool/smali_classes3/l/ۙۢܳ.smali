.class public final Ll/ۙۢܳ;
.super Ljava/lang/Object;
.source "I29D"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ۗ:Ll/۫ۢܳ;

.field public final ۙ:Ljava/util/List;

.field public final ۬:I

.field public final ᩶:Ll/ۗۢܳ;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۫ۢܳ;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۢܳ;->ۗ:Ll/۫ۢܳ;

    .line 118
    new-instance v0, Ll/ۗۢܳ;

    invoke-direct {v0, p1}, Ll/ۗۢܳ;-><init>(Ll/۫ۢܳ;)V

    iput-object v0, p0, Ll/ۙۢܳ;->᩶:Ll/ۗۢܳ;

    .line 121
    iput p2, p0, Ll/ۙۢܳ;->۬:I

    .line 122
    iput-object p3, p0, Ll/ۙۢܳ;->᩹:Ljava/lang/String;

    .line 123
    iput-object p4, p0, Ll/ۙۢܳ;->᩸:Ljava/lang/String;

    if-nez p5, :cond_0

    .line 0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 124
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object p1, p0, Ll/ۙۢܳ;->ۙ:Ljava/util/List;

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 168
    iget-object v0, p0, Ll/ۙۢܳ;->ۗ:Ll/۫ۢܳ;

    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 169
    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    invoke-virtual {v1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 170
    invoke-static {v0}, Ll/۫ۢܳ;->ᩳ(Ll/۫ۢܳ;)Ll/ۙۢܳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    invoke-static {v0}, Ll/۫ۢܳ;->ܳ(Ll/۫ۢܳ;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 9

    .line 129
    iget-object v0, p0, Ll/ۙۢܳ;->ۗ:Ll/۫ۢܳ;

    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v2

    iget v3, p0, Ll/ۙۢܳ;->۬:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_8

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۙۢܳ;->᩹:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 134
    :cond_0
    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v1, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ll/ܽۢܳ;->ܰ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 136
    :cond_1
    iget-object v1, p0, Ll/ۙۢܳ;->ۙ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 138
    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    .line 139
    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0, v1, v4}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;Z)V

    return v4

    .line 143
    :cond_2
    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 144
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Ll/ۙۢܳ;->᩸:Ljava/lang/String;

    const/4 v7, -0x1

    if-ge v3, v5, :cond_4

    .line 145
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 146
    invoke-interface {v5}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-interface {v5}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, -0x1

    :goto_1
    if-ne v3, v7, :cond_5

    .line 152
    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    return v4

    .line 155
    :cond_5
    iget-object v1, p0, Ll/ۙۢܳ;->᩶:Ll/ۗۢܳ;

    invoke-virtual {v1, v3}, Ll/ۗۢܳ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    .line 156
    :cond_6
    invoke-virtual {v0, v6}, Ll/۫ۢܳ;->ۧ(Ljava/lang/String;)V

    .line 157
    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    :cond_7
    :goto_2
    return v4

    .line 131
    :cond_8
    :goto_3
    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    return v4
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 163
    sget-object p1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Ll/ۙۢܳ;->֫()V

    return-void

    .line 164
    :cond_0
    sget-object p1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Ll/ۙۢܳ;->ۗ:Ll/۫ۢܳ;

    invoke-static {p1}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method
