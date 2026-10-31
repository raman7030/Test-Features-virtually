.class public final Ll/᩷᩹ᩳ;
.super Ljava/lang/Object;
.source "D6UD"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:I

.field public ۙ:Ll/᩸᩹ᩳ;

.field public ۛ:Ll/ۨ᩹ᩳ;

.field public ۤ:I

.field public final ۫:[Ll/᩻᩹ᩳ;

.field public ۬:I

.field public final ᩶:[I

.field public ᩸:Ll/ܶ᩹ᩳ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;I)V
    .locals 2

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-direct {p0, p1, v0, v1, p2}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩹ᩳ;III)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    invoke-static {p2, p3, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 29
    iput-object p1, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    .line 30
    iput p2, p0, Ll/᩷᩹ᩳ;->᩹:I

    .line 31
    iput p3, p0, Ll/᩷᩹ᩳ;->ۗ:I

    .line 32
    iget-object p2, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    iget p2, p2, Ll/᩶᩹ᩳ;->֫:I

    .line 33
    :goto_0
    new-array p3, p2, [Ll/᩻᩹ᩳ;

    iput-object p3, p0, Ll/᩷᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    .line 34
    new-array p2, p2, [I

    iput-object p2, p0, Ll/᩷᩹ᩳ;->᩶:[I

    .line 35
    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {p0, p4}, Ll/᩷᩹ᩳ;->֫(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 39
    :goto_1
    invoke-virtual {p0}, Ll/᩷᩹ᩳ;->close()V

    .line 40
    throw p1
.end method

.method private ᩳ()V
    .locals 6

    .line 153
    iget-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 128
    :cond_0
    iget-object v0, p0, Ll/᩷᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    array-length v1, v0

    :cond_1
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    .line 129
    aget-object v2, v0, v1

    .line 130
    iget-object v3, p0, Ll/᩷᩹ᩳ;->᩶:[I

    aget v4, v3, v1

    add-int/lit8 v4, v4, 0x1

    if-ltz v4, :cond_1

    .line 131
    iget-object v2, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v5, v2

    if-lt v4, v5, :cond_2

    goto :goto_0

    .line 132
    :cond_2
    aput v4, v3, v1

    .line 133
    aget-object v2, v2, v4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 134
    instance-of v4, v2, Ll/᩻᩹ᩳ;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 135
    check-cast v2, Ll/᩻᩹ᩳ;

    iget-object v4, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 136
    aput-object v2, v0, v1

    .line 137
    aput v5, v3, v1

    .line 138
    aget-object v2, v4, v5

    goto :goto_1

    .line 140
    :cond_3
    check-cast v2, Ll/᩸᩹ᩳ;

    iput-object v2, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 141
    iput v5, p0, Ll/᩷᩹ᩳ;->۬:I

    return-void

    .line 144
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing adjacent leaf"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 161
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v1, 0x0

    .line 163
    iput-object v1, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    .line 164
    iput-object v1, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 165
    iget-object v2, p0, Ll/᩷᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    :try_start_0
    iget-object v2, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-eqz v2, :cond_1

    .line 154
    invoke-virtual {v2}, Ll/ܶ᩹ᩳ;->close()V

    .line 155
    iput-object v1, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    .line 169
    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    .line 170
    :cond_3
    throw v1
.end method

.method public final position()I
    .locals 2

    .line 45
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_0

    .line 50
    iget v0, p0, Ll/᩷᩹ᩳ;->ۤ:I

    iget v1, p0, Ll/᩷᩹ᩳ;->᩹:I

    sub-int/2addr v0, v1

    return v0

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text cursor is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 5

    .line 45
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_4

    .line 66
    iget v0, p0, Ll/᩷᩹ᩳ;->ۗ:I

    iget v1, p0, Ll/᩷᩹ᩳ;->᩹:I

    sub-int/2addr v0, v1

    invoke-static {p1, p1, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 153
    iget-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    .line 155
    iput-object v2, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    :cond_0
    add-int/2addr p1, v1

    .line 69
    iput p1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    .line 70
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 72
    iput-object v2, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 73
    iput v1, p0, Ll/᩷᩹ᩳ;->۬:I

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 76
    :goto_0
    instance-of v2, v0, Ll/᩻᩹ᩳ;

    if-eqz v2, :cond_3

    .line 77
    check-cast v0, Ll/᩻᩹ᩳ;

    const/4 v2, 0x0

    .line 79
    :goto_1
    iget-object v3, v0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    if-ge v2, v4, :cond_2

    aget-object v4, v3, v2

    iget v4, v4, Ll/᩶᩹ᩳ;->ۧ:I

    if-lt p1, v4, :cond_2

    add-int/lit8 v2, v2, 0x1

    sub-int/2addr p1, v4

    goto :goto_1

    .line 82
    :cond_2
    iget-object v4, p0, Ll/᩷᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    aput-object v0, v4, v1

    .line 83
    iget-object v0, p0, Ll/᩷᩹ᩳ;->᩶:[I

    aput v2, v0, v1

    .line 84
    aget-object v0, v3, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 86
    :cond_3
    check-cast v0, Ll/᩸᩹ᩳ;

    iput-object v0, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 87
    iput p1, p0, Ll/᩷᩹ᩳ;->۬:I

    return-void

    .line 45
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Text cursor is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([CII)V
    .locals 4

    .line 45
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_3

    .line 111
    invoke-static {p1, p2, p3}, Ll/۬᩹ᩳ;->֫([CII)V

    .line 112
    iget v0, p0, Ll/᩷᩹ᩳ;->ۗ:I

    iget v1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-lez p3, :cond_2

    .line 115
    iget v0, p0, Ll/᩷᩹ᩳ;->۬:I

    iget-object v1, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    iget v1, v1, Ll/᩶᩹ᩳ;->ۧ:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Ll/᩷᩹ᩳ;->ᩳ()V

    .line 116
    :cond_0
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    iget v0, v0, Ll/᩶᩹ᩳ;->ۧ:I

    iget v1, p0, Ll/᩷᩹ᩳ;->۬:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 148
    iget-object v1, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    invoke-virtual {v1}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v1

    iput-object v1, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 149
    :cond_1
    iget-object v1, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    iget-object v1, v1, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    .line 117
    iget v2, p0, Ll/᩷᩹ᩳ;->۬:I

    add-int v3, v2, v0

    invoke-virtual {v1, v2, v3, p1, p2}, Ll/ۧ۫ᩳ;->֫(II[CI)V

    .line 118
    iget v1, p0, Ll/᩷᩹ᩳ;->۬:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩷᩹ᩳ;->۬:I

    .line 119
    iget v1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    goto :goto_0

    :cond_2
    return-void

    .line 45
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Text cursor is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 45
    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_1

    .line 55
    iget v0, p0, Ll/᩷᩹ᩳ;->ۤ:I

    iget v1, p0, Ll/᩷᩹ᩳ;->ۗ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text cursor is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()C
    .locals 2

    .line 91
    invoke-virtual {p0}, Ll/᩷᩹ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    iget v0, p0, Ll/᩷᩹ᩳ;->۬:I

    iget-object v1, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    iget v1, v1, Ll/᩶᩹ᩳ;->ۧ:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Ll/᩷᩹ᩳ;->ᩳ()V

    .line 148
    :cond_0
    iget-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩷᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    invoke-virtual {v0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 149
    :cond_1
    iget-object v0, p0, Ll/᩷᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    iget-object v0, v0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    .line 93
    iget v1, p0, Ll/᩷᩹ᩳ;->۬:I

    invoke-virtual {v0, v1}, Ll/ۧ۫ᩳ;->֫(I)C

    move-result v0

    .line 94
    iget v1, p0, Ll/᩷᩹ᩳ;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩷᩹ᩳ;->۬:I

    .line 95
    iget v1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩷᩹ᩳ;->ۤ:I

    return v0

    .line 91
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
