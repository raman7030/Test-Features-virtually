.class public final Ll/᩵ۧܿ;
.super Ljava/lang/Object;
.source "44TS"


# instance fields
.field public ֫:I

.field public ۧ:[I

.field public ܽ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 745
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 747
    iput-object v0, p0, Ll/᩵ۧܿ;->ۧ:[I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ۧܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩵ۧܿ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩵ۧܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۧܿ;->ۧ:[I

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩵ۧܿ;)Ll/ۨۘܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۧܿ;->ܽ:Ll/ۨۘܽ;

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 763
    iget-object v0, p0, Ll/᩵ۧܿ;->ۧ:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public final ֫(Ll/۫ۘܽ;)V
    .locals 4

    .line 751
    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۧܿ;->ܽ:Ll/ۨۘܽ;

    .line 752
    invoke-virtual {p1}, Ll/۫ۘܽ;->groupCount()I

    move-result v0

    iput v0, p0, Ll/᩵ۧܿ;->֫:I

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    .line 754
    iget-object v1, p0, Ll/᩵ۧܿ;->ۧ:[I

    array-length v1, v1

    if-ge v1, v0, :cond_0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩵ۧܿ;->ۧ:[I

    :cond_0
    const/4 v0, 0x0

    .line 755
    :goto_0
    iget v1, p0, Ll/᩵ۧܿ;->֫:I

    if-gt v0, v1, :cond_1

    .line 756
    iget-object v1, p0, Ll/᩵ۧܿ;->ۧ:[I

    mul-int/lit8 v2, v0, 0x2

    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->start(I)I

    move-result v3

    aput v3, v1, v2

    .line 757
    iget-object v1, p0, Ll/᩵ۧܿ;->ۧ:[I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->end(I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ۨۘܽ;
    .locals 1

    .line 761
    iget-object v0, p0, Ll/᩵ۧܿ;->ܽ:Ll/ۨۘܽ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 762
    iget-object v0, p0, Ll/᩵ۧܿ;->ۧ:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method
