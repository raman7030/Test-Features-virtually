.class public final Ll/ᩴۛ᩻;
.super Ljava/lang/Object;
.source "A6XJ"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZZIJLjava/lang/String;)V
    .locals 0

    .line 445
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 446
    iput-boolean p1, p0, Ll/ᩴۛ᩻;->֫:Z

    .line 447
    iput-boolean p2, p0, Ll/ᩴۛ᩻;->ᩳ:Z

    .line 448
    iput p3, p0, Ll/ᩴۛ᩻;->ܿ:I

    .line 449
    iput-wide p4, p0, Ll/ᩴۛ᩻;->ۧ:J

    .line 450
    iput-object p6, p0, Ll/ᩴۛ᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫()Ll/ᩴۛ᩻;
    .locals 8

    .line 454
    new-instance v7, Ll/ᩴۛ᩻;

    const-wide/16 v4, -0x1

    const-string v6, "skipped"

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ᩴۛ᩻;-><init>(ZZIJLjava/lang/String;)V

    return-object v7
.end method

.method public static ֫(IJ)Ll/ᩴۛ᩻;
    .locals 8

    .line 458
    new-instance v7, Ll/ᩴۛ᩻;

    const/4 v2, 0x1

    const-string v6, "none"

    const/4 v1, 0x1

    move-object v0, v7

    move v3, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v6}, Ll/ᩴۛ᩻;-><init>(ZZIJLjava/lang/String;)V

    return-object v7
.end method

.method public static ֫(JLjava/lang/String;)Ll/ᩴۛ᩻;
    .locals 8

    .line 462
    new-instance v7, Ll/ᩴۛ᩻;

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v1, 0x1

    move-object v0, v7

    move-wide v4, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ll/ᩴۛ᩻;-><init>(ZZIJLjava/lang/String;)V

    return-object v7
.end method

.method public static bridge synthetic ֫(Ll/ᩴۛ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴۛ᩻;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۛ᩻;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴۛ᩻;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴۛ᩻;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۛ᩻;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩴۛ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴۛ᩻;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴۛ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴۛ᩻;->ᩳ:Z

    return p0
.end method
