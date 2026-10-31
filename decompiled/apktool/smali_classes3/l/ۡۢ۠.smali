.class public final Ll/ۡۢ۠;
.super Ljava/lang/Object;
.source "07RX"


# static fields
.field public static final ۢ:Ll/ۙ֨۠;

.field public static final ᩷:Z


# instance fields
.field public ֫:Z

.field public ۜ:Z

.field public ۧ:Ll/ۗ֨۠;

.field public ܳ:Ll/᩷ۚ֨;

.field public final ܽ:Ll/ۧ᩶۠;

.field public ܿ:Z

.field public final ᩳ:Ll/᩹ܶ۠;

.field public ᩻:Ll/ۛ᩸֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 67
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۡۢ۠;->ۢ:Ll/ۙ֨۠;

    const-string v0, "os.name"

    .line 96
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Windows"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Ll/ۡۢ۠;->᩷:Z

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    sget-object v0, Ll/ۡۢ۠;->ۢ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 110
    const-class v0, Ll/ۧ᩶۠;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩶۠;

    iput-object v0, p0, Ll/ۡۢ۠;->ܽ:Ll/ۧ᩶۠;

    .line 111
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ۠;->ᩳ:Ll/᩹ܶ۠;

    .line 113
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    .line 114
    sget-object v1, Ll/֡ۖ۠;->ۙۧ:Ll/֡ۖ۠;

    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۡۢ۠;->ۜ:Z

    const-string v1, "javah:full"

    .line 115
    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۡۢ۠;->֫:Z

    .line 117
    iput-object p1, p0, Ll/ۡۢ۠;->ۧ:Ll/ۗ֨۠;

    return-void
.end method

