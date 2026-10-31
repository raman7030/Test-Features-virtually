.class public final enum Ll/۟۠᩻;
.super Ljava/lang/Enum;
.source "C9PC"

# interfaces
.implements Ll/ܰ֡ۖ;


# static fields
.field public static final synthetic $VALUES:[Ll/۟۠᩻;

.field public static final enum BROTLI_BSDIFF:Ll/۟۠᩻;

.field public static final BROTLI_BSDIFF_VALUE:I = 0xa

.field public static final enum BSDIFF:Ll/۟۠᩻;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final BSDIFF_VALUE:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum DISCARD:Ll/۟۠᩻;

.field public static final DISCARD_VALUE:I = 0x7

.field public static final enum LZ4DIFF_BSDIFF:Ll/۟۠᩻;

.field public static final LZ4DIFF_BSDIFF_VALUE:I = 0xc

.field public static final enum LZ4DIFF_PUFFDIFF:Ll/۟۠᩻;

.field public static final LZ4DIFF_PUFFDIFF_VALUE:I = 0xd

.field public static final enum MOVE:Ll/۟۠᩻;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final MOVE_VALUE:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum PUFFDIFF:Ll/۟۠᩻;

.field public static final PUFFDIFF_VALUE:I = 0x9

.field public static final enum REPLACE:Ll/۟۠᩻;

.field public static final enum REPLACE_BZ:Ll/۟۠᩻;

.field public static final REPLACE_BZ_VALUE:I = 0x1

.field public static final REPLACE_VALUE:I = 0x0

.field public static final enum REPLACE_XZ:Ll/۟۠᩻;

.field public static final REPLACE_XZ_VALUE:I = 0x8

.field public static final enum REPLACE_ZSTD:Ll/۟۠᩻;

.field public static final REPLACE_ZSTD_VALUE:I = 0xe

.field public static final enum SOURCE_BSDIFF:Ll/۟۠᩻;

.field public static final SOURCE_BSDIFF_VALUE:I = 0x5

.field public static final enum SOURCE_COPY:Ll/۟۠᩻;

.field public static final SOURCE_COPY_VALUE:I = 0x4

.field public static final VALUES:[Ll/۟۠᩻;

.field public static final enum ZERO:Ll/۟۠᩻;

.field public static final ZERO_VALUE:I = 0x6

.field public static final enum ZUCCHINI:Ll/۟۠᩻;

.field public static final ZUCCHINI_VALUE:I = 0xb

.field public static final internalValueMap:Ll/۬ᩴۖ;


# instance fields
.field public final value:I


# direct methods
.method public static synthetic $values()[Ll/۟۠᩻;
    .locals 3

    const/16 v0, 0xf

    new-array v0, v0, [Ll/۟۠᩻;

    .line 2985
    sget-object v1, Ll/۟۠᩻;->REPLACE:Ll/۟۠᩻;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->REPLACE_BZ:Ll/۟۠᩻;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->MOVE:Ll/۟۠᩻;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->BSDIFF:Ll/۟۠᩻;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->SOURCE_COPY:Ll/۟۠᩻;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->SOURCE_BSDIFF:Ll/۟۠᩻;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->REPLACE_XZ:Ll/۟۠᩻;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->DISCARD:Ll/۟۠᩻;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->BROTLI_BSDIFF:Ll/۟۠᩻;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->PUFFDIFF:Ll/۟۠᩻;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->ZUCCHINI:Ll/۟۠᩻;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->LZ4DIFF_BSDIFF:Ll/۟۠᩻;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->LZ4DIFF_PUFFDIFF:Ll/۟۠᩻;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Ll/۟۠᩻;->REPLACE_ZSTD:Ll/۟۠᩻;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 5

    .line 2994
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->REPLACE:Ll/۟۠᩻;

    .line 3002
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "REPLACE_BZ"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->REPLACE_BZ:Ll/۟۠᩻;

    .line 3010
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "MOVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->MOVE:Ll/۟۠᩻;

    .line 3019
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "BSDIFF"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->BSDIFF:Ll/۟۠᩻;

    .line 3028
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "SOURCE_COPY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->SOURCE_COPY:Ll/۟۠᩻;

    .line 3036
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "SOURCE_BSDIFF"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->SOURCE_BSDIFF:Ll/۟۠᩻;

    .line 3045
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "REPLACE_XZ"

    const/4 v2, 0x6

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->REPLACE_XZ:Ll/۟۠᩻;

    .line 3053
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "ZERO"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    .line 3061
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "DISCARD"

    invoke-direct {v0, v1, v3, v4}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->DISCARD:Ll/۟۠᩻;

    .line 3069
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "BROTLI_BSDIFF"

    const/16 v2, 0x9

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->BROTLI_BSDIFF:Ll/۟۠᩻;

    .line 3077
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "PUFFDIFF"

    invoke-direct {v0, v1, v3, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->PUFFDIFF:Ll/۟۠᩻;

    .line 3085
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "ZUCCHINI"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->ZUCCHINI:Ll/۟۠᩻;

    .line 3093
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "LZ4DIFF_BSDIFF"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->LZ4DIFF_BSDIFF:Ll/۟۠᩻;

    .line 3097
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "LZ4DIFF_PUFFDIFF"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->LZ4DIFF_PUFFDIFF:Ll/۟۠᩻;

    .line 3101
    new-instance v0, Ll/۟۠᩻;

    const-string v1, "REPLACE_ZSTD"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2, v2}, Ll/۟۠᩻;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۟۠᩻;->REPLACE_ZSTD:Ll/۟۠᩻;

    .line 2985
    invoke-static {}, Ll/۟۠᩻;->$values()[Ll/۟۠᩻;

    move-result-object v0

    sput-object v0, Ll/۟۠᩻;->$VALUES:[Ll/۟۠᩻;

    .line 3105
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/۟۠᩻;

    .line 3111
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 3105
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 3272
    new-instance v0, Ll/ܰ۠᩻;

    invoke-direct {v0}, Ll/ܰ۠᩻;-><init>()V

    sput-object v0, Ll/۟۠᩻;->internalValueMap:Ll/۬ᩴۖ;

    .line 3292
    invoke-static {}, Ll/۟۠᩻;->values()[Ll/۟۠᩻;

    move-result-object v0

    sput-object v0, Ll/۟۠᩻;->VALUES:[Ll/۟۠᩻;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 3305
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3306
    iput p3, p0, Ll/۟۠᩻;->value:I

    return-void
.end method

.method public static forNumber(I)Ll/۟۠᩻;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 3262
    :pswitch_0
    sget-object p0, Ll/۟۠᩻;->REPLACE_ZSTD:Ll/۟۠᩻;

    return-object p0

    .line 3261
    :pswitch_1
    sget-object p0, Ll/۟۠᩻;->LZ4DIFF_PUFFDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3260
    :pswitch_2
    sget-object p0, Ll/۟۠᩻;->LZ4DIFF_BSDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3259
    :pswitch_3
    sget-object p0, Ll/۟۠᩻;->ZUCCHINI:Ll/۟۠᩻;

    return-object p0

    .line 3257
    :pswitch_4
    sget-object p0, Ll/۟۠᩻;->BROTLI_BSDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3258
    :pswitch_5
    sget-object p0, Ll/۟۠᩻;->PUFFDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3254
    :pswitch_6
    sget-object p0, Ll/۟۠᩻;->REPLACE_XZ:Ll/۟۠᩻;

    return-object p0

    .line 3256
    :pswitch_7
    sget-object p0, Ll/۟۠᩻;->DISCARD:Ll/۟۠᩻;

    return-object p0

    .line 3255
    :pswitch_8
    sget-object p0, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    return-object p0

    .line 3253
    :pswitch_9
    sget-object p0, Ll/۟۠᩻;->SOURCE_BSDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3252
    :pswitch_a
    sget-object p0, Ll/۟۠᩻;->SOURCE_COPY:Ll/۟۠᩻;

    return-object p0

    .line 3251
    :pswitch_b
    sget-object p0, Ll/۟۠᩻;->BSDIFF:Ll/۟۠᩻;

    return-object p0

    .line 3250
    :pswitch_c
    sget-object p0, Ll/۟۠᩻;->MOVE:Ll/۟۠᩻;

    return-object p0

    .line 3249
    :pswitch_d
    sget-object p0, Ll/۟۠᩻;->REPLACE_BZ:Ll/۟۠᩻;

    return-object p0

    .line 3248
    :pswitch_e
    sget-object p0, Ll/۟۠᩻;->REPLACE:Ll/۟۠᩻;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final getDescriptor()Ll/ۢۖۖ;
    .locals 2

    .line 3289
    invoke-static {}, Ll/֫ܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ᩴ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۖ;

    return-object v0
.end method

.method public static internalGetValueMap()Ll/۬ᩴۖ;
    .locals 1

    .line 3269
    sget-object v0, Ll/۟۠᩻;->internalValueMap:Ll/۬ᩴۖ;

    return-object v0
.end method

.method public static valueOf(I)Ll/۟۠᩻;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3239
    invoke-static {p0}, Ll/۟۠᩻;->forNumber(I)Ll/۟۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۟۠᩻;
    .locals 1

    .line 2985
    const-class v0, Ll/۟۠᩻;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۟۠᩻;

    return-object p0
.end method

.method public static valueOf(Ll/ۖۖۖ;)Ll/۟۠᩻;
    .locals 2

    .line 3296
    invoke-virtual {p0}, Ll/ۖۖۖ;->getType()Ll/ۢۖۖ;

    move-result-object v0

    invoke-static {}, Ll/۟۠᩻;->getDescriptor()Ll/ۢۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 3300
    sget-object v0, Ll/۟۠᩻;->VALUES:[Ll/۟۠᩻;

    invoke-virtual {p0}, Ll/ۖۖۖ;->ܺ()I

    move-result p0

    aget-object p0, v0, p0

    return-object p0

    .line 3297
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "EnumValueDescriptor is not for this type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static values()[Ll/۟۠᩻;
    .locals 1

    .line 2985
    sget-object v0, Ll/۟۠᩻;->$VALUES:[Ll/۟۠᩻;

    invoke-virtual {v0}, [Ll/۟۠᩻;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟۠᩻;

    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Ll/ۢۖۖ;
    .locals 1

    .line 3285
    invoke-static {}, Ll/۟۠᩻;->getDescriptor()Ll/ۢۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 3229
    iget v0, p0, Ll/۟۠᩻;->value:I

    return v0
.end method

.method public final getValueDescriptor()Ll/ۖۖۖ;
    .locals 2

    .line 3281
    invoke-static {}, Ll/۟۠᩻;->getDescriptor()Ll/ۢۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖۖ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۖۖ;

    return-object v0
.end method
