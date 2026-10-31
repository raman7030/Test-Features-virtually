.class public final Ll/᩷ۚ;
.super Ll/ۢۚ;
.source "W1AV"


# instance fields
.field public ۖ:Ljava/lang/String;

.field public ۜ:F

.field public ۡ:F

.field public ۢ:F

.field public ܳ:I

.field public ܺ:I

.field public ᩷:F

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ll/ۚ֡;-><init>()V

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Ll/ۢۚ;->ܿ:I

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/᩷ۚ;->᩻:I

    const/4 v0, 0x0

    .line 45
    iput v0, p0, Ll/᩷ۚ;->ܳ:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 46
    iput v1, p0, Ll/᩷ۚ;->᩷:F

    .line 47
    iput v1, p0, Ll/᩷ۚ;->ۜ:F

    .line 48
    iput v1, p0, Ll/᩷ۚ;->ۢ:F

    .line 49
    iput v1, p0, Ll/᩷ۚ;->ۡ:F

    .line 55
    iput v0, p0, Ll/᩷ۚ;->ܺ:I

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 67
    sget-object v0, Ll/᩸᩸;->᩷:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 68
    invoke-static {p0, p1}, Ll/ۜۚ;->֫(Ll/᩷ۚ;Landroid/content/res/TypedArray;)V

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
