.class public final Ll/᩹۬ۚ;
.super Ljava/lang/Object;
.source "S7CF"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 58
    invoke-virtual {p0, v0, v0}, Ll/᩹۬ۚ;->֫(II)V

    .line 59
    iput v0, p0, Ll/᩹۬ۚ;->ܽ:I

    .line 60
    iput v0, p0, Ll/᩹۬ۚ;->ᩳ:I

    .line 61
    sget-object v0, Ll/᩶۬ۚ;->ۧ֫:Ll/᩶۬ۚ;

    invoke-static {v0}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    return-void
.end method

.method public static ֫(Ll/᩹۬ۚ;)Ll/᩹۬ۚ;
    .locals 3

    .line 198
    new-instance v0, Ll/᩹۬ۚ;

    .line 66
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    iget v1, p0, Ll/᩹۬ۚ;->֫:I

    iget v2, p0, Ll/᩹۬ۚ;->ۧ:I

    invoke-virtual {v0, v1, v2}, Ll/᩹۬ۚ;->֫(II)V

    .line 68
    iget v1, p0, Ll/᩹۬ۚ;->ܽ:I

    iput v1, v0, Ll/᩹۬ۚ;->ܽ:I

    .line 69
    iget p0, p0, Ll/᩹۬ۚ;->ᩳ:I

    iput p0, v0, Ll/᩹۬ۚ;->ᩳ:I

    .line 71
    invoke-virtual {v0}, Ll/᩹۬ۚ;->ܳ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 72
    sget-object p0, Ll/᩶۬ۚ;->ᩳ֫:Ll/᩶۬ۚ;

    invoke-static {p0}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    goto :goto_0

    .line 74
    :cond_0
    sget-object p0, Ll/᩶۬ۚ;->ۧ֫:Ll/᩶۬ۚ;

    invoke-static {p0}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    :goto_0
    return-object v0
.end method

.method public static ᩷()Ll/᩹۬ۚ;
    .locals 2

    .line 221
    new-instance v0, Ll/᩹۬ۚ;

    .line 79
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x45

    .line 80
    iput v1, v0, Ll/᩹۬ۚ;->֫:I

    const v1, 0xffff

    .line 81
    iput v1, v0, Ll/᩹۬ۚ;->ۧ:I

    .line 82
    invoke-virtual {v0}, Ll/᩹۬ۚ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    sget-object v1, Ll/᩶۬ۚ;->ᩳ֫:Ll/᩶۬ۚ;

    invoke-static {v1}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    return-object v0

    .line 85
    :cond_0
    sget-object v1, Ll/᩶۬ۚ;->ۧ֫:Ll/᩶۬ۚ;

    invoke-static {v1}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 160
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    const-string v1, "(undef)"

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 161
    :goto_0
    iget v3, p0, Ll/᩹۬ۚ;->ۧ:I

    if-ne v3, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_1
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v0, "%s:%s"

    .line 160
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 126
    iget v0, p0, Ll/᩹۬ۚ;->ۧ:I

    invoke-virtual {p0, p1, v0}, Ll/᩹۬ۚ;->֫(II)V

    return-void
.end method

.method public final ֫(II)V
    .locals 0

    .line 101
    iput p1, p0, Ll/᩹۬ۚ;->֫:I

    .line 102
    iput p2, p0, Ll/᩹۬ۚ;->ۧ:I

    .line 103
    invoke-virtual {p0}, Ll/᩹۬ۚ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 104
    sget-object p1, Ll/᩶۬ۚ;->ᩳ֫:Ll/᩶۬ۚ;

    invoke-static {p1}, Ll/ۛ۬ۚ;->֫(Ll/᩶۬ۚ;)V

    :cond_0
    return-void
.end method

.method public final ۜ()I
    .locals 1

    .line 203
    iget v0, p0, Ll/᩹۬ۚ;->ۧ:I

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 187
    invoke-virtual {p0}, Ll/᩹۬ۚ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    invoke-static {}, Ll/ۛ۬ۚ;->ܺ()Ll/᩶۬ۚ;

    move-result-object v0

    sget-object v1, Ll/᩶۬ۚ;->ᩳ֫:Ll/᩶۬ۚ;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x45

    const v1, 0xffff

    .line 189
    invoke-virtual {p0, v0, v1}, Ll/᩹۬ۚ;->֫(II)V

    return-void

    :cond_0
    const/16 v0, 0x2d

    const/4 v1, 0x3

    .line 191
    invoke-virtual {p0, v0, v1}, Ll/᩹۬ۚ;->֫(II)V

    :cond_1
    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 133
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    invoke-virtual {p0, v0, p1}, Ll/᩹۬ۚ;->֫(II)V

    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 211
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    const/16 v1, 0x45

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩹۬ۚ;->ۧ:I

    const v1, 0xffff

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 144
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Ll/᩹۬ۚ;->ۧ:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 176
    invoke-virtual {p0}, Ll/᩹۬ۚ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 233
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    const/16 v1, 0x2d

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 207
    iget v0, p0, Ll/᩹۬ۚ;->֫:I

    return v0
.end method
