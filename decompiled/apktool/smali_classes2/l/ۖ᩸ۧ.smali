.class public abstract Ll/ۖ᩸ۧ;
.super Landroid/app/Fragment;
.source "X58A"

# interfaces
.implements Ll/ᩳ᩹ۧ;
.implements Ll/ۧ᩹ۧ;
.implements Ll/ܽ᩹ۧ;
.implements Ll/֫ܶۧ;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ۗ:Ll/ܿ᩹ۧ;

.field public ۙ:Ll/۬۬ۧ;

.field public ۫:Landroid/view/ContextThemeWrapper;

.field public final ۬:Ljava/lang/Runnable;

.field public ᩶:I

.field public final ᩸:Ll/᩷᩸ۧ;

.field public final ᩹:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 96
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 119
    new-instance v0, Ll/᩷᩸ۧ;

    invoke-direct {v0, p0}, Ll/᩷᩸ۧ;-><init>(Ll/ۖ᩸ۧ;)V

    iput-object v0, p0, Ll/ۖ᩸ۧ;->᩸:Ll/᩷᩸ۧ;

    const v0, 0x7f0d01bd

    .line 125
    iput v0, p0, Ll/ۖ᩸ۧ;->᩶:I

    .line 128
    new-instance v0, Ll/᩻᩸ۧ;

    invoke-direct {v0, p0}, Ll/᩻᩸ۧ;-><init>(Ll/ۖ᩸ۧ;)V

    iput-object v0, p0, Ll/ۖ᩸ۧ;->᩹:Landroid/os/Handler;

    .line 140
    new-instance v0, Ll/ۜ᩸ۧ;

    invoke-direct {v0, p0}, Ll/ۜ᩸ۧ;-><init>(Ll/ۖ᩸ۧ;)V

    iput-object v0, p0, Ll/ۖ᩸ۧ;->۬:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final findPreference(Ljava/lang/String;)Ll/֫᩸ۧ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 484
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 487
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܿ᩹ۧ;->֫(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    return-object p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 149
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 150
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 151
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x7f0403cb

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 152
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    if-nez p1, :cond_0

    const p1, 0x7f1301b4

    .line 157
    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll/ۖ᩸ۧ;->۫:Landroid/view/ContextThemeWrapper;

    .line 159
    new-instance p1, Ll/ܿ᩹ۧ;

    invoke-direct {p1, v0}, Ll/ܿ᩹ۧ;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    .line 160
    invoke-virtual {p1, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ܽ᩹ۧ;)V

    .line 161
    invoke-virtual {p0}, Landroid/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 164
    invoke-virtual {p0}, Landroid/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    :cond_1
    invoke-virtual {p0}, Ll/ۖ᩸ۧ;->ۧ()V

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 191
    iget-object p3, p0, Ll/ۖ᩸ۧ;->۫:Landroid/view/ContextThemeWrapper;

    const v0, 0x7f0403c7

    const v1, 0x1010506

    .line 193
    invoke-static {p3, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    const/4 v1, 0x0

    .line 191
    sget-object v2, Ll/ۢ᩹ۧ;->ۜ:[I

    const/4 v3, 0x0

    invoke-virtual {p3, v1, v2, v0, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 196
    iget v0, p0, Ll/ۖ᩸ۧ;->᩶:I

    invoke-virtual {p3, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Ll/ۖ᩸ۧ;->᩶:I

    const/4 v0, 0x1

    .line 198
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, -0x1

    .line 199
    invoke-virtual {p3, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/4 v5, 0x3

    .line 201
    invoke-virtual {p3, v5, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 203
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 205
    iget-object p3, p0, Ll/ۖ᩸ۧ;->۫:Landroid/view/ContextThemeWrapper;

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 207
    iget p3, p0, Ll/ۖ᩸ۧ;->᩶:I

    invoke-virtual {p1, p3, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const p3, 0x102003f

    .line 209
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 210
    instance-of v5, p3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_3

    .line 215
    check-cast p3, Landroid/view/ViewGroup;

    .line 555
    iget-object v5, p0, Ll/ۖ᩸ۧ;->۫:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string v6, "android.hardware.type.automotive"

    invoke-virtual {v5, v6}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const v5, 0x7f0a0488

    .line 557
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬۬ۧ;

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const v5, 0x7f0d01bf

    .line 562
    invoke-virtual {p1, v5, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ll/۬۬ۧ;

    .line 583
    new-instance p1, Ll/ۜۗۧ;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {p1, v3}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;)V

    .line 565
    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 566
    new-instance p1, Ll/᩻᩹ۧ;

    invoke-direct {p1, v5}, Ll/᩻᩹ۧ;-><init>(Ll/۬۬ۧ;)V

    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->setAccessibilityDelegateCompat(Ll/ۤ۬ۧ;)V

    .line 223
    :goto_0
    iput-object v5, p0, Ll/ۖ᩸ۧ;->ۙ:Ll/۬۬ۧ;

    .line 225
    iget-object p1, p0, Ll/ۖ᩸ۧ;->᩸:Ll/᩷᩸ۧ;

    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->addItemDecoration(Ll/۟ۗۧ;)V

    .line 255
    invoke-virtual {p1, v1}, Ll/᩷᩸ۧ;->֫(Landroid/graphics/drawable/Drawable;)V

    if-eq v2, v4, :cond_1

    .line 269
    invoke-virtual {p1, v2}, Ll/᩷᩸ۧ;->֫(I)V

    .line 230
    :cond_1
    invoke-virtual {p1, v0}, Ll/᩷᩸ۧ;->ۧ(Z)V

    .line 234
    iget-object p1, p0, Ll/ۖ᩸ۧ;->ۙ:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_2

    .line 235
    iget-object p1, p0, Ll/ۖ᩸ۧ;->ۙ:Ll/۬۬ۧ;

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    :cond_2
    iget-object p1, p0, Ll/ۖ᩸ۧ;->᩹:Landroid/os/Handler;

    iget-object p3, p0, Ll/ۖ᩸ۧ;->۬:Ljava/lang/Runnable;

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p2

    .line 211
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Content has view with id attribute \'android.R.id.list_container\' that is not a ViewGroup class"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onDestroyView()V
    .locals 2

    .line 313
    iget-object v0, p0, Ll/ۖ᩸ۧ;->۬:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/ۖ᩸ۧ;->᩹:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    .line 314
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x0

    .line 318
    iput-object v0, p0, Ll/ۖ᩸ۧ;->ۙ:Ll/۬۬ۧ;

    .line 319
    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 324
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 373
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 328
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2019
    invoke-virtual {v0, v1}, Ll/ۗ᩸ۧ;->ۧ(Landroid/os/Bundle;)V

    const-string v0, "android:preferences"

    .line 330
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 299
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 300
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ᩳ᩹ۧ;)V

    .line 301
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ۧ᩹ۧ;)V

    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 306
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 307
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿ᩹ۧ;->֫(Ll/ᩳ᩹ۧ;)V

    .line 308
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, v1}, Ll/ܿ᩹ۧ;->֫(Ll/ۧ᩹ۧ;)V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 274
    invoke-super {p0, p1, p2}, Landroid/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    if-eqz p2, :cond_0

    const-string p1, "android:preferences"

    .line 277
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 373
    iget-object p2, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {p2}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2070
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->֫(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 373
    iget-object v0, p0, Ll/ۖ᩸ۧ;->ۗ:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 531
    iget-object v1, p0, Ll/ۖ᩸ۧ;->ۙ:Ll/۬۬ۧ;

    .line 597
    new-instance v2, Ll/ۛ᩸ۧ;

    invoke-direct {v2, v0}, Ll/ۛ᩸ۧ;-><init>(Ll/ۜ᩹ۧ;)V

    .line 504
    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 505
    invoke-virtual {v0}, Ll/ۗ᩸ۧ;->ۤ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜ᩹ۧ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 465
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of p1, p1, Ll/ܺ᩸ۧ;

    if-eqz p1, :cond_0

    .line 466
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ܺ᩸ۧ;

    .line 467
    invoke-interface {p1}, Ll/ܺ᩸ۧ;->֫()Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧܶۧ;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 618
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Ll/ۢ᩸ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 619
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/ۢ᩸ۧ;

    .line 620
    invoke-interface {v0}, Ll/ۢ᩸ۧ;->֫()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 628
    :cond_1
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v2, "androidx.preference.PreferenceFragment.DIALOG"

    invoke-virtual {v0, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_1
    return-void

    .line 633
    :cond_2
    instance-of v0, p1, Ll/ۜܶۧ;

    const-string v3, "key"

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    .line 634
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 55
    new-instance v0, Ll/᩷ܶۧ;

    invoke-direct {v0}, Ll/᩷ܶۧ;-><init>()V

    .line 56
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 57
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, v5}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    goto :goto_2

    .line 635
    :cond_3
    instance-of v0, p1, Ll/᩵ܶۧ;

    if-eqz v0, :cond_4

    .line 636
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 53
    new-instance v0, Ll/ۚܶۧ;

    invoke-direct {v0}, Ll/ۚܶۧ;-><init>()V

    .line 54
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 55
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-virtual {v0, v5}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    goto :goto_2

    .line 637
    :cond_4
    instance-of v0, p1, Ll/᩹ܶۧ;

    if-eqz v0, :cond_5

    .line 638
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 61
    new-instance v0, Ll/ۙܶۧ;

    invoke-direct {v0}, Ll/ۙܶۧ;-><init>()V

    .line 63
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 64
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0, v5}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 643
    :goto_2
    invoke-virtual {v0, p0, v1}, Landroid/app/Fragment;->setTargetFragment(Landroid/app/Fragment;I)V

    .line 644
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void

    .line 640
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫᩸ۧ;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 431
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ܿ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 437
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of p1, p1, Ll/ۡ᩸ۧ;

    if-eqz p1, :cond_0

    .line 438
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۡ᩸ۧ;

    .line 439
    invoke-interface {p1}, Ll/ۡ᩸ۧ;->֫()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ۧ()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
