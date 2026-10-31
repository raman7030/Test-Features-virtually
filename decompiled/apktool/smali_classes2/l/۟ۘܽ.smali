.class public final Ll/۟ۘܽ;
.super Ljava/lang/Object;
.source "F71A"


# static fields
.field public static final ۜ:Ll/۟ۘܽ;

.field public static final ܳ:Ll/۟ۘܽ;

.field public static final ᩻:Ll/۟ۘܽ;


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 8
    new-instance v8, Ll/۟ۘܽ;

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/۟ۘܽ;-><init>(ZJJZZ)V

    sput-object v8, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    .line 9
    new-instance v0, Ll/۟ۘܽ;

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    move-object v9, v0

    move/from16 v16, v7

    invoke-direct/range {v9 .. v16}, Ll/۟ۘܽ;-><init>(ZJJZZ)V

    sput-object v0, Ll/۟ۘܽ;->᩻:Ll/۟ۘܽ;

    .line 10
    new-instance v0, Ll/۟ۘܽ;

    const/4 v8, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ll/۟ۘܽ;-><init>(ZJJZZ)V

    sput-object v0, Ll/۟ۘܽ;->ܳ:Ll/۟ۘܽ;

    return-void
.end method

.method public constructor <init>(ZJJZZ)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-boolean p1, p0, Ll/۟ۘܽ;->ܿ:Z

    .line 21
    iput-wide p2, p0, Ll/۟ۘܽ;->ۧ:J

    .line 22
    iput-wide p4, p0, Ll/۟ۘܽ;->֫:J

    .line 23
    iput-boolean p6, p0, Ll/۟ۘܽ;->ܽ:Z

    .line 24
    iput-boolean p7, p0, Ll/۟ۘܽ;->ᩳ:Z

    return-void
.end method

.method public static ֫(JJZZ)Ll/۟ۘܽ;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_1

    cmp-long v2, p2, v0

    if-nez v2, :cond_1

    if-nez p4, :cond_1

    if-eqz p5, :cond_0

    .line 31
    sget-object p0, Ll/۟ۘܽ;->ܳ:Ll/۟ۘܽ;

    return-object p0

    :cond_0
    sget-object p0, Ll/۟ۘܽ;->᩻:Ll/۟ۘܽ;

    return-object p0

    .line 33
    :cond_1
    new-instance v8, Ll/۟ۘܽ;

    const/4 v1, 0x0

    move-object v0, v8

    move-wide v2, p0

    move-wide v4, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Ll/۟ۘܽ;-><init>(ZJJZZ)V

    return-object v8
.end method

