.class public final Ll/ۢܳܽ;
.super Ljava/lang/Object;
.source "L1ES"


# static fields
.field public static final ֫:Ll/ۖ᩵;

.field public static final ۧ:Ll/ܽܳܽ;

.field public static final ܽ:Ll/᩵ܳܽ;

.field public static final ᩳ:Ll/ۖ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 15
    new-instance v0, Ll/ܽܳܽ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    sput-object v0, Ll/ۢܳܽ;->ۧ:Ll/ܽܳܽ;

    .line 16
    new-instance v0, Ll/᩵ܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    sput-object v0, Ll/ۢܳܽ;->ܽ:Ll/᩵ܳܽ;

    .line 17
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    sput-object v0, Ll/ۢܳܽ;->֫:Ll/ۖ᩵;

    .line 18
    new-instance v1, Ll/ۖ᩵;

    invoke-direct {v1}, Ll/ۖ᩵;-><init>()V

    sput-object v1, Ll/ۢܳܽ;->ᩳ:Ll/ۖ᩵;

    .line 21
    new-instance v2, Ll/۟ܿܽ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "attr"

    .line 21
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance v2, Ll/۟ܿܽ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "^attr-private"

    .line 22
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    new-instance v2, Ll/᩺ܿܽ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "array"

    .line 23
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    new-instance v2, Ll/ۚܳܽ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "style"

    .line 24
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    new-instance v2, Ll/ᩴܳܽ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, "plurals"

    .line 25
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    new-instance v0, Ll/֫ܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "bool"

    .line 26
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    new-instance v0, Ll/ܿܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "dimen"

    .line 27
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    new-instance v0, Ll/ۡܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "fraction"

    .line 28
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    new-instance v0, Ll/ܺܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "id"

    .line 29
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    new-instance v0, Ll/ۖܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "integer"

    .line 30
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    new-instance v0, Ll/֡ܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "string"

    .line 31
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    new-instance v0, Ll/ۧܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "color"

    .line 32
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    new-instance v0, Ll/ۘܳܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "anim"

    .line 34
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "animator"

    .line 35
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "drawable"

    .line 36
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "interpolator"

    .line 37
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "layout"

    .line 38
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "transition"

    .line 39
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "menu"

    .line 40
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "mipmap"

    .line 41
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "raw"

    .line 42
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "xml"

    .line 43
    invoke-virtual {v1, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;
    .locals 2

    .line 111
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v0

    .line 112
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    packed-switch v1, :pswitch_data_2

    .line 151
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported value type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    invoke-static {v1}, Ll/۫ܽܽ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    invoke-interface {p1}, Ll/֨᩻ܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷᩻ܽ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 134
    :pswitch_0
    invoke-static {v0}, Ll/۫ܽܽ;->ۜ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 132
    :pswitch_1
    invoke-static {v0}, Ll/۫ܽܽ;->᩻(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 130
    :pswitch_2
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 128
    :pswitch_3
    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object p0

    return-object p0

    :pswitch_4
    if-nez v0, :cond_0

    const-string p0, "?null"

    return-object p0

    .line 126
    :cond_0
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/ܳܳܽ;->ۧ(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "?"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_5
    if-nez v0, :cond_1

    goto :goto_0

    .line 120
    :cond_1
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/ܳܳܽ;->ۧ(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "@"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_6
    const/4 p0, 0x1

    if-ne v0, p0, :cond_2

    const-string p0, "@empty"

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "@null"

    return-object p0

    :pswitch_7
    if-eqz v0, :cond_3

    const-string p0, "true"

    return-object p0

    :cond_3
    const-string p0, "false"

    return-object p0

    .line 138
    :pswitch_8
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "0x"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v0}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 136
    :pswitch_9
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_a
    const/high16 p0, -0x1000000

    and-int p1, v0, p0

    if-ne p1, p0, :cond_4

    const p0, 0xffffff

    and-int/2addr p0, v0

    const/4 p1, 0x6

    .line 146
    invoke-static {p0, p1}, Ll/ۢܳܽ;->֫(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const/16 p0, 0x8

    .line 148
    invoke-static {v0, p0}, Ll/ۢܳܽ;->֫(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1c
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 5

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v1, p0

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    .line 158
    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr p1, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const/16 v2, 0x30

    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨᩻ܽ;)Ljava/lang/String;
    .locals 3

    .line 75
    invoke-interface {p0}, Ll/֨᩻ܽ;->ۖ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    .line 105
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported value type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/֨᩻ܽ;->ۖ()I

    move-result v2

    invoke-static {v2}, Ll/۫ܽܽ;->ܳ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-interface {p0}, Ll/֨᩻ܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷᩻ܽ;->ᩴ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string p0, "dynamic-attribute"

    return-object p0

    :pswitch_1
    const-string p0, "dynamic-reference"

    return-object p0

    :pswitch_2
    const-string p0, "fraction"

    return-object p0

    :pswitch_3
    const-string p0, "dimen"

    return-object p0

    :pswitch_4
    const-string p0, "float"

    return-object p0

    :pswitch_5
    const-string p0, "string"

    return-object p0

    :pswitch_6
    const-string p0, "attribute"

    return-object p0

    :pswitch_7
    const-string p0, "reference"

    return-object p0

    :pswitch_8
    const-string p0, "bool"

    return-object p0

    :pswitch_9
    const-string p0, "integer"

    return-object p0

    :pswitch_a
    const-string p0, "color"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_9
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1c
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method public static ֫(Ll/ܰܿܽ;Ljava/lang/CharSequence;)V
    .locals 1

    .line 198
    instance-of v0, p1, Ll/ۗ᩻ܽ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۗ᩻ܽ;

    .line 199
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->ܿ֫()[Ll/᩸᩻ܽ;

    move-result-object p1

    .line 201
    invoke-static {p0, v0, p1}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    return-void

    .line 204
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ܰܿܽ;Ljava/lang/String;Z)V
    .locals 5

    const/16 v0, 0x3b

    .line 269
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    if-eqz p2, :cond_0

    .line 272
    invoke-interface {p0, p1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 274
    :cond_0
    invoke-interface {p0, p1}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v3, 0x0

    if-eqz p2, :cond_2

    .line 278
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 280
    :cond_2
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    const/4 p2, 0x1

    :goto_0
    if-eqz p2, :cond_5

    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x3d

    .line 283
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-eq v4, v2, :cond_4

    .line 285
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v4, v4, 0x1

    .line 286
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    if-eq v3, v2, :cond_3

    .line 289
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 292
    :cond_3
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const/4 p2, 0x0

    .line 294
    :goto_1
    invoke-interface {p0, v1, v4}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v3

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ܰܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;)V
    .locals 12

    const-string v0, "\\\\"

    const-string v1, "\\"

    if-eqz p2, :cond_d

    .line 209
    array-length v2, p2

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v2, ""

    .line 216
    invoke-interface {p0, v2}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    .line 217
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 218
    invoke-static {p2}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v4, Ll/ۜܳܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, v4}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v4, Ll/᩷ܳܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 224
    invoke-interface {p2, v4}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/᩸᩻ܽ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-gt v5, v3, :cond_c

    .line 227
    array-length v6, p2

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    const/4 v9, 0x1

    if-ge v7, v6, :cond_2

    aget-object v9, p2, v7

    .line 228
    iget v10, v9, Ll/᩸᩻ܽ;->ۧ:I

    if-ne v10, v5, :cond_1

    iget v11, v9, Ll/᩸᩻ܽ;->֫:I

    if-ne v10, v11, :cond_1

    .line 229
    iget-object v8, v9, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-static {p0, v8, v4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/String;Z)V

    const/4 v8, 0x1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    if-eqz v8, :cond_3

    .line 234
    invoke-interface {p0, v2}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    .line 236
    :cond_3
    array-length v6, p2

    sub-int/2addr v6, v9

    :goto_2
    if-ltz v6, :cond_5

    .line 237
    aget-object v7, p2, v6

    .line 238
    iget v8, v7, Ll/᩸᩻ܽ;->֫:I

    if-ne v8, v5, :cond_4

    .line 239
    iget-object v7, v7, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-static {p0, v7, v9}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/String;Z)V

    :cond_4
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 242
    :cond_5
    array-length v6, p2

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_7

    aget-object v8, p2, v7

    .line 243
    iget v9, v8, Ll/᩸᩻ܽ;->ۧ:I

    if-ne v9, v5, :cond_6

    iget v10, v8, Ll/᩸᩻ܽ;->֫:I

    if-eq v9, v10, :cond_6

    .line 244
    iget-object v8, v8, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-static {p0, v8, v4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/String;Z)V

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_7
    if-eq v5, v3, :cond_b

    .line 248
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x3f

    if-eq v6, v7, :cond_9

    const/16 v7, 0x40

    if-eq v6, v7, :cond_9

    const/16 v7, 0x5c

    if-eq v6, v7, :cond_8

    .line 261
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v6}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    goto :goto_4

    .line 251
    :cond_8
    invoke-interface {p0, v0}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    if-nez v5, :cond_a

    .line 256
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v6}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    goto :goto_4

    .line 258
    :cond_a
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v6}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    :cond_b
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_c
    return-void

    .line 210
    :cond_d
    :goto_5
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "@"

    .line 211
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_e

    const-string p2, "?"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 212
    :cond_e
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 213
    :cond_f
    invoke-interface {p0, p1}, Ll/ܰܿܽ;->text(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 4

    .line 51
    invoke-interface {p1}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    if-lez v1, :cond_0

    add-int/lit8 v2, v1, -0x1

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-gt v3, v2, :cond_0

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 67
    :cond_1
    invoke-interface {p1}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 68
    sget-object v1, Ll/ۢܳܽ;->֫:Ll/ۖ᩵;

    sget-object v2, Ll/ۢܳܽ;->ۧ:Ll/ܽܳܽ;

    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ܳܽ;

    goto :goto_1

    .line 70
    :cond_2
    sget-object v1, Ll/ۢܳܽ;->ᩳ:Ll/ۖ᩵;

    sget-object v2, Ll/ۢܳܽ;->ܽ:Ll/᩵ܳܽ;

    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ܳܽ;

    .line 47
    :goto_1
    invoke-interface {v0, p0, p1, p2, p3}, Ll/᩻ܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void
.end method

.method public static ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V
    .locals 4

    .line 168
    iget-boolean v0, p2, Ll/ᩳܳܽ;->ۧ:Z

    const-string v1, "public"

    const-string v2, "true"

    const-string v3, "false"

    if-eqz v0, :cond_0

    .line 169
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    invoke-interface {p0, v1, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_0
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    invoke-interface {p0, v1, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_1
    :goto_0
    iget-boolean v0, p2, Ll/ᩳܳܽ;->ܽ:Z

    const-string v1, "weak"

    if-eqz v0, :cond_2

    .line 178
    invoke-interface {p1}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v0

    if-nez v0, :cond_3

    .line 179
    invoke-interface {p0, v1, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 182
    :cond_2
    invoke-interface {p1}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 183
    invoke-interface {p0, v1, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :cond_3
    :goto_1
    iget-boolean p2, p2, Ll/ᩳܳܽ;->֫:Z

    const-string v0, "compact"

    if-eqz p2, :cond_4

    .line 187
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result p1

    if-nez p1, :cond_5

    .line 188
    invoke-interface {p0, v0, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 191
    :cond_4
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 192
    invoke-interface {p0, v0, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method
