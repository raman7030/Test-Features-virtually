.class public final Ll/֡ܺ᩵;
.super Ll/ۛܺ᩵;
.source "RA0U"


# instance fields
.field public ֫:I

.field public ۧ:[Ll/۠ܺ᩵;


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 4

    const/4 v0, 0x4

    .line 84
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 85
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/֡ܺ᩵;->֫:I

    .line 86
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 90
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    .line 91
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0x4

    .line 92
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 94
    iget-object v2, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    if-nez v2, :cond_1

    if-ltz v0, :cond_0

    const v2, 0xffff

    if-gt v0, v2, :cond_0

    .line 97
    new-array v2, v0, [Ll/۠ܺ᩵;

    iput-object v2, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    goto :goto_0

    .line 96
    :cond_0
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "invalid array conformance"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p1

    .line 99
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 101
    iget-object v2, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    aget-object v3, v2, v1

    if-nez v3, :cond_2

    .line 102
    new-instance v3, Ll/۠ܺ᩵;

    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 102
    aput-object v3, v2, v1

    .line 104
    :cond_2
    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/۠ܺ᩵;->֫(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 3

    const/4 v0, 0x4

    .line 63
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 64
    iget v0, p0, Ll/֡ܺ᩵;->֫:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 65
    iget-object v0, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    if-eqz v0, :cond_0

    .line 68
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 69
    iget v0, p0, Ll/֡ܺ᩵;->֫:I

    .line 70
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 71
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0x4

    .line 72
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 74
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 76
    iget-object v2, p0, Ll/֡ܺ᩵;->ۧ:[Ll/۠ܺ᩵;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/۠ܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
