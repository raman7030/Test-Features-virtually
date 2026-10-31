.class public final Ll/᩷᩺ۘ;
.super Ljava/lang/Object;
.source "Z8WO"


# instance fields
.field public final ֫:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Ll/᩷᩺ۘ;->֫:F

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    int-to-float p1, p1

    .line 27
    iget v0, p0, Ll/᩷᩺ۘ;->֫:F

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method
