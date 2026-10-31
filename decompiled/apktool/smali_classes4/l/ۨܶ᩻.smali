.class public final Ll/ۨܶ᩻;
.super Ll/ܺۘܳ;
.source "38EG"


# instance fields
.field public final ۧ֫:Ll/֨᩷֡;


# direct methods
.method public constructor <init>(Ll/֨᩷֡;)V
    .locals 13

    .line 60
    invoke-virtual {p1}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, ""

    const/16 v3, 0x2f

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v4, v1, -0x1

    .line 64
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v3, :cond_1

    add-int/lit8 v4, v1, -0x2

    .line 66
    :cond_1
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v4, v4, 0x1

    .line 67
    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 72
    :goto_0
    invoke-virtual {p1}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    move-object v6, v4

    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v6, v1, -0x1

    .line 76
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v3, :cond_3

    add-int/lit8 v6, v1, -0x2

    .line 78
    :cond_3
    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 81
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :goto_1
    move-object v6, v2

    .line 12
    :goto_2
    invoke-virtual {p1}, Ll/֨᩷֡;->᩺()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll/֨᩷֡;->᩷()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_3

    :cond_5
    move-object v7, v4

    .line 13
    :goto_3
    invoke-virtual {p1}, Ll/֨᩷֡;->᩵()J

    move-result-wide v8

    invoke-virtual {p1}, Ll/֨᩷֡;->ܺ()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {p1}, Ll/֨᩷֡;->᩶()Z

    move-result v12

    move-object v4, p0

    .line 12
    invoke-direct/range {v4 .. v12}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 14
    iput-object p1, p0, Ll/ۨܶ᩻;->ۧ֫:Ll/֨᩷֡;

    return-void
.end method


# virtual methods
.method public final ֨ۧ()Ll/ܽۜܳ;
    .locals 4

    .line 29
    iget-object v0, p0, Ll/ۨܶ᩻;->ۧ֫:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->ۖ()I

    move-result v1

    and-int/lit16 v1, v1, 0xfff

    .line 30
    invoke-virtual {v0}, Ll/֨᩷֡;->᩺()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0xa000

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ll/֨᩷֡;->᩸()Z

    move-result v2

    if-eqz v2, :cond_1

    or-int/lit16 v1, v1, 0x4000

    goto :goto_1

    :cond_1
    const v2, 0x8000

    :goto_0
    or-int/2addr v1, v2

    .line 37
    :goto_1
    new-instance v2, Ll/ܽۜܳ;

    invoke-virtual {v0}, Ll/֨᩷֡;->۠()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll/֨᩷֡;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v3, v0}, Ll/ܽۜܳ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/֨᩷֡;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۨܶ᩻;->ۧ֫:Ll/֨᩷֡;

    return-object v0
.end method
