.class public final Ll/᩶֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ll/֨᩸ܿ;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:[Z

.field public final synthetic ۬:J

.field public final synthetic ᩶:Ll/ܽۚۜ;

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܽۚۜ;JI[Z)V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶֡ۜ;->᩶:Ll/ܽۚۜ;

    iput-wide p2, p0, Ll/᩶֡ۜ;->۬:J

    iput p4, p0, Ll/᩶֡ۜ;->ۗ:I

    iput-object p5, p0, Ll/᩶֡ۜ;->ۙ:[Z

    const/4 p1, 0x0

    .line 250
    iput-boolean p1, p0, Ll/᩶֡ۜ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final ֫(JJJ)V
    .locals 2

    .line 255
    invoke-virtual {p0}, Ll/᩶֡ۜ;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩶֡ۜ;->᩶:Ll/ܽۚۜ;

    invoke-static {p1}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;)Ll/ۛۢᩴ;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 258
    :cond_0
    invoke-static {p3, p4, p5, p6}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p2

    .line 259
    iget-boolean p3, p0, Ll/᩶֡ۜ;->᩹:Z

    iget p4, p0, Ll/᩶֡ۜ;->ۗ:I

    if-nez p3, :cond_1

    .line 260
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p5

    iget-wide v0, p0, Ll/᩶֡ۜ;->۬:J

    sub-long/2addr p5, v0

    long-to-int p3, p5

    const/16 p5, 0x1f4

    if-le p3, p5, :cond_2

    const/16 p3, 0x32

    if-ge p2, p3, :cond_2

    const/4 p3, 0x1

    .line 262
    iput-boolean p3, p0, Ll/᩶֡ۜ;->᩹:Z

    .line 263
    invoke-static {p1, p4}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;I)V

    .line 268
    :cond_1
    iget p3, p0, Ll/᩶֡ۜ;->᩸:I

    if-eq p2, p3, :cond_2

    .line 269
    iput p2, p0, Ll/᩶֡ۜ;->᩸:I

    .line 270
    invoke-static {p1, p4, p2}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 4

    .line 276
    iget-object v0, p0, Ll/᩶֡ۜ;->᩶:Ll/ܽۚۜ;

    invoke-static {v0}, Ll/ܽۚۜ;->ۧ(Ll/ܽۚۜ;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget v1, p0, Ll/᩶֡ۜ;->ۗ:I

    invoke-static {v0, v1}, Ll/ܽۚۜ;->֫(Ll/ܽۚۜ;I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 278
    iget-object v1, p0, Ll/᩶֡ۜ;->ۙ:[Z

    aput-boolean v2, v1, v3

    :cond_2
    return v0
.end method
