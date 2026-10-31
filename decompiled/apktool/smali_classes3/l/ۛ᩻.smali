.class public final Ll/ۛ᩻;
.super Ljava/lang/Object;
.source "355C"

# interfaces
.implements Ll/ۙ᩻;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Landroid/content/Context;

.field public final ܽ:Ll/ۗ᩵;

.field public final ᩳ:Landroid/view/ActionMode$Callback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Ll/ۛ᩻;->ۧ:Landroid/content/Context;

    .line 150
    iput-object p2, p0, Ll/ۛ᩻;->ᩳ:Landroid/view/ActionMode$Callback;

    .line 151
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۛ᩻;->֫:Ljava/util/ArrayList;

    .line 152
    new-instance p1, Ll/ۗ᩵;

    invoke-direct {p1}, Ll/ۗ᩵;-><init>()V

    iput-object p1, p0, Ll/ۛ᩻;->ܽ:Ll/ۗ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩻;)V
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ۛ᩻;->ᩳ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻;Landroid/view/Menu;)Z
    .locals 4

    .line 163
    invoke-virtual {p0, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Ll/ۛ᩻;->ܽ:Ll/ۗ᩵;

    invoke-virtual {v1, p2, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 180
    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Ll/᩷᩷;

    iget-object v2, p0, Ll/ۛ᩻;->ۧ:Landroid/content/Context;

    move-object v3, p2

    check-cast v3, Ll/᩺۬;

    invoke-direct {v0, v2, v3}, Ll/᩷᩷;-><init>(Landroid/content/Context;Ll/᩺۬;)V

    .line 183
    invoke-virtual {v1, p2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    :cond_0
    iget-object p2, p0, Ll/ۛ᩻;->ᩳ:Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗ᩻;Landroid/view/MenuItem;)Z
    .locals 2

    .line 170
    invoke-virtual {p0, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    new-instance v0, Ll/֫᩷;

    iget-object v1, p0, Ll/ۛ᩻;->ۧ:Landroid/content/Context;

    check-cast p2, Ll/ܰ۬;

    invoke-direct {v0, v1, p2}, Ll/֫᩷;-><init>(Landroid/content/Context;Ll/ܰ۬;)V

    iget-object p2, p0, Ll/ۛ᩻;->ᩳ:Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;
    .locals 5

    .line 190
    iget-object v0, p0, Ll/ۛ᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 191
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ᩻;

    if-eqz v3, :cond_0

    .line 192
    iget-object v4, v3, Ll/ۨ᩻;->ۧ:Ll/ۗ᩻;

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 200
    :cond_1
    new-instance v1, Ll/ۨ᩻;

    iget-object v2, p0, Ll/ۛ᩻;->ۧ:Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Ll/ۨ᩻;-><init>(Landroid/content/Context;Ll/ۗ᩻;)V

    .line 201
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final ۧ(Ll/ۗ᩻;Landroid/view/Menu;)Z
    .locals 4

    .line 157
    invoke-virtual {p0, p1}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;)Ll/ۨ᩻;

    move-result-object p1

    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Ll/ۛ᩻;->ܽ:Ll/ۗ᩵;

    invoke-virtual {v1, p2, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 180
    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Ll/᩷᩷;

    iget-object v2, p0, Ll/ۛ᩻;->ۧ:Landroid/content/Context;

    move-object v3, p2

    check-cast v3, Ll/᩺۬;

    invoke-direct {v0, v2, v3}, Ll/᩷᩷;-><init>(Landroid/content/Context;Ll/᩺۬;)V

    .line 183
    invoke-virtual {v1, p2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    :cond_0
    iget-object p2, p0, Ll/ۛ᩻;->ᩳ:Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
