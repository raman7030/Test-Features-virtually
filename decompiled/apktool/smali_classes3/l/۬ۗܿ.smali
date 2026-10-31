.class public abstract Ll/۬ۗܿ;
.super Ljava/lang/Object;
.source "S5F9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final ۗ:Landroid/widget/TextView;

.field public final ۙ:Ll/ۤۤᩳ;

.field public final ۛ:Landroid/widget/TextView;

.field public final ۤ:Landroid/widget/TextView;

.field public ۨ:Landroid/view/View$OnClickListener;

.field public ۫:Z

.field public final ۬:Landroid/widget/FrameLayout;

.field public final ܰ:Landroid/widget/TextView;

.field public final ᩶:Ll/֡ۚۢ;

.field public final ᩸:Ll/ۗܺ᩷;

.field public final ᩹:Landroid/widget/Button;

.field public ᩺:Landroid/view/View$OnLongClickListener;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 5

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 222
    iput-boolean v0, p0, Ll/۬ۗܿ;->۫:Z

    .line 44
    iput-object p1, p0, Ll/۬ۗܿ;->᩸:Ll/ۗܺ᩷;

    const v1, 0x7f0d00a0

    .line 45
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0631

    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۬ۗܿ;->ܰ:Landroid/widget/TextView;

    const v2, 0x7f0a0199

    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    const v2, 0x7f0a03b2

    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    const v2, 0x7f0a03b5

    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۬ۗܿ;->ۛ:Landroid/widget/TextView;

    const v2, 0x7f0a017d

    .line 50
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    iput-object v2, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    const/4 v3, -0x1

    .line 51
    invoke-static {v2, v0, v3, v0, v3}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    const v4, 0x7f0a010e

    .line 52
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    iput-object v4, p0, Ll/۬ۗܿ;->۬:Landroid/widget/FrameLayout;

    const v4, 0x7f0a00a4

    .line 53
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Ll/۬ۗܿ;->᩹:Landroid/widget/Button;

    .line 55
    sget v4, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v4, Ll/᩵ۚۢ;

    invoke-direct {v4, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 56
    invoke-virtual {v4, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 57
    invoke-virtual {v4, v0}, Ll/᩵ۚۢ;->֫(Z)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 58
    invoke-virtual {v4, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    invoke-virtual {v4, p1, p0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eq p2, v3, :cond_0

    .line 60
    invoke-virtual {v4, p2, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 61
    :cond_0
    invoke-virtual {v4}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    .line 62
    new-instance p2, Ll/᩶ۗܿ;

    invoke-direct {p2, p0}, Ll/᩶ۗܿ;-><init>(Ll/۬ۗܿ;)V

    invoke-virtual {p1, p2}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 72
    invoke-virtual {p1, p0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 73
    new-instance p1, Ll/ۙۗܿ;

    invoke-direct {p1, p0}, Ll/ۙۗܿ;-><init>(Ll/۬ۗܿ;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۗܿ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static ֫(Ll/۬ۗܿ;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 74
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->֡֫()I

    move-result v1

    const v2, 0x2000f

    and-int/2addr v1, v2

    const v2, 0x20001

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x42

    if-eq p1, v1, :cond_1

    const/16 v1, 0xa0

    if-ne p1, v1, :cond_2

    .line 76
    :cond_1
    invoke-virtual {v0}, Ll/ۤۤᩳ;->᩵֫()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x6

    if-eq p1, v0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    .line 81
    :cond_3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    .line 82
    invoke-virtual {p0}, Ll/۬ۗܿ;->ᩴ()V

    :cond_4
    return p2
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const/4 p1, -0x2

    if-ne p2, p1, :cond_0

    .line 109
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۖ()V

    return-void

    .line 111
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۘ()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 414
    invoke-virtual {p0}, Ll/۬ۗܿ;->ᩴ()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public final ֡()V
    .locals 2

    .line 288
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void
.end method

.method public final ֨()V
    .locals 2

    const/4 v0, 0x1

    .line 149
    iget-object v1, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v1, v0}, Ll/ۤۤᩳ;->۬(I)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 365
    new-instance v0, Ll/ۗۗܿ;

    invoke-direct {v0, p0}, Ll/ۗۗܿ;-><init>(Ll/۬ۗܿ;)V

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 158
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 159
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۤۤᩳ;->᩷(II)V

    return-void
.end method

.method public final ֫(ILandroid/view/View$OnClickListener;Ll/᩻۟ܳ;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 238
    :cond_0
    iput-object p2, p0, Ll/۬ۗܿ;->ۨ:Landroid/view/View$OnClickListener;

    .line 239
    iput-object p3, p0, Ll/۬ۗܿ;->᩺:Landroid/view/View$OnLongClickListener;

    .line 240
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    iget-object p3, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    const/4 v0, -0x3

    invoke-virtual {p3, v0, p1, p2}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, 0x1

    .line 241
    iput-boolean p1, p0, Ll/۬ۗܿ;->۫:Z

    return-void
.end method

.method public final ֫(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 313
    iget-object v0, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final ֫(Landroid/text/TextWatcher;)V
    .locals 1

    .line 188
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 251
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 349
    iget-object v0, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 352
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 350
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 354
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܿ(Z)V

    return-void
.end method

.method public ۖ()V
    .locals 0

    return-void
.end method

.method public ۘ()V
    .locals 0

    return-void
.end method

.method public final ۚ()V
    .locals 2

    .line 102
    iget-object v0, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(Z)V

    return-void
.end method

.method public final ۜ()Landroid/widget/TextView;
    .locals 1

    .line 403
    iget-object v0, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ۜ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 266
    iget-object v1, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 267
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۠()V
    .locals 2

    .line 318
    iget-object v0, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method

.method public final ۡ(I)V
    .locals 1

    .line 335
    iget-object v0, p0, Ll/۬ۗܿ;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۡ()Z
    .locals 1

    .line 345
    iget-object v0, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 272
    iget-object v1, p0, Ll/۬ۗܿ;->ۛ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 273
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 193
    iget-object v0, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 359
    iget-object v1, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 360
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 340
    iget-object v0, p0, Ll/۬ۗܿ;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 256
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 3

    .line 209
    iget-object v0, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 210
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-boolean v1, p0, Ll/۬ۗܿ;->۫:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۬ۗܿ;->ۨ:Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_0

    .line 212
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    iget-object v2, p0, Ll/۬ۗܿ;->ۨ:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    :cond_0
    iget-boolean v1, p0, Ll/۬ۗܿ;->۫:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۬ۗܿ;->᩺:Landroid/view/View$OnLongClickListener;

    if-eqz v1, :cond_1

    .line 214
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/۬ۗܿ;->᩺:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 216
    iget-object p1, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final ܳ()Ll/۟᩺ᩳ;
    .locals 1

    .line 201
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 2

    .line 298
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x1

    new-array p1, p1, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->֫([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final ܶ()V
    .locals 2

    const/16 v0, 0x8

    .line 173
    iget-object v1, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v1, v0}, Ll/ۤۤᩳ;->ۗ(I)V

    return-void
.end method

.method public final ܺ()V
    .locals 2

    .line 123
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    const v1, 0x20001

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩹(I)V

    return-void
.end method

.method public final ܽ()Ll/ۗܺ᩷;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/۬ۗܿ;->᩸:Ll/ۗܺ᩷;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 399
    iget-object v0, p0, Ll/۬ۗܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 323
    iget-object v1, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 324
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->᩵(I)V

    return-void
.end method

.method public final ܿ()Landroid/widget/Button;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/۬ۗܿ;->᩹:Landroid/widget/Button;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 1

    .line 178
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->᩹(I)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 2

    .line 261
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    const/4 v1, 0x1

    .line 2070
    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩳ()Ll/֡ۚۢ;
    .locals 1

    .line 407
    iget-object v0, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 183
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->᩸(I)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 329
    iget-object v1, p0, Ll/۬ۗܿ;->ۛ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 330
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public abstract ᩴ()V
.end method

.method public final ᩵()V
    .locals 1

    .line 293
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->ۖᩳ()V

    return-void
.end method

.method public final ᩷()Landroid/widget/Button;
    .locals 1

    .line 387
    iget-object v0, p0, Ll/۬ۗܿ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(I)V
    .locals 1

    .line 308
    iget-object v0, p0, Ll/۬ۗܿ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 303
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    const/16 v1, 0xd

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ܽ(F)V

    return-void
.end method

.method public final ᩹()V
    .locals 2

    const/4 v0, 0x2

    .line 141
    iget-object v1, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->᩵(I)V

    return-void
.end method

.method public final ᩻()Landroid/widget/FrameLayout;
    .locals 1

    .line 395
    iget-object v0, p0, Ll/۬ۗܿ;->۬:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final ᩻(I)V
    .locals 1

    .line 167
    iget-object v0, p0, Ll/۬ۗܿ;->ۙ:Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۙ(I)V

    return-void
.end method
