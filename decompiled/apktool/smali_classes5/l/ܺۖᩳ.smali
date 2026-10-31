.class public Ll/ܺۖᩳ;
.super Ll/᩸ۢ;
.source "P5NF"


# instance fields
.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Ll/ܺۖᩳ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Ll/ܺۖᩳ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final enoughToFilter()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Ll/ܺۖᩳ;->᩸:Z

    return v0
.end method

.method public final getThreshold()I
    .locals 1

    .line 41
    iget v0, p0, Ll/ܺۖᩳ;->᩹:I

    return v0
.end method

.method public final setThreshold(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 37
    :cond_0
    iput p1, p0, Ll/ܺۖᩳ;->᩹:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Ll/ܺۖᩳ;->᩸:Z

    return-void
.end method
