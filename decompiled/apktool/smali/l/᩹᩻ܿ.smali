.class public final Ll/᩹᩻ܿ;
.super Ll/ۤ᩻ܿ;
.source "A7IB"


# instance fields
.field public ֫:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ܿ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 180
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0157

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 170
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 181
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0216

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 183
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a0163

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const v0, 0x7f080202

    .line 184
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 186
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 187
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 188
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a0217

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩹᩻ܿ;->֫:Landroid/widget/TextView;

    .line 189
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v0, 0x41900000    # 18.0f

    .line 190
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 191
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 192
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a050b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶᩻ܿ;)V
    .locals 1

    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/᩸᩻ܿ;

    if-eqz v0, :cond_0

    .line 197
    invoke-virtual {p1}, Ll/᩶᩻ܿ;->֫()Ll/᩸᩻ܿ;

    move-result-object p1

    .line 198
    iget-object v0, p0, Ll/᩹᩻ܿ;->֫:Landroid/widget/TextView;

    iget p1, p1, Ll/᩸᩻ܿ;->ۧ:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method
