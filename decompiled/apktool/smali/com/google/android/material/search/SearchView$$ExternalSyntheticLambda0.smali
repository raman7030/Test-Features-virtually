.class public final synthetic Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "SearchView"

# interfaces
.implements Ll/ܽۨ;


# instance fields
.field public final synthetic f$0:Landroid/view/ViewGroup$MarginLayoutParams;

.field public final synthetic f$1:I

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$0:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$1:I

    iput p3, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 3

    .line 0
    iget v0, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$1:I

    iget v1, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$2:I

    iget-object v2, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;->f$0:Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {v2, v0, v1, p1, p2}, Lcom/google/android/material/search/SearchView;->$r8$lambda$TmMG7_lw4sF4o7J33Ph3cDNw2tw(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method
