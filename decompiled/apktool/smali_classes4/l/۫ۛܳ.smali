.class public final Ll/۫ۛܳ;
.super Ll/ܺۘܳ;
.source "O8EG"


# instance fields
.field public ۧ֫:J

.field public ܽ֫:Ll/ܺۨܳ;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJJLl/ܺۨܳ;)V
    .locals 10

    move-object v9, p0

    const/4 v3, 0x0

    const/4 v8, 0x1

    const-string v2, ""

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move-wide/from16 v6, p6

    .line 11
    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    move-object/from16 v0, p8

    .line 12
    iput-object v0, v9, Ll/۫ۛܳ;->ܽ֫:Ll/ܺۨܳ;

    move-wide v0, p4

    .line 13
    iput-wide v0, v9, Ll/۫ۛܳ;->ۧ֫:J

    return-void
.end method


# virtual methods
.method public final ۗ֫()Ljava/lang/CharSequence;
    .locals 5

    .line 26
    invoke-virtual {p0}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2198\ufe0f "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/۫ۛܳ;->ۧ֫:J

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 17
    iget-wide v0, p0, Ll/۫ۛܳ;->ۧ֫:J

    return-wide v0
.end method

.method public final ᩳ()Ll/ܺۨܳ;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/۫ۛܳ;->ܽ֫:Ll/ܺۨܳ;

    return-object v0
.end method
