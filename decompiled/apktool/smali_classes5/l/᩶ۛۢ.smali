.class public final Ll/᩶ۛۢ;
.super Ll/ۚۛۢ;
.source "M6O6"


# instance fields
.field public final synthetic ֨:Ll/ۙۛۢ;

.field public ۚ:I


# direct methods
.method public constructor <init>(Ll/֫ܳ֡;Ll/ۙۛۢ;)V
    .locals 0

    .line 108
    iput-object p2, p0, Ll/᩶ۛۢ;->֨:Ll/ۙۛۢ;

    invoke-direct {p0, p1}, Ll/ۚۛۢ;-><init>(Ll/֫ܳ֡;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡܳ֡;II)V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/᩶ۛۢ;->֨:Ll/ۙۛۢ;

    invoke-virtual {v0}, Ll/ۙۛۢ;->֫()V

    .line 112
    iget v0, p0, Ll/᩶ۛۢ;->ۚ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩶ۛۢ;->ۚ:I

    const/16 v1, 0x100

    if-gt v0, v1, :cond_0

    .line 115
    invoke-super {p0, p1, p2, p3}, Ll/ۢܳ֡;->֫(Ll/ۡܳ֡;II)V

    return-void

    .line 112
    :cond_0
    sget-object p1, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p2, "Parser nesting limit exceeded"

    invoke-static {p1, p2}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/ۡܳ֡;III)V
    .locals 0

    .line 111
    iget-object p2, p0, Ll/᩶ۛۢ;->֨:Ll/ۙۛۢ;

    invoke-virtual {p2}, Ll/ۙۛۢ;->֫()V

    .line 112
    iget p2, p0, Ll/᩶ۛۢ;->ۚ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/᩶ۛۢ;->ۚ:I

    const/16 p3, 0x100

    if-gt p2, p3, :cond_0

    const/16 p2, 0x18

    const/16 p3, 0xc

    .line 119
    invoke-super {p0, p1, p2, p3, p4}, Ll/ۢܳ֡;->֫(Ll/ۡܳ֡;III)V

    return-void

    .line 112
    :cond_0
    sget-object p1, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p2, "Parser nesting limit exceeded"

    invoke-static {p1, p2}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p1

    throw p1
.end method

.method public final ۧ(Ll/ۡܳ֡;)V
    .locals 0

    .line 122
    invoke-super {p0, p1}, Ll/ۢܳ֡;->ۧ(Ll/ۡܳ֡;)V

    iget p1, p0, Ll/᩶ۛۢ;->ۚ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩶ۛۢ;->ۚ:I

    return-void
.end method

.method public final ܺ()V
    .locals 1

    .line 117
    invoke-super {p0}, Ll/ۢܳ֡;->ܺ()V

    iget v0, p0, Ll/᩶ۛۢ;->ۚ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩶ۛۢ;->ۚ:I

    return-void
.end method
