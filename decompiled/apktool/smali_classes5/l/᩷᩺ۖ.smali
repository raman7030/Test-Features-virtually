.class public final Ll/᩷᩺ۖ;
.super Ll/ܽۨۖ;
.source "9897"


# instance fields
.field public final ۜ:Ll/ۜ᩺ۖ;

.field public final ܳ:Ll/۫ۛۖ;

.field public final ܿ:[B

.field public final ᩻:Ll/ۧۤۖ;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJLl/ۜ᩺ۖ;Ll/۫ۛۖ;Ll/ۧۤۖ;[B)V
    .locals 9

    move-object v8, p0

    const/16 v1, 0x21

    .line 47
    sget-object v3, Ll/᩺ۛۖ;->ܿ֫:Ll/᩺ۛۖ;

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    move-object/from16 v0, p7

    .line 48
    iput-object v0, v8, Ll/᩷᩺ۖ;->ܳ:Ll/۫ۛۖ;

    move-object v0, p6

    .line 49
    iput-object v0, v8, Ll/᩷᩺ۖ;->ۜ:Ll/ۜ᩺ۖ;

    move-object/from16 v0, p8

    .line 50
    iput-object v0, v8, Ll/᩷᩺ۖ;->᩻:Ll/ۧۤۖ;

    move-object/from16 v0, p9

    .line 51
    iput-object v0, v8, Ll/᩷᩺ۖ;->ܿ:[B

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 3

    .line 60
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 61
    iget-object v0, p0, Ll/᩷᩺ۖ;->ۜ:Ll/ۜ᩺ۖ;

    invoke-virtual {v0}, Ll/ۜ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 62
    iget-object v0, p0, Ll/᩷᩺ۖ;->᩻:Ll/ۧۤۖ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ۧۤۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 64
    iget-object v0, p0, Ll/᩷᩺ۖ;->ܿ:[B

    array-length v1, v0

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    const/16 v1, 0x60

    .line 65
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 66
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    const-wide/16 v1, 0x0

    .line 67
    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 68
    iget-object v1, p0, Ll/᩷᩺ۖ;->ܳ:Ll/۫ۛۖ;

    invoke-virtual {v1, p1}, Ll/۫ۛۖ;->֫(Ll/֡֫ۘ;)V

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method
