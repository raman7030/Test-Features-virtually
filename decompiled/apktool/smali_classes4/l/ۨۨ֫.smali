.class public final Ll/ۨۨ֫;
.super Ljava/lang/Object;
.source "47NE"

# interfaces
.implements Ll/ᩴܽۧ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ܿ᩺֫;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/ܿ᩺֫;I)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    .line 34
    iput p2, p0, Ll/ۨۨ֫;->ܽ:I

    const/4 p1, -0x1

    .line 35
    iput p1, p0, Ll/ۨۨ֫;->֫:I

    return-void
.end method

.method private ᩳ()Z
    .locals 2

    .line 92
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final ֫(J)I
    .locals 2

    .line 84
    invoke-direct {p0}, Ll/ۨۨ֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    iget v1, p0, Ll/ۨۨ֫;->֫:I

    invoke-virtual {v0, v1, p1, p2}, Ll/ܿ᩺֫;->֫(IJ)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 2

    .line 73
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 p1, 0x4

    .line 74
    invoke-virtual {p2, p1}, Ll/ۘ᩸֫;->ۧ(I)V

    const/4 p1, -0x4

    return p1

    .line 77
    :cond_0
    invoke-direct {p0}, Ll/ۨۨ֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    iget-object v0, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    iget v1, p0, Ll/ۨۨ֫;->֫:I

    invoke-virtual {v0, v1, p1, p2, p3}, Ll/ܿ᩺֫;->֫(ILl/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method public final ֫()V
    .locals 4

    .line 60
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x2

    iget-object v2, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    if-eq v0, v1, :cond_2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 64
    invoke-virtual {v2}, Ll/ܿ᩺֫;->ܺ()V

    return-void

    :cond_0
    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    .line 66
    invoke-virtual {v2, v0}, Ll/ܿ᩺֫;->ܽ(I)V

    :cond_1
    return-void

    .line 61
    :cond_2
    new-instance v0, Ll/ۜ᩺֫;

    .line 62
    invoke-virtual {v2}, Ll/ܿ᩺֫;->᩻()Ll/ۛܽۧ;

    move-result-object v1

    iget v2, p0, Ll/ۨۨ֫;->ܽ:I

    invoke-virtual {v1, v2}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v1

    iget-object v1, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v2, "Unable to bind a sample queue to TrackGroup with MIME type "

    const-string v3, "."

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw v0
.end method

.method public final ۧ()V
    .locals 2

    .line 39
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 40
    iget-object v0, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    iget v1, p0, Ll/ۨۨ֫;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ܿ᩺֫;->֫(I)I

    move-result v0

    iput v0, p0, Ll/ۨۨ֫;->֫:I

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 44
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 45
    iget-object v0, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    iget v2, p0, Ll/ۨۨ֫;->ܽ:I

    invoke-virtual {v0, v2}, Ll/ܿ᩺֫;->ᩳ(I)V

    .line 46
    iput v1, p0, Ll/ۨۨ֫;->֫:I

    :cond_0
    return-void
.end method

.method public final ܿ()Z
    .locals 2

    .line 54
    iget v0, p0, Ll/ۨۨ֫;->֫:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    .line 55
    invoke-direct {p0}, Ll/ۨۨ֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨۨ֫;->ۧ:Ll/ܿ᩺֫;

    iget v1, p0, Ll/ۨۨ֫;->֫:I

    invoke-virtual {v0, v1}, Ll/ܿ᩺֫;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
