.class public final Ll/ۙܺ᩵;
.super Ll/ۛܺ᩵;
.source "9A0K"


# instance fields
.field public ֫:[Ll/᩹ܺ᩵;

.field public ۧ:I


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 4

    const/4 v0, 0x4

    .line 77
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 78
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/ۙܺ᩵;->ۧ:I

    .line 79
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_3

    .line 82
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 83
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    .line 84
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0x4

    .line 85
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 87
    iget-object v2, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    if-nez v2, :cond_1

    if-ltz v0, :cond_0

    const v2, 0xffff

    if-gt v0, v2, :cond_0

    .line 90
    new-array v2, v0, [Ll/᩹ܺ᩵;

    iput-object v2, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    goto :goto_0

    .line 89
    :cond_0
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "invalid array conformance"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 89
    throw p1

    .line 92
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 94
    iget-object v2, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    aget-object v3, v2, v1

    if-nez v3, :cond_2

    .line 95
    new-instance v3, Ll/᩹ܺ᩵;

    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 95
    aput-object v3, v2, v1

    .line 97
    :cond_2
    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩹ܺ᩵;->֫(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 3

    const/4 v0, 0x4

    .line 56
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 57
    iget v0, p0, Ll/ۙܺ᩵;->ۧ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 58
    iget-object v0, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    if-eqz v0, :cond_0

    .line 61
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 62
    iget v0, p0, Ll/ۙܺ᩵;->ۧ:I

    .line 63
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 64
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0x4

    .line 65
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 67
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 69
    iget-object v2, p0, Ll/ۙܺ᩵;->֫:[Ll/᩹ܺ᩵;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩹ܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
