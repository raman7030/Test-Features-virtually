.class public Ll/ܽ᩶ۚ;
.super Ljava/lang/Object;
.source "G67D"


# instance fields
.field public ֫:Ll/ᩳ᩶ۚ;

.field public ۧ:Ll/ܽ᩶ۚ;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ܽ᩶ۚ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۛ᩶ۚ;II)I
    .locals 2

    and-int/lit16 v0, p1, 0x1000

    if-eqz v0, :cond_0

    .line 367
    invoke-virtual {p0}, Ll/ۛ᩶ۚ;->ܿ()I

    move-result v0

    const/16 v1, 0x31

    if-ge v0, v1, :cond_0

    const-string v0, "Synthetic"

    .line 369
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    const/4 v0, 0x6

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_1

    const-string p2, "Signature"

    .line 374
    invoke-virtual {p0, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x8

    :cond_1
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-eqz p1, :cond_2

    const-string p1, "Deprecated"

    .line 380
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x6

    :cond_2
    return v0
.end method

.method public static ֫(Ll/ۛ᩶ۚ;IILl/ᩳ᩶ۚ;)V
    .locals 3

    and-int/lit16 v0, p1, 0x1000

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 456
    invoke-virtual {p0}, Ll/ۛ᩶ۚ;->ܿ()I

    move-result v0

    const/16 v2, 0x31

    if-ge v0, v2, :cond_0

    const-string v0, "Synthetic"

    .line 457
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p3, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    invoke-virtual {p3, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    :cond_0
    if-eqz p2, :cond_1

    const-string v0, "Signature"

    .line 461
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p3, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v0, 0x2

    .line 462
    invoke-virtual {p3, v0}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 463
    invoke-virtual {p3, p2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :cond_1
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-eqz p1, :cond_2

    const-string p1, "Deprecated"

    .line 466
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {p3, p0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    invoke-virtual {p3, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ᩶ۚ;)I
    .locals 4

    .line 339
    iget-object v0, p1, Ll/ۛ᩶ۚ;->ᩳ:Ll/ۜ᩶ۚ;

    const/4 v1, 0x0

    move-object v2, p0

    :goto_0
    if-eqz v2, :cond_1

    .line 343
    iget-object v3, v2, Ll/ܽ᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 213
    iget-object v3, v2, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    if-nez v3, :cond_0

    .line 214
    invoke-virtual {v2, v0}, Ll/ܽ᩶ۚ;->֫(Ll/ۜ᩶ۚ;)Ll/ᩳ᩶ۚ;

    move-result-object v3

    iput-object v3, v2, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    .line 216
    :cond_0
    iget-object v3, v2, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    .line 344
    iget v3, v3, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v3, v3, 0x6

    add-int/2addr v1, v3

    .line 345
    iget-object v2, v2, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ֫(Ll/ܿ᩶ۚ;II[C)Ll/ܽ᩶ۚ;
    .locals 3

    .line 132
    new-instance p4, Ll/ܽ᩶ۚ;

    iget-object v0, p0, Ll/ܽ᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-direct {p4, v0}, Ll/ܽ᩶ۚ;-><init>(Ljava/lang/String;)V

    .line 133
    new-instance v0, Ll/ᩳ᩶ۚ;

    .line 3612
    new-array v1, p3, [B

    .line 3613
    iget-object p1, p1, Ll/ܿ᩶ۚ;->ۧ:[B

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object v1, v0, Ll/ᩳ᩶ۚ;->֫:[B

    .line 65
    iput p3, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    .line 133
    iput-object v0, p4, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    return-object p4
.end method

.method public ֫(Ll/ۜ᩶ۚ;)Ll/ᩳ᩶ۚ;
    .locals 0

    .line 247
    iget-object p1, p0, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    return-object p1
.end method

.method public final ֫(Ll/ۛ᩶ۚ;Ll/ᩳ᩶ۚ;)V
    .locals 5

    .line 427
    iget-object v0, p1, Ll/ۛ᩶ۚ;->ᩳ:Ll/ۜ᩶ۚ;

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_1

    .line 213
    iget-object v2, v1, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    if-nez v2, :cond_0

    .line 214
    invoke-virtual {v1, v0}, Ll/ܽ᩶ۚ;->֫(Ll/ۜ᩶ۚ;)Ll/ᩳ᩶ۚ;

    move-result-object v2

    iput-object v2, v1, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    .line 216
    :cond_0
    iget-object v2, v1, Ll/ܽ᩶ۚ;->֫:Ll/ᩳ᩶ۚ;

    .line 433
    iget-object v3, v1, Ll/ܽ᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v3}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v3, v2, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-virtual {p2, v3}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 434
    iget-object v3, v2, Ll/ᩳ᩶ۚ;->֫:[B

    const/4 v4, 0x0

    iget v2, v2, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-virtual {p2, v4, v2, v3}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 435
    iget-object v1, v1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    goto :goto_0

    :cond_1
    return-void
.end method
