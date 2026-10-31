.class public final Ll/ܰ۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# instance fields
.field public final synthetic ֫:Ll/ۗܺ᩷;

.field public final synthetic ۜ:Landroid/view/View;

.field public final synthetic ۧ:Ll/ۡ۫᩻;

.field public final synthetic ܳ:Ll/ܳ۫᩻;

.field public final synthetic ܽ:Ll/ۗ۬᩻;

.field public final synthetic ܿ:[Landroid/view/View;

.field public final synthetic ᩳ:Ll/֡ۚۢ;

.field public final synthetic ᩻:Ll/ܺ۫᩻;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ۗܺ᩷;Ll/֡ۚۢ;Ll/ܳ۫᩻;Ll/ܺ۫᩻;[Landroid/view/View;Ll/ۗ۬᩻;Ll/ۡ۫᩻;)V
    .locals 0

    .line 468
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۫᩻;->ۜ:Landroid/view/View;

    iput-object p2, p0, Ll/ܰ۫᩻;->֫:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ܰ۫᩻;->ᩳ:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ܰ۫᩻;->ܳ:Ll/ܳ۫᩻;

    iput-object p5, p0, Ll/ܰ۫᩻;->᩻:Ll/ܺ۫᩻;

    iput-object p6, p0, Ll/ܰ۫᩻;->ܿ:[Landroid/view/View;

    iput-object p7, p0, Ll/ܰ۫᩻;->ܽ:Ll/ۗ۬᩻;

    iput-object p8, p0, Ll/ܰ۫᩻;->ۧ:Ll/ۡ۫᩻;

    return-void
.end method


# virtual methods
.method public final onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public final onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 4

    .line 471
    iget-object v0, p0, Ll/ܰ۫᩻;->ۜ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 473
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 474
    iget-object v1, p0, Ll/ܰ۫᩻;->֫:Ll/ۗܺ᩷;

    const-string v3, "input_method"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 475
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 477
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    .line 478
    iget-object v0, p0, Ll/ܰ۫᩻;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    const/4 v3, 0x2

    if-lt p1, v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 479
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x3

    if-ne p1, v1, :cond_2

    const v2, 0x7f12057b

    goto :goto_1

    :cond_2
    const v2, 0x7f12056d

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 480
    iget-object v0, p0, Ll/ܰ۫᩻;->ܳ:Ll/ܳ۫᩻;

    invoke-virtual {v0}, Ll/ܳ۫᩻;->run()V

    .line 481
    :cond_3
    iget-object v0, p0, Ll/ܰ۫᩻;->ܿ:[Landroid/view/View;

    if-ne p1, v3, :cond_4

    .line 482
    iget-object v2, p0, Ll/ܰ۫᩻;->᩻:Ll/ܺ۫᩻;

    invoke-virtual {v2}, Ll/ܺ۫᩻;->run()V

    .line 483
    aget-object v2, v0, v3

    const v3, 0x7f0a04c3

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۖۢۡ;

    .line 484
    invoke-virtual {v2}, Ll/ۖۢۡ;->᩻()V

    :cond_4
    if-ne p1, v1, :cond_5

    .line 487
    iget-object p1, p0, Ll/ܰ۫᩻;->ܽ:Ll/ۗ۬᩻;

    invoke-virtual {p1}, Ll/ۗ۬᩻;->ܽ()V

    .line 488
    aget-object p1, v0, v1

    const v0, 0x7f0a007d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۖۢۡ;

    .line 489
    invoke-virtual {p1}, Ll/ۖۢۡ;->᩻()V

    :cond_5
    return-void
.end method

.method public final onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 495
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ܰ۫᩻;->ۧ:Ll/ۡ۫᩻;

    invoke-virtual {p1}, Ll/ۡ۫᩻;->run()V

    :cond_0
    return-void
.end method
