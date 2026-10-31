.class public final Ll/ᩴ۟ۜ;
.super Ljava/lang/Object;
.source "R790"


# instance fields
.field public final ֫:[I

.field public ۧ:J

.field public ܳ:J

.field public final ܽ:I

.field public final ܿ:[I

.field public final ᩳ:[I

.field public final ᩻:[Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1331
    iput p1, p0, Ll/ᩴ۟ۜ;->ܽ:I

    .line 1332
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ᩴ۟ۜ;->ᩳ:[I

    .line 1333
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ᩴ۟ۜ;->ܿ:[I

    .line 1334
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ᩴ۟ۜ;->֫:[I

    .line 1335
    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ᩴ۟ۜ;->᩻:[Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ۟ۜ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ᩴ۟ۜ;->ۧ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ۟ۜ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۟ۜ;->֫:[I

    return-object p0
.end method

.method public static ۜ(Ll/ᩴ۟ۜ;)J
    .locals 6

    .line 1340
    iget-object p0, p0, Ll/ᩴ۟ۜ;->ᩳ:[I

    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget v4, p0, v3

    int-to-long v4, v4

    .line 1341
    invoke-static {v1, v2, v4, v5}, Ll/֡۟ۜ;->֫(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ۟ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ۟ۜ;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ۟ۜ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ᩴ۟ۜ;->ܳ:J

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ᩴ۟ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ۟ۜ;->ܳ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ۟ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴ۟ۜ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩴ۟ۜ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۟ۜ;->ܿ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ۟ۜ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۟ۜ;->ᩳ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ᩴ۟ۜ;)[Z
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۟ۜ;->᩻:[Z

    return-object p0
.end method
