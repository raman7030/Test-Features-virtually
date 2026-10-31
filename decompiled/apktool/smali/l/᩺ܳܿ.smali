.class public final Ll/᩺ܳܿ;
.super Ll/᩷᩻ܿ;
.source "89CO"


# instance fields
.field public ֫:Landroid/widget/ImageView;

.field public final synthetic ۧ:Ll/ۢ᩻ܿ;

.field public ܽ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܿ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 240
    iput-object p1, p0, Ll/᩺ܳܿ;->ۧ:Ll/ۢ᩻ܿ;

    .line 241
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0157

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 203
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 242
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0216

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 244
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0163

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const p2, 0x7f080202

    .line 245
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 247
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 248
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 249
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0217

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩺ܳܿ;->ܽ:Landroid/widget/TextView;

    .line 250
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 p2, 0x41900000    # 18.0f

    .line 251
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 252
    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 253
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a050b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/᩺ܳܿ;->֫:Landroid/widget/ImageView;

    const p2, 0x7f080204

    .line 254
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 255
    new-instance p2, Ll/ۨܳܿ;

    invoke-direct {p2, p0}, Ll/ۨܳܿ;-><init>(Ll/᩺ܳܿ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰܳܿ;)V
    .locals 2

    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۛܳܿ;

    if-eqz v0, :cond_1

    .line 264
    invoke-virtual {p1}, Ll/ܰܳܿ;->֫()Ll/ۛܳܿ;

    move-result-object p1

    .line 265
    iget-object v0, p0, Ll/᩺ܳܿ;->ܽ:Landroid/widget/TextView;

    iget v1, p1, Ll/ۛܳܿ;->ۧ:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 266
    iget p1, p1, Ll/ۛܳܿ;->֫:I

    const/4 v0, 0x1

    iget-object v1, p0, Ll/᩺ܳܿ;->֫:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 267
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_0
    const/16 p1, 0x8

    .line 269
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    return-void
.end method
