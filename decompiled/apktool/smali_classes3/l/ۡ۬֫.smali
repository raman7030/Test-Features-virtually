.class public final Ll/ۡ۬֫;
.super Ljava/lang/Object;
.source "T8PO"

# interfaces
.implements Ll/᩺ۙ֫;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/ۖ᩵֫;

.field public final ᩶:Ll/ܽۚ֫;

.field public ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܽۚ֫;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ۡ۬֫;->᩶:Ll/ܽۚ֫;

    .line 44
    sget-object p1, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    iput-object p1, p0, Ll/ۡ۬֫;->ۙ:Ll/ۖ᩵֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 49
    iget-boolean v0, p0, Ll/ۡ۬֫;->ۗ:Z

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Ll/ۡ۬֫;->᩶:Ll/ܽۚ֫;

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡ۬֫;->᩸:J

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/ۡ۬֫;->ۗ:Z

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 69
    iput-wide p1, p0, Ll/ۡ۬֫;->᩹:J

    .line 70
    iget-boolean p1, p0, Ll/ۡ۬֫;->ۗ:Z

    if-eqz p1, :cond_0

    .line 71
    iget-object p1, p0, Ll/ۡ۬֫;->᩶:Ll/ܽۚ֫;

    invoke-interface {p1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۡ۬֫;->᩸:J

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 2

    .line 94
    iget-boolean v0, p0, Ll/ۡ۬֫;->ۗ:Z

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p0}, Ll/ۡ۬֫;->ᩴ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۡ۬֫;->֫(J)V

    .line 97
    :cond_0
    iput-object p1, p0, Ll/ۡ۬֫;->ۙ:Ll/ۖ᩵֫;

    return-void
.end method

.method public final synthetic ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 57
    iget-boolean v0, p0, Ll/ۡ۬֫;->ۗ:Z

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {p0}, Ll/ۡ۬֫;->ᩴ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۡ۬֫;->֫(J)V

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Ll/ۡ۬֫;->ۗ:Z

    :cond_0
    return-void
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۡ۬֫;->ۙ:Ll/ۖ᩵֫;

    return-object v0
.end method

.method public final ᩴ()J
    .locals 7

    .line 77
    iget-wide v0, p0, Ll/ۡ۬֫;->᩹:J

    .line 78
    iget-boolean v2, p0, Ll/ۡ۬֫;->ۗ:Z

    if-eqz v2, :cond_1

    .line 79
    iget-object v2, p0, Ll/ۡ۬֫;->᩶:Ll/ܽۚ֫;

    invoke-interface {v2}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v2

    iget-wide v4, p0, Ll/ۡ۬֫;->᩸:J

    sub-long/2addr v2, v4

    .line 80
    iget-object v4, p0, Ll/ۡ۬֫;->ۙ:Ll/ۖ᩵֫;

    iget v5, v4, Ll/ۖ᩵֫;->ܽ:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    .line 81
    invoke-static {v2, v3}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v2

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v4, v2, v3}, Ll/ۖ᩵֫;->֫(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v2, v0

    return-wide v2

    :cond_1
    return-wide v0
.end method
