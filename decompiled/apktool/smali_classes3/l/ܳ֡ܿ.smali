.class public final Ll/ܳ֡ܿ;
.super Ljava/lang/Object;
.source "0N4"


# static fields
.field public static final ֫:Ll/ۡۤۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 16
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    sput-object v0, Ll/ܳ֡ܿ;->֫:Ll/ۡۤۡ;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    .locals 20

    move-object/from16 v0, p1

    .line 19
    invoke-static/range {p4 .. p4}, Ll/֫᩵ܿ;->֫(Ll/ۚ᩸ܿ;)Ll/֫᩵ܿ;

    move-result-object v8

    const v9, 0x19000

    :try_start_0
    new-array v10, v9, [B

    .line 25
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, v3

    :goto_0
    const/4 v7, 0x0

    move-object/from16 v11, p0

    .line 27
    invoke-virtual {v11, v10, v7, v9}, Ljava/io/InputStream;->read([BII)I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, -0x1

    if-ne v12, v13, :cond_1

    if-eqz v8, :cond_0

    .line 55
    invoke-virtual {v8}, Ll/֫᩵ܿ;->ۧ()V

    :cond_0
    return-void

    .line 31
    :cond_1
    :try_start_1
    invoke-virtual {v0, v10, v7, v12}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v12, v12

    add-long/2addr v12, v3

    if-eqz v8, :cond_6

    .line 34
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    sub-long v14, v3, v1

    const-wide/16 v16, 0xbb8

    cmp-long v7, v14, v16

    if-ltz v7, :cond_2

    .line 35
    sget-object v7, Ll/ܳ֡ܿ;->֫:Ll/ۡۤۡ;

    invoke-virtual {v7}, Ll/ۡۤۡ;->֫()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 36
    invoke-virtual {v8}, Ll/֫᩵ܿ;->᩷֫()V

    move-wide v14, v3

    goto :goto_1

    :cond_2
    move-wide v14, v1

    .line 40
    :goto_1
    instance-of v1, v0, Ll/֡᩸ܿ;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ll/֡᩸ܿ;

    .line 42
    invoke-interface {v1}, Ll/֡᩸ܿ;->֫()J

    move-result-wide v1

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    move-wide/from16 v16, v1

    goto :goto_2

    :cond_3
    move-wide/from16 v16, v12

    :goto_2
    cmp-long v1, v16, v5

    if-lez v1, :cond_4

    sub-long v2, v16, v5

    move-wide/from16 v6, p2

    .line 45
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v18

    move-object v1, v8

    move-wide/from16 v4, v16

    move-wide/from16 v6, v18

    invoke-virtual/range {v1 .. v7}, Ll/֫᩵ܿ;->֫(JJJ)V

    move-wide/from16 v5, v16

    .line 80
    :cond_4
    iget-object v1, v8, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_5

    .line 55
    invoke-virtual {v8}, Ll/֫᩵ܿ;->ۧ()V

    return-void

    :cond_5
    move-wide v1, v14

    :cond_6
    move-wide v3, v12

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Ll/֫᩵ܿ;->ۧ()V

    .line 57
    :cond_7
    throw v0
.end method