.method public static ֫(Ljava/lang/String;)Ll/۟ۘܽ;
    .locals 9

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    move-wide v5, v3

    .line 40
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 41
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_1

    const-wide/16 v7, 0x1

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    shl-long v0, v7, v0

    or-long/2addr v0, v3

    move-wide v3, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x40

    shl-long v0, v7, v0

    or-long/2addr v0, v5

    move-wide v5, v0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Non-ASCII start character: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 51
    invoke-static/range {v3 .. v8}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۟ۘܽ;)Ll/۟ۘܽ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 56
    iget-boolean v2, v0, Ll/۟ۘܽ;->ܿ:Z

    if-nez v2, :cond_7

    iget-boolean v2, v1, Ll/۟ۘܽ;->ܿ:Z

    iget-boolean v3, v1, Ll/۟ۘܽ;->ᩳ:Z

    iget-boolean v4, v1, Ll/۟ۘܽ;->ܽ:Z

    if-eqz v2, :cond_0

    goto :goto_4

    .line 59
    :cond_0
    iget-wide v5, v1, Ll/۟ۘܽ;->ۧ:J

    iget-wide v7, v0, Ll/۟ۘܽ;->ۧ:J

    or-long v9, v7, v5

    .line 60
    iget-wide v11, v1, Ll/۟ۘܽ;->֫:J

    iget-wide v13, v0, Ll/۟ۘܽ;->֫:J

    or-long v15, v13, v11

    .line 61
    iget-boolean v2, v0, Ll/۟ۘܽ;->ܽ:Z

    if-nez v2, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const/16 v17, 0x0

    move/from16 v17, v4

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/16 v17, 0x1

    move/from16 v17, v4

    const/4 v1, 0x1

    .line 62
    :goto_1
    iget-boolean v4, v0, Ll/۟ۘܽ;->ᩳ:Z

    if-nez v4, :cond_4

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const/16 v18, 0x0

    move/from16 v19, v3

    const/4 v3, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/16 v18, 0x1

    move/from16 v19, v3

    const/4 v3, 0x1

    :goto_3
    cmp-long v18, v9, v7

    if-nez v18, :cond_5

    cmp-long v7, v15, v13

    if-nez v7, :cond_5

    if-ne v1, v2, :cond_5

    if-ne v3, v4, :cond_5

    return-object v0

    :cond_5
    cmp-long v2, v9, v5

    if-nez v2, :cond_6

    cmp-long v2, v15, v11

    if-nez v2, :cond_6

    move/from16 v2, v17

    if-ne v1, v2, :cond_6

    move/from16 v2, v19

    if-ne v3, v2, :cond_6

    return-object p1

    :cond_6
    move/from16 v17, v1

    move-wide v11, v15

    move/from16 v13, v17

    move v14, v3

    .line 71
    invoke-static/range {v9 .. v14}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v1

    return-object v1

    .line 57
    :cond_7
    :goto_4
    sget-object v1, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    return-object v1
.end method

.method public final ֫()Z
    .locals 5

    .line 131
    iget-boolean v0, p0, Ll/۟ۘܽ;->ܿ:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/۟ۘܽ;->ۧ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/۟ۘܽ;->֫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-boolean v0, p0, Ll/۟ۘܽ;->ܽ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(ILjava/lang/CharSequence;)Z
    .locals 6

    .line 84
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_6

    if-le p1, v0, :cond_0

    goto :goto_1

    .line 88
    :cond_0
    iget-boolean v1, p0, Ll/۟ۘܽ;->ܿ:Z

    if-nez v1, :cond_5

    iget-boolean v1, p0, Ll/۟ۘܽ;->ᩳ:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, v0, :cond_2

    goto :goto_1

    .line 94
    :cond_2
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    const/16 p2, 0x40

    if-ge p1, p2, :cond_3

    .line 96
    iget-wide v4, p0, Ll/۟ۘܽ;->ۧ:J

    shl-long p1, v2, p1

    and-long/2addr p1, v4

    cmp-long v2, p1, v0

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_3
    const/16 v4, 0x80

    if-ge p1, v4, :cond_4

    sub-int/2addr p1, p2

    shl-long p1, v2, p1

    .line 99
    iget-wide v2, p0, Ll/۟ۘܽ;->֫:J

    and-long/2addr p1, v2

    cmp-long v2, p1, v0

    if-eqz v2, :cond_6

    goto :goto_0

    .line 101
    :cond_4
    iget-boolean p1, p0, Ll/۟ۘܽ;->ܽ:Z

    return p1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()J
    .locals 2

    .line 116
    iget-wide v0, p0, Ll/۟ۘܽ;->֫:J

    return-wide v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Ll/۟ۘܽ;->ܽ:Z

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 111
    iget-wide v0, p0, Ll/۟ۘܽ;->ۧ:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Ll/۟ۘܽ;->ܿ:Z

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Ll/۟ۘܽ;->ᩳ:Z

    return v0
.end method

.method public final ᩻()Ll/۟ۘܽ;
    .locals 7

    .line 76
    iget-boolean v0, p0, Ll/۟ۘܽ;->ܿ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/۟ۘܽ;->ᩳ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    iget-wide v3, p0, Ll/۟ۘܽ;->֫:J

    iget-boolean v5, p0, Ll/۟ۘܽ;->ܽ:Z

    iget-wide v1, p0, Ll/۟ۘܽ;->ۧ:J

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Ll/۟ۘܽ;->֫(JJZZ)Ll/۟ۘܽ;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method
