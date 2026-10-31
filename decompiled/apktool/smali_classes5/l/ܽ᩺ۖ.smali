.class public final Ll/ܽ᩺ۖ;
.super Ll/ۧۨۖ;
.source "C9I0"


# instance fields
.field public final ܳ:Ll/۫ۛۖ;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJJI)V
    .locals 10

    move-object v9, p0

    const/16 v1, 0x31

    .line 35
    sget-object v3, Ll/᩺ۛۖ;->ܽ֫:Ll/᩺ۛۖ;

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p3

    move-wide v6, p5

    move/from16 v8, p9

    invoke-direct/range {v0 .. v8}, Ll/ۧۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJI)V

    move-object v0, p2

    .line 36
    iput-object v0, v9, Ll/ܽ᩺ۖ;->ܳ:Ll/۫ۛۖ;

    move-wide/from16 v0, p7

    .line 37
    iput-wide v0, v9, Ll/ܽ᩺ۖ;->᩻:J

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 3

    .line 42
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 44
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 46
    invoke-virtual {p0}, Ll/ۧۨۖ;->ۜ()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 47
    iget-wide v1, p0, Ll/ܽ᩺ۖ;->᩻:J

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ܽ(J)V

    .line 48
    iget-object v1, p0, Ll/ܽ᩺ۖ;->ܳ:Ll/۫ۛۖ;

    invoke-virtual {v1, p1}, Ll/۫ۛۖ;->֫(Ll/֡֫ۘ;)V

    const-wide/16 v1, 0x1

    .line 49
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    const-wide/16 v1, 0x0

    .line 50
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 51
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 52
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 53
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 54
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    return-void
.end method
