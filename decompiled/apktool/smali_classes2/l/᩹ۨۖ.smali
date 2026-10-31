.class public final Ll/᩹ۨۖ;
.super Ll/ܽۨۖ;
.source "S9GP"


# instance fields
.field public final ۜ:Ljava/util/Set;

.field public final ۡ:Ljava/util/Set;

.field public final ۢ:Ll/ܽۧۘ;

.field public final ܳ:Ll/۠ۛۖ;

.field public final ܿ:Ljava/util/Set;

.field public final ᩷:Ll/ۨۛۖ;

.field public final ᩻:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJLl/ۨۛۖ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;Ll/ܽۧۘ;)V
    .locals 9

    move-object v8, p0

    const/16 v1, 0x39

    .line 59
    sget-object v3, Ll/᩺ۛۖ;->۬:Ll/᩺ۛۖ;

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    .line 60
    sget-object v0, Ll/ۨۛۖ;->ۗ:Ll/ۨۛۖ;

    if-eqz p6, :cond_0

    move-object v0, p6

    :cond_0
    iput-object v0, v8, Ll/᩹ۨۖ;->᩷:Ll/ۨۛۖ;

    move-object/from16 v0, p7

    .line 61
    iput-object v0, v8, Ll/᩹ۨۖ;->ܿ:Ljava/util/Set;

    if-nez p8, :cond_1

    .line 69
    const-class v0, Ll/֫ۤۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object/from16 v0, p8

    .line 62
    :goto_0
    iput-object v0, v8, Ll/᩹ۨۖ;->ۜ:Ljava/util/Set;

    if-nez p9, :cond_2

    .line 69
    const-class v0, Ll/ۜۨۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object/from16 v0, p9

    .line 63
    :goto_1
    iput-object v0, v8, Ll/᩹ۨۖ;->ۡ:Ljava/util/Set;

    .line 64
    sget-object v0, Ll/۠ۛۖ;->ۗ:Ll/۠ۛۖ;

    if-eqz p10, :cond_3

    move-object/from16 v0, p10

    :cond_3
    iput-object v0, v8, Ll/᩹ۨۖ;->ܳ:Ll/۠ۛۖ;

    if-nez p11, :cond_4

    .line 69
    const-class v0, Ll/ܶۛۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object/from16 v0, p11

    .line 65
    :goto_2
    iput-object v0, v8, Ll/᩹ۨۖ;->᩻:Ljava/util/Set;

    move-object/from16 v0, p12

    .line 66
    iput-object v0, v8, Ll/᩹ۨۖ;->ۢ:Ll/ܽۧۘ;

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 4

    .line 71
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v1, 0x0

    .line 72
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->֫(B)V

    .line 73
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->֫(B)V

    .line 74
    iget-object v2, p0, Ll/᩹ۨۖ;->᩷:Ll/ۨۛۖ;

    invoke-virtual {v2}, Ll/ۨۛۖ;->getValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    const/16 v2, 0x8

    .line 75
    invoke-virtual {p1, v2}, Ll/֡֫ۘ;->᩻(I)V

    .line 76
    invoke-virtual {p1, v2}, Ll/֡֫ۘ;->᩻(I)V

    .line 77
    iget-object v2, p0, Ll/᩹ۨۖ;->ܿ:Ljava/util/Set;

    invoke-static {v2}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 78
    iget-object v2, p0, Ll/᩹ۨۖ;->ۜ:Ljava/util/Set;

    invoke-static {v2}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 79
    iget-object v2, p0, Ll/᩹ۨۖ;->ۡ:Ljava/util/Set;

    invoke-static {v2}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 80
    iget-object v2, p0, Ll/᩹ۨۖ;->ܳ:Ll/۠ۛۖ;

    invoke-virtual {v2}, Ll/۠ۛۖ;->getValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 81
    iget-object v2, p0, Ll/᩹ۨۖ;->᩻:Ljava/util/Set;

    invoke-static {v2}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    add-int/lit8 v0, v0, 0x3f

    .line 85
    iget-object v2, p0, Ll/᩹ۨۖ;->ۢ:Ll/ܽۧۘ;

    invoke-virtual {v2}, Ll/ܽۧۘ;->ۧ()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    invoke-static {v2}, Ll/ۤۛۖ;->֫(Ljava/lang/String;)[B

    move-result-object v1

    .line 96
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 97
    array-length v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    goto :goto_1

    .line 88
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 89
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x1

    new-array v1, v0, [B

    :goto_1
    const-wide/16 v2, 0x0

    .line 101
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 102
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 318
    array-length v0, v1

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method
