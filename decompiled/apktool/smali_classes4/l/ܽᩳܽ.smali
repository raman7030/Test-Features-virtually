.class public final Ll/ܽᩳܽ;
.super Ljava/lang/Object;
.source "K63E"


# static fields
.field public static ۜ:Ll/ܽᩳܽ;

.field public static ۡ:Ll/ܽᩳܽ;

.field public static ۢ:Ll/ܽᩳܽ;

.field public static ܳ:Ll/ܽᩳܽ;

.field public static ᩷:Ll/ܽᩳܽ;

.field public static ᩻:Ll/ܽᩳܽ;


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public volatile ܽ:Ll/ᩴۢᩴ;

.field public final ܿ:[Ll/ܳᩳܽ;

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    const v1, 0x7fffffff

    const-string v2, "style"

    .line 25
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v2

    sput-object v2, Ll/ܽᩳܽ;->ۡ:Ll/ܽᩳܽ;

    const-string v2, "layout"

    .line 26
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    sput-object v0, Ll/ܽᩳܽ;->᩻:Ll/ܽᩳܽ;

    const/4 v0, 0x2

    const-string v2, "package"

    .line 27
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    sput-object v0, Ll/ܽᩳܽ;->ۜ:Ll/ܽᩳܽ;

    const/16 v0, 0x8

    const-string v2, "coreApp"

    .line 28
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    sput-object v0, Ll/ܽᩳܽ;->ܳ:Ll/ܽᩳܽ;

    const/4 v0, 0x4

    const-string v2, "platformBuildVersionCode"

    .line 29
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    sput-object v0, Ll/ܽᩳܽ;->᩷:Ll/ܽᩳܽ;

    const/4 v0, 0x6

    const-string v2, "platformBuildVersionName"

    .line 30
    invoke-static {v0, v1, v2}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    sput-object v0, Ll/ܽᩳܽ;->ۢ:Ll/ܽᩳܽ;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;[Ll/ܳᩳܽ;I)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p1, p0, Ll/ܽᩳܽ;->ᩳ:I

    .line 41
    iput-object p2, p0, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    .line 43
    iput p4, p0, Ll/ܽᩳܽ;->֫:I

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/ܽᩳܽ;
    .locals 2

    .line 284
    new-instance v0, Ll/ܽᩳܽ;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܳᩳܽ;

    invoke-direct {v0, p0, p2, v1, p1}, Ll/ܽᩳܽ;-><init>(ILjava/lang/String;[Ll/ܳᩳܽ;I)V

    return-object v0
.end method

.method private ܽ()Ll/ᩴۢᩴ;
    .locals 5

    .line 73
    new-instance v0, Ll/ᩴۢᩴ;

    invoke-direct {v0}, Ll/ᩴۢᩴ;-><init>()V

    const/4 v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Ll/ᩴۢᩴ;->add(I)Z

    const/4 v1, 0x2

    .line 76
    invoke-virtual {v0, v1}, Ll/ᩴۢᩴ;->add(I)Z

    .line 78
    iget v1, p0, Ll/ܽᩳܽ;->ᩳ:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 79
    invoke-virtual {v0, v3}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    .line 82
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    .line 83
    invoke-virtual {v0, v3}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_1
    and-int/lit8 v2, v1, 0x4

    const/16 v3, 0x10

    const/16 v4, 0x11

    if-eqz v2, :cond_2

    .line 86
    invoke-virtual {v0, v3}, Ll/ᩴۢᩴ;->add(I)Z

    .line 87
    invoke-virtual {v0, v4}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_2
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_3

    const/16 v2, 0x12

    .line 90
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_3
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_4

    const/16 v2, 0x1c

    .line 93
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    const/16 v2, 0x1d

    .line 94
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    const/16 v2, 0x1e

    .line 95
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    const/16 v2, 0x1f

    .line 96
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_4
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_5

    const/4 v2, 0x4

    .line 99
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_5
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_6

    const/4 v2, 0x5

    .line 102
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_6
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    const/4 v2, 0x6

    .line 105
    invoke-virtual {v0, v2}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_7
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    .line 108
    invoke-virtual {v0, v3}, Ll/ᩴۢᩴ;->add(I)Z

    .line 109
    invoke-virtual {v0, v4}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_8
    const/high16 v2, 0x20000

    and-int/2addr v1, v2

    if-eqz v1, :cond_9

    .line 112
    invoke-virtual {v0, v3}, Ll/ᩴۢᩴ;->add(I)Z

    .line 113
    invoke-virtual {v0, v4}, Ll/ᩴۢᩴ;->add(I)Z

    :cond_9
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 320
    const-class v2, Ll/ܽᩳܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 322
    :cond_1
    check-cast p1, Ll/ܽᩳܽ;

    .line 324
    iget v2, p0, Ll/ܽᩳܽ;->֫:I

    iget p1, p1, Ll/ܽᩳܽ;->֫:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 329
    iget v0, p0, Ll/ܽᩳܽ;->֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܽᩳܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "], id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܽᩳܽ;->֫:I

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 4

    .line 216
    iget-object v0, p0, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    array-length v1, v0

    :cond_0
    if-lez v1, :cond_1

    add-int/lit8 v1, v1, -0x1

    .line 217
    aget-object v2, v0, v1

    .line 218
    iget v3, v2, Ll/ܳᩳܽ;->ۧ:I

    if-ne v3, p1, :cond_0

    .line 219
    iget-object p1, v2, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/ۨۡᩴ;
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ܽᩳܽ;->ܽ:Ll/ᩴۢᩴ;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 48
    monitor-enter v0

    .line 49
    :try_start_0
    iget-object v1, p0, Ll/ܽᩳܽ;->ܽ:Ll/ᩴۢᩴ;

    if-nez v1, :cond_0

    .line 50
    invoke-direct {p0}, Ll/ܽᩳܽ;->ܽ()Ll/ᩴۢᩴ;

    move-result-object v1

    iput-object v1, p0, Ll/ܽᩳܽ;->ܽ:Ll/ᩴۢᩴ;

    .line 52
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܽᩳܽ;->ܽ:Ll/ᩴۢᩴ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 3

    const v0, 0xffff

    .line 288
    iget v1, p0, Ll/ܽᩳܽ;->ᩳ:I

    if-ne v1, v0, :cond_0

    const-string v0, "any"

    return-object v0

    .line 290
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_1

    const-string v2, "|reference"

    .line 292
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_2

    const-string v2, "|string"

    .line 294
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_3

    const-string v2, "|integer"

    .line 296
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_4

    const-string v2, "|boolean"

    .line 298
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_5

    const-string v2, "|color"

    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_6

    const-string v2, "|float"

    .line 302
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_7

    const-string v2, "|dimension"

    .line 304
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_8

    const-string v2, "|fraction"

    .line 306
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-eqz v2, :cond_9

    const-string v2, "|enum"

    .line 308
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    const/high16 v2, 0x20000

    and-int/2addr v1, v2

    if-eqz v1, :cond_a

    const-string v1, "|flags"

    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_b

    const-string v0, "null"

    return-object v0

    :cond_b
    const/4 v1, 0x0

    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 314
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 10

    .line 226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 227
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    iget-object v2, p0, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 229
    iget v7, v6, Ll/ܳᩳܽ;->ۧ:I

    and-int v8, p1, v7

    if-ne v8, v7, :cond_0

    not-int v7, v7

    and-int/2addr p1, v7

    .line 231
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    if-eqz p1, :cond_2

    return-object v2

    .line 237
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_b

    .line 238
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array v2, p1, [Z

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v5, p1, -0x1

    const/4 v6, 0x1

    if-ge v3, v5, :cond_8

    .line 240
    aget-boolean v5, v2, v3

    if-eqz v5, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v3, 0x1

    :goto_2
    if-ge v5, p1, :cond_7

    .line 243
    aget-boolean v7, v2, v5

    if-eqz v7, :cond_4

    goto :goto_3

    .line 245
    :cond_4
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳᩳܽ;

    iget v7, v7, Ll/ܳᩳܽ;->ۧ:I

    .line 246
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳᩳܽ;

    iget v8, v8, Ll/ܳᩳܽ;->ۧ:I

    and-int v9, v7, v8

    if-ne v9, v8, :cond_5

    .line 248
    aput-boolean v6, v2, v5

    goto :goto_3

    :cond_5
    if-ne v9, v7, :cond_6

    .line 250
    aput-boolean v6, v2, v3

    goto :goto_4

    :cond_6
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    :goto_5
    if-ge v4, p1, :cond_a

    .line 256
    aget-boolean v3, v2, v4

    if-nez v3, :cond_9

    .line 257
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳᩳܽ;

    iget-object v3, v3, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x7c

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 259
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    sub-int/2addr p1, v6

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_b
    return-object v2
.end method
