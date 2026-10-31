.class public final Ll/᩵ۖ᩵;
.super Ljava/lang/Object;
.source "O9YQ"

# interfaces
.implements Ll/۠ۡ᩵;


# instance fields
.field public ᩸:[Ll/ᩴۖ᩵;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 162
    iget-object v0, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    if-eqz v0, :cond_1

    const-string v0, "SecurityDescriptor:\n"

    const/4 v1, 0x0

    .line 163
    :goto_0
    iget-object v2, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 164
    iget-object v2, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ll/ᩴۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const-string v0, "SecurityDescriptor:\nNULL"

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 5

    add-int/lit8 v0, p1, 0x2

    .line 111
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    add-int/lit8 v0, p1, 0x4

    .line 113
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 v1, p1, 0x8

    .line 115
    invoke-static {v1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    add-int/lit8 v2, p1, 0xc

    .line 117
    invoke-static {v2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v2, p1, 0x10

    .line 119
    invoke-static {v2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v2

    if-lez v0, :cond_0

    add-int/2addr v0, p1

    .line 123
    new-instance v3, Ll/ۚۚ᩵;

    invoke-direct {v3, p3, v0}, Ll/ۚۚ᩵;-><init>([BI)V

    :cond_0
    if-lez v1, :cond_1

    add-int/2addr v1, p1

    .line 129
    new-instance v0, Ll/ۚۚ᩵;

    invoke-direct {v0, p3, v1}, Ll/ۚۚ᩵;-><init>([BI)V

    :cond_1
    add-int v0, p1, v2

    if-lez v2, :cond_3

    add-int/lit8 v1, v0, 0x2

    .line 138
    invoke-static {v1, p3}, Ll/֫֡᩵;->֫(I[B)I

    add-int/lit8 v1, v0, 0x4

    .line 140
    invoke-static {v1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    const/16 v2, 0x1000

    if-gt v1, v2, :cond_2

    .line 146
    new-array v2, v1, [Ll/ᩴۖ᩵;

    iput-object v2, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 148
    iget-object v3, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    new-instance v4, Ll/ᩴۖ᩵;

    .line 71
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 148
    aput-object v4, v3, v2

    sub-int v3, p2, v0

    .line 149
    invoke-virtual {v4, v0, v3, p3}, Ll/ᩴۖ᩵;->֫(II[B)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 144
    :cond_2
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Invalid SecurityDescriptor"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p1

    :cond_3
    const/4 p2, 0x0

    .line 152
    iput-object p2, p0, Ll/᩵ۖ᩵;->᩸:[Ll/ᩴۖ᩵;

    :cond_4
    sub-int/2addr v0, p1

    return v0
.end method
