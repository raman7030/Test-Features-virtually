.class public final Ll/ۛۙ֫;
.super Ljava/lang/Object;
.source "N8KR"


# instance fields
.field public ֫:J

.field public ۧ:J

.field public ܽ:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    iput-wide v0, p0, Ll/ۛۙ֫;->ۧ:J

    const v2, -0x800001

    .line 40
    iput v2, p0, Ll/ۛۙ֫;->ܽ:F

    .line 41
    iput-wide v0, p0, Ll/ۛۙ֫;->֫:J

    return-void
.end method

.method public constructor <init>(Ll/ۨۙ֫;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iget-wide v0, p1, Ll/ۨۙ֫;->ۧ:J

    iput-wide v0, p0, Ll/ۛۙ֫;->ۧ:J

    .line 46
    iget v0, p1, Ll/ۨۙ֫;->ܽ:F

    iput v0, p0, Ll/ۛۙ֫;->ܽ:F

    .line 47
    iget-wide v0, p1, Ll/ۨۙ֫;->֫:J

    iput-wide v0, p0, Ll/ۛۙ֫;->֫:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۙ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛۙ֫;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۛۙ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛۙ֫;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۛۙ֫;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۙ֫;->ܽ:F

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ۨۙ֫;
    .locals 1

    .line 85
    new-instance v0, Ll/ۨۙ֫;

    invoke-direct {v0, p0}, Ll/ۨۙ֫;-><init>(Ll/ۛۙ֫;)V

    return-object v0
.end method

.method public final ֫(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    const v0, -0x800001

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 65
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 66
    iput p1, p0, Ll/ۛۙ֫;->ܽ:F

    return-void
.end method

.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 78
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 79
    iput-wide p1, p0, Ll/ۛۙ֫;->֫:J

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 53
    iput-wide p1, p0, Ll/ۛۙ֫;->ۧ:J

    return-void
.end method
