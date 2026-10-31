.class public final Ll/ۚ᩸۠;
.super Ll/۫ܶ۠;
.source "C43R"


# instance fields
.field public ۧ:I

.field public ܽ:[Ll/᩵᩸۠;

.field public ᩳ:I


# direct methods
.method public static ֫(Ll/ۛܶ۠;)Ll/ۚ᩸۠;
    .locals 1

    .line 42
    new-instance v0, Ll/ۚ᩸۠;

    .line 70
    invoke-direct {v0, p0}, Ll/۫ܶ۠;-><init>(Ll/ۛܶ۠;)V

    const/16 p0, 0x7fff

    .line 71
    iput p0, v0, Ll/ۚ᩸۠;->ۧ:I

    const p0, 0x8000

    new-array p0, p0, [Ll/᩵᩸۠;

    .line 72
    iput-object p0, v0, Ll/ۚ᩸۠;->ܽ:[Ll/᩵᩸۠;

    return-object v0
.end method


# virtual methods
.method public final ֫(II[B)Ll/ۤܶ۠;
    .locals 8

    .line 89
    invoke-static {p1, p2, p3}, Ll/۫ܶ۠;->ۧ(II[B)I

    move-result v0

    iget v1, p0, Ll/ۚ᩸۠;->ۧ:I

    and-int/2addr v0, v1

    .line 91
    iget-object v1, p0, Ll/ۚ᩸۠;->ܽ:[Ll/᩵᩸۠;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    move-object v3, v1

    move-object v4, v2

    :goto_0
    const/4 v5, 0x0

    if-eqz v1, :cond_4

    .line 99
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡᩸۠;

    if-nez v6, :cond_2

    if-ne v3, v1, :cond_0

    .line 103
    iget-object v3, p0, Ll/ۚ᩸۠;->ܽ:[Ll/᩵᩸۠;

    iget-object v5, v1, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    aput-object v5, v3, v0

    move-object v3, v5

    goto :goto_1

    :cond_0
    if-eqz v4, :cond_1

    .line 107
    iget-object v5, v1, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    iput-object v5, v4, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    goto :goto_1

    :cond_1
    const-string p1, "previousNonNullTableEntry cannot be null here."

    .line 137
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    throw v2

    .line 159
    :cond_2
    iget-object v4, v6, Ll/֡᩸۠;->᩹:[B

    array-length v7, v4

    if-ne v7, p2, :cond_3

    .line 111
    invoke-static {v5, v4, p1, p3, p2}, Ll/۫ܶ۠;->֫(I[BI[BI)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v6

    :cond_3
    move-object v4, v1

    .line 117
    :goto_1
    iget-object v1, v1, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    goto :goto_0

    .line 120
    :cond_4
    new-array v1, p2, [B

    .line 121
    invoke-static {p3, p1, v1, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    new-instance p1, Ll/֡᩸۠;

    iget p2, p0, Ll/ۚ᩸۠;->ᩳ:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Ll/ۚ᩸۠;->ᩳ:I

    invoke-direct {p1, p0, v1, p2}, Ll/֡᩸۠;-><init>(Ll/ۚ᩸۠;[BI)V

    .line 124
    new-instance p2, Ll/᩵᩸۠;

    .line 48
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    if-nez v4, :cond_5

    .line 127
    iget-object p3, p0, Ll/ۚ᩸۠;->ܽ:[Ll/᩵᩸۠;

    aput-object p2, p3, v0

    return-object p1

    .line 130
    :cond_5
    iget-object p3, v4, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    if-nez p3, :cond_6

    .line 131
    iput-object p2, v4, Ll/᩵᩸۠;->֫:Ll/᩵᩸۠;

    return-object p1

    :cond_6
    const-string p1, "previousNonNullTableEntry.next must be null."

    .line 120
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    throw v2
.end method

.method public final ֫([CI)Ll/ۤܶ۠;
    .locals 2

    mul-int/lit8 v0, p2, 0x3

    .line 82
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 83
    invoke-static {v0, v1, p2, p1}, Ll/۬֨۠;->֫([BII[C)I

    move-result p1

    .line 84
    invoke-virtual {p0, v1, p1, v0}, Ll/ۚ᩸۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 139
    iput-object v0, p0, Ll/ۚ᩸۠;->ܽ:[Ll/᩵᩸۠;

    return-void
.end method
