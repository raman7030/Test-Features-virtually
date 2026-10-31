.class public final Ll/᩺ۨᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 106
    sget-object v0, Ll/ۛۨᩴ;->CONCURRENT:Ll/ۛۨᩴ;

    sget-object v1, Ll/ۛۨᩴ;->UNORDERED:Ll/ۛۨᩴ;

    sget-object v2, Ll/ۛۨᩴ;->IDENTITY_FINISH:Ll/ۛۨᩴ;

    .line 107
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 111
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 114
    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 116
    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩺ۨᩴ;->b:Ljava/util/Set;

    .line 118
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    sput-object v0, Ll/᩺ۨᩴ;->c:Ljava/util/Set;

    .line 120
    invoke-static {v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩺ۨᩴ;->d:Ljava/util/Set;

    return-void
.end method

.method public static a([DD)V
    .locals 6

    const/4 v0, 0x1

    .line 746
    aget-wide v1, p0, v0

    sub-double/2addr p1, v1

    const/4 v1, 0x0

    .line 747
    aget-wide v2, p0, v1

    add-double v4, v2, p1

    sub-double v2, v4, v2

    sub-double/2addr v2, p1

    .line 749
    aput-wide v2, p0, v0

    .line 750
    aput-wide v4, p0, v1

    return-void
.end method

.method public static joining()Ll/ۨۨᩴ;
    .locals 7

    .line 368
    new-instance v6, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v0, 0x6

    .line 0
    invoke-direct {v1, v0}, Ll/ۘ֫᩵;-><init>(I)V

    .line 368
    new-instance v2, Ll/ۙ۟ᩴ;

    .line 0
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 368
    new-instance v3, Ll/ۧۧ᩵;

    const/4 v0, 0x0

    .line 0
    invoke-direct {v3, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 368
    new-instance v4, Ll/ۧۧ᩵;

    const/4 v0, 0x1

    .line 0
    invoke-direct {v4, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 368
    sget-object v5, Ll/᩺ۨᩴ;->c:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method public static joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;
    .locals 1

    const-string v0, ""

    .line 383
    invoke-static {p0, v0, v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۨۨᩴ;
    .locals 7

    .line 402
    new-instance v6, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۙ֫᩵;

    invoke-direct {v1, p0, p1, p2}, Ll/ۙ֫᩵;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 p0, 0x19

    .line 0
    invoke-direct {v2, p0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 402
    new-instance v3, Ll/ۡ֨ᩴ;

    const/16 p0, 0x1a

    .line 0
    invoke-direct {v3, p0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 402
    new-instance v4, Ll/ۡ֨ᩴ;

    const/16 p0, 0x1b

    .line 0
    invoke-direct {v4, p0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 402
    sget-object v5, Ll/᩺ۨᩴ;->c:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method public static toCollection(Ljava/util/function/Supplier;)Ll/ۨۨᩴ;
    .locals 4

    .line 261
    new-instance v0, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۡ֨ᩴ;

    const/16 v2, 0xf

    .line 0
    invoke-direct {v1, v2}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 261
    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 v3, 0x10

    .line 0
    invoke-direct {v2, v3}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 261
    sget-object v3, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    invoke-direct {v0, p0, v1, v2, v3}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toList()Ll/ۨۨᩴ;
    .locals 5

    .line 278
    new-instance v0, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v2, 0x1

    .line 0
    invoke-direct {v1, v2}, Ll/ۘ֫᩵;-><init>(I)V

    .line 278
    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 v3, 0x11

    .line 0
    invoke-direct {v2, v3}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 278
    new-instance v3, Ll/ۡ֨ᩴ;

    const/16 v4, 0x17

    .line 0
    invoke-direct {v3, v4}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 278
    sget-object v4, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toMap(Ljava/util/function/Function;Ljava/util/function/Function;)Ll/ۨۨᩴ;
    .locals 4

    .line 1459
    new-instance v0, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v2, 0x5

    .line 0
    invoke-direct {v1, v2}, Ll/ۘ֫᩵;-><init>(I)V

    .line 176
    new-instance v2, Ll/᩸ۛᩴ;

    const/4 v3, 0x2

    invoke-direct {v2, p0, p1, v3}, Ll/᩸ۛᩴ;-><init>(Ljava/util/function/Function;Ljava/util/function/Function;I)V

    .line 150
    new-instance p0, Ll/ۡ֨ᩴ;

    const/16 p1, 0xe

    .line 0
    invoke-direct {p0, p1}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 1461
    sget-object p1, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    invoke-direct {v0, v1, v2, p0, p1}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toSet()Ll/ۨۨᩴ;
    .locals 5

    .line 319
    new-instance v0, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v2, 0x3

    .line 0
    invoke-direct {v1, v2}, Ll/ۘ֫᩵;-><init>(I)V

    .line 319
    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 v3, 0x14

    .line 0
    invoke-direct {v2, v3}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 319
    new-instance v3, Ll/ۡ֨ᩴ;

    const/16 v4, 0x1c

    .line 0
    invoke-direct {v3, v4}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 319
    sget-object v4, Ll/᩺ۨᩴ;->b:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toUnmodifiableList()Ll/ۨۨᩴ;
    .locals 7

    .line 297
    new-instance v6, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v0, 0x1

    .line 0
    invoke-direct {v1, v0}, Ll/ۘ֫᩵;-><init>(I)V

    .line 297
    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 v0, 0x11

    .line 0
    invoke-direct {v2, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 297
    new-instance v3, Ll/ۡ֨ᩴ;

    const/16 v0, 0x12

    .line 0
    invoke-direct {v3, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 297
    new-instance v4, Ll/ۡ֨ᩴ;

    const/16 v0, 0x13

    .line 0
    invoke-direct {v4, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 297
    sget-object v5, Ll/᩺ۨᩴ;->c:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method public static toUnmodifiableSet()Ll/ۨۨᩴ;
    .locals 7

    .line 348
    new-instance v6, Ll/ۖۧ᩵;

    new-instance v1, Ll/ۘ֫᩵;

    const/4 v0, 0x3

    .line 0
    invoke-direct {v1, v0}, Ll/ۘ֫᩵;-><init>(I)V

    .line 348
    new-instance v2, Ll/ۡ֨ᩴ;

    const/16 v0, 0x14

    .line 0
    invoke-direct {v2, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 348
    new-instance v3, Ll/ۡ֨ᩴ;

    const/16 v0, 0x15

    .line 0
    invoke-direct {v3, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 348
    new-instance v4, Ll/ۡ֨ᩴ;

    const/16 v0, 0x16

    .line 0
    invoke-direct {v4, v0}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 348
    sget-object v5, Ll/᩺ۨᩴ;->d:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method
