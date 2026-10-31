.class public final Ll/ܽۡܺ;
.super Ljava/lang/Object;
.source "PBDW"

# interfaces
.implements Ll/ۡᩴܺ;


# instance fields
.field public final ֫:Ll/ۖۡܺ;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Ll/᩷ᩴܺ;


# direct methods
.method public constructor <init>(ILl/ۖۡܺ;Ll/᩷ᩴܺ;I)V
    .locals 4

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_9

    .line 70
    :try_start_0
    invoke-virtual {p2}, Ll/ᩴᩴܺ;->֡()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 76
    invoke-virtual {p2}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-eqz v0, :cond_8

    add-int/lit8 v1, v0, -0x2

    :goto_0
    const/4 v2, 0x1

    if-ltz v1, :cond_1

    .line 83
    invoke-virtual {p2, v1}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ll/ۗۡܺ;->ۧ()I

    move-result v3

    if-ne v3, v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "insns["

    const-string p3, "] is a branch or can throw"

    .line 0
    invoke-static {v1, p2, p3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sub-int/2addr v0, v2

    .line 90
    invoke-virtual {p2, v0}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ۧ()I

    move-result v0

    if-eq v0, v2, :cond_7

    .line 98
    :try_start_1
    invoke-virtual {p3}, Ll/ᩴᩴܺ;->֡()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, -0x1

    if-lt p4, v0, :cond_6

    if-ltz p4, :cond_5

    .line 389
    invoke-virtual {p3, p4}, Ll/᩷ᩴܺ;->֫(I)I

    move-result v1

    if-ltz v1, :cond_2

    move v0, v1

    :cond_2
    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    goto :goto_2

    .line 109
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "primarySuccessor "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " not in successors "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 113
    :cond_5
    :goto_2
    iput p1, p0, Ll/ܽۡܺ;->ۧ:I

    .line 114
    iput-object p2, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    .line 115
    iput-object p3, p0, Ll/ܽۡܺ;->ᩳ:Ll/᩷ᩴܺ;

    .line 116
    iput p4, p0, Ll/ܽۡܺ;->ܽ:I

    return-void

    .line 105
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "primarySuccessor < -1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 101
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "successors == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "insns does not end with a branch or throwing instruction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "insns.size() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :catch_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "insns == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 66
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "label < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 138
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܽۡܺ;->ۧ:I

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 148
    iget v0, p0, Ll/ܽۡܺ;->ۧ:I

    return v0
.end method

.method public final ۜ()Ll/᩷ᩴܺ;
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ܽۡܺ;->ᩳ:Ll/᩷ᩴܺ;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    invoke-virtual {v0}, Ll/ۖۡܺ;->֨()Ll/ܺۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 176
    iget v0, p0, Ll/ܽۡܺ;->ܽ:I

    return v0
.end method

.method public final ܽ()Ll/ܺۡܺ;
    .locals 2

    .line 206
    iget-object v0, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/ܺۡܺ;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    invoke-virtual {v0}, Ll/ۖۡܺ;->֨()Ll/ܺۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ۖۡܺ;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ܽۡܺ;->֫:Ll/ۖۡܺ;

    invoke-virtual {v0}, Ll/ۖۡܺ;->֨()Ll/ܺۡܺ;

    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ll/ܺۡܺ;->ܽ()Ll/ۧۖܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧۖܺ;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()I
    .locals 3

    .line 186
    iget-object v0, p0, Ll/ܽۡܺ;->ᩳ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 191
    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    .line 192
    iget v2, p0, Ll/ܽۡܺ;->ܽ:I

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 193
    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0

    return v0

    :cond_0
    return v1

    .line 187
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "block doesn\'t have exactly two successors"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
