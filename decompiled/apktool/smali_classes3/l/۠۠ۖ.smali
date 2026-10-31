.class public final Ll/۠۠ۖ;
.super Ljava/lang/Object;
.source "M45G"


# instance fields
.field public final ֫:[Ll/֨۠ۖ;

.field public final ۧ:I


# direct methods
.method public varargs constructor <init>(I[Ll/֨۠ۖ;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput p1, p0, Ll/۠۠ۖ;->ۧ:I

    .line 189
    iput-object p2, p0, Ll/۠۠ۖ;->֫:[Ll/֨۠ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()[Ll/֨۠ۖ;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/۠۠ۖ;->֫:[Ll/֨۠ۖ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 193
    iget v0, p0, Ll/۠۠ۖ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 5

    .line 198
    iget-object v0, p0, Ll/۠۠ۖ;->֫:[Ll/֨۠ۖ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 199
    invoke-virtual {v4}, Ll/֨۠ۖ;->֫()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final ᩳ()I
    .locals 2

    .line 205
    iget v0, p0, Ll/۠۠ۖ;->ۧ:I

    invoke-virtual {p0}, Ll/۠۠ۖ;->ܽ()I

    move-result v1

    mul-int v1, v1, v0

    return v1
.end method
