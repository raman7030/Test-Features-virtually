.class public final Ll/ܽܿ᩻;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public final ֫:[I

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1036
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1037
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܽܿ᩻;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 1093
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    .line 1105
    iget v1, p0, Ll/ܽܿ᩻;->ۧ:I

    add-int/2addr v1, v0

    .line 1106
    iget-object v2, p0, Ll/ܽܿ᩻;->֫:[I

    array-length v3, v2

    if-lt v1, v3, :cond_1

    .line 1107
    array-length v3, v2

    sub-int/2addr v1, v3

    .line 1094
    :cond_1
    aget v1, v2, v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(I)V
    .locals 4

    .line 1051
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    iget-object v1, p0, Ll/ܽܿ᩻;->֫:[I

    array-length v2, v1

    if-eq v0, v2, :cond_1

    .line 1105
    iget v2, p0, Ll/ܽܿ᩻;->ۧ:I

    add-int/2addr v2, v0

    .line 1106
    array-length v3, v1

    if-lt v2, v3, :cond_0

    .line 1107
    array-length v3, v1

    sub-int/2addr v2, v3

    .line 1054
    :cond_0
    aput p1, v1, v2

    add-int/lit8 v0, v0, 0x1

    .line 1055
    iput v0, p0, Ll/ܽܿ᩻;->ܽ:I

    return-void

    .line 1052
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Code point window is full"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/֫ܿ᩻;)V
    .locals 1

    if-ltz p1, :cond_1

    .line 1074
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    if-gt p1, v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 1078
    invoke-virtual {p0, p2}, Ll/ܽܿ᩻;->֫(Ll/֫ܿ᩻;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 1075
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Code point count is out of range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫ܿ᩻;)V
    .locals 2

    .line 1062
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    if-eqz v0, :cond_1

    .line 1065
    iget v0, p0, Ll/ܽܿ᩻;->ۧ:I

    iget-object v1, p0, Ll/ܽܿ᩻;->֫:[I

    aget v0, v1, v0

    invoke-interface {p1, v0}, Ll/֫ܿ᩻;->֫(I)V

    .line 1066
    iget p1, p0, Ll/ܽܿ᩻;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    .line 1117
    array-length v0, v1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 1066
    :cond_0
    iput p1, p0, Ll/ܽܿ᩻;->ۧ:I

    .line 1067
    iget p1, p0, Ll/ܽܿ᩻;->ܽ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܽܿ᩻;->ܽ:I

    return-void

    .line 1063
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Code point window is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 1044
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    return v0
.end method

.method public final ۧ(Ll/֫ܿ᩻;)V
    .locals 1

    .line 1086
    iget v0, p0, Ll/ܽܿ᩻;->ܽ:I

    invoke-virtual {p0, v0, p1}, Ll/ܽܿ᩻;->֫(ILl/֫ܿ᩻;)V

    return-void
.end method
