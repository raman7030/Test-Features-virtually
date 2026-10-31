.class public final Ll/᩹᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"


# instance fields
.field public final ֫:Ll/᩹ۨۜ;

.field public final ۧ:Landroid/graphics/RectF;

.field public final ܽ:Ll/ۡܰۜ;


# direct methods
.method public constructor <init>(Ll/ۡܰۜ;Ll/᩹ۨۜ;)V
    .locals 3

    .line 1135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1136
    iput-object p1, p0, Ll/᩹᩺ۜ;->ܽ:Ll/ۡܰۜ;

    .line 1137
    iput-object p2, p0, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    .line 1138
    new-instance p2, Landroid/graphics/RectF;

    iget v0, p1, Ll/ۡܰۜ;->ܳ:I

    int-to-float v0, v0

    iget v1, p1, Ll/ۡܰۜ;->᩷:I

    int-to-float v1, v1

    iget v2, p1, Ll/ۡܰۜ;->᩻:I

    int-to-float v2, v2

    iget p1, p1, Ll/ۡܰۜ;->֫:I

    int-to-float p1, p1

    invoke-direct {p2, v0, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p2, p0, Ll/᩹᩺ۜ;->ۧ:Landroid/graphics/RectF;

    return-void
.end method
