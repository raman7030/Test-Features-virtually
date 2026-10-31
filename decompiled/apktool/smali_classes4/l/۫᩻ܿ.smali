.class public final Ll/۫᩻ܿ;
.super Ll/ۤ᩻ܿ;
.source "A7IB"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ۛ᩻ܿ;

.field public ᩸:Landroid/widget/ImageView;

.field public ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ܿ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 209
    iput-object p1, p0, Ll/۫᩻ܿ;->᩶:Ll/ۛ᩻ܿ;

    .line 210
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0157

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 170
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 211
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0216

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/۫᩻ܿ;->᩸:Landroid/widget/ImageView;

    .line 212
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0217

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۫᩻ܿ;->ۙ:Landroid/widget/TextView;

    .line 213
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a050b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/۫᩻ܿ;->᩹:Landroid/widget/ImageView;

    .line 214
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0163

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 215
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p2, 0x1

    .line 216
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 217
    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 274
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 275
    iget-object p1, p0, Ll/۫᩻ܿ;->᩶:Ll/ۛ᩻ܿ;

    invoke-static {p1}, Ll/ۛ᩻ܿ;->֫(Ll/ۛ᩻ܿ;)Ll/֫ۗۧ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩶᩻ܿ;)V
    .locals 6

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۙ᩻ܿ;

    if-nez v0, :cond_0

    return-void

    .line 224
    :cond_0
    invoke-virtual {p1}, Ll/᩶᩻ܿ;->ۧ()Ll/ۙ᩻ܿ;

    move-result-object p1

    .line 225
    iget-object v0, p1, Ll/ۙ᩻ܿ;->ۧ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Ll/ۙ᩻ܿ;->֫:Ll/ۖ᩻ܿ;

    iget-object v2, p0, Ll/۫᩻ܿ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 226
    iget-object v0, p0, Ll/۫᩻ܿ;->ۙ:Landroid/widget/TextView;

    iget-object v2, p1, Ll/ۙ᩻ܿ;->ܽ:Ll/ܺ᩻ܿ;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    invoke-virtual {v1}, Ll/ۖ᩻ܿ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v2, "builtin:toggleComment"

    .line 229
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Ll/۫᩻ܿ;->᩹:Landroid/widget/ImageView;

    if-nez v2, :cond_3

    const-string v2, "builtin:shrinkCode"

    .line 230
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "builtin:formatCode"

    .line 231
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 239
    :cond_1
    instance-of p1, v1, Ll/ۘ᩻ܿ;

    if-eqz p1, :cond_2

    check-cast v1, Ll/ۘ᩻ܿ;

    const p1, 0x7f080226

    .line 240
    invoke-virtual {v5, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 241
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 242
    new-instance p1, Ll/֡ۘ᩻;

    const/4 v0, 0x1

    invoke-direct {p1, v0, v1}, Ll/֡ۘ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    new-instance v4, Ll/۬᩻ܿ;

    invoke-direct {v4, p0, v1}, Ll/۬᩻ܿ;-><init>(Ll/۫᩻ܿ;Ll/ۘ᩻ܿ;)V

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    .line 266
    invoke-virtual {v5, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 267
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_3
    :goto_0
    const v0, 0x7f080204

    .line 232
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 233
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 234
    new-instance v0, Ll/ۗ᩻ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۗ᩻ܿ;-><init>(Ll/۫᩻ܿ;Ll/ۙ᩻ܿ;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    :goto_1
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method
