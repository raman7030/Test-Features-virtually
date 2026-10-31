.class public final Ll/۟ۗᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final g:Ll/ۧۤᩴ;

.field public static final h:Ll/᩸ۗᩴ;

.field public static final serialVersionUID:J = -0x1056d36d74f0f639L


# instance fields
.field public final a:Ll/᩸᩹ᩴ;

.field public final b:I

.field public final transient c:Ll/ܰۗᩴ;

.field public final transient d:Ll/ܰۗᩴ;

.field public final transient e:Ll/ܰۗᩴ;

.field public final transient f:Ll/ܰۗᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 196
    new-instance v0, Ll/ۧۤᩴ;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-direct {v0, v3, v1, v2}, Ll/ۧۤᩴ;-><init>(IFI)V

    sput-object v0, Ll/۟ۗᩴ;->g:Ll/ۧۤᩴ;

    .line 210
    new-instance v0, Ll/۟ۗᩴ;

    sget-object v1, Ll/᩸᩹ᩴ;->MONDAY:Ll/᩸᩹ᩴ;

    invoke-direct {v0, v1, v3}, Ll/۟ۗᩴ;-><init>(Ll/᩸᩹ᩴ;I)V

    .line 219
    sget-object v0, Ll/᩸᩹ᩴ;->SUNDAY:Ll/᩸᩹ᩴ;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/۟ۗᩴ;->a(Ll/᩸᩹ᩴ;I)Ll/۟ۗᩴ;

    .line 237
    sget-object v0, Ll/᩹ۗᩴ;->d:Ll/᩸ۗᩴ;

    sput-object v0, Ll/۟ۗᩴ;->h:Ll/᩸ۗᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩸᩹ᩴ;I)V
    .locals 9

    .line 349
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 691
    new-instance v6, Ll/ܰۗᩴ;

    sget-object v3, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    sget-object v7, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    sget-object v5, Ll/ܰۗᩴ;->f:Ll/᩺ۗᩴ;

    const-string v1, "DayOfWeek"

    move-object v0, v6

    move-object v2, p0

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, Ll/ܰۗᩴ;-><init>(Ljava/lang/String;Ll/۟ۗᩴ;Ll/ۘۗᩴ;Ll/ۘۗᩴ;Ll/᩺ۗᩴ;)V

    .line 255
    iput-object v6, p0, Ll/۟ۗᩴ;->c:Ll/ܰۗᩴ;

    .line 700
    new-instance v6, Ll/ܰۗᩴ;

    sget-object v4, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    sget-object v5, Ll/ܰۗᩴ;->g:Ll/᩺ۗᩴ;

    const-string v1, "WeekOfMonth"

    move-object v0, v6

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Ll/ܰۗᩴ;-><init>(Ljava/lang/String;Ll/۟ۗᩴ;Ll/ۘۗᩴ;Ll/ۘۗᩴ;Ll/᩺ۗᩴ;)V

    .line 259
    iput-object v6, p0, Ll/۟ۗᩴ;->d:Ll/ܰۗᩴ;

    .line 709
    new-instance v0, Ll/ܰۗᩴ;

    .line 718
    new-instance v6, Ll/ܰۗᩴ;

    sget-object v8, Ll/᩹ۗᩴ;->d:Ll/᩸ۗᩴ;

    sget-object v5, Ll/ܰۗᩴ;->i:Ll/᩺ۗᩴ;

    const-string v1, "WeekOfWeekBasedYear"

    move-object v0, v6

    move-object v4, v8

    invoke-direct/range {v0 .. v5}, Ll/ܰۗᩴ;-><init>(Ljava/lang/String;Ll/۟ۗᩴ;Ll/ۘۗᩴ;Ll/ۘۗᩴ;Ll/᩺ۗᩴ;)V

    .line 271
    iput-object v6, p0, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 727
    new-instance v6, Ll/ܰۗᩴ;

    sget-object v4, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object v5, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    const-string v1, "WeekBasedYear"

    move-object v0, v6

    move-object v3, v8

    .line 727
    invoke-direct/range {v0 .. v5}, Ll/ܰۗᩴ;-><init>(Ljava/lang/String;Ll/۟ۗᩴ;Ll/ۘۗᩴ;Ll/ۘۗᩴ;Ll/᩺ۗᩴ;)V

    .line 279
    iput-object v6, p0, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    const-string v0, "firstDayOfWeek"

    .line 350
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/4 v0, 0x7

    if-gt p2, v0, :cond_0

    .line 354
    iput-object p1, p0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    .line 355
    iput p2, p0, Ll/۟ۗᩴ;->b:I

    return-void

    .line 352
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Minimal number of days is invalid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ll/᩸᩹ᩴ;I)Ll/۟ۗᩴ;
    .locals 3

    .line 331
    invoke-virtual {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 332
    sget-object v1, Ll/۟ۗᩴ;->g:Ll/ۧۤᩴ;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۗᩴ;

    if-nez v2, :cond_0

    .line 334
    new-instance v2, Ll/۟ۗᩴ;

    invoke-direct {v2, p0, p1}, Ll/۟ۗᩴ;-><init>(Ll/᩸᩹ᩴ;I)V

    .line 335
    invoke-interface {v1, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۟ۗᩴ;

    return-object p0

    :cond_0
    return-object v2
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 371
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 372
    iget-object p1, p0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    if-eqz p1, :cond_1

    .line 376
    iget p1, p0, Ll/۟ۗᩴ;->b:I

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x7

    if-gt p1, v0, :cond_0

    return-void

    .line 377
    :cond_0
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Minimal number of days is invalid"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 373
    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "firstDayOfWeek is null"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 4

    .line 390
    :try_start_0
    iget-object v0, p0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    iget v1, p0, Ll/۟ۗᩴ;->b:I

    invoke-static {v0, v1}, Ll/۟ۗᩴ;->a(Ll/᩸᩹ᩴ;I)Ll/۟ۗᩴ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 392
    new-instance v1, Ljava/io/InvalidObjectException;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid serialized WeekFields: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 645
    :cond_0
    instance-of v1, p1, Ll/۟ۗᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 646
    invoke-virtual {p0}, Ll/۟ۗᩴ;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 658
    iget-object v0, p0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    mul-int/lit8 v0, v0, 0x7

    iget v1, p0, Ll/۟ۗᩴ;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 669
    iget-object v0, p0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    iget v1, p0, Ll/۟ۗᩴ;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WeekFields["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
