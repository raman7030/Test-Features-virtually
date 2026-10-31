.class public final Ll/᩸ۨۧ;
.super Ljava/lang/Object;
.source "R697"


# static fields
.field public static final ֫:Ll/ۗۨۧ;

.field public static final ۧ:Landroid/util/Property;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 37
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 38
    new-instance v0, Ll/ۨۨۧ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    sput-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    goto :goto_0

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 40
    new-instance v0, Ll/ۛۨۧ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    goto :goto_0

    :cond_1
    const/16 v1, 0x16

    if-lt v0, v1, :cond_2

    .line 42
    new-instance v0, Ll/۫ۨۧ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    sput-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    goto :goto_0

    .line 44
    :cond_2
    new-instance v0, Ll/ۗۨۧ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    sput-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    .line 53
    :goto_0
    new-instance v0, Ll/۠ۨۧ;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    .line 54
    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 53
    sput-object v0, Ll/᩸ۨۧ;->ۧ:Landroid/util/Property;

    .line 68
    new-instance v0, Ll/ܶۨۧ;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    .line 69
    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;)F
    .locals 1

    .line 88
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0, p0}, Ll/᩶ۨۧ;->֫(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static ֫()V
    .locals 1

    .line 105
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static ֫(Landroid/view/View;F)V
    .locals 1

    .line 84
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0, p0, p1}, Ll/᩶ۨۧ;->֫(Landroid/view/View;F)V

    return-void
.end method

.method public static ֫(Landroid/view/View;I)V
    .locals 1

    .line 122
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0, p0, p1}, Ll/᩶ۨۧ;->֫(Landroid/view/View;I)V

    return-void
.end method

.method public static ֫(Landroid/view/View;IIII)V
    .locals 6

    .line 176
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Ll/᩶ۨۧ;->֫(Landroid/view/View;IIII)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    .line 138
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0, p0, p1}, Ll/ۗۨۧ;->֫(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V
    .locals 1

    .line 154
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0, p0, p1}, Ll/ۗۨۧ;->ۧ(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static ۧ()V
    .locals 1

    .line 96
    sget-object v0, Ll/᩸ۨۧ;->֫:Ll/ۗۨۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
