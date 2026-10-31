.class public final Ll/᩹᩹ᩳ;
.super Ljava/lang/Object;
.source "M6OZ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/᩸᩹ᩳ;

.field public ۛ:Ll/ۨ᩹ᩳ;

.field public ۤ:I

.field public final ۫:[Ll/᩻᩹ᩳ;

.field public ۬:I

.field public final ᩶:[I

.field public ᩸:Ll/ܶ᩹ᩳ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;II)V
    .locals 4

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Ll/᩹᩹ᩳ;->۬:I

    .line 20
    invoke-virtual {p1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    invoke-static {p2, p3, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 21
    iput-object p1, p0, Ll/᩹᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    .line 22
    iput p2, p0, Ll/᩹᩹ᩳ;->ۤ:I

    .line 23
    iput p3, p0, Ll/᩹᩹ᩳ;->᩹:I

    .line 24
    iget-object v0, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, Ll/᩶᩹ᩳ;->֫:I

    .line 25
    :goto_0
    new-array v2, v1, [Ll/᩻᩹ᩳ;

    iput-object v2, p0, Ll/᩹᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    .line 26
    new-array v1, v1, [I

    iput-object v1, p0, Ll/᩹᩹ᩳ;->᩶:[I

    .line 27
    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ll/᩸۬ᩳ;->᩺ۧ()V

    :cond_1
    if-eq p2, p3, :cond_5

    if-eqz v0, :cond_5

    .line 29
    iget p1, v0, Ll/᩶᩹ᩳ;->ܽ:I

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    .line 30
    :goto_1
    instance-of p3, v0, Ll/᩻᩹ᩳ;

    if-eqz p3, :cond_4

    .line 31
    check-cast v0, Ll/᩻᩹ᩳ;

    const/4 p3, 0x0

    .line 33
    :goto_2
    iget-object v1, v0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-ge p3, v2, :cond_3

    iget v2, p0, Ll/᩹᩹ᩳ;->ۗ:I

    aget-object v3, v1, p3

    iget v3, v3, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v2, v3

    if-lt p2, v2, :cond_3

    add-int/lit8 p3, p3, 0x1

    .line 34
    iput v2, p0, Ll/᩹᩹ᩳ;->ۗ:I

    goto :goto_2

    .line 36
    :cond_3
    iget-object v2, p0, Ll/᩹᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    aput-object v0, v2, p1

    .line 37
    iget-object v0, p0, Ll/᩹᩹ᩳ;->᩶:[I

    aput p3, v0, p1

    .line 38
    aget-object v0, v1, p3

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 40
    :cond_4
    check-cast v0, Ll/᩸᩹ᩳ;

    iput-object v0, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    :cond_5
    :goto_3
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 106
    iget-object v0, p0, Ll/᩹᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v1, 0x0

    .line 108
    iput-object v1, p0, Ll/᩹᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    .line 109
    iput-object v1, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 110
    iget-object v2, p0, Ll/᩹᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    :try_start_0
    iget-object v2, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-eqz v2, :cond_1

    .line 99
    invoke-virtual {v2}, Ll/ܶ᩹ᩳ;->close()V

    .line 100
    iput-object v1, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    .line 114
    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    .line 115
    :cond_3
    throw v1
.end method

.method public final ֫()I
    .locals 10

    .line 45
    iget-object v0, p0, Ll/᩹᩹ᩳ;->ۛ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_c

    .line 46
    :goto_0
    iget-object v0, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    iget v2, p0, Ll/᩹᩹ᩳ;->ۤ:I

    iget v3, p0, Ll/᩹᩹ᩳ;->᩹:I

    if-ge v2, v3, :cond_a

    .line 47
    iget v2, v0, Ll/᩶᩹ᩳ;->ܽ:I

    if-eqz v2, :cond_2

    .line 48
    iget-object v2, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-nez v2, :cond_0

    .line 49
    invoke-virtual {v0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 50
    iget-object v0, v0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    iget v2, p0, Ll/᩹᩹ᩳ;->ۤ:I

    iget v4, p0, Ll/᩹᩹ᩳ;->ۗ:I

    sub-int/2addr v2, v4

    invoke-virtual {v0, v2}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/᩹᩹ᩳ;->۬:I

    .line 52
    :cond_0
    iget v0, p0, Ll/᩹᩹ᩳ;->۬:I

    iget-object v2, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    iget v2, v2, Ll/᩶᩹ᩳ;->ܽ:I

    if-ge v0, v2, :cond_2

    .line 53
    iget v2, p0, Ll/᩹᩹ᩳ;->ۗ:I

    iget-object v4, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    iget-object v4, v4, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    add-int/lit8 v5, v0, 0x1

    iput v5, p0, Ll/᩹᩹ᩳ;->۬:I

    invoke-virtual {v4, v0}, Ll/ۧ۫ᩳ;->ܽ(I)I

    move-result v0

    add-int/2addr v0, v2

    if-lt v0, v3, :cond_1

    goto/16 :goto_4

    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 55
    iput v1, p0, Ll/᩹᩹ᩳ;->ۤ:I

    return v0

    .line 98
    :cond_2
    iget-object v0, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-eqz v0, :cond_3

    .line 99
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    .line 100
    iput-object v1, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 69
    :cond_3
    iget v0, p0, Ll/᩹᩹ᩳ;->ۗ:I

    iget-object v2, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    iget v2, v2, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/᩹᩹ᩳ;->ۗ:I

    .line 70
    iget-object v0, p0, Ll/᩹᩹ᩳ;->۫:[Ll/᩻᩹ᩳ;

    array-length v2, v0

    :cond_4
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_a

    .line 71
    aget-object v4, v0, v2

    .line 72
    iget-object v5, p0, Ll/᩹᩹ᩳ;->᩶:[I

    aget v6, v5, v2

    :goto_1
    add-int/lit8 v6, v6, 0x1

    iget-object v7, v4, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v8, v7

    if-ge v6, v8, :cond_4

    .line 73
    iget v8, p0, Ll/᩹᩹ᩳ;->ۗ:I

    if-lt v8, v3, :cond_5

    goto :goto_4

    .line 74
    :cond_5
    aget-object v7, v7, v6

    .line 75
    iget v9, v7, Ll/᩶᩹ᩳ;->ܽ:I

    if-nez v9, :cond_6

    .line 76
    iget v7, v7, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v8, v7

    iput v8, p0, Ll/᩹᩹ᩳ;->ۗ:I

    goto :goto_1

    .line 79
    :cond_6
    aput v6, v5, v2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 80
    instance-of v4, v7, Ll/᩻᩹ᩳ;

    if-eqz v4, :cond_8

    .line 81
    check-cast v7, Ll/᩻᩹ᩳ;

    const/4 v4, 0x0

    .line 83
    :goto_3
    iget-object v6, v7, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    aget-object v8, v6, v4

    iget v9, v8, Ll/᩶᩹ᩳ;->ܽ:I

    if-nez v9, :cond_7

    iget v6, p0, Ll/᩹᩹ᩳ;->ۗ:I

    add-int/lit8 v4, v4, 0x1

    iget v8, v8, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v6, v8

    iput v6, p0, Ll/᩹᩹ᩳ;->ۗ:I

    goto :goto_3

    .line 84
    :cond_7
    aput-object v7, v0, v2

    .line 85
    aput v4, v5, v2

    .line 86
    aget-object v7, v6, v4

    goto :goto_2

    .line 88
    :cond_8
    iget v0, p0, Ll/᩹᩹ᩳ;->ۗ:I

    if-lt v0, v3, :cond_9

    goto :goto_4

    .line 89
    :cond_9
    check-cast v7, Ll/᩸᩹ᩳ;

    iput-object v7, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    .line 90
    iput v0, p0, Ll/᩹᩹ᩳ;->ۤ:I

    goto/16 :goto_0

    .line 98
    :cond_a
    :goto_4
    iget-object v0, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    if-eqz v0, :cond_b

    .line 99
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    .line 100
    iput-object v1, p0, Ll/᩹᩹ᩳ;->᩸:Ll/ܶ᩹ᩳ;

    .line 62
    :cond_b
    iput-object v1, p0, Ll/᩹᩹ᩳ;->ۙ:Ll/᩸᩹ᩳ;

    const/4 v0, -0x1

    return v0

    .line 45
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Line cursor is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
