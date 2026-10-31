.class public abstract Ll/᩸᩸ۧ;
.super Ll/ۡ᩻֫;
.source "I5JQ"

# interfaces
.implements Ll/ᩳ᩹ۧ;
.implements Ll/ۧ᩹ۧ;
.implements Ll/ܽ᩹ۧ;
.implements Ll/֫ܶۧ;


# instance fields
.field public ۗ:I

.field public ۙ:Z

.field public ۛ:Ljava/lang/Runnable;

.field public final ۤ:Ljava/lang/Runnable;

.field public ۫:Ll/ܿ᩹ۧ;

.field public ۬:Ll/۬۬ۧ;

.field public ᩶:Z

.field public final ᩸:Ll/֡᩸ۧ;

.field public final ᩹:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 91
    invoke-direct {p0}, Ll/ۡ᩻֫;-><init>()V

    .line 113
    new-instance v0, Ll/֡᩸ۧ;

    invoke-direct {v0, p0}, Ll/֡᩸ۧ;-><init>(Ll/᩸᩸ۧ;)V

    iput-object v0, p0, Ll/᩸᩸ۧ;->᩸:Ll/֡᩸ۧ;

    const v0, 0x7f0d01bd

    .line 119
    iput v0, p0, Ll/᩸᩸ۧ;->ۗ:I

    .line 122
    new-instance v0, Ll/ۘ᩸ۧ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۘ᩸ۧ;-><init>(Ll/᩸᩸ۧ;Landroid/os/Looper;)V

    iput-object v0, p0, Ll/᩸᩸ۧ;->᩹:Landroid/os/Handler;

    .line 133
    new-instance v0, Ll/ᩴ᩸ۧ;

    invoke-direct {v0, p0}, Ll/ᩴ᩸ۧ;-><init>(Ll/᩸᩸ۧ;)V

    iput-object v0, p0, Ll/᩸᩸ۧ;->ۤ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final findPreference(Ljava/lang/String;)Ll/֫᩸ۧ;
    .locals 1

    .line 499
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 502
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܿ᩹ۧ;->֫(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    return-object p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 142
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 143
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 144
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x7f0403cb

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 145
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    if-nez p1, :cond_0

    const p1, 0x7f1301b4

    .line 150
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 152
    new-instance p1, Ll/ܿ᩹ۧ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܿ᩹ۧ;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    .line 153
    invoke-virtual {p1, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ܽ᩹ۧ;)V

    .line 154
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 157
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    :cond_1
    invoke-virtual {p0}, Ll/᩸᩸ۧ;->ܿ()V

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 182
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p3

    const/4 v0, 0x0

    sget-object v1, Ll/ۢ᩹ۧ;->᩷:[I

    const v2, 0x7f0403c5

    const/4 v3, 0x0

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 187
    iget v0, p0, Ll/᩸᩸ۧ;->ۗ:I

    invoke-virtual {p3, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Ll/᩸᩸ۧ;->ۗ:I

    const/4 v0, 0x1

    .line 190
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, -0x1

    .line 192
    invoke-virtual {p3, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/4 v5, 0x3

    .line 194
    invoke-virtual {p3, v5, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 197
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 199
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 201
    iget p3, p0, Ll/᩸᩸ۧ;->ۗ:I

    invoke-virtual {p1, p3, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const p3, 0x102003f

    .line 203
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 204
    instance-of v5, p3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_3

    .line 209
    check-cast p3, Landroid/view/ViewGroup;

    .line 572
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string v6, "android.hardware.type.automotive"

    invoke-virtual {v5, v6}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const v5, 0x7f0a0488

    .line 574
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬۬ۧ;

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const v5, 0x7f0d01bf

    .line 580
    invoke-virtual {p1, v5, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ll/۬۬ۧ;

    .line 597
    new-instance p1, Ll/ۜۗۧ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p1, v3}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;)V

    .line 582
    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 583
    new-instance p1, Ll/᩻᩹ۧ;

    invoke-direct {p1, v5}, Ll/᩻᩹ۧ;-><init>(Ll/۬۬ۧ;)V

    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->setAccessibilityDelegateCompat(Ll/ۤ۬ۧ;)V

    .line 217
    :goto_0
    iput-object v5, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    .line 219
    iget-object p1, p0, Ll/᩸᩸ۧ;->᩸:Ll/֡᩸ۧ;

    invoke-virtual {v5, p1}, Ll/۬۬ۧ;->addItemDecoration(Ll/۟ۗۧ;)V

    .line 246
    invoke-virtual {p1, v1}, Ll/֡᩸ۧ;->֫(Landroid/graphics/drawable/Drawable;)V

    if-eq v2, v4, :cond_1

    .line 257
    invoke-virtual {p1, v2}, Ll/֡᩸ۧ;->֫(I)V

    .line 224
    :cond_1
    invoke-virtual {p1, v0}, Ll/֡᩸ۧ;->ۧ(Z)V

    .line 228
    iget-object p1, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_2

    .line 229
    iget-object p1, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 231
    :cond_2
    iget-object p1, p0, Ll/᩸᩸ۧ;->᩹:Landroid/os/Handler;

    iget-object p3, p0, Ll/᩸᩸ۧ;->ۤ:Ljava/lang/Runnable;

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p2

    .line 205
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Content has view with id attribute \'android.R.id.list_container\' that is not a ViewGroup class"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onDestroyView()V
    .locals 2

    .line 301
    iget-object v0, p0, Ll/᩸᩸ۧ;->ۤ:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/᩸᩸ۧ;->᩹:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    .line 302
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 303
    iget-boolean v0, p0, Ll/᩸᩸ۧ;->᩶:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 550
    iget-object v0, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    .line 527
    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 337
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 530
    invoke-virtual {v0}, Ll/ۗ᩸ۧ;->ۨ()V

    .line 306
    :cond_0
    iput-object v1, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    .line 307
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 312
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 337
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 316
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2019
    invoke-virtual {v0, v1}, Ll/ۗ᩸ۧ;->ۧ(Landroid/os/Bundle;)V

    const-string v0, "android:preferences"

    .line 318
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 287
    invoke-super {p0}, Ll/ۡ᩻֫;->onStart()V

    .line 288
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ᩳ᩹ۧ;)V

    .line 289
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ۧ᩹ۧ;)V

    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 294
    invoke-super {p0}, Ll/ۡ᩻֫;->onStop()V

    .line 295
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿ᩹ۧ;->֫(Ll/ᩳ᩹ۧ;)V

    .line 296
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, v1}, Ll/ܿ᩹ۧ;->֫(Ll/ۧ᩹ۧ;)V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 262
    invoke-super {p0, p1, p2}, Ll/ۡ᩻֫;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    if-eqz p2, :cond_0

    const-string p1, "android:preferences"

    .line 265
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 337
    iget-object p2, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {p2}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2070
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->֫(Landroid/os/Bundle;)V

    .line 274
    :cond_0
    iget-boolean p1, p0, Ll/᩸᩸ۧ;->᩶:Z

    if-eqz p1, :cond_1

    .line 275
    invoke-virtual {p0}, Ll/᩸᩸ۧ;->ۧ()V

    .line 276
    iget-object p1, p0, Ll/᩸᩸ۧ;->ۛ:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    .line 277
    check-cast p1, Ll/᩵᩸ۧ;

    invoke-virtual {p1}, Ll/᩵᩸ۧ;->run()V

    const/4 p1, 0x0

    .line 278
    iput-object p1, p0, Ll/᩸᩸ۧ;->ۛ:Ljava/lang/Runnable;

    :cond_1
    const/4 p1, 0x1

    .line 282
    iput-boolean p1, p0, Ll/᩸᩸ۧ;->ۙ:Z

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 506
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    if-eqz v0, :cond_2

    .line 364
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    .line 337
    iget-object v2, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v2}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v2

    .line 364
    invoke-virtual {v0, v1, p1, v2}, Ll/ܿ᩹ۧ;->֫(Landroid/content/Context;ILl/ۜ᩹ۧ;)Ll/ۜ᩹ۧ;

    move-result-object p1

    .line 346
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0, p1}, Ll/ܿ᩹ۧ;->֫(Ll/ۜ᩹ۧ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 348
    iput-boolean p1, p0, Ll/᩸᩸ۧ;->᩶:Z

    .line 349
    iget-boolean v0, p0, Ll/᩸᩸ۧ;->ۙ:Z

    if-eqz v0, :cond_1

    .line 512
    iget-object v0, p0, Ll/᩸᩸ۧ;->᩹:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 513
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    :goto_0
    return-void

    .line 507
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "This should be called after super.onCreate."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۜ᩹ۧ;)V
    .locals 2

    const/4 p1, 0x0

    move-object v0, p0

    :goto_0
    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    .line 477
    instance-of v1, v0, Ll/۠᩸ۧ;

    if-eqz v1, :cond_0

    .line 478
    move-object p1, v0

    check-cast p1, Ll/۠᩸ۧ;

    .line 479
    invoke-interface {p1}, Ll/۠᩸ۧ;->֫()Z

    move-result p1

    .line 481
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getParentFragment()Ll/ۡ᩻֫;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 483
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Ll/۠᩸ۧ;

    if-eqz v0, :cond_2

    .line 484
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Ll/۠᩸ۧ;

    .line 485
    invoke-interface {p1}, Ll/۠᩸ۧ;->֫()Z

    move-result p1

    :cond_2
    if-nez p1, :cond_3

    .line 489
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object p1

    instance-of p1, p1, Ll/۠᩸ۧ;

    if-eqz p1, :cond_3

    .line 490
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/۠᩸ۧ;

    .line 491
    invoke-interface {p1}, Ll/۠᩸ۧ;->֫()Z

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۧܶۧ;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, p0

    :goto_0
    if-nez v1, :cond_1

    if-eqz v2, :cond_1

    .line 632
    instance-of v3, v2, Ll/ۚ᩸ۧ;

    if-eqz v3, :cond_0

    .line 633
    move-object v1, v2

    check-cast v1, Ll/ۚ᩸ۧ;

    .line 634
    invoke-interface {v1}, Ll/ۚ᩸ۧ;->֫()Z

    move-result v1

    .line 636
    :cond_0
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getParentFragment()Ll/ۡ᩻֫;

    move-result-object v2

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    .line 638
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Ll/ۚ᩸ۧ;

    if-eqz v2, :cond_2

    .line 639
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Ll/ۚ᩸ۧ;

    .line 640
    invoke-interface {v1}, Ll/ۚ᩸ۧ;->֫()Z

    move-result v1

    :cond_2
    if-nez v1, :cond_3

    .line 644
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v2

    instance-of v2, v2, Ll/ۚ᩸ۧ;

    if-eqz v2, :cond_3

    .line 645
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ۚ᩸ۧ;

    .line 646
    invoke-interface {v1}, Ll/ۚ᩸ۧ;->֫()Z

    move-result v1

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_1

    .line 654
    :cond_4
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v1

    const-string v2, "androidx.preference.PreferenceFragment.DIALOG"

    invoke-virtual {v1, v2}, Ll/ۚۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v1

    if-eqz v1, :cond_5

    :goto_1
    return-void

    .line 659
    :cond_5
    instance-of v1, p1, Ll/ۜܶۧ;

    const-string v3, "key"

    const/4 v4, 0x1

    if-eqz v1, :cond_6

    .line 660
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 52
    new-instance v1, Ll/ۡܶۧ;

    invoke-direct {v1}, Ll/ۡܶۧ;-><init>()V

    .line 53
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 54
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1, v5}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    goto :goto_2

    .line 661
    :cond_6
    instance-of v1, p1, Ll/᩵ܶۧ;

    if-eqz v1, :cond_7

    .line 662
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 40
    new-instance v1, Ll/۠ܶۧ;

    invoke-direct {v1}, Ll/۠ܶۧ;-><init>()V

    .line 42
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 43
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v1, v5}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    goto :goto_2

    .line 663
    :cond_7
    instance-of v1, p1, Ll/᩹ܶۧ;

    if-eqz v1, :cond_8

    .line 664
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    .line 52
    new-instance v1, Ll/۬ܶۧ;

    invoke-direct {v1}, Ll/۬ܶۧ;-><init>()V

    .line 54
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 55
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-virtual {v1, v5}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    .line 672
    :goto_2
    invoke-virtual {v1, p0, v0}, Ll/ۡ᩻֫;->setTargetFragment(Ll/ۡ᩻֫;I)V

    .line 673
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Ll/ۤܳ֫;->show(Ll/ۚۜ֫;Ljava/lang/String;)V

    return-void

    .line 666
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot display dialog for an unknown Preference type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 668
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/֫᩸ۧ;)Z
    .locals 5

    .line 403
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ܿ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move-object v2, p0

    :goto_0
    if-nez v0, :cond_1

    if-eqz v2, :cond_1

    .line 414
    instance-of v3, v2, Ll/֨᩸ۧ;

    if-eqz v3, :cond_0

    .line 415
    move-object v0, v2

    check-cast v0, Ll/֨᩸ۧ;

    .line 416
    invoke-interface {v0, p0, p1}, Ll/֨᩸ۧ;->֫(Ll/᩸᩸ۧ;Ll/֫᩸ۧ;)Z

    move-result v0

    .line 418
    :cond_0
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getParentFragment()Ll/ۡ᩻֫;

    move-result-object v2

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 420
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Ll/֨᩸ۧ;

    if-eqz v2, :cond_2

    .line 421
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Ll/֨᩸ۧ;

    .line 422
    invoke-interface {v0, p0, p1}, Ll/֨᩸ۧ;->֫(Ll/᩸᩸ۧ;Ll/֫᩸ۧ;)Z

    move-result v0

    :cond_2
    if-nez v0, :cond_3

    .line 426
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v2

    instance-of v2, v2, Ll/֨᩸ۧ;

    if-eqz v2, :cond_3

    .line 427
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/֨᩸ۧ;

    .line 428
    invoke-interface {v0, p0, p1}, Ll/֨᩸ۧ;->֫(Ll/᩸᩸ۧ;Ll/֫᩸ۧ;)Z

    move-result v0

    :cond_3
    if-nez v0, :cond_4

    .line 437
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    .line 438
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۧ()Landroid/os/Bundle;

    move-result-object v2

    .line 439
    invoke-virtual {v0}, Ll/ۚۜ֫;->ۚ()Ll/᩶᩻֫;

    move-result-object v3

    .line 440
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ܿ()Ljava/lang/String;

    move-result-object p1

    .line 439
    invoke-virtual {v3, p1}, Ll/᩶᩻֫;->֫(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    .line 441
    invoke-virtual {p1, v2}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    .line 442
    invoke-virtual {p1, p0, v1}, Ll/ۡ᩻֫;->setTargetFragment(Ll/ۡ᩻֫;I)V

    .line 443
    invoke-virtual {v0}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object v0

    .line 447
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, 0x0

    .line 349
    invoke-virtual {v0, v1, p1, v2}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;)V

    .line 448
    invoke-virtual {v0}, Ll/ܽ᩷֫;->֫()V

    .line 449
    invoke-virtual {v0}, Ll/ܽ᩷֫;->ۧ()I

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    return v1
.end method

