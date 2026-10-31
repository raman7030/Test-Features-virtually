.class public final Ll/۬ۨۖ;
.super Ll/ۧۨۖ;
.source "J9HP"


# instance fields
.field public final ۜ:Z

.field public ۢ:J

.field public final ܳ:J

.field public final ᩷:Ll/ۢܽۘ;

.field public final ᩻:Ll/۫ۛۖ;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJJLl/۫ۛۖ;Ll/ۢܽۘ;I)V
    .locals 11

    move-object v9, p0

    move/from16 v10, p10

    .line 42
    sget-object v3, Ll/᩺ۛۖ;->ۛ:Ll/᩺ۛۖ;

    invoke-virtual/range {p9 .. p9}, Ll/ۢܽۘ;->֫()I

    move-result v0

    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    const/16 v1, 0x39

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v0 .. v8}, Ll/ۧۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJI)V

    move-wide/from16 v0, p6

    .line 43
    iput-wide v0, v9, Ll/۬ۨۖ;->ܳ:J

    move-object/from16 v0, p8

    .line 44
    iput-object v0, v9, Ll/۬ۨۖ;->᩻:Ll/۫ۛۖ;

    move-object/from16 v0, p9

    .line 45
    iput-object v0, v9, Ll/۬ۨۖ;->᩷:Ll/ۢܽۘ;

    const/4 v0, 0x1

    .line 46
    iput-boolean v0, v9, Ll/۬ۨۖ;->ۜ:Z

    int-to-long v0, v10

    .line 47
    iput-wide v0, v9, Ll/۬ۨۖ;->ۢ:J

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 6

    .line 52
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 53
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    .line 54
    iget-wide v0, p0, Ll/۬ۨۖ;->ܳ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 55
    iget-object v0, p0, Ll/۬ۨۖ;->᩻:Ll/۫ۛۖ;

    invoke-virtual {v0, p1}, Ll/۫ۛۖ;->֫(Ll/֡֫ۘ;)V

    .line 58
    iget-object v0, p0, Ll/۬ۨۖ;->᩷:Ll/ۢܽۘ;

    invoke-virtual {v0}, Ll/ۢܽۘ;->֫()I

    move-result v1

    const-wide/16 v2, 0x0

    if-lez v1, :cond_0

    const/16 v4, 0x78

    int-to-long v4, v4

    .line 60
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    int-to-long v4, v1

    .line 61
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 64
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 66
    :goto_0
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 67
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 68
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 69
    iget-wide v4, p0, Ll/۬ۨۖ;->ۢ:J

    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    .line 70
    iget-boolean v1, p0, Ll/۬ۨۖ;->ۜ:Z

    if-eqz v1, :cond_1

    const-wide/16 v2, 0x1

    :cond_1
    invoke-virtual {p1, v2, v3}, Ll/ۤܰۖ;->ۧ(J)V

    .line 71
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۘ()V

    .line 72
    :goto_1
    invoke-virtual {v0}, Ll/ۢܽۘ;->֫()I

    move-result v1

    if-lez v1, :cond_2

    .line 73
    invoke-virtual {v0, p1}, Ll/ۢܽۘ;->֫(Ll/֡֫ۘ;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ᩷()J
    .locals 2

    .line 78
    iget-wide v0, p0, Ll/۬ۨۖ;->ܳ:J

    return-wide v0
.end method
