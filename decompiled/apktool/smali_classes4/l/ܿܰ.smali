.class public final Ll/ܿܰ;
.super Ljava/lang/Object;
.source "R9NW"


# instance fields
.field public ֫:Ll/ᩳܰ;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 78
    new-instance v0, Ll/ܽܰ;

    .line 978
    invoke-static {p1, p2, p3, p4}, Ll/ܰ᩺;->֫(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܽܰ;-><init>(Landroid/view/WindowInsetsAnimation;)V

    .line 78
    iput-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    return-void

    .line 80
    :cond_0
    new-instance v0, Ll/᩺᩺;

    .line 612
    invoke-direct {v0, p1, p2, p3, p4}, Ll/ᩳܰ;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 80
    iput-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    return-void
.end method

.method public static ֫(Landroid/view/WindowInsetsAnimation;)Ll/ܿܰ;
    .locals 5

    .line 331
    new-instance v0, Ll/ܿܰ;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    .line 88
    invoke-direct {v0, v4, v1, v2, v3}, Ll/ܿܰ;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 89
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 90
    new-instance v1, Ll/ܽܰ;

    invoke-direct {v1, p0}, Ll/ܽܰ;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v1, v0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 170
    iget-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    invoke-virtual {v0}, Ll/ᩳܰ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(F)V
    .locals 1

    .line 186
    iget-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    invoke-virtual {v0, p1}, Ll/ᩳܰ;->֫(F)V

    return-void
.end method

.method public final ۧ()F
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    invoke-virtual {v0}, Ll/ᩳܰ;->ۧ()F

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܿܰ;->֫:Ll/ᩳܰ;

    invoke-virtual {v0}, Ll/ᩳܰ;->ܽ()I

    move-result v0

    return v0
.end method
