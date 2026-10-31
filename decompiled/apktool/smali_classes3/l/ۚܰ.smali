.class public final Ll/ۚܰ;
.super Ll/֡ܰ;
.source "M4Z7"


# static fields
.field public static final ֡:Ll/᩸ܰ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1350
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    .line 1350
    sput-object v0, Ll/ۚܰ;->֡:Ll/᩸ܰ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1353
    invoke-direct {p0, p1, p2}, Ll/֡ܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public ֫(I)Ll/ۧ۬;
    .locals 1

    .line 1363
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    .line 1364
    invoke-static {p1}, Ll/ܶܰ;->֫(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    .line 1363
    invoke-static {p1}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public ۧ(I)Ll/ۧ۬;
    .locals 1

    .line 1371
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    .line 1372
    invoke-static {p1}, Ll/ܶܰ;->֫(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object p1

    .line 1371
    invoke-static {p1}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object p1

    return-object p1
.end method

.method public ܽ(I)Z
    .locals 1

    .line 1378
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-static {p1}, Ll/ܶܰ;->֫(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result p1

    return p1
.end method
