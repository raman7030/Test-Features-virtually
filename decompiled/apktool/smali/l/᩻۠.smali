.class public final Ll/᩻۠;
.super Ljava/lang/Object;
.source "R5O3"


# instance fields
.field public final ֫:[Ljava/lang/Object;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [Ljava/lang/Object;

    .line 100
    iput-object v0, p0, Ll/᩻۠;->֫:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 5

    .line 106
    iget v0, p0, Ll/᩻۠;->ۧ:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 108
    iget-object v3, p0, Ll/᩻۠;->֫:[Ljava/lang/Object;

    aget-object v4, v3, v2

    .line 109
    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    .line 110
    iput v0, p0, Ll/᩻۠;->ۧ:I

    return-object v4

    :cond_0
    return-object v1
.end method

.method public final ֫(I[Ljava/lang/Object;)V
    .locals 5

    .line 133
    array-length v0, p2

    if-le p1, v0, :cond_0

    .line 134
    array-length p1, p2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 137
    aget-object v1, p2, v0

    .line 143
    iget v2, p0, Ll/᩻۠;->ۧ:I

    iget-object v3, p0, Ll/᩻۠;->֫:[Ljava/lang/Object;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    .line 144
    aput-object v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    .line 145
    iput v2, p0, Ll/᩻۠;->ۧ:I

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۧ۠;)V
    .locals 3

    .line 123
    iget v0, p0, Ll/᩻۠;->ۧ:I

    iget-object v1, p0, Ll/᩻۠;->֫:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 124
    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 125
    iput v0, p0, Ll/᩻۠;->ۧ:I

    :cond_0
    return-void
.end method
