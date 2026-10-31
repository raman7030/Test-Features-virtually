.class public final Ll/ۚ᩺ۡ;
.super Ll/ۘ᩺ۡ;
.source "07T7"


# instance fields
.field public ֫:J

.field public final ۧ:Ll/᩸ۛۡ;

.field public ܽ:J

.field public ܿ:J

.field public final synthetic ᩳ:Ll/֨᩺ۡ;


# direct methods
.method public constructor <init>(Ll/֨᩺ۡ;Ll/᩸ۛۡ;)V
    .locals 0

    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 350
    iput-object p1, p0, Ll/ۚ᩺ۡ;->ᩳ:Ll/֨᩺ۡ;

    .line 351
    iput-object p2, p0, Ll/ۚ᩺ۡ;->ۧ:Ll/᩸ۛۡ;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 366
    iget-wide v0, p0, Ll/ۚ᩺ۡ;->֫:J

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 0

    .line 371
    iput-wide p1, p0, Ll/ۚ᩺ۡ;->֫:J

    return-void
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 4

    .line 386
    iget-object v0, p0, Ll/ۚ᩺ۡ;->ۧ:Ll/᩸ۛۡ;

    invoke-virtual {v0}, Ll/᩸ۛۡ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۚ᩺ۡ;->ᩳ:Ll/֨᩺ۡ;

    invoke-virtual {v1, v0}, Ll/֨᩺ۡ;->ܽ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 388
    iget-wide v2, p0, Ll/ۚ᩺ۡ;->ܽ:J

    invoke-virtual {v1, v2, v3, v0}, Ll/֨᩺ۡ;->ۧ(JLjava/lang/Object;)V

    .line 389
    iget-wide v2, p0, Ll/ۚ᩺ۡ;->֫:J

    invoke-virtual {v1, v2, v3, v0}, Ll/֨᩺ۡ;->֫(JLjava/lang/Object;)V

    .line 390
    iget-wide v2, p0, Ll/ۚ᩺ۡ;->ܿ:J

    invoke-virtual {v1, v2, v3, v0}, Ll/֨᩺ۡ;->ܽ(JLjava/lang/Object;)V

    return-object v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 361
    iput-wide p1, p0, Ll/ۚ᩺ۡ;->ܽ:J

    return-void
.end method

.method public final ܽ()J
    .locals 2

    .line 356
    iget-wide v0, p0, Ll/ۚ᩺ۡ;->ܽ:J

    return-wide v0
.end method

.method public final ܽ(J)V
    .locals 0

    .line 381
    iput-wide p1, p0, Ll/ۚ᩺ۡ;->ܿ:J

    return-void
.end method

.method public final ᩳ()J
    .locals 2

    .line 376
    iget-wide v0, p0, Ll/ۚ᩺ۡ;->ܿ:J

    return-wide v0
.end method
