.class public final Ll/᩹ۖۖ;
.super Ljava/lang/Object;
.source "99PI"


# static fields
.field public static final synthetic ֫:I

.field public static final ۜ:Ll/ۧۤᩴ;

.field public static final ۢ:Ljava/util/logging/Logger;

.field public static final ۧ:[Ll/ᩳۖۖ;

.field public static final ܳ:[Ll/ܶۖۖ;

.field public static final ܽ:[Ll/ۢۖۖ;

.field public static final ܿ:[I

.field public static final ᩳ:[Ll/֡ۖۖ;

.field public static volatile ᩷:Ll/ۧۡۖ;

.field public static final ᩻:[Ll/᩸ۖۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 66
    const-class v0, Ll/᩹ۖۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/᩹ۖۖ;->ۢ:Ljava/util/logging/Logger;

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 67
    sput-object v1, Ll/᩹ۖۖ;->ܿ:[I

    new-array v1, v0, [Ll/ᩳۖۖ;

    .line 68
    sput-object v1, Ll/᩹ۖۖ;->ۧ:[Ll/ᩳۖۖ;

    new-array v1, v0, [Ll/֡ۖۖ;

    .line 69
    sput-object v1, Ll/᩹ۖۖ;->ᩳ:[Ll/֡ۖۖ;

    new-array v1, v0, [Ll/ۢۖۖ;

    .line 70
    sput-object v1, Ll/᩹ۖۖ;->ܽ:[Ll/ۢۖۖ;

    new-array v1, v0, [Ll/᩸ۖۖ;

    .line 71
    sput-object v1, Ll/᩹ۖۖ;->᩻:[Ll/᩸ۖۖ;

    new-array v0, v0, [Ll/ܶۖۖ;

    .line 72
    sput-object v0, Ll/᩹ۖۖ;->ܳ:[Ll/ܶۖۖ;

    .line 73
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/᩹ۖۖ;->ۜ:Ll/ۧۤᩴ;

    const/4 v0, 0x0

    .line 77
    sput-object v0, Ll/᩹ۖۖ;->᩷:Ll/ۧۡۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x2e

    if-eqz p1, :cond_0

    .line 2758
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 2761
    :cond_0
    invoke-virtual {p0}, Ll/ۚۖۖ;->۠()Ljava/lang/String;

    move-result-object p0

    .line 2762
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 2763
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p2
.end method

.method public static synthetic ֫()Ljava/util/logging/Logger;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ۢ:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static ֫(Ll/ۗ᩷ۖ;)Ll/ۛۢۖ;
    .locals 5

    .line 90
    sget v0, Ll/ۧۡۖ;->۬:I

    .line 40911
    sget v0, Ll/ۧۖۖ;->֫:I

    .line 91
    sget-object v0, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    .line 92
    sget-object v0, Ll/᩹ۖۖ;->᩷:Ll/ۧۡۖ;

    if-nez v0, :cond_1

    .line 93
    const-class v0, Ll/᩹ۖۖ;

    monitor-enter v0

    .line 94
    :try_start_0
    sget-object v1, Ll/᩹ۖۖ;->᩷:Ll/ۧۡۖ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 96
    :try_start_1
    invoke-static {}, Ll/֫ۘۖ;->ۧ()Ll/֫ۘۖ;

    move-result-object v1

    .line 97
    sget-object v2, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    invoke-virtual {v1, v2}, Ll/֫ۘۖ;->֫(Ll/ܺᩴۖ;)V

    const-string v2, "\n\u001d\u0018\u00e6\u0007\"\u0003\u00ca>\u0000*\u0013\u0008\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u0002\u00ca>\u0004\u0008\u0001\u0010\u0001\n\u001d\u0018\u00e7\u0007\"\u0003\u00ca>\u0000*\u0013\u0008\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001\u00ca>\u0004\u0008\u0000\u0010\u0001\n\u001d\u0018\u00e8\u0007\"\u0013\u0008\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001\u00ca>\u0004\u0008\u0000\u0010\u0001*\u0003\u00ca>\u0000 \u00e6\u0007(\u00e8\u0007"

    .line 98
    sget-object v3, Ll/ܰᩴۖ;->ۧ:Ljava/nio/charset/Charset;

    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 99
    invoke-static {v2, v1}, Ll/ۧۡۖ;->֫([BLl/֫ۘۖ;)Ll/ۧۡۖ;

    move-result-object v1

    .line 81
    sput-object v1, Ll/᩹ۖۖ;->᩷:Ll/ۧۡۖ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 104
    :try_start_2
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 107
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 109
    :cond_1
    :goto_1
    sget-object v0, Ll/᩹ۖۖ;->᩷:Ll/ۧۡۖ;

    .line 114
    invoke-virtual {p0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v1

    invoke-virtual {v0}, Ll/ۧۡۖ;->ۢ()Ll/ۗ᩷ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v2

    if-lt v1, v2, :cond_6

    .line 122
    invoke-virtual {p0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v1

    invoke-virtual {v0}, Ll/ۧۡۖ;->᩷()Ll/ۗ᩷ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v2

    if-gt v1, v2, :cond_5

    .line 131
    invoke-virtual {v0}, Ll/ۧۡۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۡۖ;

    .line 132
    invoke-virtual {v2}, Ll/֫ۡۖ;->ۜ()Ll/ۗ᩷ۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v3

    invoke-virtual {p0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v4

    if-le v3, v4, :cond_2

    goto :goto_3

    :cond_2
    move-object v1, v2

    goto :goto_2

    :cond_3
    :goto_3
    if-eqz v1, :cond_4

    .line 141
    invoke-virtual {v1}, Ll/֫ۡۖ;->᩷()Ll/ۛۢۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛۢۖ;->toBuilder()Ll/֡ۢۖ;

    move-result-object p0

    invoke-virtual {v1}, Ll/֫ۡۖ;->ۢ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    invoke-virtual {p0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object p0

    return-object p0

    .line 138
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Edition "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a valid default FeatureSet!"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Edition "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is greater than the maximum supported edition "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-virtual {v0}, Ll/ۧۡۖ;->᩷()Ll/ۗ᩷ۖ;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "!"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 115
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Edition "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is lower than the minimum supported edition "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {v0}, Ll/ۧۡۖ;->ۢ()Ll/ۗ᩷ۖ;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "!"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Ll/ۛۢۖ;)Ll/ۛۢۖ;
    .locals 2

    .line 145
    invoke-virtual {p0}, Ll/ۛۢۖ;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll/᩹ۖۖ;->ۜ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0, p0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static synthetic ۧ()[Ll/ܶۖۖ;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ܳ:[Ll/ܶۖۖ;

    return-object v0
.end method

.method public static synthetic ܳ()[Ll/᩸ۖۖ;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->᩻:[Ll/᩸ۖۖ;

    return-object v0
.end method

.method public static synthetic ܽ()[Ll/ᩳۖۖ;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ۧ:[Ll/ᩳۖۖ;

    return-object v0
.end method

.method public static synthetic ܿ()[Ll/ۢۖۖ;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ܽ:[Ll/ۢۖۖ;

    return-object v0
.end method

.method public static synthetic ᩳ()[I
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ܿ:[I

    return-object v0
.end method

.method public static synthetic ᩻()[Ll/֡ۖۖ;
    .locals 1

    .line 65
    sget-object v0, Ll/᩹ۖۖ;->ᩳ:[Ll/֡ۖۖ;

    return-object v0
.end method
