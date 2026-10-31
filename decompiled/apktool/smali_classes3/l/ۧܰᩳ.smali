.class public final Ll/ۧܰᩳ;
.super Ljava/lang/Object;
.source "872H"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(IIIIIIILl/۟᩺ᩳ;I)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Ll/ۧܰᩳ;->ܳ:I

    .line 34
    iput p2, p0, Ll/ۧܰᩳ;->ܿ:I

    .line 35
    iput p3, p0, Ll/ۧܰᩳ;->ᩳ:I

    .line 36
    iput p4, p0, Ll/ۧܰᩳ;->ۜ:I

    .line 37
    iput p5, p0, Ll/ۧܰᩳ;->ۧ:I

    .line 38
    iput p6, p0, Ll/ۧܰᩳ;->֫:I

    .line 39
    iput p7, p0, Ll/ۧܰᩳ;->ܽ:I

    .line 41
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ۧܰᩳ;->᩻:Ljava/lang/ref/WeakReference;

    .line 42
    iput p9, p0, Ll/ۧܰᩳ;->᩷:I

    return-void
.end method

.method public static ֫(IIJJ)J
    .locals 4

    int-to-long v0, p0

    sub-long v2, p2, v0

    .line 100
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    int-to-long p0, p1

    sub-long/2addr p2, p0

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide p2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    sub-long v0, p4, v0

    .line 101
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    sub-long/2addr p4, p0

    invoke-static {p4, p5}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    .line 99
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final ֫(IIIIILl/۟᩺ᩳ;I)I
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    .line 55
    iget v4, v0, Ll/ۧܰᩳ;->ܳ:I

    if-lez v4, :cond_5

    iget-object v5, v0, Ll/ۧܰᩳ;->᩻:Ljava/lang/ref/WeakReference;

    .line 56
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, p6

    if-ne v6, v5, :cond_5

    iget v5, v0, Ll/ۧܰᩳ;->᩷:I

    move/from16 v6, p7

    if-ne v6, v5, :cond_5

    iget v5, v0, Ll/ۧܰᩳ;->ܽ:I

    if-ne v3, v5, :cond_5

    iget v5, v0, Ll/ۧܰᩳ;->ۧ:I

    move/from16 v12, p3

    if-ne v12, v5, :cond_5

    iget v6, v0, Ll/ۧܰᩳ;->֫:I

    move/from16 v13, p4

    if-ne v13, v6, :cond_5

    .line 89
    iget v7, v0, Ll/ۧܰᩳ;->ܿ:I

    if-ltz v7, :cond_4

    iget v8, v0, Ll/ۧܰᩳ;->ۜ:I

    if-gt v7, v8, :cond_4

    iget v9, v0, Ll/ۧܰᩳ;->ᩳ:I

    if-ltz v9, :cond_3

    if-gt v9, v8, :cond_3

    int-to-long v10, v4

    int-to-long v14, v7

    add-long/2addr v14, v10

    int-to-long v12, v5

    cmp-long v5, v14, v12

    if-nez v5, :cond_2

    int-to-long v12, v9

    add-long/2addr v12, v10

    int-to-long v5, v6

    cmp-long v7, v12, v5

    if-nez v7, :cond_2

    if-ltz v1, :cond_1

    if-gt v1, v8, :cond_1

    if-ltz v2, :cond_1

    if-gt v2, v8, :cond_1

    int-to-long v8, v1

    add-long v12, v8, v10

    int-to-long v1, v2

    add-long v14, v10, v1

    int-to-long v5, v3

    cmp-long v3, v12, v5

    if-gtz v3, :cond_2

    cmp-long v3, v14, v5

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v6, p3

    move/from16 v7, p4

    move-wide v10, v1

    .line 76
    invoke-static/range {v6 .. v11}, Ll/ۧܰᩳ;->֫(IIJJ)J

    move-result-wide v1

    move-wide v8, v12

    move-wide v10, v14

    .line 78
    invoke-static/range {v6 .. v11}, Ll/ۧܰᩳ;->֫(IIJJ)J

    move-result-wide v5

    const-wide/16 v7, 0xa

    cmp-long v3, v5, v7

    if-gez v3, :cond_2

    cmp-long v3, v5, v1

    if-gez v3, :cond_2

    return v4

    :cond_1
    const/4 v1, 0x0

    return v1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    return v1

    :cond_4
    const/4 v1, 0x0

    return v1

    :cond_5
    :goto_1
    const/4 v14, 0x0

    return v14
.end method
