.class public abstract Ll/ۤܶ۠;
.super Ljava/lang/Object;
.source "V42A"

# interfaces
.implements Ll/ܳ᩹۠;
.implements Ll/᩸ۢ۠;


# instance fields
.field public final ᩸:Ll/۫ܶ۠;


# direct methods
.method public constructor <init>(Ll/۫ܶ۠;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 73
    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 114
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 66
    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 80
    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 159
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    invoke-static {v1, v2, v0}, Ll/۬֨۠;->֫(II[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(B)I
    .locals 4

    .line 120
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    .line 121
    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    .line 122
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_0

    add-int v3, v1, v2

    .line 123
    aget-byte v3, v0, v3

    if-eq v3, p1, :cond_0

    goto :goto_0

    :cond_0
    return v2
.end method

.method public final ֫(Ll/ۛ᩸֨;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final ֫(CLl/ۤܶ۠;)Ll/ۤܶ۠;
    .locals 5

    .line 97
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    .line 98
    invoke-virtual {p2}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    add-int/2addr v2, v1

    new-array v3, v2, [B

    const/4 v4, 0x0

    .line 99
    invoke-virtual {p0, v4, v3}, Ll/ۤܶ۠;->֫(I[B)V

    int-to-byte p1, p1

    .line 100
    aput-byte p1, v3, v0

    .line 101
    invoke-virtual {p2, v1, v3}, Ll/ۤܶ۠;->֫(I[B)V

    .line 102
    iget-object p1, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    invoke-virtual {p1, v4, v2, v3}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(II)Ll/ۤܶ۠;
    .locals 2

    if-ge p2, p1, :cond_0

    move p2, p1

    .line 152
    :cond_0
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    add-int/2addr v1, p1

    sub-int/2addr p2, p1

    iget-object p1, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    invoke-virtual {p1, v1, p2, v0}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۤܶ۠;)Ll/ۤܶ۠;
    .locals 4

    .line 86
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v0

    .line 87
    invoke-virtual {p1}, Ll/ۤܶ۠;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 88
    invoke-virtual {p0, v3, v2}, Ll/ۤܶ۠;->֫(I[B)V

    .line 89
    invoke-virtual {p1, v0, v2}, Ll/ۤܶ۠;->֫(I[B)V

    .line 90
    iget-object p1, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    invoke-virtual {p1, v3, v1, v2}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I[B)V
    .locals 3

    .line 186
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract ֫()[B
.end method

.method public final ۘ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract ۧ(I)B
.end method

.method public abstract ۧ()I
.end method

.method public final ۧ(Ll/ۤܶ۠;)Z
    .locals 8

    .line 130
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    .line 131
    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    .line 132
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    .line 133
    invoke-virtual {p1}, Ll/ۤܶ۠;->֫()[B

    move-result-object v3

    .line 134
    invoke-virtual {p1}, Ll/ۤܶ۠;->ᩳ()I

    move-result v4

    .line 135
    invoke-virtual {p1}, Ll/ۤܶ۠;->ۧ()I

    move-result p1

    const/4 v5, 0x0

    if-ge v2, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    add-int v6, v1, v2

    .line 141
    aget-byte v6, v0, v6

    add-int v7, v4, v2

    aget-byte v7, v3, v7

    if-ne v6, v7, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v5
.end method

.method public abstract ܿ()I
.end method

.method public abstract ᩳ()I
.end method
