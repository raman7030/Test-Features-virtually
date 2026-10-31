.class public final Ll/ۗ۬֫;
.super Ljava/lang/Object;
.source "O8L1"


# instance fields
.field public ֫:Ll/ܺۧۧ;

.field public ۧ:Z

.field public ܳ:I

.field public ܽ:Z

.field public final synthetic ܿ:Ll/۬۬֫;

.field public final ᩳ:Ljava/lang/String;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/۬۬֫;Ljava/lang/String;ILl/ܺۧۧ;)V
    .locals 0

    .line 354
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۬֫;->ܿ:Ll/۬۬֫;

    .line 355
    iput-object p2, p0, Ll/ۗ۬֫;->ᩳ:Ljava/lang/String;

    .line 356
    iput p3, p0, Ll/ۗ۬֫;->ܳ:I

    if-nez p4, :cond_0

    const-wide/16 p1, -0x1

    goto :goto_0

    .line 358
    :cond_0
    iget-wide p1, p4, Ll/ܺۧۧ;->ܿ:J

    :goto_0
    iput-wide p1, p0, Ll/ۗ۬֫;->᩻:J

    if-eqz p4, :cond_1

    .line 359
    invoke-virtual {p4}, Ll/ܺۧۧ;->֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 360
    iput-object p4, p0, Ll/ۗ۬֫;->֫:Ll/ܺۧۧ;

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗ۬֫;->֫:Ll/ܺۧۧ;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/ۗ۬֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۗ۬֫;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗ۬֫;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۗ۬֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۗ۬֫;->᩻:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۗ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗ۬֫;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۗ۬֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗ۬֫;->ܳ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗ۬֫;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۗ۬֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۗ۬֫;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ܺۧۧ;)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_1

    .line 380
    iget p2, p0, Ll/ۗ۬֫;->ܳ:I

    if-ne p1, p2, :cond_0

    return v1

    :cond_0
    return v0

    .line 378
    :cond_1
    iget-wide v2, p2, Ll/ܺۧۧ;->ܿ:J

    .line 382
    iget-object p1, p0, Ll/ۗ۬֫;->֫:Ll/ܺۧۧ;

    if-nez p1, :cond_3

    .line 385
    invoke-virtual {p2}, Ll/ܺۧۧ;->֫()Z

    move-result p1

    if-nez p1, :cond_2

    iget-wide p1, p0, Ll/ۗ۬֫;->᩻:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_2

    return v1

    :cond_2
    return v0

    .line 389
    :cond_3
    iget-wide v4, p1, Ll/ܺۧۧ;->ܿ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_4

    iget v2, p2, Ll/ܺۧۧ;->֫:I

    iget v3, p1, Ll/ܺۧۧ;->֫:I

    if-ne v2, v3, :cond_4

    iget p2, p2, Ll/ܺۧۧ;->ۧ:I

    iget p1, p1, Ll/ܺۧۧ;->ۧ:I

    if-ne p2, p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public final ֫(Ll/֡۬֫;)Z
    .locals 9

    .line 406
    iget-object v0, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    iget-object v1, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    if-nez v0, :cond_0

    .line 409
    iget v0, p0, Ll/ۗ۬֫;->ܳ:I

    iget p1, p1, Ll/֡۬֫;->ۢ:I

    if-eq v0, p1, :cond_8

    goto :goto_0

    .line 411
    :cond_0
    iget-wide v2, p0, Ll/ۗ۬֫;->᩻:J

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    goto :goto_1

    .line 415
    :cond_1
    iget-wide v4, v0, Ll/ܺۧۧ;->ܿ:J

    cmp-long p1, v4, v2

    if-lez p1, :cond_2

    goto :goto_0

    .line 419
    :cond_2
    iget-object p1, p0, Ll/ۗ۬֫;->֫:Ll/ܺۧۧ;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    iget v2, p1, Ll/ܺۧۧ;->֫:I

    .line 423
    iget-object v3, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v3

    .line 424
    iget-object v4, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v1

    .line 425
    iget-wide v4, v0, Ll/ܺۧۧ;->ܿ:J

    iget-wide v6, p1, Ll/ܺۧۧ;->ܿ:J

    cmp-long v8, v4, v6

    if-ltz v8, :cond_8

    if-ge v3, v1, :cond_4

    goto :goto_1

    :cond_4
    if-le v3, v1, :cond_5

    goto :goto_0

    .line 434
    :cond_5
    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 435
    iget v1, v0, Ll/ܺۧۧ;->֫:I

    .line 436
    iget v0, v0, Ll/ܺۧۧ;->ۧ:I

    if-gt v1, v2, :cond_7

    if-ne v1, v2, :cond_8

    .line 438
    iget p1, p1, Ll/ܺۧۧ;->ۧ:I

    if-le v0, p1, :cond_8

    goto :goto_0

    .line 443
    :cond_6
    iget p1, v0, Ll/ܺۧۧ;->ܽ:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_7

    if-le p1, v2, :cond_8

    :cond_7
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۙ᩵֫;Ll/ۙ᩵֫;)Z
    .locals 5

    .line 365
    iget v0, p0, Ll/ۗ۬֫;->ܳ:I

    .line 450
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-lt v0, v1, :cond_0

    .line 451
    invoke-virtual {p2}, Ll/ۙ᩵֫;->ۧ()I

    move-result p1

    if-ge v0, p1, :cond_2

    goto :goto_1

    .line 453
    :cond_0
    iget-object v1, p0, Ll/ۗ۬֫;->ܿ:Ll/۬۬֫;

    invoke-static {v1}, Ll/۬۬֫;->ۧ(Ll/۬۬֫;)Ll/᩶᩵֫;

    move-result-object v4

    invoke-virtual {p1, v0, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 454
    invoke-static {v1}, Ll/۬۬֫;->ۧ(Ll/۬۬֫;)Ll/᩶᩵֫;

    move-result-object v0

    iget v0, v0, Ll/᩶᩵֫;->ᩳ:I

    .line 455
    :goto_0
    invoke-static {v1}, Ll/۬۬֫;->ۧ(Ll/۬۬֫;)Ll/᩶᩵֫;

    move-result-object v4

    iget v4, v4, Ll/᩶᩵֫;->ۜ:I

    if-gt v0, v4, :cond_2

    .line 457
    invoke-virtual {p1, v0}, Ll/ۙ᩵֫;->֫(I)Ljava/lang/Object;

    move-result-object v4

    .line 458
    invoke-virtual {p2, v4}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v3, :cond_1

    .line 460
    invoke-static {v1}, Ll/۬۬֫;->֫(Ll/۬۬֫;)Ll/᩹᩵֫;

    move-result-object p1

    .line 1275
    invoke-virtual {p2, v4, p1, v2}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object p1

    .line 460
    iget v0, p1, Ll/᩹᩵֫;->᩻:I

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    .line 365
    :goto_1
    iput v0, p0, Ll/ۗ۬֫;->ܳ:I

    if-ne v0, v3, :cond_3

    goto :goto_3

    .line 369
    :cond_3
    iget-object p1, p0, Ll/ۗ۬֫;->֫:Ll/ܺۧۧ;

    if-nez p1, :cond_4

    goto :goto_2

    .line 372
    :cond_4
    iget-object p1, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p2, p1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p1

    if-eq p1, v3, :cond_5

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_3
    return v2
.end method

.method public final ۧ(ILl/ܺۧۧ;)V
    .locals 5

    .line 396
    iget-wide v0, p0, Ll/ۗ۬֫;->᩻:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget v0, p0, Ll/ۗ۬֫;->ܳ:I

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    iget-wide p1, p2, Ll/ܺۧۧ;->ܿ:J

    iget-object v0, p0, Ll/ۗ۬֫;->ܿ:Ll/۬۬֫;

    .line 399
    invoke-static {v0}, Ll/۬۬֫;->ܽ(Ll/۬۬֫;)J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 401
    iput-wide p1, p0, Ll/ۗ۬֫;->᩻:J

    :cond_0
    return-void
.end method
