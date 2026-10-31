.class public final Lcom/google/android/material/navigation/NavigationBarMenu;
.super Ll/ۗۜ;
.source "NavigationBarMenu.java"


# instance fields
.field public final maxItemCount:I

.field public final viewClass:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    .line 45
    iput-object p2, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->viewClass:Ljava/lang/Class;

    .line 46
    iput p3, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->maxItemCount:I

    return-void
.end method


# virtual methods
.method public addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 3

    .line 65
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->maxItemCount:I

    if-gt v0, v2, :cond_1

    .line 76
    invoke-virtual {p0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 77
    invoke-super {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    .line 78
    instance-of p2, p1, Ll/ۛۜ;

    if-eqz p2, :cond_0

    .line 79
    move-object p2, p1

    check-cast p2, Ll/ۛۜ;

    invoke-virtual {p2, v1}, Ll/ۛۜ;->ܽ(Z)V

    .line 81
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return-object p1

    .line 66
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->viewClass:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 67
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Maximum number of items supported by "

    const-string p4, " is "

    .line 0
    invoke-static {p3, p1, p4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 67
    iget p4, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->maxItemCount:I

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ". Limit can be checked with "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "#getMaxItemCount()"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 57
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object p2, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->viewClass:Ljava/lang/Class;

    .line 58
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string p3, " does not support submenus"

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getMaxItemCount()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenu;->maxItemCount:I

    return v0
.end method
