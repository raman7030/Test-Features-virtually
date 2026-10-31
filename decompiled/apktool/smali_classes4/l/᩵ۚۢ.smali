.class public final Ll/᩵ۚۢ;
.super Ljava/lang/Object;
.source "K1Z9"


# instance fields
.field public final ֫:Ll/ᩴܿ;

.field public ۧ:Landroid/content/DialogInterface$OnShowListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    new-instance v0, Ll/ᩴܿ;

    invoke-direct {v0, p1}, Ll/ᩴܿ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡ۚۢ;
    .locals 2

    .line 384
    new-instance v0, Ll/֡ۚۢ;

    iget-object v1, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v1}, Ll/ᩴܿ;->create()Ll/᩵ܿ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֡ۚۢ;-><init>(Ll/᩵ܿ;)V

    .line 385
    iget-object v1, p0, Ll/᩵ۚۢ;->ۧ:Landroid/content/DialogInterface$OnShowListener;

    if-eqz v1, :cond_0

    .line 386
    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnShowListener;)V

    :cond_0
    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 226
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setMessage(I)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(IILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 341
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴܿ;->setSingleChoiceItems(IILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 306
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 286
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 291
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 371
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setView(Landroid/view/View;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Landroid/widget/BaseAdapter;Ll/֨᩶ܳ;)V
    .locals 1

    .line 316
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Landroid/widget/ListAdapter;Ll/ۚ۟ܳ;)V
    .locals 2

    const/4 v0, -0x1

    .line 356
    iget-object v1, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v1, p1, v0, p2}, Ll/ᩴܿ;->setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 231
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setMessage(Ljava/lang/CharSequence;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 266
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Ll/֡᩷᩷;)V
    .locals 0

    .line 296
    iput-object p1, p0, Ll/᩵ۚۢ;->ۧ:Landroid/content/DialogInterface$OnShowListener;

    return-void
.end method

.method public final ֫(Ll/֨᩷᩷;)V
    .locals 1

    .line 301
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 281
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setCancelable(Z)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 351
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴܿ;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 311
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V
    .locals 1

    .line 331
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴܿ;->setMultiChoiceItems([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ۧ()Landroid/content/Context;
    .locals 1

    .line 207
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0}, Ll/ᩴܿ;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 211
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setTitle(I)Ll/ᩴܿ;

    return-void
.end method

.method public final ۧ(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 261
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ۧ(Landroid/view/View;)V
    .locals 3

    .line 376
    new-instance v0, Landroid/widget/ScrollView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 377
    invoke-virtual {v0, p1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 378
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 379
    iget-object p1, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {p1, v0}, Ll/ᩴܿ;->setView(Landroid/view/View;)Ll/ᩴܿ;

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 216
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setTitle(Ljava/lang/CharSequence;)Ll/ᩴܿ;

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 276
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ܽ()Ll/֡ۚۢ;
    .locals 1

    .line 392
    invoke-virtual {p0}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 366
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1}, Ll/ᩴܿ;->setView(I)Ll/ᩴܿ;

    return-void
.end method

.method public final ܽ(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ܽ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 256
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method

.method public final ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 251
    iget-object v0, p0, Ll/᩵ۚۢ;->֫:Ll/ᩴܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܿ;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    return-void
.end method
