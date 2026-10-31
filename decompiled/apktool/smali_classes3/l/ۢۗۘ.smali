.class public final Ll/ۢۗۘ;
.super Ljava/lang/Object;
.source "86K0"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Ll/ۢۗۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 0

    .line 40
    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    if-eq p1, p3, :cond_1

    add-int/lit8 p3, p3, -0x1

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 30
    :cond_1
    :goto_0
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p2, p0, Ll/ۢۗۘ;->᩸:I

    add-int/2addr p1, p2

    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 31
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr p1, p2

    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    return-void
.end method
