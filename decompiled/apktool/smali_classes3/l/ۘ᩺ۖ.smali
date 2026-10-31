.class public final Ll/ۘ᩺ۖ;
.super Ll/ۧۨۖ;
.source "09F6"


# instance fields
.field public final ܳ:Ll/᩷ܽۘ;

.field public final ᩻:Ll/۫ۛۖ;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJLl/᩷ܽۘ;I)V
    .locals 10

    move-object v9, p0

    .line 38
    sget-object v3, Ll/᩺ۛۖ;->ۜ֫:Ll/᩺ۛۖ;

    invoke-virtual/range {p7 .. p7}, Ll/᩷ܽۘ;->֫()I

    move-result v0

    move/from16 v1, p8

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/16 v1, 0x31

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v0 .. v8}, Ll/ۧۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJI)V

    move-object v0, p2

    .line 39
    iput-object v0, v9, Ll/ۘ᩺ۖ;->᩻:Ll/۫ۛۖ;

    move-object/from16 v0, p7

    .line 40
    iput-object v0, v9, Ll/ۘ᩺ۖ;->ܳ:Ll/᩷ܽۘ;

    return-void
.end method


# virtual methods
.method public final ܽ()I
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ۧۨۖ;->ۜ()I

    move-result v0

    add-int/lit8 v0, v0, 0x70

    return v0
.end method

.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 7

    .line 45
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const/16 v0, 0x70

    .line 47
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 48
    invoke-virtual {p0}, Ll/ۧۨۖ;->ۜ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 49
    iget-object v0, p0, Ll/ۘ᩺ۖ;->ܳ:Ll/᩷ܽۘ;

    invoke-virtual {v0}, Ll/ۢܽۘ;->ᩳ()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ܽ(J)V

    .line 50
    iget-object v1, p0, Ll/ۘ᩺ۖ;->᩻:Ll/۫ۛۖ;

    invoke-virtual {v1, p1}, Ll/۫ۛۖ;->֫(Ll/֡֫ۘ;)V

    const-wide/16 v1, 0x0

    .line 51
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 52
    invoke-virtual {v0}, Ll/᩷ܽۘ;->֫()I

    move-result v3

    invoke-virtual {p0}, Ll/ۧۨۖ;->ۜ()I

    move-result v4

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-long v5, v3

    invoke-virtual {p1, v5, v6}, Ll/ۤܰۖ;->ۧ(J)V

    .line 53
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ۧ(I)V

    .line 54
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ۧ(I)V

    .line 55
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 137
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ᩳ()I

    move-result v1

    .line 56
    invoke-virtual {v0, p1, v1}, Ll/ۢܽۘ;->֫(Ll/֡֫ۘ;I)V

    return-void
.end method
