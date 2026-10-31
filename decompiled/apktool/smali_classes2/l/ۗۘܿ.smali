.class public final Ll/ۗۘܿ;
.super Ljava/lang/Object;
.source "76ZW"


# instance fields
.field public ֫:[Ll/᩶ۘܿ;

.field public ۧ:[I

.field public ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 136
    iput-object v1, p0, Ll/ۗۘܿ;->ۧ:[I

    new-array v0, v0, [Ll/᩶ۘܿ;

    .line 137
    iput-object v0, p0, Ll/ۗۘܿ;->֫:[Ll/᩶ۘܿ;

    if-ltz p1, :cond_0

    .line 143
    iput p1, p0, Ll/ۗۘܿ;->ᩳ:I

    return-void

    .line 142
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative text length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۗۘܿ;)[Ll/᩶ۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۘܿ;->֫:[Ll/᩶ۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۗۘܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۘܿ;->ۧ:[I

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۗۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗۘܿ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۗۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗۘܿ;->ᩳ:I

    return p0
.end method


# virtual methods
.method public final ֫(Ll/᩸ۘܿ;)Ll/۫ۘܿ;
    .locals 1

    .line 168
    new-instance v0, Ll/۫ۘܿ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p0, p1}, Ll/۫ۘܿ;-><init>(Ll/ۗۘܿ;Ll/᩸ۘܿ;)V

    return-object v0
.end method

.method public final ֫(ILl/᩶ۘܿ;)V
    .locals 6

    .line 151
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    iget v0, p0, Ll/ۗۘܿ;->ᩳ:I

    invoke-static {p1, p1, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 153
    invoke-virtual {p2}, Ll/᩶ۘܿ;->᩻()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 156
    iget v0, p0, Ll/ۗۘܿ;->ܽ:I

    iget-object v1, p0, Ll/ۗۘܿ;->ۧ:[I

    array-length v1, v1

    if-ne v0, v1, :cond_1

    ushr-int/lit8 v1, v0, 0x1

    const/16 v2, 0x10

    .line 157
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-long v2, v0

    int-to-long v0, v1

    add-long/2addr v2, v0

    long-to-int v0, v2

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 158
    iget-object v1, p0, Ll/ۗۘܿ;->ۧ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۗۘܿ;->ۧ:[I

    .line 159
    iget-object v1, p0, Ll/ۗۘܿ;->֫:[Ll/᩶ۘܿ;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ۘܿ;

    iput-object v0, p0, Ll/ۗۘܿ;->֫:[Ll/᩶ۘܿ;

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 161
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۗۘܿ;->ۧ:[I

    iget v1, p0, Ll/ۗۘܿ;->ܽ:I

    aput p1, v0, v1

    .line 162
    iget-object p1, p0, Ll/ۗۘܿ;->֫:[Ll/᩶ۘܿ;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 163
    iput v1, p0, Ll/ۗۘܿ;->ܽ:I

    return-void

    .line 154
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Index and dependency lengths differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
