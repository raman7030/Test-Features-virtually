.class public final Ll/ᩳ᩻ܿ;
.super Ll/᩷᩻ܿ;
.source "89CO"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ۢ᩻ܿ;

.field public ᩸:Landroid/widget/ImageView;

.field public ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܿ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 281
    iput-object p1, p0, Ll/ᩳ᩻ܿ;->᩶:Ll/ۢ᩻ܿ;

    .line 282
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0157

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 203
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 283
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0216

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ᩳ᩻ܿ;->᩸:Landroid/widget/ImageView;

    .line 284
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0217

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ᩳ᩻ܿ;->ۙ:Landroid/widget/TextView;

    .line 285
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a050b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ᩳ᩻ܿ;->᩹:Landroid/widget/ImageView;

    .line 286
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0163

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 287
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p2, 0x1

    .line 288
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 289
    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 381
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 382
    iget-object p1, p0, Ll/ᩳ᩻ܿ;->᩶:Ll/ۢ᩻ܿ;

    invoke-static {p1}, Ll/ۢ᩻ܿ;->֫(Ll/ۢ᩻ܿ;)Ll/֫ۗۧ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܰܳܿ;)V
    .locals 5

    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/۟ܳܿ;

    if-nez v0, :cond_0

    return-void

    .line 296
    :cond_0
    invoke-virtual {p1}, Ll/ܰܳܿ;->ۧ()Ll/۟ܳܿ;

    move-result-object p1

    .line 297
    iget-object v0, p1, Ll/۟ܳܿ;->ۧ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Ll/۟ܳܿ;->֫:Ll/ۖ᩻ܿ;

    iget-object v2, p0, Ll/ᩳ᩻ܿ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 298
    iget-object v0, p0, Ll/ᩳ᩻ܿ;->ۙ:Landroid/widget/TextView;

    iget-object p1, p1, Ll/۟ܳܿ;->ܽ:Ll/ܺ᩻ܿ;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    invoke-virtual {v1}, Ll/ۖ᩻ܿ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "builtin:systemTranslate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ᩳ᩻ܿ;->᩹:Landroid/widget/ImageView;

    if-nez v0, :cond_3

    const-string v0, "builtin:function"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 344
    instance-of p1, v1, Ll/ۘ᩻ܿ;

    if-eqz p1, :cond_1

    check-cast v1, Ll/ۘ᩻ܿ;

    const p1, 0x7f080226

    .line 345
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 346
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 347
    new-instance p1, Ll/֡ۘ᩻;

    const/4 v0, 0x1

    invoke-direct {p1, v0, v1}, Ll/֡ۘ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 348
    new-instance v2, Ll/ܽ᩻ܿ;

    invoke-direct {v2, p0, v1}, Ll/ܽ᩻ܿ;-><init>(Ll/ᩳ᩻ܿ;Ll/ۘ᩻ܿ;)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    .line 371
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 372
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    const p1, 0x7f080204

    .line 335
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 336
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 337
    new-instance p1, Ll/ۧ᩻ܿ;

    invoke-direct {p1, p0}, Ll/ۧ᩻ܿ;-><init>(Ll/ᩳ᩻ܿ;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_3
    const p1, 0x7f08023d

    .line 302
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 303
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 304
    new-instance p1, Ll/֫᩻ܿ;

    invoke-direct {p1, p0}, Ll/֫᩻ܿ;-><init>(Ll/ᩳ᩻ܿ;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 376
    :goto_0
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method
