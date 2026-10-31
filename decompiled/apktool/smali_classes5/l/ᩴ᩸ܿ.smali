.class public final synthetic Ll/ᩴ᩸ܿ;
.super Ljava/lang/Object;
.source "618F"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴ᩸ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ᩴ᩸ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/String;)J
    .locals 27

    move-object/from16 v0, p0

    .line 0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_b

    const/16 v2, 0x10

    int-to-long v3, v2

    const/4 v5, 0x0

    const-wide/high16 v6, -0x8000000000000000L

    const-wide/16 v8, -0x1

    const-wide v10, 0x7fffffffffffffffL

    const-wide/16 v12, 0x0

    const/4 v14, 0x1

    cmp-long v15, v3, v12

    if-gez v15, :cond_1

    xor-long v16, v3, v6

    cmp-long v18, v10, v16

    if-gez v18, :cond_0

    move-wide/from16 v16, v12

    goto :goto_1

    :cond_0
    const-wide/16 v16, 0x1

    goto :goto_1

    :cond_1
    div-long v16, v10, v3

    shl-long v16, v16, v14

    mul-long v18, v16, v3

    sub-long v18, v8, v18

    xor-long v18, v18, v6

    xor-long v20, v3, v6

    cmp-long v22, v18, v20

    if-ltz v22, :cond_2

    const/16 v18, 0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/16 v18, 0x0

    const/4 v2, 0x0

    :goto_0
    int-to-long v8, v2

    add-long v16, v16, v8

    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v8, 0x2b

    if-ne v2, v8, :cond_3

    if-le v1, v14, :cond_3

    const/4 v5, 0x1

    :cond_3
    move-wide v8, v12

    const/16 v2, 0x10

    :goto_2
    if-ge v5, v1, :cond_a

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    invoke-static {v14, v2}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    const/4 v14, -0x1

    if-eq v2, v14, :cond_9

    cmp-long v14, v8, v12

    if-ltz v14, :cond_8

    cmp-long v14, v8, v16

    if-gtz v14, :cond_8

    if-nez v14, :cond_7

    if-gez v15, :cond_5

    xor-long v22, v3, v6

    cmp-long v14, v10, v22

    if-gez v14, :cond_4

    const-wide/16 v6, -0x1

    const/4 v14, 0x1

    const-wide/16 v19, -0x1

    goto :goto_5

    :cond_4
    const-wide/16 v19, -0x1

    sub-long v21, v19, v3

    const/4 v14, 0x1

    goto :goto_4

    :cond_5
    const-wide/16 v19, -0x1

    div-long v21, v10, v3

    const/4 v14, 0x1

    shl-long v21, v21, v14

    mul-long v21, v21, v3

    sub-long v21, v19, v21

    xor-long v23, v21, v6

    xor-long v25, v3, v6

    cmp-long v18, v23, v25

    if-ltz v18, :cond_6

    move-wide/from16 v23, v3

    goto :goto_3

    :cond_6
    move-wide/from16 v23, v12

    :goto_3
    sub-long v21, v21, v23

    :goto_4
    move-wide/from16 v6, v21

    :goto_5
    long-to-int v7, v6

    if-gt v2, v7, :cond_8

    goto :goto_6

    :cond_7
    const/4 v14, 0x1

    const-wide/16 v19, -0x1

    :goto_6
    mul-long v8, v8, v3

    int-to-long v6, v2

    add-long/2addr v8, v6

    add-int/lit8 v5, v5, 0x1

    const/16 v2, 0x10

    const-wide/high16 v6, -0x8000000000000000L

    goto :goto_2

    :cond_8
    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "Too large for unsigned long: "

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Ljava/lang/NumberFormatException;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    return-wide v8

    :cond_b
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "empty string"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ᩴ᩸ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/֨۬֫;

    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/֡᩵֫;

    invoke-interface {p1}, Ll/֡᩵֫;->ᩳ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 150
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
