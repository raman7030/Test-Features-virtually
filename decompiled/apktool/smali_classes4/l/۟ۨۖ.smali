.class public final Ll/۟ۨۖ;
.super Ll/ۧۨۖ;
.source "29H6"


# instance fields
.field public final ۜ:Ljava/util/Set;

.field public final ܳ:Ll/۫ۛۖ;

.field public final ᩷:Ljava/lang/String;

.field public ᩻:Ll/ۧۤۖ;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJLl/۫ۛۖ;Ll/ۧۤۖ;Ljava/util/Set;I)V
    .locals 10

    move-object v9, p0

    const/16 v1, 0x21

    .line 50
    sget-object v3, Ll/᩺ۛۖ;->֫֫:Ll/᩺ۛۖ;

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p2

    move-wide v6, p4

    move/from16 v8, p9

    invoke-direct/range {v0 .. v8}, Ll/ۧۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJI)V

    move-object/from16 v0, p7

    .line 51
    iput-object v0, v9, Ll/۟ۨۖ;->᩻:Ll/ۧۤۖ;

    move-object/from16 v0, p8

    .line 52
    iput-object v0, v9, Ll/۟ۨۖ;->ۜ:Ljava/util/Set;

    move-object/from16 v0, p6

    .line 54
    iput-object v0, v9, Ll/۟ۨۖ;->ܳ:Ll/۫ۛۖ;

    const-string v0, "*"

    .line 57
    iput-object v0, v9, Ll/۟ۨۖ;->᩷:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 4

    .line 62
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 63
    iget-object v0, p0, Ll/۟ۨۖ;->᩻:Ll/ۧۤۖ;

    invoke-virtual {v0}, Ll/ۧۤۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 64
    iget-object v0, p0, Ll/۟ۨۖ;->ۜ:Ljava/util/Set;

    invoke-static {v0}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    const-wide/16 v0, 0x0

    .line 65
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 66
    iget-object v0, p0, Ll/۟ۨۖ;->ܳ:Ll/۫ۛۖ;

    invoke-virtual {v0, p1}, Ll/۫ۛۖ;->֫(Ll/֡֫ۘ;)V

    const/16 v0, 0x60

    .line 68
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 69
    iget-object v0, p0, Ll/۟ۨۖ;->᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 70
    invoke-virtual {p0}, Ll/ۧۨۖ;->ܿ()I

    move-result v1

    .line 137
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->ᩳ()I

    move-result v2

    const/high16 v3, 0x10000

    mul-int v2, v2, v3

    .line 70
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->ۧ(J)V

    .line 95
    sget-object v1, Ll/۠ܰۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void
.end method
