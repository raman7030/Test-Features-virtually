.class public final Ll/᩸ܿܳ;
.super Ljava/lang/Object;
.source "56MU"

# interfaces
.implements Ll/᩵֨֡;


# instance fields
.field public final ֫:Ll/ۖ֨֡;

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:Ll/ܽ֨֡;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۖ֨֡;)V
    .locals 1

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    iput-object p2, p0, Ll/᩸ܿܳ;->֫:Ll/ۖ֨֡;

    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 269
    iget v0, p0, Ll/᩸ܿܳ;->ܽ:I

    return v0
.end method

.method public final getLine()Ll/ܽ֨֡;
    .locals 1

    .line 268
    iget-object v0, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩵֡;)V
    .locals 4

    .line 286
    invoke-virtual {p1}, Ll/ܳ᩵֡;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/ܳ᩵֡;->֫()I

    move-result p1

    .line 287
    :goto_0
    iget v1, p0, Ll/᩸ܿܳ;->ܽ:I

    iget-object v2, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    invoke-virtual {v2}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    if-ltz v0, :cond_0

    iget v1, p0, Ll/᩸ܿܳ;->ܽ:I

    if-ge v1, v0, :cond_3

    goto :goto_1

    :cond_0
    iget v1, p0, Ll/᩸ܿܳ;->ۧ:I

    if-ge v1, p1, :cond_3

    .line 289
    :goto_1
    invoke-virtual {v2}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    iget v2, p0, Ll/᩸ܿܳ;->ܽ:I

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/᩸ܿܳ;->ۧ:I

    rem-int/lit8 v1, v1, 0x4

    rsub-int/lit8 v1, v1, 0x4

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    :goto_2
    if-gez v0, :cond_2

    .line 290
    iget v2, p0, Ll/᩸ܿܳ;->ۧ:I

    add-int/2addr v2, v1

    if-le v2, p1, :cond_2

    iput p1, p0, Ll/᩸ܿܳ;->ۧ:I

    return-void

    .line 291
    :cond_2
    iget v2, p0, Ll/᩸ܿܳ;->ۧ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/᩸ܿܳ;->ۧ:I

    .line 292
    iget v1, p0, Ll/᩸ܿܳ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩸ܿܳ;->ܽ:I

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 283
    invoke-virtual {p0}, Ll/᩸ܿܳ;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 270
    iget v0, p0, Ll/᩸ܿܳ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 5

    .line 279
    invoke-virtual {p0}, Ll/᩸ܿܳ;->ᩳ()I

    move-result v0

    iget v1, p0, Ll/᩸ܿܳ;->ۧ:I

    .line 280
    iget v2, p0, Ll/᩸ܿܳ;->ܽ:I

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    invoke-virtual {v3}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x9

    if-ne v3, v4, :cond_0

    rem-int/lit8 v3, v1, 0x4

    rsub-int/lit8 v3, v3, 0x4

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    :goto_1
    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 281
    :cond_1
    iget v0, p0, Ll/᩸ܿܳ;->ۧ:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ܿ()Ll/ۖ֨֡;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩸ܿܳ;->֫:Ll/ۖ֨֡;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 4

    .line 273
    iget v0, p0, Ll/᩸ܿܳ;->ܽ:I

    .line 274
    iget-object v1, p0, Ll/᩸ܿܳ;->ᩳ:Ll/ܽ֨֡;

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    .line 275
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_0

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x9

    if-ne v2, v3, :cond_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
