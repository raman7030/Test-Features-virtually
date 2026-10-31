.class public Ll/ۧ᩸ۧ;
.super Ll/ۗ᩸ۧ;
.source "Z5Y0"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Ll/ۧ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f0403c2

    const v1, 0x101008c

    .line 55
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/ۧ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۗ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 2

    .line 75
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 77
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setAccessibilityHeading(Z)V

    :cond_0
    return-void
.end method

.method public final ܿ֫()Z
    .locals 1

    .line 70
    invoke-super {p0}, Ll/֫᩸ۧ;->᩶()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩶()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
