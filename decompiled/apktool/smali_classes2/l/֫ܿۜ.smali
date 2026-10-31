.class public final Ll/֫ܿۜ;
.super Ljava/lang/Object;
.source "B7AT"


# instance fields
.field public ֫:Ll/۟ᩳۜ;

.field public final ۜ:Ljava/lang/String;

.field public final ۧ:I

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/CharSequence;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    iput-object p1, p0, Ll/֫ܿۜ;->ۜ:Ljava/lang/String;

    .line 373
    iput p2, p0, Ll/֫ܿۜ;->᩻:I

    .line 374
    iput p3, p0, Ll/֫ܿۜ;->ۧ:I

    .line 375
    iput-object p4, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    return-void
.end method

.method private ܿ()V
    .locals 5

    .line 429
    iget-object v0, p0, Ll/֫ܿۜ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-void

    .line 444
    :cond_0
    iget-object v0, p0, Ll/֫ܿۜ;->֫:Ll/۟ᩳۜ;

    iget v1, p0, Ll/֫ܿۜ;->᩻:I

    if-eqz v0, :cond_1

    goto :goto_0

    .line 447
    :cond_1
    iget-object v0, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    iget v2, p0, Ll/֫ܿۜ;->ۧ:I

    invoke-static {v1, v2, v0}, Ll/۟ᩳۜ;->֫(IILjava/lang/CharSequence;)Ll/۟ᩳۜ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܿۜ;->֫:Ll/۟ᩳۜ;

    .line 433
    :goto_0
    iget-boolean v2, v0, Ll/۟ᩳۜ;->ۧ:Z

    const/16 v3, 0xf0

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    .line 434
    :cond_2
    iget-object v0, v0, Ll/۟ᩳۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    rsub-int v0, v0, 0xf0

    div-int/lit8 v0, v0, 0x2

    .line 435
    :goto_1
    iget-object v2, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    neg-int v0, v0

    invoke-static {v1, v0, v2}, Ll/۠ۨ᩻;->ۧ(IILjava/lang/CharSequence;)I

    move-result v0

    iput v0, p0, Ll/֫ܿۜ;->ܽ:I

    .line 436
    iget-object v1, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v0, v3, v1}, Ll/۠ۨ᩻;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܿۜ;->ᩳ:Ljava/lang/String;

    .line 437
    iget v1, p0, Ll/֫ܿۜ;->ܽ:I

    if-gtz v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    :cond_3
    const/4 v4, 0x1

    :cond_4
    iput-boolean v4, p0, Ll/֫ܿۜ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 404
    invoke-direct {p0}, Ll/֫ܿۜ;->ܿ()V

    .line 405
    iget v0, p0, Ll/֫ܿۜ;->ܽ:I

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 396
    invoke-direct {p0}, Ll/֫ܿۜ;->ܿ()V

    .line 397
    iget-object v0, p0, Ll/֫ܿۜ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 412
    invoke-direct {p0}, Ll/֫ܿۜ;->ܿ()V

    .line 413
    iget-boolean v0, p0, Ll/֫ܿۜ;->ܿ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 444
    iget-object v0, p0, Ll/֫ܿۜ;->֫:Ll/۟ᩳۜ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 447
    :cond_0
    iget-object v0, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    iget v1, p0, Ll/֫ܿۜ;->᩻:I

    iget v2, p0, Ll/֫ܿۜ;->ۧ:I

    invoke-static {v1, v2, v0}, Ll/۟ᩳۜ;->֫(IILjava/lang/CharSequence;)Ll/۟ᩳۜ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܿۜ;->֫:Ll/۟ᩳۜ;

    .line 421
    :goto_0
    invoke-direct {p0}, Ll/֫ܿۜ;->ܿ()V

    const-string v0, ""

    .line 422
    iput-object v0, p0, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    return-void
.end method