.method public static ֫(C)Ljava/lang/String;
    .locals 7

    .line 491
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    .line 492
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v1, v0, 0x5

    const/4 v2, 0x6

    new-array v3, v2, [C

    const/16 v4, 0x5f

    const/4 v5, 0x0

    aput-char v4, v3, v5

    const/4 v4, 0x1

    :goto_0
    if-gt v4, v1, :cond_0

    const/16 v6, 0x30

    .line 496
    aput-char v6, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 v0, v0, 0x6

    :goto_1
    if-ge v0, v2, :cond_1

    .line 499
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    aput-char v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 501
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;
    .locals 9

    .line 435
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 436
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_10

    .line 439
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x7f

    if-gt v3, v4, :cond_3

    const/16 v4, 0x41

    if-lt v3, v4, :cond_0

    const/16 v4, 0x5a

    if-le v3, v4, :cond_2

    :cond_0
    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7a

    if-le v3, v4, :cond_2

    :cond_1
    const/16 v4, 0x30

    if-lt v3, v4, :cond_3

    const/16 v4, 0x39

    if-gt v3, v4, :cond_3

    .line 441
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    .line 444
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const-string v5, "_"

    const/16 v6, 0x2e

    const/16 v7, 0x5f

    if-eqz v4, :cond_d

    const/4 v8, 0x1

    if-eq v4, v8, :cond_b

    const/4 v8, 0x3

    if-eq v4, v8, :cond_6

    const/4 v5, 0x4

    if-eq v4, v5, :cond_4

    .line 484
    invoke-static {v3}, Ll/ۡۢ۠;->֫(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    :cond_4
    const/16 v4, 0x20

    if-lt v3, v4, :cond_5

    const/16 v4, 0x7e

    if-gt v3, v4, :cond_5

    .line 478
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    goto :goto_1

    :cond_5
    invoke-static {v3}, Ll/ۡۢ۠;->֫(C)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    if-eq v3, v6, :cond_a

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_a

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_9

    const/16 v4, 0x5b

    if-eq v3, v4, :cond_8

    if-eq v3, v7, :cond_7

    .line 474
    invoke-static {v3}, Ll/ۡۢ۠;->֫(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    const-string v3, "_1"

    .line 465
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_8
    const-string v3, "_3"

    .line 471
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    const-string v3, "_2"

    .line 468
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 462
    :cond_a
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_b
    if-ne v3, v7, :cond_c

    .line 481
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    goto :goto_2

    :cond_c
    invoke-static {v3}, Ll/ۡۢ۠;->֫(C)Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_d
    const/16 v4, 0x24

    if-eq v3, v4, :cond_f

    if-eq v3, v6, :cond_e

    if-eq v3, v7, :cond_e

    .line 455
    invoke-static {v3}, Ll/ۡۢ۠;->֫(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 449
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_f
    const-string v3, "__"

    .line 452
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 487
    :cond_10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۡۢ۠;
    .locals 1

    .line 100
    sget-object v0, Ll/ۡۢ۠;->ۢ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡۢ۠;

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Ll/ۡۢ۠;

    invoke-direct {v0, p0}, Ll/ۡۢ۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method

.method public static ֫(ILl/ۛ֡֨;)Z
    .locals 3

    .line 141
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    int-to-long p0, p0

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Ll/ܳ֡֨;Z)Z
    .locals 6

    .line 154
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0x1000

    .line 129
    invoke-static {v0, p1}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 157
    :cond_0
    iget-object v0, p1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    sget-object v1, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v2, 0x0

    .line 82
    invoke-virtual {v0, v2, v1}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 157
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 158
    iget-object v4, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v4, v5, :cond_2

    const/16 v4, 0x100

    .line 138
    invoke-static {v4, v1}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 160
    :cond_2
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۨ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۘ֨;

    .line 161
    iget-object v4, v4, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v4, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v5, p0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v5, v5, Ll/᩷ۚ֨;->֡֫:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v4, v5, :cond_3

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_6

    .line 166
    iget-object p1, p1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    sget-object p2, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    .line 82
    invoke-virtual {p1, v2, p2}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    .line 166
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛ֡֨;

    .line 167
    iget-object v0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_5

    check-cast p2, Ll/ܳ֡֨;

    invoke-direct {p0, p2, v3}, Ll/ۡۢ۠;->֫(Ll/ܳ֡֨;Z)Z

    move-result p2

    if-eqz p2, :cond_5

    :goto_0
    return v3

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Ll/ۙ֨֨;)Ljava/lang/String;
    .locals 3

    .line 332
    sget-object v0, Ll/᩻ۢ۠;->֫:[I

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫()Ll/֡᩹۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v0, v1

    packed-switch v1, :pswitch_data_0

    const/4 p1, 0x0

    const-string v0, "jni unknown type"

    .line 372
    invoke-static {v0, p1}, Ll/۫ۙ;->֫(Ljava/lang/String;Z)V

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    const-string p1, "void"

    return-object p1

    .line 360
    :pswitch_1
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v2, v1, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    if-ne v0, v2, :cond_0

    const-string p1, "jstring"

    return-object p1

    .line 362
    :cond_0
    iget-object v0, p0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->ۡۧ:Ll/ۙ֨֨;

    .line 2339
    iget-object v2, v0, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v0, p1, v1, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "jthrowable"

    return-object p1

    .line 364
    :cond_1
    iget-object v0, p0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v1, p0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->ᩴ:Ll/ۙ֨֨;

    .line 2339
    iget-object v2, v0, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v0, p1, v1, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "jclass"

    return-object p1

    :cond_2
    const-string p1, "jobject"

    return-object p1

    .line 334
    :pswitch_2
    check-cast p1, Ll/ۚۚ֨;

    .line 1418
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 335
    invoke-virtual {p1}, Ll/ۙ֨֨;->֫()Ll/֡᩹۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    .line 346
    new-instance v0, Ljava/lang/Error;

    invoke-virtual {p1}, Ll/ۙ֨֨;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    const-string p1, "jobjectArray"

    return-object p1

    :pswitch_4
    const-string p1, "jdoubleArray"

    return-object p1

    :pswitch_5
    const-string p1, "jfloatArray"

    return-object p1

    :pswitch_6
    const-string p1, "jcharArray"

    return-object p1

    :pswitch_7
    const-string p1, "jlongArray"

    return-object p1

    :pswitch_8
    const-string p1, "jintArray"

    return-object p1

    :pswitch_9
    const-string p1, "jshortArray"

    return-object p1

    :pswitch_a
    const-string p1, "jbyteArray"

    return-object p1

    :pswitch_b
    const-string p1, "jbooleanArray"

    return-object p1

    :pswitch_c
    const-string p1, "jdouble"

    return-object p1

    :pswitch_d
    const-string p1, "jfloat"

    return-object p1

    :pswitch_e
    const-string p1, "jchar"

    return-object p1

    :pswitch_f
    const-string p1, "jlong"

    return-object p1

    :pswitch_10
    const-string p1, "jint"

    return-object p1

    :pswitch_11
    const-string p1, "jshort"

    return-object p1

    :pswitch_12
    const-string p1, "jbyte"

    return-object p1

    :pswitch_13
    const-string p1, "jboolean"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final ֫(Ljava/io/PrintWriter;Ll/ܳ֡֨;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 121
    iget-object v3, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v4, v0, Ll/ۡۢ۠;->ۧ:Ll/ۗ֨۠;

    if-nez v3, :cond_0

    .line 122
    invoke-static {v4}, Ll/ۛ᩸֨;->֫(Ll/ۗ֨۠;)Ll/ۛ᩸֨;

    move-result-object v3

    iput-object v3, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    .line 123
    :cond_0
    iget-object v3, v0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    if-nez v3, :cond_1

    .line 124
    invoke-static {v4}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v3

    iput-object v3, v0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    .line 210
    :cond_1
    iget-object v3, v2, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    sget-object v4, Ll/ۜۢ۠;->᩹:Ll/ۜۢ۠;

    invoke-static {v3, v4}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "/* DO NOT EDIT THIS FILE - it is machine generated */"

    .line 377
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v4, "#include <jni.h>"

    .line 381
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 400
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "/* Header for class "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " */"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 401
    invoke-virtual/range {p1 .. p1}, Ljava/io/PrintWriter;->println()V

    .line 402
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "#ifndef _Included_"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 403
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "#define _Included_"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v4, "#ifdef __cplusplus"

    .line 388
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v6, "extern \"C\" {"

    .line 389
    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v6, "#endif"

    .line 390
    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 226
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v2

    :goto_0
    if-eqz v8, :cond_2

    .line 229
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    invoke-virtual {v8}, Ll/ܳ֡֨;->ۛ֫()Ll/ۙ֨֨;

    move-result-object v8

    iget-object v8, v8, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v8, Ll/ܳ֡֨;

    goto :goto_0

    .line 235
    :cond_2
    invoke-static {v7}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 236
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳ֡֨;

    .line 237
    invoke-virtual {v8}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛ֡֨;

    const/16 v10, 0x10

    .line 135
    invoke-static {v10, v9}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 239
    invoke-virtual {v9}, Ll/ۛ֡֨;->֡֫()Z

    move-result v10

    if-eqz v10, :cond_4

    iget-object v10, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v11, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v10, v11, :cond_4

    .line 240
    check-cast v9, Ll/۫֡֨;

    .line 241
    invoke-virtual {v9}, Ll/۫֡֨;->᩶֫()Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 252
    invoke-virtual {v9}, Ll/۫֡֨;->᩶֫()Ljava/lang/Object;

    move-result-object v10

    .line 254
    sget-object v11, Ll/᩻ۢ۠;->֫:[I

    .line 702
    iget-object v12, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 254
    invoke-virtual {v12}, Ll/ۙ֨֨;->֫()Ll/֡᩹۠;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    const-string v12, "L"

    const-string v13, ""

    const-string v14, "-"

    packed-switch v11, :pswitch_data_0

    const/4 v10, 0x0

    goto/16 :goto_3

    .line 278
    :pswitch_0
    move-object v11, v10

    check-cast v11, Ljava/lang/Double;

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    .line 279
    invoke-static {v11, v12}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v15

    if-eqz v15, :cond_6

    const-wide/16 v15, 0x0

    cmpg-double v10, v11, v15

    if-gez v10, :cond_5

    move-object v13, v14

    :cond_5
    const-string v10, "InfD"

    .line 280
    invoke-virtual {v13, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_3

    .line 281
    :cond_6
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_3

    .line 271
    :pswitch_1
    move-object v11, v10

    check-cast v11, Ljava/lang/Float;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    .line 272
    invoke-static {v11}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v12

    if-eqz v12, :cond_8

    const/4 v10, 0x0

    cmpg-float v10, v11, v10

    if-gez v10, :cond_7

    move-object v13, v14

    :cond_7
    const-string v10, "Inff"

    .line 273
    invoke-virtual {v13, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_3

    .line 274
    :cond_8
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "f"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 266
    :pswitch_2
    check-cast v10, Ljava/lang/Character;

    .line 267
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Character;->charValue()C

    move-result v10

    const v13, 0xffff

    and-int/2addr v10, v13

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 263
    :pswitch_3
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v10, Ll/ۡۢ۠;->᩷:Z

    if-eqz v10, :cond_9

    const-string v10, "i64"

    goto :goto_2

    :cond_9
    const-string v10, "LL"

    :goto_2
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 259
    :pswitch_4
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 256
    :pswitch_5
    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_a

    const-string v10, "1L"

    goto :goto_3

    :cond_a
    const-string v10, "0L"

    :goto_3
    if-eqz v10, :cond_4

    const-string v11, "#undef "

    .line 287
    invoke-virtual {v1, v11}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1370
    iget-object v11, v2, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 288
    sget-object v12, Ll/ۜۢ۠;->᩹:Ll/ۜۢ۠;

    invoke-static {v11, v12}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v11

    .line 289
    invoke-virtual {v9}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v9

    sget-object v12, Ll/ۜۢ۠;->ۙ:Ll/ۜۢ۠;

    invoke-static {v9, v12}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v9

    .line 290
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "_"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 291
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, "#define "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 292
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 297
    :cond_b
    invoke-virtual/range {p2 .. p2}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object v7

    .line 298
    invoke-virtual {v7}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛ֡֨;

    const/16 v10, 0x100

    .line 138
    invoke-static {v10, v9}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v10

    if-eqz v10, :cond_13

    .line 300
    iget-object v10, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    .line 301
    invoke-virtual {v9}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v11

    .line 303
    invoke-virtual {v7}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v13, 0x0

    :cond_c
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۛ֡֨;

    if-eq v14, v9, :cond_c

    .line 305
    invoke-virtual {v14}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v15

    invoke-virtual {v11, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x100

    .line 138
    invoke-static {v15, v14}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/4 v13, 0x1

    goto :goto_5

    :cond_d
    const-string v12, "/*"

    .line 310
    invoke-virtual {v1, v12}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 311
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, " * Class:     "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 312
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, " * Method:    "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v14, Ll/ۜۢ۠;->ۙ:Ll/ۜۢ۠;

    invoke-static {v11, v14}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 313
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, " * Signature: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 560
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "("

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    invoke-virtual {v12}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    check-cast v3, Ll/ۙ֨֨;

    .line 622
    invoke-virtual {v10, v3}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    move-object/from16 v17, v7

    .line 623
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v8

    .line 624
    new-instance v8, Ll/ۢۢ۠;

    move-object/from16 v20, v6

    const/4 v6, 0x0

    invoke-direct {v8, v6}, Ll/ۢۢ۠;-><init>(Z)V

    .line 625
    invoke-virtual {v8, v3, v7}, Ll/ۢۢ۠;->֫(Ll/ۙ֨֨;Ljava/lang/StringBuilder;)Ll/ۙ֨֨;

    .line 549
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v17

    move-object/from16 v3, v18

    move-object/from16 v8, v19

    move-object/from16 v6, v20

    goto :goto_6

    :cond_e
    move-object/from16 v18, v3

    move-object/from16 v20, v6

    move-object/from16 v17, v7

    move-object/from16 v19, v8

    .line 561
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    invoke-virtual {v12}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v3

    .line 622
    invoke-virtual {v10, v3}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    .line 623
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 624
    new-instance v7, Ll/ۢۢ۠;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ll/ۢۢ۠;-><init>(Z)V

    .line 625
    invoke-virtual {v7, v3, v6}, Ll/ۢۢ۠;->֫(Ll/ۙ֨֨;Ljava/lang/StringBuilder;)Ll/ۙ֨֨;

    .line 562
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 313
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 314
    invoke-virtual {v1, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 315
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "JNIEXPORT "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v7, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v7}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ۡۢ۠;->֫(Ll/ۙ֨֨;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " JNICALL "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v7, 0x64

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "Java_"

    .line 413
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    iget-object v7, v2, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    invoke-virtual {v7}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ll/ۜۢ۠;->ۗ:Ll/ۜۢ۠;

    invoke-static {v7, v8}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x5f

    .line 416
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 417
    invoke-virtual {v9}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v7

    invoke-static {v7, v8}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v13, :cond_10

    .line 419
    iget-object v7, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    .line 420
    iget-object v10, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 547
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    invoke-virtual {v10}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۙ֨֨;

    .line 622
    invoke-virtual {v7, v12}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v12

    .line 623
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 624
    new-instance v14, Ll/ۢۢ۠;

    const/4 v15, 0x1

    invoke-direct {v14, v15}, Ll/ۢۢ۠;-><init>(Z)V

    .line 625
    invoke-virtual {v14, v12, v13}, Ll/ۢۢ۠;->֫(Ll/ۙ֨֨;Ljava/lang/StringBuilder;)Ll/ۙ֨֨;

    .line 549
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_f
    const-string v7, "__"

    .line 421
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v8}, Ll/ۡۢ۠;->֫(Ljava/lang/CharSequence;Ll/ۜۢ۠;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    :cond_10
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 316
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 315
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v3, "  (JNIEnv *, "

    .line 317
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 318
    invoke-virtual {v9}, Ll/ۛ֡֨;->֡֫()Z

    move-result v3

    if-eqz v3, :cond_11

    const-string v3, "jclass"

    goto :goto_8

    :cond_11
    const-string v3, "jobject"

    :goto_8
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 321
    iget-object v3, v0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v6, v9, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v6}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v6

    invoke-virtual {v3, v6}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ֨֨;

    const-string v7, ", "

    .line 322
    invoke-virtual {v1, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 323
    invoke-virtual {v0, v6}, Ll/ۡۢ۠;->֫(Ll/ۙ֨֨;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_9

    :cond_12
    const-string v3, ");"

    .line 325
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 326
    invoke-virtual/range {p1 .. p1}, Ljava/io/PrintWriter;->println()V

    goto :goto_a

    :cond_13
    move-object/from16 v18, v3

    move-object/from16 v20, v6

    move-object/from16 v17, v7

    move-object/from16 v19, v8

    :goto_a
    move-object/from16 v7, v17

    move-object/from16 v3, v18

    move-object/from16 v8, v19

    move-object/from16 v6, v20

    goto/16 :goto_4

    :cond_14
    move-object/from16 v20, v6

    .line 394
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v2, "}"

    .line 395
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move-object/from16 v2, v20

    .line 396
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 407
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ܳ֡֨;)Z
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    iget-object v1, p0, Ll/ۡۢ۠;->ۧ:Ll/ۗ֨۠;

    if-nez v0, :cond_0

    .line 122
    invoke-static {v1}, Ll/ۛ᩸֨;->֫(Ll/ۗ֨۠;)Ll/ۛ᩸֨;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ۠;->᩻:Ll/ۛ᩸֨;

    .line 123
    :cond_0
    iget-object v0, p0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    if-nez v0, :cond_1

    .line 124
    invoke-static {v1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ۠;->ܳ:Ll/᩷ۚ֨;

    .line 146
    :cond_1
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    const/16 v0, 0x1000

    .line 129
    invoke-static {v0, p1}, Ll/ۡۢ۠;->֫(ILl/ۛ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 148
    :cond_2
    iget-boolean v0, p0, Ll/ۡۢ۠;->֫:Z

    if-eqz v0, :cond_3

    .line 149
    invoke-virtual {p1}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/ۡۢ۠;->֫(Ll/ܳ֡֨;Z)Z

    move-result p1

    return p1

    .line 150
    :cond_3
    invoke-direct {p0, p1, v1}, Ll/ۡۢ۠;->֫(Ll/ܳ֡֨;Z)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v1
.end method

.method public final ۧ(Ll/ܳ֡֨;)V
    .locals 6

    .line 1386
    iget-object v0, p1, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    .line 178
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 180
    iget-boolean v1, p0, Ll/ۡۢ۠;->ܿ:Z

    iget-object v2, p0, Ll/ۡۢ۠;->ܽ:Ll/ۧ᩶۠;

    if-eqz v1, :cond_1

    .line 181
    iget-object v1, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_0

    check-cast v1, Ll/֡֡֨;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v1

    iget-object v1, v1, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    .line 182
    :goto_0
    sget-object v3, Ll/᩷᩶۠;->ۤ:Ll/᩷᩶۠;

    iget-object v1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ll/ۧ᩶۠;->ۧ(Ll/֫᩶۠;Ljava/lang/String;)Ll/֫᩶۠;

    move-result-object v1

    goto :goto_1

    .line 184
    :cond_1
    sget-object v1, Ll/᩷᩶۠;->ۤ:Ll/᩷᩶۠;

    .line 186
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[.$]"

    const-string v5, "_"

    .line 188
    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".h"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-interface {v2, v1, v0}, Ll/ۧ᩶۠;->֫(Ll/֫᩶۠;Ljava/lang/String;)Ll/۟᩹۠;

    move-result-object v0

    .line 189
    new-instance v1, Ljava/io/PrintWriter;

    invoke-interface {v0}, Ll/۟᩹۠;->ܽ()Ljava/io/Writer;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 191
    :try_start_0
    invoke-virtual {p0, v1, p1}, Ll/ۡۢ۠;->֫(Ljava/io/PrintWriter;Ll/ܳ֡֨;)V

    .line 192
    iget-boolean p1, p0, Ll/ۡۢ۠;->ۜ:Z

    if-eqz p1, :cond_2

    .line 193
    iget-object p1, p0, Ll/ۡۢ۠;->ᩳ:Ll/᩹ܶ۠;

    const-string v2, "wrote.file"

    invoke-interface {v0}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-virtual {p1, v2, v4}, Ll/᩹ܶ۠;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    :cond_2
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 199
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 200
    invoke-interface {v0}, Ll/۟᩹۠;->delete()Z

    .line 203
    throw p1
.end method
