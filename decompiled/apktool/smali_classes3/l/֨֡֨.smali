.class public final Ll/֨֡֨;
.super Ll/ۘ֡֨;
.source "643O"


# instance fields
.field public ۧ֫:I

.field public ܽ֫:I


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;Ll/ۙ֨֨;ILl/ۛ֡֨;)V
    .locals 6

    const-wide/16 v1, 0x9

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p4

    .line 2433
    invoke-direct/range {v0 .. v5}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/high16 p1, -0x80000000

    .line 2430
    iput p1, p0, Ll/֨֡֨;->ۧ֫:I

    .line 2434
    iput p3, p0, Ll/֨֡֨;->ܽ֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۚ۠;)I
    .locals 2

    .line 2443
    iget v0, p0, Ll/֨֡֨;->ۧ֫:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ll/ᩴۚ۠;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2444
    iget p1, p0, Ll/֨֡֨;->ۧ֫:I

    return p1

    .line 2446
    :cond_0
    iget v0, p0, Ll/֨֡֨;->ܽ֫:I

    invoke-static {p1, v0}, Ll/ۚ֡֨;->֫(Ll/ᩴۚ۠;I)I

    move-result p1

    iput p1, p0, Ll/֨֡֨;->ۧ֫:I

    return p1
.end method

.method public final ֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;
    .locals 0

    .line 2439
    invoke-interface {p1, p0, p2}, Ll/ۤ֡֨;->֫(Ll/֨֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
