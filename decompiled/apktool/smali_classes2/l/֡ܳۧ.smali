.class public final Ll/֡ܳۧ;
.super Ljava/lang/Object;
.source "B8MR"


# static fields
.field public static final ۜ:Ll/ۘܳۧ;

.field public static final ᩷:Ll/ᩴܳۧ;


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:I

.field public final ܿ:[Ll/᩵ܳۧ;

.field public ᩳ:I

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ll/ۘܳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֡ܳۧ;->ۜ:Ll/ۘܳۧ;

    .line 45
    new-instance v0, Ll/ᩴܳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֡ܳۧ;->᩷:Ll/ᩴܳۧ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput p1, p0, Ll/֡ܳۧ;->ۧ:I

    const/4 p1, 0x5

    new-array p1, p1, [Ll/᩵ܳۧ;

    .line 69
    iput-object p1, p0, Ll/֡ܳۧ;->ܿ:[Ll/᩵ܳۧ;

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֡ܳۧ;->ܳ:Ljava/util/ArrayList;

    const/4 p1, -0x1

    .line 71
    iput p1, p0, Ll/֡ܳۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 6

    .line 146
    iget v0, p0, Ll/֡ܳۧ;->֫:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֡ܳۧ;->ܳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 147
    sget-object v0, Ll/֡ܳۧ;->᩷:Ll/ᩴܳۧ;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 148
    iput v1, p0, Ll/֡ܳۧ;->֫:I

    .line 123
    :cond_0
    iget v0, p0, Ll/֡ܳۧ;->᩻:I

    int-to-float v0, v0

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v0, v0, v3

    const/4 v3, 0x0

    .line 125
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 126
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ܳۧ;

    .line 127
    iget v5, v4, Ll/᩵ܳۧ;->ܽ:I

    add-int/2addr v3, v5

    int-to-float v5, v3

    cmpl-float v5, v5, v0

    if-ltz v5, :cond_1

    .line 129
    iget v0, v4, Ll/᩵ܳۧ;->ۧ:F

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 133
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    :cond_3
    const/4 v0, 0x1

    .line 0
    invoke-static {v2, v0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 133
    check-cast v0, Ll/᩵ܳۧ;

    iget v0, v0, Ll/᩵ܳۧ;->ۧ:F

    return v0
.end method

.method public final ֫(FI)V
    .locals 6

    .line 138
    iget v0, p0, Ll/֡ܳۧ;->֫:I

    iget-object v1, p0, Ll/֡ܳۧ;->ܳ:Ljava/util/ArrayList;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    .line 139
    sget-object v0, Ll/֡ܳۧ;->ۜ:Ll/ۘܳۧ;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 140
    iput v2, p0, Ll/֡ܳۧ;->֫:I

    .line 92
    :cond_0
    iget v0, p0, Ll/֡ܳۧ;->ᩳ:I

    const/4 v3, 0x0

    iget-object v4, p0, Ll/֡ܳۧ;->ܿ:[Ll/᩵ܳۧ;

    if-lez v0, :cond_1

    sub-int/2addr v0, v2

    iput v0, p0, Ll/֡ܳۧ;->ᩳ:I

    aget-object v0, v4, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ll/᩵ܳۧ;

    invoke-direct {v0, v3}, Ll/᩵ܳۧ;-><init>(I)V

    .line 93
    :goto_0
    iget v2, p0, Ll/֡ܳۧ;->ܽ:I

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Ll/֡ܳۧ;->ܽ:I

    iput v2, v0, Ll/᩵ܳۧ;->֫:I

    .line 94
    iput p2, v0, Ll/᩵ܳۧ;->ܽ:I

    .line 95
    iput p1, v0, Ll/᩵ܳۧ;->ۧ:F

    .line 96
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    iget p1, p0, Ll/֡ܳۧ;->᩻:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/֡ܳۧ;->᩻:I

    .line 99
    :cond_2
    :goto_1
    iget p1, p0, Ll/֡ܳۧ;->᩻:I

    iget p2, p0, Ll/֡ܳۧ;->ۧ:I

    if-le p1, p2, :cond_4

    sub-int/2addr p1, p2

    .line 101
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵ܳۧ;

    .line 102
    iget v0, p2, Ll/᩵ܳۧ;->ܽ:I

    if-gt v0, p1, :cond_3

    .line 103
    iget p1, p0, Ll/֡ܳۧ;->᩻:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/֡ܳۧ;->᩻:I

    .line 104
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 105
    iget p1, p0, Ll/֡ܳۧ;->ᩳ:I

    const/4 v0, 0x5

    if-ge p1, v0, :cond_2

    add-int/lit8 v0, p1, 0x1

    .line 106
    iput v0, p0, Ll/֡ܳۧ;->ᩳ:I

    aput-object p2, v4, p1

    goto :goto_1

    :cond_3
    sub-int/2addr v0, p1

    .line 109
    iput v0, p2, Ll/᩵ܳۧ;->ܽ:I

    .line 110
    iget p2, p0, Ll/֡ܳۧ;->᩻:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/֡ܳۧ;->᩻:I

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/֡ܳۧ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, -0x1

    .line 77
    iput v0, p0, Ll/֡ܳۧ;->֫:I

    const/4 v0, 0x0

    .line 78
    iput v0, p0, Ll/֡ܳۧ;->ܽ:I

    .line 79
    iput v0, p0, Ll/֡ܳۧ;->᩻:I

    return-void
.end method
