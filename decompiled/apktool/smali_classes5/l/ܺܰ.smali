.class public final Ll/ܺܰ;
.super Ll/ۡܰ;
.source "M4Z7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1868
    invoke-direct {p0}, Ll/ۡܰ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 0

    .line 1872
    invoke-direct {p0, p1}, Ll/ۡܰ;-><init>(Ll/᩸ܰ;)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ۧ۬;)V
    .locals 1

    .line 1877
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    .line 1878
    invoke-static {p1}, Ll/ܶܰ;->֫(I)I

    move-result p1

    .line 1879
    invoke-virtual {p2}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p2

    .line 1877
    invoke-virtual {v0, p1, p2}, Landroid/view/WindowInsets$Builder;->setInsets(ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
