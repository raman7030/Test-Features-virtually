.class public final Ll/ۘܿۖ;
.super Ljava/lang/Object;
.source "TUG"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:[C


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ۘܿۖ;->᩹:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۘܿۖ;->᩹:[C

    array-length v0, v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    .line 146
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۘܿۖ;->᩹:[C

    sub-int/2addr p2, p1

    invoke-direct {v0, v1, p1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ۘܿۖ;->᩸:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 153
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۘܿۖ;->᩹:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    iput-object v0, p0, Ll/ۘܿۖ;->᩸:Ljava/lang/String;

    .line 155
    :cond_0
    iget-object v0, p0, Ll/ۘܿۖ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫([C)V
    .locals 0

    .line 130
    iput-object p1, p0, Ll/ۘܿۖ;->᩹:[C

    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, Ll/ۘܿۖ;->᩸:Ljava/lang/String;

    return-void
.end method