.method public final ۧ()V
    .locals 3

    .line 337
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 550
    iget-object v1, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    .line 608
    new-instance v2, Ll/ۛ᩸ۧ;

    invoke-direct {v2, v0}, Ll/ۛ᩸ۧ;-><init>(Ll/ۜ᩹ۧ;)V

    .line 520
    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 521
    invoke-virtual {v0}, Ll/ۗ᩸ۧ;->ۤ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 698
    new-instance v0, Ll/᩵᩸ۧ;

    invoke-direct {v0, p0, p1}, Ll/᩵᩸ۧ;-><init>(Ll/᩸᩸ۧ;Ljava/lang/String;)V

    .line 729
    iget-object p1, p0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    if-nez p1, :cond_0

    .line 730
    iput-object v0, p0, Ll/᩸᩸ۧ;->ۛ:Ljava/lang/Runnable;

    return-void

    .line 732
    :cond_0
    invoke-virtual {v0}, Ll/᩵᩸ۧ;->run()V

    return-void
.end method

.method public final ܽ()Ll/ܿ᩹ۧ;
    .locals 1

    .line 328
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    return-object v0
.end method

.method public abstract ܿ()V
.end method

.method public final ᩳ()Ll/ۜ᩹ۧ;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/᩸᩸ۧ;->۫:Ll/ܿ᩹ۧ;

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܿ()Ll/ۜ᩹ۧ;

    move-result-object v0

    return-object v0
.end method
