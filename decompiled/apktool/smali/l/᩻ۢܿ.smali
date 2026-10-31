.class public final Ll/᩻ۢܿ;
.super Ljava/lang/Object;
.source "7704"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:Ll/ۜۢܿ;


# direct methods
.method private ֫(I)V
    .locals 3

    .line 208
    iput p1, p0, Ll/᩻ۢܿ;->ܳ:I

    .line 209
    iget p1, p0, Ll/᩻ۢܿ;->ᩳ:I

    iget-object v0, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    invoke-static {v0}, Ll/ۜۢܿ;->ۧ(Ll/ۜۢܿ;)I

    move-result v0

    iget-object v1, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    invoke-static {v1}, Ll/ۜۢܿ;->֫(Ll/ۜۢܿ;)Ll/ᩳۢܿ;

    move-result-object v1

    iget v2, p0, Ll/᩻ۢܿ;->ܿ:I

    .line 210
    invoke-virtual {v1, v2}, Ll/ᩳۢܿ;->᩻(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 209
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/᩻ۢܿ;->ۧ:I

    .line 211
    iget-object p1, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    invoke-static {p1}, Ll/ۜۢܿ;->֫(Ll/ۜۢܿ;)Ll/ᩳۢܿ;

    move-result-object p1

    iget v0, p0, Ll/᩻ۢܿ;->ܿ:I

    invoke-virtual {p1, v0}, Ll/ᩳۢܿ;->᩷(I)I

    move-result p1

    iput p1, p0, Ll/᩻ۢܿ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 200
    iget v0, p0, Ll/᩻ۢܿ;->ۧ:I

    return v0
.end method

.method public final ֫(Ll/ۜۢܿ;II)V
    .locals 0

    .line 166
    invoke-static {p1, p2, p3}, Ll/ۜۢܿ;->֫(Ll/ۜۢܿ;II)V

    if-eq p2, p3, :cond_0

    .line 170
    iput-object p1, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    .line 171
    iput p3, p0, Ll/᩻ۢܿ;->ᩳ:I

    .line 172
    invoke-static {p1}, Ll/ۜۢܿ;->֫(Ll/ۜۢܿ;)Ll/ᩳۢܿ;

    move-result-object p3

    invoke-static {p1}, Ll/ۜۢܿ;->ۧ(Ll/ۜۢܿ;)I

    move-result p1

    sub-int p1, p2, p1

    invoke-virtual {p3, p1}, Ll/ᩳۢܿ;->ۜ(I)I

    move-result p1

    iput p1, p0, Ll/᩻ۢܿ;->ܿ:I

    .line 173
    invoke-direct {p0, p2}, Ll/᩻ۢܿ;->֫(I)V

    const/4 p1, 0x1

    .line 174
    iput-boolean p1, p0, Ll/᩻ۢܿ;->֫:Z

    return-void

    .line 168
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty syntax context cursor range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 204
    iget v0, p0, Ll/᩻ۢܿ;->ܽ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 196
    iget v0, p0, Ll/᩻ۢܿ;->ܳ:I

    return v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x0

    .line 191
    iput-object v0, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    const/4 v0, 0x0

    .line 192
    iput-boolean v0, p0, Ll/᩻ۢܿ;->֫:Z

    return-void
.end method

.method public final ᩳ()Z
    .locals 4

    .line 180
    iget-boolean v0, p0, Ll/᩻ۢܿ;->֫:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/᩻ۢܿ;->ۧ:I

    iget v1, p0, Ll/᩻ۢܿ;->ᩳ:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 184
    :cond_0
    iget v0, p0, Ll/᩻ۢܿ;->ܿ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩻ۢܿ;->ܿ:I

    .line 185
    iget-object v0, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    invoke-static {v0}, Ll/ۜۢܿ;->ۧ(Ll/ۜۢܿ;)I

    move-result v0

    iget-object v2, p0, Ll/᩻ۢܿ;->᩻:Ll/ۜۢܿ;

    invoke-static {v2}, Ll/ۜۢܿ;->֫(Ll/ۜۢܿ;)Ll/ᩳۢܿ;

    move-result-object v2

    iget v3, p0, Ll/᩻ۢܿ;->ܿ:I

    invoke-virtual {v2, v3}, Ll/ᩳۢܿ;->ۢ(I)I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Ll/᩻ۢܿ;->֫(I)V

    return v1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 181
    iput-boolean v0, p0, Ll/᩻ۢܿ;->֫:Z

    return v0
.end method
