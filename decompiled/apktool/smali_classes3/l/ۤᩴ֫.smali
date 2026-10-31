.class public final Ll/ۤᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public ֫:J

.field public ۧ:F

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1334
    iput-wide v0, p0, Ll/ۤᩴ֫;->ܿ:J

    .line 1335
    iput-wide v0, p0, Ll/ۤᩴ֫;->ܽ:J

    .line 1336
    iput-wide v0, p0, Ll/ۤᩴ֫;->֫:J

    const v0, -0x800001

    .line 1337
    iput v0, p0, Ll/ۤᩴ֫;->ᩳ:F

    .line 1338
    iput v0, p0, Ll/ۤᩴ֫;->ۧ:F

    return-void
.end method

.method public constructor <init>(Ll/ۛᩴ֫;)V
    .locals 2

    .line 1341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1342
    iget-wide v0, p1, Ll/ۛᩴ֫;->ܿ:J

    iput-wide v0, p0, Ll/ۤᩴ֫;->ܿ:J

    .line 1343
    iget-wide v0, p1, Ll/ۛᩴ֫;->ܽ:J

    iput-wide v0, p0, Ll/ۤᩴ֫;->ܽ:J

    .line 1344
    iget-wide v0, p1, Ll/ۛᩴ֫;->֫:J

    iput-wide v0, p0, Ll/ۤᩴ֫;->֫:J

    .line 1345
    iget v0, p1, Ll/ۛᩴ֫;->ᩳ:F

    iput v0, p0, Ll/ۤᩴ֫;->ᩳ:F

    .line 1346
    iget p1, p1, Ll/ۛᩴ֫;->ۧ:F

    iput p1, p0, Ll/ۤᩴ֫;->ۧ:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤᩴ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۤᩴ֫;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۤᩴ֫;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤᩴ֫;->ۧ:F

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤᩴ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۤᩴ֫;->ܽ:J

    return-wide v0
.end method

.method public static bridge synthetic ܿ(Ll/ۤᩴ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۤᩴ֫;->ܿ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۤᩴ֫;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤᩴ֫;->ᩳ:F

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ۛᩴ֫;
    .locals 1

    .line 1412
    new-instance v0, Ll/ۛᩴ֫;

    invoke-direct {v0, p0}, Ll/ۛᩴ֫;-><init>(Ll/ۤᩴ֫;)V

    return-object v0
.end method

.method public final ֫(F)V
    .locals 0

    .line 1406
    iput p1, p0, Ll/ۤᩴ֫;->ۧ:F

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 1384
    iput-wide p1, p0, Ll/ۤᩴ֫;->֫:J

    return-void
.end method

.method public final ۧ(F)V
    .locals 0

    .line 1395
    iput p1, p0, Ll/ۤᩴ֫;->ᩳ:F

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 1371
    iput-wide p1, p0, Ll/ۤᩴ֫;->ܽ:J

    return-void
.end method

.method public final ܽ(J)V
    .locals 0

    .line 1358
    iput-wide p1, p0, Ll/ۤᩴ֫;->ܿ:J

    return-void
.end method
