.class public final Ll/ᩳܿۢ;
.super Ljava/lang/Object;
.source "81J9"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# instance fields
.field public final synthetic ֫:Ll/᩻ܿۢ;


# direct methods
.method public constructor <init>(Ll/᩻ܿۢ;)V
    .locals 0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܿۢ;->֫:Ll/᩻ܿۢ;

    return-void
.end method


# virtual methods
.method public final onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 3

    .line 189
    iget-object v0, p0, Ll/ᩳܿۢ;->֫:Ll/᩻ܿۢ;

    invoke-static {v0}, Ll/᩻ܿۢ;->ܽ(Ll/᩻ܿۢ;)Ll/֡ܰۧ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RecyclerView"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 191
    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public final onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public final onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
