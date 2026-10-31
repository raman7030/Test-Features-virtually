.class public final Ll/ܿۧۘ;
.super Ljava/lang/Object;
.source "84DG"

# interfaces
.implements Ll/֫۟ۖ;


# instance fields
.field public ֫:Ll/ᩴۧۘ;

.field public ۧ:J

.field public final synthetic ܽ:Ll/᩻ۧۘ;


# direct methods
.method public constructor <init>(Ll/᩻ۧۘ;Ll/ᩴۧۘ;J)V
    .locals 0

    .line 452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۧۘ;->ܽ:Ll/᩻ۧۘ;

    .line 453
    iput-object p2, p0, Ll/ܿۧۘ;->֫:Ll/ᩴۧۘ;

    .line 454
    iput-wide p3, p0, Ll/ܿۧۘ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 11

    .line 465
    new-instance v8, Ll/۠ۨۖ;

    iget-object v9, p0, Ll/ܿۧۘ;->ܽ:Ll/᩻ۧۘ;

    invoke-static {v9}, Ll/᩻ۧۘ;->ܽ(Ll/᩻ۧۘ;)Ll/ۜۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜۧۘ;->ܳ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v1

    .line 467
    iget-object v10, p0, Ll/ܿۧۘ;->֫:Ll/ᩴۧۘ;

    invoke-virtual {v10}, Ll/ᩴۧۘ;->ܽ()J

    move-result-wide v4

    .line 468
    invoke-virtual {v10}, Ll/ᩴۧۘ;->֫()J

    move-result-wide v6

    iget-wide v2, p0, Ll/ܿۧۘ;->ۧ:J

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/۠ۨۖ;-><init>(Ll/᩹ۛۖ;JJJ)V

    .line 470
    :try_start_0
    invoke-static {v9}, Ll/᩻ۧۘ;->ܳ(Ll/᩻ۧۘ;)Ll/᩹ۧۘ;

    move-result-object v0

    iget-wide v1, p0, Ll/ܿۧۘ;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩹ۧۘ;->֫(Ljava/lang/Long;)Ll/ܶܽۘ;

    move-result-object v0

    invoke-virtual {v10}, Ll/ᩴۧۘ;->᩻()Z

    move-result v1

    invoke-virtual {v0, v8, v1}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 472
    :catch_0
    invoke-static {}, Ll/᩻ۧۘ;->֡()Ll/֫᩻֨;

    move-result-object v0

    const-string v1, "Failed to send {}"

    invoke-interface {v0, v8, v1}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
