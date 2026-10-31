.class public final Ll/᩷ۛܺ;
.super Ll/ۛ۬ܺ;
.source "J58E"


# static fields
.field public static final ۛ:Ll/᩷ۛܺ;

.field public static final ۨ:[Ljava/lang/Object;


# instance fields
.field public final transient ۗ:I

.field public final transient ۙ:[Ljava/lang/Object;

.field public final transient ۤ:[Ljava/lang/Object;

.field public final transient ۫:I

.field public final transient ۬:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    .line 35
    sput-object v6, Ll/᩷ۛܺ;->ۨ:[Ljava/lang/Object;

    .line 36
    new-instance v0, Ll/᩷ۛܺ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v1, v0

    move-object v5, v6

    invoke-direct/range {v1 .. v6}, Ll/᩷ۛܺ;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    sput-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-void
.end method

.method public constructor <init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 50
    iput-object p4, p0, Ll/᩷ۛܺ;->ۙ:[Ljava/lang/Object;

    .line 51
    iput p1, p0, Ll/᩷ۛܺ;->ۗ:I

    .line 52
    iput-object p5, p0, Ll/᩷ۛܺ;->ۤ:[Ljava/lang/Object;

    .line 53
    iput p2, p0, Ll/᩷ۛܺ;->۬:I

    .line 54
    iput p3, p0, Ll/᩷ۛܺ;->۫:I

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 60
    iget-object v1, p0, Ll/᩷ۛܺ;->ۤ:[Ljava/lang/Object;

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 63
    :cond_0
    invoke-static {p1}, Ll/ۗۗܺ;->֫(Ljava/lang/Object;)I

    move-result v2

    .line 64
    :goto_0
    iget v3, p0, Ll/᩷ۛܺ;->۬:I

    and-int/2addr v2, v3

    .line 65
    aget-object v3, v1, v2

    if-nez v3, :cond_1

    return v0

    .line 68
    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 120
    iget v0, p0, Ll/᩷ۛܺ;->ۗ:I

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 32
    invoke-virtual {p0}, Ll/᩷ۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 84
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 76
    iget v0, p0, Ll/᩷ۛܺ;->۫:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 134
    invoke-super {p0}, Ll/ۛ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 3

    .line 104
    iget-object v0, p0, Ll/᩷ۛܺ;->ۙ:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Ll/᩷ۛܺ;->۫:I

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v2

    return p1
.end method

.method public final ۜ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()[Ljava/lang/Object;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/᩷ۛܺ;->ۙ:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 99
    iget v0, p0, Ll/᩷ۛܺ;->۫:I

    return v0
.end method

.method public final ᩻()Ll/ܳ۬ܺ;
    .locals 2

    .line 110
    iget-object v0, p0, Ll/᩷ۛܺ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/᩷ۛܺ;->۫:I

    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
