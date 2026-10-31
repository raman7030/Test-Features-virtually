.class public final Ll/ܺۗܺ;
.super Ll/ۘۗܺ;
.source "75HT"


# static fields
.field public static final serialVersionUID:J

.field public static final ᩹:Ll/ܺۗܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 123
    new-instance v0, Ll/ܺۗܺ;

    const-string v1, ""

    .line 132
    invoke-direct {v0, v1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 123
    sput-object v0, Ll/ܺۗܺ;->᩹:Ll/ܺۗܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 212
    sget-object v0, Ll/ܺۗܺ;->᩹:Ll/ܺۗܺ;

    return-object v0
.end method

.method public static synthetic ᩻()Ll/ܺۗܺ;
    .locals 1

    .line 122
    sget-object v0, Ll/ܺۗܺ;->᩹:Ll/ܺۗܺ;

    return-object v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 122
    check-cast p1, Ll/ۘۗܺ;

    if-ne p1, p0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 203
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "-\u221e"

    return-object v0
.end method

.method public final ֫(Ll/ۘۗܺ;)I
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()Ljava/lang/Comparable;
    .locals 2

    .line 137
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "range unbounded on this side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/᩵ۗܺ;)Ll/ۘۗܺ;
    .locals 1

    .line 190
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 p1, -0x80000000

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p0
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "(-\u221e"

    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/Comparable;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ll/ۘۙܺ;
    .locals 1

    .line 147
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ljava/lang/StringBuilder;)V
    .locals 0

    .line 174
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final ܿ()Ll/ۘۙܺ;
    .locals 2

    .line 152
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "this statement should be unreachable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
