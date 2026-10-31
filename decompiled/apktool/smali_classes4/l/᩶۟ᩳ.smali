.class public final Ll/᩶۟ᩳ;
.super Ljava/lang/Object;
.source "C4SO"


# instance fields
.field public final ֡:Ljava/lang/String;

.field public final ֨:I

.field public ֫:Z

.field public ۖ:Z

.field public final ۘ:Z

.field public ۚ:I

.field public final ۜ:Z

.field public ۠:I

.field public ۡ:Z

.field public final ۢ:Z

.field public final ۧ:Z

.field public final ܳ:F

.field public final ܶ:I

.field public final ܺ:Z

.field public ܽ:Ljava/lang/String;

.field public ܿ:F

.field public final ᩳ:Ljava/lang/String;

.field public ᩴ:I

.field public final ᩵:I

.field public ᩷:Z

.field public ᩸:F

.field public final ᩹:F

.field public ᩻:Z


# direct methods
.method public constructor <init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p6, p0, Ll/᩶۟ᩳ;->֡:Ljava/lang/String;

    .line 46
    iput p3, p0, Ll/᩶۟ᩳ;->۠:I

    iput p3, p0, Ll/᩶۟ᩳ;->ܶ:I

    .line 47
    iput p1, p0, Ll/᩶۟ᩳ;->᩸:F

    iput p1, p0, Ll/᩶۟ᩳ;->᩹:F

    .line 48
    iput p2, p0, Ll/᩶۟ᩳ;->ܿ:F

    iput p2, p0, Ll/᩶۟ᩳ;->ܳ:F

    .line 49
    iput p4, p0, Ll/᩶۟ᩳ;->ᩴ:I

    iput p4, p0, Ll/᩶۟ᩳ;->᩵:I

    .line 50
    iput-boolean p8, p0, Ll/᩶۟ᩳ;->ۡ:Z

    iput-boolean p8, p0, Ll/᩶۟ᩳ;->ܺ:Z

    .line 51
    iput-boolean p9, p0, Ll/᩶۟ᩳ;->᩷:Z

    iput-boolean p9, p0, Ll/᩶۟ᩳ;->ۢ:Z

    .line 52
    iput-boolean p10, p0, Ll/᩶۟ᩳ;->᩻:Z

    iput-boolean p10, p0, Ll/᩶۟ᩳ;->ۜ:Z

    .line 53
    iput-boolean p11, p0, Ll/᩶۟ᩳ;->ۖ:Z

    iput-boolean p11, p0, Ll/᩶۟ᩳ;->ۘ:Z

    .line 54
    iput-boolean p12, p0, Ll/᩶۟ᩳ;->֫:Z

    iput-boolean p12, p0, Ll/᩶۟ᩳ;->ۧ:Z

    .line 55
    iput p5, p0, Ll/᩶۟ᩳ;->ۚ:I

    iput p5, p0, Ll/᩶۟ᩳ;->֨:I

    .line 56
    iput-object p7, p0, Ll/᩶۟ᩳ;->ܽ:Ljava/lang/String;

    iput-object p7, p0, Ll/᩶۟ᩳ;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 4

    .line 60
    iget v0, p0, Ll/᩶۟ᩳ;->۠:I

    const/4 v1, 0x1

    iget v2, p0, Ll/᩶۟ᩳ;->ܶ:I

    if-ne v2, v0, :cond_1

    iget v0, p0, Ll/᩶۟ᩳ;->᩹:F

    iget v3, p0, Ll/᩶۟ᩳ;->᩸:F

    cmpl-float v0, v0, v3

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩶۟ᩳ;->ܳ:F

    iget v3, p0, Ll/᩶۟ᩳ;->ܿ:F

    cmpl-float v0, v0, v3

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩶۟ᩳ;->᩵:I

    iget v3, p0, Ll/᩶۟ᩳ;->ᩴ:I

    if-ne v0, v3, :cond_1

    iget-boolean v0, p0, Ll/᩶۟ᩳ;->ܺ:Z

    iget-boolean v3, p0, Ll/᩶۟ᩳ;->ۡ:Z

    if-ne v0, v3, :cond_1

    iget-boolean v0, p0, Ll/᩶۟ᩳ;->ۢ:Z

    iget-boolean v3, p0, Ll/᩶۟ᩳ;->᩷:Z

    if-ne v0, v3, :cond_1

    iget-boolean v0, p0, Ll/᩶۟ᩳ;->ۜ:Z

    iget-boolean v3, p0, Ll/᩶۟ᩳ;->᩻:Z

    if-ne v0, v3, :cond_1

    iget-boolean v0, p0, Ll/᩶۟ᩳ;->ۘ:Z

    iget-boolean v3, p0, Ll/᩶۟ᩳ;->ۖ:Z

    if-ne v0, v3, :cond_1

    iget-boolean v0, p0, Ll/᩶۟ᩳ;->ۧ:Z

    iget-boolean v3, p0, Ll/᩶۟ᩳ;->֫:Z

    if-ne v0, v3, :cond_1

    iget v0, p0, Ll/᩶۟ᩳ;->֨:I

    iget v3, p0, Ll/᩶۟ᩳ;->ۚ:I

    if-ne v0, v3, :cond_1

    if-ne v2, v1, :cond_0

    iget-object v0, p0, Ll/᩶۟ᩳ;->ᩳ:Ljava/lang/String;

    iget-object v2, p0, Ll/᩶۟ᩳ;->ܽ:Ljava/lang/String;

    .line 70
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method
