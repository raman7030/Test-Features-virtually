.class public final Ll/ۤ᩵ܽ;
.super Ljava/lang/Object;
.source "H6VP"


# instance fields
.field public final ֫:[I

.field public final ۧ:I

.field public final ܽ:I

.field public final ܿ:[Ll/ۧۚܽ;

.field public final ᩳ:[I


# direct methods
.method public constructor <init>([Ll/ۧۚܽ;[III)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ۤ᩵ܽ;->ܿ:[Ll/ۧۚܽ;

    .line 16
    iput-object p2, p0, Ll/ۤ᩵ܽ;->ᩳ:[I

    .line 17
    iput p3, p0, Ll/ۤ᩵ܽ;->ܽ:I

    .line 18
    iput p4, p0, Ll/ۤ᩵ܽ;->ۧ:I

    const/16 p3, 0x80

    new-array p3, p3, [I

    .line 19
    iput-object p3, p0, Ll/ۤ᩵ܽ;->֫:[I

    const/4 p3, 0x0

    .line 20
    :goto_0
    iget-object p4, p0, Ll/ۤ᩵ܽ;->֫:[I

    array-length p4, p4

    if-ge p3, p4, :cond_2

    const/4 p4, 0x0

    .line 21
    :goto_1
    array-length v0, p1

    if-ge p4, v0, :cond_1

    .line 22
    aget-object v0, p1, p4

    invoke-interface {v0, p3}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Ll/ۤ᩵ܽ;->֫:[I

    aget p4, p2, p4

    aput p4, v0, p3

    goto :goto_2

    :cond_0
    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/۬ۚܽ;)Ll/ۤ᩵ܽ;
    .locals 13

    if-eqz p0, :cond_9

    .line 32
    iget v0, p0, Ll/۬ۚܽ;->ܳ:I

    iget v1, p0, Ll/۬ۚܽ;->ۧ:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/۬ۚܽ;

    if-ne v2, v3, :cond_9

    iget v2, p0, Ll/۬ۚܽ;->ܿ:I

    if-ltz v2, :cond_9

    iget v3, p0, Ll/۬ۚܽ;->ᩳ:I

    if-lt v3, v2, :cond_9

    iget v2, p0, Ll/۬ۚܽ;->᩻:I

    const/4 v3, -0x1

    if-lt v2, v3, :cond_9

    if-ltz v1, :cond_9

    if-ltz v0, :cond_9

    if-eq v1, v0, :cond_9

    iget-object v2, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v2, :cond_9

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/ܶۚܽ;

    if-ne v2, v3, :cond_9

    iget-object v2, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    if-eqz v2, :cond_9

    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/ۚۚܽ;

    if-eq v2, v3, :cond_0

    goto/16 :goto_1

    .line 39
    :cond_0
    iget-object v2, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    check-cast v2, Ll/ۚۚܽ;

    .line 40
    iget-boolean v4, v2, Ll/ۚۚܽ;->ܽ:Z

    iget v5, v2, Ll/ۚۚܽ;->ۧ:I

    if-eqz v4, :cond_9

    if-ne v5, v1, :cond_9

    iget-object v4, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v4, :cond_9

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v6, Ll/ۨ֡ܽ;

    if-eq v4, v6, :cond_1

    goto/16 :goto_1

    .line 44
    :cond_1
    iget-object v4, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v4, Ll/ۨ֡ܽ;

    .line 45
    iget-object v6, v4, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    iget-object v7, v4, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    if-eqz v6, :cond_9

    iget v8, v4, Ll/ۨ֡ܽ;->ܿ:I

    const/4 v9, 0x1

    if-lt v8, v9, :cond_9

    array-length v6, v6

    if-gt v8, v6, :cond_9

    if-eqz v7, :cond_9

    .line 46
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v8, Ll/᩺֡ܽ;

    if-ne v6, v8, :cond_9

    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v6, :cond_9

    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v8, Ll/֨ۚܽ;

    if-eq v6, v8, :cond_2

    goto/16 :goto_1

    .line 50
    :cond_2
    iget-object v6, v7, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v6, Ll/֨ۚܽ;

    .line 51
    iget-object v2, v2, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-ne v2, v6, :cond_9

    iget-boolean v2, v6, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v2, :cond_9

    iget v2, v6, Ll/֨ۚܽ;->ۧ:I

    if-nez v2, :cond_9

    iget v2, v6, Ll/֨ۚܽ;->ܽ:I

    if-ne v2, v5, :cond_9

    iget-object v2, v6, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v2, p0, :cond_3

    goto/16 :goto_1

    .line 56
    :cond_3
    iget v2, v4, Ll/ۨ֡ܽ;->ܿ:I

    new-array v5, v2, [Ll/ۧۚܽ;

    .line 57
    new-array v2, v2, [I

    const/4 v6, 0x0

    .line 58
    :goto_0
    iget v9, v4, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v6, v9, :cond_8

    .line 59
    iget-object v9, v4, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v9, v9, v6

    if-eqz v9, :cond_9

    .line 60
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    if-eq v10, v3, :cond_4

    .line 61
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    const-class v11, Ll/۬֡ܽ;

    if-eq v10, v11, :cond_4

    goto :goto_1

    .line 64
    :cond_4
    check-cast v9, Ll/ۚۚܽ;

    iget v10, v9, Ll/ۚۚܽ;->ۧ:I

    .line 65
    iget-boolean v11, v9, Ll/ۚۚܽ;->ܽ:Z

    if-eqz v11, :cond_9

    if-ltz v10, :cond_9

    if-eq v10, v1, :cond_9

    if-eq v10, v0, :cond_9

    iget-object v11, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v11, :cond_9

    .line 67
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    const-class v12, Ll/᩶֡ܽ;

    if-eq v11, v12, :cond_5

    goto :goto_1

    .line 70
    :cond_5
    iget-object v11, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v11, Ll/᩻ۚܽ;

    .line 71
    iget-object v12, v11, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    if-eqz v12, :cond_9

    iget-object v12, v11, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v12, :cond_9

    .line 72
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    if-eq v12, v8, :cond_6

    goto :goto_1

    .line 75
    :cond_6
    iget-object v12, v11, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v12, Ll/֨ۚܽ;

    .line 76
    iget-object v9, v9, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-ne v9, v12, :cond_9

    iget-boolean v9, v12, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v9, :cond_9

    iget v9, v12, Ll/֨ۚܽ;->ܽ:I

    if-ne v9, v10, :cond_9

    iget v9, v12, Ll/֨ۚܽ;->ۧ:I

    if-lez v9, :cond_9

    and-int/lit8 v10, v9, 0x1

    if-nez v10, :cond_9

    iget-object v10, v12, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v10, v7, :cond_7

    goto :goto_1

    .line 82
    :cond_7
    iget-object v10, v11, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    aput-object v10, v5, v6

    .line 83
    aput v9, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 87
    :cond_8
    new-instance v0, Ll/ۤ᩵ܽ;

    iget v1, p0, Ll/۬ۚܽ;->ܿ:I

    iget p0, p0, Ll/۬ۚܽ;->ᩳ:I

    invoke-direct {v0, v5, v2, v1, p0}, Ll/ۤ᩵ܽ;-><init>([Ll/ۧۚܽ;[III)V

    return-object v0

    :cond_9
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method
