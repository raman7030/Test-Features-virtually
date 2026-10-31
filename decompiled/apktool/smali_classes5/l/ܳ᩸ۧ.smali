.class public abstract Ll/ܳ᩸ۧ;
.super Ll/ۤܳ֫;
.source "W5LS"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public ۗ:Ljava/lang/CharSequence;

.field public ۙ:Ljava/lang/CharSequence;

.field public ۤ:I

.field public ۫:Ll/ۧܶۧ;

.field public ۬:Ljava/lang/CharSequence;

.field public ᩶:Ljava/lang/CharSequence;

.field public ᩸:Landroid/graphics/drawable/BitmapDrawable;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ll/ۤܳ֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 285
    iput p2, p0, Ll/ܳ᩸ۧ;->ۤ:I

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 81
    invoke-super {p0, p1}, Ll/ۤܳ֫;->onCreate(Landroid/os/Bundle;)V

    .line 83
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getTargetFragment()Ll/ۡ᩻֫;

    move-result-object v0

    .line 84
    instance-of v1, v0, Ll/֫ܶۧ;

    if-eqz v1, :cond_4

    .line 89
    check-cast v0, Ll/֫ܶۧ;

    .line 92
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "key"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_2

    .line 94
    invoke-interface {v0, v1}, Ll/֫ܶۧ;->findPreference(Ljava/lang/String;)Ll/֫᩸ۧ;

    move-result-object p1

    check-cast p1, Ll/ۧܶۧ;

    iput-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    .line 95
    invoke-virtual {p1}, Ll/ۧܶۧ;->ܺ֫()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩸ۧ;->ۙ:Ljava/lang/CharSequence;

    .line 96
    iget-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    invoke-virtual {p1}, Ll/ۧܶۧ;->ۘ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩸ۧ;->۬:Ljava/lang/CharSequence;

    .line 97
    iget-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    invoke-virtual {p1}, Ll/ۧܶۧ;->ۖ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩸ۧ;->ۗ:Ljava/lang/CharSequence;

    .line 98
    iget-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    invoke-virtual {p1}, Ll/ۧܶۧ;->ۡ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩸ۧ;->᩶:Ljava/lang/CharSequence;

    .line 99
    iget-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    invoke-virtual {p1}, Ll/ۧܶۧ;->ۢ֫()I

    move-result p1

    iput p1, p0, Ll/ܳ᩸ۧ;->᩹:I

    .line 101
    iget-object p1, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    invoke-virtual {p1}, Ll/ۧܶۧ;->ۜ֫()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 102
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 106
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 105
    invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 107
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 108
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    invoke-virtual {p1, v2, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 109
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 110
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object p1, p0, Ll/ܳ᩸ۧ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    return-void

    .line 103
    :cond_1
    :goto_0
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    iput-object p1, p0, Ll/ܳ᩸ۧ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    return-void

    :cond_2
    const-string v0, "PreferenceDialogFragment.title"

    .line 113
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ۧ;->ۙ:Ljava/lang/CharSequence;

    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 114
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ۧ;->۬:Ljava/lang/CharSequence;

    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 115
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ۧ;->ۗ:Ljava/lang/CharSequence;

    const-string v0, "PreferenceDialogFragment.message"

    .line 116
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩸ۧ;->᩶:Ljava/lang/CharSequence;

    const-string v0, "PreferenceDialogFragment.layout"

    .line 117
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ܳ᩸ۧ;->᩹:I

    const-string v0, "PreferenceDialogFragment.icon"

    .line 118
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_3

    .line 120
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Ll/ܳ᩸ۧ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    :cond_3
    return-void

    .line 85
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Target fragment must implement TargetFragment interface"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    const/4 p1, -0x2

    .line 142
    iput p1, p0, Ll/ܳ᩸ۧ;->ۤ:I

    .line 144
    new-instance p1, Ll/ᩴܿ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ᩴܿ;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Ll/ܳ᩸ۧ;->ۙ:Ljava/lang/CharSequence;

    .line 145
    invoke-virtual {p1, v0}, Ll/ᩴܿ;->setTitle(Ljava/lang/CharSequence;)Ll/ᩴܿ;

    move-result-object p1

    iget-object v0, p0, Ll/ܳ᩸ۧ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    .line 146
    invoke-virtual {p1, v0}, Ll/ᩴܿ;->setIcon(Landroid/graphics/drawable/Drawable;)Ll/ᩴܿ;

    move-result-object p1

    iget-object v0, p0, Ll/ܳ᩸ۧ;->۬:Ljava/lang/CharSequence;

    .line 147
    invoke-virtual {p1, v0, p0}, Ll/ᩴܿ;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    move-result-object p1

    iget-object v0, p0, Ll/ܳ᩸ۧ;->ۗ:Ljava/lang/CharSequence;

    .line 148
    invoke-virtual {p1, v0, p0}, Ll/ᩴܿ;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    move-result-object p1

    .line 150
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    .line 247
    iget v0, p0, Ll/ܳ᩸ۧ;->᩹:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 252
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 152
    invoke-virtual {p0, v1}, Ll/ܳ᩸ۧ;->֫(Landroid/view/View;)V

    .line 153
    invoke-virtual {p1, v1}, Ll/ᩴܿ;->setView(Landroid/view/View;)Ll/ᩴܿ;

    goto :goto_1

    .line 155
    :cond_1
    iget-object v0, p0, Ll/ܳ᩸ۧ;->᩶:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Ll/ᩴܿ;->setMessage(Ljava/lang/CharSequence;)Ll/ᩴܿ;

    .line 158
    :goto_1
    invoke-virtual {p0, p1}, Ll/ܳ᩸ۧ;->֫(Ll/ᩴܿ;)V

    .line 161
    invoke-virtual {p1}, Ll/ᩴܿ;->create()Ll/᩵ܿ;

    move-result-object p1

    .line 0
    instance-of v0, p0, Ll/ۡܶۧ;

    if-eqz v0, :cond_3

    .line 230
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 231
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_2

    .line 232
    invoke-static {v0}, Ll/ܿ᩸ۧ;->֫(Landroid/view/Window;)V

    return-object p1

    .line 234
    :cond_2
    invoke-virtual {p0}, Ll/ܳ᩸ۧ;->ܽ()V

    :cond_3
    return-object p1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 290
    invoke-super {p0, p1}, Ll/ۤܳ֫;->onDismiss(Landroid/content/DialogInterface;)V

    .line 291
    iget p1, p0, Ll/ܳ᩸ۧ;->ۤ:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Ll/ܳ᩸ۧ;->֫(Z)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 127
    invoke-super {p0, p1}, Ll/ۤܳ֫;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "PreferenceDialogFragment.title"

    .line 129
    iget-object v1, p0, Ll/ܳ᩸ۧ;->ۙ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 130
    iget-object v1, p0, Ll/ܳ᩸ۧ;->۬:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 131
    iget-object v1, p0, Ll/ܳ᩸ۧ;->ۗ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "PreferenceDialogFragment.message"

    .line 132
    iget-object v1, p0, Ll/ܳ᩸ۧ;->᩶:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "PreferenceDialogFragment.layout"

    .line 133
    iget v1, p0, Ll/ܳ᩸ۧ;->᩹:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 134
    iget-object v0, p0, Ll/ܳ᩸ۧ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    const-string v1, "PreferenceDialogFragment.icon"

    .line 135
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public ֫(Landroid/view/View;)V
    .locals 2

    const v0, 0x102000b

    .line 263
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 266
    iget-object v0, p0, Ll/ܳ᩸ۧ;->᩶:Ljava/lang/CharSequence;

    .line 269
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 270
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 271
    move-object v1, p1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    .line 277
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v0, :cond_2

    .line 278
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public ֫(Ll/ᩴܿ;)V
    .locals 0

    return-void
.end method

.method public abstract ֫(Z)V
.end method

.method public final ۧ()Ll/ۧܶۧ;
    .locals 2

    .line 177
    iget-object v0, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    if-nez v0, :cond_0

    .line 178
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "key"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 180
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getTargetFragment()Ll/ۡ᩻֫;

    move-result-object v1

    check-cast v1, Ll/֫ܶۧ;

    .line 181
    invoke-interface {v1, v0}, Ll/֫ܶۧ;->findPreference(Ljava/lang/String;)Ll/֫᩸ۧ;

    move-result-object v0

    check-cast v0, Ll/ۧܶۧ;

    iput-object v0, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    .line 183
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ۧ;->۫:Ll/ۧܶۧ;

    return-object v0
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method
