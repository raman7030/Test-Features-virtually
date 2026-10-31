.class public final Ll/᩻ۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܿᩳܳ;

.field public final ܽ:Ll/ᩴܽܳ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩷ᩳܳ;)V
    .locals 1

    .line 1623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1624
    iget-object v0, p1, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    iput-object v0, p0, Ll/᩻ۧܳ;->ܽ:Ll/ᩴܽܳ;

    .line 1625
    iget v0, p1, Ll/᩷ᩳܳ;->ᩳ:I

    iput v0, p0, Ll/᩻ۧܳ;->ᩳ:I

    .line 1626
    iget v0, p1, Ll/᩷ᩳܳ;->֫:I

    iput v0, p0, Ll/᩻ۧܳ;->֫:I

    .line 1627
    iget-object p1, p1, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    iput-object p1, p0, Ll/᩻ۧܳ;->ۧ:Ll/ܿᩳܳ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1636
    :cond_0
    instance-of v1, p1, Ll/᩻ۧܳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ll/᩻ۧܳ;

    .line 1639
    iget-object v1, p0, Ll/᩻ۧܳ;->ܽ:Ll/ᩴܽܳ;

    iget-object v3, p1, Ll/᩻ۧܳ;->ܽ:Ll/ᩴܽܳ;

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/᩻ۧܳ;->ᩳ:I

    iget v3, p1, Ll/᩻ۧܳ;->ᩳ:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/᩻ۧܳ;->֫:I

    iget v3, p1, Ll/᩻ۧܳ;->֫:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/᩻ۧܳ;->ۧ:Ll/ܿᩳܳ;

    iget-object p1, p1, Ll/᩻ۧܳ;->ۧ:Ll/ܿᩳܳ;

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1646
    iget-object v0, p0, Ll/᩻ۧܳ;->ܽ:Ll/ᩴܽܳ;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1647
    iget v1, p0, Ll/᩻ۧܳ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1648
    iget v1, p0, Ll/᩻ۧܳ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1649
    iget-object v1, p0, Ll/᩻ۧܳ;->ۧ:Ll/ܿᩳܳ;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
