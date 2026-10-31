.class public Lcom/google/android/material/search/SearchView$Behavior;
.super Ll/ۛ᩸;
.source "SearchView.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1009
    invoke-direct {p0}, Ll/ۛ᩸;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1012
    invoke-direct {p0, p1, p2}, Ll/ۛ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onDependentViewChanged(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 1007
    check-cast p2, Lcom/google/android/material/search/SearchView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/search/SearchView$Behavior;->onDependentViewChanged(Ll/ᩳ᩹;Lcom/google/android/material/search/SearchView;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public onDependentViewChanged(Ll/ᩳ᩹;Lcom/google/android/material/search/SearchView;Landroid/view/View;)Z
    .locals 0

    .line 1018
    invoke-virtual {p2}, Lcom/google/android/material/search/SearchView;->isSetupWithSearchBar()Z

    move-result p1

    if-nez p1, :cond_0

    instance-of p1, p3, Lcom/google/android/material/search/SearchBar;

    if-eqz p1, :cond_0

    .line 1019
    check-cast p3, Lcom/google/android/material/search/SearchBar;

    invoke-virtual {p2, p3}, Lcom/google/android/material/search/SearchView;->setupWithSearchBar(Lcom/google/android/material/search/SearchBar;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
