.class public final Ll/ܶ֨᩻;
.super Ljava/lang/Object;
.source "Z9MW"

# interfaces
.implements Ll/ۡ֨᩻;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Ll/᩸֨᩻;

.field public ܽ:J

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/᩸֨᩻;Ll/ܰۚ᩻;)V
    .locals 0

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ֨᩻;->ۧ:Ll/᩸֨᩻;

    .line 279
    invoke-virtual {p2}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܶ֨᩻;->ܽ:J

    const-wide/16 p1, 0x0

    .line 280
    iput-wide p1, p0, Ll/ܶ֨᩻;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 6

    .line 285
    iget-wide v0, p0, Ll/ܶ֨᩻;->֫:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܶ֨᩻;->֫:J

    const-wide/16 v2, 0x0

    .line 286
    iget-wide v4, p0, Ll/ܶ֨᩻;->ܽ:J

    cmp-long p1, v4, v2

    if-lez p1, :cond_0

    .line 287
    iget-object p1, p0, Ll/ܶ֨᩻;->ۧ:Ll/᩸֨᩻;

    iget-object p1, p1, Ll/᩸֨᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {p1, v0, v1, v4, v5}, Ll/᩹ۗܿ;->ۧ(JJ)V

    :cond_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 292
    iget-boolean v0, p0, Ll/ܶ֨᩻;->ᩳ:Z

    iget-object v1, p0, Ll/ܶ֨᩻;->ۧ:Ll/᩸֨᩻;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 293
    iput-boolean v0, p0, Ll/ܶ֨᩻;->ᩳ:Z

    .line 294
    iget-object v0, v1, Ll/᩸֨᩻;->ܳ:Ll/᩹ۗܿ;

    const v2, 0x7f120b49

    invoke-virtual {v0, v2}, Ll/᩹ۗܿ;->᩻(I)V

    .line 296
    :cond_0
    iget-object v0, v1, Ll/᩸֨᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0, p1}, Ll/᩹ۗܿ;->ܿ(I)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ܶ֨᩻;->ۧ:Ll/᩸֨᩻;

    iget-object v0, v0, Ll/᩸֨᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method
