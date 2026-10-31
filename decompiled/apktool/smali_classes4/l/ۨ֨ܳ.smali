.class public final synthetic Ll/ۨ֨ܳ;
.super Ljava/lang/Object;
.source "98EM"

# interfaces
.implements Ll/֡ۢۡ;
.implements Ll/֫۠ܳ;
.implements Ll/ܽ۠ܳ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۨ֨ܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۨ֨ܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/graphics/PointF;IIFF)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۨ֨ܳ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۗۨܿ;

    iget-object p2, p0, Ll/ۨ֨ܳ;->᩹:Ljava/lang/Object;

    check-cast p2, [I

    invoke-static {p1, p2, p4, p5}, Ll/ۗۨܿ;->֫(Ll/ۗۨܿ;[IFF)V

    return-void
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 3

    iget-object v0, p0, Ll/ۨ֨ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨ֨ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Landroid/view/View$OnLongClickListener;

    .line 449
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v2, 0xa

    .line 450
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 451
    invoke-static {p1, v0}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_0

    .line 453
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

.method public ֫(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 2

    iget-object v0, p0, Ll/ۨ֨ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨ֨ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 97
    invoke-static {p1, v0}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 98
    invoke-static {p2, v1}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    const/4 p1, 0x4

    .line 99
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
