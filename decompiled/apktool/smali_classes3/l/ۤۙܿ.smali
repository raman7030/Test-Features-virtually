.class public final Ll/ۤۙܿ;
.super Ljava/lang/Object;
.source "J14D"


# static fields
.field public static final ֫:F

.field public static final ۧ:I

.field public static final ܽ:Ll/ܶۜܿ;

.field public static final ܿ:Ll/᩺ܺܿ;

.field public static final ᩳ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, ".smali"

    .line 18
    invoke-static {v0}, Ll/ۜ᩷ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sput-object v0, Ll/ۤۙܿ;->ܽ:Ll/ܶۜܿ;

    .line 19
    invoke-static {v0}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    sput-object v0, Ll/ۤۙܿ;->ܿ:Ll/᩺ܺܿ;

    .line 22
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 23
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    sput v1, Ll/ۤۙܿ;->֫:F

    .line 24
    iget v1, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    sput v1, Ll/ۤۙܿ;->ᩳ:F

    .line 25
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    sput v0, Ll/ۤۙܿ;->ۧ:I

    return-void
.end method
