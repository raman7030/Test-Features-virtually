.class public final Ll/ܰ᩵ܽ;
.super Ljava/lang/Object;
.source "I6VW"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final ֫:[I

.field public final ۧ:[I

.field public final ܽ:[Ll/ۧۚܽ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 5

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 90
    new-array v1, v0, [Ll/ۧۚܽ;

    iput-object v1, p0, Ll/ܰ᩵ܽ;->ܽ:[Ll/ۧۚܽ;

    .line 91
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ᩵ܽ;->ۧ:[I

    .line 92
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ᩵ܽ;->֫:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 94
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩵ܽ;

    .line 95
    iget-object v3, p0, Ll/ܰ᩵ܽ;->ܽ:[Ll/ۧۚܽ;

    iget-object v4, v2, Ll/᩺᩵ܽ;->ܽ:Ll/ۧۚܽ;

    aput-object v4, v3, v1

    .line 96
    iget-object v3, p0, Ll/ܰ᩵ܽ;->ۧ:[I

    iget v4, v2, Ll/᩺᩵ܽ;->ۧ:I

    aput v4, v3, v1

    .line 97
    iget-object v3, p0, Ll/ܰ᩵ܽ;->֫:[I

    iget v2, v2, Ll/᩺᩵ܽ;->֫:I

    aput v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 99
    :cond_0
    iput p2, p0, Ll/ܰ᩵ܽ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 2

    .line 104
    iget v0, p0, Ll/ܰ᩵ܽ;->ᩳ:I

    :goto_0
    if-ltz v0, :cond_1

    .line 106
    iget-object v1, p0, Ll/ܰ᩵ܽ;->ܽ:[Ll/ۧۚܽ;

    aget-object v1, v1, v0

    invoke-interface {v1, p1}, Ll/ۧۚܽ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ܰ᩵ܽ;->ۧ:[I

    aget v0, v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ܰ᩵ܽ;->֫:[I

    aget v0, v1, v0

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    if-ne v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
